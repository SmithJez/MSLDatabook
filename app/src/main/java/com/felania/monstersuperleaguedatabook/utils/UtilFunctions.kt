package com.felania.monstersuperleaguedatabook.utils

import android.content.Context
import android.support.v4.content.res.ResourcesCompat
import android.util.Log
import com.felania.monstersuperleaguedatabook.R
import com.felania.msldb.*
import com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType
import com.felania.msldb.MonsterEvolutionOuterClass.MonsterEvolution.ME_1
import com.felania.msldb.MonsterEvolutionOuterClass.MonsterEvolution.ME_2
import com.felania.msldb.MonsterSkillTargetTypeOuterClass.MonsterSkillTargetType
import com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData
import com.felania.msldb.MsgStageMonsterOuterClass.MsgStageMonster
import com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster
import java.io.File
import java.io.FileInputStream
import java.io.ObjectInputStream
import java.math.BigDecimal
import java.util.regex.Pattern


class UtilFunctions {



    companion object {

        fun ReadObject(context: Context, fileName: String): Any {

            val file = File(context.getDir("data", Context.MODE_PRIVATE), fileName)

            val ois = ObjectInputStream(FileInputStream(file))
            return ois.readObject()
        }

        fun GetAstromonEvoStageByID (mapMonster : Map<Int, MsgMonsterOuterClass.MsgMonster>, uid : Int) : Int {
            var evoStage : Int

//            var mapMonster = ReadObject(context, Variables.MAP_MONSTER) as HashMap<Int, MsgMonsterOuterClass.MsgMonster>

            try {
                evoStage = mapMonster[uid]!!.evolution.name.replace("ME_", "").toInt()
            } catch (e: Exception) {
                evoStage = 1
            }
            return evoStage

        }

        fun GetAstromonNameByID (mapString : Map<Int, String>,
                                 mapMonster : Map<Int, MsgMonsterOuterClass.MsgMonster>  ,
                                 uid : Int ): String? {

//            Log.wtf("uid ", "uid " + uid)
//            Log.wtf("uid ", "name " + mapMonster[uid]!!.name)
//            Log.wtf("uid ", "mapString " + mapString.size)

//            Log.wtf("nammamama", "andasdasd " + mapString[mapMonster[uid]!!.name] )

//            val mapString = ReadObject(context, Variables.MAP_STRING) as HashMap<Int, String>
//            val mapMonster = ReadObject(context, Variables.MAP_MONSTER) as HashMap<Int, MsgMonsterOuterClass.MsgMonster>

            return mapString[mapMonster[uid]!!.name]
        }

        fun GetAstromonResourceByID (mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>, context: Context, uid : Int): String {
            val resourceName : String =  mapMonster[uid]!!.resourceName.toLowerCase()
            val fullPath = "file://" + context.filesDir + "/" +    resourceName + ".webp"
            return fullPath
        }

        fun GetAstromonResourceByID ( context: Context, monster : MsgMonsterOuterClass.MsgMonster): String {
            val resourceName : String =  monster.resourceName.toLowerCase()
            val fullPath = "file://" + context.filesDir + "/" +    resourceName + ".webp"
            return fullPath
        }

        fun GetAstromonResourceByID ( context: Context, res: String): String {
            val resourceName : String =  res.toLowerCase()
            val fullPath = "file://" + context.filesDir + "/" +    resourceName + ".webp"
            return fullPath
        }

        fun GetStageMonsterExtraStat (stageMonster: MsgStageMonster, monster: MsgMonsterOuterClass.MsgMonster): MutableMap<String, Float> {

            val critDmg = stageMonster.addCriticalDamagePercent + monster.criticalDamage
            val critRate = stageMonster.addCriticalProbPercent + monster.criticalProb
            val resist = stageMonster.addStatusEffectResistancePercent + monster.statusEffectResistance

            val retMap : MutableMap<String, Float> = mutableMapOf()
            retMap.put(Variables.CRIT_DMG, critDmg)
            retMap.put(Variables.CRIT_RATE, critRate)
            retMap.put(Variables.RESIST, resist)

            return retMap




        }



        fun GetGradeResourceByNumber (grade: Int) : Int {
            when (grade) {
                1 -> {
                    return R.drawable.s1
                }
                2 -> {
                    return R.drawable.s2
                }
                3 -> {
                    return R.drawable.s3
                }
                4 -> {
                    return R.drawable.s4
                }
                5 -> {
                    return R.drawable.s5
                }
                6 -> {
                    return R.drawable.s6
                }
                else -> {
                    return R.drawable.s5
                }


            }
        }



        fun GetGradeResourceByMonUid (mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>, uid : Int) : Int {
            val grade : Int = mapMonster[uid]!!.bornGrade.number

            when (grade) {
                1 -> {
                    return R.drawable.s1
                }
                2 -> {
                    return R.drawable.s2
                }
                3 -> {
                    return R.drawable.s3
                }
                4 -> {
                    return R.drawable.s4
                }
                5 -> {
                    return R.drawable.s5
                }
                6 -> {
                    return R.drawable.s6
                }
                else -> {
                    return R.drawable.s5
                }

            }

        }


        fun GetGradeResourceByStageMon (stageMonster: Map <Int, MsgStageMonster>, uid : Int) : Int {
            val grade : Int = stageMonster[uid]!!.monsterSkillGrade.number

            when (grade) {
                1 -> {
                    return R.drawable.s1
                }
                2 -> {
                    return R.drawable.s2
                }
                3 -> {
                    return R.drawable.s3
                }
                4 -> {
                    return R.drawable.s4
                }
                5 -> {
                    return R.drawable.s5
                }
                6 -> {
                    return R.drawable.s6
                }
                else -> {
                    return R.drawable.s5
                }

            }

        }

        fun GetTargetText (target: MonsterSkillTargetType): String {

            when (target) {
                MonsterSkillTargetType.MST_One -> {
                    return Variables.TARGET_ONE
                }
                MonsterSkillTargetType.MST_All -> {
                    return Variables.TARGET_ALL
                }
                MonsterSkillTargetType.MST_Team -> {
                    return Variables.TARGET_TEAM
                }
                MonsterSkillTargetType.MST_EntireAll -> {
                    return Variables.TARGET_ENTIRE_ALL
                }
                else -> {
                    return "dump"
                }

            }


        }


        fun GetElementText (mapString: Map<Int, String>, mapUid: Map<String, MsgUidOuterClass.MsgUid>, element: MonsterElementTypeOuterClass.MonsterElementType) : String {
//            val element : String = mapMonster[uid]!!.element.name

            when (element) {
                MonsterElementType.ME_Fire -> {
                    return mapString[mapUid["str.monster.element.fire"]!!.uid]!!
                }
                MonsterElementType.ME_Water -> {
                    return mapString[mapUid["str.monster.element.water"]!!.uid]!!
                }
                MonsterElementType.ME_Tree -> {
                    return mapString[mapUid["str.monster.element.tree"]!!.uid]!!
                }
                MonsterElementType.ME_Light -> {
                    return mapString[mapUid["str.monster.element.light"]!!.uid]!!
                }
                MonsterElementType.ME_Dark -> {
                    return mapString[mapUid["str.monster.element.dark"]!!.uid]!!
                }

                else -> {
                    return "null"
                }

            }
        }




        fun GetElementBG(context: Context, mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>, uid : Int): Int {

            val element : String = mapMonster[uid]!!.element.name

            when (element) {
                "ME_Fire" -> {
                    return  ResourcesCompat.getColor (context.resources, R.color.fire_bg,null)
                }
                "ME_Water" -> {
                    return ResourcesCompat.getColor (context.resources, R.color.water_bg,null)
                }
                "ME_Tree" -> {
                    return ResourcesCompat.getColor (context.resources, R.color.wood_bg,null)
                }
                "ME_Light" -> {
                    return ResourcesCompat.getColor (context.resources, R.color.light_bg,null)
                }
                "ME_Dark" -> {
                    return ResourcesCompat.getColor (context.resources, R.color.dark_bg,null)
                }

                else -> {
                    return ResourcesCompat.getColor (context.resources, R.color.fire_bg,null)
                }

            }

        }


        fun GetElementResourceByMonUid (mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>,
                                        uid : Int): Int {

            val element : String = mapMonster[uid]!!.element.name
            val evo  = mapMonster[uid]!!.evolution

            when (element) {
                "ME_Fire" -> {
                    return when (evo) {
                        ME_1 -> {
                            R.drawable.frame_evo1_fire
                        }
                        ME_2 -> {
                            R.drawable.frame_evo2_fire
                        } else -> {
                            R.drawable.frame_evo3_fire
                        }
                    }
                }
                "ME_Water" -> {
                    return when (evo) {
                        ME_1 -> {
                            R.drawable.frame_evo1_water
                        }
                        ME_2 -> {
                            R.drawable.frame_evo2_water
                        } else -> {
                            R.drawable.frame_evo3_water
                        }
                    }
                }
                "ME_Tree" -> {
                    return when (evo) {
                        ME_1 -> {
                            R.drawable.frame_evo1_wood
                        }
                        ME_2 -> {
                            R.drawable.frame_evo2_wood
                        } else -> {
                            R.drawable.frame_evo3_wood
                        }
                    }
                }
                "ME_Light" -> {
                    return when (evo) {
                        ME_1 -> {
                            R.drawable.frame_evo1_light
                        }
                        ME_2 -> {
                            R.drawable.frame_evo2_light
                        } else -> {
                            R.drawable.frame_evo3_light
                        }
                    }
                }
                "ME_Dark" -> {
                    return when (evo) {
                        ME_1 -> {
                            R.drawable.frame_evo1_dark
                        }
                        ME_2 -> {
                            R.drawable.frame_evo2_dark
                        } else -> {
                            R.drawable.frame_evo3_dark
                        }
                    }
                }

                else -> {
                    return when (evo) {
                        ME_1 -> {
                            R.drawable.frame_evo1_fire
                        }
                        ME_2 -> {
                            R.drawable.frame_evo2_fire
                        } else -> {
                            R.drawable.frame_evo3_fire
                        }
                    }
                }
            }

        }





        fun GetMonster (
                mapSetting: Map<Int, MsgSettingOuterClass.MsgSetting>,
                mapUid: Map<String, MsgUidOuterClass.MsgUid>,
                mapType: Map<String, MsgMonsterTypeOuterClass.MsgMonsterType>,
                mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>,
                uid : Int, lvl : Int,
                awaken : Int,
                grade: MonsterGradeOuterClass.MonsterGrade,
                swt : MonsterStatWeightTypeOuterClass.MonsterStatWeightType,
                needBarSize : Boolean = false,
                mapMonBar : HashMap<Int, BarObject> = hashMapOf()
                        ) : HashMap<String, Float> {

            val msgMon : MsgMonsterOuterClass.MsgMonster = mapMonster[uid]!!
            val hashMonster = hashMapOf<String, Float>()
            val monValue = MonsterValue(mapSetting, mapUid, mapType, msgMon, grade, swt )

            val num : Float = monValue["atk"]!!
            val num2 : Float = monValue["def"]!!
            val num3 : Float = monValue["heal"]!!
            val num4 : Float = monValue["hp"]!!

            val num5 : Float = num * msgMon.incAttack
            val num6 : Float = num2 * msgMon.incDefence
            val num7 : Float = num3 * msgMon.incHeal
            val num8 : Float = num4 * msgMon.incHp
            val num9 : Int = lvl - 1

            val num10 = num + num5 * num9
            val num11 = num2 + num6 * num9
            val num12 = num3 + num7 * num9
            val num13 = num4 + num8 * num9

            hashMonster.put("atk" , num10)
            hashMonster.put("def" , num11)
            hashMonster.put("heal" , num12)
            hashMonster.put("hp" ,  num13)
            hashMonster.put("crit_dmg", msgMon.criticalDamage)
            hashMonster.put("crit_rate", msgMon.criticalProb)
            hashMonster.put("resist", msgMon.statusEffectResistance)

            if(needBarSize) {
                hashMonster.put("barHp", mapMonBar[uid]!!.hp)
                hashMonster.put("barAtk", mapMonBar[uid]!!.atk)
                hashMonster.put("barDef", mapMonBar[uid]!!.def)
                hashMonster.put("barHeal", mapMonBar[uid]!!.heal)
                hashMonster.put("barCritDmg", mapMonBar[uid]!!.critDmg)
                hashMonster.put("barCritRate", mapMonBar[uid]!!.critRate)
                hashMonster.put("barResist", mapMonBar[uid]!!.resist)
            }

            return hashMonster
        }



        fun MonsterValue (
                mapSetting: Map<Int, MsgSettingOuterClass.MsgSetting>,
                mapUid: Map<String, MsgUidOuterClass.MsgUid>,
                mapType: Map<String, MsgMonsterTypeOuterClass.MsgMonsterType>,
                mon : MsgMonsterOuterClass.MsgMonster,
                grade : MonsterGradeOuterClass.MonsterGrade,
                swt : MonsterStatWeightTypeOuterClass.MonsterStatWeightType) : HashMap<String, Float> {
            val monValue = hashMapOf<String, Float>()

            val monsterType : MsgMonsterTypeOuterClass.MsgMonsterType = GetMonsterType(mapType , mon.evolution, swt, mon.defStatType)


            val monGradeWeight = GetMonsterGradeWeight(mapSetting, mapUid, grade)

            var num : Float = monsterType.sp * monsterType.attackWeight
            var num2 : Float = monsterType.sp * monsterType.defenceWeight
            var num3 : Float = monsterType.sp * monsterType.healWeight
            var num4 : Float = monsterType.sp - (num + num2 + num3)

            num += mon.defAttack
            num2 += mon.defDefence
            num3 += mon.defHeal
            num4 += mon.defHp

            num += num * monGradeWeight
            num2 += num2 * monGradeWeight
            num3 += num3 * monGradeWeight
            num4 += num4 * monGradeWeight

            monValue.put ("atk", num )
            monValue.put ("def", num2 )
            monValue.put ("hp", num4 )
            monValue.put ("heal", num3 )

            return monValue
        }


        fun GetMonsterType (mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>,
                            mapString: Map<Int, String>,
                            mapUid: Map<String, MsgUidOuterClass.MsgUid>,
                            uid : Int) : String {

            val monType : String = mapMonster[uid]!!.defStatType.name.replace("MS_", "").toLowerCase()
            val uidType = "ustr.monster.type." + monType

            return mapString[mapUid[uidType]!!.uid].toString()
        }


        fun GetMonsterType (mapType: MonsterStatTypeOuterClass.MonsterStatType,
                            mapString: Map<Int, String>,
                            mapUid: Map<String, MsgUidOuterClass.MsgUid>) : String {

            val monType : String = mapType.name.replace("MS_", "").toLowerCase()
            val uidType = "ustr.monster.type." + monType

            return mapString[mapUid[uidType]!!.uid].toString()
        }


        fun GetMonsterType (mapType: Map<String, MsgMonsterTypeOuterClass.MsgMonsterType>,
                            me : MonsterEvolutionOuterClass.MonsterEvolution,
                            swt : MonsterStatWeightTypeOuterClass.MonsterStatWeightType,
                            st : MonsterStatTypeOuterClass.MonsterStatType) : MsgMonsterTypeOuterClass.MsgMonsterType {

//            val mapType = ReadObject(context, Variables.MAP_TYPE) as HashMap<String, MsgMonsterTypeOuterClass.MsgMonsterType>

            val result =  mapType[GetMonsterTypeKey(me, swt,st)]

            return result!!

        }

        fun GetMonsterTypeKey (me : MonsterEvolutionOuterClass.MonsterEvolution,
                               swt : MonsterStatWeightTypeOuterClass.MonsterStatWeightType,
                               st : MonsterStatTypeOuterClass.MonsterStatType) : String {

            return String.format("%s_%s_%s", me.name, swt.name, st.name   )
        }




        fun GetMonsterGradeWeight (mapSetting: Map<Int, MsgSettingOuterClass.MsgSetting>,
                                   mapUid: Map<String, MsgUidOuterClass.MsgUid>,
                                   grade : MonsterGradeOuterClass.MonsterGrade) : Float {

            val setting = GetSettingByStringUid(mapSetting, mapUid, String.format("monster.grade%s.weight", grade.number))!!

            return setting.vFloat
        }



        fun GetSettingByStringUid (mapSetting: Map<Int, MsgSettingOuterClass.MsgSetting>,
                                   mapUid: Map<String, MsgUidOuterClass.MsgUid>,

                                   strUid : String) : MsgSettingOuterClass.MsgSetting? {

//            val mapSetting = ReadObject(context, Variables.MAP_SETTING) as HashMap<Int, MsgSettingOuterClass.MsgSetting>
//            val mapUid = ReadObject(context, Variables.MAP_UID) as HashMap<String, MsgUidOuterClass.MsgUid>

            val setting  = mapSetting[mapUid[strUid]!!.uid]

            return setting

        }


        fun GetSynergyText (mapString: Map<Int, String>, mapUid: Map<String, MsgUidOuterClass.MsgUid>) : HashMap<String, String> {
            val map : HashMap<String, String> = hashMapOf()

            val uidElement = "ustr.link.bonus.dic.tap.element" // Skill Text
            val uidGender = "ustr.link.bonus.dic.tap.gender"
            val uidType = "ustr.link.bonus.dic.tap.type"
            val uidEvolution = "ustr.link.bonus.dic.tap.evolution"
            val uidHidden = "ustr.link.bonus.dic.tap.hidden"

            map.put("element", mapString[mapUid[uidElement]!!.uid].toString())
            map.put("gender", mapString[mapUid[uidGender]!!.uid].toString())
            map.put("type", mapString[mapUid[uidType]!!.uid].toString())
            map.put("evolution", mapString[mapUid[uidEvolution]!!.uid].toString())
            map.put("hidden", mapString[mapUid[uidHidden]!!.uid].toString())

            return map
        }



        fun GetSkillText (mapString: Map<Int, String>, mapUid: Map<String, MsgUidOuterClass.MsgUid>) : HashMap<String, String> {

//            val mapString = ReadObject(context, Variables.MAP_STRING) as HashMap<Int, String>
//            val mapUid = ReadObject(context, Variables.MAP_UID) as HashMap<String, MsgUidOuterClass.MsgUid>

            val map : HashMap<String, String> = hashMapOf()

            val uidSkillDefault = "ustr.default.skill" // Skill Text
            val uidSkillActive = "ustr.active.skill"
            val uidSkillPassive = "ustr.skill.default"
            val uidSkillLeader = "ustr.leader.skill"

            map.put("default", mapString[mapUid[uidSkillDefault]!!.uid].toString())
            map.put("active", mapString[mapUid[uidSkillActive]!!.uid].toString())
            map.put("passive", mapString[mapUid[uidSkillPassive]!!.uid].toString())
            map.put("leader", mapString[mapUid[uidSkillLeader]!!.uid].toString())




            return map

        }
//
//        fun GetStringByStringUid (mapString: Map<Int, String>, mapUid: Map<String, MsgUidOuterClass.MsgUid>, string: String) : String {
//
//            return mapString[mapUid[string]!!.uid].toString()
//        }

        fun GetStringByString (mapString: Map<Int, String>, mapUid: Map<String, MsgUidOuterClass.MsgUid>, key: String): String {
            return mapString[mapUid[key]!!.uid].toString()
        }

        fun GetMonsterSkillLevelByUid(uid: Int, mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>): Int {

            return mapMonster[uid]!!.skillLevel
        }


        fun GetMonster (uid: Int,  mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>) : MsgMonsterOuterClass.MsgMonster {

            return mapMonster[uid]!!
        }



        fun GetSkillEffect(mapEffect: Map<Int, MsgStatusEffectOuterClass.MsgStatusEffect>,
                           mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>,
                           uid: Int) : java.util.HashMap<String, MsgStatusEffectOuterClass.MsgStatusEffect> {

            val map : HashMap<String, MsgStatusEffectOuterClass.MsgStatusEffect> = hashMapOf()

//            val mapEffect = ReadObject(context, Variables.MAP_EFFECT) as java.util.HashMap<Int, MsgStatusEffectOuterClass.MsgStatusEffect>

//            val mapMonster = ReadObject(context, Variables.MAP_MONSTER) as HashMap<Int, MsgMonsterOuterClass.MsgMonster>

            map.put("default", mapEffect[mapMonster[uid]!!.defaultSkillStatusEffectBeyond] as MsgStatusEffectOuterClass.MsgStatusEffect)
            map.put("active", mapEffect[mapMonster[uid]!!.activeSkillStatusEffectBeyond] as MsgStatusEffectOuterClass.MsgStatusEffect)

            return map
        }


        fun GetSkillUpgradeValue (skillUpgrade: MsgMonsterUpgradeSkillOuterClass.MsgMonsterUpgradeSkill,
                                  skillType: String, num: Int): Int {

            var value = 0

            when(skillType) {

                Variables.SKILL_DEFAULT -> {

                    if(num == 0) {
                        skillUpgrade.defaultValuesList
                                .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.PassiveVal }
                                .forEach { value += it.`val`.toInt() }
                    } else {
                        skillUpgrade.defaultValuesList
                                .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.PassiveVal }
                                .forEach { value += ((it.`val`) * 100f).toInt() }
                    }
                }

                Variables.SKILL_ACTIVE -> {

                    if(num == 0) {
                        skillUpgrade.activeValuesList
                                .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.PassiveVal }
                                .forEach { value += it.`val`.toInt() }
                    } else {
                        skillUpgrade.activeValuesList
                                .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.PassiveVal }
                                .forEach { value += ((it.`val`) * 100f).toInt() }
                    }
                }
            }


            return value

        }



        fun GetFormattedDescString (mapString: Map<Int, String>, m: MsgStatusEffectOuterClass.MsgStatusEffect,
                                    skillUpgrade: MsgMonsterUpgradeSkillOuterClass.MsgMonsterUpgradeSkill?,
                                    skillType: String
                                    ) : String {

            var text : String = mapString[m.desc].toString()
            var text2 = String()
            var chance: Float = 0f
            var dmg: Float = 0f
            var duration: Float = 0f


            var value: String = String()

            if(skillUpgrade != null) {
                when(skillType) {
                    Variables.SKILL_DEFAULT -> {
                        skillUpgrade.defaultValuesList
                                .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.PassiveProb }
                                .forEach { chance += ((it.`val`)) }
                    }
                    Variables.SKILL_ACTIVE -> {
                        skillUpgrade.activeValuesList
                                .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.PassiveProb }
                                .forEach { chance += (it.`val`) }
                    }
                }
            }

//            chance

            var argChance : String

            chance *= 100f

            if(chance > 0) {

                argChance = Math.round(m.prob * 100f).toString() + "(+" + chance.toInt().toString() + ")"
            } else {
                argChance = Math.round(m.prob * 100f).toString()
            }

            val arg : String = argChance




            if(skillUpgrade != null) {
                when(skillType) {
                    Variables.SKILL_DEFAULT -> {
                        skillUpgrade.defaultValuesList
                                .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.PassiveTurn }
                                .forEach { duration += ((it.turn)) }
                    }
                    Variables.SKILL_ACTIVE -> {
                        skillUpgrade.activeValuesList
                                .filter { it.upgradeType == MonsterUpgradeSkillData.UpgradeSkillType.PassiveTurn }
                                .forEach { duration += (it.turn) }
                    }
                }
            }


            var argDuration : String

//            duration *= 100f

            if(duration > 0) {
                argDuration = m.turn.toString() + "(+" + duration.toInt().toString() + ")"
            } else {
                argDuration = m.turn.toString()
            }



//            duration
            val arg2 : String = argDuration





//            value
            var num : Int = Math.round(m.vFloat * 100f)

            if(num == 0) {
                if(skillUpgrade != null) {
                    var num2 = GetSkillUpgradeValue (skillUpgrade, skillType, num)
                    if(num2 > 0) {
                        value =  m.vInt.toString() + "(+" + GetSkillUpgradeValue (skillUpgrade, skillType, num).toString() + ")"
                    } else {
                        value =  m.vInt.toString()
                    }
                } else {
                    value =  m.vInt.toString()
                }

//                num = m.vInt
            } else {
                if(skillUpgrade != null) {
                    var num2 = GetSkillUpgradeValue (skillUpgrade, skillType, num)
                    if(num2 > 0) {
                        value =  num.toString() + "(+" +  GetSkillUpgradeValue (skillUpgrade, skillType, num).toString() + ")"
                    } else {
                        value =  num.toString()
                    }
                } else {
                    value =  num.toString()

                }

            }





            val arg3 : String = value






            try {

                val p = Pattern.compile("\\[(.{6}?)]")

                val buffer = StringBuffer()

                val m = p.matcher(text)
                while (m.find()) {
                    val colorString = "<font color='#" + m.group(0).replace("[","").replace("]","") + "'>"
                    m.appendReplacement(buffer, colorString)
                }

                m.appendTail(buffer)

                text2 = buffer.toString()


                text2 = text2.replace("{0}", arg).replace("{1}", arg2).replace("{2}", arg3).replace("[-]", "</font>")


            } catch (e: Exception)
            {

            }
            return text2

        }


        fun GetSkillEffectResource (context: Context, resName : String) : String {
            val res = resName.replace("SEST_", "se_").replace(".","_").toLowerCase()

            val fullPath = "file://" + context.filesDir + "/" +    res + ".webp"

            return fullPath
        }

        fun GetSkillResource (context: Context, resName: String) : String {

            val fullPath = "file://" + context.filesDir + "/" + resName + ".webp"

            return fullPath


        }



//        fun GetLeaderSkill (mapSkill: Map<Int, MsgMonsterSkillOuterClass.MsgMonsterSkill>,
//                            mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>,
//                            uid: Int) : MsgMonsterSkillOuterClass.MsgMonsterSkill {
//
////            val mapSkill = ReadObject(context, Variables.MAP_SKILL) as java.util.HashMap<Int, MsgMonsterSkillOuterClass.MsgMonsterSkill>
////            val mapMonster = ReadObject(context, Variables.MAP_MONSTER) as HashMap<Int, MsgMonsterOuterClass.MsgMonster>
//
//            val leader = mapSkill[mapMonster[uid]!!.leaderSkill] as MsgMonsterSkillOuterClass.MsgMonsterSkill
//
//            return leader
//
//        }


        fun GetSkill (mapSkill: Map<Int, MsgMonsterSkillOuterClass.MsgMonsterSkill>,
                      mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>,
                      uid: Int): HashMap<String, MsgMonsterSkillOuterClass.MsgMonsterSkill> {

            val leader = mapSkill[mapMonster[uid]!!.leaderSkill] as MsgMonsterSkillOuterClass.MsgMonsterSkill
            val default = mapSkill[mapMonster[uid]!!.defaultSkill] as MsgMonsterSkillOuterClass.MsgMonsterSkill
            val active = mapSkill[mapMonster[uid]!!.activeSkill] as MsgMonsterSkillOuterClass.MsgMonsterSkill

            var allSkills : HashMap<String, MsgMonsterSkillOuterClass.MsgMonsterSkill> = hashMapOf()

            allSkills.put("leader", leader)
            allSkills.put("default", default)
            allSkills.put("active", active)

            return allSkills

        }


        fun GetStatusEffectByUid (mapEffect: Map<Int, MsgStatusEffectOuterClass.MsgStatusEffect>, uid: Int) : MsgStatusEffectOuterClass.MsgStatusEffect {

//            val mapEffect = ReadObject(context, Variables.MAP_EFFECT) as java.util.HashMap<Int, MsgStatusEffectOuterClass.MsgStatusEffect>

            return mapEffect[uid] as MsgStatusEffectOuterClass.MsgStatusEffect


        }


        fun GetFormattedLeaderDescString (mapString: Map<Int, String>, m : MsgStatusEffectOuterClass.MsgStatusEffect) : String {

//            val mapString = ReadObject(context, Variables.MAP_STRING) as HashMap<Int, String>
            var text2 = String()
            var text : String = mapString[m.desc].toString()
            val arg : String = Math.round(m.vFloat * 100f).toString() + "-" + (Math.round(m.vFloat * 100f) + 5).toString()

//            text = UtilFunctions.RegexClearColorTag(text)

            try {

                val p = Pattern.compile("\\[(.{6}?)]")

                val buffer = StringBuffer()

                val m = p.matcher(text)
                while (m.find()) {
                    val colorString = "<font color='#" + m.group(0).replace("[","").replace("]","") + "'>"
                    m.appendReplacement(buffer, colorString)
                }

                m.appendTail(buffer)

                text2 = buffer.toString()


                text2 = text2.replace("{0}", arg).replace("[-]", "</font>")

//                text = text.replace("{0}", arg).replace("[","").replace("]","")

            } catch (e: Exception)
            {

            }
            return text2

        }


        fun GetTargetStringResource(target: MonsterSkillTargetType): Int {

            when (target) {

                MonsterSkillTargetType.MST_One -> {
                    return R.string.target_one
                }

                MonsterSkillTargetType.MST_Team -> {
                    return R.string.target_team
                }

                MonsterSkillTargetType.MST_All -> {
                    return R.string.target_all
                }

                MonsterSkillTargetType.MST_EntireAll -> {
                    return R.string.target_entire_all
                }


                else -> {
                    return R.string.dump
                }
            }


        }

        fun ClearFilterSetting (context: Context) {

            val sharedPref = context.getSharedPreferences(Variables.FILTER_SETTINGS, Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.clear()
            editor.apply()

        }

        fun GetDungeonStageMonsterStat(stageMonster: MsgStageMonster, mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>): StageMonsterStatObj {

            val monster: MsgMonsterOuterClass.MsgMonster = GetMonster(stageMonster.monster, mapMonster)



            val num1 = clamp((stageMonster.monsterLev - 1f), 0f, Int.MAX_VALUE.toFloat())
            val num2 = monster.defAttack * monster.incAttack
            val num3 = monster.defDefence * monster.incDefence
            val num4 = monster.defHeal * monster.incHeal
            val num5 = monster.defHp * monster.incHp


            val monsterUid = stageMonster.monster
            val grade = stageMonster.monsterSkillGrade
            val attack = (monster.defAttack + num2 * num1) * stageMonster.attackAbility
            val defence = (monster.defDefence + num3 * num1) * stageMonster.defenceAbility
            val heal = (monster.defHeal + num4 * num1) * stageMonster.healAbility
            val hp = (monster.defHp + num5 * num1) * stageMonster.hpAbility
            val lev = stageMonster.monsterLev
            val statType = monster.defStatType
            val statWeightType = stageMonster.monsterWeightType


            return StageMonsterStatObj(monsterUid, grade, attack, defence, heal, hp, lev, statType, statWeightType)

        }


        fun GetStageMonsterStat(stageMonster: MsgStageMonster, mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster>): StageMonsterStatObj {

            val monster: MsgMonsterOuterClass.MsgMonster = GetMonster(stageMonster.monster, mapMonster)



            val num1 = clamp((stageMonster.monsterLev - 1f), 0f, Int.MAX_VALUE.toFloat())
            val num2 = monster.defAttack * monster.incAttack
            val num3 = monster.defDefence * monster.incDefence
            val num4 = monster.defHeal * monster.incHeal
            val num5 = monster.defHp * monster.incHp


            val monsterUid = stageMonster.monster
            val grade = stageMonster.monsterSkillGrade
            val attack = (monster.defAttack + num2 * num1) * stageMonster.attackAbility
            val defence = (monster.defDefence + num3 * num1) * stageMonster.defenceAbility
            val heal = (monster.defHeal + num4 * num1) * stageMonster.healAbility
            val hp = (monster.defHp + num5 * num1) * stageMonster.hpAbility
            val lev = stageMonster.monsterLev
            val statType = monster.defStatType
            val statWeightType = stageMonster.monsterWeightType


            return StageMonsterStatObj(monsterUid, grade, attack, defence, heal, hp, lev, statType, statWeightType)

        }


        fun clamp(`val`: Float, min: Float, max: Float): Float {
            return Math.max(min, Math.min(max, `val`))
        }

        fun round(d: Float, decimalPlace: Int): Float {
            var bd = BigDecimal(java.lang.Float.toString(d))
            bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP)
            return bd.toFloat()
        }




//        fun RegexClearColorTag (text : String) : String {
//
//            var text2 : String = text
//
//            val regex = "(?<=\\[)([^]]+)(?=])"
//
//            val pattern = Pattern.compile(regex)
//            val matcher = pattern.matcher(text2)
//
//            while (matcher.find()) {
//                for (i in 1..matcher.groupCount()) {
//                    text2 = text2.replace(matcher.group(i), "")
//                }
//            }
//
//            return text2
//        }
    }

}