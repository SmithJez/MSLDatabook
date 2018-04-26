package com.felania.monstersuperleaguedatabook.activities

import android.content.Context
import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.text.Html
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.adapters.ClanAdapter
import com.felania.monstersuperleaguedatabook.protobuf.ProtobufHelper
import com.felania.monstersuperleaguedatabook.utils.StageMonsterStatObj
import com.felania.monstersuperleaguedatabook.utils.UtilFunctions
import com.felania.monstersuperleaguedatabook.utils.Variables
import com.felania.msldb.*
import com.felania.msldb.MsgGameDataOuterClass.*
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.fragment_astroguide_detail.*
import kotlinx.android.synthetic.main.fragment_clan.*
import java.util.*

class ClanActivity : AppCompatActivity () {

    private var listClanSeason = listOf<MsgClanSeasonOuterClass.MsgClanSeason>()
    private var listClanStage = listOf<MsgClanStageOuterClass.MsgClanStage>()
    private var listClanSubStage = listOf<MsgClanSubStageOuterClass.MsgClanSubStage>()

    private var mapClanSeason = mutableMapOf<Int, MsgClanSeasonOuterClass.MsgClanSeason>()
    private var mapClanStage = mutableMapOf<Int, MsgClanStageOuterClass.MsgClanStage>()
    private var mapClanSubStage = mutableMapOf<Int, MsgClanSubStageOuterClass.MsgClanSubStage>()
    private var mapClanSubStageByLev = mutableMapOf<String, MsgClanSubStageOuterClass.MsgClanSubStage>()

    private var mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster> = hashMapOf()

    private var mapStageMonster: Map<Int, MsgStageMonsterOuterClass.MsgStageMonster> = hashMapOf()

    private var mapUid: Map<String, MsgUidOuterClass.MsgUid> = hashMapOf()
    private var mapString: Map<Int, String> = hashMapOf()
    private var mapEffect : Map<Int, MsgStatusEffectOuterClass.MsgStatusEffect> = hashMapOf()

    private var context: Context = this

    private var protoHelper = ProtobufHelper()

    private var saveLang = String()

    private var stringFile = String()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_clan)

        saveLang = intent.getStringExtra(Variables.SETTING_LANGUAGE)

        val localeMap: HashMap<String, String> = Variables.localeToStringMap


        stringFile = if (localeMap[saveLang] == null) {
            Variables.STRING_EN
        } else {
            localeMap[saveLang]!!
        }

        ReadDB().execute()


        MobileAds.initialize(applicationContext, "ca-app-pub-1489459199627698~8687372969")

        val adRequest = AdRequest.Builder().build()
        adViewClan.loadAd(adRequest)


    }

    fun GetStringData(stringFile : String): MsgStringOuterClass.MsgString.Builder {
        val stringData = protoHelper.readStringData(stringFile, context)
        if (stringData.localStringsCount == 0) {
            stringData.mergeFrom(protoHelper.readStringDataFromAssets(stringFile, context))
        }
        return stringData
    }

    fun InitClanData(stringFile: String) {

        val string = GetStringData(stringFile)

        val listMonster =  protoHelper.ReadMonsters(MsgGameData.MONSTERS_FIELD_NUMBER, context)
        val listStageMonster = protoHelper.ReadStageMonster (MsgGameData.STAGE_MONSTERS_FIELD_NUMBER, context)
        val listUid = protoHelper.ReadUids(MsgGameData.UIDS_FIELD_NUMBER, context)
        val listString = string.localStringsList
        val listEffect = protoHelper.ReadEffect(MsgGameData.STATUS_EFFECTS_FIELD_NUMBER, context)

        mapMonster = listMonster.associateBy ({ it.uid } , {it} )
        mapStageMonster = listStageMonster.associateBy(  {it.uid}, {it} )
        mapUid = listUid.associateBy ({ it.strUid }, {it})
        mapString = listString.associateBy( {it.uid}, {it.text})
        mapEffect = listEffect.associateBy( {it.uid } , {it})

        listClanSeason = protoHelper.ReadClanSeason(MsgGameData.CLAN_SEASONS_FIELD_NUMBER, context)
        listClanStage = protoHelper.ReadClanStage(MsgGameData.CLAN_STAGES_FIELD_NUMBER, context )
        listClanSubStage = protoHelper.ReadClanSubStage(MsgGameData.CLAN_SUBSTAGES_FIELD_NUMBER, context )


        for(clanSeason in listClanSeason) {
            mapClanSeason.put(clanSeason.idx, clanSeason)
        }

        for (clanStage in listClanStage) {
            mapClanStage.put(clanStage.uid, clanStage)
        }

        for (clanSubStage in listClanSubStage) {

            mapClanSubStage.put(clanSubStage.uid, clanSubStage)
            mapClanSubStageByLev.put (clanSubStage.stageUid.toString() + "_" + clanSubStage.bossLev.toString(), clanSubStage)

        }



    }


    fun GetClanStage (uid: Int): MsgClanStageOuterClass.MsgClanStage? {
        return mapClanStage[uid]
    }

    fun GetClanSubStage (uid: Int): MsgClanSubStageOuterClass.MsgClanSubStage? {

        return mapClanSubStage[uid]

    }


    fun GetRequiredMonster (battleList: List<MsgStageBattleOuterClass.MsgStageBattle>): MutableList<Int> {

        val reqMonList = mutableListOf<Int>()
        battleList.mapTo(reqMonList) { it.requiredMonster }

        return reqMonList

    }


    fun GetStageMonsterByUid(uid: List<Int>): MutableList<MsgStageMonsterOuterClass.MsgStageMonster> {

        val stageMonList = mutableListOf<MsgStageMonsterOuterClass.MsgStageMonster>()
        uid.mapTo(stageMonList) { mapStageMonster[it]!! }
        return stageMonList
    }


    fun GetTitanStat (uid: Int): StageMonsterStatObj {

        val battleList = mapClanSubStage[uid]!!.battlesList

        val reqMonList = GetRequiredMonster(battleList)

        val stageMonList = GetStageMonsterByUid(reqMonList)

        return UtilFunctions.GetStageMonsterStat(stageMonList[0],  mapMonster)

    }


    fun GetTitanMonsterBySubStageUid (uid: Int ): MsgMonsterOuterClass.MsgMonster {


        val battleList = mapClanSubStage[uid]!!.battlesList

        val reqMonList = GetRequiredMonster(battleList)

        val stageMonList = GetStageMonsterByUid(reqMonList)


        return  mapMonster[stageMonList[0].monster]!!

    }

    fun GetTitanGrade (uid: Int): Int {
        val battleList = mapClanSubStage[uid]!!.battlesList
        val reqMonList = GetRequiredMonster(battleList)
        val stageMonList = GetStageMonsterByUid(reqMonList)

        return UtilFunctions.GetGradeResourceByStageMon(mapStageMonster, stageMonList[0].uid)
    }

    fun GetTitanElementFlame (uid: Int): Int {

        val battleList = mapClanSubStage[uid]!!.battlesList
        val reqMonList = GetRequiredMonster(battleList)
        val stageMonList = GetStageMonsterByUid(reqMonList)

        return UtilFunctions.GetElementResourceByMonUid(mapMonster, stageMonList[0].monster)

    }

    fun GetTitanExtraStat(uid: Int): MutableMap<String, Float> {
        val battleList = mapClanSubStage[uid]!!.battlesList
        val reqMonList = GetRequiredMonster(battleList)
        val stageMonList = GetStageMonsterByUid(reqMonList)

        val monster = mapMonster[stageMonList[0].monster]!!

        return UtilFunctions.GetStageMonsterExtraStat(stageMonList[0], monster)



    }

    fun GetStringByString (stringKey: String) : String {

        return UtilFunctions.GetStringByString(mapString, mapUid, stringKey)
    }


    fun GetStatText (): MutableMap<String, String> {

        val retMap : MutableMap<String, String> = mutableMapOf()

        retMap.put(Variables.HP, UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_HP ))
        retMap.put(Variables.ATK, UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_ATTACK ))
        retMap.put(Variables.DEF, UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_DEFENSE ))
        retMap.put(Variables.HEAL, UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_HEAL ))
        retMap.put(Variables.CRIT_DMG, UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_CRI_DMG ))
        retMap.put(Variables.CRIT_RATE, UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_CRI_RATE ))
        retMap.put(Variables.RESIST, UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_RESIST ))


        return retMap

    }

    fun GetTitanSkillEffect (uid: Int): MutableMap<String, MsgStatusEffectOuterClass.MsgStatusEffect> {
        val battleList = mapClanSubStage[uid]!!.battlesList
        val reqMonList = GetRequiredMonster(battleList)
        val stageMonList = GetStageMonsterByUid(reqMonList)

        val defaultSkillEffect = UtilFunctions.GetSkillEffect(mapEffect, mapMonster, stageMonList[0].monster)["default"] as MsgStatusEffectOuterClass.MsgStatusEffect
        val activeSkillEffect = UtilFunctions.GetSkillEffect(mapEffect, mapMonster, stageMonList[0].monster)["active"] as MsgStatusEffectOuterClass.MsgStatusEffect

        val retMap : MutableMap<String, MsgStatusEffectOuterClass.MsgStatusEffect> = mutableMapOf()

        retMap.put(Variables.SKILL_DEFAULT, defaultSkillEffect)
        retMap.put(Variables.SKILL_ACTIVE, activeSkillEffect)

        return retMap

    }

    fun GetStringByUid (uid: Int): String {
        return mapString[uid]!!
    }

    fun GetTitanEffectDesc (defTv: TextView, actTv: TextView, defaultSkillEffect: MsgStatusEffectOuterClass.MsgStatusEffect, activeSkillEffect: MsgStatusEffectOuterClass.MsgStatusEffect) {

        if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            defTv.text = Html.fromHtml(
                    UtilFunctions.GetFormattedDescString(mapString, defaultSkillEffect, null, Variables.SKILL_DEFAULT )
                    , Html.FROM_HTML_MODE_LEGACY)

            actTv.text = Html.fromHtml(
                    UtilFunctions.GetFormattedDescString(mapString, activeSkillEffect, null, Variables.SKILL_ACTIVE )
                    , Html.FROM_HTML_MODE_LEGACY)
        } else {
            defTv.text = Html.fromHtml(
                    UtilFunctions.GetFormattedDescString(mapString, defaultSkillEffect, null, Variables.SKILL_DEFAULT ))
            actTv.text = Html.fromHtml(
                    UtilFunctions.GetFormattedDescString(mapString, activeSkillEffect, null, Variables.SKILL_ACTIVE ))

        }

    }


    fun GetCurrentClanSeason (): MsgClanSeasonOuterClass.MsgClanSeason {

        val currentUserTime = System.currentTimeMillis() / 1000L
        val timeZone = Calendar.getInstance().timeZone
        val userTimeZone = timeZone.rawOffset / Variables.TIMEZONE_DIVIDER

        val serverTimeZone = Variables.SERVER_TIMEZONE / Variables.TIMEZONE_DIVIDER

        val offsetTimeZone = userTimeZone - serverTimeZone

        val mulTimeZone = offsetTimeZone * 3600L


        //val convertUserToServerTime = currentUserTime + mulTimeZone
        val convertUserToServerTime = 1525014000

        var season : MsgClanSeasonOuterClass.MsgClanSeason = MsgClanSeasonOuterClass.MsgClanSeason.getDefaultInstance()

        for( clanSeason in listClanSeason) {
            if(convertUserToServerTime <= clanSeason.closeDate)
            {
                season = clanSeason
                break
            }
        }

        return season

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mon_skill_book_popup, menu)

        return true
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        val id : Int = item!!.itemId
        return when (id) {
            R.id.btnSkillBookBack -> {
                finish()
                true
            }
            
            else -> {
                true
            }
        }
            
        
    }
    





    private inner class ReadDB : AsyncTask<Void, Int, Int>() {


        override fun doInBackground(vararg p0: Void): Int? {
            InitClanData(stringFile)

            return null
        }

        override fun onPreExecute() {

            pbClan.visibility = View.VISIBLE

            super.onPreExecute()
        }

        override fun onPostExecute(result: Int?) {
            super.onPostExecute(result)

            val currentSeason = GetClanStage(GetCurrentClanSeason().stageUid)

            val currentSubStageList : MutableList<MsgClanSubStageOuterClass.MsgClanSubStage> = mutableListOf()


            currentSeason!!.substagesList.mapTo(currentSubStageList) { GetClanSubStage(it)!! }

            lvClan.layoutManager = LinearLayoutManager(context)

            fastScrollerClan.setRecyclerView(lvClan)
            fastScrollerClan.setViewsToUse(R.layout.recycler_view_fast_scroller_fast_scroller_with_bubble, R.id.fastscrollerBubble, R.id.fastscrollerHandle)



            lvClan.adapter = ClanAdapter(context, currentSubStageList)

            pbClan.visibility = View.GONE
        }


    }




}