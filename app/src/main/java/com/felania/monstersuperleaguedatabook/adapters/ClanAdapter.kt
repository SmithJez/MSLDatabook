package com.felania.monstersuperleaguedatabook.adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.activities.ClanActivity
import com.felania.monstersuperleaguedatabook.utils.RecyclerViewFastScrollerWithBubble
import com.felania.monstersuperleaguedatabook.utils.UtilFunctions
import com.felania.monstersuperleaguedatabook.utils.Variables
import com.felania.msldb.MsgClanSubStageOuterClass.MsgClanSubStage
import com.felania.msldb.MsgMonsterOuterClass
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.child_clan.view.*
import java.text.NumberFormat
import java.util.*

class ClanAdapter(context: Context, _subStages: List<MsgClanSubStage>
) :
        RecyclerView.Adapter<ClanAdapter.ViewHolder>(), RecyclerViewFastScrollerWithBubble.BubbleTextGetter {

    var ctx = context
    var subStage = _subStages

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.child_clan, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(ctx, subStage[position]
                )
    }

    override fun getItemCount() = subStage.size

    override fun getTextToShowInBubble(pos: Int): String {
        return subStage[pos].bossLev.toString()
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {

        fun bindView(ctx: Context, subStage: MsgClanSubStage){
            with(subStage) {

                val stageLevel = ((ctx) as ClanActivity) .GetStringByString(Variables.STRING_LVL).replace("{0}", subStage.bossLev.toString())

                itemView.tvClanStage.text = stageLevel

                val reqMonster = ctx.GetTitanMonsterBySubStageUid(uid)

                val titanIcon = UtilFunctions.GetAstromonResourceByID(ctx, reqMonster)

                Picasso.with(ctx)
                        .load(titanIcon)
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(itemView.ivTitanIcon)

                Picasso.with(itemView.context)
                        .load(ctx.GetTitanGrade(uid))
                        .error(R.drawable.s1)
                        .placeholder(R.drawable.s1)
                        .into(itemView.ivTitanGrade)

                Picasso.with(itemView.context)
                        .load(ctx.GetTitanElementFlame(uid))
                        .error(R.drawable.element_fire)
                        .placeholder(R.drawable.element_fire)
                        .into(itemView.ivFrameTitan)




                val titanStat = ctx.GetTitanStat(uid)

                val hp = NumberFormat.getNumberInstance(Locale.US).format(titanStat.hp)
                val atk = NumberFormat.getNumberInstance(Locale.US).format(titanStat.attack)
                val def = NumberFormat.getNumberInstance(Locale.US).format(titanStat.defence)
                val recovery = NumberFormat.getNumberInstance(Locale.US).format(titanStat.heal)

                itemView.tvTitanHp.text = hp
                itemView.tvTitanAttack.text = atk
                itemView.tvTitanDefense.text = def
                itemView.tvTitanRecovery.text = recovery


                val extraStat = ctx.GetTitanExtraStat(uid)

                val critDmg = ((extraStat[Variables.CRIT_DMG]!! - 1f) * 100f).toInt().toString() + "%"
                val critRate = (extraStat[Variables.CRIT_RATE]!! * 100f).toInt().toString() + "%"
                val resist = (extraStat[Variables.RESIST]!! * 100f).toInt().toString() + "%"

                itemView.tvTitanCritDmg.text = critDmg
                itemView.tvTitanCritRate.text = critRate
                itemView.tvTitanResist.text = resist

                val statText = ctx.GetStatText()


                val hpText = statText[Variables.HP]
                val atkText = statText[Variables.ATK]
                val defText = statText[Variables.DEF]
                val healText = statText[Variables.HEAL]
                val critDmgText = statText[Variables.CRIT_DMG]
                val critRateText = statText[Variables.CRIT_RATE]
                val resistText = statText[Variables.RESIST]


                itemView.tvTitanHpText.text = hpText
                itemView.tvTitanAttackText.text = atkText
                itemView.tvTitanDefenseText.text = defText
                itemView.tvTitanRecoveryText.text = healText
                itemView.tvTitanCritDmgText.text = critDmgText
                itemView.tvTitanCritRateText.text = critRateText
                itemView.tvTitanResistText.text = resistText



                val skillFx = ctx.GetTitanSkillEffect(uid)



                val defaultFx = skillFx[Variables.SKILL_DEFAULT]
                val activeFx = skillFx[Variables.SKILL_ACTIVE]


                val defFxName = ctx.GetStringByUid(defaultFx!!.name)
                val actFxName = ctx.GetStringByUid(activeFx!!.name)


                itemView.tvTitanSkillNormal.text = defFxName
                itemView.tvTitanSkillActive.text = actFxName

                ctx.GetTitanEffectDesc(itemView.tvTitanSkillNormalDesc, itemView.tvTitanSkillActiveDesc, defaultFx, activeFx)



                Picasso.with(ctx)
                        .load( UtilFunctions.GetSkillEffectResource(ctx, defaultFx.subType.name))
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(itemView.ivTitanSkillNormal)

                Picasso.with(ctx)
                        .load(UtilFunctions.GetSkillEffectResource(ctx, activeFx.subType.name))
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(itemView.ivTitanSkillActive)


            }
        }


    }




}