package com.felania.monstersuperleaguedatabook.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.text.Html
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.activities.MonDBActivity
import com.felania.monstersuperleaguedatabook.protobuf.ProtobufHelper
import com.felania.monstersuperleaguedatabook.utils.*
import com.felania.msldb.*
import com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData
import com.felania.msldb.MsgDictItemOuterClass.MsgDictItem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.mon_item.view.*
import kotlinx.android.synthetic.main.mon_profile.view.*
import kotlinx.android.synthetic.main.mon_skill.view.*
import kotlinx.android.synthetic.main.mon_stat.view.*
import java.text.NumberFormat
import java.util.*




class AstromonAdapter(var context: Context,
                      astromons: List<MonsterEvolutionGroup>,
                      mapString: Map<Int, String>,
                      mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>,
                      mapUid: Map<String, MsgUidOuterClass.MsgUid>,
                      maxStat: HashMap<String, Float>,
                      mapSkillUpgrade: Map<Int, MsgMonsterUpgradeSkillOuterClass.MsgMonsterUpgradeSkill>


                      ) :
        RecyclerView.Adapter<AstromonAdapter.ViewHolder>(), RecyclerViewFastScroller.BubbleTextGetter {




    var originalAstromon = astromons
    var evo1 : List<MsgDictItem> = listOf()
    var evo2 : List<MsgDictItem> = listOf()
    var evo3 : List<MsgDictItem> = listOf()


    var _mapString = mapString
    var _mapMonster = mapMonster

    val _mapUid = mapUid

    val _maxStat = maxStat
    val _mapSkillUpgrade = mapSkillUpgrade



    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {



        val view = LayoutInflater.from(parent.context).inflate(R.layout.mon_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(evo3[position], context, _mapString, _mapMonster,
                _mapUid, _maxStat, _mapSkillUpgrade

                )
        holder.bindEvo1(_mapString, evo1[position], context, _mapMonster)
        holder.bindEvo2(_mapString, evo2[position], context, _mapMonster)



    }

    override fun getItemCount() = evo3.size

//    override fun getItemId(position: Int): Long = originalAstromon[position].evo3.monsterUid.toLong()
//    {
//        return super.getItemId(position)
//    }

    fun GetUidByPosition (position: Int) : Int {
        return originalAstromon[position].evo3.monsterUid
    }


    fun GetEvoGroupByPosition (position: Int): MonsterEvolutionGroup {
        return originalAstromon[position]
    }


    override fun getTextToShowInBubble(pos: Int): String {
        return _mapString[_mapMonster[evo3[pos].monsterUid]!!.name]!!
    }

    init {
        filterEvo()


    }


    fun filterEvo() {
        val evo3: MutableList<MsgDictItem> = mutableListOf()
        val evo2: MutableList<MsgDictItem> = mutableListOf()
        val evo1: MutableList<MsgDictItem> = mutableListOf()

        for (dictItem  in originalAstromon) {
//            val evoStage = UtilFunctions.GetAstromonEvoStageByID(_mapMonster, dictItem monsterUid)

            evo1.add(dictItem.evo1)
            evo2.add(dictItem.evo2)
            evo3.add(dictItem.evo3)

        }
        this.evo1 = evo1
        this.evo2 = evo2
        this.evo3 = evo3
        notifyDataSetChanged()
    }


    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {

        val protoHelper = ProtobufHelper()

        fun bindView(dictItem: MsgDictItem, context: Context,
                     mapString : Map<Int, String> ,
                     mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>,
                     mapUid: Map<String, MsgUidOuterClass.MsgUid>,
                     maxStat: HashMap<String, Float>,
                     mapSkillUpgrade: Map<Int, MsgMonsterUpgradeSkillOuterClass.MsgMonsterUpgradeSkill>
                     ){



            with(dictItem) {

                itemView.tvEvo3.text =   UtilFunctions.GetAstromonNameByID(mapString, mapMonster, monsterUid)

                val evo3Icon = UtilFunctions.GetAstromonResourceByID(mapMonster, context, monsterUid)


                Picasso.with(itemView.context)
                        .load( evo3Icon)
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(itemView.ivEvo3)

                Picasso.with(itemView.context)
                        .load(UtilFunctions.GetGradeResourceByMonUid(mapMonster, monsterUid))
                        .error(R.drawable.s1)
                        .placeholder(R.drawable.s1)
                        .into(itemView.ivGradeEvo3)

                Picasso.with(itemView.context)
                        .load(UtilFunctions.GetElementResourceByMonUid(mapMonster, monsterUid))
                        .error(R.drawable.element_fire)
                        .placeholder(R.drawable.element_fire)
                        .into(itemView.frame_evo3)


                val mapEffect = (context as MonDBActivity).GetMapEffect()
                val mapSkill = context.GetMapSkill()

//                val monValue : HashMap<String, Float> =
//                        context.GetMonster(monsterUid,  60, 0, MonsterGradeOuterClass.MonsterGrade.MG_6,
//                        MonsterStatWeightTypeOuterClass.MonsterStatWeightType.MS_Normal , true)
//

                val listMonBar = protoHelper.ReadMapMonBar(context)
                val monMap : Map<Int, SmjBarObjectOuterClass.SmjBarObject> = listMonBar.associateBy ({ it.monsterUid  }, { it.detailSize } )
                val monMapStatValue : Map<Int, SmjBarParentObjectOuterClass.SmjBarParentObject > = listMonBar.associateBy ({ it.monsterUid  }, { it } )
                val monValue = monMap[monsterUid]!!


                val hpStat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_HP ) + ": " +
                        NumberFormat.getNumberInstance(Locale.US).format(Math.round(monMapStatValue[monsterUid]!!.hp.toDouble()).toInt()).toString()
                val atkStat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_ATTACK ) + ": " +
                        NumberFormat.getNumberInstance(Locale.US).format(Math.round(monMapStatValue[monsterUid]!!.atk.toDouble()).toInt()).toString()
                val defStat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_DEFENSE ) + ": " +
                        NumberFormat.getNumberInstance(Locale.US).format(Math.round(monMapStatValue[monsterUid]!!.def.toDouble()).toInt()).toString()
                val healStat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_HEAL ) + ": " +
                        NumberFormat.getNumberInstance(Locale.US).format(Math.round(monMapStatValue[monsterUid]!!.heal.toDouble()).toInt()).toString()
                val critDmgStat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_CRI_DMG ) + ": " +
                        NumberFormat.getNumberInstance(Locale.US).format(Math.round(  ((monMapStatValue[monsterUid]!!.critDmg -1) *100f)   .toDouble()).toInt()).toString()
                val critRateStat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_CRI_RATE ) + ": " +
                        NumberFormat.getNumberInstance(Locale.US).format(Math.round(  ((monMapStatValue[monsterUid]!!.critRate) * 100f) .toDouble()).toInt()).toString()
                val resistStat = UtilFunctions.GetStringByString(mapString, mapUid, Variables.STRING_RESIST ) + ": " +
                        NumberFormat.getNumberInstance(Locale.US).format(Math.round(  ((monMapStatValue[monsterUid]!!.resist) * 100f).toDouble()).toInt()).toString()


                itemView.tvHp.text = hpStat
                itemView.tvAttack.text = atkStat
                itemView.tvDefense.text = defStat
                itemView.tvRecovery.text = healStat
                itemView.tvCritDmg.text = critDmgStat
                itemView.tvCritRate.text = critRateStat
                itemView.tvResist.text = resistStat

                itemView.ivBarHp.layoutParams.width = monValue.hp.toInt()
                itemView.ivBarAttack.layoutParams.width = monValue.atk.toInt()
                itemView.ivBarDefense.layoutParams.width = monValue.def.toInt()
                itemView.ivBarRecovery.layoutParams.width = monValue.heal.toInt()
                itemView.ivBarCritDmg.layoutParams.width = monValue.critDmg.toInt()
                itemView.ivBarCritRate.layoutParams.width = monValue.critRate.toInt()
                itemView.ivBarResist.layoutParams.width = monValue.resist.toInt()


                
//
                val hp = "/" + NumberFormat.getNumberInstance(Locale.US).format(  Math.round(GetMaxStat(maxStat,"hp")) )
                val atk = "/" +NumberFormat.getNumberInstance(Locale.US).format( Math.round(GetMaxStat(maxStat,"atk")))
                val def = "/" +NumberFormat.getNumberInstance(Locale.US).format( Math.round(GetMaxStat(maxStat,"def")))
                val heal = "/" +NumberFormat.getNumberInstance(Locale.US).format(Math.round(GetMaxStat(maxStat,"heal")))
                val critDmg = "/" +NumberFormat.getNumberInstance(Locale.US).format( (GetMaxStat(maxStat,"crit_dmg") -1) *100f  ) + "%+"
                val critRate = "/" +NumberFormat.getNumberInstance(Locale.US).format(  (GetMaxStat(maxStat,"crit_rate"))  * 100f ) + "%"
                val resist = "/" +NumberFormat.getNumberInstance(Locale.US).format( (GetMaxStat(maxStat,"resist") *100f) ) + "%"
//
                itemView.tvMaxHp.text = hp
                itemView.tvMaxAttack.text = atk
                itemView.tvMaxDefense.text = def
                itemView.tvMaxRecovery.text = heal
                itemView.tvMaxCritDmg.text = critDmg
                itemView.tvMaxCritRate.text = critRate
                itemView.tvMaxResist.text = resist
//
                itemView.tvType.text = UtilFunctions.GetMonsterType(mapMonster, mapString, mapUid , monsterUid)


                val gender = mapMonster[monsterUid]!!.genderType


                itemView.ivGender.visibility = View.VISIBLE

                when (gender) {
                    MonsterGenderTypeOuterClass.MonsterGenderType.Mon_Gender_Type_Male ->

                        Picasso.with(itemView.context)
                            .load(R.drawable.ic_male)
                            .error(R.drawable.skill_blank)
                            .placeholder(R.drawable.skill_blank)
                            .into(itemView.ivGender)
                    MonsterGenderTypeOuterClass.MonsterGenderType.Mon_Gender_Type_Female ->

                        Picasso.with(itemView.context)
                            .load(R.drawable.ic_female)
                            .error(R.drawable.skill_blank)
                            .placeholder(R.drawable.skill_blank)
                            .into(itemView.ivGender)
                    else ->
                        itemView.ivGender.visibility = View.GONE
                }






//                itemView.tvSkillTitle.text = UtilFunctions.GetSkillText(mapString, mapUid)["default"]
                itemView.tvSkillLeaderText.text = UtilFunctions.GetSkillText(mapString, mapUid)["leader"]
                itemView.tvSkillPassiveText.text = UtilFunctions.GetSkillText(mapString, mapUid)["passive"]
                itemView.tvSkillActiveText.text = UtilFunctions.GetSkillText(mapString, mapUid)["active"]
//
//
//
//
//
                val defaultSkillEffect = UtilFunctions.GetSkillEffect(mapEffect, mapMonster, monsterUid)["default"] as MsgStatusEffectOuterClass.MsgStatusEffect
                val activeSkillEffect = UtilFunctions.GetSkillEffect(mapEffect, mapMonster, monsterUid)["active"] as MsgStatusEffectOuterClass.MsgStatusEffect


                val allSkill = UtilFunctions.GetSkill(mapSkill, mapMonster, monsterUid)

//                GetSkill

                itemView.llMonBg.setBackgroundColor(UtilFunctions.GetElementBG(context, mapMonster, monsterUid))

                val defaultSkill = allSkill["default"]!!
                val activeSkill = allSkill["active"]!!

                val leaderSkill = allSkill["leader"]!!
                val leaderEffect = UtilFunctions.GetStatusEffectByUid(mapEffect, leaderSkill.statusEffect)

                itemView.tvVariantSkill.text = mapString[leaderEffect.name]
//                itemView.tvVariantSkillDesc.text = UtilFunctions.GetFormattedLeaderDescString(mapString, leaderEffect)
//
                itemView.tvPassiveSkillEffect.text = mapString[defaultSkillEffect.name]
                itemView.tvActiveSkillEffect.text = mapString[activeSkillEffect.name]
//
//                itemView.tvPassiveSkillDesc.text = UtilFunctions.GetFormattedDescString(mapString, defaultSkill)







                val skillUpgrade = mapSkillUpgrade[mapMonster[monsterUid]!!.skillLevel]


                if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                    itemView.tvPassiveSkillEffectDesc.text = Html.fromHtml(
                            UtilFunctions.GetFormattedDescString(mapString, defaultSkillEffect, skillUpgrade, Variables.SKILL_DEFAULT )
                            ,Html.FROM_HTML_MODE_LEGACY)

                    itemView.tvActiveSkillEffectDesc.text = Html.fromHtml(
                            UtilFunctions.GetFormattedDescString(mapString, activeSkillEffect, skillUpgrade, Variables.SKILL_ACTIVE )
                            ,Html.FROM_HTML_MODE_LEGACY)

                    itemView.tvVariantSkillDesc.text = Html.fromHtml(
                            UtilFunctions.GetFormattedLeaderDescString(mapString, leaderEffect)
                            ,Html.FROM_HTML_MODE_LEGACY)


                } else {
                    itemView.tvPassiveSkillEffectDesc.text = Html.fromHtml(
                            UtilFunctions.GetFormattedDescString(mapString, defaultSkillEffect, skillUpgrade, Variables.SKILL_DEFAULT ))
                    itemView.tvActiveSkillEffectDesc.text = Html.fromHtml(
                            UtilFunctions.GetFormattedDescString(mapString, activeSkillEffect, skillUpgrade, Variables.SKILL_ACTIVE ))
                    itemView.tvVariantSkillDesc.text = Html.fromHtml(
                            UtilFunctions.GetFormattedLeaderDescString(mapString, leaderEffect))
                }





//                itemView.tvActiveSkillDesc.text = UtilFunctions.GetFormattedDescString(mapString,activeSkill)
//
                Picasso.with(itemView.context)
                        .load( UtilFunctions.GetSkillEffectResource(context, defaultSkillEffect.subType.name))
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(itemView.ivPassiveSkillEffect)

                Picasso.with(itemView.context)
                        .load(UtilFunctions.GetSkillEffectResource(context, activeSkillEffect.subType.name))
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(itemView.ivActiveSkillEffect)


//
//
                Picasso.with(itemView.context)
                        .load(UtilFunctions.GetSkillEffectResource(context, leaderSkill.icon))
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(itemView.ivVariantSkill)


                Picasso.with(itemView.context)
                        .load(UtilFunctions.GetSkillResource(context, defaultSkill.icon))
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(itemView.ivPassiveSkill)

                Picasso.with(itemView.context)
                        .load(UtilFunctions.GetSkillResource(context, activeSkill.icon))
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(itemView.ivActiveSkill)

//                itemView.tvActiveSkill.text = mapString[activeSkill.name]
//                itemView.tvPassiveSkill.text = mapString[defaultSkill.name]



//                var defPow  = defaultSkill.action.weight
                var defDmg = 0f
                var defPowString: String

                var actDmg = 0f
                var actPowString: String

                var defEffectValue = 0f
                var actEffectValue = 0f


                
                if(skillUpgrade != null) {
                    skillUpgrade.defaultValuesList
                            .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.SkillDamage }
                            .forEach { defDmg += it.`val` }
                    skillUpgrade.activeValuesList
                            .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.SkillDamage }
                            .forEach { actDmg += it.`val` }

                    skillUpgrade.defaultValuesList
                            .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.PassiveVal }
                            .filter { defaultSkillEffect.vFloat > 0f }
                            .forEach { defEffectValue += ((it.`val`) *100f) }
                    skillUpgrade.activeValuesList
                            .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.PassiveVal }
                            .filter { activeSkillEffect.vFloat > 0f }
                            .forEach { actEffectValue += ((it.`val`) *100f) }

                    }



                if (  defaultSkillEffect.vFloat == 0f && defaultSkillEffect.vInt == 0) {
                    itemView.tvPassiveEffectValue.text = "-"
                } else if(defaultSkillEffect.vFloat == 0f) {

                    if(defEffectValue > 0) {
                        val value = defaultSkillEffect.vInt.toString() + "(+" + defEffectValue.toInt().toString() + ")"
                        itemView.tvPassiveEffectValue.text = value
                    } else {
                        itemView.tvPassiveEffectValue.text = defaultSkillEffect.vInt.toString()
                    }

                } else if (defaultSkillEffect.vFloat > 0f) {

                    if(defEffectValue > 0) {
                        val value = (defaultSkillEffect.vFloat * 100f).toInt().toString() +"(+"+ defEffectValue.toInt().toString()+")" + "%"
                        itemView.tvPassiveEffectValue.text = value

                    } else {
                        val value = (defaultSkillEffect.vFloat * 100f).toInt().toString() + "%"
                        itemView.tvPassiveEffectValue.text = value
                    }

                }


                if (activeSkillEffect.vFloat == 0f && activeSkillEffect.vInt == 0) {
                    itemView.tvActiveEffectValue.text = "-"
                } else if(activeSkillEffect.vFloat == 0f) {

                    if(actEffectValue > 0) {
                        val value = activeSkillEffect.vInt.toString() + "(+" + actEffectValue.toInt().toString() + ")"
                        itemView.tvActiveEffectValue.text = value

                    } else {
                        itemView.tvActiveEffectValue.text = activeSkillEffect.vInt.toString()
                    }


                } else if (activeSkillEffect.vFloat > 0f) {

                    if(actEffectValue > 0) {
                        val value = (activeSkillEffect.vFloat * 100f).toInt().toString() +"(+"+ actEffectValue.toInt().toString()+")" + "%"
                        itemView.tvActiveEffectValue.text = value

                    } else {
                        val value = (activeSkillEffect.vFloat * 100f).toInt().toString() + "%"
                        itemView.tvActiveEffectValue.text = value
                    }


                }



                if(defDmg > 0f) {
                    defPowString = ((defaultSkill.action.weight) * 100f).toInt()  .toString() + "(+" + (defaultSkill.action.weight * defDmg * 100f).toInt().toString() + ")%"
                } else {
                    defPowString = ((defaultSkill.action.weight) * 100f).toInt().toString() + "%"
                }

                if(actDmg > 0f) {
                    actPowString = ((activeSkill.action.weight) * 100f).toInt()  .toString() + "(+" + (activeSkill.action.weight * actDmg * 100f).toInt().toString() + ")%"
                } else {
                    actPowString = ((activeSkill.action.weight) * 100f).toInt().toString() + "%"
                }


                itemView.tvActiveSkillPower.text = actPowString
                itemView.tvPassiveSkillPower.text = defPowString

                itemView.tvActiveSkillType.text = activeSkill.action.type.name
                itemView.tvPassiveSkillType.text = defaultSkill.action.type.name

                itemView.tvActiveSkillTarget.text = context.getString(UtilFunctions.GetTargetStringResource( activeSkill.target))
                itemView.tvPassiveSkillTarget.text = context.getString(UtilFunctions.GetTargetStringResource( defaultSkill.target))

                itemView.tvActiveSkillSoulSize.text = activeSkill.soulSize.toString()
                itemView.tvPassiveSkillSoulSize.text = defaultSkill.soulSize.toString()



            }
        }

        fun bindEvo1(mapString: Map<Int, String>, dictItem: MsgDictItem, context: Context, mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster> ) {
            with(dictItem) {


//                itemView.tvEvo1.text =   UtilFunctions.GetAstromonNameByID(mapString, mapMonster, monsterUid)

                Picasso.with(itemView.context)
                        .load( UtilFunctions.GetAstromonResourceByID(mapMonster, context, monsterUid)  )
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(itemView.ivEvo1)

                Picasso.with(itemView.context)
                        .load(UtilFunctions.GetGradeResourceByMonUid(mapMonster, monsterUid))
                        .error(R.drawable.s1)
                        .placeholder(R.drawable.s1)
                        .into(itemView.ivGradeEvo1)

                Picasso.with(itemView.context)
                        .load(UtilFunctions.GetElementResourceByMonUid(mapMonster, monsterUid))
                        .error(R.drawable.element_fire)
                        .placeholder(R.drawable.element_fire)
                        .into(itemView.frame_evo1)
            }
        }

        fun bindEvo2(mapString: Map<Int, String>, dictItem: MsgDictItem, context: Context, mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>) {
            with(dictItem) {

//                itemView.tvEvo2.text =   UtilFunctions.GetAstromonNameByID(mapString, mapMonster, monsterUid)


                Picasso.with(itemView.context)
                        .load(UtilFunctions.GetAstromonResourceByID(mapMonster, context, monsterUid)  )
                        .error(R.drawable.skill_blank)
                        .placeholder(R.drawable.skill_blank)
                        .into(itemView.ivEvo2)

                Picasso.with(itemView.context)
                        .load(UtilFunctions.GetGradeResourceByMonUid(mapMonster, monsterUid))
                        .error(R.drawable.s1)
                        .placeholder(R.drawable.s1)
                        .into(itemView.ivGradeEvo2)

                Picasso.with(itemView.context)
                        .load(UtilFunctions.GetElementResourceByMonUid(mapMonster, monsterUid))
                        .error(R.drawable.element_fire)
                        .placeholder(R.drawable.element_fire)
                        .into(itemView.frame_evo2)
            }
        }

        fun GetMaxStat (maxStat: HashMap<String, Float>, statType: String) : Float {
            return maxStat[statType]!!
        }



    }




}


