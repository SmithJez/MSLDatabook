//package com.felania.monstersuperleaguedatabook.fragments
//
//import android.app.Fragment
//import android.os.Bundle
//import android.support.v7.widget.LinearLayoutManager
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import com.felania.monstersuperleaguedatabook.R
//import com.felania.monstersuperleaguedatabook.activities.MonDBActivity
//import com.felania.monstersuperleaguedatabook.adapters.AstromonAdapter
//import com.felania.monstersuperleaguedatabook.utils.BarObjectParent
//import com.felania.monstersuperleaguedatabook.utils.MonsterEvolutionGroup
//import com.felania.monstersuperleaguedatabook.utils.RecyclerItemClickListener
//import com.felania.msldb.*
//import com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect
//import com.google.android.gms.ads.AdRequest
//import kotlinx.android.synthetic.main.child_astroguide.*
//import java.util.*
//import com.google.android.gms.ads.MobileAds
//import kotlinx.android.synthetic.main.activity_main.*
//
//
//class AstroguideFragment : Fragment() {
//
//
//    var listDictItemGroup = mutableListOf<MonsterEvolutionGroup>()
//
//    var mapSkillUpgrade: Map<Int, MsgMonsterUpgradeSkillOuterClass.MsgMonsterUpgradeSkill> = mapOf()
//    var mapString: Map<Int, String> = hashMapOf()
//    var mapMonster: Map<Int, MsgMonsterOuterClass.MsgMonster> = hashMapOf()
//    var mapUid: Map<String, MsgUidOuterClass.MsgUid> = hashMapOf()
//
//    var mapType: Map<String, MsgMonsterTypeOuterClass.MsgMonsterType> = hashMapOf()
//    var mapSetting: Map<Int, MsgSettingOuterClass.MsgSetting> = hashMapOf()
//    var mapSkill: Map<Int, MsgMonsterSkillOuterClass.MsgMonsterSkill> = hashMapOf()
//    var mapEffect : Map<Int, MsgStatusEffect> = hashMapOf()
//
//    var mapMonBar : HashMap<Int, BarObjectParent> = hashMapOf()
//
//    lateinit var astromonAdapter : AstromonAdapter
//    var maxStat: HashMap<String, Float> = hashMapOf()
//
//    var mapDictName : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
//    var mapDictName2 : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
//    var mapDictName3 : MutableMap<String, MonsterEvolutionGroup> = mutableMapOf()
//
//    lateinit var monDb :MonDBActivity
//
//    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        setHasOptionsMenu(true)
////        val rootView = inflater!!.inflate(R.layout.child_astroguide, container, false)
//
//        return rootView
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//
//        super.onCreate(savedInstanceState)
//    }
//
//    override fun onResume() {
//        super.onResume()
//        setHasOptionsMenu(true)
//    }
//
//    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//
//        monDb = (activity as MonDBActivity)
//
//        GetData()
//
//        lvMon.layoutManager = LinearLayoutManager(activity)
//
//        fastscroller.setRecyclerView(lvMon)
//        fastscroller.setViewsToUse(R.layout.recycler_view_fast_scroller__fast_scroller, R.id.fastscroller_handle)
//
////        MobileAds.initialize(activity.applicationContext, "ca-app-pub-1489459199627698~8687372969")
////
////        val adRequest = AdRequest.Builder().build()
////        adView.loadAd(adRequest)
//
//    }
//
//    private fun GetData() {
//
//        mapString  = monDb.mapString
//        mapMonster = monDb.mapMonster
//        mapSetting = monDb.mapSetting
//        mapUid = monDb.mapUid
//        mapType = monDb.mapType
//        mapMonBar = monDb.mapMonBar
//        maxStat = monDb.maxStat
//        mapSkillUpgrade = monDb.mapSkillUpgrade
//
//        mapDictName = monDb.mapDictName
//        mapDictName2 = monDb.mapDictName2
//        mapDictName3 = monDb.mapDictName3
//
//        listDictItemGroup = monDb.listDictItemGroup
//
//
//    }
//
//
//
//
//
//
//
//
//}
