package com.felania.monstersuperleaguedatabook.adapters

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.utils.RecyclerViewFastScroller
import com.felania.msldb.MsgLinkBonusOuterClass
import kotlinx.android.synthetic.main.child_synergies.view.*

class SynergiesAdapter(private var mapLinkBonus : List<MsgLinkBonusOuterClass.MsgLinkBonus>, private var mapString: Map<Int, String>  ) :
        RecyclerView.Adapter<SynergiesAdapter.ViewHolder>(), RecyclerViewFastScroller.BubbleTextGetter {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.wtf("sss", "ss " + mapLinkBonus.size)
        holder.bindView(mapLinkBonus[position]!!)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.child_synergies, parent, false)
        return ViewHolder(view, mapString)
    }



    override fun getItemCount(): Int {
        return mapLinkBonus.size
    }

    override fun getTextToShowInBubble(pos: Int): String {
        return ""
    }


    class ViewHolder (view: View, var mapString: Map<Int, String>) : RecyclerView.ViewHolder(view) {
        fun bindView(linkBonus: MsgLinkBonusOuterClass.MsgLinkBonus) {
            with(linkBonus) {
                itemView.synergyName.text = mapString[linkBonus.name]
            }
        }
    }
}