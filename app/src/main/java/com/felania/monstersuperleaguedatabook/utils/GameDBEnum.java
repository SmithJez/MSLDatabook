package com.felania.monstersuperleaguedatabook.utils;

import android.util.SparseArray;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SmithJez-PC on 9/19/2017.
 */

public enum GameDBEnum {

    version(1),
    uids(2),
    user_levels(3),
    monsters(4),
    monster_types(5),
    monster_levels(7),
    monster_skills(8),
    randoms(9),
    settings(10),
    shop_items(11),
    items(12),
    stages(13),
    substages(14),
    stage_monsters(15),
    stage_monster_groups(16),
    dungeon_stages(17),
    dungeon_substages(18),
    dungeon_monsters(19),
    dungeon_monster_groups(20),
    status_effects(21),
    start_monsters(22),
    runes(23),
    summons(24),
    rune_settings(25),
    rune_rares(26),
    rune_optional_effects(27),
    rune_set_effects(28),
    monster_beyond_pricing(29),
    monster_dict(30),
    gift_sender(31),
    gift_template(32),
    quests(33),
    npcs(34),
    npc_talk_seqs(35),
    npc_auto_talks(36),
    user_profile_icon(37),
    monster_evolution_pricing(38),
    helps(39),
    subhelps(40),
    joje_shop_slots(41),
    monster_ais(42),
    battle_master_script(43),
    arena_grade(44),
    arena_sub_grade(45),
    monster_egg_cutscenes(46),
    loading_template(47),
    log_template(48),
    support_monsters(50),
    custom_btn_sounds(51),
    arena_seasons(52),
    arena_attacker_gain_winning_point(53),
    arena_defender_gain_winning_point(54),
    chat_like_color(55),
    daily_bonus_seasons(56),
    daily_bonuses(57),
    infinite_seasons(58),
    infinite_stages(59),
    infinite_substages(60),
    infinite_monsters(61),
    infinite_monster_groups(62),
    missions(63),
    lobby_rewards(64),
    monster_capture_dicts(65),
    credit(66),
    enforcement_values(67),
    revive_monsters(68),
    platform_achievements(69),
    packages(70),
    captureking_seasons(71),
    captureking_grades(72),
    clan_emblems(73),
    clan_seasons(74),
    clan_season_battles(75),
    clan_grades(76),
    clan_reward_tiers(77),
    clan_stages(78),
    clan_substages(79),
    clan_battle_rewards(80),
    daily_bonus_returnuser_sequences(81),
    contractor_seasons(82),
    gacha_shop_event_banners(83),
    special_revive_monsters(84),
    bingo_seasons(90),
    bingo_season_datas(91),
    bingo_time_datas(92),
    monster_upgrade_skills(93),
    monster_upgrade_skill_pricing(94),
    clan_attendance_rewards(95);



    private final int value;

    private static SparseArray<GameDBEnum> map = new SparseArray<>();

    static {
        for (GameDBEnum strEnum : GameDBEnum.values()) {
            map.put(strEnum.value, strEnum);

        }
    }


    private GameDBEnum(final int n)
    {
        this.value = n;
    }

    public static GameDBEnum getValue(int n) {
        return map.get(n);
    }

}
