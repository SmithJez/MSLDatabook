package com.felania.monstersuperleaguedatabook.adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckBox
import android.widget.TextView
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.activities.FilterMonActivity
import com.felania.monstersuperleaguedatabook.fragments.FilterGeneralFragment
import com.felania.monstersuperleaguedatabook.utils.CheckState
import com.felania.monstersuperleaguedatabook.utils.TypeObject
import com.felania.monstersuperleaguedatabook.utils.Variables
import kotlinx.android.synthetic.main.mon_filter_child.view.*



class FilterTypeAdapter (var context: Context,
                          mapType: MutableList<TypeObject>,
                          mapString: Map<Int, String>,
                          fragment: Fragment

) :
        BaseAdapter() {


    var ctx : Context = context
    var _mapType : MutableList<TypeObject> = mutableListOf()
    var mapStr : Map<Int, String> = hashMapOf()

    private var arrayCheck: ArrayList<CheckState>

    private val mInflator: LayoutInflater

    init {
        _mapType = mapType
        mapStr = mapString
        this.mInflator = LayoutInflater.from(context)

        arrayCheck = (context as FilterMonActivity).ReadSavedFilter(Variables.TYPE)

        if (arrayCheck.size == 0){
            CheckedAll()
        }

        if (CountCheck()) {
            (fragment as FilterGeneralFragment).CheckedSelectAll(Variables.TYPE)

        } else {

            (fragment as FilterGeneralFragment).UnCheckedSelectAll(Variables.TYPE)


        }


    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View
        val viewHolder: ViewHolder
        if(convertView == null) {
            view = this.mInflator.inflate(R.layout.mon_filter_child_type, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder

        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder

        }

//        val gradeRes : Int = _mapType[position].gradeRes
//        val gradeString : String = _mapGrade[ position].gradeString
        val typeString : String = _mapType[position].typeString


//        val skillName = mapStr[ mapEff!!.name  ]!!
//        val elePath = GetSkillEffectResource( mapFx[skill.uid]!!.subType.name)

        viewHolder.tvSkill.text = typeString
        viewHolder.tvSkill.setAllCaps(true)

        viewHolder.cbSkill.setOnCheckedChangeListener { _, isChecked ->
            val checkState = CheckState(position, typeString, isChecked)
            arrayCheck[position] = checkState
        }

        viewHolder.cbSkill.isChecked = arrayCheck[position].check


        return view
    }

    override fun getItem(position: Int): Any  = _mapType[position]
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getCount(): Int = _mapType.size



    class ViewHolder (view: View) {
        val tvSkill: TextView = view.tvSkill
        val cbSkill: CheckBox = view.cbSkill
//        val llSkill: LinearLayout = view.llSkill


    }


    fun CheckedAll() {
        arrayCheck.clear()


        for (i in 0..count - 1) {
//            val skill = _mapElement[i]
//            val mapEff = mapFx[skill.uid]
//            val skillName = mapStr[ mapEff!!.name]!!

//            val eleRes : Int = _mapElement[i].elementRes
            val eleString : String = _mapType[i].typeString


            val checkState = CheckState(i, eleString, true)
            arrayCheck.add(checkState)
        }
    }

    fun UnCheckedAll() {
        arrayCheck.clear()


        for (i in 0..count - 1) {
//            val skill = listSkillEffect[i]
//            val mapEff = mapFx[skill.uid]
//            val skillName = mapStr[ mapEff!!.name]!!

            val eleString : String = _mapType[ i].typeString

            val checkState = CheckState(i, eleString, false)
            arrayCheck.add(checkState)
        }
    }




    fun CountCheck(): Boolean {
        val trueCount = (0..arrayCheck.size - 1).count { arrayCheck[it].check }
        return trueCount == count
    }

    fun AddSingleCheck(position: Int) {
//        val skill = listSkillEffect[position]
//        val mapEff = mapFx[skill.uid]
//        val skillName = mapStr[ mapEff!!.name]!!

        val eleString : String = _mapType[position].typeString

        val checkState = CheckState(position, eleString, true)
        arrayCheck[position] = checkState
    }

    fun RemoveSingleCheck(position: Int) {

//        val skill = listSkillEffect[position]
//        val mapEff = mapFx[skill.uid]
//        val skillName = mapStr[ mapEff!!.name]!!

        val eleString : String = _mapType[position].typeString

        val checkState = CheckState(position, eleString, false)
        arrayCheck[position] = checkState
    }

    fun SendArrayList(): ArrayList<CheckState> {
        return arrayCheck
    }


}
