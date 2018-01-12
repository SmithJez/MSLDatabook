package com.felania.monstersuperleaguedatabook.activities

//import com.felania.msldatabook.utils.Variables.Companion
import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.felania.monstersuperleaguedatabook.BuildConfig
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.protobuf.ProtobufHelper
import com.felania.monstersuperleaguedatabook.utils.*
import com.felania.msldb.*
import kotlinx.android.synthetic.main.activity_initial_loading.*
import kotlinx.android.synthetic.main.mon_stat.view.*
import java.io.*
import java.util.*
import kotlin.collections.HashSet






class InitialLoadingActivity : AppCompatActivity() {

    val context: Context = this
    var barMaxSize : Int = 0
    var barMaxSizeDetail : Int = 0

    val protoHelper = ProtobufHelper()

    private var listDictItemGroup = mutableListOf<MonsterEvolutionGroup>()

    private var mapMonBar : HashMap<Int, BarObjectParent> = hashMapOf()

    lateinit var evo1Dict : MsgDictItemOuterClass.MsgDictItem
    lateinit var evo2Dict : MsgDictItemOuterClass.MsgDictItem
    lateinit var evo3Dict : MsgDictItemOuterClass.MsgDictItem

    private var mapStageMonster : Map<Int, MsgStageMonsterOuterClass.MsgStageMonster> = hashMapOf()

    private var mapDictName : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
    private var mapDictName2 : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
    private var mapDictName3 : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()


    private var listDictItem = mutableListOf<MsgDictItemOuterClass.MsgDictItem>()



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

    private var maxStat: HashMap<String, Float> = hashMapOf()
    private var minStat: HashMap<String, Float> = hashMapOf()
    private var difStat: HashMap<String, Float> = hashMapOf()


    private var saveLang = String()

    private var existWriteMapMonBar = false
    private var existWriteMapDictName = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initial_loading)

        saveLang = ReadSavedFilter()
        changeLang(saveLang)

        val fileMapMonBar = File(context.filesDir, "MapMonBar.smj")
        val fileMapDictName = File(context.filesDir, "MapDictName.smj")






        existWriteMapMonBar = fileMapMonBar.exists()
        existWriteMapDictName = fileMapDictName.exists()

        CheckFirstRun()

//        protoHelper.DeleteExistingMap(context, "MapMonBar")
//        protoHelper.DeleteExistingMap(context, "MapDictName")

        copyAssets()

        PrepareToStartMain()


    }

    fun ReadSavedFilter(): String {

        val sharedPreferences = getSharedPreferences(Variables.SETTING_LANGUAGE, Context.MODE_PRIVATE)

        val lang = sharedPreferences.getString(Variables.SETTING_LANGUAGE, "en")

        return lang

    }

    fun changeLang(lang: String) {
        if (lang.equals("", ignoreCase = true))
            return
        val myLocale = Locale(lang)
        Locale.setDefault(myLocale)
        val config = android.content.res.Configuration()
        config.locale = myLocale
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
    }


    fun PrepareToStartMain () {
        dummy.coorForCal.post{
            barMaxSize = dummy.coorForCal.width
            dummy.visibility = View.GONE

            dummyDetail.coorForCal.post({
                barMaxSizeDetail = dummyDetail.coorForCal.width
                dummyDetail.visibility = View.GONE

                ReadAllObject().execute()



            })
        }

    }


    private fun StartActivity() {

        val intent = Intent(context, MonDBActivity::class.java)

        intent.putExtra(Variables.BAR_MAX_SIZE, barMaxSize)
        intent.putExtra(Variables.BAR_MAX_SIZE_DETAIL, barMaxSizeDetail)
        intent.putExtra(Variables.SETTING_LANGUAGE, saveLang)
        intent.putExtra("max_stat", maxStat)

        startActivity(intent)

        finish()

    }

    fun LoadDB(){

//        Log.wtf("FileMap", "FileMap " + existWriteMapMonBar)
//        Log.wtf("FileMap", "MapDictName " + existWriteMapDictName)

        val localeMap: HashMap<String, String> = Variables.localeToStringMap

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
        mapType = listType.associateBy ({ String.format("%s_%s_%s",
                it.evolution.name, it.weightType.name, it.type.name ) } , { it } )
        mapSetting = listSetting.associateBy ({ it.uid  } , {it})
        mapSkill = listSkill.associateBy( { it.uid} , {it} )
        mapEffect = listEffect.associateBy( {it.uid } , {it})
        mapStageMonster = listStageMonster.associateBy(  {it.uid}, {it} )


        maxStat.put("hp", 0f)
        maxStat.put("atk", 0f)
        maxStat.put("def", 0f)
        maxStat.put("heal", 0f)
        maxStat.put("crit_dmg", 0f)

        maxStat.put("crit_rate", 1f)
        maxStat.put("resist", 0.85f)

        minStat.put("hp", 99999f)
        minStat.put("atk", 99999f)
        minStat.put("def", 99999f)
        minStat.put("heal", 99999f)
        minStat.put("crit_dmg", 1f)
        minStat.put("crit_rate", 0f)
        minStat.put("resist", 0f)


        for (dict : MsgDictItemOuterClass.MsgDictItem in listDictItem) {

            val mapMon = mapMonster[dict.monsterUid]!!

            if (mapMon.evolution.name == MonsterEvolutionOuterClass.MonsterEvolution.ME_1.name){

                evo1Dict = dict

            }
            else if (mapMon.evolution.name == MonsterEvolutionOuterClass.MonsterEvolution.ME_2.name){

                evo2Dict = dict
            }

            else if (mapMon.evolution.name == MonsterEvolutionOuterClass.MonsterEvolution.ME_3.name){

                val mon = GetMonster(dict.monsterUid, 60, 0, MonsterGradeOuterClass.MonsterGrade.MG_6, MonsterStatWeightTypeOuterClass.MonsterStatWeightType.MS_Normal)

                val oldHp : Float = maxStat["hp"] as Float
                val oldAtk : Float = maxStat["atk"] as Float
                val oldDef : Float = maxStat["def"] as Float
                val oldHeal : Float = maxStat["heal"] as Float
                val oldCritDmg : Float = maxStat["crit_dmg"] as Float
                val oldCritRate : Float = maxStat["crit_rate"] as Float
                val oldResist : Float = maxStat["resist"] as Float

                val oldMinHp : Float = minStat["hp"] as Float
                val oldMinAtk : Float = minStat["atk"] as Float
                val oldMinDef : Float = minStat["def"] as Float
                val oldMinHeal : Float = minStat["heal"] as Float
                val oldMinCritDmg : Float = minStat["crit_dmg"] as Float
                val oldMinCritRate : Float = minStat["crit_rate"] as Float
                val oldMinResist : Float = minStat["resist"] as Float


                val newHp : Float = mon["hp"] as Float
                val newAtk : Float = mon["atk"] as Float
                val newDef : Float = mon["def"] as Float
                val newHeal : Float = mon["heal"] as Float
                val newCritDmg : Float = mon["crit_dmg"] as Float
                val newCritRate : Float = mon["crit_rate"] as Float
                val newResist : Float = mon["resist"] as Float



                GetMaxMin ("max", maxStat, "hp", oldHp, newHp)
                GetMaxMin ("max", maxStat, "atk", oldAtk, newAtk)
                GetMaxMin ("max", maxStat, "def", oldDef, newDef)
                GetMaxMin ("max", maxStat, "heal", oldHeal, newHeal)
                GetMaxMin ("max", maxStat, "crit_dmg", oldCritDmg, newCritDmg)
                GetMaxMin ("max", maxStat, "crit_rate", oldCritRate, newCritRate)
                GetMaxMin ("max", maxStat, "resist", oldResist, newResist)

                GetMaxMin ("min", minStat, "hp", oldMinHp, newHp)
                GetMaxMin ("min", minStat, "atk", oldMinAtk, newAtk)
                GetMaxMin ("min", minStat, "def", oldMinDef, newDef)
                GetMaxMin ("min", minStat, "heal", oldMinHeal, newHeal)
                GetMaxMin ("min", minStat, "crit_dmg", oldMinCritDmg, newCritDmg)
                GetMaxMin ("min", minStat, "crit_rate", oldMinCritRate, newCritRate)
                GetMaxMin ("min", minStat, "resist", oldMinResist, newResist)

                val resName = mapMonster[dict.monsterUid]!!.firstEvolutionResourceName

                val monEvoGroup = MonsterEvolutionGroup(resName, evo1Dict, evo2Dict, dict)

                if(!existWriteMapDictName) {
                    protoHelper.WriteMapDictName(context, monEvoGroup)
                }


                mapDictName.put(resName, monEvoGroup )
                mapDictName2.put(resName, monEvoGroup )
                mapDictName3.put(resName, monEvoGroup )

            }
        }


        difStat.put("hp", DifMaxMin ("hp"))
        difStat.put("atk", DifMaxMin ("atk"))
        difStat.put("def", DifMaxMin ("def"))
        difStat.put("heal", DifMaxMin ("heal"))
        difStat.put("crit_dmg", DifMaxMin("crit_dmg"))
        difStat.put("crit_rate", DifMaxMin("crit_rate"))
        difStat.put("resist", DifMaxMin("resist"))

        CalBar()

    }



    fun GetMaxMin (case: String, hashMap: HashMap<String, Float>, key: String, old: Float, new: Float  ) {
        when (case) {
            "max" -> {
                if (old < new) {
                    hashMap.put(key, new)
                }
            }
            "min" -> {
                if (old > new) {
                    hashMap.put(key, new)
                }
            }
        }
    }


    fun DifMaxMin (key: String) : Float{
        return maxStat[key]!!.toFloat() - minStat[key]!!.toFloat()
    }

    fun CalBar (){


        for (dict: MsgDictItemOuterClass.MsgDictItem in listDictItem) {

            if (mapMonster[dict.monsterUid]!!.evolution.name == MonsterEvolutionOuterClass.MonsterEvolution.ME_3.name) {

                val mon = GetMonster(dict.monsterUid, 60, 0, MonsterGradeOuterClass.MonsterGrade.MG_6,
                        MonsterStatWeightTypeOuterClass.MonsterStatWeightType.MS_Normal)

                val barObjAstroguide = BarObject(
                        GetMonBarSize(mon["hp"]!!, "hp", barMaxSize),
                        GetMonBarSize(mon["atk"]!!, "atk", barMaxSize),
                        GetMonBarSize(mon["def"]!!, "def", barMaxSize),
                        GetMonBarSize(mon["heal"]!!, "heal", barMaxSize),
                        GetMonBarSize(mon["crit_dmg"]!!, "crit_dmg", barMaxSize),
                        GetMonBarSize(mon["crit_rate"]!!, "crit_rate", barMaxSize),
                        GetMonBarSize(mon["resist"]!!, "resist", barMaxSize)
                )

                val barObjDetail = BarObject(
                        GetMonBarSize(mon["hp"]!!, "hp", barMaxSizeDetail),
                        GetMonBarSize(mon["atk"]!!, "atk", barMaxSizeDetail),
                        GetMonBarSize(mon["def"]!!, "def", barMaxSizeDetail),
                        GetMonBarSize(mon["heal"]!!, "heal", barMaxSizeDetail),
                        GetMonBarSize(mon["crit_dmg"]!!, "crit_dmg", barMaxSizeDetail),
                        GetMonBarSize(mon["crit_rate"]!!, "crit_rate", barMaxSizeDetail),
                        GetMonBarSize(mon["resist"]!!, "resist", barMaxSizeDetail)

                )

                val barParent = BarObjectParent ( barObjAstroguide, barObjDetail)
//                Log.wtf("isMapDictName Exist", "mapDictName " + existWriteMapMonBar)
                if(!existWriteMapMonBar) {
                    protoHelper.WriteMapMonBar(context, dict.monsterUid, barParent, mon)
                }


                mapMonBar.put(dict.monsterUid, barParent )

            }
        }

    }


    fun GetMonBarSize ( curStat: Float, key: String, barMaxSize: Int ) : Float {

        val minSize: Float


        var retValue = (( curStat - minStat[key]!!.toFloat()) / difStat[key]!!.toFloat()) * barMaxSize.toFloat()

        if(key == "crit_rate" || key == "resist") {
            minSize =  0f
        } else {
            minSize = barMaxSize / 10f
        }

        if(retValue < minSize ) {
            retValue = minSize
        }

        return retValue



    }


    private fun SaveFileListToSharedPref(fileList: Set<String>, fileName: String) {

        val prefs = getSharedPreferences(fileName, Context.MODE_PRIVATE)
        val editor = prefs.edit()
        editor.clear()
        editor.putStringSet(keyFileList, fileList)

        editor.apply()

    }


    private fun copyAssets() {
        val assetManager = assets
        var files: Array<String> = arrayOf()
        try {
            files = assetManager.list("")

//            setFileList = java.util.HashSet(Arrays.asList(*files))

//            SaveFileListToSharedPref(setFileList, prefFileListName)

        } catch (e: IOException) {
//            Log.e("tag", "Failed to get asset file list.", e)
        }


        files
                .filter { it.contains(".webp")  || it.contains(".pb") }
                .forEach {

                    try {
                        val out: String = context.filesDir.toString() + "/"
                        val outFile = File(out, it.toLowerCase())

                        if(!outFile.exists()) {
//                            Log.wtf("file", "file " +it)
                            val input: InputStream = context.assets.open(it)
                            val outputStream: OutputStream = FileOutputStream(outFile)
                            input.use { input -> input.copyTo(outputStream) }
                        }


                    } catch (e: IOException) {
                        Log.e("tag", "Failed to copy asset file: " + it, e)
                    }
                }
    }

    private var setFileList: MutableSet<String>  = HashSet()
    private val prefFileListName = "FileList"
    private var keyFileList = "file_list"

    private fun CheckFirstRun() {

        val PREFS_NAME = "VersionChecker"
        val PREF_VERSION_CODE_KEY = "version_code"
        val DOESNT_EXIST = -1

        // Get current version code

        val currentVersionCode = BuildConfig.VERSION_CODE
//        val currentVersionCode = 15

//        Log.wtf("currentVersion", "currentVer " + currentVersionCode)

        // Get saved version code
        val prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val savedVersionCode = prefs.getInt(PREF_VERSION_CODE_KEY, DOESNT_EXIST)

        // Check for first run or upgrade
        when {
            currentVersionCode == savedVersionCode -> {
                // Normal Run
//                Log.wtf("normal", "normal")
                val sharedPreferences = context.getSharedPreferences(prefFileListName, Context.MODE_PRIVATE)
                setFileList = sharedPreferences.getStringSet(keyFileList, HashSet())
//                return
            }

            currentVersionCode > savedVersionCode -> {
//                Log.wtf("upgrade", "upgrade")
                // This is an upgrade
                val sharedPreferenceFile = File( context.filesDir.path + "/shared_prefs/" )
                val listFiles = sharedPreferenceFile.listFiles()

                if(listFiles != null) {
                    for (file in listFiles) {
                        if(!file.name.contains(Variables.SETTING_LANGUAGE)) {
                            file.delete()
                        }

                    }

                }


                protoHelper.DeleteExistingMap(context, "MapMonBar")
                protoHelper.DeleteExistingMap(context, "MapDictName")

                existWriteMapDictName = false
                existWriteMapMonBar = false

                clearApplicationData()
            }

            savedVersionCode == DOESNT_EXIST -> {
                // This is a new install (or the user cleared the shared preferences)
//                Log.wtf("new", "new")
                val sharedPreferenceFile = File(context.filesDir.path + "/shared_prefs/")
                val listFiles = sharedPreferenceFile.listFiles()
                if(listFiles != null) {
                    for (file in listFiles) {
                        file.delete()
                    }
                }


                protoHelper.DeleteExistingMap(context, "MapMonBar")
                protoHelper.DeleteExistingMap(context, "MapDictName")
                existWriteMapDictName = false
                existWriteMapMonBar = false

                clearApplicationData()

            }

            else -> {
//                Log.wtf("else", "else ")
            }

        }

        // Update the shared preferences with the current version code
        prefs.edit().putInt(PREF_VERSION_CODE_KEY, currentVersionCode).apply()

    }


    fun GetStringData(stringFile : String): MsgStringOuterClass.MsgString.Builder {
        val stringData = protoHelper.readStringData(stringFile, context)
        if (stringData.localStringsCount == 0) {
            stringData.mergeFrom(protoHelper.readStringDataFromAssets(stringFile, context))
        }
        return stringData
    }

    fun GetMonster (uid : Int,
                    lvl : Int,
                    awaken : Int,
                    grade: MonsterGradeOuterClass.MonsterGrade,
                    swt : MonsterStatWeightTypeOuterClass.MonsterStatWeightType,
                    needBarSize : Boolean = false, detailOrNot : Boolean = false ) : HashMap<String, Float> {

        val msgMon : MsgMonsterOuterClass.MsgMonster = mapMonster[uid]!!
        val hashMonster = hashMapOf<String, Float>()
        val monValue = MonsterValue(msgMon, grade, swt )

        val num : Float = monValue["atk"]!!
        val num2 : Float = monValue["def"]!!
        val num3 : Float = monValue["heal"]!!
        val num4 : Float = monValue["hp"]!!

        val num5 : Float = num * msgMon.incAttack
        val num6 : Float = num2 * msgMon.incDefence
        val num7 : Float = num3 * msgMon.incHeal
        val num8 : Float = num4 * msgMon.incHp
        val num9 : Int = lvl - 1

        val num10 = num + num5 * num9
        val num11 = num2 + num6 * num9
        val num12 = num3 + num7 * num9
        val num13 = num4 + num8 * num9

        hashMonster.put("atk" , num10)
        hashMonster.put("def" , num11)
        hashMonster.put("heal" , num12)
        hashMonster.put("hp" ,  num13)
        hashMonster.put("crit_dmg", msgMon.criticalDamage )
        hashMonster.put("crit_rate",  msgMon.criticalProb )
        hashMonster.put("resist", msgMon.statusEffectResistance )

        if(needBarSize) {

            if(detailOrNot) {
                hashMonster.put("barHp", mapMonBar[uid]!!.detailSize.hp)
                hashMonster.put("barAtk", mapMonBar[uid]!!.detailSize.atk)
                hashMonster.put("barDef", mapMonBar[uid]!!.detailSize.def)
                hashMonster.put("barHeal", mapMonBar[uid]!!.detailSize.heal)
                hashMonster.put("barCritDmg", mapMonBar[uid]!!.detailSize.critDmg)
                hashMonster.put("barCritRate", mapMonBar[uid]!!.detailSize.critRate)
                hashMonster.put("barResist", mapMonBar[uid]!!.detailSize.resist)


            } else {
                hashMonster.put("barHp", mapMonBar[uid]!!.astroguideSize.hp)
                hashMonster.put("barAtk", mapMonBar[uid]!!.astroguideSize.atk)
                hashMonster.put("barDef", mapMonBar[uid]!!.astroguideSize.def)
                hashMonster.put("barHeal", mapMonBar[uid]!!.astroguideSize.heal)
                hashMonster.put("barCritDmg", mapMonBar[uid]!!.astroguideSize.critDmg)
                hashMonster.put("barCritRate", mapMonBar[uid]!!.astroguideSize.critRate)
                hashMonster.put("barResist", mapMonBar[uid]!!.astroguideSize.resist)
            }



        }



        return hashMonster


    }


    fun MonsterValue (mon : MsgMonsterOuterClass.MsgMonster, grade : MonsterGradeOuterClass.MonsterGrade, swt : MonsterStatWeightTypeOuterClass.MonsterStatWeightType) : HashMap<String, Float> {
        val monValue = hashMapOf<String, Float>()

        val monsterType : MsgMonsterTypeOuterClass.MsgMonsterType = GetMonsterType(mon.evolution, swt, mon.defStatType)
        val monGradeWeight = GetMonsterGradeWeight(grade)

        var num : Float = monsterType.sp * monsterType.attackWeight
        var num2 : Float = monsterType.sp * monsterType.defenceWeight
        var num3 : Float = monsterType.sp * monsterType.healWeight
        var num4 : Float = monsterType.sp - (num + num2 + num3)

        num += mon.defAttack
        num2 += mon.defDefence
        num3 += mon.defHeal
        num4 += mon.defHp

        num += num * monGradeWeight
        num2 += num2 * monGradeWeight
        num3 += num3 * monGradeWeight
        num4 += num4 * monGradeWeight

        monValue.put ("atk", num )
        monValue.put ("def", num2 )
        monValue.put ("hp", num4 )
        monValue.put ("heal", num3 )

        return monValue
    }


    fun GetMonsterType (me : MonsterEvolutionOuterClass.MonsterEvolution, swt : MonsterStatWeightTypeOuterClass.MonsterStatWeightType, st : MonsterStatTypeOuterClass.MonsterStatType) : MsgMonsterTypeOuterClass.MsgMonsterType {
        val result =  mapType[GetMonsterTypeKey(me, swt,st)]

        return result!!

    }

    fun GetMonsterTypeKey (me : MonsterEvolutionOuterClass.MonsterEvolution, swt : MonsterStatWeightTypeOuterClass.MonsterStatWeightType, st : MonsterStatTypeOuterClass.MonsterStatType) : String {

        return String.format("%s_%s_%s", me.name, swt.name, st.name   )
    }

    fun GetMonsterGradeWeight ( grade : MonsterGradeOuterClass.MonsterGrade) : Float {

        val setting = GetSettingByStringUid(String.format("monster.grade%s.weight", grade.number))!!

        return setting.vFloat
    }

    fun GetSettingByStringUid (strUid : String) : MsgSettingOuterClass.MsgSetting? {

        val setting  = mapSetting[mapUid[strUid]!!.uid]

        return setting

    }


    private inner class ReadAllObject : AsyncTask<Void, Int, Int>() {
        var dialog : ProgressDialog = ProgressDialog(context)

        override fun doInBackground(vararg params: Void): Int? {


            LoadDB()


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

            StartActivity()

//            Bind()

            super.onPostExecute(result)
        }

    }


    fun clearApplicationData() {
        val cache = cacheDir
        val appDir = File(cache.parent)
        if (appDir.exists()) {
            val children = appDir.list()
            for (s in children  ) {
//                Log.wtf("ttt", "ss " + s)
                if (s != "lib"
//                        || s != Variables.SETTING_LANGUAGE
                        ) {
                    deleteDir(File(appDir, s))

                }
            }
        }
    }

    fun deleteDir(dir: File?): Boolean {
        if (dir != null && dir.isDirectory) {
            val children = dir.list()
            for (i in children.indices) {
                val success = deleteDir(File(dir, children[i]))
                if (!success) {
                    return false
                }
            }
        }

        return dir!!.delete()
    }





}