//package com.felania.monstersuperleaguedatabook.adapters
//
//import android.content.Context
//import android.util.Log
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.*
//import com.felania.monstersuperleaguedatabook.R
//import com.felania.monstersuperleaguedatabook.fragments.GolemFragment
//import com.felania.monstersuperleaguedatabook.utils.RewardObj
//import com.felania.monstersuperleaguedatabook.utils.UtilFunctions
//import com.felania.monstersuperleaguedatabook.utils.Variables
//import com.squareup.picasso.Picasso
//import com.felania.msldb.*
//
//
//class GolemAdapter2 (var context: Context,
//                     private var subStages: List<MsgDungeonSubStageOuterClass.MsgDungeonSubStage>,
//                     var rewardObj: MutableMap< Int, MutableMap<String, MutableList<RewardObj>>>,
//
//                     var golemFragment: GolemFragment) : BaseExpandableListAdapter() {
//
//
//    val list = golemFragment.dungeonList()
//
//    lateinit var parentViewHolder: ParentViewHolder
//    lateinit var childrenViewHolder: ChildrenViewHolder
//    lateinit var rewardParentViewHolder: RewardParentViewHolder
//    lateinit var dungeonInfoViewHolder : DungeonInfoViewHolder
//    lateinit var parent2ViewHolder : Parent2ViewHolder
//
//    inner class GridAdapter (var context: Context,
//                             var rewardObj: MutableList<RewardObj>,
//                             var parentPosition: Int) : BaseAdapter () {
//
//        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//
//            val view : View
//
//            if(convertView == null) {
//                childrenViewHolder = ChildrenViewHolder()
//
//                val layoutInflater = context
//                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//                view = layoutInflater.inflate(R.layout.list_item_golem_reward, parent, false)
//
//                ChildrenViewRelationship(view)
//            } else {
//
//                childrenViewHolder = convertView.tag as (ChildrenViewHolder)
//
//                view = convertView
//            }
//
//            SetRewardView(position)
//
//
//            return view
//        }
//
//        override fun getItem(position: Int): Any {
//            return rewardObj
//        }
//
//        override fun getItemId(position: Int): Long {
//            return position.toLong()
//        }
//
//        override fun getCount(): Int {
//            return rewardObj.size
//        }
//
//
//
//        fun SetRewardView (childPosition: Int) {
//
//
//
//            if(rewardObj[childPosition].itemEgg == null &&  rewardObj[childPosition].itemRuneStone == null) {
//
//
//                val rewardIcon = GetRuneIconByColorAndShape(rewardObj[childPosition].itemShape, rewardObj[childPosition].itemColor)
//
//
//                val gradeIcon = UtilFunctions.GetGradeResourceByNumber(rewardObj[childPosition].amount)
//
//                val chance =  UtilFunctions.round((rewardObj[childPosition].chance * 100f), 2).toString() + "%"
//                childrenViewHolder.tvRewardChance.text = chance
//
//
//                Picasso.with(context)
//                        .load(rewardIcon)
//                        .error(R.drawable.skill_blank)
//                        .placeholder(R.drawable.skill_blank)
//                        .into(childrenViewHolder.ivRewardIcon)
//
//                Picasso.with(context)
//                        .load(gradeIcon)
//                        .error(R.drawable.skill_blank)
//                        .placeholder(R.drawable.skill_blank)
//                        .into(childrenViewHolder.ivRewardRuneGrade)
//
//
//            }
//
//            else if (rewardObj[childPosition].itemRuneStone != null  ) {
//
//                val rewardIcon = GetStoneIcon(rewardObj[childPosition].itemRuneStone.icon)
//
//
//
//
//                val itemGrade = rewardObj[childPosition].itemRuneStone.grade
//
//                val chance = "Amount:" + rewardObj[childPosition].amount.toString() + " | " +  UtilFunctions.round((rewardObj[childPosition].chance * 100f), 2).toString() + "%"
//                childrenViewHolder.tvRewardChance.text = chance
//
//
//                Picasso.with(context)
//                        .load(rewardIcon)
//                        .error(R.drawable.skill_blank)
//                        .placeholder(R.drawable.skill_blank)
//                        .into(childrenViewHolder.ivRewardIcon)
//
//                childrenViewHolder.ivRewardRuneGrade.visibility = View.INVISIBLE
//
//            }
//
//            else {
//
//                val rewardIcon = R.drawable.egg_pink
//
//                val chance =  UtilFunctions.round((rewardObj[childPosition].chance * 100f), 2).toString() + "%"
//                childrenViewHolder.tvRewardChance.text = chance
//
//
//                Picasso.with(context)
//                        .load(rewardIcon)
//                        .error(R.drawable.skill_blank)
//                        .placeholder(R.drawable.skill_blank)
//                        .into(childrenViewHolder.ivRewardIcon)
//
//                childrenViewHolder.ivRewardRuneGrade.visibility = View.INVISIBLE
//
//
//            }
//
//
//        }
//
//
//        fun GetStoneIcon (iconName: String): Int {
//
//
//            return context.resources.getIdentifier(iconName.toLowerCase(), "drawable", context.packageName)
//        }
//
//
//
//        fun GetRuneIconByColorAndShape (itemShape: String,
//                                        itemColor: String,
//                                        runeGrade: Int = 1): Int {
//
//            var baseName = "rune_icon_{0}_{1}_{2}"
//
//            baseName = baseName.replace("{1}", itemShape.replace("MRSS_", "") )
//            baseName = baseName.replace("{0}",  itemColor.replace("MRC_", "") )
//            baseName = baseName.replace ("{2}", runeGrade.toString())
//
//
//            return context.resources.getIdentifier(baseName.toLowerCase(), "drawable", context.packageName)
//
//
//
//        }
//
//
//    }
//
//
//
//    inner class CustExpListview(context: Context) : ExpandableListView(context) {
//
//        internal var intGroupPosition: Int = 0
//        internal var intChildPosition: Int = 0
//        internal var intGroupid: Int = 0
//
//        override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//            val mWidthMeasureSpec: Int = View.MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.EXACTLY)
//            val mHeightMeasureSpec: Int = View.MeasureSpec.makeMeasureSpec(1073741823, View.MeasureSpec.AT_MOST)
//
//            super.onMeasure(mWidthMeasureSpec, mHeightMeasureSpec)
//        }
//    }
//
//
//    inner class SecondLevelAdapter(private var parentPosition: Int,
//                                   private var rewardObj: MutableMap<String, MutableList<RewardObj>>) : BaseExpandableListAdapter() {
//
//
//        override fun getGroup(p0: Int): Any {
//            return list[p0]
//        }
//
//        override fun isChildSelectable(p0: Int, p1: Int): Boolean {
//            return true
//        }
//
//        override fun hasStableIds(): Boolean {
//            return true
//        }
//
//        lateinit var secondLevelViewHolder : SecondLevelViewHolder
//
//        inner class SecondLevelViewHolder {
//
//            lateinit var tvGolemChild : TextView
//
//        }
//
//        fun SecondLevelViewRelationship (convertView: View) {
//            secondLevelViewHolder.tvGolemChild = convertView.findViewById(R.id.tvGolemChild)
//
//            convertView.tag = secondLevelViewHolder
//        }
//
//
//
//        override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup): View {
//
//            val view : View
//
////            val exp : ExpandableListView = parent as ExpandableListView
////
////            if(!isExpanded) {
////                exp.expandGroup(0)
////            }
//
//
//            if(convertView == null) {
//
//                secondLevelViewHolder = SecondLevelViewHolder()
//
//                val layoutInflater = context
//                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//                view = layoutInflater.inflate(R.layout.list_item_golem_child, parent, false)
//
//                SecondLevelViewRelationship(view)
//
//
//            } else {
//                secondLevelViewHolder = convertView.tag as (SecondLevelViewHolder)
//                view = convertView
//            }
//
////            val golemStage = view.findViewById<TextView>(R.id.tvGolemChild)
////
//            secondLevelViewHolder.tvGolemChild.text = getGroup(groupPosition).toString()
//
//
//            return view
//
//
//        }
//
//        fun GetRewardCount (uid: Int) : Int {
//            return golemFragment.GetRewardList(uid).size
//        }
//
//        override fun getChildrenCount(groupPosition: Int): Int {
//
//            return if(groupPosition == 0) {
//                GetDungeonInfoRoundSize(parentPosition)
//
////                rewardObj.size
//
//            }
//            else if (groupPosition == 1) {
//                rewardObj.size
////                GetDungeonInfoRoundSize(parentPosition)
//            }
//
////            else if (groupPosition == 2) {
////
////                rewardObj.size
////            }
//            else {
//
//                2
//            }
//
//        }
//
//
//        override fun getChild(p0: Int, p1: Int): Any {
//            return p1
//        }
//
//        override fun getGroupId(p0: Int): Long {
//            return p0.toLong()
//        }
//
//        fun GetDungeonInfoRoundSize(groupPosition: Int) : Int {
//            return golemFragment.GetBattleRound(subStages[groupPosition].uid)!!.size
//        }
//
//        fun GetDungeonInfoDisplayMonsterSize (list: MutableList<MsgUidAndProbOuterClass.MsgUidAndProb>, round: Int, battleList : MutableList<MsgStageBattleOuterClass.MsgStageBattle>) : Int{
//
//            val size = list.size
//
//
//            when (size) {
//                1 -> {
//
//                    val reqMonCount = if(battleList[round].requiredMonster > 0 ) {
//                        1
//                    } else {
//                        0
//                    }
//
//
//                    val fixedSize = if (battleList[round].fixedMonsterCount > 0) {
//                        battleList[round].fixedMonsterCount
//                    } else {
//                        battleList[round].monsterCountMin
//                    }
//
//
//                    val totalReqAndFixedMonCount =  fixedSize + reqMonCount
//
//
//                    if( totalReqAndFixedMonCount > 0 ) {
//                        dungeonInfoViewHolder.llReqMon.visibility = View.VISIBLE
//
//
//
//                        when (totalReqAndFixedMonCount) {
//                            1 -> {
//                                // 1 ReqMonster
//
//
//                                val fixedMon1 = if (battleList[round].fixedMonsterCount > 0) {
//                                    golemFragment.GetMonDungeonStageFromUid(battleList[round].fixedMonsterList[0])
//
//                                } else {
//                                    golemFragment.GetMonDungeonStageFromUid(list[0].uid)
//
//                                }
//
//                                dungeonInfoViewHolder.llReqMon1.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon2.visibility = View.GONE
//                                dungeonInfoViewHolder.llReqMon3.visibility = View.GONE
//
//
////                                val fixedList1 = battleList[round].fixedMonsterList
//
//                                val monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//
//
//                                Picasso.with(context)
//                                        .load(monIcon1)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.s1)
//                                        .placeholder(R.drawable.s1)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon1)
//
//
//
//                            }
//                            2 -> {
//                                // 2 ReqMonster
//
//                                dungeonInfoViewHolder.llReqMon1.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon2.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon3.visibility = View.GONE
//
////                                var fixedList1 = mutableListOf<Int>()
////                                var fixedList2 = mutableListOf<Int>()
//                                var fixedMon1 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var fixedMon2 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var reqMon1 = 0
//
////                                val fixedMon1 = if (battleList[round].fixedMonsterCount > 0) {
////                                    golemFragment.GetMonDungeonStageFromUid(battleList[round].fixedMonsterList[0])
////
////                                } else {
////                                    golemFragment.GetMonDungeonStageFromUid(list[0].uid)
////
////                                }
//
//
//                                if(totalReqAndFixedMonCount - reqMonCount != totalReqAndFixedMonCount) {
////have boss
//
//                                    reqMon1 = golemFragment.GetMonsterFromMonStage(  battleList[round].requiredMonster).uid
//
//                                    if (battleList[round].fixedMonsterCount > 0) {
//                                        fixedMon1 = golemFragment.GetMonDungeonStageFromUid(battleList[round].fixedMonsterList[0])
//                                    } else {
//                                        fixedMon1 = golemFragment.GetMonDungeonStageFromUid(list[0].uid)
//                                    }
//
//
//                                    fixedMon2 = golemFragment.GetMonStageFromUid(reqMon1)
//
//
//                                } else {
//
////                                    fixedList1 = battleList[round].fixedMonsterList
//
//                                    if (battleList[round].fixedMonsterCount > 0) {
//                                        fixedMon1 = golemFragment.GetMonDungeonStageFromUid(battleList[round].fixedMonsterList[0])
//                                        fixedMon2 = golemFragment.GetMonDungeonStageFromUid(battleList[round].fixedMonsterList[1])
//                                    } else {
//                                        fixedMon1 = golemFragment.GetMonDungeonStageFromUid(list[0].uid)
//                                        fixedMon2 = golemFragment.GetMonDungeonStageFromUid(list[0].uid)
//                                    }
//
//
////                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
////                                    fixedMon2 = golemFragment.GetMonDungeonStageFromUid(fixedList1[1])
//
//
//                                }
//
//
//                                val monChance1 = "100%"
//                                val monChance2 = "100%"
//
//
//                                dungeonInfoViewHolder.tvReqMonChance1.text = monChance1
//                                dungeonInfoViewHolder.tvReqMonChance2.text = monChance2
//
//
//
//
//
//                                val monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//                                val monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon2.uid))
//
//                                Picasso.with(context)
//                                        .load(monIcon1)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.s1)
//                                        .placeholder(R.drawable.s1)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon1)
//
//                                Picasso.with(context)
//                                        .load(monIcon2)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.s2)
//                                        .placeholder(R.drawable.s2)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon2)
//
//
//                                val monMax = "MAX " + battleList[round].monsterCountMax.toString()
//                                val monMin = "MIN " + battleList[round].monsterCountMin.toString()
//
//
//                                dungeonInfoViewHolder.tvMonMax.text = monMax
//                                dungeonInfoViewHolder.tvMonMin.text = monMin
//
//
//
//                            }
//                            3 -> {
//                                // 3 ReqMonster
//
//                                dungeonInfoViewHolder.llReqMon1.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon2.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon3.visibility = View.VISIBLE
//
//
////                                var fixedList1 = mutableListOf<Int>()
//
//                                var fixedMon1 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var fixedMon2 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var fixedMon3 : MsgStageMonsterOuterClass.MsgStageMonster
//
//                                var monIcon1 : String
//                                var monIcon2 : String
//                                var monIcon3 : String
//
//
//                                var reqMon1 : Int
//
//                                if(totalReqAndFixedMonCount - reqMonCount != totalReqAndFixedMonCount) {
////have boss
////                                    fixedList1 = battleList[round].fixedMonsterList
//
//                                    reqMon1 =   battleList[round].requiredMonster
//
//
//                                    if (battleList[round].fixedMonsterCount > 0) {
//                                        fixedMon1 = golemFragment.GetMonDungeonStageFromUid(battleList[round].fixedMonsterList[0])
//                                        fixedMon2 = golemFragment.GetMonDungeonStageFromUid(battleList[round].fixedMonsterList[1])
//                                    } else {
//                                        fixedMon1 = golemFragment.GetMonDungeonStageFromUid(list[0].uid)
//                                        fixedMon2 = golemFragment.GetMonDungeonStageFromUid(list[0].uid)
//                                    }
//
//
////                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
////                                    fixedMon2 = golemFragment.GetMonDungeonStageFromUid(fixedList1[1])
//                                    fixedMon3 = golemFragment.GetMonStageFromUid(reqMon1)
//
//                                    monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//                                    monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon2.uid))
//                                    monIcon3 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonStage(fixedMon3.uid))
//
//                                } else {
//
////                                    fixedList1 = battleList[round].fixedMonsterList
//
//                                    if (battleList[round].fixedMonsterCount > 0) {
//                                        fixedMon1 = golemFragment.GetMonDungeonStageFromUid(battleList[round].fixedMonsterList[0])
//                                        fixedMon2 = golemFragment.GetMonDungeonStageFromUid(battleList[round].fixedMonsterList[1])
//                                        fixedMon3 = golemFragment.GetMonDungeonStageFromUid(battleList[round].fixedMonsterList[2])
//                                    } else {
//                                        fixedMon1 = golemFragment.GetMonDungeonStageFromUid(list[0].uid)
//                                        fixedMon2 = golemFragment.GetMonDungeonStageFromUid(list[0].uid)
//                                        fixedMon3 = golemFragment.GetMonDungeonStageFromUid(list[0].uid)
//                                    }
//
//
////                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
////                                    fixedMon2 = golemFragment.GetMonDungeonStageFromUid(fixedList1[1])
////                                    fixedMon3 = golemFragment.GetMonDungeonStageFromUid(fixedList1[2])
//
//                                    monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//                                    monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon2.uid))
//                                    monIcon3 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon3.uid))
//
//                                }
//
//
//                                val monChance1 = "100%"
//                                val monChance2 = "100%"
//                                val monChance3 = "100%"
//
//                                dungeonInfoViewHolder.tvReqMonChance1.text = monChance1
//                                dungeonInfoViewHolder.tvReqMonChance2.text = monChance2
//                                dungeonInfoViewHolder.tvReqMonChance3.text = monChance3
//
//
//
//                                Picasso.with(context)
//                                        .load(monIcon1)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.s1)
//                                        .placeholder(R.drawable.s1)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon1)
//
//                                Picasso.with(context)
//                                        .load(monIcon2)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.s2)
//                                        .placeholder(R.drawable.s2)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon2)
//
//
//                                Picasso.with(context)
//                                        .load(monIcon3)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon3)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromStageMon(fixedMon3.uid))
//                                        .error(R.drawable.s3)
//                                        .placeholder(R.drawable.s3)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade3)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromStageMon(fixedMon3.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon3)
//
//
//                            }
//
//
//                        }
//
//
//                    } else {
//                        dungeonInfoViewHolder.llReqMon.visibility = View.INVISIBLE
//                    }
//
//
//                    val monMax = "MAX " + battleList[round].monsterCountMax.toString()
//                    val monMin = "MIN " + battleList[round].monsterCountMin.toString()
//
//
//                    dungeonInfoViewHolder.tvMonMax.text = monMax
//                    dungeonInfoViewHolder.tvMonMin.text = monMin
//
//
//                    if(totalReqAndFixedMonCount >= battleList[round].monsterCountMax) {
//
//                        dungeonInfoViewHolder.llRandomMon.visibility = View.GONE
//
//                        val monMax2 = "MAX " + totalReqAndFixedMonCount
//                        val monMin2 = "MIN " + totalReqAndFixedMonCount
//
//                        dungeonInfoViewHolder.tvMonMax.text = monMax2
//                        dungeonInfoViewHolder.tvMonMin.text = monMin2
//
//                    } else {
//                        //Normal
//                        dungeonInfoViewHolder.llRandomMon.visibility = View.VISIBLE
//
//                        dungeonInfoViewHolder.llMon1.visibility = View.VISIBLE
//                        dungeonInfoViewHolder.llMon2.visibility = View.GONE
//                        dungeonInfoViewHolder.llMon3.visibility = View.GONE
//                        dungeonInfoViewHolder.llMon4.visibility = View.GONE
//
//
//
//
//                        val monGroup1 = golemFragment.GetMonDungeonStageFromUid(list[0].uid)
//
//
//
//                        val monChance1 = UtilFunctions.round((list[0].prob * 100f), 2).toString() + "%"
//
//
//                        dungeonInfoViewHolder.tvMonChance1.text = monChance1
//
//
//
//
//                        val monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(monGroup1.uid))
//
//
//
//                        Picasso.with(context)
//                                .load(monIcon1)
//                                .error(R.drawable.skill_blank)
//                                .placeholder(R.drawable.skill_blank)
//                                .into(dungeonInfoViewHolder.ivMonIcon1)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionGradeFromDungeonStageMon(monGroup1.uid))
//                                .error(R.drawable.s1)
//                                .placeholder(R.drawable.s1)
//                                .into(dungeonInfoViewHolder.ivMonGrade1)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionElementFromDungeonStageMon(monGroup1.uid))
//                                .error(R.drawable.element_fire)
//                                .placeholder(R.drawable.element_fire)
//                                .into(dungeonInfoViewHolder.ivFrameMon1)
//
//
//
//                    }
//
//
//
//
//
//                    val roundText = golemFragment.GetRoundString( Variables.STRING_ROUND  ).replace("{0}", (round + 1).toString())  .replace("{1}", GetDungeonInfoRoundSize(parentPosition).toString() )
//
//                    dungeonInfoViewHolder.tvMonStage.text = roundText
//
//                    return 1
//                }
//                2 -> {
//                    val reqMonCount = if(battleList[round].requiredMonster > 0 ) {
//                        1
//                    } else {
//                        0
//                    }
//
//                    val totalReqAndFixedMonCount =  battleList[round].fixedMonsterCount + reqMonCount
//
//
//                    if( totalReqAndFixedMonCount > 0 ) {
//                        dungeonInfoViewHolder.llReqMon.visibility = View.VISIBLE
//
//                        when (totalReqAndFixedMonCount) {
//                            1 -> {
//                                // 1 ReqMonster
//
//                                dungeonInfoViewHolder.llReqMon1.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon2.visibility = View.GONE
//                                dungeonInfoViewHolder.llReqMon3.visibility = View.GONE
//
//
//                                val fixedList1 = battleList[round].fixedMonsterList
//
//
//                                val fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//
//
//
//                                val monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//
//
//                                Picasso.with(context)
//                                        .load(monIcon1)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.s1)
//                                        .placeholder(R.drawable.s1)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon1)
//
//
//
//                            }
//                            2 -> {
//                                // 2 ReqMonster
//
//                                dungeonInfoViewHolder.llReqMon1.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon2.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon3.visibility = View.GONE
//
//                                var fixedList1 = mutableListOf<Int>()
//                                var fixedList2 = mutableListOf<Int>()
//                                var fixedMon1 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var fixedMon2 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var reqMon1 = 0
//
//                                if(totalReqAndFixedMonCount - reqMonCount != totalReqAndFixedMonCount) {
////have boss
//                                    fixedList1 = battleList[round].fixedMonsterList
//                                    reqMon1 = golemFragment.GetMonsterFromMonStage(  battleList[round].requiredMonster).uid
//
//                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//                                    fixedMon2 = golemFragment.GetMonStageFromUid(reqMon1)
//
//
//                                } else {
//
//                                    fixedList1 = battleList[round].fixedMonsterList
//
//
//                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//                                    fixedMon2 = golemFragment.GetMonDungeonStageFromUid(fixedList1[1])
//
//
//                                }
//
//
//                                val monChance1 = "100%"
//                                val monChance2 = "100%"
//
//
//                                dungeonInfoViewHolder.tvReqMonChance1.text = monChance1
//                                dungeonInfoViewHolder.tvReqMonChance2.text = monChance2
//
//
//
//
//
//                                val monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//                                val monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon2.uid))
//
//                                Picasso.with(context)
//                                        .load(monIcon1)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.s1)
//                                        .placeholder(R.drawable.s1)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon1)
//
//                                Picasso.with(context)
//                                        .load(monIcon2)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.s2)
//                                        .placeholder(R.drawable.s2)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon2)
//
//
//                                val monMax = "MAX " + battleList[round].monsterCountMax.toString()
//                                val monMin = "MIN " + battleList[round].monsterCountMin.toString()
//
//
//                                dungeonInfoViewHolder.tvMonMax.text = monMax
//                                dungeonInfoViewHolder.tvMonMin.text = monMin
//
//
//
//                            }
//                            3 -> {
//                                // 3 ReqMonster
//
//                                dungeonInfoViewHolder.llReqMon1.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon2.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon3.visibility = View.VISIBLE
//
//
//                                var fixedList1 = mutableListOf<Int>()
//
//                                var fixedMon1 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var fixedMon2 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var fixedMon3 : MsgStageMonsterOuterClass.MsgStageMonster
//
//                                var monIcon1 : String
//                                var monIcon2 : String
//                                var monIcon3 : String
//
//
//                                var reqMon1 : Int
//
//                                if(totalReqAndFixedMonCount - reqMonCount != totalReqAndFixedMonCount) {
////have boss
//                                    fixedList1 = battleList[round].fixedMonsterList
//
//                                    reqMon1 =   battleList[round].requiredMonster
//
//
//                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//                                    fixedMon2 = golemFragment.GetMonDungeonStageFromUid(fixedList1[1])
//                                    fixedMon3 = golemFragment.GetMonStageFromUid(reqMon1)
//
//                                    monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//                                    monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon2.uid))
//                                    monIcon3 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonStage(fixedMon3.uid))
//
//                                } else {
//
//                                    fixedList1 = battleList[round].fixedMonsterList
//
//
//                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//                                    fixedMon2 = golemFragment.GetMonDungeonStageFromUid(fixedList1[1])
//                                    fixedMon3 = golemFragment.GetMonDungeonStageFromUid(fixedList1[2])
//
//                                    monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//                                    monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon2.uid))
//                                    monIcon3 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon3.uid))
//
//                                }
//
//
//                                val monChance1 = "100%"
//                                val monChance2 = "100%"
//                                val monChance3 = "100%"
//
//                                dungeonInfoViewHolder.tvReqMonChance1.text = monChance1
//                                dungeonInfoViewHolder.tvReqMonChance2.text = monChance2
//                                dungeonInfoViewHolder.tvReqMonChance3.text = monChance3
//
//
//
//                                Picasso.with(context)
//                                        .load(monIcon1)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.s1)
//                                        .placeholder(R.drawable.s1)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon1)
//
//                                Picasso.with(context)
//                                        .load(monIcon2)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.s2)
//                                        .placeholder(R.drawable.s2)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon2)
//
//
//                                Picasso.with(context)
//                                        .load(monIcon3)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon3)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromStageMon(fixedMon3.uid))
//                                        .error(R.drawable.s3)
//                                        .placeholder(R.drawable.s3)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade3)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromStageMon(fixedMon3.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon3)
//
//
//                            }
//
//
//                        }
//
//
//                    } else {
//                        dungeonInfoViewHolder.llReqMon.visibility = View.INVISIBLE
//                    }
//
//
//                    val monMax = "MAX " + battleList[round].monsterCountMax.toString()
//                    val monMin = "MIN " + battleList[round].monsterCountMin.toString()
//
//
//                    dungeonInfoViewHolder.tvMonMax.text = monMax
//                    dungeonInfoViewHolder.tvMonMin.text = monMin
//
//
//                    if(totalReqAndFixedMonCount >= battleList[round].monsterCountMax) {
//
//                        dungeonInfoViewHolder.llRandomMon.visibility = View.GONE
//
//                        val monMax2 = "MAX " + totalReqAndFixedMonCount
//                        val monMin2 = "MIN " + totalReqAndFixedMonCount
//
//                        dungeonInfoViewHolder.tvMonMax.text = monMax2
//                        dungeonInfoViewHolder.tvMonMin.text = monMin2
//
//                    } else {
//                        //Normal
//                        dungeonInfoViewHolder.llRandomMon.visibility = View.VISIBLE
//
//                        dungeonInfoViewHolder.llMon1.visibility = View.VISIBLE
//                        dungeonInfoViewHolder.llMon2.visibility = View.VISIBLE
//                        dungeonInfoViewHolder.llMon3.visibility = View.GONE
//                        dungeonInfoViewHolder.llMon4.visibility = View.GONE
//
//
//
//
//                        val monGroup1 = golemFragment.GetMonDungeonStageFromUid(list[0].uid)
//                        val monGroup2 = golemFragment.GetMonDungeonStageFromUid(list[1].uid)
//
//
//
//                        val monChance1 = UtilFunctions.round((list[0].prob * 100f), 2).toString() + "%"
//                        val monChance2 = UtilFunctions.round((list[1].prob * 100f), 2).toString() + "%"
//
//
//                        dungeonInfoViewHolder.tvMonChance1.text = monChance1
//                        dungeonInfoViewHolder.tvMonChance2.text = monChance2
//
//
//
//
//                        val monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(monGroup1.uid))
//                        val monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(monGroup2.uid))
//
//
//
//                        Picasso.with(context)
//                                .load(monIcon1)
//                                .error(R.drawable.skill_blank)
//                                .placeholder(R.drawable.skill_blank)
//                                .into(dungeonInfoViewHolder.ivMonIcon1)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionGradeFromDungeonStageMon(monGroup1.uid))
//                                .error(R.drawable.s1)
//                                .placeholder(R.drawable.s1)
//                                .into(dungeonInfoViewHolder.ivMonGrade1)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionElementFromDungeonStageMon(monGroup1.uid))
//                                .error(R.drawable.element_fire)
//                                .placeholder(R.drawable.element_fire)
//                                .into(dungeonInfoViewHolder.ivFrameMon1)
//
//                        Picasso.with(context)
//                                .load(monIcon2)
//                                .error(R.drawable.skill_blank)
//                                .placeholder(R.drawable.skill_blank)
//                                .into(dungeonInfoViewHolder.ivMonIcon2)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionGradeFromDungeonStageMon(monGroup2.uid))
//                                .error(R.drawable.s2)
//                                .placeholder(R.drawable.s2)
//                                .into(dungeonInfoViewHolder.ivMonGrade2)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionElementFromDungeonStageMon(monGroup2.uid))
//                                .error(R.drawable.element_fire)
//                                .placeholder(R.drawable.element_fire)
//                                .into(dungeonInfoViewHolder.ivFrameMon2)
//
//
//                    }
//
//
//
//
//
//                    val roundText = golemFragment.GetRoundString( Variables.STRING_ROUND  ).replace("{0}", (round + 1).toString())  .replace("{1}", GetDungeonInfoRoundSize(parentPosition).toString() )
//
//                    dungeonInfoViewHolder.tvMonStage.text = roundText
//
//
//                    return 2
//                }
//                3 -> {
//
//                    val reqMonCount = if(battleList[round].requiredMonster > 0 ) {
//                        1
//                    } else {
//                        0
//                    }
//
//                    val totalReqAndFixedMonCount =  battleList[round].fixedMonsterCount + reqMonCount
//
//
//                    if( totalReqAndFixedMonCount > 0 ) {
//                        dungeonInfoViewHolder.llReqMon.visibility = View.VISIBLE
//
//                        when (totalReqAndFixedMonCount) {
//                            1 -> {
//                                // 1 ReqMonster
//
//                                dungeonInfoViewHolder.llReqMon1.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon2.visibility = View.GONE
//                                dungeonInfoViewHolder.llReqMon3.visibility = View.GONE
//
//
//                                val fixedList1 = battleList[round].fixedMonsterList
//
//
//                                val fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//
//
//
//                                val monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//
//
//                                Picasso.with(context)
//                                        .load(monIcon1)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.s1)
//                                        .placeholder(R.drawable.s1)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon1)
//
//
//
//                            }
//                            2 -> {
//                                // 2 ReqMonster
//
//                                dungeonInfoViewHolder.llReqMon1.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon2.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon3.visibility = View.GONE
//
//                                var fixedList1 = mutableListOf<Int>()
//                                var fixedList2 = mutableListOf<Int>()
//                                var fixedMon1 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var fixedMon2 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var reqMon1 = 0
//
//                                if(totalReqAndFixedMonCount - reqMonCount != totalReqAndFixedMonCount) {
////have boss
//                                    fixedList1 = battleList[round].fixedMonsterList
//                                    reqMon1 = golemFragment.GetMonsterFromMonStage(  battleList[round].requiredMonster).uid
//
//                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//                                    fixedMon2 = golemFragment.GetMonStageFromUid(reqMon1)
//
//
//                                } else {
//
//                                    fixedList1 = battleList[round].fixedMonsterList
//
//
//                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//                                    fixedMon2 = golemFragment.GetMonDungeonStageFromUid(fixedList1[1])
//
//
//                                }
//
//
//                                val monChance1 = "100%"
//                                val monChance2 = "100%"
//
//
//                                dungeonInfoViewHolder.tvReqMonChance1.text = monChance1
//                                dungeonInfoViewHolder.tvReqMonChance2.text = monChance2
//
//
//
//
//
//                                val monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//                                val monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon2.uid))
//
//                                Picasso.with(context)
//                                        .load(monIcon1)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.s1)
//                                        .placeholder(R.drawable.s1)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon1)
//
//                                Picasso.with(context)
//                                        .load(monIcon2)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.s2)
//                                        .placeholder(R.drawable.s2)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon2)
//
//
//                                val monMax = "MAX " + battleList[round].monsterCountMax.toString()
//                                val monMin = "MIN " + battleList[round].monsterCountMin.toString()
//
//
//                                dungeonInfoViewHolder.tvMonMax.text = monMax
//                                dungeonInfoViewHolder.tvMonMin.text = monMin
//
//
//
//                            }
//                            3 -> {
//                                // 3 ReqMonster
//
//                                dungeonInfoViewHolder.llReqMon1.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon2.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon3.visibility = View.VISIBLE
//
//
//                                var fixedList1 = mutableListOf<Int>()
//
//                                var fixedMon1 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var fixedMon2 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var fixedMon3 : MsgStageMonsterOuterClass.MsgStageMonster
//
//                                var monIcon1 : String
//                                var monIcon2 : String
//                                var monIcon3 : String
//
//
//                                var reqMon1 : Int
//
//                                if(totalReqAndFixedMonCount - reqMonCount != totalReqAndFixedMonCount) {
////have boss
//                                    fixedList1 = battleList[round].fixedMonsterList
//
//                                    reqMon1 =   battleList[round].requiredMonster
//
//
//                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//                                    fixedMon2 = golemFragment.GetMonDungeonStageFromUid(fixedList1[1])
//                                    fixedMon3 = golemFragment.GetMonStageFromUid(reqMon1)
//
//                                    monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//                                    monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon2.uid))
//                                    monIcon3 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonStage(fixedMon3.uid))
//
//                                } else {
//
//                                    fixedList1 = battleList[round].fixedMonsterList
//
//
//                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//                                    fixedMon2 = golemFragment.GetMonDungeonStageFromUid(fixedList1[1])
//                                    fixedMon3 = golemFragment.GetMonDungeonStageFromUid(fixedList1[2])
//
//                                    monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//                                    monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon2.uid))
//                                    monIcon3 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon3.uid))
//
//                                }
//
//
//                                val monChance1 = "100%"
//                                val monChance2 = "100%"
//                                val monChance3 = "100%"
//
//                                dungeonInfoViewHolder.tvReqMonChance1.text = monChance1
//                                dungeonInfoViewHolder.tvReqMonChance2.text = monChance2
//                                dungeonInfoViewHolder.tvReqMonChance3.text = monChance3
//
//
//
//                                Picasso.with(context)
//                                        .load(monIcon1)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.s1)
//                                        .placeholder(R.drawable.s1)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon1)
//
//                                Picasso.with(context)
//                                        .load(monIcon2)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.s2)
//                                        .placeholder(R.drawable.s2)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon2)
//
//
//                                Picasso.with(context)
//                                        .load(monIcon3)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon3)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromStageMon(fixedMon3.uid))
//                                        .error(R.drawable.s3)
//                                        .placeholder(R.drawable.s3)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade3)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromStageMon(fixedMon3.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon3)
//
//
//                            }
//
//
//                        }
//
//
//                    } else {
//                        dungeonInfoViewHolder.llReqMon.visibility = View.INVISIBLE
//                    }
//
//
//                    val monMax = "MAX " + battleList[round].monsterCountMax.toString()
//                    val monMin = "MIN " + battleList[round].monsterCountMin.toString()
//
//
//                    dungeonInfoViewHolder.tvMonMax.text = monMax
//                    dungeonInfoViewHolder.tvMonMin.text = monMin
//
//
//                    if(totalReqAndFixedMonCount >= battleList[round].monsterCountMax) {
//
//                        dungeonInfoViewHolder.llRandomMon.visibility = View.GONE
//
//                        val monMax2 = "MAX " + totalReqAndFixedMonCount
//                        val monMin2 = "MIN " + totalReqAndFixedMonCount
//
//                        dungeonInfoViewHolder.tvMonMax.text = monMax2
//                        dungeonInfoViewHolder.tvMonMin.text = monMin2
//
//                    } else {
//                        dungeonInfoViewHolder.llRandomMon.visibility = View.VISIBLE
//                        dungeonInfoViewHolder.llMon1.visibility = View.VISIBLE
//                        dungeonInfoViewHolder.llMon2.visibility = View.VISIBLE
//                        dungeonInfoViewHolder.llMon3.visibility = View.VISIBLE
//                        dungeonInfoViewHolder.llMon4.visibility = View.GONE
//
//
//
//
//                        val monGroup1 = golemFragment.GetMonDungeonStageFromUid(list[0].uid)
//                        val monGroup2 = golemFragment.GetMonDungeonStageFromUid(list[1].uid)
//                        val monGroup3 = golemFragment.GetMonDungeonStageFromUid(list[2].uid)
//
//
//                        val monChance1 = UtilFunctions.round((list[0].prob * 100f), 2).toString() + "%"
//                        val monChance2 = UtilFunctions.round((list[1].prob * 100f), 2).toString() + "%"
//                        val monChance3 = UtilFunctions.round((list[2].prob * 100f), 2).toString() + "%"
//
//                        dungeonInfoViewHolder.tvMonChance1.text = monChance1
//                        dungeonInfoViewHolder.tvMonChance2.text = monChance2
//                        dungeonInfoViewHolder.tvMonChance3.text = monChance3
//
//
//
//                        val monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(monGroup1.uid))
//                        val monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(monGroup2.uid))
//                        val monIcon3 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(monGroup3.uid))
//
//
//                        Picasso.with(context)
//                                .load(monIcon1)
//                                .error(R.drawable.skill_blank)
//                                .placeholder(R.drawable.skill_blank)
//                                .into(dungeonInfoViewHolder.ivMonIcon1)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionGradeFromDungeonStageMon(monGroup1.uid))
//                                .error(R.drawable.s1)
//                                .placeholder(R.drawable.s1)
//                                .into(dungeonInfoViewHolder.ivMonGrade1)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionElementFromDungeonStageMon(monGroup1.uid))
//                                .error(R.drawable.element_fire)
//                                .placeholder(R.drawable.element_fire)
//                                .into(dungeonInfoViewHolder.ivFrameMon1)
//
//                        Picasso.with(context)
//                                .load(monIcon2)
//                                .error(R.drawable.skill_blank)
//                                .placeholder(R.drawable.skill_blank)
//                                .into(dungeonInfoViewHolder.ivMonIcon2)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionGradeFromDungeonStageMon(monGroup2.uid))
//                                .error(R.drawable.s2)
//                                .placeholder(R.drawable.s2)
//                                .into(dungeonInfoViewHolder.ivMonGrade2)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionElementFromDungeonStageMon(monGroup2.uid))
//                                .error(R.drawable.element_fire)
//                                .placeholder(R.drawable.element_fire)
//                                .into(dungeonInfoViewHolder.ivFrameMon2)
//
//
//                        Picasso.with(context)
//                                .load(monIcon3)
//                                .error(R.drawable.skill_blank)
//                                .placeholder(R.drawable.skill_blank)
//                                .into(dungeonInfoViewHolder.ivMonIcon3)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionGradeFromDungeonStageMon(monGroup3.uid))
//                                .error(R.drawable.s3)
//                                .placeholder(R.drawable.s3)
//                                .into(dungeonInfoViewHolder.ivMonGrade3)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionElementFromDungeonStageMon(monGroup3.uid))
//                                .error(R.drawable.element_fire)
//                                .placeholder(R.drawable.element_fire)
//                                .into(dungeonInfoViewHolder.ivFrameMon3)
//
//                    }
//
//
//
//
//
//                    val roundText = golemFragment.GetRoundString( Variables.STRING_ROUND  ).replace("{0}", (round + 1).toString())  .replace("{1}", GetDungeonInfoRoundSize(parentPosition).toString() )
//
//                    dungeonInfoViewHolder.tvMonStage.text = roundText
//
//
//
//
//                    return 3
//                }
//                4 -> {
//
//                    val reqMonCount = if(battleList[round].requiredMonster > 0 ) {
//                        1
//                    } else {
//                        0
//                    }
//
//                    val totalReqAndFixedMonCount =  battleList[round].fixedMonsterCount + reqMonCount
//
//
//                    if( totalReqAndFixedMonCount > 0 ) {
//                        dungeonInfoViewHolder.llReqMon.visibility = View.VISIBLE
//
//                        when (totalReqAndFixedMonCount) {
//                            1 -> {
//                                // 1 ReqMonster
//
//                                dungeonInfoViewHolder.llReqMon1.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon2.visibility = View.GONE
//                                dungeonInfoViewHolder.llReqMon3.visibility = View.GONE
//
//
//                                val fixedList1 = battleList[round].fixedMonsterList
//
//
//                                val fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//
//
//
//                                val monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//
//
//                                Picasso.with(context)
//                                        .load(monIcon1)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.s1)
//                                        .placeholder(R.drawable.s1)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon1)
//
//
//
//                            }
//                            2 -> {
//                                // 2 ReqMonster
//
//                                dungeonInfoViewHolder.llReqMon1.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon2.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon3.visibility = View.GONE
//
//                                var fixedList1 = mutableListOf<Int>()
//                                var fixedList2 = mutableListOf<Int>()
//                                var fixedMon1 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var fixedMon2 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var reqMon1 = 0
//
//                                if(totalReqAndFixedMonCount - reqMonCount != totalReqAndFixedMonCount) {
////have boss
//                                    fixedList1 = battleList[round].fixedMonsterList
//                                    reqMon1 = golemFragment.GetMonsterFromMonStage(  battleList[round].requiredMonster).uid
//
//                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//                                    fixedMon2 = golemFragment.GetMonStageFromUid(reqMon1)
//
//
//                                } else {
//
//                                    fixedList1 = battleList[round].fixedMonsterList
//
//
//                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//                                    fixedMon2 = golemFragment.GetMonDungeonStageFromUid(fixedList1[1])
//
//
//                                }
//
//
//                                val monChance1 = "100%"
//                                val monChance2 = "100%"
//
//
//                                dungeonInfoViewHolder.tvReqMonChance1.text = monChance1
//                                dungeonInfoViewHolder.tvReqMonChance2.text = monChance2
//
//
//
//
//
//                                val monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//                                val monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon2.uid))
//
//                                Picasso.with(context)
//                                        .load(monIcon1)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.s1)
//                                        .placeholder(R.drawable.s1)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon1)
//
//                                Picasso.with(context)
//                                        .load(monIcon2)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.s2)
//                                        .placeholder(R.drawable.s2)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon2)
//
//
//                                val monMax = "MAX " + battleList[round].monsterCountMax.toString()
//                                val monMin = "MIN " + battleList[round].monsterCountMin.toString()
//
//
//                                dungeonInfoViewHolder.tvMonMax.text = monMax
//                                dungeonInfoViewHolder.tvMonMin.text = monMin
//
//
//
//                            }
//                            3 -> {
//                                // 3 ReqMonster
//
//                                dungeonInfoViewHolder.llReqMon1.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon2.visibility = View.VISIBLE
//                                dungeonInfoViewHolder.llReqMon3.visibility = View.VISIBLE
//
//
//                                var fixedList1 = mutableListOf<Int>()
//
//                                var fixedMon1 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var fixedMon2 : MsgStageMonsterOuterClass.MsgStageMonster
//                                var fixedMon3 : MsgStageMonsterOuterClass.MsgStageMonster
//
//                                var monIcon1 : String
//                                var monIcon2 : String
//                                var monIcon3 : String
//
//
//                                var reqMon1 : Int
//
//                                if(totalReqAndFixedMonCount - reqMonCount != totalReqAndFixedMonCount) {
////have boss
//                                    fixedList1 = battleList[round].fixedMonsterList
//
//                                    reqMon1 =   battleList[round].requiredMonster
//
//
//                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//                                    fixedMon2 = golemFragment.GetMonDungeonStageFromUid(fixedList1[1])
//                                    fixedMon3 = golemFragment.GetMonStageFromUid(reqMon1)
//
//                                    monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//                                    monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon2.uid))
//                                    monIcon3 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonStage(fixedMon3.uid))
//
//                                } else {
//
//                                    fixedList1 = battleList[round].fixedMonsterList
//
//
//                                    fixedMon1 = golemFragment.GetMonDungeonStageFromUid(fixedList1[0])
//                                    fixedMon2 = golemFragment.GetMonDungeonStageFromUid(fixedList1[1])
//                                    fixedMon3 = golemFragment.GetMonDungeonStageFromUid(fixedList1[2])
//
//                                    monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon1.uid))
//                                    monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon2.uid))
//                                    monIcon3 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(fixedMon3.uid))
//
//                                }
//
//
//                                val monChance1 = "100%"
//                                val monChance2 = "100%"
//                                val monChance3 = "100%"
//
//                                dungeonInfoViewHolder.tvReqMonChance1.text = monChance1
//                                dungeonInfoViewHolder.tvReqMonChance2.text = monChance2
//                                dungeonInfoViewHolder.tvReqMonChance3.text = monChance3
//
//
//
//                                Picasso.with(context)
//                                        .load(monIcon1)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.s1)
//                                        .placeholder(R.drawable.s1)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade1)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon1.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon1)
//
//                                Picasso.with(context)
//                                        .load(monIcon2)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.s2)
//                                        .placeholder(R.drawable.s2)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade2)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromDungeonStageMon(fixedMon2.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon2)
//
//
//                                Picasso.with(context)
//                                        .load(monIcon3)
//                                        .error(R.drawable.skill_blank)
//                                        .placeholder(R.drawable.skill_blank)
//                                        .into(dungeonInfoViewHolder.ivReqMonIcon3)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionGradeFromStageMon(fixedMon3.uid))
//                                        .error(R.drawable.s3)
//                                        .placeholder(R.drawable.s3)
//                                        .into(dungeonInfoViewHolder.ivReqMonGrade3)
//                                Picasso.with(context)
//                                        .load(golemFragment.GetMinionElementFromStageMon(fixedMon3.uid))
//                                        .error(R.drawable.element_fire)
//                                        .placeholder(R.drawable.element_fire)
//                                        .into(dungeonInfoViewHolder.ivFrameReqMon3)
//
//
//                            }
//
//
//                        }
//
//
//                    } else {
//                        dungeonInfoViewHolder.llReqMon.visibility = View.INVISIBLE
//                    }
//
//
//                    val monMax = "MAX " + battleList[round].monsterCountMax.toString()
//                    val monMin = "MIN " + battleList[round].monsterCountMin.toString()
//
//
//                    dungeonInfoViewHolder.tvMonMax.text = monMax
//                    dungeonInfoViewHolder.tvMonMin.text = monMin
//
//
//                    if(totalReqAndFixedMonCount >= battleList[round].monsterCountMax) {
//
//                        dungeonInfoViewHolder.llRandomMon.visibility = View.GONE
//
//                        val monMax2 = "MAX " + totalReqAndFixedMonCount
//                        val monMin2 = "MIN " + totalReqAndFixedMonCount
//
//                        dungeonInfoViewHolder.tvMonMax.text = monMax2
//                        dungeonInfoViewHolder.tvMonMin.text = monMin2
//
//                    } else {
//                        //Normal
//                        dungeonInfoViewHolder.llRandomMon.visibility = View.VISIBLE
//
//                        dungeonInfoViewHolder.llMon1.visibility = View.VISIBLE
//                        dungeonInfoViewHolder.llMon2.visibility = View.VISIBLE
//                        dungeonInfoViewHolder.llMon3.visibility = View.VISIBLE
//                        dungeonInfoViewHolder.llMon4.visibility = View.VISIBLE
//
//
//
//
//                        val monGroup1 = golemFragment.GetMonDungeonStageFromUid(list[0].uid)
//                        val monGroup2 = golemFragment.GetMonDungeonStageFromUid(list[1].uid)
//                        val monGroup3 = golemFragment.GetMonDungeonStageFromUid(list[2].uid)
//                        val monGroup4 = golemFragment.GetMonDungeonStageFromUid(list[3].uid)
//
//
//                        val monChance1 = UtilFunctions.round((list[0].prob * 100f), 2).toString() + "%"
//                        val monChance2 = UtilFunctions.round((list[1].prob * 100f), 2).toString() + "%"
//                        val monChance3 = UtilFunctions.round((list[2].prob * 100f), 2).toString() + "%"
//                        val monChance4 = UtilFunctions.round((list[3].prob * 100f), 2).toString() + "%"
//
//                        dungeonInfoViewHolder.tvMonChance1.text = monChance1
//                        dungeonInfoViewHolder.tvMonChance2.text = monChance2
//                        dungeonInfoViewHolder.tvMonChance3.text = monChance3
//                        dungeonInfoViewHolder.tvMonChance4.text = monChance4
//
//
//
//                        val monIcon1 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(monGroup1.uid))
//                        val monIcon2 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(monGroup2.uid))
//                        val monIcon3 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(monGroup3.uid))
//                        val monIcon4 = UtilFunctions.GetAstromonResourceByID(context, golemFragment.GetMonsterFromMonDungeonStage(monGroup4.uid))
//
//
//                        Picasso.with(context)
//                                .load(monIcon1)
//                                .error(R.drawable.skill_blank)
//                                .placeholder(R.drawable.skill_blank)
//                                .into(dungeonInfoViewHolder.ivMonIcon1)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionGradeFromDungeonStageMon(monGroup1.uid))
//                                .error(R.drawable.s1)
//                                .placeholder(R.drawable.s1)
//                                .into(dungeonInfoViewHolder.ivMonGrade1)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionElementFromDungeonStageMon(monGroup1.uid))
//                                .error(R.drawable.element_fire)
//                                .placeholder(R.drawable.element_fire)
//                                .into(dungeonInfoViewHolder.ivFrameMon1)
//
//                        Picasso.with(context)
//                                .load(monIcon2)
//                                .error(R.drawable.skill_blank)
//                                .placeholder(R.drawable.skill_blank)
//                                .into(dungeonInfoViewHolder.ivMonIcon2)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionGradeFromDungeonStageMon(monGroup2.uid))
//                                .error(R.drawable.s2)
//                                .placeholder(R.drawable.s2)
//                                .into(dungeonInfoViewHolder.ivMonGrade2)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionElementFromDungeonStageMon(monGroup2.uid))
//                                .error(R.drawable.element_fire)
//                                .placeholder(R.drawable.element_fire)
//                                .into(dungeonInfoViewHolder.ivFrameMon2)
//
//
//                        Picasso.with(context)
//                                .load(monIcon3)
//                                .error(R.drawable.skill_blank)
//                                .placeholder(R.drawable.skill_blank)
//                                .into(dungeonInfoViewHolder.ivMonIcon3)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionGradeFromDungeonStageMon(monGroup3.uid))
//                                .error(R.drawable.s3)
//                                .placeholder(R.drawable.s3)
//                                .into(dungeonInfoViewHolder.ivMonGrade3)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionElementFromDungeonStageMon(monGroup3.uid))
//                                .error(R.drawable.element_fire)
//                                .placeholder(R.drawable.element_fire)
//                                .into(dungeonInfoViewHolder.ivFrameMon3)
//
//
//                        Picasso.with(context)
//                                .load(monIcon4)
//                                .error(R.drawable.skill_blank)
//                                .placeholder(R.drawable.skill_blank)
//                                .into(dungeonInfoViewHolder.ivMonIcon4)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionGradeFromDungeonStageMon(monGroup4.uid))
//                                .error(R.drawable.s4)
//                                .placeholder(R.drawable.s4)
//                                .into(dungeonInfoViewHolder.ivMonGrade4)
//                        Picasso.with(context)
//                                .load(golemFragment.GetMinionElementFromDungeonStageMon(monGroup4.uid))
//                                .error(R.drawable.element_fire)
//                                .placeholder(R.drawable.element_fire)
//                                .into(dungeonInfoViewHolder.ivFrameMon4)
//
//                    }
//
//
//
//
//
//                    val roundText = golemFragment.GetRoundString( Variables.STRING_ROUND  ).replace("{0}", (round + 1).toString())  .replace("{1}", GetDungeonInfoRoundSize(parentPosition).toString() )
//
//                    dungeonInfoViewHolder.tvMonStage.text = roundText
//
//                    return 4
//                }
//                else -> {
//                    dungeonInfoViewHolder.llMon1.visibility = View.INVISIBLE
//                    dungeonInfoViewHolder.llMon2.visibility = View.INVISIBLE
//                    dungeonInfoViewHolder.llMon3.visibility = View.INVISIBLE
//                    dungeonInfoViewHolder.llMon4.visibility = View.INVISIBLE
//                    return 0
//                }
//
//
//            }
//
//
//        }
//
//
//
//
//
//        override fun getChildTypeCount(): Int {
//            return 3
//        }
//
//        override fun getChildType(groupPosition: Int, childPosition: Int): Int {
//
//            when(groupPosition) {
//                0 -> {
//                    return 0
//                }
//                1 -> {
//                    return 1
//                }
//                2 -> {
//                    return 2
//                }
//                else -> {
//
//                    return 0
//                }
//
//            }
//        }
//
//
//        override fun getChildView(groupPosition: Int, childPosition: Int,
//                                  isLastChild: Boolean, convertView: View?, parent: ViewGroup): View {
//
////            val inflater : LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//            val childType = getChildType(groupPosition, childPosition)
//            val view : View
//
//            if( convertView == null || convertView.tag != childType) {
//                when (childType) {
//                    0 -> {
//
////                        rewardParentViewHolder = RewardParentViewHolder()
////
////                        val layoutInflater = context
////                                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
////                        view = layoutInflater.inflate(R.layout.grid_view_reward, parent, false)
////
////
////                        RewardParentViewRelationship(view)
//
//                        dungeonInfoViewHolder = DungeonInfoViewHolder()
//
//                        val layoutInflater = context
//                                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//                        view = layoutInflater.inflate(R.layout.list_item_golem_dungeon_info, parent, false)
//
//                        DungeonInfoViewRelationship(view)
//
//                    }
//
//                    1 -> {
//                        rewardParentViewHolder = RewardParentViewHolder()
//
//                        val layoutInflater = context
//                                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//                        view = layoutInflater.inflate(R.layout.grid_view_reward, parent, false)
//
//
//                        RewardParentViewRelationship(view)
//
//
//                    }
//
//
//
//
//                    else -> {
//
//                        val layoutInflater = context
//                                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//                        view = layoutInflater.inflate(R.layout.list_item_golem_dungeon_info, parent, false)
//
//                        view.tag = childType
//
//                    }
//
//
//                }
//
//
//            } else {
//                when (childType) {
//                    0 -> {
//                        childrenViewHolder = convertView.tag as (ChildrenViewHolder)
//                        view = convertView
//
////                        rewardParentViewHolder = convertView.tag as (RewardParentViewHolder)
////                        view = convertView
//                    }
//                    1 -> {
//                        rewardParentViewHolder = convertView.tag as (RewardParentViewHolder)
//                        view = convertView
//                    }
//
//                    else -> {
//                        childrenViewHolder = convertView.tag as (ChildrenViewHolder)
//                        view = convertView
//                    }
//
//                }
//
//
//
//            }
//
//
//            when (childType) {
//
//                0 -> {
//                    val curRound = golemFragment.GetMonsterInGroupFromList(subStages[parentPosition].uid, childPosition)
//
//
//                    val battleList = golemFragment.GetBattleList(subStages[parentPosition].uid)
//
//                    GetDungeonInfoDisplayMonsterSize (curRound , childPosition, battleList )
//
//
//
//
//                }
//
//                1 -> {
//                    val key : String = when (childPosition) {
//                        0 -> "normal"
////                        1 -> "rare"
//                        1 -> "superRare"
//                        else -> "-"
//
//                    }
//
//
//                    val RUNE_RARITY = listOf (
//                            context.getString(R.string.rr_normal),
//                            context.getString(R.string.rr_rare),
//                            context.getString(R.string.rr_s_rare)
//                    )
//
//                    val rarityText =  RUNE_RARITY[childPosition]
//
//
//
//                    rewardParentViewHolder.tvRewardRarity.text = rarityText
//
//                    for(gg in rewardObj) {
//
//                        Log.wtf("key", "key " + gg.key)
//
//                    }
//
//
//                    rewardParentViewHolder.gvReward.adapter = GridAdapter(context, rewardObj[key]!!,  childPosition)
//
//                }
//
//
//
//
//
//            }
//
//
//
//            return view
//
//        }
//
//
//        override fun getChildId(p0: Int, p1: Int): Long {
//            return p1.toLong()
//        }
//
//        override fun getGroupCount(): Int {
//            return list.size
//        }
//
//    }
//
//
//
//
//
//
//
////Section
//
//
//
//    override fun getGroup(p0: Int): Any {
//        return p0
//    }
//
//    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
//        return true
//    }
//
//    override fun hasStableIds(): Boolean {
//        return true
//    }
//
//
//
//    class ParentViewHolder {
//
//        lateinit var ivGolemParentIcon: ImageView
//        lateinit var ivGolemGrade: ImageView
//        lateinit var ivFrameGolem: ImageView
//        lateinit var tvGolemParentStage: TextView
//        lateinit var tvEnergyCost: TextView
//
//    }
//
//    class RewardParentViewHolder {
//        lateinit var gvReward: GridView
//        lateinit var tvRewardRarity: TextView
//    }
//
//    fun RewardParentViewRelationship (convertView: View) {
//
//        rewardParentViewHolder.gvReward = convertView.findViewById(R.id.gvReward)
//        rewardParentViewHolder.tvRewardRarity = convertView.findViewById(R.id.tvRewardRarity)
//
//        convertView.tag = rewardParentViewHolder
//
//    }
//
//
//
//    class Parent2ViewHolder {
//        lateinit var expGolem2: ExpandableListView
//    }
//
//    fun Parent2ViewRelationship (convertView: View) {
//
//        parent2ViewHolder.expGolem2 = convertView.findViewById(R.id.expGolem2)
//
//        convertView.tag = parent2ViewHolder
//
//    }
//
//
//    class DungeonInfoViewHolder {
//
//        lateinit var llMon1: LinearLayout
//        lateinit var llMon2: LinearLayout
//        lateinit var llMon3: LinearLayout
//        lateinit var llMon4: LinearLayout
//
//
//
//        lateinit var ivMonIcon1: ImageView
//        lateinit var ivMonGrade1: ImageView
//        lateinit var ivFrameMon1: ImageView
//
//        lateinit var ivMonIcon2: ImageView
//        lateinit var ivMonGrade2: ImageView
//        lateinit var ivFrameMon2: ImageView
//
//        lateinit var ivMonIcon3: ImageView
//        lateinit var ivMonGrade3: ImageView
//        lateinit var ivFrameMon3: ImageView
//
//        lateinit var ivMonIcon4: ImageView
//        lateinit var ivMonGrade4: ImageView
//        lateinit var ivFrameMon4: ImageView
//
//        lateinit var tvMonChance1: TextView
//        lateinit var tvMonChance2: TextView
//        lateinit var tvMonChance3: TextView
//        lateinit var tvMonChance4: TextView
//
//        lateinit var llReqMon1: LinearLayout
//        lateinit var llReqMon2: LinearLayout
//        lateinit var llReqMon3: LinearLayout
//
//        lateinit var llRandomMon: LinearLayout
//        lateinit var llReqMon: LinearLayout
//
//        lateinit var ivReqMonIcon1: ImageView
//        lateinit var ivReqMonGrade1: ImageView
//        lateinit var ivFrameReqMon1: ImageView
//
//        lateinit var ivReqMonIcon2: ImageView
//        lateinit var ivReqMonGrade2: ImageView
//        lateinit var ivFrameReqMon2: ImageView
//
//        lateinit var ivReqMonIcon3: ImageView
//        lateinit var ivReqMonGrade3: ImageView
//        lateinit var ivFrameReqMon3: ImageView
//
//
//
//        lateinit var tvReqMonChance1: TextView
//        lateinit var tvReqMonChance2: TextView
//        lateinit var tvReqMonChance3: TextView
//
//        lateinit var tvMonStage: TextView
//
//        lateinit var tvMonMax: TextView
//        lateinit var tvMonMin: TextView
//
//
//    }
//
//
//
//    fun DungeonInfoViewRelationship (convertView: View) {
//
//        dungeonInfoViewHolder.llMon1 = convertView.findViewById(R.id.llMon1)
//        dungeonInfoViewHolder.llMon2 = convertView.findViewById(R.id.llMon2)
//        dungeonInfoViewHolder.llMon3 = convertView.findViewById(R.id.llMon3)
//        dungeonInfoViewHolder.llMon4 = convertView.findViewById(R.id.llMon4)
//
//        dungeonInfoViewHolder.llReqMon1 = convertView.findViewById(R.id.llReqMon1)
//        dungeonInfoViewHolder.llReqMon2 = convertView.findViewById(R.id.llReqMon2)
//        dungeonInfoViewHolder.llReqMon3 = convertView.findViewById(R.id.llReqMon3)
//
//        dungeonInfoViewHolder.llRandomMon = convertView.findViewById(R.id.llRandomMon)
//        dungeonInfoViewHolder.llReqMon = convertView.findViewById(R.id.llReqMon)
//
//
//        dungeonInfoViewHolder.ivMonIcon1 = convertView.findViewById(R.id.ivMonIcon1)
//        dungeonInfoViewHolder.ivMonGrade1 = convertView.findViewById(R.id.ivMonGrade1)
//        dungeonInfoViewHolder.ivFrameMon1 = convertView.findViewById(R.id.ivFrameMon1)
//
//        dungeonInfoViewHolder.ivMonIcon2 = convertView.findViewById(R.id.ivMonIcon2)
//        dungeonInfoViewHolder.ivMonGrade2 = convertView.findViewById(R.id.ivMonGrade2)
//        dungeonInfoViewHolder.ivFrameMon2 = convertView.findViewById(R.id.ivFrameMon2)
//
//        dungeonInfoViewHolder.ivMonIcon3 = convertView.findViewById(R.id.ivMonIcon3)
//        dungeonInfoViewHolder.ivMonGrade3 = convertView.findViewById(R.id.ivMonGrade3)
//        dungeonInfoViewHolder.ivFrameMon3 = convertView.findViewById(R.id.ivFrameMon3)
//
//        dungeonInfoViewHolder.ivMonIcon4 = convertView.findViewById(R.id.ivMonIcon4)
//        dungeonInfoViewHolder.ivMonGrade4 = convertView.findViewById(R.id.ivMonGrade4)
//        dungeonInfoViewHolder.ivFrameMon4 = convertView.findViewById(R.id.ivFrameMon4)
//
//
//        dungeonInfoViewHolder.ivReqMonIcon1 = convertView.findViewById(R.id.ivReqMonIcon1)
//        dungeonInfoViewHolder.ivReqMonGrade1 = convertView.findViewById(R.id.ivReqMonGrade1)
//        dungeonInfoViewHolder.ivFrameReqMon1 = convertView.findViewById(R.id.ivFrameReqMon1)
//
//        dungeonInfoViewHolder.ivReqMonIcon2 = convertView.findViewById(R.id.ivReqMonIcon2)
//        dungeonInfoViewHolder.ivReqMonGrade2 = convertView.findViewById(R.id.ivReqMonGrade2)
//        dungeonInfoViewHolder.ivFrameReqMon2 = convertView.findViewById(R.id.ivFrameReqMon2)
//
//        dungeonInfoViewHolder.ivReqMonIcon3 = convertView.findViewById(R.id.ivReqMonIcon3)
//        dungeonInfoViewHolder.ivReqMonGrade3 = convertView.findViewById(R.id.ivReqMonGrade3)
//        dungeonInfoViewHolder.ivFrameReqMon3 = convertView.findViewById(R.id.ivFrameReqMon3)
//
//        dungeonInfoViewHolder.tvReqMonChance1 = convertView.findViewById(R.id.tvReqMonChance1)
//        dungeonInfoViewHolder.tvReqMonChance2 = convertView.findViewById(R.id.tvReqMonChance2)
//        dungeonInfoViewHolder.tvReqMonChance3 = convertView.findViewById(R.id.tvReqMonChance3)
//
//        dungeonInfoViewHolder.tvMonChance1 = convertView.findViewById(R.id.tvMonChance1)
//        dungeonInfoViewHolder.tvMonChance2 = convertView.findViewById(R.id.tvMonChance2)
//        dungeonInfoViewHolder.tvMonChance3 = convertView.findViewById(R.id.tvMonChance3)
//        dungeonInfoViewHolder.tvMonChance4 = convertView.findViewById(R.id.tvMonChance4)
//
//
//
//        dungeonInfoViewHolder.tvMonStage = convertView.findViewById(R.id.tvMonStage)
//
//        dungeonInfoViewHolder.tvMonMax = convertView.findViewById(R.id.tvMonMax)
//        dungeonInfoViewHolder.tvMonMin = convertView.findViewById(R.id.tvMonMin)
//
//
//        convertView.tag = dungeonInfoViewHolder
//
//    }
//
//
//
//    class ChildrenViewHolder {
//        lateinit var ivRewardIcon: ImageView
//        lateinit var tvRewardChance: TextView
//        lateinit var ivRewardRuneGrade: ImageView
//    }
//
//    fun ChildrenViewRelationship(convertView: View) {
//
//        childrenViewHolder.ivRewardIcon = convertView.findViewById(R.id.ivRewardIcon)
//        childrenViewHolder.tvRewardChance = convertView.findViewById(R.id.tvRewardChance)
//        childrenViewHolder.ivRewardRuneGrade = convertView.findViewById(R.id.ivRewardRuneGrade)
//
//        convertView.tag = childrenViewHolder
//
//    }
//
//
//    fun ParentViewRelationship(convertView: View) {
//
//        parentViewHolder.ivGolemParentIcon = convertView.findViewById(R.id.ivGolemParentIcon)
//        parentViewHolder.ivGolemGrade = convertView.findViewById(R.id.ivGolemGrade)
//        parentViewHolder.ivFrameGolem = convertView.findViewById(R.id.ivFrameGolem)
//        parentViewHolder.tvGolemParentStage = convertView.findViewById(R.id.tvGolemParentStage)
//        parentViewHolder.tvEnergyCost = convertView.findViewById(R.id.tvEnergyCost)
//
//        convertView.tag = parentViewHolder
//
//    }
//
//
//
//
//
//
//    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup): View {
//
//        val view : View
//
////        val exp : ExpandableListView = parent as ExpandableListView
////
////        if(!isExpanded) {
////            exp.expandGroup(groupPosition)
////        }
//
//
//        if (convertView == null) {
//            parentViewHolder = ParentViewHolder()
//
//            val layoutInflater = context
//                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//            view = layoutInflater.inflate(R.layout.list_item_golem_parent, parent, false)
//
//
//            ParentViewRelationship(view)
//
//        } else {
//
//            parentViewHolder = convertView.tag as (ParentViewHolder)
//
//            view = convertView
//
//        }
//
//
//
//
//        parentViewHolder.tvGolemParentStage.text = golemFragment.GetStageTitle(subStages[groupPosition].uid)
//        parentViewHolder.tvEnergyCost.text = subStages[groupPosition].requiredEnergy.toString()
//
//
//        val golemIcon = UtilFunctions.GetAstromonResourceByID(context, subStages[groupPosition].bossStartScene)
//
//
//        Picasso.with(context)
//                .load(golemIcon)
//                .error(R.drawable.skill_blank)
//                .placeholder(R.drawable.skill_blank)
//                .into(parentViewHolder.ivGolemParentIcon)
//
//
//        Picasso.with(context)
//                .load(golemFragment.GetGolemGrade(subStages[groupPosition].uid))
//                .error(R.drawable.s1)
//                .placeholder(R.drawable.s1)
//                .into(parentViewHolder.ivGolemGrade)
//
//        Picasso.with(context)
//                .load(golemFragment.GetGolemElementFlame(subStages[groupPosition].uid))
//                .error(R.drawable.element_fire)
//                .placeholder(R.drawable.element_fire)
//                .into(parentViewHolder.ivFrameGolem)
//
//
//
//        return view
//
//    }
//
//    override fun getChildrenCount(p0: Int): Int {
//        return 1
//    }
//
//    override fun getChild(p0: Int, p1: Int): Any {
//        return p1
//    }
//
//    override fun getGroupId(p0: Int): Long {
//        return p0.toLong()
//    }
//
//    override fun getChildView(groupPosition: Int, childPosition: Int,
//                              isLastChild: Boolean, convertView: View?, parent: ViewGroup): View {
//
//        val secondLevelExp = CustExpListview(context)
//
//        secondLevelExp.setAdapter(SecondLevelAdapter(groupPosition, rewardObj[groupPosition]!! ))
//
//        secondLevelExp.setGroupIndicator(context.resources. getDrawable( R.drawable.group_indicator))
//
//
//        secondLevelExp.setOnGroupClickListener { _, _, itemPosition, _ ->
//            if(secondLevelExp.isGroupExpanded(itemPosition)) {
//                secondLevelExp.collapseGroup(itemPosition)
//            } else {
//                secondLevelExp.expandGroup(itemPosition)
//            }
//            true
//        }
//
//        return secondLevelExp
//
//    }
//
//
//
//
//
//    override fun getChildId(p0: Int, p1: Int): Long {
//        return p1.toLong()
//    }
//
//    override fun getGroupCount(): Int {
//        return subStages.size
//    }
//}