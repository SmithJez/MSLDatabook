package com.felania.monstersuperleaguedatabook.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.activities.MonDBActivity
import com.felania.monstersuperleaguedatabook.fragments.AstroguideDetailActivity
import com.felania.msldb.MonsterUpgradeSkillDataOuterClass
import kotlinx.android.synthetic.main.skill_book_child.view.*


class SkillBookPopUpAdapter (context: Context, _skills: List<MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData>
                      ) :
        RecyclerView.Adapter<SkillBookPopUpAdapter.ViewHolder>() {

    var ctx = context
    var skills = _skills

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.skill_book_child, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(ctx, skills[position]
                )
    }

    override fun getItemCount() = skills.size



    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {

        fun bindView(ctx: Context, skills: MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData){
            with(skills) {
                itemView.tvSkillBookDesc.text = (ctx as AstroguideDetailActivity).GetStringUpgradeSkillData(skills)
            }
        }
    }




}


