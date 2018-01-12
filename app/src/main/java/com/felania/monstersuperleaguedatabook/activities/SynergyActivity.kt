package com.felania.monstersuperleaguedatabook.activities

import android.content.Context
import android.os.AsyncTask
import android.os.Bundle
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.fragments.SynergiesFragment
import com.felania.monstersuperleaguedatabook.protobuf.ProtobufHelper
import com.felania.monstersuperleaguedatabook.utils.MonsterEvolutionGroup
import com.felania.monstersuperleaguedatabook.utils.UtilFunctions
import com.felania.monstersuperleaguedatabook.utils.Variables
import com.felania.msldb.*
import kotlinx.android.synthetic.main.activity_synergies.*
import java.util.HashMap

class SynergyActivity : AppCompatActivity() {

    private var protoHelper = ProtobufHelper()
    private var context: Context = this
    private var saveLang = String()
    private var stringFile = String()


    var mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster> = hashMapOf()
    var mapLinkBonus: Map<Int, MsgLinkBonusOuterClass.MsgLinkBonus> = hashMapOf()
    var mapLinkHiddenData: Map<Int, MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData> = hashMapOf()
    var mapString: Map<Int, String> = hashMapOf()
    var mapUid: Map<String, MsgUidOuterClass.MsgUid> = hashMapOf()
    var mapEffect : Map<Int, MsgStatusEffectOuterClass.MsgStatusEffect> = hashMapOf()

    var mapUidInt: Map<Int, MsgUidOuterClass.MsgUid> = hashMapOf()
    var mapDictName : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
    var monEvo1 = mutableListOf<MsgMonsterOuterClass.MsgMonster>()
    var monEvo2 = mutableListOf<MsgMonsterOuterClass.MsgMonster>()
    var monEvo3 = mutableListOf<MsgMonsterOuterClass.MsgMonster>()

    var maxStat: java.util.HashMap<String, Float> = hashMapOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_synergies)

        saveLang = intent.getStringExtra(Variables.SETTING_LANGUAGE)

        val localeMap: HashMap<String, String> = Variables.localeToStringMap


        stringFile = if (localeMap[saveLang] == null) {
            Variables.STRING_EN
        } else {
            localeMap[saveLang]!!
        }

        ReadDB().execute()

    }


    private fun InitSynergy () {
        val string = GetStringData()
        val listMonster =  protoHelper.ReadMonsters(MsgGameDataOuterClass.MsgGameData.MONSTERS_FIELD_NUMBER, context)
        val listString = string.localStringsList
        val listUid = protoHelper.ReadUids(MsgGameDataOuterClass.MsgGameData.UIDS_FIELD_NUMBER, context)

        val listLinkBonus = protoHelper.ReadSynergy(MsgGameDataOuterClass.MsgGameData.LINK_BONUSES_FIELD_NUMBER, context )

        val listLinkHiddenData = protoHelper.ReadSynergyHiddenData(MsgGameDataOuterClass.MsgGameData.LINK_BONUS_HIDDEN_DATAS_FIELD_NUMBER, context)
        val listEffect = protoHelper.ReadEffect(MsgGameDataOuterClass.MsgGameData.STATUS_EFFECTS_FIELD_NUMBER, context)



//        Log.wtf("lis", "list " + listLinkBonus.size)

        mapMonster = listMonster.associateBy ({ it.uid } , {it} )
        mapString = listString.associateBy( {it.uid}, {it.text})
        mapUid = listUid.associateBy ({ it.strUid }, {it})

        mapLinkHiddenData = listLinkHiddenData.associateBy ({ it.uid }, {it})

        mapUidInt = listUid.associateBy ({ it.uid }, {it})

        mapEffect = listEffect.associateBy( {it.uid } , {it})

        val sortedLink = listLinkBonus.sortedBy { mapString[it.name] }.sortedBy { !it.newTag }


        mapLinkBonus = sortedLink.associateBy ({ it.uid }, {it})

        mapDictName = protoHelper.ReadMapDictName(context).associateBy( { it.resName }, { MonsterEvolutionGroup(it.resName,  it.evo1, it.evo2, it.evo3  )  } ).toMutableMap()

        maxStat = intent.getSerializableExtra("max_stat") as java.util.HashMap<String, Float>

        ManageMapDict()

    }

    fun ManageMapDict () {

        for (gg in mapDictName) {
            monEvo1.add(mapMonster[gg.value.evo1.monsterUid]!!)
            monEvo2.add(mapMonster[gg.value.evo2.monsterUid]!!)
            monEvo3.add(mapMonster[gg.value.evo3.monsterUid]!!)
        }
    }




    fun GetStringData(): MsgStringOuterClass.MsgString.Builder {
        val stringData = protoHelper.readStringData(stringFile, context)
        if (stringData.localStringsCount == 0) {
            stringData.mergeFrom(protoHelper.readStringDataFromAssets(stringFile, context))
        }
        return stringData
    }


    private inner class ReadDB : AsyncTask<Void, Int, Int>() {
        override fun doInBackground(vararg p0: Void): Int? {
            InitSynergy()
            return null
        }

//        override fun onPreExecute() {
//
//            super.onPreExecute()
//        }

        override fun onPostExecute(result: Int?) {

            val mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)

            synergyPager.adapter = mSectionsPagerAdapter

            synergyTab.setupWithViewPager(synergyPager)

            super.onPostExecute(result)
        }

    }




    private inner class SectionsPagerAdapter internal constructor(fm: android.support.v4.app.FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getItemPosition(`object`: Any?): Int {

            return POSITION_NONE
        }

        var mapLabel = GetLabel()
        val labelText = arrayOf( "hidden", "element" , "gender", "type", "evolution"  )


        fun GetLabel (): HashMap<String, String> {
            return UtilFunctions.GetSynergyText(mapString, mapUid)
        }

        override fun getItem(position: Int): android.support.v4.app.Fragment? {
            when (position) {

                0 -> {
                    val synergy1 = SynergiesFragment()
                    val bundleGen = Bundle()
                    bundleGen.putSerializable("bonus_type", MsgLinkBonusOuterClass.MsgLinkBonus.LinkBonusType.LBT_Hidden )
                    bundleGen.putString(Variables.SETTING_LANGUAGE, saveLang)
                    synergy1.arguments = bundleGen
                    return synergy1
                }

                1 -> {
                    val synergy2 = SynergiesFragment()
                    val bundleGen = Bundle()
                    bundleGen.putSerializable("bonus_type", MsgLinkBonusOuterClass.MsgLinkBonus.LinkBonusType.LBT_Element )
                    bundleGen.putString(Variables.SETTING_LANGUAGE, saveLang)
                    synergy2.arguments = bundleGen
                    return synergy2
                }

                2 -> {
                    val synergy3 = SynergiesFragment()
                    val bundleGen = Bundle()
                    bundleGen.putSerializable("bonus_type", MsgLinkBonusOuterClass.MsgLinkBonus.LinkBonusType.LBT_Gender )
                    bundleGen.putString(Variables.SETTING_LANGUAGE, saveLang)
                    synergy3.arguments = bundleGen
                    return synergy3
                }

                3 -> {
                    val synergy3 = SynergiesFragment()
                    val bundleGen = Bundle()
                    bundleGen.putSerializable("bonus_type", MsgLinkBonusOuterClass.MsgLinkBonus.LinkBonusType.LBT_StatType )
                    bundleGen.putString(Variables.SETTING_LANGUAGE, saveLang)
                    synergy3.arguments = bundleGen
                    return synergy3
                }

                4 -> {
                    val synergy3 = SynergiesFragment()
                    val bundleGen = Bundle()
                    bundleGen.putSerializable("bonus_type", MsgLinkBonusOuterClass.MsgLinkBonus.LinkBonusType.LBT_Evolution )
                    bundleGen.putString(Variables.SETTING_LANGUAGE, saveLang)
                    synergy3.arguments = bundleGen
                    return synergy3
                }
            }
            return null
        }


        override fun getCount(): Int {
            return 5
        }

        override fun getPageTitle(position: Int): CharSequence? {




            when (position) {
                0 -> return mapLabel[labelText[position]]
                1 -> return mapLabel[labelText[position]]
                2 -> return mapLabel[labelText[position]]
                3 -> return mapLabel[labelText[position]]
                4 -> return mapLabel[labelText[position]]
            }
            return null
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mon_skill_book_popup, menu)

        return true
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        val id : Int = item!!.itemId
        return when (id) {
            R.id.btnSkillBookBack -> {
                finish()
                true
            }

            else -> {
                true
            }
        }


    }
}