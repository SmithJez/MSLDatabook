package com.felania.monstersuperleaguedatabook.activities


import android.app.*
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.support.design.widget.NavigationView

import android.support.v4.view.GravityCompat

import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.R.id.navAstroguide
import com.felania.monstersuperleaguedatabook.R.id.navSynergies
import com.felania.monstersuperleaguedatabook.adapters.AstromonAdapter
import com.felania.monstersuperleaguedatabook.fragments.AstroguideDetailActivity
import com.felania.monstersuperleaguedatabook.protobuf.ProtobufHelper
import com.felania.monstersuperleaguedatabook.utils.*
import com.felania.msldb.*
import com.felania.msldb.MsgMonsterSkillOuterClass.MsgMonsterSkill
import com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_drawer.*
import java.util.*
import kotlin.collections.HashMap


class MonDBActivity : AppCompatActivity() {
    lateinit var searchView : SearchView
    private var currentSortType = String()
    private var currentSearchText = String()

    private var listDictItemGroup = mutableListOf<MonsterEvolutionGroup>()
    lateinit var gameData : MsgGameDataOuterClass.MsgGameDataOrBuilder

    private var hpSort: Boolean = false
    private var atkSort: Boolean = false
    private var defSort: Boolean = false
    private var healSort: Boolean = false
    private var gradeSort: Boolean = false

    private var mapDictName : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
    private var mapDictNameSortResult : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
    private var mapDictNameFilterResult : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
    private var mapDictNameSearchResult : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
    private var mapDictNameDisplayResult : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()


    private var listString: List<MsgStringOuterClass.MsgLocalizedString> = listOf()
    private var listMonster: List<MsgMonsterOuterClass.MsgMonster> = listOf()
    private var listUid: List<MsgUidOuterClass.MsgUid> = listOf()
    private var listType: List<MsgMonsterTypeOuterClass.MsgMonsterType> = listOf()
    private var listSetting: List<MsgSettingOuterClass.MsgSetting> = listOf()
    private var listSkill : List<MsgMonsterSkillOuterClass.MsgMonsterSkill> = listOf()
    private var listEffect : List<MsgStatusEffectOuterClass.MsgStatusEffect> = listOf()
    private var listStageMonster : List<MsgStageMonsterOuterClass.MsgStageMonster> = listOf()

    private var mapSkillUpgrade: Map<Int, MsgMonsterUpgradeSkillOuterClass.MsgMonsterUpgradeSkill> = hashMapOf()
    private var mapString: Map<Int, String> = hashMapOf()
    private var mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster> = hashMapOf()
    private var mapUid: Map<String, MsgUidOuterClass.MsgUid> = hashMapOf()
    private var mapType: Map<String, MsgMonsterTypeOuterClass.MsgMonsterType> = hashMapOf()
    private var mapSetting: Map<Int, MsgSettingOuterClass.MsgSetting> = hashMapOf()
    private var mapSkill: Map<Int, MsgMonsterSkillOuterClass.MsgMonsterSkill> = hashMapOf()
    private var mapEffect : Map<Int, MsgStatusEffectOuterClass.MsgStatusEffect> = hashMapOf()


    private var elementFilter: ArrayList<CheckState> = arrayListOf()
    private var gradeFilter: ArrayList<CheckState> = arrayListOf()
    private var typeFilter: ArrayList<CheckState> = arrayListOf()
    private var variantFilter: ArrayList<CheckState> = arrayListOf()
    private var passiveFilter: ArrayList<CheckState> = arrayListOf()
    private var activeFilter: ArrayList<CheckState> = arrayListOf()
    private var targetFilter: ArrayList<CheckState> = arrayListOf()

    private var skillBookFilter : Boolean = false








    private var protoHelper = ProtobufHelper()

    private var context: Context = this


    private var barMaxSize : Int = 0
    private var barMaxSizeDetail : Int = 0


    lateinit var astromonAdapter : AstromonAdapter


    private var saveLang = String()

    private var maxStat: java.util.HashMap<String, Float> = hashMapOf()
    private var listDictItem = mutableListOf<MsgDictItemOuterClass.MsgDictItem>()
    private var mapStageMonster : Map<Int, MsgStageMonsterOuterClass.MsgStageMonster> = hashMapOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_drawer)

        saveLang = intent.getStringExtra(Variables.SETTING_LANGUAGE)
        maxStat = intent.getSerializableExtra("max_stat") as java.util.HashMap<String, Float>

        lvMon.layoutManager = LinearLayoutManager(this)

        fastscroller.setRecyclerView(lvMon)
        fastscroller.setViewsToUse(R.layout.recycler_view_fast_scroller__fast_scroller, R.id.fastscroller_handle)


        UtilFunctions.ClearFilterSetting(context)


        val ss = LocaleLanguage()

        ss.updateConfig(this)

        setSupportActionBar(toolbar)

        val toggle = object : ActionBarDrawerToggle(
                this, drawer_layout, toolbar,
                0, 0) {
        }


        val manager = context.packageManager
        val info = manager.getPackageInfo(
                context.packageName, 0)
        val version = "v. " + info.versionName


        tvDBVersion.text =  version

        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()




        barMaxSize = intent.getIntExtra(Variables.BAR_MAX_SIZE, 0)
        barMaxSizeDetail = intent.getIntExtra(Variables.BAR_MAX_SIZE_DETAIL, 0)



        ReadAllObject().execute()




        MobileAds.initialize(applicationContext, "ca-app-pub-1489459199627698~8687372969")

        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)



    }

    fun GetStringData(stringFile : String): MsgStringOuterClass.MsgString.Builder {
        val stringData = protoHelper.readStringData(stringFile, context)
        if (stringData.localStringsCount == 0) {
            stringData.mergeFrom(protoHelper.readStringDataFromAssets(stringFile, context))
        }
        return stringData
    }

    fun ReadAllData() {

        val localeMap: java.util.HashMap<String, String> = Variables.localeToStringMap

        var stringFile = localeMap[saveLang]

        if( stringFile == null) {
            stringFile = Variables.STRING_EN
        }

        val string = GetStringData(stringFile)

        listString = string.localStringsList
        listUid = protoHelper.ReadUids(MsgGameDataOuterClass.MsgGameData.UIDS_FIELD_NUMBER, context)
        listMonster =  protoHelper.ReadMonsters(MsgGameDataOuterClass.MsgGameData.MONSTERS_FIELD_NUMBER, context)
        listDictItem = protoHelper.ReadDictItem(MsgGameDataOuterClass.MsgGameData.MONSTER_DICT_FIELD_NUMBER, context)
        listType = protoHelper.ReadMonsterType(MsgGameDataOuterClass.MsgGameData.MONSTER_TYPES_FIELD_NUMBER, context)
        listSetting = protoHelper.ReadSetting(MsgGameDataOuterClass.MsgGameData.SETTINGS_FIELD_NUMBER, context)
        listSkill = protoHelper.ReadSkill(MsgGameDataOuterClass.MsgGameData.MONSTER_SKILLS_FIELD_NUMBER, context)
        listEffect = protoHelper.ReadEffect(MsgGameDataOuterClass.MsgGameData.STATUS_EFFECTS_FIELD_NUMBER, context)
        listStageMonster = protoHelper.ReadStageMonster (MsgGameDataOuterClass.MsgGameData.STAGE_MONSTERS_FIELD_NUMBER, context)



        mapUid = listUid.associateBy ({ it.strUid }, {it})
        mapString = listString.associateBy( {it.uid}, {it.text})
        mapMonster = listMonster.associateBy ({ it.uid } , {it} )

//        Log.wtf("gfff", "mapMonster " + mapMonster)

        mapType = listType.associateBy ({ String.format("%s_%s_%s",
                it.evolution.name, it.weightType.name, it.type.name ) } , { it } )
        mapSetting = listSetting.associateBy ({ it.uid  } , {it})
        mapSkill = listSkill.associateBy( { it.uid} , {it} )
        mapEffect = listEffect.associateBy( {it.uid } , {it})
        mapStageMonster = listStageMonster.associateBy(  {it.uid}, {it} )

        mapDictName = protoHelper.ReadMapDictName(context).associateBy( { it.resName }, { MonsterEvolutionGroup(it.resName,  it.evo1, it.evo2, it.evo3  )  } ).toMutableMap()
//        mapDictName2 = mapDictName
//        mapDictName3 = mapDictName

    }


    fun GetMapEffect (): Map<Int, MsgStatusEffect> {
        return mapEffect
    }

    fun GetMapSkill(): Map<Int, MsgMonsterSkill> {
        return mapSkill
    }




    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)

    }



    private fun DrawerController() {

        val astroguideLabel = UtilFunctions.GetStringFromUidText(mapString, mapUid,"ustr.dictionary")
        val synergyLabel = UtilFunctions.GetStringFromUidText(mapString, mapUid,"ustr.link.bonus.dic")
        val titanLabel = UtilFunctions.GetStringFromUidText(mapString, mapUid,"str.mon.name.light.bosstitan.1")
        val exitLabel = UtilFunctions.GetStringFromUidText(mapString, mapUid,"ustr.terms.exit")
        val languageLabel = UtilFunctions.GetStringFromUidText(mapString, mapUid,"ustr.dlg.user.info.tab.language")
        val playLabel = UtilFunctions.GetStringFromUidText(mapString, mapUid,"ustr.lobby.btn_selectstage")

        val navMenu = nav_view.menu

        val navSyn = navMenu.findItem(navSynergies)
        navSyn.title = synergyLabel

        val navAstroguide = navMenu.findItem(navAstroguide)
        navAstroguide.title = astroguideLabel

        val navTitan = navMenu.findItem(R.id.navClan)
        navTitan.title = titanLabel

        val navExit = navMenu.findItem(R.id.navExit)
        navExit.title = exitLabel

        val langSetting = navMenu.findItem(R.id.langSetting)
        langSetting.title = languageLabel

        val navLaunch = navMenu.findItem(R.id.navLaunch)
        navLaunch.title = playLabel

        nav_view.setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener { item ->
            val id = item.itemId

            when (id) {
                R.id.navExit -> {
                    System.exit(0)
                    return@OnNavigationItemSelectedListener true
                }



                R.id.navClan -> {
                    StartClan()


                }

                R.id.navSynergies -> {

                    StartSynergies()
                }




//                R.id.navAstroguide -> {
//
//                    ReturnToFirstPage()
//
//                }


                R.id.navLaunch -> {

                    val alertDialog = AlertDialog.Builder(context).create()
                    alertDialog.setTitle("Launch Monster Super League")
                    alertDialog.setMessage("Do you want to launch Monster Super League?")
                    alertDialog.setCancelable(false)
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Yes",
                            { _, _ ->
                                val mslPackageName = "com.ftt.msleague_gl"
                                StartGame(context, mslPackageName)
                            })

                    alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "No",
                            { dialog, _ -> dialog.dismiss() })


                    alertDialog.show()



                    return@OnNavigationItemSelectedListener true
                }


                R.id.langSetting -> {
                    val intent = Intent(this, LanguageSelectionActivity::class.java)

                    startActivity(intent)


                    return@OnNavigationItemSelectedListener true

                }
            }


            if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
                drawer_layout.closeDrawer(GravityCompat.START)
            }

            true
        })

    }


    private fun StartGame(context: Context, packageName: String) {
        var intent: Intent? = context.packageManager.getLaunchIntentForPackage(packageName)
        if (intent == null) {
            // Bring user to the market or let them choose an app?
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("market://details?id=" + packageName)
        }
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }



    fun SearchSort () {



        //Sort
        if (mapDictNameFilterResult.isEmpty()) {
            SortDict(currentSortType, mapDictName )
        } else {
            SortDict(currentSortType, mapDictNameFilterResult )
        }

        //Search

        Bind(  SearchFilter(currentSearchText, mapDictNameSortResult))


    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {


        menuInflater.inflate(R.menu.mon_menu, menu)

        searchView  = menu.findItem(R.id.mySearch).actionView as SearchView

        val searchImgId = resources.getIdentifier("android:id/search_button", null, null)
        val v : ImageView = searchView.findViewById(searchImgId)
        v.setImageResource(R.drawable.ic_search_white_24dp)


        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(p0: String): Boolean {
                if(p0.isEmpty()) {

                    currentSearchText = String()

//                    Log.wtf("isempty", "isempty " + currentSearchText.isEmpty())

                    if (mapDictNameSortResult.isEmpty()) {
                        Bind( GetListFromMap(mapDictName))
                    } else {
                        Bind( GetListFromMap(mapDictNameSortResult))
                    }


                } else {
                    Log.wtf("isempty", "isEmpty " + mapDictNameSortResult.isEmpty())

                    currentSearchText = p0

                    if (mapDictNameSortResult.isEmpty()) {
//                        Log.wtf("sss", "currentSearchText " + currentSearchText)
//                        Log.wtf("sss", "mapDictName " + mapDictName)

                        Bind(  SearchFilter(currentSearchText, mapDictName))
                    } else {
                        Bind(  SearchFilter(currentSearchText, mapDictNameSortResult))
                    }





                }
                return true
            }

        })

        return true


    }

    private fun SetQtyText(text: String){
        tvResult.text = text
    }


    private fun SetSortText(sortText: String) {
        tvSort.text = sortText

    }

    fun Bind(dict: List<MonsterEvolutionGroup> = listDictItemGroup) {

        astromonAdapter = AstromonAdapter(context,
                dict,
                mapString,
                mapMonster,
                mapUid,
                maxStat,
                mapSkillUpgrade)

        lvMon.adapter = astromonAdapter

        val gg = dict.size

        SetQtyText("#" + gg.toString())


        lvMon.addOnItemTouchListener(RecyclerItemClickListener(context, lvMon, object: RecyclerItemClickListener.OnItemClickListener {
            override fun onItemClick(view: View, position: Int) {
                StartSkillBookPopupActivity(astromonAdapter.GetEvoGroupByPosition(position))

//                Log.wtf("click", "click " +astromonAdapter.GetEvoGroupByPosition(position))
            }

            override fun onLongItemClick(view: View, position: Int) {

            }


        }))
    }



    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

//        val map = if (mapDictNameFilterResult.isEmpty()) {
//            mapDictName
//        } else {
//            mapDictNameFilterResult
//        }

        val id : Int = item!!.itemId
        when (id) {
            R.id.sortHP -> {

                currentSortType = Variables.HP
                SearchSort()

                val stat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_HP )
                if(!hpSort) {
                    SetSortToFalse()
                    hpSort = true
                    SetSortText(stat + ": (9->0)")
                } else {
                    SetSortToFalse()
                    SetSortText(stat + ": (0->9)")
                }

                return true
            }
            R.id.sortAttack -> {

                currentSortType = Variables.ATK
                SearchSort()

                val stat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_ATTACK )

                if(!atkSort) {
                    SetSortToFalse()
                    atkSort = true
                    SetSortText(stat + ": (9->0)")
                } else {
                    SetSortToFalse()
                    SetSortText(stat + ": (0->9)")
                }

                return true
            }
            R.id.sortDefense -> {

                currentSortType = Variables.DEF
                SearchSort()


                val stat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_DEFENSE )
                if(!defSort) {
                    SetSortToFalse()
                    defSort = true
                    SetSortText(stat + ": (9->0)")
                } else {
                    SetSortToFalse()
                    SetSortText(stat + ": (0->9)")
                }

                return true
            }
            R.id.sortRecovery -> {

                currentSortType = Variables.HEAL
                SearchSort()

                val stat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_HEAL )
                if(!healSort) {
                    SetSortToFalse()
                    healSort = true
                    SetSortText(stat + ": (9->0)")
                } else {
                    SetSortToFalse()
                    SetSortText(stat + ": (0->9)")
                }


                return true
            }
            R.id.sortStar -> {

                currentSortType = Variables.GRADE
                SearchSort()


                val stat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_GRADE )
                if(!gradeSort) {
                    SetSortToFalse()
                    gradeSort = true
                    SetSortText(stat + ": (9->0)")
                } else {
                    SetSortToFalse()
                    SetSortText(stat + ": (0->9)")
                }


                return true


            }

            R.id.menuFilter -> {
                FilterMon()

                return true

            }

            R.id.resetToDefault -> {
                ResetToDefault()
                return true
            }

//            R.id.btnSkillBookBack -> {
//
//                ReturnToFirstPage()
//
//                return true
//            }


            else -> {
                return true
            }


        }

    }

    fun SearchFilter(keyword: String, map: MutableMap<String, MonsterEvolutionGroup> ) : List<MonsterEvolutionGroup> {

        val tempList : MutableList<MonsterEvolutionGroup> = mutableListOf()

        val tempMap : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()

//        Log.wtf("mapStringSize ", "mapStringSize " + mapString.size)
//        Log.wtf("mapMonster ", "mapMonster " + mapMonster.size)
//        Log.wtf("map ", "map " + map.size)

//        for((key, value) in mapString) {
//            Log.wtf("jihji","ssKey " + key +   " ssValue " + value)
//        }


        if(keyword.isNotEmpty()) {
            for((key, value) in map) {

//                Log.wtf("lll", "str " +mapString )
//                Log.wtf("lll", "value " +value.evo1 )

                val evo1Name = UtilFunctions.GetAstromonNameByID(mapString, mapMonster, value.evo1.monsterUid)!!.toLowerCase()
                val evo2Name = UtilFunctions.GetAstromonNameByID(mapString, mapMonster, value.evo2.monsterUid)!!.toLowerCase()
                val evo3Name = UtilFunctions.GetAstromonNameByID(mapString, mapMonster, value.evo3.monsterUid)!!.toLowerCase()


                if(evo1Name.contains(keyword.toLowerCase())
                        || evo2Name.contains(keyword.toLowerCase())
                        || evo3Name.contains(keyword.toLowerCase())
                        ) {

                    tempMap.put(key, value)
                    tempList.add(value)
                }

            }
        } else {

            Log.wtf("key ", "key is empty")

                tempList.addAll  (map.values)
        }






        mapDictNameSearchResult = tempMap
        mapDictNameDisplayResult = tempMap

        return tempList
    }

    private fun ResetToDefault (){
        mapDictNameSearchResult.clear()
        mapDictNameSortResult.clear()
        mapDictNameDisplayResult.clear()
        mapDictNameFilterResult.clear()

        currentSortType = String()
        currentSearchText = String()


        SetSortToFalse()
        SetSortText(getString(R.string.default_sort))
        UtilFunctions.ClearFilterSetting(context)

        searchView.setQuery("", false)
        searchView.clearFocus()
        searchView.isIconified = true

        Bind()



    }

    fun GetListFromMap (map : MutableMap<String, MonsterEvolutionGroup> ) : List<MonsterEvolutionGroup> {

        return map.map { it.value }

    }

    private fun SortDict(sortType : String, map : MutableMap<String, MonsterEvolutionGroup>) : List<MonsterEvolutionGroup> {

        currentSortType = sortType

        val tempList : MutableList<MonsterEvolutionGroup> = mutableListOf()

        val statObj : MutableList<AstromonStatObj> = mutableListOf()

        val tempMap : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
        var hashMapStat : HashMap<String, Float>

        for((_, value) in map) {
            val uid = value.evo3.monsterUid

            hashMapStat = UtilFunctions.GetMonster(
                    mapSetting, mapUid, mapType, mapMonster,
                    uid, 60, 0, MonsterGradeOuterClass.MonsterGrade.MG_6, MonsterStatWeightTypeOuterClass.MonsterStatWeightType.MS_Normal, false)

            var temp : AstromonStatObj

            val barObj = BarObject(
                    hashMapStat["hp"]!!,
                    hashMapStat["atk"]!!,
                    hashMapStat["def"]!!,
                    hashMapStat["heal"]!!,
                    hashMapStat["crit_dmg"]!!,
                    hashMapStat["crit_rate"]!!,
                    hashMapStat["resist"]!!
            )

            temp = AstromonStatObj(value, barObj )
            statObj.add(temp)
        }

        when (sortType) {
            "hp" -> {
                statObj.sortWith(kotlin.Comparator { p1, p2 ->
                    val t1 = p1.barObject.hp
                    val t2 = p2.barObject.hp

                    if(!hpSort) {
                        (t2 - t1).toInt()

                    } else {
                        (t1 - t2).toInt()
                    }

                })
            }
            "atk" -> {
                statObj.sortWith(kotlin.Comparator { p1, p2 ->
                    val t1 = p1.barObject.atk
                    val t2 = p2.barObject.atk

                    if(!atkSort) {
                        (t2 - t1).toInt()
                    } else {
                        (t1 - t2).toInt()
                    }
                })
            }
            "def" -> {
                statObj.sortWith(kotlin.Comparator { p1, p2 ->
                    val t1 = p1.barObject.def
                    val t2 = p2.barObject.def
                    if(!defSort) {
                        (t2 - t1).toInt()
                    } else {
                        (t1 - t2).toInt()
                    }
                })
            }
            "heal" -> {
                statObj.sortWith(kotlin.Comparator { p1, p2 ->
                    val t1 = p1.barObject.heal
                    val t2 = p2.barObject.heal
                    if(!healSort) {
                        (t2 - t1).toInt()
                    } else {
                        (t1 - t2).toInt()
                    }
                })
            }
            "grade" -> {
                statObj.sortWith(kotlin.Comparator { p1, p2 ->
                    val t1 = mapMonster[p1.monEvoGroup.evo3.monsterUid]!!.bornGradeValue
                    val t2 = mapMonster[p2.monEvoGroup.evo3.monsterUid]!!.bornGradeValue
                    if(!gradeSort) {
                        (t2 - t1)
                    } else {
                        (t1 - t2)
                    }
                })
            } else -> {
                //No need to sort

            }
        }


        for(stat in statObj) {
            val seaObj = map[stat.monEvoGroup.resName]!!

            tempMap.put(stat.monEvoGroup.resName, seaObj)
        }



        mapDictNameSortResult = tempMap

        statObj.mapTo(tempList) { it.monEvoGroup }

        return tempList
    }



    private fun FilterMon (){
        val intent = Intent(this@MonDBActivity, FilterMonActivity::class.java)

        startActivityForResult(intent, 2222)
    }

    private fun StartGolem () {

        val intent = Intent(this@MonDBActivity, GolemActivity::class.java)

        intent.putExtra(Variables.SETTING_LANGUAGE, saveLang)

        startActivity(intent)

    }


    private fun StartSynergies () {
        val intent = Intent(this@MonDBActivity, SynergyActivity::class.java)
        intent.putExtra("max_stat", maxStat)
        intent.putExtra(Variables.SETTING_LANGUAGE, saveLang)

        startActivity(intent)
    }

    private fun StartClan () {

        val intent = Intent(this@MonDBActivity, ClanActivity::class.java)

        intent.putExtra(Variables.SETTING_LANGUAGE, saveLang)

        startActivity(intent)

    }



    fun StartSkillBookPopupActivity(evolutionGroup: MonsterEvolutionGroup) {



        val evo1 = evolutionGroup.evo1.monsterUid
        val evo2 = evolutionGroup.evo2.monsterUid
        val evo3 = evolutionGroup.evo3.monsterUid


        val intent = Intent(this@MonDBActivity, AstroguideDetailActivity::class.java)

        intent.putExtra(Variables.SETTING_LANGUAGE, saveLang)
        intent.putExtra(Variables.UID_EVO1, evo1)
        intent.putExtra(Variables.UID_EVO2, evo2)
        intent.putExtra(Variables.UID_EVO3, evo3)
        intent.putExtra("max_stat", maxStat)

        startActivity(intent)


    }





    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == Activity.RESULT_OK) {

            if(data != null) {

                elementFilter = data.getParcelableArrayListExtra(Variables.ELEMENT)
                gradeFilter = data.getParcelableArrayListExtra(Variables.GRADE)
                typeFilter = data.getParcelableArrayListExtra(Variables.TYPE)
                variantFilter = data.getParcelableArrayListExtra(Variables.SKILL_LEADER)

                targetFilter = data.getParcelableArrayListExtra(Variables.TARGET)

                skillBookFilter = data.getBooleanExtra(Variables.SKILL_BOOK, false)

                passiveFilter = data.getParcelableArrayListExtra(Variables.SKILL_DEFAULT)
                activeFilter = data.getParcelableArrayListExtra(Variables.SKILL_ACTIVE)

                FilterAsyncTas().execute()


            }


        }

    }



    fun FilterBySkill (map : MutableMap<String, MonsterEvolutionGroup>) : MutableList<MonsterEvolutionGroup> {

        val tempList : MutableList<MonsterEvolutionGroup> = mutableListOf()
        val tempMap2 : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()

        var tempMapSkillBook : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
        var tempMapDefault : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
        var tempMapVariant: MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
        var tempMapActive : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
        var tempMapElement : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
        var tempMapTarget : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
        var tempMapGrade : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
        var tempMapType : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()


        val tempMap = map

        for ((key, value) in tempMap) {
            val sb = mapMonster[value.evo3.monsterUid]!!.skillLevel
            if(skillBookFilter) {
                if (sb > 0) {
                    tempMapSkillBook.put(key, value)
                }
            } else {
                tempMapSkillBook = tempMap
                break
            }
        }

        for ((key, value) in tempMapSkillBook ) {
            val monElement : MonsterElementTypeOuterClass.MonsterElementType = mapMonster[value.evo3.monsterUid]!!.element
            val monElementText = UtilFunctions.GetElementText(mapString, mapUid, monElement)
            elementFilter
                    .filter { it.check }
                    .forEach {
                        if(it.value == monElementText) {
                            tempMapElement.put(key, value)
                        }
                    }
        }

        if(tempMapElement.isEmpty()) {
            tempMapElement = tempMapSkillBook
        }


        for ((key, value) in tempMapElement ) {
            val p1 = mapMonster[value.evo3.monsterUid]!!.bornGrade.number.toString()
            gradeFilter
                    .filter { it.check }
                    .forEach {
                        if(it.value == p1) {
                            tempMapGrade.put(key, value)
                        }
                    }
        }

        if(tempMapGrade.isEmpty()) {
            tempMapGrade = tempMapElement
        }

        for ((key, value) in tempMapGrade ) {
            val p1 = mapMonster[value.evo3.monsterUid]!!.defStatType
            val p2 = UtilFunctions.GetMonsterType(p1, mapString, mapUid )
            typeFilter
                    .filter { it.check }
                    .forEach {
                        if(it.value == p2) {
                            tempMapType.put(key, value)
                        }
                    }
        }

        if(tempMapType.isEmpty()) {
            tempMapType = tempMapGrade
        }

        for ((key, value) in tempMapType ) {
            val p1 : String = mapString[mapEffect [mapSkill[mapMonster[value.evo3.monsterUid]!!.leaderSkill]!!.statusEffect]!!.name]!!
            variantFilter
                    .filter { it.check }
                    .forEach {
                        if(it.value == p1) {
                            tempMapVariant.put(key, value)
                        }
                    }
        }

        if(tempMapVariant.isEmpty()) {
            tempMapVariant = tempMapType
        }

        for ((key, value) in tempMapVariant) {
            val p1 : String = mapString[mapEffect[mapMonster[value.evo3.monsterUid]!!.defaultSkillStatusEffectBeyond]!!.name]!!
            passiveFilter
                    .filter { it.check }
                    .forEach {
                        if(it.value == p1) {
                            tempMapDefault.put(key, value)
                        }
                    }
        }

        if(tempMapDefault.isEmpty()) {
            tempMapDefault = tempMapVariant
        }

        for ((key, value) in tempMapDefault) {
            val p1 : String = mapString[mapEffect[mapMonster[value.evo3.monsterUid]!!.activeSkillStatusEffectBeyond]!!.name]!!
            activeFilter
                    .filter { it.check }
                    .forEach {
                        if(it.value == p1) {
                            tempMapActive.put(key, value)
                        }
                    }
        }

        if(tempMapActive.isEmpty()) {
            tempMapActive = tempMapDefault
        }

        for ((key, value) in tempMapActive ) {
            val activeTarget = mapSkill[mapMonster[value.evo3.monsterUid]!!.activeSkill]!!.target
            val activeTargetText : String = UtilFunctions.GetTargetText(activeTarget)
            targetFilter
                    .filter { it.check }
                    .forEach {

                        if(it.value == activeTargetText) {
                            tempMapTarget.put(key, value)
                        }
                    }
        }

        if(tempMapTarget.isEmpty()) {
            tempMapTarget = tempMapActive
        }


        for((key, value) in tempMapActive) {
            if(tempMapTarget.contains(key)) {
                tempMap2.put(key, value)
            }
        }



        tempMap2.mapTo(tempList) {it.value}


        mapDictNameFilterResult = tempMap2

        return tempList

    }

    fun SetSortToFalse () {

        hpSort = false
        atkSort = false
        defSort = false
        healSort = false
        gradeSort = false

    }




    override fun onDestroy() {
        super.onDestroy()
        UtilFunctions.ClearFilterSetting(context)
    }


    private inner class FilterAsyncTas : AsyncTask<Void, Int, MutableList<MonsterEvolutionGroup>>() {

        var dialog : ProgressDialog = ProgressDialog(context)


        override fun doInBackground(vararg params: Void?): MutableList<MonsterEvolutionGroup> {

            return if(mapDictNameSortResult.isEmpty()) {
                FilterBySkill(mapDictName)
            } else {
                FilterBySkill(mapDictNameSortResult)
            }

        }

        override fun onPreExecute() {
            dialog.setMessage("Loading...please wait")
            dialog.show()
            super.onPreExecute()
        }

        override fun onPostExecute(result: MutableList<MonsterEvolutionGroup>) {
            super.onPostExecute(result)
            dialog.dismiss()


            searchView.setQuery("", false)
            searchView.clearFocus()
            searchView.isIconified

//            SearchSort()
            Bind(result)
        }


    }
















    var doubleBackToExitPressedOnce = false

    override fun onBackPressed() {


        if(doubleBackToExitPressedOnce) {
            super.onBackPressed()
            return
        }

        doubleBackToExitPressedOnce = true

        Toast.makeText(this, "Press BACK again to exit", Toast.LENGTH_SHORT).show()

        Handler().postDelayed({ doubleBackToExitPressedOnce = false }, 2000)



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


    private inner class ReadAllObject : AsyncTask<Void, Int, Int>() {
        var dialog : ProgressDialog = ProgressDialog(context)

        override fun doInBackground(vararg params: Void): Int? {


            ReadAllData()


            val listSkillUpgrade = protoHelper.ReadSkillUpgrade(MsgGameDataOuterClass.MsgGameData.MONSTER_UPGRADE_SKILLS_FIELD_NUMBER, context)

            mapSkillUpgrade = listSkillUpgrade.associateBy ({ it.uid }, {it})


            mapDictName.mapTo(listDictItemGroup) { it.value }



            return null
        }

        override fun onPreExecute() {
            dialog.setMessage("Loading...please wait")
            dialog.show()
            super.onPreExecute()
        }

        override fun onPostExecute(result: Int?) {
            dialog.dismiss()


            SetSortText(getString(R.string.default_sort))
            Bind()


            DrawerController()

            super.onPostExecute(result)
        }

    }



}