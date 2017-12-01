package com.felania.monstersuperleaguedatabook.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.CheckBox
import android.widget.LinearLayout
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.activities.FilterMonActivity
import com.felania.monstersuperleaguedatabook.adapters.FilterSkillAdapter
import com.felania.monstersuperleaguedatabook.utils.CheckState
import com.felania.monstersuperleaguedatabook.utils.Variables
import com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect
import kotlinx.android.synthetic.main.mon_filter_skill.*
import java.util.*



class FilterPassiveFragment : Fragment() {

    internal lateinit var ctx: Context
    lateinit var filterSkillAdapter: FilterSkillAdapter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.mon_filter_skill, container, false)
        return rootView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        GetData()
    }

    private fun GetData() {

        val skillType = arguments.getString(Variables.SKILL_TYPE)
        val skillTitle = arguments.getString(Variables.SKILL_TITLE)

        val mapFx = (context as FilterMonActivity ).GetMapEffect()
        val mapString  = (context as FilterMonActivity ).GetMapString()
        val mapSkill = (context as FilterMonActivity ).GetMapSkillUnique(skillType)

        tvFilterTitle.text = skillTitle

        val dd : List<MsgStatusEffect> = mapSkill.map{it.value}

        filterSkillAdapter = FilterSkillAdapter(ctx, dd,mapFx, mapString , skillType, this)
        lvFilterSkill.adapter = filterSkillAdapter
        lvFilterSkill.onItemClickListener = AdapterView.OnItemClickListener { _, view, position, _ ->
            val parent: LinearLayout = view as LinearLayout
            val count = parent.childCount

            for (i in 0..count - 1) {
                val v = parent.getChildAt(i)
                if (v is CheckBox) {

                    if (v.isChecked) {
                        v.isChecked = false

                        filterSkillAdapter.RemoveSingleCheck(position)

                        UnCheckedSelectAll()
                    } else {
                        v.isChecked = true

                        filterSkillAdapter.AddSingleCheck(position)

                        if (filterSkillAdapter.CountCheck()) {
                            CheckedSelectAll()
                        }

                    }
                }
            }
        }


        cbSelectAllSkill.setOnClickListener {
            if (cbSelectAllSkill.isChecked) {
                SelectAllCheckbox()
            } else {
                SelectNoneCheckbox()
            }
        }




    }

    fun GetSelectedSkill(): ArrayList<CheckState> {

        return filterSkillAdapter.SendArrayList()

    }


    fun UnCheckedSelectAll() {
        cbSelectAllSkill.isChecked = false
    }

    fun CheckedSelectAll() {
        cbSelectAllSkill.isChecked = true
    }

    private fun SelectAllCheckbox() {
        (0..lvFilterSkill.childCount - 1)
                .map { lvFilterSkill.getChildAt(it) }
                .map { it as LinearLayout }
                .forEach { parent ->
                    (0..parent.childCount - 1)
                            .map { parent.getChildAt(it) }
                            .filterIsInstance<CheckBox>()
                            .forEach { it.isChecked = true }
                }
        filterSkillAdapter.CheckedAll()

    }

    private fun SelectNoneCheckbox() {
        (0..lvFilterSkill.childCount - 1)
                .map { lvFilterSkill.getChildAt(it) }
                .map { it as LinearLayout }
                .forEach { parent ->
                    (0..parent.childCount - 1)
                            .map { parent.getChildAt(it) }
                            .filterIsInstance<CheckBox>()
                            .forEach { it.isChecked = false }
                }

        filterSkillAdapter.UnCheckedAll()
    }

    override fun onAttach(context: Context) {
        this.ctx = context
        super.onAttach(context)
    }


}
