package com.felania.monstersuperleaguedatabook.protobuf

import android.content.Context
import android.util.Log
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.utils.BarObjectParent
import com.felania.monstersuperleaguedatabook.utils.GameDBEnum
import com.felania.monstersuperleaguedatabook.utils.MonsterEvolutionGroup
import com.felania.msldb.*
import com.felania.msldb.MsgGameDataOuterClass.MsgGameData
import com.felania.msldb.MsgLinkBonusOuterClass.*
import java.io.*

open class ProtobufHelper {


//    fun WriteListToProto (list: MsgMonsterOuterClass.MsgMonster): MsgMonsterOuterClass.MsgMonster {
//        val builder = MsgMonsterOuterClass.MsgMonster  .newBuilder()
//
////        for (gg in list) {
//        builder.uid = list.uid
//        builder.name = list.name
//        builder.bornGrade = list.bornGrade
//        builder.defHp = list.defHp
//        builder.defAttack = list.defAttack
//        builder.defDefence = list.defDefence
//        builder.defHeal = list.defHeal
//        builder.incHp = list.incHp
//        builder.incAttack = list.incAttack
//        builder.incDefence = list.incDefence
//        builder.incHeal = list.incHeal
//        builder.mp = list.mp
//        builder.mpRecovery = list.mpRecovery
//        builder.defStatType = list.defStatType
//        builder.usedType = list.usedType
//        builder.element = list.element
//        builder.sellPrice = list.sellPrice
//        builder.defaultSkill = list.defaultSkill
//        builder.activeSkill = list.activeSkill
//        builder.defaultSkillStatusEffectBeyond = list.defaultSkillStatusEffectBeyond
//        builder.activeSkillStatusEffectBeyond = list.activeSkillStatusEffectBeyond
//        builder.leaderSkill = list.leaderSkill
//        builder.evolution = list.evolution
//        builder.resourceName = list.resourceName
//        builder.firstEvolutionResourceName = list.firstEvolutionResourceName
//        builder.baseResourceName = list.baseResourceName
//        builder.criticalProb = list.criticalProb
//        builder.criticalDamage = list.criticalDamage
//        builder.statusEffectResistance = list.statusEffectResistance
//        builder.sizeFactor = list.sizeFactor
//        builder.nextEvolution = list.nextEvolution
//        builder.requiredSoulstone = list.requiredSoulstone
//        builder.monsterDefaultAi = list.monsterDefaultAi
//        builder.monsterActiveAi = list.monsterActiveAi
//        builder.defaultHitSound = list.defaultHitSound
//        builder.activeHitSound = list.activeHitSound
//        builder.addAllStoryDesc(list.storyDescList)
//        builder.condActiveSkill = list.condActiveSkill
//        builder.condActiveSkillStatusEffectBeyond = list.condActiveSkillStatusEffectBeyond
//        builder.monsterCondActiveAi = list.monsterCondActiveAi
//        builder.condActiveHitSound = list.condActiveHitSound
//        builder.rootMonsterUid = list.rootMonsterUid
//        builder.skillLevel = list.skillLevel
//
//
//
//
////        }
//            Log.wtf("uid", "uid " + list.firstEvolutionResourceName)
//
//
//            return  builder.build()
//
//
//    }

    fun DeleteExistingMap (context: Context, key: String) {
        val input = key+ ".smj"
        val file = File(context.filesDir, input)

//        Log.wtf("sadsa", "asda " + file)

        try {
            file.delete()
        } catch (e: FileNotFoundException){
            Log.wtf("filenotfound",  key +" not found")
        }

    }


    fun ReadMapMonBar (context: Context): MutableList<SmjBarParentObjectOuterClass.SmjBarParentObject> {

        val input = "MapMonBar.smj"
        val file = File(context.filesDir, input)
        val fileInput = FileInputStream(file)

        val ee = SmjMapMonBarOuterClass.SmjMapMonBar.parseFrom(fileInput)

        return ee.parentObjectList

    }


    fun ReadMapDictName (context: Context): MutableList<SmjMonsterEvolutionGroupOuterClass.SmjMonsterEvolutionGroup> {

        val input = "MapDictName.smj"
        val file = File(context.filesDir, input)
        val fileInput = FileInputStream(file)

        val ee =  SmjMapMonsterEvolutionGroupOuterClass.SmjMapMonsterEvolutionGroup .parseFrom(fileInput)

        return ee.groupList

    }

    fun WriteMapDictName(context: Context, monEvoGroup: MonsterEvolutionGroup) {
        val input = "MapDictName.smj"
        val file = File(context.filesDir, input)

        val newBuilder = SmjMapMonsterEvolutionGroupOuterClass.SmjMapMonsterEvolutionGroup .newBuilder()

        try {
            val fileInput = FileInputStream(file)
            newBuilder.mergeFrom( fileInput   )
            fileInput.close()
        } catch (e: FileNotFoundException) {
            Log.wtf("FileNotFound", "FileNotFound: " + file)
        } finally {

        }

        val builder = SmjMonsterEvolutionGroupOuterClass.SmjMonsterEvolutionGroup .newBuilder()
        builder.resName = monEvoGroup.resName
        builder.evo1 = monEvoGroup.evo1
        builder.evo2 = monEvoGroup.evo2
        builder.evo3 = monEvoGroup.evo3


        newBuilder.addGroup (builder.build()  )

        val output = FileOutputStream(file)
        newBuilder.build().writeTo(output)

        output.close()
    }



    fun WriteMapMonBar(context: Context, uid: Int, barParent: BarObjectParent, mon: HashMap<String, Float>) {

        val input = "MapMonBar.smj"
        val file = File(context.filesDir, input)

        val newBuilder = SmjMapMonBarOuterClass.SmjMapMonBar  .newBuilder()

        try {
            val fileInput = FileInputStream(file)
            newBuilder.mergeFrom( fileInput   )
            fileInput.close()
        } catch (e: FileNotFoundException) {
            Log.wtf("FileNotFound", "FileNotFound: " + file)
        } finally {

        }

        val barObjAstroguideBuilder = SmjBarObjectOuterClass.SmjBarObject.newBuilder()
        barObjAstroguideBuilder.hp = barParent.astroguideSize.hp
        barObjAstroguideBuilder.atk = barParent.astroguideSize.atk
        barObjAstroguideBuilder.def = barParent.astroguideSize.def
        barObjAstroguideBuilder.heal = barParent.astroguideSize.heal
        barObjAstroguideBuilder.critDmg = barParent.astroguideSize.critDmg
        barObjAstroguideBuilder.critRate = barParent.astroguideSize.critRate
        barObjAstroguideBuilder.resist = barParent.astroguideSize.resist

        val barObjDetailBuilder = SmjBarObjectOuterClass.SmjBarObject.newBuilder()
        barObjDetailBuilder.hp = barParent.detailSize.hp
        barObjDetailBuilder.atk = barParent.detailSize.atk
        barObjDetailBuilder.def = barParent.detailSize.def
        barObjDetailBuilder.heal = barParent.detailSize.heal
        barObjDetailBuilder.critDmg = barParent.detailSize.critDmg
        barObjDetailBuilder.critRate = barParent.detailSize.critRate
        barObjDetailBuilder.resist = barParent.detailSize.resist

        val builder = SmjBarParentObjectOuterClass.SmjBarParentObject.newBuilder()
        builder.monsterUid = uid
        builder.hp = mon["hp"]!!
        builder.atk = mon["atk"]!!
        builder.def = mon["def"]!!
        builder.heal = mon["heal"]!!
        builder.critDmg = mon["crit_dmg"]!!
        builder.critRate = mon["crit_rate"]!!
        builder.resist = mon["resist"]!!


        builder.astroguideSize = barObjAstroguideBuilder.build()
        builder.detailSize = barObjDetailBuilder.build()

        newBuilder.addParentObject (builder.build()  )

        val output = FileOutputStream(file)
        newBuilder.build().writeTo(output)

        output.close()
    }

    fun ReadMonster (context: Context): MutableList<MsgMonsterOuterClass.MsgMonster> {

        val input = "MonsterDB.smj"
        val file = File(context.filesDir, input)
        val fileInput = FileInputStream(file)


        val ee = MsgGameData.parseFrom(fileInput)

        return ee.monstersList

    }

//    fun Read (context: Context): MutableList<MsgStringOuterClass.MsgLocalizedString> {
//
//        val input = "OutputString.smj"
//        val file = File(context.filesDir, input)
//        val fileInput = FileInputStream(file)
//
//        val file = context.assets.open()
//
//        val ee = MsgStringOuterClass.MsgString.parseFrom(fileInput)
//
//        return ee.localStringsList
//
//    }

    fun ReadSynergyHiddenData (obj: Int, context: Context):  MutableList<MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData>  {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        Log.wtf("key", "key " + key)
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.linkBonusHiddenDatasList
        } catch (e: IOException) {
            e.printStackTrace()
            Log.wtf("filenotFound", "file not found")
        }
        return MsgGameData.getDefaultInstance().linkBonusHiddenDatasList
    }

    fun ReadSynergy (obj: Int, context: Context):  MutableList<MsgLinkBonusOuterClass.MsgLinkBonus>  {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        Log.wtf("key", "key " + key)
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.linkBonusesList
        } catch (e: IOException) {
            e.printStackTrace()
            Log.wtf("filenotFound", "file not found")
        }
        return MsgGameData.getDefaultInstance().linkBonusesList
    }



    fun ReadMonsters (obj: Int, context: Context): MutableList<MsgMonsterOuterClass.MsgMonster> {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.monstersList
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance().monstersList
    }


    fun ReadUids (obj: Int, context: Context): MutableList<MsgUidOuterClass.MsgUid> {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.uidsList
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance().uidsList
    }

    fun ReadDictItem (obj: Int, context: Context): MutableList<MsgDictItemOuterClass.MsgDictItem> {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.monsterDictList
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance().monsterDictList
    }

    fun ReadMonsterType (obj: Int, context: Context): MutableList<MsgMonsterTypeOuterClass.MsgMonsterType> {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.monsterTypesList
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance().monsterTypesList
    }

    fun ReadSetting (obj: Int, context: Context): MutableList<MsgSettingOuterClass.MsgSetting> {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.settingsList
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance().settingsList
    }

    fun ReadSkill (obj: Int, context: Context): MutableList<MsgMonsterSkillOuterClass.MsgMonsterSkill> {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.monsterSkillsList
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance().monsterSkillsList
    }

    fun ReadEffect (obj: Int, context: Context): MutableList<MsgStatusEffectOuterClass.MsgStatusEffect> {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.statusEffectsList
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance().statusEffectsList
    }


    fun ReadStageMonster (obj: Int, context: Context): MutableList<MsgStageMonsterOuterClass.MsgStageMonster> {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.stageMonstersList
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance().stageMonstersList
    }


    fun ReadSkillUpgrade (obj: Int, context: Context): MutableList<MsgMonsterUpgradeSkillOuterClass.MsgMonsterUpgradeSkill> {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.monsterUpgradeSkillsList
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance().monsterUpgradeSkillsList
    }


    fun ReadDungeonStageMonster (obj: Int, context: Context): MutableList<MsgStageMonsterOuterClass.MsgStageMonster> {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.dungeonMonstersList
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance().dungeonMonstersList
    }

    fun ReadStageMonsterGroup (obj: Int, context: Context): MutableList<MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup> {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.dungeonMonsterGroupsList
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance().dungeonMonsterGroupsList
    }

    fun ReadClanSeason (obj: Int, context: Context): MutableList<MsgClanSeasonOuterClass.MsgClanSeason> {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.clanSeasonsList
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance().clanSeasonsList
    }

    fun ReadClanStage (obj: Int, context: Context): MutableList<MsgClanStageOuterClass.MsgClanStage> {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.clanStagesList
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance().clanStagesList
    }

    fun ReadClanSubStage (obj: Int, context: Context): MutableList<MsgClanSubStageOuterClass.MsgClanSubStage> {
        val key = GameDBEnum.getValue(obj).toString() + ".smj"
        try {
            val input = context.assets.open(key)
            return MsgGameData.parseFrom(input)!!.clanSubstagesList
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance().clanSubstagesList
    }




    fun readGameData(file: String, context: Context): MsgGameData.Builder {
        try {
            return MsgGameData.parseFrom(context.openFileInput(file)).toBuilder()!!
        } catch (e: FileNotFoundException) {
            Log.i(context.getString(R.string.app_name), "No db file previously saved")
        } catch (e: IOException) {
            e.printStackTrace()
        }


        return MsgGameData.newBuilder()

    }

    fun readGameDataFromAssets(file: String, context: Context): MsgGameData {
        try {
            val input = context.assets.open(file)
            val gg  = MsgGameData.parseFrom(input)!!

            return gg
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return MsgGameData.getDefaultInstance()
    }

    fun readStringData(file: String, context: Context): MsgStringOuterClass.MsgString.Builder {

        try {
            return MsgStringOuterClass.MsgString.parseFrom(context.openFileInput(file)).toBuilder()!!
        } catch (e: FileNotFoundException) {
            Log.i(context.getString(R.string.app_name), "No string file previously saved")
        } catch (e: IOException) {
            e.printStackTrace()
        }

        return MsgStringOuterClass.MsgString.newBuilder()

    }

    fun readStringDataFromAssets(file: String, context: Context): MsgStringOuterClass.MsgString {

        val `is`: InputStream
        try {
            `is` = context.assets.open(file)!!
            return MsgStringOuterClass.MsgString.parseFrom(`is`)!!
        } catch (e: IOException) {
            e.printStackTrace()
        }catch (e: java.lang.Exception) {
            Log.wtf("errorFileJava", e.message)
        } catch (e: Exception) {
            Log.wtf("errorFileKotlin", e.message)
        }

        return MsgStringOuterClass.MsgString.getDefaultInstance()

    }


}