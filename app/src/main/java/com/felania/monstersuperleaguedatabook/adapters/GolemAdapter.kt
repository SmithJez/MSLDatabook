//package com.felania.monstersuperleaguedatabook.adapters
//
//import android.content.Context
//import android.support.v7.widget.RecyclerView
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import com.felania.monstersuperleaguedatabook.R
//import com.felania.monstersuperleaguedatabook.utils.RecyclerViewFastScrollerWithBubble
//import com.felania.monstersuperleaguedatabook.utils.UtilFunctions
//import com.felania.monstersuperleaguedatabook.utils.Variables
//import com.felania.msldb.MsgClanSubStageOuterClass
//import com.felania.msldb.MsgDungeonStageOuterClass
//import com.felania.msldb.MsgDungeonStageOuterClass.MsgDungeonStage
//import com.felania.msldb.MsgDungeonSubStageOuterClass
//import com.felania.msldb.MsgDungeonSubStageOuterClass.MsgDungeonSubStage
//import com.squareup.picasso.Picasso
//import kotlinx.android.synthetic.main.child_clan.view.*
//import kotlinx.android.synthetic.main.list_item_golem_parent.view.*
//import java.text.NumberFormat
//import java.util.*
//
//class GolemAdapter(private var context: Context, private var subStages: List<MsgDungeonSubStage>, private var golemFragment: GolemFragment
//) :
//        RecyclerView.Adapter<GolemAdapter.ViewHolder>() {
//
////    var ctx = context
////    var subStage = _subStages
//
//    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_golem_parent, parent, false)
//        return ViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.bindView(context, subStages[position], golemFragment
//                )
//    }
//
//    override fun getItemCount() = subStages.size
//
//
//    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
//
//        fun bindView(context: Context, subStages: MsgDungeonSubStage, golemFragment: GolemFragment){
//            with(subStages) {
//
//
//                var golemIcon = UtilFunctions.GetAstromonResourceByID(context, subStages.bossStartScene)
//
//                itemView.tvGolemParentStage.text = golemFragment.GetStageTitle(subStages.uid)
//
//
//
//                Picasso.with(itemView.context)
//                        .load(golemIcon)
//                        .error(R.drawable.skill_blank)
//                        .placeholder(R.drawable.skill_blank)
//                        .into(itemView.ivGolemParentIcon)
//
//
//                Picasso.with(itemView.context)
//                        .load(golemFragment.GetGolemGrade(uid))
//                        .error(R.drawable.s1)
//                        .placeholder(R.drawable.s1)
//                        .into(itemView.ivGolemGrade)
//
//                Picasso.with(itemView.context)
//                        .load(golemFragment.GetGolemElementFlame(uid))
//                        .error(R.drawable.element_fire)
//                        .placeholder(R.drawable.element_fire)
//                        .into(itemView.ivFrameGolem)
//
//
//            }
//        }
//
//
//    }
//
//
//
//
//}