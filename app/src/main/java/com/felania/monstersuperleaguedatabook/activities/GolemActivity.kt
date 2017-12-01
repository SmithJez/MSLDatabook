package com.felania.monstersuperleaguedatabook.activities

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.protobuf.ProtobufHelper
import com.felania.monstersuperleaguedatabook.utils.RewardObj
import com.felania.monstersuperleaguedatabook.utils.Variables
import com.felania.msldb.*
import com.felania.msldb.MsgGameDataOuterClass.*

class GolemActivity : AppCompatActivity() {

    var listString: List<MsgStringOuterClass.MsgLocalizedString> = listOf()
    var listMonster: List<MsgMonsterOuterClass.MsgMonster> = listOf()
    var listUid: List<MsgUidOuterClass.MsgUid> = listOf()
    var listType: List<MsgMonsterTypeOuterClass.MsgMonsterType> = listOf()
    var listSetting: List<MsgSettingOuterClass.MsgSetting> = listOf()
    var listSkill : List<MsgMonsterSkillOuterClass.MsgMonsterSkill> = listOf()
    var listEffect : List<MsgStatusEffectOuterClass.MsgStatusEffect> = listOf()

    var listDungeonStageMonster = listOf<MsgStageMonsterOuterClass.MsgStageMonster>()
    var listStageMonster = listOf<MsgStageMonsterOuterClass.MsgStageMonster>()
    var listStageMonsterGroup = listOf<MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup>()
    var listDungeonSubStage = listOf<MsgDungeonSubStageOuterClass.MsgDungeonSubStage>()
    var listDungeonStage = listOf<MsgDungeonStageOuterClass.MsgDungeonStage>()

    var listRandom = listOf<MsgRandomOuterClass.MsgRandom>()
    var listRune = listOf<MsgRuneOuterClass.MsgRune>()

    var listItem = listOf<MsgItemOuterClass.MsgItem>()

    var mapItem = mutableMapOf<Int, MsgItemOuterClass.MsgItem>()
    var mapRandom = mutableMapOf<Int, MsgRandomOuterClass.MsgRandom>()
    var mapRune = mutableMapOf<Int, MsgRuneOuterClass.MsgRune>()
    var mapDungeonStageMonster = mutableMapOf<Int, MsgStageMonsterOuterClass.MsgStageMonster>()
    var mapStageMonster = mutableMapOf<Int, MsgStageMonsterOuterClass.MsgStageMonster>()

    var mapStageMonsterGroup = mutableMapOf<Int, MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup>()
    var mapDungeonSubStage = mutableMapOf<Int, MsgDungeonSubStageOuterClass.MsgDungeonSubStage>()
    var mapDungeonStage = mutableMapOf<Int, MsgDungeonStageOuterClass.MsgDungeonStage>()

    var listSub = mutableListOf<Int>()
    var listSubStage = mutableListOf<MsgDungeonSubStageOuterClass.MsgDungeonSubStage>()


    var mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster> = hashMapOf()


    var mapUid: Map<String, MsgUidOuterClass.MsgUid> = hashMapOf()
    var mapString: Map<Int, String> = hashMapOf()
    var mapEffect : Map<Int, MsgStatusEffectOuterClass.MsgStatusEffect> = hashMapOf()


    var rewardList : MutableMap< Int, MutableMap<String, MutableList<RewardObj>>> = mutableMapOf()

    var context: Context = this

    var protoHelper = ProtobufHelper()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_golem)

//        val intent = intent

        val saveLang = intent.getStringExtra(Variables.SETTING_LANGUAGE)

        val localeMap: HashMap<String, String> = Variables.localeToStringMap

        var stringFile = localeMap[saveLang]

        if( stringFile == null) {
            stringFile = Variables.STRING_EN
        }

        val string = GetStringData(stringFile)


        listString = string.localStringsList



    }

    fun InitGolemData () {

        listUid = protoHelper.ReadUids(MsgGameData.UIDS_FIELD_NUMBER, context)
        listMonster =  protoHelper.ReadMonsters(MsgGameData.MONSTERS_FIELD_NUMBER, context)

        listType = protoHelper.ReadMonsterType(MsgGameData.MONSTER_TYPES_FIELD_NUMBER, context)
        listSetting = protoHelper.ReadSetting(MsgGameData.SETTINGS_FIELD_NUMBER, context)
        listSkill = protoHelper.ReadSkill(MsgGameData.MONSTER_SKILLS_FIELD_NUMBER, context)
        listEffect = protoHelper.ReadEffect(MsgGameData.STATUS_EFFECTS_FIELD_NUMBER, context)
        listStageMonster = protoHelper.ReadStageMonster (MsgGameData.STAGE_MONSTERS_FIELD_NUMBER, context)


        mapUid = listUid.associateBy ({ it.strUid }, {it})
        mapString = listString.associateBy( {it.uid}, {it.text})
        mapMonster = listMonster.associateBy ({ it.uid } , {it} )

        mapEffect = listEffect.associateBy( {it.uid } , {it})

        listDungeonStageMonster = protoHelper.ReadDungeonStageMonster(MsgGameData.DUNGEON_MONSTERS_FIELD_NUMBER, context)



    }




    fun GetStringData(stringFile : String): MsgStringOuterClass.MsgString.Builder {
        val stringData = protoHelper.readStringData(stringFile, context)
        if (stringData.localStringsCount == 0) {
            stringData.mergeFrom(protoHelper.readStringDataFromAssets(stringFile, context))
        }
        return stringData
    }



}