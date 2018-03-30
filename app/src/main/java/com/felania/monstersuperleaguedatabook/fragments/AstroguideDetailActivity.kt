package com.felania.monstersuperleaguedatabook.fragments


//import com.felania.msldatabook.utils.CentralDB
import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.text.Html
import android.util.Log
import android.view.*
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.activities.MonDBActivity
import com.felania.monstersuperleaguedatabook.adapters.SkillBookPopUpAdapter
import com.felania.monstersuperleaguedatabook.adapters.SkillBookPopUpLevelAdapter
import com.felania.monstersuperleaguedatabook.protobuf.ProtobufHelper
import com.felania.monstersuperleaguedatabook.utils.*
import com.felania.msldb.*
import com.felania.msldb.MonsterElementTypeOuterClass.*
import com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_astroguide_detail.*
import kotlinx.android.synthetic.main.mon_profile_detail.*
import kotlinx.android.synthetic.main.mon_stat.*
import java.text.NumberFormat
import java.util.*


class AstroguideDetailActivity : AppCompatActivity() {


//    lateinit var mapEffect:
//    lateinit var mapMonster
//    lateinit var mapSkill
//    lateinit var mapString
//    lateinit var mapSkillUpgrade

//    lateinit var centralDB : CentralDB
//    lateinit var context : Context

    private var mapString: Map<Int, String> = mapOf()
    private var mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster> = mapOf()
    private var mapUid: Map<String, MsgUidOuterClass.MsgUid> = hashMapOf()

    private var mapType: Map<String, MsgMonsterTypeOuterClass.MsgMonsterType> = hashMapOf()
    private var mapSetting: Map<Int, MsgSettingOuterClass.MsgSetting> = hashMapOf()
    private var mapSkill: Map<Int, MsgMonsterSkillOuterClass.MsgMonsterSkill> = hashMapOf()
    private var mapEffect : Map<Int, MsgStatusEffectOuterClass.MsgStatusEffect> = hashMapOf()
    private var mapSkillUpgrade: Map<Int, MsgMonsterUpgradeSkillOuterClass.MsgMonsterUpgradeSkill> = hashMapOf()
    private var maxStat: HashMap<String, Float> = hashMapOf()
    private var mapDictName : Map<String, MonsterEvolutionGroup> = mutableMapOf()

    var highestLevel : Int = 0

    private var context: Context = this

    private var protoHelper = ProtobufHelper()

    private var saveLang = String()

    private var stringFile = String()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_astroguide_detail)

        val uid_evo1 = intent.getIntExtra(Variables.UID_EVO1, 0)
        val uid_evo2 = intent.getIntExtra(Variables.UID_EVO2, 0)
        val uid_evo3 = intent.getIntExtra(Variables.UID_EVO3, 0)
        

        saveLang = intent.getStringExtra(Variables.SETTING_LANGUAGE)

        val localeMap: HashMap<String, String> = Variables.localeToStringMap


        stringFile = if (localeMap[saveLang] == null) {
            Variables.STRING_EN
        } else {
            localeMap[saveLang]!!
        }

        val string = GetStringData(stringFile)


        val listString = string.localStringsList
        val listUid = protoHelper.ReadUids(MsgGameDataOuterClass.MsgGameData.UIDS_FIELD_NUMBER, context)
        val listMonster =  protoHelper.ReadMonsters(MsgGameDataOuterClass.MsgGameData.MONSTERS_FIELD_NUMBER, context)
        val listType = protoHelper.ReadMonsterType(MsgGameDataOuterClass.MsgGameData.MONSTER_TYPES_FIELD_NUMBER, context)
        val listSetting = protoHelper.ReadSetting(MsgGameDataOuterClass.MsgGameData.SETTINGS_FIELD_NUMBER, context)
        val listSkill = protoHelper.ReadSkill(MsgGameDataOuterClass.MsgGameData.MONSTER_SKILLS_FIELD_NUMBER, context)
        val listEffect = protoHelper.ReadEffect(MsgGameDataOuterClass.MsgGameData.STATUS_EFFECTS_FIELD_NUMBER, context)
        val listSkillUpgrade = protoHelper.ReadSkillUpgrade(MsgGameDataOuterClass.MsgGameData.MONSTER_UPGRADE_SKILLS_FIELD_NUMBER, context)


        mapUid = listUid.associateBy ({ it.strUid }, {it})
        mapString = listString.associateBy( {it.uid}, {it.text})
        mapMonster = listMonster.associateBy ({ it.uid } , {it} )
        mapType = listType.associateBy ({ String.format("%s_%s_%s",
                it.evolution.name, it.weightType.name, it.type.name ) } , { it } )
        mapSetting = listSetting.associateBy ({ it.uid  } , {it})
        mapSkill = listSkill.associateBy( { it.uid} , {it} )
        mapEffect = listEffect.associateBy( {it.uid } , {it})
        mapSkillUpgrade = listSkillUpgrade.associateBy ({ it.uid }, {it})


        mapDictName = protoHelper.ReadMapDictName(context).associateBy( { it.resName }, { MonsterEvolutionGroup(it.resName,  it.evo1, it.evo2, it.evo3  )  } )



        maxStat = intent.getSerializableExtra("max_stat") as HashMap<String, Float>



        if(uid_evo3 > 1) {
            SetViewContent(uid_evo3)
            GetSkillDesc(uid_evo3)
            TabController(uid_evo1)
            SetProfileDB(uid_evo1, uid_evo2, uid_evo3)
        }


        MobileAds.initialize(applicationContext, "ca-app-pub-1489459199627698~8687372969")

        val adRequest = AdRequest.Builder().build()
        adViewDetail.loadAd(adRequest)

    }


    fun GetStringData(stringFile : String): MsgStringOuterClass.MsgString.Builder {
        val stringData = protoHelper.readStringData(stringFile, context)
        if (stringData.localStringsCount == 0) {
            stringData.mergeFrom(protoHelper.readStringDataFromAssets(stringFile, context))
        }
        return stringData
    }
    


    private fun GetHighestGrade (newVal: Int, oldVal: Int) : Int {

        return if(newVal > oldVal) {
            newVal
        } else {
            oldVal
        }


    }

    private fun GetSkillBookByGrade (lv: Int) : Int {
        when (lv) {
            1 -> {
                return R.drawable.skill_book_1
            }
            2 -> {
                return R.drawable.skill_book_2
            }
            3 -> {
                return R.drawable.skill_book_3
            }
            4 -> {
                return R.drawable.skill_book_4
            }
            5 -> {
                return R.drawable.skill_book_5
            }
            else -> {
                return R.drawable.skill_book_1
            }


        }



    }






    private fun TabController (evo3: Int) {

        val evo3Name : String = UtilFunctions.GetAstromonNameByID(mapString, mapMonster, evo3)!!
        val evo3Element = mapMonster[evo3]!!.element

        val dictFire : MutableMap<Int, MonsterEvolutionGroup> = mutableMapOf()
        val dictWater : MutableMap<Int, MonsterEvolutionGroup> = mutableMapOf()
        val dictTree : MutableMap<Int, MonsterEvolutionGroup> = mutableMapOf()
        val dictLight : MutableMap<Int, MonsterEvolutionGroup> = mutableMapOf()
        val dictDark : MutableMap<Int, MonsterEvolutionGroup> = mutableMapOf()


        for(gg in mapDictName) {
            val monName =  UtilFunctions.GetAstromonNameByID(mapString, mapMonster, gg.value.evo1.monsterUid)
            val monEle =  mapMonster[gg.value.evo1.monsterUid]!!.element
            if(evo3Name == monName ) {
                when( monEle ) {
                    MonsterElementType.ME_Fire -> {
                        dictFire.put(0, gg.value)
                        highestLevel = GetHighestGrade ( mapMonster[gg.value.evo3.monsterUid]!!.bornGradeValue, highestLevel)

                    }
                    MonsterElementType.ME_Water -> {
                        dictWater.put(0, gg.value)
                        highestLevel = GetHighestGrade ( mapMonster[gg.value.evo3.monsterUid]!!.bornGradeValue, highestLevel)
                    }
                    MonsterElementType.ME_Tree -> {
                        dictTree.put(0, gg.value)
                        highestLevel = GetHighestGrade ( mapMonster[gg.value.evo3.monsterUid]!!.bornGradeValue, highestLevel)
                    }
                    MonsterElementType.ME_Light -> {
                        dictLight.put(0, gg.value)
                        highestLevel = GetHighestGrade ( mapMonster[gg.value.evo3.monsterUid]!!.bornGradeValue, highestLevel)
                    }
                    else -> {
                        dictDark.put(0, gg.value)
                        highestLevel = GetHighestGrade ( mapMonster[gg.value.evo3.monsterUid]!!.bornGradeValue, highestLevel)
                    }
                }
            }
        }


        var num = -1
        val mapIndex : MutableMap<Int, MonsterEvolutionGroup> = mutableMapOf()
        val mapReverseIndex : MutableMap<MonsterEvolutionGroup, Int> = mutableMapOf()

        if(dictFire.isNotEmpty()) {
            detailTab.addTab(detailTab.newTab().setIcon(R.drawable.element_fire2).setTag(Variables.FIRE))
            num++
            mapIndex.put(num, dictFire[0]!!)
        }
        if(dictWater.isNotEmpty()) {
            detailTab.addTab(detailTab.newTab().setIcon(R.drawable.element_water2).setTag(Variables.WATER))
            num++
            mapIndex.put(num, dictWater[0]!!)
        }
        if(dictTree.isNotEmpty()) {
            detailTab.addTab(detailTab.newTab().setIcon(R.drawable.element_wood2).setTag(Variables.TREE))
            num++
            mapIndex.put(num, dictTree[0]!!)
        }
        if(dictLight.isNotEmpty()) {
            detailTab.addTab(detailTab.newTab().setIcon(R.drawable.element_light2).setTag(Variables.LIGHT))
            num++
            mapIndex.put(num, dictLight[0]!!)
        }
        if(dictDark.isNotEmpty()) {
            detailTab.addTab(detailTab.newTab().setIcon(R.drawable.element_dark2).setTag(Variables.DARK))
            num++
            mapIndex.put(num, dictDark[0]!!)
        }

        for ((key, value) in mapIndex) {
            mapReverseIndex.put(value, key)
        }

        when(evo3Element) {
            MonsterElementType.ME_Fire -> {
                val tab = detailTab.getTabAt(mapReverseIndex[dictFire[0]]!!)!!
                tab.select()
            }
            MonsterElementType.ME_Water -> {
                val tab = detailTab.getTabAt(mapReverseIndex[dictWater[0]]!!)!!
                tab.select()
            }
            MonsterElementType.ME_Tree -> {
                val tab = detailTab.getTabAt(mapReverseIndex[dictTree[0]]!!)!!
                tab.select()
            }
            MonsterElementType.ME_Light -> {
                val tab = detailTab.getTabAt(mapReverseIndex[dictLight[0]]!!)!!
                tab.select()
            }
            MonsterElementType.ME_Dark -> {
                val tab = detailTab.getTabAt(mapReverseIndex[dictDark[0]]!!)!!
                tab.select()
            }
            else -> {
                val tab = detailTab.getTabAt(0)!!
                tab.select()
            }


        }


        detailTab.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {

                if(detailTab.selectedTabPosition == 0) {
                    SetViewContent(mapIndex[0]!!.evo3.monsterUid)
                    GetSkillDesc(mapIndex[0]!!.evo3.monsterUid)
                    SetProfileDB(mapIndex[0]!!.evo1.monsterUid, mapIndex[0]!!.evo2.monsterUid, mapIndex[0]!!.evo3.monsterUid)
                    
//                    Log.wtf("Fire", "Fire " + mapIndex[0])
                }

                if(detailTab.selectedTabPosition == 1) {
                    SetViewContent(mapIndex[1]!!.evo3.monsterUid)
                    GetSkillDesc(mapIndex[1]!!.evo3.monsterUid)
                    SetProfileDB(mapIndex[1]!!.evo1.monsterUid, mapIndex[1]!!.evo2.monsterUid, mapIndex[1]!!.evo3.monsterUid)

//                    Log.wtf("Water", "Water" + mapIndex[1])
                }

                if(detailTab.selectedTabPosition == 2) {
                    SetViewContent(mapIndex[2]!!.evo3.monsterUid)
                    GetSkillDesc(mapIndex[2]!!.evo3.monsterUid)
                    SetProfileDB(mapIndex[2]!!.evo1.monsterUid, mapIndex[2]!!.evo2.monsterUid, mapIndex[2]!!.evo3.monsterUid)

//                    Log.wtf("Water", "Water" + mapIndex[2])
                }

                if(detailTab.selectedTabPosition == 3) {
                    SetViewContent(mapIndex[3]!!.evo3.monsterUid)
                    GetSkillDesc(mapIndex[3]!!.evo3.monsterUid)
                    SetProfileDB(mapIndex[3]!!.evo1.monsterUid, mapIndex[3]!!.evo2.monsterUid, mapIndex[3]!!.evo3.monsterUid)

//                    Log.wtf("Water", "Water" + mapIndex[3])
                }

                if(detailTab.selectedTabPosition == 4) {
                    SetViewContent(mapIndex[4]!!.evo3.monsterUid)
                    GetSkillDesc(mapIndex[4]!!.evo3.monsterUid)
                    SetProfileDB(mapIndex[4]!!.evo1.monsterUid, mapIndex[4]!!.evo2.monsterUid, mapIndex[4]!!.evo3.monsterUid)

//                    Log.wtf("Water", "Water" + mapIndex[4])
                }

            }

        })




        scrollDetail.setOnTouchListener(object: OnSwipeTouchListener(context) {
            override fun onSwipeRight() {
                super.onSwipeRight()
                if(detailTab.selectedTabPosition > 0) {
                    val curTab = detailTab.getTabAt(detailTab.selectedTabPosition - 1)!!
                    curTab.select()
                } else if (detailTab.selectedTabPosition == 0) {
                    val curTab = detailTab.getTabAt(num)!!
                    curTab.select()
                }
            }

            override fun onSwipeLeft() {
                super.onSwipeLeft()
                if(detailTab.selectedTabPosition < num) {
                    val curTab = detailTab.getTabAt(detailTab.selectedTabPosition + 1)!!
                    curTab.select()
                } else if (detailTab.selectedTabPosition == num) {
                    val curTab = detailTab.getTabAt(0)!!
                    curTab.select()
                }

            }

        })



    }


    fun SetProfileDB(evo1: Int, evo2: Int, evo3: Int) {

        val evo1Icon = UtilFunctions.GetAstromonResourceByID(mapMonster, context, evo1)
        val evo2Icon = UtilFunctions.GetAstromonResourceByID(mapMonster, context, evo2)
        val evo3Icon = UtilFunctions.GetAstromonResourceByID(mapMonster, context, evo3)

        tvEvo1.text =   UtilFunctions.GetAstromonNameByID(mapString, mapMonster, evo1)
        tvEvo2.text =   UtilFunctions.GetAstromonNameByID(mapString, mapMonster, evo2)
        tvEvo3.text =   UtilFunctions.GetAstromonNameByID(mapString, mapMonster, evo3)



        val gender1 = mapMonster[evo1]!!.genderType
        val gender2 = mapMonster[evo2]!!.genderType
        val gender3 = mapMonster[evo3]!!.genderType

        ivGenderDetail1.visibility = View.VISIBLE
        ivGenderDetail2.visibility = View.VISIBLE
        ivGenderDetail3.visibility = View.VISIBLE

        when (gender1) {
            MonsterGenderTypeOuterClass.MonsterGenderType.Mon_Gender_Type_Male ->

                Picasso.with(context)
                        .load(R.drawable.ic_male)
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(ivGenderDetail1)
            MonsterGenderTypeOuterClass.MonsterGenderType.Mon_Gender_Type_Female ->

                Picasso.with(context)
                        .load(R.drawable.ic_female)
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(ivGenderDetail1)
            else ->
                ivGenderDetail1.visibility = View.GONE
        }

        when (gender2) {
            MonsterGenderTypeOuterClass.MonsterGenderType.Mon_Gender_Type_Male ->

                Picasso.with(context)
                        .load(R.drawable.ic_male)
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(ivGenderDetail2)
            MonsterGenderTypeOuterClass.MonsterGenderType.Mon_Gender_Type_Female ->

                Picasso.with(context)
                        .load(R.drawable.ic_female)
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(ivGenderDetail2)
            else ->
                ivGenderDetail2.visibility = View.GONE
        }


        when (gender3) {
            MonsterGenderTypeOuterClass.MonsterGenderType.Mon_Gender_Type_Male ->

                Picasso.with(context)
                        .load(R.drawable.ic_male)
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(ivGenderDetail3)
            MonsterGenderTypeOuterClass.MonsterGenderType.Mon_Gender_Type_Female ->

                Picasso.with(context)
                        .load(R.drawable.ic_female)
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(ivGenderDetail3)
            else ->
                ivGenderDetail3.visibility = View.GONE
        }



        llWholeDetail.setBackgroundColor(UtilFunctions.GetElementBG(context, mapMonster, evo3))

        Picasso.with(context)
                .load( GetSkillBookByGrade(highestLevel))
                .error(R.drawable.skill_book_1)
                .placeholder(R.drawable.skill_book_1)
                .into(ivSkilBookDetail)



        Picasso.with(context)
                .load( evo1Icon)
                .error(R.drawable.skill_blank)
                .placeholder(R.drawable.skill_blank)
                .into(ivEvo1)

        Picasso.with(context)
                .load( evo2Icon)
                .error(R.drawable.skill_blank)
                .placeholder(R.drawable.skill_blank)
                .into(ivEvo2)

        Picasso.with(context)
                .load( evo3Icon)
                .error(R.drawable.skill_blank)
                .placeholder(R.drawable.skill_blank)
                .into(ivEvo3)

        Picasso.with(context)
                .load(UtilFunctions.GetElementResourceByMonUid(mapMonster, evo1))
                .error(R.drawable.frame_evo1)
                .placeholder(R.drawable.frame_evo1)
                .into(frame_evo1)

        Picasso.with(context)
                .load(UtilFunctions.GetElementResourceByMonUid(mapMonster, evo2))
                .error(R.drawable.frame_evo2)
                .placeholder(R.drawable.frame_evo2)
                .into(frame_evo2)


        Picasso.with(context)
                .load(UtilFunctions.GetElementResourceByMonUid(mapMonster, evo3))
                .error(R.drawable.frame_evo3)
                .placeholder(R.drawable.frame_evo3)
                .into(frame_evo3)


        Picasso.with(context)
                .load(UtilFunctions.GetGradeResourceByMonUid(mapMonster, evo1))
                .error(R.drawable.s1)
                .placeholder(R.drawable.s1)
                .into(ivGradeEvo1)

        Picasso.with(context)
                .load(UtilFunctions.GetGradeResourceByMonUid(mapMonster, evo2))
                .error(R.drawable.s1)
                .placeholder(R.drawable.s1)
                .into(ivGradeEvo2)

        Picasso.with(context)
                .load(UtilFunctions.GetGradeResourceByMonUid(mapMonster, evo3))
                .error(R.drawable.s1)
                .placeholder(R.drawable.s1)
                .into(ivGradeEvo3)

        ivGender.visibility = View.GONE

        tvType.text = UtilFunctions.GetMonsterType(mapMonster, mapString, mapUid , evo3)
        
        val listMonBar = protoHelper.ReadMapMonBar(context)
        val monMap : Map<Int, SmjBarObjectOuterClass.SmjBarObject> = listMonBar.associateBy ({ it.monsterUid  }, { it.detailSize } )
        val monMapStatValue : Map<Int, SmjBarParentObjectOuterClass.SmjBarParentObject > = listMonBar.associateBy ({ it.monsterUid  }, { it } )
        val monValue = monMap[evo3]!!


        val hpStat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_HP ) + ": " +
                NumberFormat.getNumberInstance(Locale.US).format(Math.round(monMapStatValue[evo3]!!.hp.toDouble()).toInt()).toString()
        val atkStat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_ATTACK ) + ": " +
                NumberFormat.getNumberInstance(Locale.US).format(Math.round(monMapStatValue[evo3]!!.atk.toDouble()).toInt()).toString()
        val defStat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_DEFENSE ) + ": " +
                NumberFormat.getNumberInstance(Locale.US).format(Math.round(monMapStatValue[evo3]!!.def.toDouble()).toInt()).toString()
        val healStat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_HEAL ) + ": " +
                NumberFormat.getNumberInstance(Locale.US).format(Math.round(monMapStatValue[evo3]!!.heal.toDouble()).toInt()).toString()
        val critDmgStat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_CRI_DMG ) + ": " +
                NumberFormat.getNumberInstance(Locale.US).format(Math.round(  ((monMapStatValue[evo3]!!.critDmg -1) *100f)   .toDouble()).toInt()).toString()
        val critRateStat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_CRI_RATE ) + ": " +
                NumberFormat.getNumberInstance(Locale.US).format(Math.round(  ((monMapStatValue[evo3]!!.critRate) * 100f) .toDouble()).toInt()).toString()
        val resistStat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_RESIST ) + ": " +
                NumberFormat.getNumberInstance(Locale.US).format(Math.round(  ((monMapStatValue[evo3]!!.resist) * 100f).toDouble()).toInt()).toString()


        tvHp.text = hpStat
        tvAttack.text = atkStat
        tvDefense.text = defStat
        tvRecovery.text = healStat
        tvCritDmg.text = critDmgStat
        tvCritRate.text = critRateStat
        tvResist.text = resistStat

        ivBarHp.layoutParams.width = monValue.hp.toInt()
        ivBarAttack.layoutParams.width = monValue.atk.toInt()
        ivBarDefense.layoutParams.width = monValue.def.toInt()
        ivBarRecovery.layoutParams.width = monValue.heal.toInt()
        ivBarCritDmg.layoutParams.width = monValue.critDmg.toInt()
        ivBarCritRate.layoutParams.width = monValue.critRate.toInt()
        ivBarResist.layoutParams.width = monValue.resist.toInt()


        val hp = "/" + NumberFormat.getNumberInstance(Locale.US).format(  Math.round(GetMaxStat(maxStat,"hp")) )
        val atk = "/" +NumberFormat.getNumberInstance(Locale.US).format( Math.round(GetMaxStat(maxStat,"atk")))
        val def = "/" +NumberFormat.getNumberInstance(Locale.US).format( Math.round(GetMaxStat(maxStat,"def")))
        val heal = "/" +NumberFormat.getNumberInstance(Locale.US).format(Math.round(GetMaxStat(maxStat,"heal")))
        val critDmg = "/" +NumberFormat.getNumberInstance(Locale.US).format( (GetMaxStat(maxStat,"crit_dmg") -1) *100f  ) + "%+"
        val critRate = "/" +NumberFormat.getNumberInstance(Locale.US).format(  (GetMaxStat(maxStat,"crit_rate"))  * 100f ) + "%"
        val resist = "/" +NumberFormat.getNumberInstance(Locale.US).format( (GetMaxStat(maxStat,"resist") *100f) ) + "%"

        tvMaxHp.text = hp
        tvMaxAttack.text = atk
        tvMaxDefense.text = def
        tvMaxRecovery.text = heal
        tvMaxCritDmg.text = critDmg
        tvMaxCritRate.text = critRate
        tvMaxResist.text = resist



    }





    fun GetSkillDesc (monsterUid: Int) {

        var listDefSkill : MutableList<MonsterUpgradeSkillData> = mutableListOf()
        var listActSkill : MutableList<MonsterUpgradeSkillData> = mutableListOf()

        val monSkill = mapMonster[monsterUid]!!.skillLevel

        if( monSkill > 0  ) {

            tvSkillBookComingSoon.visibility = View.GONE
            tvSkillBookComingSoonDesc.visibility = View.GONE

            val ff : MsgMonsterUpgradeSkillOuterClass.MsgMonsterUpgradeSkill = mapSkillUpgrade[monSkill]!!

            listDefSkill = ff.defaultValuesList
            listActSkill = ff.activeValuesList

            lvSkillBookDefault.layoutManager = LinearLayoutManager(context)
            lvSkillBookActive.layoutManager = LinearLayoutManager(context)
            lvDisplaySection.layoutManager = LinearLayoutManager(context)

            val adapterDefault = SkillBookPopUpAdapter(context, listDefSkill)
            val adapterActive = SkillBookPopUpAdapter(context, listActSkill)

            lvSkillBookDefault.adapter = adapterDefault
            lvSkillBookActive.adapter = adapterActive

            val lvlList : List<String> = listOf(  "2", "3", "4", "5" )
            val adapterLvl = SkillBookPopUpLevelAdapter(lvlList)

            lvDisplaySection.adapter = adapterLvl

        } else {

            lvSkillBookDefault.visibility = View.GONE
            lvSkillBookActive.visibility = View.GONE

            tvSkillBookComingSoon.visibility = View.VISIBLE
            tvSkillBookComingSoonDesc.visibility = View.VISIBLE


            tvSkillBookComingSoon.text = UtilFunctions.GetStringByString(mapString, mapUid, Variables.COMING_SOON )
            tvSkillBookComingSoonDesc.text = UtilFunctions.GetStringByString(mapString, mapUid, Variables.SKILL_BOOK_SOON )

        }




    }




    fun SetViewContent (monsterUid : Int) {

        val defaultSkillEffect = UtilFunctions.GetSkillEffect(mapEffect, mapMonster, monsterUid)["default"] as MsgStatusEffectOuterClass.MsgStatusEffect
        val activeSkillEffect = UtilFunctions.GetSkillEffect(mapEffect, mapMonster, monsterUid)["active"] as MsgStatusEffectOuterClass.MsgStatusEffect

        val allSkill = UtilFunctions.GetSkill(mapSkill, mapMonster, monsterUid)

        val defaultSkill = allSkill["default"]!!
        val activeSkill = allSkill["active"]!!

        val leaderSkill = allSkill["leader"]!!
        val leaderEffect = UtilFunctions.GetStatusEffectByUid(mapEffect, leaderSkill.statusEffect)

        tvVariantSkill.text = mapString[leaderEffect.name]


        tvSkillTextVariant.text = UtilFunctions.GetSkillText(mapString, mapUid)["leader"]
        tvSkillTextPassive.text = UtilFunctions.GetSkillText(mapString, mapUid)["passive"]
        tvSkillTextActive.text= UtilFunctions.GetSkillText(mapString, mapUid)["active"]


        tvPassiveSkillEffect.text = mapString[defaultSkillEffect.name]
        tvActiveSkillEffect.text = mapString[activeSkillEffect.name]

        val skillUpgrade = mapSkillUpgrade[mapMonster[monsterUid]!!.skillLevel]


        if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            tvPassiveSkillEffectDesc.text = Html.fromHtml(
                    UtilFunctions.GetFormattedDescString(mapString, defaultSkillEffect, skillUpgrade, Variables.SKILL_DEFAULT )
                    ,Html.FROM_HTML_MODE_LEGACY)

            tvActiveSkillEffectDesc.text = Html.fromHtml(
                    UtilFunctions.GetFormattedDescString(mapString, activeSkillEffect, skillUpgrade, Variables.SKILL_ACTIVE )
                    ,Html.FROM_HTML_MODE_LEGACY)

            tvVariantSkillDesc.text = Html.fromHtml(
                    UtilFunctions.GetFormattedLeaderDescString(mapString, leaderEffect)
                    ,Html.FROM_HTML_MODE_LEGACY)

        } else {
            tvPassiveSkillEffectDesc.text = Html.fromHtml(
                    UtilFunctions.GetFormattedDescString(mapString, defaultSkillEffect, skillUpgrade, Variables.SKILL_DEFAULT ))
            tvActiveSkillEffectDesc.text = Html.fromHtml(
                    UtilFunctions.GetFormattedDescString(mapString, activeSkillEffect, skillUpgrade, Variables.SKILL_ACTIVE ))
            tvVariantSkillDesc.text = Html.fromHtml(
                    UtilFunctions.GetFormattedLeaderDescString(mapString, leaderEffect))
        }

        Picasso.with(context)
                .load(UtilFunctions.GetSkillEffectResource(context, leaderSkill.icon))
                .error(R.drawable.skill_blank)
                .placeholder(R.drawable.skill_blank)
                .into(ivVariantSkill)


        Picasso.with(context)
                .load( UtilFunctions.GetSkillEffectResource(context, defaultSkillEffect.subType.name))
                .error(R.drawable.skill_blank)
                .placeholder(R.drawable.skill_blank)
                .into(ivPassiveSkillEffect)


        Picasso.with(context)
                .load(UtilFunctions.GetSkillEffectResource(context, activeSkillEffect.subType.name))
                .error(R.drawable.skill_blank)
                .placeholder(R.drawable.skill_blank)
                .into(ivActiveSkillEffect)

        Picasso.with(context)
                .load(UtilFunctions.GetSkillResource(context, defaultSkill.icon))
                .error(R.drawable.skill_blank)
                .placeholder(R.drawable.skill_blank)
                .into(ivPassiveSkill)

        Picasso.with(context)
                .load(UtilFunctions.GetSkillResource(context, activeSkill.icon))
                .error(R.drawable.skill_blank)
                .placeholder(R.drawable.skill_blank)
                .into(ivActiveSkill)


        var defDmg = 0f
        val defPowString: String

        var actDmg = 0f
        val actPowString: String

        var defEffectValue = 0f
        var actEffectValue = 0f

        if(skillUpgrade != null) {
            skillUpgrade.defaultValuesList
                    .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.SkillDamage }
                    .forEach { defDmg += it.`val` }
            skillUpgrade.activeValuesList
                    .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.SkillDamage }
                    .forEach { actDmg += it.`val` }

            skillUpgrade.defaultValuesList
                    .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.PassiveVal }
                    .filter { defaultSkillEffect.vFloat > 0f }
                    .forEach { defEffectValue += ((it.`val`) *100f) }
            skillUpgrade.activeValuesList
                    .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.PassiveVal }
                    .filter { activeSkillEffect.vFloat > 0f }
                    .forEach { actEffectValue += ((it.`val`) *100f) }

        }

        if (  defaultSkillEffect.vFloat == 0f && defaultSkillEffect.vInt == 0) {
            tvPassiveEffectValue.text = "-"
        } else if(defaultSkillEffect.vFloat == 0f) {

            if(defEffectValue > 0) {
                val value = defaultSkillEffect.vInt.toString() + "(+" + defEffectValue.toInt().toString() + ")"
                tvPassiveEffectValue.text = value
            } else {
                tvPassiveEffectValue.text = defaultSkillEffect.vInt.toString()
            }

        } else if (defaultSkillEffect.vFloat > 0f) {

            if(defEffectValue > 0) {
                val value = (defaultSkillEffect.vFloat * 100f).toInt().toString() +"(+"+ defEffectValue.toInt().toString()+")" + "%"
                tvPassiveEffectValue.text = value

            } else {
                val value = (defaultSkillEffect.vFloat * 100f).toInt().toString() + "%"
                tvPassiveEffectValue.text = value
            }

        }


        if (activeSkillEffect.vFloat == 0f && activeSkillEffect.vInt == 0) {
            tvActiveEffectValue.text = "-"
        } else if(activeSkillEffect.vFloat == 0f) {

            if(actEffectValue > 0) {
                val value = activeSkillEffect.vInt.toString() + "(+" + actEffectValue.toInt().toString() + ")"
                tvActiveEffectValue.text = value

            } else {
                tvActiveEffectValue.text = activeSkillEffect.vInt.toString()
            }


        } else if (activeSkillEffect.vFloat > 0f) {

            if(actEffectValue > 0) {
                val value = (activeSkillEffect.vFloat * 100f).toInt().toString() +"(+"+ actEffectValue.toInt().toString()+")" + "%"
                tvActiveEffectValue.text = value

            } else {
                val value = (activeSkillEffect.vFloat * 100f).toInt().toString() + "%"
                tvActiveEffectValue.text = value
            }


        }


        if(defDmg > 0f) {
            defPowString = ((defaultSkill.action.weight) * 100f).toInt()  .toString() + "(+" + (defaultSkill.action.weight * defDmg * 100f).toInt().toString() + ")%"
        } else {
            defPowString = ((defaultSkill.action.weight) * 100f).toInt().toString() + "%"
        }

        if(actDmg > 0f) {
            actPowString = ((activeSkill.action.weight) * 100f).toInt()  .toString() + "(+" + (activeSkill.action.weight * actDmg * 100f).toInt().toString() + ")%"
        } else {
            actPowString = ((activeSkill.action.weight) * 100f).toInt().toString() + "%"
        }


        tvActiveSkillPower.text = actPowString
        tvPassiveSkillPower.text = defPowString

        tvActiveSkillType.text = activeSkill.action.type.name
        tvPassiveSkillType.text = defaultSkill.action.type.name

        tvActiveSkillTarget.text = context.getString(UtilFunctions.GetTargetStringResource( activeSkill.target))
        tvPassiveSkillTarget.text = context.getString(UtilFunctions.GetTargetStringResource( defaultSkill.target))

        tvActiveSkillSoulSize.text = activeSkill.soulSize.toString()
        tvPassiveSkillSoulSize.text = defaultSkill.soulSize.toString()




    }



    fun GetMaxStat (maxStat: HashMap<String, Float>, statType: String) : Float {
        return maxStat[statType]!!
    }


    fun GetStringUpgradeSkillData (sd: MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData): String {

        var str = String()
        val upgradeType = sd.upgradeType
        var turn = sd.turn

        if( sd.`val`.toDouble() > 0.0 ) {
            turn = (sd.`val` * 100).toInt()
        }




        if( upgradeType == MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType.PassiveProb) {
            val key = "ustr.skill.level.prob"
            str = UtilFunctions.GetStringByString(mapString, mapUid, key ).replace( "{0}", turn.toString())

        } else if( upgradeType == MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType.PassiveTurn) {
            val key = "ustr.skill.level.turn"
            str = UtilFunctions.GetStringByString(mapString, mapUid, key ).replace( "{0}", turn.toString())

        } else if( upgradeType == MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType.PassiveVal) {
            val key = "ustr.skill.level.value"
            str = UtilFunctions.GetStringByString(mapString, mapUid, key ).replace( "{0}", turn.toString())

        } else if( upgradeType == MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType.SkillDamage) {
            val key = "ustr.skill.level.damage"
            str = UtilFunctions.GetStringByString(mapString, mapUid, key ).replace( "{0}", turn.toString())
        }


        return str
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


}