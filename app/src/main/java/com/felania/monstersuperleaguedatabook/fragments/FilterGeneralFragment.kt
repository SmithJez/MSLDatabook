package com.felania.monstersuperleaguedatabook.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.CheckBox
import android.widget.GridView
import android.widget.LinearLayout
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.activities.FilterMonActivity
import com.felania.monstersuperleaguedatabook.adapters.FilterElementAdapter
import com.felania.monstersuperleaguedatabook.adapters.FilterGradeAdapter
import com.felania.monstersuperleaguedatabook.adapters.FilterSkillVariantAdapter
import com.felania.monstersuperleaguedatabook.adapters.FilterTypeAdapter
import com.felania.monstersuperleaguedatabook.utils.*
import com.felania.msldb.MsgMonsterSkillOuterClass
import com.felania.msldb.MsgStatusEffectOuterClass
import kotlinx.android.synthetic.main.mon_filter_general.*
import java.util.*


class FilterGeneralFragment : Fragment() {

    internal lateinit var ctx: Context
    lateinit var filterElementAdapter: FilterElementAdapter
    lateinit var filterGradeAdapter: FilterGradeAdapter
    lateinit var filterTypeAdapter: FilterTypeAdapter
    lateinit var filterVariantAdapter: FilterSkillVariantAdapter

    lateinit var mapElement : MutableList<ElementObject>
    lateinit var mapString  : Map<Int, String>
    lateinit var mapGrade : MutableList<GradeObject>
    lateinit var mapType : MutableList<TypeObject>

    lateinit var mapFx : Map<Int, MsgStatusEffectOuterClass.MsgStatusEffect>
    lateinit var mapSkill: HashMap<Int, MsgMonsterSkillOuterClass.MsgMonsterSkill>
    lateinit var dd: List<MsgMonsterSkillOuterClass.MsgMonsterSkill>

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.mon_filter_general, container, false)
        return rootView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        GetData()
    }

    private fun GetData() {
        val skillTitle = arguments.getString(Variables.SKILL_TITLE)

        mapElement = (context as FilterMonActivity ).GetElement()
        mapString  = (context as FilterMonActivity ).GetMapString()
        mapGrade = (context as FilterMonActivity).GetMapGrade()
        mapType = (context as FilterMonActivity).GetMapType()

        mapFx = (context as FilterMonActivity ).GetMapEffect()
        mapSkill = (context as FilterMonActivity ).GetMapLeaderSkillUnique()

        dd  = mapSkill.map{it.value}

//        val mapSkill = (context as FilterMonActivity ).GetMapSkillUnique(skillType)

        tvFilterTitle.text = skillTitle

        SetFragment(Variables.ELEMENT)
        SetFragment(Variables.GRADE)
        SetFragment(Variables.TYPE)
        SetFragment(Variables.SKILL_LEADER)


    }

    fun SetFragment (type: String) {
        //Element_START

        when(type) {
            Variables.ELEMENT -> {
                filterElementAdapter = FilterElementAdapter(ctx, mapElement, mapString ,  this)
                gvElement.adapter = filterElementAdapter
                gvElement.onItemClickListener = AdapterView.OnItemClickListener { _, view, position, _ ->
                    val parent: LinearLayout = view as LinearLayout
                    val count = parent.childCount

                    for (i in 0..count - 1) {
                        val v = parent.getChildAt(i)
                        if (v is CheckBox) {

                            if (v.isChecked) {
                                v.isChecked = false

                                filterElementAdapter.RemoveSingleCheck(position)

                                UnCheckedSelectAll(Variables.ELEMENT)
                            } else {
                                v.isChecked = true

                                filterElementAdapter.AddSingleCheck(position)

                                if (filterElementAdapter.CountCheck()) {
                                    CheckedSelectAll(Variables.ELEMENT)
                                }

                            }
                        }
                    }
                }
                cbSelectAllElement.setOnClickListener {
                    if (cbSelectAllElement.isChecked) {
                        SelectAllCheckbox(gvElement, Variables.ELEMENT)
                    } else {
                        SelectNoneCheckbox(gvElement, Variables.ELEMENT)
                    }
                }
            }

            Variables.GRADE -> {
                filterGradeAdapter = FilterGradeAdapter(ctx, mapGrade, mapString ,this)
                gvGrade.adapter = filterGradeAdapter
                gvGrade.onItemClickListener = AdapterView.OnItemClickListener { _, view, position, _ ->
                    val parent: LinearLayout = view as LinearLayout
                    val count = parent.childCount

                    for (i in 0..count - 1) {
                        val v = parent.getChildAt(i)
                        if (v is CheckBox) {

                            if (v.isChecked) {
                                v.isChecked = false

                                filterGradeAdapter.RemoveSingleCheck(position)

                                UnCheckedSelectAll(Variables.GRADE)
                            } else {
                                v.isChecked = true

                                filterGradeAdapter.AddSingleCheck(position)

                                if (filterGradeAdapter.CountCheck()) {
                                    CheckedSelectAll(Variables.GRADE)
                                }

                            }
                        }
                    }
                }
                cbSelectAllGrade.setOnClickListener {
                    if (cbSelectAllGrade.isChecked) {
                        SelectAllCheckbox(gvGrade, Variables.GRADE)
                    } else {
                        SelectNoneCheckbox(gvGrade, Variables.GRADE)
                    }
                }
            }


            Variables.TYPE -> {
                filterTypeAdapter = FilterTypeAdapter(ctx, mapType, mapString ,this)
                gvType.adapter = filterTypeAdapter
                gvType.onItemClickListener = AdapterView.OnItemClickListener { _, view, position, _ ->
                    val parent: LinearLayout = view as LinearLayout
                    val count = parent.childCount

                    for (i in 0..count - 1) {
                        val v = parent.getChildAt(i)
                        if (v is CheckBox) {

                            if (v.isChecked) {
                                v.isChecked = false

                                filterTypeAdapter.RemoveSingleCheck(position)

                                UnCheckedSelectAll(Variables.TYPE)
                            } else {
                                v.isChecked = true

                                filterTypeAdapter.AddSingleCheck(position)

                                if (filterTypeAdapter.CountCheck()) {
                                    CheckedSelectAll(Variables.TYPE)
                                }

                            }
                        }
                    }
                }
                cbSelectAllType.setOnClickListener {
                    if (cbSelectAllType.isChecked) {
                        SelectAllCheckbox(gvType, Variables.TYPE)
                    } else {
                        SelectNoneCheckbox(gvType, Variables.TYPE)
                    }
                }
            }


            Variables.SKILL_LEADER -> {
                filterVariantAdapter = FilterSkillVariantAdapter(ctx, dd, mapFx, mapString, mapSkill, this)
                gvVariant.adapter = filterVariantAdapter
                gvVariant.onItemClickListener = AdapterView.OnItemClickListener { _, view, position, _ ->
                    val parent: LinearLayout = view as LinearLayout
                    val count = parent.childCount

                    for (i in 0..count - 1) {
                        val v = parent.getChildAt(i)
                        if (v is CheckBox) {

                            if (v.isChecked) {
                                v.isChecked = false

                                filterVariantAdapter.RemoveSingleCheck(position)

                                UnCheckedSelectAll(Variables.SKILL_LEADER)
                            } else {
                                v.isChecked = true

                                filterVariantAdapter.AddSingleCheck(position)

                                if (filterVariantAdapter.CountCheck()) {
                                    CheckedSelectAll(Variables.SKILL_LEADER)
                                }

                            }
                        }
                    }
                }
                cbSelectAllVariant.setOnClickListener {
                    if (cbSelectAllVariant.isChecked) {
                        SelectAllCheckbox(gvVariant, Variables.SKILL_LEADER)
                    } else {
                        SelectNoneCheckbox(gvVariant, Variables.SKILL_LEADER)
                    }
                }
            }


        }



//Element_END



    }




    fun GetSelectedVariant(): ArrayList<CheckState> {
        return filterVariantAdapter.SendArrayList()
    }

    fun GetSelectedSkillBook(): Boolean {

        return cbSkillBook.isChecked
    }

    fun GetSelectedElement(): ArrayList<CheckState> {

        return filterElementAdapter.SendArrayList()

    }

    fun GetSelectedGrade (): ArrayList<CheckState> {
        return filterGradeAdapter.SendArrayList()
    }

    fun GetSelectedType (): ArrayList<CheckState> {
        return filterTypeAdapter.SendArrayList()
    }


    fun UnCheckedSelectAll(cbType: String) {
        when(cbType) {
            Variables.ELEMENT -> {
                cbSelectAllElement.isChecked = false
            }
            Variables.GRADE -> {
                cbSelectAllGrade.isChecked = false
            }
            Variables.TYPE -> {
                cbSelectAllType.isChecked = false
            }


        }
    }

    fun CheckedSelectAll(cbType: String) {

        when(cbType) {
            Variables.ELEMENT -> {
                cbSelectAllElement.isChecked = true
            }
            Variables.GRADE -> {
                cbSelectAllGrade.isChecked = true
            }
            Variables.TYPE -> {
                cbSelectAllType.isChecked = true
            }


        }


    }

    private fun SelectAllCheckbox(gv: GridView, gvType: String) {
        (0..gv.childCount - 1)
                .map { gv.getChildAt(it) }
                .map { it as LinearLayout }
                .forEach { parent ->
                    (0..parent.childCount - 1)
                            .map { parent.getChildAt(it) }
                            .filterIsInstance<CheckBox>()
                            .forEach { it.isChecked = true }
                }
        when(gvType) {
            Variables.ELEMENT -> {
                filterElementAdapter.CheckedAll()
            }
            Variables.GRADE -> {
                filterGradeAdapter.CheckedAll()
            }
            Variables.TYPE -> {
                filterTypeAdapter.CheckedAll()
            }
        }
    }

    private fun SelectNoneCheckbox(gv: GridView, gvType: String) {
        (0..gv.childCount - 1)
                .map { gv.getChildAt(it) }
                .map { it as LinearLayout }
                .forEach { parent ->
                    (0..parent.childCount - 1)
                            .map { parent.getChildAt(it) }
                            .filterIsInstance<CheckBox>()
                            .forEach { it.isChecked = false }
                }

        when(gvType) {
            Variables.ELEMENT -> {
                filterElementAdapter.UnCheckedAll()
            }
            Variables.GRADE -> {
                filterGradeAdapter.UnCheckedAll()
            }
            Variables.TYPE -> {
                filterTypeAdapter.UnCheckedAll()

            }
        }
    }

    override fun onAttach(context: Context) {
        this.ctx = context
        super.onAttach(context)
    }




}

