package com.felania.monstersuperleaguedatabook.fragments

import android.content.Context
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

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_synergies, container, false)





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

        lvSynergies.layoutManager = LinearLayoutManager(context)


        lvSynergies.adapter = SynergiesAdapter(GetProperList(bonusType)  , mapString)

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