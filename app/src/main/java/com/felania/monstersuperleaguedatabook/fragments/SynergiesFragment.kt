package com.felania.monstersuperleaguedatabook.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.activities.SynergyActivity
import com.felania.monstersuperleaguedatabook.adapters.SynergiesAdapter
import com.felania.monstersuperleaguedatabook.protobuf.ProtobufHelper
import com.felania.monstersuperleaguedatabook.utils.MonsterEvolutionGroup
import com.felania.monstersuperleaguedatabook.utils.Variables
import com.felania.msldb.*
import kotlinx.android.synthetic.main.fragment_synergies.*
import java.util.HashMap

class SynergiesFragment : Fragment() {

    internal lateinit var ctx: Context

    private var mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster> = hashMapOf()
    private var mapLinkBonus: Map<Int, MsgLinkBonusOuterClass.MsgLinkBonus> = hashMapOf()
    private var mapString: Map<Int, String> = hashMapOf()
    private var mapUid: Map<String, MsgUidOuterClass.MsgUid> = hashMapOf()
    private var mapUidInt: Map<Int, MsgUidOuterClass.MsgUid> = hashMapOf()
    private var mapLinkHiddenData: Map<Int, MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData> = hashMapOf()
    private var mapDictName : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()

    private var mapEffect : Map<Int, MsgStatusEffectOuterClass.MsgStatusEffect> = hashMapOf()

    private var maxStat: java.util.HashMap<String, Float> = hashMapOf()


    private var saveLang = String()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_synergies, container, false)

        saveLang = arguments.getString(Variables.SETTING_LANGUAGE)



        return rootView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        GetData()
    }

    private fun GetData() {

        val bonusType = arguments.getSerializable("bonus_type") as MsgLinkBonusOuterClass.MsgLinkBonus.LinkBonusType

        mapMonster = (context as SynergyActivity).mapMonster
        mapString = (context as SynergyActivity).mapString
        mapUid = (context as SynergyActivity).mapUid
        mapLinkBonus = (context as SynergyActivity).mapLinkBonus
        mapUidInt = (context as SynergyActivity).mapUidInt
        mapLinkHiddenData = (context as SynergyActivity).mapLinkHiddenData
        mapDictName = (context as SynergyActivity).mapDictName
        mapEffect = (context as SynergyActivity).mapEffect

        maxStat = (context as SynergyActivity).maxStat


//        Log.wtf("data", "data " + mapLinkHiddenData.size)

        lvSynergies.layoutManager = LinearLayoutManager(context)


        lvSynergies.adapter = SynergiesAdapter(this, context, GetProperList(bonusType), mapString, mapUidInt, mapLinkHiddenData, mapMonster, mapUid, mapEffect)



    }


    fun StartSkillBookPopupActivity(evo1Uid: Int) {

        var rightGroup = MonsterEvolutionGroup("", MsgDictItemOuterClass.MsgDictItem.getDefaultInstance(), MsgDictItemOuterClass.MsgDictItem.getDefaultInstance(), MsgDictItemOuterClass.MsgDictItem.getDefaultInstance())

        for (gg in mapDictName) {
            if(evo1Uid == gg.value.evo1.monsterUid) {
                rightGroup = gg.value
            }
        }



        val evo1 = rightGroup.evo1.monsterUid
        val evo2 = rightGroup.evo2.monsterUid
        val evo3 = rightGroup.evo3.monsterUid


        val intent = Intent(activity, AstroguideDetailActivity::class.java)

        intent.putExtra(Variables.SETTING_LANGUAGE, saveLang)
        intent.putExtra(Variables.UID_EVO1, evo1)
        intent.putExtra(Variables.UID_EVO2, evo2)
        intent.putExtra(Variables.UID_EVO3, evo3)
        intent.putExtra("max_stat", maxStat)

        startActivity(intent)


    }

    fun GetProperList(inputType: MsgLinkBonusOuterClass.MsgLinkBonus.LinkBonusType): MutableList<MsgLinkBonusOuterClass.MsgLinkBonus> {
        val list = mutableListOf<MsgLinkBonusOuterClass.MsgLinkBonus>()

        for (item in mapLinkBonus) {
            val bonusType = item.value.linkBonusType

            if(bonusType == inputType) {
                list.add(item.value)
            }

        }

        return list
    }


    override fun onAttach(context: Context) {
        this.ctx = context
        super.onAttach(context)
    }

}