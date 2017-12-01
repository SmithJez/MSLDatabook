//package com.felania.monstersuperleaguedatabook.fragments
//
//import android.app.Fragment
//import android.os.Bundle
//import android.util.Log
//import android.view.*
//import android.widget.GridView
//import com.felania.monstersuperleaguedatabook.R
//import com.felania.monstersuperleaguedatabook.activities.MonDBActivity
//import com.felania.monstersuperleaguedatabook.adapters.GolemAdapter2
//import com.felania.monstersuperleaguedatabook.utils.RewardObj
//import com.felania.monstersuperleaguedatabook.utils.UtilFunctions
//import com.felania.monstersuperleaguedatabook.utils.Variables
//import com.felania.msldb.*
//import com.felania.msldb.MonsterRuneColorOuterClass.*
//import com.felania.msldb.MonsterRuneSlotShapeOuterClass.*
//import com.felania.msldb.MsgRandomItemOuterClass.*
//import com.felania.msldb.RewardGradeOuterClass.*
//import kotlinx.android.synthetic.main.fragment_golem.*
//import kotlinx.android.synthetic.main.grid_view_reward.*
//
//class GolemFragment : Fragment() {
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
//    var rewardList : MutableMap< Int, MutableMap<String, MutableList<RewardObj>>> = mutableMapOf()
//
//    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
//
//        val rootView = inflater!!.inflate(R.layout.fragment_golem, container, false)
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
//
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
//        val golemAdapter = GolemAdapter2(activity, listSubStage, rewardList, this)
//
//
//
//        lvGolem2.setAdapter(golemAdapter)
//        lvGolem2.setGroupIndicator(resources. getDrawable( R.drawable.group_indicator))
//
//
//        lvGolem2.setOnGroupClickListener { _, v, itemPosition, _ ->
//            if( lvGolem2.isGroupExpanded(itemPosition)  ) {
//                lvGolem2.collapseGroup(itemPosition)
//            } else {
//                lvGolem2.expandGroup(itemPosition)
//            }
//
//            true
//        }
//
//
//    }
//
//
//    fun dungeonList() : List<String> = listOf(
//            UtilFunctions.GetStringByString( mapString, mapUid, Variables.STRING_DUNGEON_INFO),
////            activity.getString(R.string.enemies),
//            UtilFunctions.GetStringByString( mapString, mapUid, Variables.STRING_REWARDS)
//    )
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
//            rewardList.put( list.index,  AccommurateReward(mapDungeonSubStage[list.value]!!.reward))
//        }
//
//
//    }
//
//
//    fun GetRewardList (uid: Int): MutableList<MsgRandomItemOuterClass.MsgRandomItem> {
////Log.wtf("uid", "uid " + uid)
//        val reward = mapDungeonSubStage[uid]!!.reward
//
//        val randomList : MsgRandomOuterClass.MsgRandom  = mapRandom[reward]!!
//
//        val itemList = randomList.itemsList
//
//        val itemMap = mutableListOf< MsgRandomItemOuterClass.MsgRandomItem>()
//
//
//        for(item in itemList) {
//            if(item.prob > 0) {
//                itemMap.add(item)
//            }
//        }
//        return itemMap
//
//
//
//    }
//
//    fun GetRuneByUid (uid: Int) : MsgRuneOuterClass.MsgRune {
//
//        return mapRune[uid]!!
//
//    }
//
//    fun AccommurateReward(uid: Int): MutableMap<String, MutableList<RewardObj>> {
//
//
//        val randoms  = mapRandom[uid]!!
//
//        val itemList = randoms.itemsList
//
//
//        val normalMap = mutableMapOf<String, Float>()
//        val rareMap = mutableMapOf<String, Float>()
//        val superRareMap = mutableMapOf<String, Float>()
//
//
//
//        for (item in itemList) {
//
//            if(item.prob > 0) {
//
//                val rewardType = item.type
//                val rewardGrade = item.grade
//
//                when (rewardGrade) {
//                    RewardGrade.RG_Normal -> {
//                        when(rewardType) {
//                            MsgRandomItem.DataType.Rune -> {
//
//                                val runeShape = MonsterRuneSlotShape.forNumber(mapRune[item.uid]!!.shape)
//                                val runeColor = MonsterRuneColor.forNumber(mapRune[item.uid]!!.color)
//                                val runeStar = item.amount.toString()
//
//                                val key  = "{0}|{1}|{2}".replace( "{0}", runeShape.name).replace("{1}", runeColor.name).replace("{2}", runeStar)
//
//                                var prob = item.prob
//
//                                if( normalMap[key] != null) {
//                                    var ori = normalMap[key]!!
//                                    ori += prob
//                                    normalMap.put( key, ori  )
//                                } else {
//                                    normalMap.put( key, prob  )
//                                }
//
//                            }
//
//                            MsgRandomItem.DataType.MonsterEgg -> {
//
//                                val key  = "{0}|{1}|{2}".replace( "{0}","egg").replace("{1}", item.uid.toString())
//                                var prob = item.prob
//                                if( normalMap[key] != null) {
//                                    var ori = normalMap[key]!!
//                                    ori += prob
//                                    normalMap.put( key, ori  )
//                                } else {
//                                    normalMap.put( key, prob  )
//                                }
//
//                            }
//
//
//                            MsgRandomItem.DataType.BeyondStone -> {
//                                val runeStar = item.amount.toString()
//                                val key  = "{0}|{1}|{2}".replace( "{0}","beyond").replace("{1}", item.uid.toString()).replace( "{2}",  runeStar )
//                                var prob = item.prob
//                                if( normalMap[key] != null) {
//                                    var ori = normalMap[key]!!
//                                    ori += prob
//                                    normalMap.put( key, ori  )
//                                } else {
//                                    normalMap.put( key, prob  )
//                                }
//
//
//                            }
//
//                            else -> {
//                                Log.wtf("Smith", "reward_normal_???? " + item.uid)
//                            }
//                        }
//                    }
//
//                    RewardGrade.RG_Rare -> {
//                        when(rewardType) {
//                            MsgRandomItem.DataType.Rune -> {
//                                val runeShape = MonsterRuneSlotShape.forNumber(mapRune[item.uid]!!.shape)
//                                val runeColor = MonsterRuneColor.forNumber(mapRune[item.uid]!!.color)
//                                val runeStar = item.amount.toString()
//
////                                Log.wtf("ss","wqe " + runeColor.name)
//
//                                val key  = "{0}|{1}|{2}".replace( "{0}", runeShape.name).replace("{1}", runeColor.name).replace("{2}", runeStar)
//
//                                var prob = item.prob
//
//                                if( rareMap[key] != null) {
//                                    var ori = rareMap[key]!!
//                                    ori += prob
//                                    rareMap.put( key, ori  )
//                                } else {
//                                    rareMap.put( key, prob  )
//                                }
//
////                                Log.wtf("ss","wqwqfwefe " + rareMap.size)
//
//                            }
//
//                            MsgRandomItem.DataType.MonsterEgg -> {
//                                val key  = "{0}|{1}|{2}".replace( "{0}","egg").replace("{1}", item.uid.toString())
//                                var prob = item.prob
//                                if( rareMap[key] != null) {
//                                    var ori = rareMap[key]!!
//                                    ori += prob
//                                    rareMap.put( key, ori  )
//                                } else {
//                                    rareMap.put( key, prob  )
//                                }
//                            }
//
//                            MsgRandomItem.DataType.BeyondStone -> {
//                                val runeStar = item.amount.toString()
//                                val key = "{0}|{1}|{2}".replace("{0}", "beyond").replace("{1}", item.uid.toString()).replace("{2}", runeStar)
//                                var prob = item.prob
//                                if (normalMap[key] != null) {
//                                    var ori = normalMap[key]!!
//                                    ori += prob
//                                    normalMap.put(key, ori)
//                                } else {
//                                    normalMap.put(key, prob)
//                                }
//                            }
//
//                            else -> {
//                                Log.wtf("Smith", "reward_rare_???? " + item.uid)
//                            }
//                        }
//                    }
//
//                    RewardGrade.RG_SuperRare -> {
//                        when(rewardType) {
//                            MsgRandomItem.DataType.Rune -> {
//                                val runeShape = MonsterRuneSlotShape.forNumber(mapRune[item.uid]!!.shape)
//                                val runeColor = MonsterRuneColor.forNumber(mapRune[item.uid]!!.color)
//                                val runeStar = item.amount.toString()
//
//                                val key  = "{0}|{1}|{2}".replace( "{0}", runeShape.name).replace("{1}", runeColor.name).replace("{2}", runeStar)
//
//                                var prob = item.prob
//
//                                if( superRareMap[key] != null) {
//                                    var ori = superRareMap[key]!!
//                                    ori += prob
//                                    superRareMap.put( key, ori  )
//                                } else {
//                                    superRareMap.put( key, prob  )
//                                }
//                            }
//
//                            MsgRandomItem.DataType.MonsterEgg -> {
//                                val key  = "{0}|{1}|{2}".replace( "{0}","egg").replace("{1}", item.uid.toString())
//                                var prob = item.prob
//                                if( superRareMap[key] != null) {
//                                    var ori = superRareMap[key]!!
//                                    ori += prob
//                                    superRareMap.put( key, ori  )
//                                } else {
//                                    superRareMap.put( key, prob  )
//                                }
//                            }
//
//                            MsgRandomItem.DataType.BeyondStone -> {
//                                val runeStar = item.amount.toString()
//                                val key = "{0}|{1}|{2}".replace("{0}", "beyond").replace("{1}", item.uid.toString()).replace("{2}", runeStar)
//                                var prob = item.prob
//                                if (normalMap[key] != null) {
//                                    var ori = normalMap[key]!!
//                                    ori += prob
//                                    normalMap.put(key, ori)
//                                } else {
//                                    normalMap.put(key, prob)
//                                }
//                            }
//
//                            else -> {
//                                Log.wtf("Smith", "reward_s_rare_???? " + item.uid)
//                            }
//                        }
//                    }
//
//                    else -> {
//                        Log.wtf("Smith", "reward_grade???? " + item.uid)
//                    }
//                }
//            }
//        }
//
//
////        normalMap =
//
//        val nor = SimplifiedShapeReward (SimplifiedColorReward(normalMap) )
//        val rar =  SimplifiedShapeReward (SimplifiedColorReward(rareMap) )
//        val sRar = SimplifiedShapeReward (SimplifiedColorReward(superRareMap) )
//
//
//
//
//        val normal = GetRewardListFromMap(nor)
//        val rare = GetRewardListFromMap(rar)
//        val superRare = GetRewardListFromMap(sRar)
//
//
//
//        val retMap = mutableMapOf<String, MutableList<RewardObj>>()
//
//        if(normal.size > 0) {
//            retMap.put ( "normal", normal  )
//        }
//
//
//        if(rare.size > 0) {
//            retMap.put ( "rare", rare )
//        }
//
//
//        if(superRare.size > 0) {
//            retMap.put ( "superRare", superRare)
//        }
//
//
//
//
//        return retMap
//
//    }
//
//
//    fun SimplifiedShapeReward (map: Map<String, Float>): MutableMap<String, Float> {
//        val newMap = mutableMapOf<String,Float>()
//
//        val tempMap = mutableMapOf<String,Int>()
//
//        val mapKey = mutableListOf<String>()
//
//
//        val map2 : MutableMap<String, Float> = map as MutableMap<String, Float>
//
//        for (gg in map) {
//
//            val splitKey = gg.key.split("|")
//
//            if (splitKey[0] == "egg") {
//                //Egg
//                newMap.put(gg.key, gg.value)
//
//            } else if (splitKey[0] == "beyond") {
//                //Beyond Stone
//                newMap.put(gg.key, gg.value)
//
//            }
//
//
//
//            else {
//
//                val newKey = splitKey[1] + "|" + splitKey[2]
//
//                if ( tempMap[newKey] != null   ) {
//
//                    var i = tempMap[newKey]!!
//                    i++
//                    tempMap.put(newKey,  i  )
//
//                } else {
//                    tempMap.put(newKey,  1  )
//                }
//            }
//        }
//
//
//        for (gg in tempMap) {
//
//
//
//            val splitKey = gg.key.split("|")
//
//            if (splitKey[0] != "egg" || splitKey[0] != "beyond" ) {
//
//                if ( gg.value == 3 ) {
//
//                    for (ee in map2) {
//
//                        val splitKey2 = ee.key.split("|")
//
//                        val ggKey = splitKey[0] + "|" + splitKey[1]
//                        val eeKey = splitKey2[1] + "|" + splitKey2[2]
//
//
////                        Log.wtf("oldkey" , "oldey " + ggKey + "|" + eeKey )
//
//
//                        if(ggKey == eeKey) {
//                            val newKey = "all" + "|" + eeKey
//
//                            if( newMap[newKey] != null ) {
//
//                                val newFloat = newMap[newKey]!! + ee.value
//                                newMap.put (newKey, newFloat)
//                            }
//                            else {
//                                newMap.put (newKey, ee.value)
//                            }
//
//                            mapKey.add(ee.key)
////                            map2.remove(ee.key)
//
//                        }
//                    }
//
//
//                }
//            }
//        }
//
//        for ( gg  in mapKey) {
//
//            map2.remove(gg)
//
//        }
//
//
//
//        newMap.putAll(map2)
//
//
//
//
//        return newMap
//
//    }
//
//
//    fun SimplifiedColorReward(map: Map<String, Float>): MutableMap<String, Float> {
//
//        val newMap = mutableMapOf<String,Float>()
//
//
//        val colorSet = mutableSetOf< Map.Entry<String,Float>  >()
//
//        for (gg in map) {
//
//            val splitKey = gg.key.split("|")
//
//            if (splitKey[0] == "egg") {
//                //Egg
//                newMap.put(gg.key, gg.value)
//
//            } else if (splitKey[0] == "beyond") {
//                //Beyond Stone
//                newMap.put(gg.key, gg.value)
//
//            }
//
//
//
//            else {
//                //Rune
//
//                val shape = MonsterRuneSlotShape.valueOf(splitKey[0])
//                val color = MonsterRuneColor.valueOf(splitKey[1])
//
//                if(Variables.RUNE_RAINBOW.contains(color)) {
//
//                    val key = splitKey[0] + "|rainbow|" + splitKey[2]
//
//                    if(newMap[key] != null) {
//                        val newFloat = newMap[key]!! + gg.value
//                        newMap.put (key, newFloat)
//                    } else {
//                        newMap.put(key, gg.value)
//                    }
//                } else if (Variables.RUNE_DRAGON.contains(color)  ) {
//
//                    val key = splitKey[0] + "|dragon|" + splitKey[2]
//
//                    if(newMap[key] != null) {
//                        val newFloat = newMap[key]!! + gg.value
//                        newMap.put (key, newFloat)
//                    } else {
//                        newMap.put(key, gg.value)
//                    }
//
//                } else {
//                    val key = splitKey[0] + "|dual|" + splitKey[2]
//
//                    if(newMap[key] != null) {
//                        val newFloat = newMap[key]!! + gg.value
//                        newMap.put (key, newFloat)
//                    } else {
//                        newMap.put(key, gg.value)
//                    }
//
//                }
//
//            }
//        }
//
//
//
//
//
//        return newMap
//
//    }
//
//
//
//    fun GetRewardListFromMap (map: Map<String, Float>): MutableList<RewardObj> {
//
//        val rewardList = mutableListOf<RewardObj>()
//
////        Log.wtf("sasa", "sadsa " + map.size)
//
//        for (gg in map) {
//
//            val splitKey = gg.key.split("|")
//
//            if (splitKey[0] == "egg") {
//                //Egg
//                val itemUid = mapItem[splitKey[1].toInt()]
//                val reward = RewardObj( itemUid,  gg.value )
//
//                rewardList.add(reward)
//
//            } else if (splitKey[0] == "beyond") {
//                //beyond
//                val amount = splitKey[2].toInt()
//                val itemUid = mapItem[splitKey[1].toInt()]
//                val reward = RewardObj( itemUid, amount,   gg.value )
//
//                rewardList.add(reward)
//
//            }
//
//
//            else {
//                //Rune
//                val shape = if (splitKey[0] == "all") {
//                    "all"
//                } else {
//                    MonsterRuneSlotShape.valueOf(splitKey[0]).name
//                }
//
//
//                val color = if( splitKey[1] == "rainbow") {
//                    "rainbow"
//                } else if (splitKey[1] == "dragon" ) {
//                    "dragon"
//                } else if (splitKey[1] == "dual" ) {
//                    "dual"
//                } else {
//                    MonsterRuneColor.valueOf(splitKey[1]).name
//                }
//
//
//                val amount = splitKey[2].toInt()
//
//                val reward = RewardObj(shape, color , amount, gg.value)
//                rewardList.add(reward)
//            }
//        }
//
//        return rewardList
//
//
//    }
//
//
//
//    fun GetProperRuneColor (colorSet: MutableSet<MonsterRuneColor>, shapeSet: MutableSet<MonsterRuneSlotShape>) {
//
//        var shape : MonsterRuneSlotShape
//
//        if(shapeSet.size > 1) {
//            shape = MonsterRuneSlotShape.MRSS_All
//
//        } else {
//
//            val itr = shapeSet.iterator()
//            while(itr.hasNext()) {
//                val next = itr.next()
//                shape = next
//            }
//        }
//
//
//        for (rainbow in Variables.RUNE_RAINBOW) {
//
//
//
//
//        }
//
//    }
//
//    fun GetRuneResource () {
//
//
//
//
//    }
//
//
//    fun GetRuneEffectByUid (rune: MsgRuneOuterClass.MsgRune): MutableList<MsgRuneEffectOuterClass.MsgRuneEffect> {
//
//        return rune.runeEffectsList!!
//    }
//
//
//
//    fun GetStageTitle (uid: Int): String {
//
//        return mapString[mapDungeonSubStage[uid]!!.name]!!
//
//
//    }
//
//    private fun GetRequiredMonster (battleList: List<MsgStageBattleOuterClass.MsgStageBattle>): MutableList<Int> {
//
//        val reqMonList = mutableListOf<Int>()
//        battleList.mapTo(reqMonList) { it.requiredMonster }
//
//        return reqMonList
//
//    }
//
//    private fun GetStageMonsterByUid(uid: List<Int>): MutableList<MsgStageMonsterOuterClass.MsgStageMonster> {
//
//        val stageMonList = mutableListOf<MsgStageMonsterOuterClass.MsgStageMonster>()
//
//        uid.mapTo(stageMonList) { mapDungeonStageMonster[it]!! }
//
//
//        return stageMonList
//    }
//
//    fun GetMonsterGroup (battleList: List<MsgStageBattleOuterClass.MsgStageBattle>): MutableList<Int> {
//        val monGroup = mutableListOf<Int>()
//
//
//        battleList.mapTo(monGroup) { it.monsterGroup}
//
//
//        return monGroup
//
//
//    }
//
//
//    fun GetRoundString (key: String): String {
//
//        return UtilFunctions.GetStringByString(mapString, mapUid, key)
//    }
//
//
//    fun GetBattleRound (uid: Int): MutableList<MsgStageBattleOuterClass.MsgStageBattle>? {
//        val battleList = mapDungeonSubStage[uid]!!.battlesList
//
//
//        return battleList
//
//    }
//
//
//
//    fun GetMonDungeonStageFromUid(uid: Int) : MsgStageMonsterOuterClass.MsgStageMonster {
//        return mapDungeonStageMonster[uid]!!
//    }
//
//
//    fun GetMonStageFromUid(uid: Int) : MsgStageMonsterOuterClass.MsgStageMonster {
//        return mapStageMonster[uid]!!
//    }
//
//
//    fun GetBattleList (uid: Int): MutableList<MsgStageBattleOuterClass.MsgStageBattle> {
//        return mapDungeonSubStage[uid]!!.battlesList!!
//    }
//
//
//    fun GetMonsterInGroupFromList (uid: Int, round: Int): MutableList<MsgUidAndProbOuterClass.MsgUidAndProb> {
//        val battleList = mapDungeonSubStage[uid]!!.battlesList
//
//        val monGroup = GetMonsterGroup(battleList)
//
//
//        return mapStageMonsterGroup[ monGroup[round]]!!.monstersList
//
//    }
//
//    fun GetMonsterFromMonDungeonStage(uid: Int): MsgMonsterOuterClass.MsgMonster {
//
//        val monStage = mapDungeonStageMonster[uid]!!.monster
//
//        return mapMonster[monStage]!!
//    }
//
//    fun GetMonsterFromMonStage(uid: Int): MsgMonsterOuterClass.MsgMonster {
//
//        val monStage = mapStageMonster[uid]!!.monster
//
//        return mapMonster[monStage]!!
//    }
//
//
//    fun GetMinionGradeFromDungeonStageMon(uid: Int): Int {
//        val monStage =  mapDungeonStageMonster[uid]!!.uid
//        return UtilFunctions.GetGradeResourceByStageMon(mapDungeonStageMonster, monStage)
//    }
//
//    fun GetMinionElementFromDungeonStageMon(uid: Int) : Int {
//        val monStage =  mapDungeonStageMonster[uid]!!.monster
//        return UtilFunctions.GetElementResourceByMonUid(mapMonster, monStage)
//    }
//
//    fun GetMinionGradeFromStageMon(uid: Int): Int {
//        val monStage =  mapStageMonster[uid]!!.uid
//        return UtilFunctions.GetGradeResourceByStageMon(mapStageMonster, monStage)
//    }
//
//    fun GetMinionElementFromStageMon(uid: Int) : Int {
//        val monStage =  mapStageMonster[uid]!!.monster
//        return UtilFunctions.GetElementResourceByMonUid(mapMonster, monStage)
//    }
//
//
//    fun GetGolemGrade (uid: Int): Int {
//        val battleList = mapDungeonSubStage[uid]!!.battlesList
//
//        val monGroup = GetMonsterGroup(battleList)
//
//
//        val bossGroup =  monGroup.size - 1
//
//        val boss = mapStageMonsterGroup[ monGroup[bossGroup]]!!.monstersList[0].uid
//
//        return UtilFunctions.GetGradeResourceByStageMon(mapDungeonStageMonster, boss)
//
//    }
//
//    fun GetGolemElementFlame (uid: Int): Int {
//
//        val battleList = mapDungeonSubStage[uid]!!.battlesList
//
//
//        val monGroup = GetMonsterGroup(battleList)
//
//        val bossGroup =  monGroup.size - 1
//
//        val boss = mapDungeonStageMonster[mapStageMonsterGroup[ monGroup[bossGroup]]!!.monstersList[0].uid]!!.monster
//
//
//        return UtilFunctions.GetElementResourceByMonUid(mapMonster, boss)
//
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setHasOptionsMenu(true)
//    }
//
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
//    fun GetItemFromUid (uid: Int) : MsgItemOuterClass.MsgItem {
//
//        return mapItem[uid]!!
//
//    }
//
//
//
//}