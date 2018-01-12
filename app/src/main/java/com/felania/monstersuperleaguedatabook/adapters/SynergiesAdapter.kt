package com.felania.monstersuperleaguedatabook.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.BaseAdapter
import android.widget.ImageView
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.utils.RecyclerViewFastScroller
import com.felania.monstersuperleaguedatabook.utils.UtilFunctions
import com.felania.msldb.*
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.child_synergies.view.*
import kotlinx.android.synthetic.main.grid_synergies_list.view.*
import java.text.DecimalFormat
import com.felania.monstersuperleaguedatabook.R.id.gvSynergies
import com.felania.monstersuperleaguedatabook.fragments.SynergiesFragment


class SynergiesAdapter(private var synergiesFragment: SynergiesFragment,
                       private var context: Context,
                       private var mapLinkBonus : List<MsgLinkBonusOuterClass.MsgLinkBonus>,
                       private var mapString: Map<Int, String>,
                       private var mapUidInt: Map<Int, MsgUidOuterClass.MsgUid>,
                       private var mapLinkHiddenData: Map<Int, MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData>,
                       private var mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>,
                       private var mapUid: Map<String, MsgUidOuterClass.MsgUid>,
                       private var mapEffect : Map<Int, MsgStatusEffectOuterClass.MsgStatusEffect> ) :
        RecyclerView.Adapter<SynergiesAdapter.ViewHolder>(), RecyclerViewFastScroller.BubbleTextGetter {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        Log.wtf("sss", "ss " + mapLinkBonus.size)

        val uiddd = mapLinkBonus[position].uid
//        Log.wtf("uid", "uid " + uiddd)
        val uid = GetSynergiesIcon( uiddd )


        holder.bindView(mapLinkBonus[position] , uid  )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.child_synergies, parent, false)
        return ViewHolder(synergiesFragment, context, view, mapString, mapUidInt, mapLinkHiddenData, mapMonster, mapUid, mapEffect)
    }

    override fun getTextToShowInBubble(pos: Int): String {
        return ""
    }

    override fun getItemCount(): Int {
        return mapLinkBonus.size
    }


    class ViewHolder (var synergiesFragment: SynergiesFragment,
                      var context: Context, view: View,
                      var mapString: Map<Int, String>,
                      var mapUidInt: Map<Int, MsgUidOuterClass.MsgUid>,
                      var mapLinkHiddenData: Map<Int, MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData>,
                      var mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>,
                      var mapUid: Map<String, MsgUidOuterClass.MsgUid>,
                      var mapEffect : Map<Int, MsgStatusEffectOuterClass.MsgStatusEffect>)
        : RecyclerView.ViewHolder(view) {
        fun bindView (linkBonus: MsgLinkBonusOuterClass.MsgLinkBonus, icon: Int) {

            with(linkBonus) {
                itemView.synergyName.text = mapString[linkBonus.name]

                Picasso.with(itemView.context)
                        .load( icon )
                        .error(R.drawable.ic_hidden)
                        .placeholder(R.drawable.ic_hidden)
                        .into(itemView.ivSynergiesIcon)

                val format = DecimalFormat()
                format.isDecimalSeparatorAlwaysShown = false

                val statusEffect = UtilFunctions.GetStatusEffectByUid(mapEffect, linkBonus.statusEffectUid)
                val where = UtilFunctions.GetStringForStatusEffectWhere(mapString, mapUid, statusEffect.where    )
                val subType = UtilFunctions.GetStringForStatusEffectSubType(mapString, mapUid, statusEffect.subType)
                val type = UtilFunctions.GetStringForStatusEffectValueSymbol(statusEffect.type)
                val statusEffectValue =
                        if (statusEffect.vFloat <= 0)
                            statusEffect.vInt.toString()
                        else
                            format.format((statusEffect.vFloat * 100)).toString()



                val desc = UtilFunctions.GetStringFromUidText(mapString, mapUid , "ustr.link.bonus.desc.format")
                        .replace("{0}", where)
                        .replace("{1}", subType)
                        .replace("{2}", type)
                        .replace("{3}", statusEffectValue)

                val target = UtilFunctions.GetStringForLinkBonusTarget(mapString, mapUid, linkBonus.target)

                itemView.tvSynergiesDesc.text = desc
                itemView.tvSynergiesTarget.text = target

                val descLabel = UtilFunctions.GetStringFromUidText(mapString, mapUid , "ustr.link.bonus.dic.bonus") + ": "
                val targetLabel = UtilFunctions.GetStringFromUidText(mapString, mapUid , "ustr.link.bonus.dic.taget") + ": "

                itemView.tvSynergiesDescLabel.text = descLabel
                itemView.tvSynergiesTargetLabel.text = targetLabel


                itemView.tvSynergiesHelp.visibility = View.GONE
                itemView.gvSynergies.visibility = View.GONE

                val monCount = " x " + linkBonus.monsterCount

                itemView.tvSynergiesCount.text = monCount

                if(linkBonus.newTag) {
                    itemView.ivSynergiesNew.visibility = View.VISIBLE
                } else {
                    itemView.ivSynergiesNew.visibility = View.GONE
                }



                if (linkBonus.linkBonusType == MsgLinkBonusOuterClass.MsgLinkBonus.LinkBonusType.LBT_Hidden) {
                    val hiddenDataList = mapLinkHiddenData[linkBonus.subTypeValue.hiddenUid   ]?.monsterUidsList

                    if(hiddenDataList != null) {
                        itemView.tvSynergiesHelp.visibility = View.VISIBLE
                        itemView.gvSynergies.visibility = View.VISIBLE
                        itemView.tvSynergiesHelp.text = "*Including all evolution stages and elements"

                        val monList = mutableListOf< MsgMonsterOuterClass.MsgMonster >()
                        hiddenDataList.mapTo(monList) { mapMonster[it]!! }

                        val gridAdapter = GridAdapter(context, mapMonster, monList )

                        itemView.gvSynergies.adapter = gridAdapter

                        itemView.gvSynergies.onItemClickListener = object : AdapterView.OnItemClickListener {
                            override fun onItemClick(parent: AdapterView<*>, view: View,
                                                     position: Int, id: Long) {

                                synergiesFragment.StartSkillBookPopupActivity( gridAdapter.getItemId(position).toInt() )
                            }
                        }

                    }
                }

            }
        }


    }

    private fun GetSynergiesIcon ( pos: Int) : Int {

        val uidText = mapUidInt[pos]?.strUid

        when (uidText) {
            "link.se.element.fire.1" -> return R.drawable.ic_fire_1
            "link.se.element.water.1" -> return R.drawable.ic_water_1
            "link.se.element.tree.1" -> return R.drawable.ic_wood_1
            "link.se.element.light.1" -> return R.drawable.ic_light_1
            "link.se.element.dark.1" -> return R.drawable.ic_dark_1
            "link.se.gender.male.1" -> return R.drawable.ic_brotherhood
            "link.se.gender.female.1" -> return R.drawable.ic_sisterhood
            "link.se.stat_type.hp.1" -> return R.drawable.ic_healthy_tanks
            "link.se.stat_type.attack.1" -> return R.drawable.ic_concentrated_attack
            "link.se.stat_type.defence.1" -> return R.drawable.ic_ironclad_defense
            "link.se.stat_type.heal.1" -> return R.drawable.ic_healing_touch
            "link.se.stat_type.balance.1" -> return R.drawable.ic_balancing_act
            "link.se.evolution.2" -> return R.drawable.ic_evo_1
            "link.se.evolution.3" -> return R.drawable.ic_evo_2
            else -> return R.drawable.ic_hidden
        }
    }


    class GridAdapter (private var context: Context,
                       private var mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>,
                       private var listMonster: MutableList<MsgMonsterOuterClass.MsgMonster>
                       ) : BaseAdapter() {

        private val mInflator: LayoutInflater

        init {
            this.mInflator = LayoutInflater.from(context)
        }


        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            val view: View
            val viewHolder: ViewHolder
            if(convertView == null) {
                view = this.mInflator.inflate(R.layout.grid_synergies_list, parent, false)
                viewHolder = ViewHolder(view)
                view.tag = viewHolder

            } else {
                view = convertView
                viewHolder = view.tag as ViewHolder

            }

            val monIcon = UtilFunctions.GetAstromonResourceByID(mapMonster, context, listMonster[position].uid)

            Picasso.with(context)
                    .load( monIcon )
                    .error(R.drawable.skill_blank)
                    .placeholder(R.drawable.skill_blank)
                    .into(viewHolder.ivIcon)


            return view
        }


        class ViewHolder (view: View) {
            val ivIcon: ImageView = view.ivSynergyGridIcon
        }

        override fun getItem(p0: Int): Any {
            return listMonster[p0]
        }

        override fun getItemId(p0: Int): Long {
            return listMonster[p0].uid.toLong()
        }

        override fun getCount(): Int {
            return listMonster.size
        }

    }







}