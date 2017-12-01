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
import com.felania.monstersuperleaguedatabook.utils.Variables
import com.felania.msldb.MsgMonsterSkillOuterClass.MsgMonsterSkill
import com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.mon_filter_child.view.*



class FilterSkillVariantAdapter (var context: Context,
                                 skillsEffect: List<MsgMonsterSkill>,
                                 mapEffect: Map<Int, MsgStatusEffect>,
                                 mapString: Map<Int, String>,
                                 _mapSkill: Map<Int, MsgMonsterSkill>,
                                 fragment: Fragment

) :
        BaseAdapter() {

    var listSkillEffect: List<MsgMonsterSkill> = listOf()
    var ctx : Context
    var mapFx : Map<Int, MsgStatusEffect> = hashMapOf()
    var mapStr : Map<Int, String> = hashMapOf()
    var mapSkill : Map<Int, MsgMonsterSkill> = hashMapOf()

    private var arrayCheck: ArrayList<CheckState>

    private val mInflator: LayoutInflater

    init {
        listSkillEffect = skillsEffect
        mapSkill = _mapSkill

        ctx = context
        mapFx = mapEffect
        mapStr = mapString
        this.mInflator = LayoutInflater.from(context)

        arrayCheck = (context as FilterMonActivity).ReadSavedFilter(Variables.SKILL_LEADER)

        if (arrayCheck.size == 0){
            CheckedAll()
        }

        if (CountCheck()) {
            (fragment as FilterGeneralFragment).CheckedSelectAll(Variables.SKILL_LEADER)
        } else {
            (fragment as FilterGeneralFragment).UnCheckedSelectAll(Variables.SKILL_LEADER)
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
//        val skill : MsgMonsterSkill
//        val mapEff : MsgStatusEffect
//        val skillName : String
//        val skillPath : String



        val skill = listSkillEffect[position]
        val mapEff = mapFx[skill.statusEffect]!!.name
        val skillName = mapStr[ mapEff ]!!

        val skillPath = GetSkillEffectResource( skill.icon)


//        val skillPath = GetSkillEffectResource( mapFx[skill.uid]!!.subType.name)


        viewHolder.tvSkill.text = skillName
        Picasso.with(context)
                .load(skillPath)
                .error(R.drawable.skill_blank)
                .placeholder(R.drawable.skill_blank)
                .into(viewHolder.ivSkill)


        viewHolder.cbSkill.setOnCheckedChangeListener { _, isChecked ->
            val checkState = CheckState(position, skillName, isChecked)
            arrayCheck[position] = checkState
        }

        viewHolder.cbSkill.isChecked = arrayCheck[position].check


        return view
    }

    override fun getItem(position: Int): Any  = listSkillEffect[position]
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getCount(): Int = listSkillEffect.size



    class ViewHolder (view: View) {

        val tvSkill: TextView =  view.tvSkill
        val ivSkill: ImageView = view.ivSkill
        val cbSkill: CheckBox = view.cbSkill
//        val llSkill: LinearLayout = view.llSkill


    }


    fun GetSkillEffectResource (resName : String) : String {

//        Log.wtf("loggg", "loggg " + resName)

        val res = resName.replace("SEST_", "se_").replace(".","_").toLowerCase()

        val fullPath = "file://" + context.filesDir + "/" +    res + ".webp"

        return fullPath
    }

    fun CheckedAll() {
        arrayCheck.clear()

        for (i in 0..count - 1) {


            val skill = listSkillEffect[i]
            val mapEff = mapFx[skill.statusEffect]!!.name
            val skillName = mapStr[ mapEff ]!!

            val checkState = CheckState(i, skillName, true)
            arrayCheck.add(checkState)
        }
    }

    fun UnCheckedAll() {
        arrayCheck.clear()


        for (i in 0..count - 1) {
            val skill = listSkillEffect[i]
            val mapEff = mapFx[skill.statusEffect]!!.name
            val skillName = mapStr[ mapEff ]!!

            val checkState = CheckState(i, skillName, false)
            arrayCheck.add(checkState)
        }
    }




    fun CountCheck(): Boolean {
        val trueCount = (0..arrayCheck.size - 1).count { arrayCheck[it].check }
        return trueCount == count
    }

    fun AddSingleCheck(position: Int) {
        val skill = listSkillEffect[position]
        val mapEff = mapFx[skill.statusEffect]!!.name
        val skillName = mapStr[ mapEff ]!!

        val checkState = CheckState(position, skillName, true)
        arrayCheck[position] = checkState
    }

    fun RemoveSingleCheck(position: Int) {

        val skill = listSkillEffect[position]
        val mapEff = mapFx[skill.statusEffect]!!.name
        val skillName = mapStr[ mapEff ]!!

        val checkState = CheckState(position, skillName, false)
        arrayCheck[position] = checkState
    }

    fun SendArrayList(): ArrayList<CheckState> {
        return arrayCheck
    }


}
