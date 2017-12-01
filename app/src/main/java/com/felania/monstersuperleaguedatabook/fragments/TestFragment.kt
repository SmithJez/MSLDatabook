//package com.felania.monstersuperleaguedatabook.fragments
//
//import android.app.Fragment
//import android.os.Bundle
//import android.support.v7.widget.LinearLayoutManager
//import android.text.Html
//import android.util.Log
//import android.view.*
//import android.widget.TextView
//import com.felania.monstersuperleaguedatabook.R
//import com.felania.monstersuperleaguedatabook.activities.MonDBActivity
//import com.felania.monstersuperleaguedatabook.adapters.GolemAdapter2
//import com.felania.monstersuperleaguedatabook.adapters.TestAdapter
//import com.felania.monstersuperleaguedatabook.utils.RewardObj
//import com.felania.monstersuperleaguedatabook.utils.StageMonsterStatObj
//import com.felania.monstersuperleaguedatabook.utils.UtilFunctions
//import com.felania.monstersuperleaguedatabook.utils.Variables
//import com.felania.msldb.*
//import kotlinx.android.synthetic.main.fragment_clan.*
//import kotlinx.android.synthetic.main.fragment_golem.*
//import kotlinx.android.synthetic.main.fragment_test.*
//
///**
// * Created by SmithJez-PC on 9/15/2017.
// */
//class TestFragment : Fragment()  {
//
//    lateinit var gameData : MsgGameDataOuterClass.MsgGameDataOrBuilder
//    lateinit var monDb : MonDBActivity
//
//    var listDungeonStageMonster = listOf<MsgStageMonsterOuterClass.MsgStageMonster>()
//    var listStageMonster = listOf<MsgStageMonsterOuterClass.MsgStageMonster>()
//    var listStageMonsterGroup = listOf<MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup>()
//    var listDungeonSubStage = listOf<MsgDungeonSubStageOuterClass.MsgDungeonSubStage>()
//    var listDungeonStage = listOf<MsgDungeonStageOuterClass.MsgDungeonStage>()
//
//    var listRandom = listOf<MsgRandomOuterClass.MsgRandom>()
//    var listRune = listOf<MsgRuneOuterClass.MsgRune>()
//
//    var listItem = listOf<MsgItemOuterClass.MsgItem>()
//
//    var mapItem = mutableMapOf<Int, MsgItemOuterClass.MsgItem>()
//    var mapRandom = mutableMapOf<Int, MsgRandomOuterClass.MsgRandom>()
//    var mapRune = mutableMapOf<Int, MsgRuneOuterClass.MsgRune>()
//    var mapDungeonStageMonster = mutableMapOf<Int, MsgStageMonsterOuterClass.MsgStageMonster>()
//    var mapStageMonster = mutableMapOf<Int, MsgStageMonsterOuterClass.MsgStageMonster>()
//
//    var mapStageMonsterGroup = mutableMapOf<Int, MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup>()
//    var mapDungeonSubStage = mutableMapOf<Int, MsgDungeonSubStageOuterClass.MsgDungeonSubStage>()
//    var mapDungeonStage = mutableMapOf<Int, MsgDungeonStageOuterClass.MsgDungeonStage>()
//
//    var listSub = mutableListOf<Int>()
//    var listSubStage = mutableListOf<MsgDungeonSubStageOuterClass.MsgDungeonSubStage>()
//
//
//    var mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster> = hashMapOf()
//
//
//    var mapUid: Map<String, MsgUidOuterClass.MsgUid> = hashMapOf()
//    var mapString: Map<Int, String> = hashMapOf()
//    var mapEffect : Map<Int, MsgStatusEffectOuterClass.MsgStatusEffect> = hashMapOf()
//
//
//    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
//
//        val rootView = inflater!!.inflate(R.layout.fragment_test, container, false)
//
//        return rootView
//    }
//
//    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        monDb = activity as MonDBActivity
//
//        gameData = monDb.gameData
//        mapMonster = monDb.mapMonster
//        mapUid = monDb.mapUid
//        mapString = monDb.mapString
//        mapEffect = monDb.mapEffect
//
//
//
//        InitGolemData()
//
//
//
//        val golemAdapter = TestAdapter(activity, listSubStage, this)
//
//        lvTest.layoutManager = LinearLayoutManager(activity)
//
//        lvTest.adapter = golemAdapter
//
//
//
//
//    }
//
//
//    fun InitGolemData () {
//        listDungeonStageMonster = gameData.dungeonMonstersList
//        listStageMonsterGroup = gameData.dungeonMonsterGroupsList
//        listDungeonSubStage = gameData.dungeonSubstagesList
//        listDungeonStage = gameData.dungeonStagesList
//        listStageMonster = gameData.stageMonstersList
//
//
//
//        listRandom = gameData.randomsList
//        listRune = gameData.runesList
//
//        listItem = gameData.itemsList
//
//
//        for (item in listItem) {
//            mapItem.put(item.uid, item)
//        }
//
//
//        for(rune in listRune) {
//            mapRune.put (rune.uid, rune)
//        }
//
//        for (random in listRandom) {
//            mapRandom.put (random.uid, random)
//        }
//
//        for (stageMonster in listDungeonStageMonster) {
//            mapDungeonStageMonster.put (stageMonster.uid, stageMonster)
//        }
//
//        for (stageMonster in listStageMonster) {
//            mapStageMonster.put (stageMonster.uid, stageMonster)
//        }
//
//
//
//        for (stageMonsterGroup in listStageMonsterGroup) {
//            mapStageMonsterGroup.put (stageMonsterGroup.uid, stageMonsterGroup)
//        }
//
//        for (dungeonSubStage in listDungeonSubStage) {
//            mapDungeonSubStage.put (dungeonSubStage.uid, dungeonSubStage)
//        }
//
//        listDungeonStage
////                .filter { it.battleType == BattleTypeOuterClass.BattleType.B_AllDayRuneDungeon }
////                .filter { it.battleType == BattleTypeOuterClass.BattleType.B_DayRuneDungeon}
////                .filter { it.battleType == BattleTypeOuterClass.BattleType.B_DayBeyondStoneDungeon}
////                .filter { it.battleType == BattleTypeOuterClass.BattleType.B_ColossusDungeon}
//                //Dark Stone
////                .filter { it.uid == 849882661}
//                //Fire Stone
////                .filter { it.uid == 1406012737}
//                //Water Stone
////                .filter {it.uid == 1275356263}
//                //Wood Stone
////                .filter {it.uid == 1433012794}
//                //Light Stone
////                .filter {it.uid == 868914246}
//
//                //All
////                .filter { it.uid == 86846346}
//                //Sat
////                .filter { it.uid == 2017392287}
//                //Sun
//                .filter { it.uid == 2005392301}
//
//
//                .forEach {
//                    mapDungeonStage.put (it.uid, it)
//
//                    listSub = it.substagesList
//
//
//                }
//
//
//
//        for (list in listSub.withIndex()) {
//            listSubStage.add (   mapDungeonSubStage[list.value]!!    )
//        }
//
//
//    }
//
//    fun GetRequiredMonster (battleList: List<MsgStageBattleOuterClass.MsgStageBattle>): MutableList<Int> {
//
//        val reqMonList = mutableListOf<Int>()
//        battleList.mapTo(reqMonList) { it.requiredMonster }
//
//        return reqMonList
//
//    }
//
//    fun GetStageMonsterByUid(uid: List<Int>): MutableList<MsgStageMonsterOuterClass.MsgStageMonster> {
//
//        val stageMonList = mutableListOf<MsgStageMonsterOuterClass.MsgStageMonster>()
//        uid.filter { it > 0 } .mapTo(stageMonList) { mapStageMonster[it]!! }
//        return stageMonList
//    }
//
//
//    fun GetTitanStat (uid: Int): StageMonsterStatObj {
//
//        val battleList = mapDungeonSubStage[uid]!!.battlesList
//
//        val reqMonList = GetRequiredMonster(battleList)
//
//        val stageMonList = GetStageMonsterByUid(reqMonList)
//
//        return UtilFunctions.GetStageMonsterStat(stageMonList[0],  mapMonster)
//
//    }
//
//    fun GetTitanExtraStat(uid: Int): MutableMap<String, Float> {
//        val battleList = mapDungeonSubStage[uid]!!.battlesList
//        val reqMonList = GetRequiredMonster(battleList)
//        val stageMonList = GetStageMonsterByUid(reqMonList)
//
//        val monster = mapMonster[stageMonList[0].monster]!!
//
//        return UtilFunctions.GetStageMonsterExtraStat(stageMonList[0], monster)
//
//
//    }
//
//    fun GetTitanMonsterBySubStageUid (uid: Int ): MsgMonsterOuterClass.MsgMonster {
//
//
//        val battleList = mapDungeonSubStage[uid]!!.battlesList
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
//
//    fun GetTitanGrade (uid: Int): Int {
//        val battleList = mapDungeonSubStage[uid]!!.battlesList
//        val reqMonList = GetRequiredMonster(battleList)
//        val stageMonList = GetStageMonsterByUid(reqMonList)
//
//        return UtilFunctions.GetGradeResourceByStageMon(mapStageMonster, stageMonList[0].uid)
//    }
//
//    fun GetTitanElementFlame (uid: Int): Int {
//
//        val battleList = mapDungeonSubStage[uid]!!.battlesList
//        val reqMonList = GetRequiredMonster(battleList)
//        val stageMonList = GetStageMonsterByUid(reqMonList)
//
//        return UtilFunctions.GetElementResourceByMonUid(mapMonster, stageMonList[0].monster)
//
//    }
//
//
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
//
//    fun GetTitanSkillEffect (uid: Int): MutableMap<String, MsgStatusEffectOuterClass.MsgStatusEffect> {
//        val battleList = mapDungeonSubStage[uid]!!.battlesList
//        val reqMonList = GetRequiredMonster(battleList)
//        val stageMonList = GetStageMonsterByUid(reqMonList)
//
////        val monster = mapMonster[stageMonList[0].monster]!!
//
//        val defaultSkillEffect = UtilFunctions.GetSkillEffect(mapEffect, mapMonster, stageMonList[0].monster)["default"] as MsgStatusEffectOuterClass.MsgStatusEffect
//        val activeSkillEffect = UtilFunctions.GetSkillEffect(mapEffect, mapMonster, stageMonList[0].monster)["active"] as MsgStatusEffectOuterClass.MsgStatusEffect
//
//        val retMap : MutableMap<String, MsgStatusEffectOuterClass.MsgStatusEffect> = mutableMapOf()
//
//        retMap.put(Variables.SKILL_DEFAULT, defaultSkillEffect)
//        retMap.put(Variables.SKILL_ACTIVE, activeSkillEffect)
//
//        return retMap
//
//    }
//
//
//    fun GetStringByUid (uid: Int): String {
//        return mapString[uid]!!
//    }
//
//    fun GetTitanEffectDesc (defTv: TextView, actTv: TextView, defaultSkillEffect: MsgStatusEffectOuterClass.MsgStatusEffect, activeSkillEffect: MsgStatusEffectOuterClass.MsgStatusEffect) {
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
//
//}