//package com.felania.monstersuperleaguedatabook.fragments
//
//import android.app.Fragment
//import android.os.Bundle
//import android.support.v7.widget.LinearLayoutManager
//import android.text.Html
//import android.text.Spanned
//import android.util.Log
//import android.view.*
//import android.widget.TextView
//import com.felania.monstersuperleaguedatabook.R
//import com.felania.monstersuperleaguedatabook.activities.MonDBActivity
//import com.felania.monstersuperleaguedatabook.adapters.ClanAdapter
//import com.felania.monstersuperleaguedatabook.utils.StageMonsterStatObj
//import com.felania.monstersuperleaguedatabook.utils.UtilFunctions
//import com.felania.monstersuperleaguedatabook.utils.Variables
//import com.felania.msldb.*
//import com.felania.msldb.MsgClanSeasonOuterClass.MsgClanSeason
//import com.felania.msldb.MsgClanStageOuterClass.MsgClanStage
//import com.felania.msldb.MsgClanSubStageOuterClass.MsgClanSubStage
//import com.felania.msldb.MsgStageBattleOuterClass.MsgStageBattle
//import com.felania.msldb.MsgStageMonsterOuterClass.MsgStageMonster
//import com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect
//import kotlinx.android.synthetic.main.fragment_astroguide_detail.*
//import kotlinx.android.synthetic.main.fragment_clan.*
//import java.util.*
//
///**
// * Created by Krsnik on 8/15/2017.
// */
//class ClanFragment : Fragment() {
//
//
//    lateinit var gameData : MsgGameDataOuterClass.MsgGameDataOrBuilder
//    lateinit var monDb : MonDBActivity
//
//    var listClanSeason = listOf<MsgClanSeason>()
//    var listClanStage = listOf<MsgClanStage>()
//    var listClanSubStage = listOf<MsgClanSubStage>()
//
//    var mapClanSeason = mutableMapOf<Int, MsgClanSeason>()
//    var mapClanStage = mutableMapOf<Int, MsgClanStage>()
//    var mapClanSubStage = mutableMapOf<Int, MsgClanSubStage>()
//    var mapClanSubStageByLev = mutableMapOf<String, MsgClanSubStage>()
//
//    var mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster> = hashMapOf()
//
//    var mapStageMonster: Map<Int, MsgStageMonster> = hashMapOf()
//
//    var mapUid: Map<String, MsgUidOuterClass.MsgUid> = hashMapOf()
//    var mapString: Map<Int, String> = hashMapOf()
//    var mapEffect : Map<Int, MsgStatusEffect> = hashMapOf()
//
//    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
//
//        val rootView = inflater!!.inflate(R.layout.fragment_clan, container, false)
//
//        return rootView
//    }
//
//
//    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        monDb = activity as MonDBActivity
//
//        gameData = monDb.gameData
//        mapMonster = monDb.mapMonster
//        mapStageMonster = monDb.mapStageMonster
//        mapUid = monDb.mapUid
//        mapString = monDb.mapString
//        mapEffect = monDb.mapEffect
//
//        InitClanData()
//
//
//        val currentSeason = GetClanStage(GetCurrentClanSeason().stageUid)
//
//        val currentSubStageList : MutableList<MsgClanSubStage> = mutableListOf()
//
//
//        currentSeason!!.substagesList.mapTo(currentSubStageList) { GetClanSubStage(it)!! }
//
//        lvClan.layoutManager = LinearLayoutManager(activity)
//
//        fastScrollerClan.setRecyclerView(lvClan)
//        fastScrollerClan.setViewsToUse(R.layout.recycler_view_fast_scroller_fast_scroller_with_bubble, R.id.fastscrollerBubble, R.id.fastscrollerHandle)
//
//
//
////        lvClan.adapter = ClanAdapter(activity, currentSubStageList, this  )
//
//
//
//    }
//
//    fun GetRequiredMonster (battleList: List<MsgStageBattle>): MutableList<Int> {
//
//        val reqMonList = mutableListOf<Int>()
//        battleList.mapTo(reqMonList) { it.requiredMonster }
//
//        return reqMonList
//
//    }
//
//
//    fun GetStageMonsterByUid(uid: List<Int>): MutableList<MsgStageMonster> {
//
//        val stageMonList = mutableListOf<MsgStageMonster>()
//        uid.mapTo(stageMonList) { mapStageMonster[it]!! }
//        return stageMonList
//    }
//
//
//    fun GetTitanStat (uid: Int): StageMonsterStatObj {
//
//        val battleList = mapClanSubStage[uid]!!.battlesList
//
//        val reqMonList = GetRequiredMonster(battleList)
//
//        val stageMonList = GetStageMonsterByUid(reqMonList)
//
//        return UtilFunctions.GetStageMonsterStat(stageMonList[0],  mapMonster)
//
//    }
//
//
//    fun GetTitanMonsterBySubStageUid (uid: Int ): MsgMonsterOuterClass.MsgMonster {
//
//
//        val battleList = mapClanSubStage[uid]!!.battlesList
//
//        val reqMonList = GetRequiredMonster(battleList)
//
//        val stageMonList = GetStageMonsterByUid(reqMonList)
//
//
//        return  mapMonster[stageMonList[0].monster]!!
//
//    }
//
//    fun GetTitanGrade (uid: Int): Int {
//        val battleList = mapClanSubStage[uid]!!.battlesList
//        val reqMonList = GetRequiredMonster(battleList)
//        val stageMonList = GetStageMonsterByUid(reqMonList)
//
//        return UtilFunctions.GetGradeResourceByStageMon(mapStageMonster, stageMonList[0].uid)
//    }
//
//    fun GetTitanElementFlame (uid: Int): Int {
//
//        val battleList = mapClanSubStage[uid]!!.battlesList
//        val reqMonList = GetRequiredMonster(battleList)
//        val stageMonList = GetStageMonsterByUid(reqMonList)
//
//        return UtilFunctions.GetElementResourceByMonUid(mapMonster, stageMonList[0].monster)
//
//    }
//
//    fun GetTitanExtraStat(uid: Int): MutableMap<String, Float> {
//        val battleList = mapClanSubStage[uid]!!.battlesList
//        val reqMonList = GetRequiredMonster(battleList)
//        val stageMonList = GetStageMonsterByUid(reqMonList)
//
//        val monster = mapMonster[stageMonList[0].monster]!!
//
//        return UtilFunctions.GetStageMonsterExtraStat(stageMonList[0], monster)
//
//
//
//    }
//
//    fun GetStringByString (stringKey: String) : String {
//
//        return UtilFunctions.GetStringByString(mapString, mapUid, stringKey)
//    }
//
//
//    fun GetStatText (): MutableMap<String, String> {
//
//        var retMap : MutableMap<String, String> = mutableMapOf()
//
//        retMap.put(Variables.HP, UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_HP ))
//        retMap.put(Variables.ATK, UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_ATTACK ))
//        retMap.put(Variables.DEF, UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_DEFENSE ))
//        retMap.put(Variables.HEAL, UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_HEAL ))
//        retMap.put(Variables.CRIT_DMG, UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_CRI_DMG ))
//        retMap.put(Variables.CRIT_RATE, UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_CRI_RATE ))
//        retMap.put(Variables.RESIST, UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_RESIST ))
//
//
//        return retMap
//
//    }
//
//    fun GetTitanSkillEffect (uid: Int): MutableMap<String, MsgStatusEffect> {
//        val battleList = mapClanSubStage[uid]!!.battlesList
//        val reqMonList = GetRequiredMonster(battleList)
//        val stageMonList = GetStageMonsterByUid(reqMonList)
//
////        val monster = mapMonster[stageMonList[0].monster]!!
//
//        val defaultSkillEffect = UtilFunctions.GetSkillEffect(mapEffect, mapMonster, stageMonList[0].monster)["default"] as MsgStatusEffect
//        val activeSkillEffect = UtilFunctions.GetSkillEffect(mapEffect, mapMonster, stageMonList[0].monster)["active"] as MsgStatusEffect
//
//        val retMap : MutableMap<String, MsgStatusEffect> = mutableMapOf()
//
//        retMap.put(Variables.SKILL_DEFAULT, defaultSkillEffect)
//        retMap.put(Variables.SKILL_ACTIVE, activeSkillEffect)
//
//        return retMap
//
//    }
//
//    fun GetStringByUid (uid: Int): String {
//        return mapString[uid]!!
//    }
//
//    fun GetTitanEffectDesc (defTv: TextView, actTv: TextView, defaultSkillEffect: MsgStatusEffect, activeSkillEffect: MsgStatusEffect) {
//
//        if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
//            defTv.text = Html.fromHtml(
//                    UtilFunctions.GetFormattedDescString(mapString, defaultSkillEffect, null, Variables.SKILL_DEFAULT )
//                    , Html.FROM_HTML_MODE_LEGACY)
//
//            actTv.text = Html.fromHtml(
//                    UtilFunctions.GetFormattedDescString(mapString, activeSkillEffect, null, Variables.SKILL_ACTIVE )
//                    , Html.FROM_HTML_MODE_LEGACY)
//        } else {
//            defTv.text = Html.fromHtml(
//                    UtilFunctions.GetFormattedDescString(mapString, defaultSkillEffect, null, Variables.SKILL_DEFAULT ))
//            actTv.text = Html.fromHtml(
//                    UtilFunctions.GetFormattedDescString(mapString, activeSkillEffect, null, Variables.SKILL_ACTIVE ))
//
//        }
//
//    }
//
//
//
//    fun InitClanData() {
//
//        listClanSeason = gameData.clanSeasonsList
//        listClanStage = gameData.clanStagesList
//        listClanSubStage = gameData.clanSubstagesList
//
//
//        for(clanSeason in listClanSeason) {
//            mapClanSeason.put(clanSeason.idx, clanSeason)
//        }
//
//        for (clanStage in listClanStage) {
//            mapClanStage.put(clanStage.uid, clanStage)
//        }
//
//        for (clanSubStage in listClanSubStage) {
//
//            mapClanSubStage.put(clanSubStage.uid, clanSubStage)
//            mapClanSubStageByLev.put (clanSubStage.stageUid.toString() + "_" + clanSubStage.bossLev.toString(), clanSubStage)
//
//        }
//
//
//
//    }
//
//
//
//    fun GetClanSeasonByIdx(idx: Int): MsgClanSeason? {
//        return mapClanSeason[idx]
//    }
//
//
//    fun GetClanStage (uid: Int): MsgClanStage? {
//        return mapClanStage[uid]
//    }
//
//    fun GetClanSubStage (uid: Int): MsgClanSubStage? {
//
//        return mapClanSubStage[uid]
//
//    }
//
//
//    fun GetClanSubstageBossByLev (stageUid: Int, lev: Int) {
//
//
//
//    }
//
//
//
//
//
//
//
//
//
//    fun GetCurrentClanSeason (): MsgClanSeason {
//
//        val currentUserTime = System.currentTimeMillis() / 1000L
//        val timeZone = Calendar.getInstance().timeZone
//        val userTimeZone = timeZone.rawOffset / Variables.TIMEZONE_DIVIDER
//
//        val serverTimeZone = Variables.SERVER_TIMEZONE / Variables.TIMEZONE_DIVIDER
//
//        val offsetTimeZone = userTimeZone - serverTimeZone
//
//        val mulTimeZone = offsetTimeZone * 3600L
//
//
//        val convertUserToServerTime = currentUserTime + mulTimeZone
//
//        var season : MsgClanSeason = MsgClanSeason.getDefaultInstance()
//
//        for( clanSeason in listClanSeason) {
//            if(convertUserToServerTime <= clanSeason.closeDate)
//            {
//                season = clanSeason
//                break
//            }
//        }
//
//        return season
//
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setHasOptionsMenu(true)
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        menu.clear()
//
//        inflater.inflate(R.menu.mon_skill_book_popup, menu)
//
//
//
//        super.onCreateOptionsMenu(menu, inflater)
//    }
//
//}