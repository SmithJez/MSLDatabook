package com.felania.monstersuperleaguedatabook.activities

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.fragments.FilterActiveFragment
import com.felania.monstersuperleaguedatabook.fragments.FilterGeneralFragment
import com.felania.monstersuperleaguedatabook.fragments.FilterPassiveFragment
import com.felania.monstersuperleaguedatabook.utils.*
import com.felania.msldb.MsgMonsterSkillOuterClass
import com.felania.msldb.MsgStatusEffectOuterClass
import com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect
import com.felania.msldb.MsgUidOuterClass
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_mon_filter.*
import java.util.*


class FilterMonActivity : AppCompatActivity() {


    lateinit var filterPassiveFragment: FilterPassiveFragment
    lateinit var filterActiveFragment: FilterActiveFragment
    lateinit var filterGeneralFragment: FilterGeneralFragment

    var context = this

    var ffff: Map<String, MsgUidOuterClass.MsgUid> = hashMapOf()

    var ssss: Map<Int, String> = hashMapOf()

    lateinit var centralDB : CentralDB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mon_filter)

        centralDB = CentralDB(context)

        ffff = centralDB.mapUid
        ssss = centralDB.mapString


        val mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)

        filterPager.adapter = mSectionsPagerAdapter


        filterTab.setupWithViewPager(filterPager)


        filterPager.setOnTouchListener { v, _ ->
            val margin = 10
            val fragmentOffset = v.scrollX % v.width

            if (fragmentOffset > margin && fragmentOffset < v.width - margin) {
                filterPager.parent.requestDisallowInterceptTouchEvent(true)
            }
            false
        }



        filterPager.offscreenPageLimit = 3


    }

    fun GetMapType(): MutableList<TypeObject> {
        return centralDB.GetMapType()
    }

    fun GetMapGrade(): MutableList<GradeObject> {
        return centralDB.mapGrade()
    }


    fun GetElement (): MutableList<ElementObject> {
        return centralDB.mapElement()
    }


    fun GetMapEffect (): Map<Int, MsgStatusEffect> {
        return centralDB.mapEffect
    }

    fun GetMapString (): Map<Int, String> {
        return centralDB.mapString
    }

    fun GetMapSkillUnique (skillType: String): HashMap<Int, MsgStatusEffect> {
        var mapSkill : HashMap<Int, MsgStatusEffectOuterClass.MsgStatusEffect> = hashMapOf()
        when (skillType) {
            Variables.SKILL_DEFAULT -> {
                mapSkill = centralDB.mapUniqueDefaultSkillEffect()
            }
            Variables.SKILL_ACTIVE -> {
                mapSkill = centralDB.mapUniqueActiveSkillEffect()
            }
        }
        return mapSkill
    }


    fun GetMapLeaderSkillUnique (): HashMap<Int, MsgMonsterSkillOuterClass.MsgMonsterSkill> {

        return  centralDB.mapUniqueLeaderSkillEffect()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.mon_filter_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        val id = item!!.itemId

        when (id) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
            R.id.menuFilterSave -> {
                SaveAndReturn()
                return true
            }

        }


        return super.onOptionsItemSelected(item)
    }



    private fun SaveAndReturn() {

        filterGeneralFragment = supportFragmentManager
                .findFragmentByTag("android:switcher:" + R.id.filterPager + ":0") as FilterGeneralFragment

        intent.putExtra(Variables.SKILL_BOOK, filterGeneralFragment.GetSelectedSkillBook()   )

        intent.putParcelableArrayListExtra(Variables.ELEMENT, filterGeneralFragment.GetSelectedElement()   )
        SaveFilter(Variables.ELEMENT, filterGeneralFragment.GetSelectedElement())

        intent.putParcelableArrayListExtra(Variables.GRADE, filterGeneralFragment.GetSelectedGrade()   )
        SaveFilter(Variables.GRADE, filterGeneralFragment.GetSelectedGrade())

        intent.putParcelableArrayListExtra(Variables.TYPE, filterGeneralFragment.GetSelectedType()   )
        SaveFilter(Variables.TYPE, filterGeneralFragment.GetSelectedType())

        intent.putParcelableArrayListExtra(Variables.SKILL_LEADER, filterGeneralFragment.GetSelectedVariant()   )
        SaveFilter(Variables.SKILL_LEADER, filterGeneralFragment.GetSelectedVariant())


        filterPassiveFragment = supportFragmentManager
                .findFragmentByTag("android:switcher:" + R.id.filterPager + ":1") as FilterPassiveFragment

        intent.putParcelableArrayListExtra(Variables.SKILL_DEFAULT, filterPassiveFragment.GetSelectedSkill()  )
        SaveFilter(Variables.SKILL_DEFAULT, filterPassiveFragment.GetSelectedSkill())


        filterActiveFragment = supportFragmentManager
                .findFragmentByTag("android:switcher:" + R.id.filterPager + ":2") as FilterActiveFragment

        intent.putParcelableArrayListExtra(Variables.SKILL_ACTIVE, filterActiveFragment.GetSelectedSkill())
        SaveFilter(Variables.SKILL_ACTIVE, filterActiveFragment.GetSelectedSkill())


        intent.putParcelableArrayListExtra(Variables.TARGET, filterActiveFragment.GetSelectedTarget())
        SaveFilter(Variables.TARGET, filterActiveFragment.GetSelectedTarget())


        setResult(Activity.RESULT_OK, intent)
        finishActivity(2222)
        finish()


    }



    private fun SaveFilter(key: String, arrayList: ArrayList<CheckState>) {

        val sharedPreferences = getSharedPreferences(Variables.FILTER_SETTINGS, Context.MODE_PRIVATE)
        val prefsEditor = sharedPreferences.edit()

        val gson = Gson()
        val json = gson.toJson(arrayList)
        prefsEditor.putString(key, json)

        prefsEditor.apply()

    }


    fun ReadSavedFilter(key: String): ArrayList<CheckState> {

        val sharedPreferences = getSharedPreferences(Variables.FILTER_SETTINGS, Context.MODE_PRIVATE)

        val gson = Gson()
        val json = sharedPreferences.getString(key, "")

        val type = object : TypeToken<ArrayList<CheckState>>() {}.type

        try {
            val arrayList : ArrayList<CheckState> = gson.fromJson(json, type)
            return arrayList
        } catch (e: Exception) {
            return arrayListOf()
        }
    }



    private inner class SectionsPagerAdapter internal constructor(fm: android.support.v4.app.FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getItemPosition(`object`: Any?): Int {

            return POSITION_NONE
        }

        var mapLabel = GetLabel()


        fun GetLabel (): HashMap<String, String> {
            return UtilFunctions.GetSkillText(ssss, ffff)
        }

        override fun getItem(position: Int): android.support.v4.app.Fragment? {
            when (position) {

                0 -> {
                    val general = FilterGeneralFragment()

                    val bundleGen = Bundle()
                    bundleGen.putString(Variables.SKILL_TITLE, "General")
//                    bundleGen.putString(Variables.SKILL_TYPE, Variables.SKILL_DEFAULT)
                    general.arguments = bundleGen

                    return general
                }

                1 -> {
                    val skill3 = FilterPassiveFragment()


                    val bundle3 = Bundle()
                    bundle3.putString(Variables.SKILL_TYPE, Variables.SKILL_DEFAULT)
                    bundle3.putString(Variables.SKILL_TITLE, mapLabel["passive"] )

//                    bundle3.putSerializable("map", tttt)
//                    bundle3.putSerializable("mapEffect", ffff)
//                    bundle3.putSerializable("string", ssss)
                    //                    bundle3.putInt("version", curVersion);


                    skill3.arguments = bundle3
                    return skill3
                }

                2 -> {
                    val skill5 = FilterActiveFragment()
                    val bundle5 = Bundle()
                    bundle5.putString(Variables.SKILL_TYPE, Variables.SKILL_ACTIVE)
                    bundle5.putString(Variables.SKILL_TITLE, mapLabel["active"])

//                    bundle5.putSerializable("map", tttt)
//                    bundle5.putSerializable("mapEffect", ffff)
//                    bundle5.putSerializable("string", ssss)
                    //                    bundle5.putInt("version", curVersion);
                    skill5.arguments = bundle5
                    return skill5
                }
            }
            return null
        }


        override fun getCount(): Int {
            return 3
        }

        override fun getPageTitle(position: Int): CharSequence? {




            when (position) {
                0 -> return "General"
                1 -> return mapLabel["passive"]
                2 -> return mapLabel["active"]
            }
            return null
        }
    }

}