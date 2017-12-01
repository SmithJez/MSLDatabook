package com.felania.monstersuperleaguedatabook.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.felania.monstersuperleaguedatabook.R
import kotlinx.android.synthetic.main.skill_book_child.view.*


class SkillBookPopUpLevelAdapter (_skills: List<String>
                      ) :
        RecyclerView.Adapter<SkillBookPopUpLevelAdapter.ViewHolder>() {

    var skills = _skills

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.skill_book_child_2, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(skills[position])
    }

    override fun getItemCount() = skills.size



    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {

        fun bindView(skills: String){
            with(skills) {
                val lvl = skills

                itemView.tvSkillBookDesc.text = lvl
            }
        }


    }




}


