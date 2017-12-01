package com.felania.monstersuperleaguedatabook.adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.activities.FilterMonActivity
import com.felania.monstersuperleaguedatabook.fragments.FilterGeneralFragment
import com.felania.monstersuperleaguedatabook.utils.CheckState
import com.felania.monstersuperleaguedatabook.utils.ElementObject
import com.felania.monstersuperleaguedatabook.utils.Variables
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.mon_filter_child.view.*



class FilterElementAdapter (var context: Context,
                            mapElement: MutableList<ElementObject>,
                            mapString: Map<Int, String>,
                            fragment: Fragment

) :
        BaseAdapter() {


    var ctx : Context = context
    var _mapElement : MutableList<ElementObject> = mutableListOf()
    var mapStr : Map<Int, String> = hashMapOf()

    private var arrayCheck: ArrayList<CheckState>

    private val mInflator: LayoutInflater

    init {



        _mapElement = mapElement

//        if(_mapElement is  MutableList<*>) {
//
//        }

        mapStr = mapString
        this.mInflator = LayoutInflater.from(context)

        arrayCheck = (context as FilterMonActivity).ReadSavedFilter(Variables.ELEMENT)

        if (arrayCheck.size == 0){
            CheckedAll()
        }

        if (CountCheck()) {
            (fragment as FilterGeneralFragment).CheckedSelectAll(Variables.ELEMENT)

        } else {

            (fragment as FilterGeneralFragment).UnCheckedSelectAll(Variables.ELEMENT)


        }


    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View
        val viewHolder: ViewHolder
        if(convertView == null) {
            view = this.mInflator.inflate(R.layout.mon_filter_child, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder

        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder

        }

        val eleRes : Int = _mapElement[position].elementRes
        val eleString : String = _mapElement[ position].elementStr

        viewHolder.tvSkill.text = eleString
        viewHolder.tvSkill.setAllCaps(true)

        Picasso.with(context)
                .load(eleRes)
                .error(R.drawable.skill_blank)
                .placeholder(R.drawable.skill_blank)
                .into(viewHolder.ivSkill)


        viewHolder.cbSkill.setOnCheckedChangeListener { _, isChecked ->
            val checkState = CheckState(position, eleString, isChecked)
            arrayCheck[position] = checkState
        }

        viewHolder.cbSkill.isChecked = arrayCheck[position].check


        return view
    }

    override fun getItem(position: Int): Any  = _mapElement[position]
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getCount(): Int = _mapElement.size



    class ViewHolder (view: View) {

        val tvSkill: TextView =  view.tvSkill
        val ivSkill: ImageView = view.ivSkill
        val cbSkill: CheckBox = view.cbSkill
//        val llSkill: LinearLayout = view.llSkill


    }


    fun GetSkillEffectResource (resName : String) : String {
        val res = resName.replace("SEST_", "se_").replace(".","_").toLowerCase()

        val fullPath = "file://" + context.filesDir + "/" +    res + ".webp"

        return fullPath
    }

    fun CheckedAll() {
        arrayCheck.clear()


        for (i in 0..count - 1) {
//            val skill = _mapElement[i]
//            val mapEff = mapFx[skill.uid]
//            val skillName = mapStr[ mapEff!!.name]!!

//            val eleRes : Int = _mapElement[i].elementRes
            val eleString : String = _mapElement[ i].elementStr


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

            val eleString : String = _mapElement[ i].elementStr

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

        val eleString : String = _mapElement[position].elementStr

        val checkState = CheckState(position, eleString, true)
        arrayCheck[position] = checkState
    }

    fun RemoveSingleCheck(position: Int) {

//        val skill = listSkillEffect[position]
//        val mapEff = mapFx[skill.uid]
//        val skillName = mapStr[ mapEff!!.name]!!

        val eleString : String = _mapElement[position].elementStr

        val checkState = CheckState(position, eleString, false)
        arrayCheck[position] = checkState
    }

    fun SendArrayList(): ArrayList<CheckState> {
        return arrayCheck
    }


}
