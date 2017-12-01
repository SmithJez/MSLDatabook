package com.felania.monstersuperleaguedatabook.utils

import android.content.Context
import android.os.Build
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.protobuf.ProtobufHelper
import com.felania.msldb.*
import com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType
import com.felania.msldb.MonsterGradeOuterClass.MonsterGrade
import com.felania.msldb.MonsterStatTypeOuterClass.MonsterStatType
import com.felania.msldb.MsgGameDataOuterClass.*
import java.util.*

class CentralDB constructor(context: Context)  {



    var context = context
    var protoHelper = ProtobufHelper()
    lateinit var stringDB : MsgStringOuterClass.MsgString.Builder


    init {
        LoadAll()
    }

    fun LoadAll() {
        val locale : Locale

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            locale = context.resources.configuration.locales.get(0)
        } else {
            locale = context.resources.configuration.locale
        }


        val localeMap: HashMap<String, String> = Variables.localeToStringMap

        var stringFile = localeMap[locale.toString()]

        if( stringFile == null) {
            stringFile = Variables.STRING_EN
        }



        stringDB = GetStringData(stringFile)
//        gameData = GetData(Variables.GAME_DB)
    }


    var listUid = protoHelper.ReadUids(MsgGameData.UIDS_FIELD_NUMBER, context)
    var listMonster =  protoHelper.ReadMonsters(MsgGameData.MONSTERS_FIELD_NUMBER, context)
    var listDictItem = protoHelper.ReadDictItem(MsgGameData.MONSTER_DICT_FIELD_NUMBER, context)
    var listType = protoHelper.ReadMonsterType(MsgGameData.MONSTER_TYPES_FIELD_NUMBER, context)
    var listSetting = protoHelper.ReadSetting(MsgGameData.SETTINGS_FIELD_NUMBER, context)
    var listSkill = protoHelper.ReadSkill(MsgGameData.MONSTER_SKILLS_FIELD_NUMBER, context)
    var listEffect = protoHelper.ReadEffect(MsgGameData.STATUS_EFFECTS_FIELD_NUMBER, context)

    var listString: MutableList<MsgStringOuterClass.MsgLocalizedString> = stringDB.localStringsList

    var listSkillUpgrade = protoHelper.ReadSkillUpgrade(MsgGameData.MONSTER_UPGRADE_SKILLS_FIELD_NUMBER, context)





    var mapString = listString.associateBy( {it.uid}, {it.text})
    var mapUid = listUid.associateBy ({ it.strUid }, {it})
    var mapMonster = listMonster.associateBy ({ it.uid } , {it} )
//    var mapType = listType.associateBy ({ String.format("%s_%s_%s",
//            it.evolution.name, it.weightType.name, it.type.name ) } , { it } )
//    var mapSetting = listSetting.associateBy ({ it.uid  } , {it})
    var mapSkill = listSkill.associateBy( { it.uid} , {it} )
    var mapEffect = listEffect.associateBy( {it.uid } , {it})
    var mapSkillUpgrade = listSkillUpgrade.associateBy ({ it.uid }, {it})


//    fun mapPureElement (): MutableList<MonsterElementType> {
//
//        val list : MutableList<MonsterElementType> = mutableListOf()
//        listMonster.distinctBy { it.element }
//                .forEach {
//                    list.add(it.element)
//                }
//        return list
//    }


    fun mapElement (): MutableList<ElementObject> {

        val list : MutableList<ElementObject> = mutableListOf()

        listMonster.distinctBy { it.element }
                .forEach {
                    when (it.element) {
                        MonsterElementType.ME_Fire -> {
                            val eleObj = ElementObject(it.element, R.drawable.element_fire2, mapString[mapUid["str.monster.element.fire"]!!.uid]!!)
                            list.add(eleObj)
                        }
                        MonsterElementType.ME_Water -> {
                            val eleObj = ElementObject(it.element, R.drawable.element_water2, mapString[mapUid["str.monster.element.water"]!!.uid]!!)
                            list.add(eleObj)
                        }
                        MonsterElementType.ME_Tree -> {
                            val eleObj = ElementObject(it.element, R.drawable.element_wood2, mapString[mapUid["str.monster.element.tree"]!!.uid]!!)
                            list.add(eleObj)
                        }
                        MonsterElementType.ME_Light -> {
                            val eleObj = ElementObject(it.element, R.drawable.element_light2, mapString[mapUid["str.monster.element.light"]!!.uid]!!)
                            list.add(eleObj)
                        }
                        MonsterElementType.ME_Dark -> {
                            val eleObj = ElementObject(it.element, R.drawable.element_dark2, mapString[mapUid["str.monster.element.dark"]!!.uid]!!)
                            list.add(eleObj)
                        }


                        else -> {
                            val eleObj = ElementObject(it.element, R.drawable.skill_blank, "")
                            list.add(eleObj)
                        }

                    }
                }


        return list
    }






    fun GetMapType (): MutableList<TypeObject> {

        val list : MutableList<TypeObject> = mutableListOf()

        listMonster.distinctBy { it.defStatType }
                .forEach {
                    when (it.defStatType) {
                        MonsterStatType.MS_Attack -> {
                            val eleObj = TypeObject(it.defStatType, UtilFunctions.GetMonsterType(it.defStatType, mapString, mapUid ))

                            list.add(eleObj)
                        }
                        MonsterStatType.MS_Balance -> {
                            val eleObj = TypeObject(it.defStatType, UtilFunctions.GetMonsterType(it.defStatType, mapString, mapUid ))
                            list.add(eleObj)
                        }
                        MonsterStatType.MS_Defence -> {
                            val eleObj = TypeObject(it.defStatType, UtilFunctions.GetMonsterType(it.defStatType, mapString, mapUid ))
                            list.add(eleObj)
                        }
                        MonsterStatType.MS_Heal -> {
                            val eleObj = TypeObject(it.defStatType, UtilFunctions.GetMonsterType(it.defStatType, mapString, mapUid ))
                            list.add(eleObj)
                        }
                        MonsterStatType.MS_Hp -> {
                            val eleObj = TypeObject(it.defStatType, UtilFunctions.GetMonsterType(it.defStatType, mapString, mapUid ))
                            list.add(eleObj)
                        }


                        else -> {
                            val eleObj = TypeObject(MonsterStatType.MS_None, "")
                            list.add(eleObj)
                        }

                    }
                }


        return list
    }


    fun mapGrade (): MutableList<GradeObject> {

        val list : MutableList<GradeObject> = mutableListOf()

        listMonster.distinctBy { it.bornGrade }
                .forEach {
                    when (it.bornGrade) {
                        MonsterGrade.MG_1 -> {
                            val gradeObj = GradeObject(it.bornGrade, R.drawable.s1_2, MonsterGrade.MG_1.name)
                            list.add(gradeObj)
                        }
                        MonsterGrade.MG_2 -> {
                            val gradeObj = GradeObject(it.bornGrade, R.drawable.s2_2, MonsterGrade.MG_2.name)
                            list.add(gradeObj)
                        }
                        MonsterGrade.MG_3 -> {
                            val gradeObj = GradeObject(it.bornGrade, R.drawable.s3_2, MonsterGrade.MG_3.name)
                            list.add(gradeObj)
                        }
                        MonsterGrade.MG_4 -> {
                            val gradeObj = GradeObject(it.bornGrade, R.drawable.s4_2, MonsterGrade.MG_4.name)
                            list.add(gradeObj)
                        }
                        MonsterGrade.MG_5 -> {
                            val gradeObj = GradeObject(it.bornGrade, R.drawable.s5_2, MonsterGrade.MG_5.name)
                            list.add(gradeObj)
                        }
                        MonsterGrade.MG_6 -> {
                            val gradeObj = GradeObject(it.bornGrade, R.drawable.s6_2, MonsterGrade.MG_6.name)
                            list.add(gradeObj)
                        }


                        else -> {
                            val gradeObj = GradeObject(it.bornGrade, R.drawable.s6_2, MonsterGrade.MG_6.name)
                            list.add(gradeObj)
                        }

                    }
                }

        list.sortByDescending { it.grade.number }

        return list
    }



    fun mapUniqueDefaultSkillEffect (): HashMap<Int, MsgStatusEffectOuterClass.MsgStatusEffect> {
        val gg : HashMap<String, MsgStatusEffectOuterClass.MsgStatusEffect> = hashMapOf()

        listDictItem.sortedWith(compareBy( { mapString[mapEffect[mapMonster[it.monsterUid]!!.defaultSkillStatusEffectBeyond]!!.name] }  ) )
                .distinctBy { mapString[mapEffect[mapMonster[it.monsterUid]!!.defaultSkillStatusEffectBeyond]!!.name] }
                .asSequence()
                .map { mapEffect[mapMonster[it.monsterUid]!!.defaultSkillStatusEffectBeyond]!! }
                .forEach { gg.put( mapString[it.name]!! , it) }

        val ll = gg.toList().sortedWith(compareBy({it.first } ))

        val kk = ll.associateBy( { it.second.uid } , {it.second}) as HashMap<Int, MsgStatusEffectOuterClass.MsgStatusEffect>

        return kk
    }



    fun mapUniqueActiveSkillEffect (): HashMap<Int, MsgStatusEffectOuterClass.MsgStatusEffect> {
        val gg : HashMap<String, MsgStatusEffectOuterClass.MsgStatusEffect> = hashMapOf()

        listDictItem.sortedWith(compareBy( { mapString[mapEffect[mapMonster[it.monsterUid]!!.activeSkillStatusEffectBeyond]!!.name] }  ) )
                .distinctBy { mapString[mapEffect[mapMonster[it.monsterUid]!!.activeSkillStatusEffectBeyond]!!.name] }
                .asSequence()
                .map { mapEffect[mapMonster[it.monsterUid]!!.activeSkillStatusEffectBeyond]!! }
                .forEach { gg.put( mapString[it.name]!! , it) }

        val ll = gg.toList().sortedWith(compareBy({it.first } ))

        val kk = ll.associateBy( { it.second.uid } , {it.second}) as HashMap<Int, MsgStatusEffectOuterClass.MsgStatusEffect>

        return kk
    }

    fun mapUniqueLeaderSkillEffect (): HashMap<Int, MsgMonsterSkillOuterClass.MsgMonsterSkill> {
        val gg : HashMap<String, MsgMonsterSkillOuterClass.MsgMonsterSkill> = hashMapOf()

        listDictItem.sortedWith(compareBy(
                { mapString[mapEffect[ mapSkill [mapMonster[it.monsterUid]!!.leaderSkill]!!.statusEffect]!!.name] }  ) )
                .distinctBy { mapString[mapEffect[ mapSkill [mapMonster[it.monsterUid]!!.leaderSkill]!!.statusEffect]!!.name] }
                .asSequence()
                .map { mapSkill[mapMonster[it.monsterUid]!!.leaderSkill]!! }
                .forEach { gg.put( mapString[ mapEffect[it.statusEffect]!!.name]!! , it) }

        val ll = gg.toList().sortedWith(compareBy({it.first } ))

        val kk = ll.associateBy( { it.second.uid } , {it.second}) as HashMap<Int, MsgMonsterSkillOuterClass.MsgMonsterSkill>


        return kk
    }


    fun GetStringData(stringFile : String): MsgStringOuterClass.MsgString.Builder {
        val stringData = protoHelper.readStringData(stringFile, context)
        if (stringData.localStringsCount == 0) {
            stringData.mergeFrom(protoHelper.readStringDataFromAssets(stringFile, context))
        }
        return stringData
    }
//
//
//
    fun GetData (dbFile : String): MsgGameDataOuterClass.MsgGameData.Builder {
        val gameData = protoHelper.readGameData(dbFile, context)
        if (gameData.monstersCount == 0) {
            gameData.mergeFrom(protoHelper.readGameDataFromAssets(dbFile, context))
        }
        return gameData
    }





}