package com.felania.monstersuperleaguedatabook.utils

import android.content.Context
import com.felania.msldb.MonsterRuneColorOuterClass
import com.felania.msldb.MonsterRuneColorOuterClass.*


class Variables  {

    companion object {
        val HP = "hp"
        val ATK = "atk"
        val DEF = "def"
        val HEAL = "heal"
        val CRIT_DMG = "crit_dmg"
        val CRIT_RATE = "crit_rate"
        val RESIST = "resist"

        val GRADE = "grade"

        val MAIN_PAGE_COUNT: Int = 3

        val GAME_DB = "gamedata.pb"

        val STRING_EN = "string.en.pb"

        val STRING_HP = "ustr.hp"
        val STRING_ATTACK = "ustr.attack"
        val STRING_DEFENSE = "ustr.defence"
        val STRING_HEAL = "ustr.heal"
        val STRING_CRI_DMG = "ustr.critical"
        val STRING_CRI_RATE = "ustr.critical.prob"
        val STRING_RESIST = "ustr.status.effect.resistance"
        val STRING_GRADE = "ustr.dlg_ready.sortrule.grade"
        val STRING_LVL = "str.special.shop.lock.desc"


        var FILTER_SETTINGS = "filter_setting"

        var SKILL_DEFAULT = "default"
        var SKILL_ACTIVE = "active"
        var SKILL_TYPE = "type"


//
        val localeToStringMap : HashMap<String, String> =
                hashMapOf (
                        Pair("en", "string.en.pb"),
                        Pair("ja", "string.ja.pb"),
                        Pair("ko", "string.ko.pb"),
                        Pair("zh_tw", "string.zh-tw.pb"),
                        Pair("zh_cn", "string.zh-cn.pb"),
                        Pair("th", "string.th.pb"),
                        Pair("es", "string.es.pb"),
                        Pair("pt", "string.pt.pb"),
                        Pair("de", "string.de.pb"),
                        Pair("fr", "string.fr.pb"),
                        Pair("it", "string.it.pb")
                )


        val stringLangMap : HashMap<String, String> =
                hashMapOf (
                        Pair("English", "en"),
                        Pair("日本語", "ja"),
                        Pair("한국어", "ko"),
                        Pair("简体中文", "zh_tw"),
                        Pair("繁體中文", "zh_cn"),
                        Pair("ภาษาไทย", "th"),
                        Pair("Español", "es"),
                        Pair("Português", "pt"),
                        Pair("Deutsch", "de"),
                        Pair("Français", "fr"),
                        Pair("Italiano", "it")
                )

        val stringMap: HashMap<String, String> =
                hashMapOf(
                        Pair("English", "string.en.pb"),
                        Pair("日本語", "string.ja.pb"),
                        Pair("한국어", "string.ko.pb"),
                        Pair("简体中文", "string.zh-tw.pb"),
                        Pair("繁體中文", "string.zh-cn.pb"),
                        Pair("ภาษาไทย", "string.th.pb"),
                        Pair("Español", "string.es.pb"),
                        Pair("Português", "string.pt.pb"),
                        Pair("Deutsch", "string.de.pb"),
                        Pair("Français", "string.fr.pb"),
                        Pair("Italiano", "string.it.pb")
                )

        val langMap: HashMap<Int, String>
                = hashMapOf(
                Pair( 0,  "English"),
                Pair( 1,  "日本語"),
                Pair( 2,  "한국어"),
                Pair( 3,  "简体中文"),
                Pair( 4,  "繁體中文"),
                Pair( 5,  "ภาษาไทย"),
                Pair( 6,  "Español"),
                Pair( 7,  "Português"),
                Pair( 8,  "Deutsch"),
                Pair( 9,  "Français"),
                Pair( 10,  "Italiano")

        )
        val  ELEMENT: String = "element"
        val  SKILL_BOOK: String = "skill_book"
        val  TARGET_ONE: String = "target_one"
        val  TARGET_ALL: String = "target_all"
        val  TARGET_TEAM: String = "target_team"
        val  TARGET_ENTIRE_ALL: String = "target_entire_all"

        val  TARGET: String = "target"
        val  SKILL_TITLE: String = "skill_title"
        val  TYPE: String = "type"
        val  SKILL_LEADER: String = "skill_leader"
        val  UID_EVO3: String = "uid_evo3"
        val  UID_EVO2: String = "uid_evo2"
        val  UID_EVO1: String = "uid_evo1"

        val BAR_MAX_SIZE : String = "barMaxSize"
        val BAR_MAX_SIZE_DETAIL : String = "barMaxSizeDetail"
        val FIRE: String = "fire"
        val WATER: String = "water"
        val TREE: String = "tree"
        val LIGHT: String = "light"
        val DARK: String = "dark"


        val SKILL_BOOK_SOON : String = "ustr.skill.book.learn.update"
        val COMING_SOON : String = "ustr.update"
        val CLAN: String = "Clan"

        val TIMEZONE_DIVIDER = 3600000L
        val SERVER_TIMEZONE = 32400000L

        val SETTING_LANGUAGE = "setting_language"
        val GOLEM: String = "Golem"
        val TEST: String = "TestFragment"

        val STRING_REWARDS = "ustr.dlg.dungeon.guardian.reward.info"
        val STRING_DUNGEON_INFO = "ustr.dlg.select.dungeon.info"
        val STRING_ROUND = "ustr.china.banhao.battle.round"


        val RUNE_RAINBOW = listOf (
                MonsterRuneColor.MRC_Red,
                MonsterRuneColor.MRC_Orange,
                MonsterRuneColor.MRC_Yellow,
                MonsterRuneColor.MRC_Green,
                MonsterRuneColor.MRC_Blue,
                MonsterRuneColor.MRC_Purple,
                MonsterRuneColor.MRC_White,
                MonsterRuneColor.MRC_Emarald,
                MonsterRuneColor.MRC_Scarlet,
                MonsterRuneColor.MRC_Lightgreen,
                MonsterRuneColor.MRC_Pink
        )

        val RUNE_DRAGON = listOf (
                MonsterRuneColor.MRC_HealMyHp,
                MonsterRuneColor.MRC_HealMyMp,
                MonsterRuneColor.MRC_IncHp,
                MonsterRuneColor.MRC_IncMp,
                MonsterRuneColor.MRC_Shield,
                MonsterRuneColor.MRC_Stun

        )

        val RUNE_DUAL = listOf(
                MonsterRuneColor.MRC_Inc_Blue_Dec_Orange,
                MonsterRuneColor.MRC_Inc_Orange_Dec_Blue,
                MonsterRuneColor.MRC_Inc_Green_Dec_Blue,
                MonsterRuneColor.MRC_Inc_Red_Dec_Yellow,
                MonsterRuneColor.MRC_Inc_Yellow_Dec_Red
        )





    }
}