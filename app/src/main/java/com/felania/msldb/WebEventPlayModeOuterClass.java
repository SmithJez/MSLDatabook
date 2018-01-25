// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WebEventPlayMode.proto

package com.felania.msldb;

public final class WebEventPlayModeOuterClass {
  private WebEventPlayModeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code msggamedata.WebEventPlayMode}
   */
  public enum WebEventPlayMode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>WebEventPlayModeNULL = 0;</code>
     */
    WebEventPlayModeNULL(0),
    /**
     * <code>WEPM_Account_Level_Up = 1;</code>
     */
    WEPM_Account_Level_Up(1),
    /**
     * <code>WEPM_Use_Energy = 20;</code>
     */
    WEPM_Use_Energy(20),
    /**
     * <code>WEPM_Use_Arena_Ticket = 21;</code>
     */
    WEPM_Use_Arena_Ticket(21),
    /**
     * <code>WEPM_Get_Gem = 22;</code>
     */
    WEPM_Get_Gem(22),
    /**
     * <code>WEPM_Use_Gem = 23;</code>
     */
    WEPM_Use_Gem(23),
    /**
     * <code>WEPM_Get_Gold = 24;</code>
     */
    WEPM_Get_Gold(24),
    /**
     * <code>WEPM_Use_Gold = 25;</code>
     */
    WEPM_Use_Gold(25),
    /**
     * <code>WEPM_Get_Beyond_Stone = 26;</code>
     */
    WEPM_Get_Beyond_Stone(26),
    /**
     * <code>WEPM_Use_Beyond_Stone = 27;</code>
     */
    WEPM_Use_Beyond_Stone(27),
    /**
     * <code>WEPM_Get_Crystal = 28;</code>
     */
    WEPM_Get_Crystal(28),
    /**
     * <code>WEPM_Use_Crystal = 29;</code>
     */
    WEPM_Use_Crystal(29),
    /**
     * <code>WEPM_Get_Star_Essence = 30;</code>
     */
    WEPM_Get_Star_Essence(30),
    /**
     * <code>WEPM_Join_Clan = 31;</code>
     */
    WEPM_Join_Clan(31),
    /**
     * <code>WEPM_Get_Clan_Point = 32;</code>
     */
    WEPM_Get_Clan_Point(32),
    /**
     * <code>WEPM_Use_Clan_Point = 33;</code>
     */
    WEPM_Use_Clan_Point(33),
    /**
     * <code>WEPM_Buy_Energy = 34;</code>
     */
    WEPM_Buy_Energy(34),
    /**
     * <code>WEPM_Buy_Gold = 35;</code>
     */
    WEPM_Buy_Gold(35),
    /**
     * <code>WEPM_Buy_Gem = 36;</code>
     */
    WEPM_Buy_Gem(36),
    /**
     * <code>WEPM_Daily_First_Login = 37;</code>
     */
    WEPM_Daily_First_Login(37),
    /**
     * <code>WEPM_All_Complete_Bingo = 38;</code>
     */
    WEPM_All_Complete_Bingo(38),
    /**
     * <code>WEPM_Play_Scenario_Battle = 100;</code>
     */
    WEPM_Play_Scenario_Battle(100),
    /**
     * <code>WEPM_Play_Scenario_Battle_Normal = 101;</code>
     */
    WEPM_Play_Scenario_Battle_Normal(101),
    /**
     * <code>WEPM_Play_Scenario_Battle_Hard = 102;</code>
     */
    WEPM_Play_Scenario_Battle_Hard(102),
    /**
     * <code>WEPM_Play_Scenario_Battle_Extreme = 103;</code>
     */
    WEPM_Play_Scenario_Battle_Extreme(103),
    /**
     * <code>WEPM_Play_All_Day_Beyond_Stone_Dungeon_Battle = 110;</code>
     */
    WEPM_Play_All_Day_Beyond_Stone_Dungeon_Battle(110),
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle = 112;</code>
     */
    WEPM_Play_Day_Beyond_Stone_Dungeon_Battle(112),
    /**
     * <code>WEPM_Play_Gold_Dungeon_Battle = 113;</code>
     */
    WEPM_Play_Gold_Dungeon_Battle(113),
    /**
     * <code>WEPM_Play_All_Day_Rune_Dungeon_Battle = 114;</code>
     */
    WEPM_Play_All_Day_Rune_Dungeon_Battle(114),
    /**
     * <code>WEPM_Play_Friend_Dungeon_Battle = 115;</code>
     */
    WEPM_Play_Friend_Dungeon_Battle(115),
    /**
     * <code>WEPM_Play_Day_Rune_Dungeon_Battle = 116;</code>
     */
    WEPM_Play_Day_Rune_Dungeon_Battle(116),
    /**
     * <code>WEPM_Play_Colossus_Dungeon_Battle = 117;</code>
     */
    WEPM_Play_Colossus_Dungeon_Battle(117),
    /**
     * <code>WEPM_Play_Infinite_Battle = 120;</code>
     */
    WEPM_Play_Infinite_Battle(120),
    /**
     * <code>WEPM_Play_Scenario_Battle_Continent1 = 121;</code>
     */
    WEPM_Play_Scenario_Battle_Continent1(121),
    /**
     * <code>WEPM_Play_Scenario_Battle_Continent2 = 122;</code>
     */
    WEPM_Play_Scenario_Battle_Continent2(122),
    /**
     * <code>WEPM_Play_Scenario_Battle_Continent3 = 123;</code>
     */
    WEPM_Play_Scenario_Battle_Continent3(123),
    /**
     * <code>WEPM_Play_Arena_Battle = 130;</code>
     */
    WEPM_Play_Arena_Battle(130),
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Mon = 150;</code>
     */
    WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Mon(150),
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Tue = 151;</code>
     */
    WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Tue(151),
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Wed = 152;</code>
     */
    WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Wed(152),
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Thu = 153;</code>
     */
    WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Thu(153),
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Fri = 154;</code>
     */
    WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Fri(154),
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Sat = 155;</code>
     */
    WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Sat(155),
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Sun = 156;</code>
     */
    WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Sun(156),
    /**
     * <code>WEPM_Get_Capture_Point = 160;</code>
     */
    WEPM_Get_Capture_Point(160),
    /**
     * <code>WEPM_Start_Clan_Battle = 170;</code>
     */
    WEPM_Start_Clan_Battle(170),
    /**
     * <code>WEPM_Start_CVC_Battle = 171;</code>
     */
    WEPM_Start_CVC_Battle(171),
    /**
     * <code>WEPM_Attendance_Clan = 172;</code>
     */
    WEPM_Attendance_Clan(172),
    /**
     * <code>WEPM_Warm_Up_Monster = 200;</code>
     */
    WEPM_Warm_Up_Monster(200),
    /**
     * <code>WEPM_Evolution_Monster = 201;</code>
     */
    WEPM_Evolution_Monster(201),
    /**
     * <code>WEPM_Beyond_Monster = 202;</code>
     */
    WEPM_Beyond_Monster(202),
    /**
     * <code>WEPM_Upgrade_Rune = 203;</code>
     */
    WEPM_Upgrade_Rune(203),
    /**
     * <code>WEPM_Feed_Item = 204;</code>
     */
    WEPM_Feed_Item(204),
    /**
     * <code>WEPM_Upgrade_Monster_Skill = 205;</code>
     */
    WEPM_Upgrade_Monster_Skill(205),
    /**
     * <code>WEPM_Super_Evolution_Monster = 206;</code>
     */
    WEPM_Super_Evolution_Monster(206),
    /**
     * <code>WEPM_Find_Nezz = 300;</code>
     */
    WEPM_Find_Nezz(300),
    /**
     * <code>WEPM_Lobby_Reward = 301;</code>
     */
    WEPM_Lobby_Reward(301),
    /**
     * <code>WEPM_Set_Free_Monster = 302;</code>
     */
    WEPM_Set_Free_Monster(302),
    /**
     * <code>WEPM_Send_Friend_Gift = 310;</code>
     */
    WEPM_Send_Friend_Gift(310),
    /**
     * <code>WEPM_Capture_Monster = 320;</code>
     */
    WEPM_Capture_Monster(320),
    /**
     * <code>WEPM_Capture_Rare_Monster_In_Continent1 = 321;</code>
     */
    WEPM_Capture_Rare_Monster_In_Continent1(321),
    /**
     * <code>WEPM_Capture_Rare_Monster_In_Continent2 = 322;</code>
     */
    WEPM_Capture_Rare_Monster_In_Continent2(322),
    /**
     * <code>WEPM_Capture_Rare_Monster_In_Continent3 = 323;</code>
     */
    WEPM_Capture_Rare_Monster_In_Continent3(323),
    /**
     * <code>WEPM_Get_Monster = 330;</code>
     */
    WEPM_Get_Monster(330),
    /**
     * <code>WEPM_Summon_Monster_By_Revives = 340;</code>
     */
    WEPM_Summon_Monster_By_Revives(340),
    /**
     * <code>WEPM_Summon_Monster = 350;</code>
     */
    WEPM_Summon_Monster(350),
    /**
     * <code>WEPM_Summon_Monster_By_Soulstone = 351;</code>
     */
    WEPM_Summon_Monster_By_Soulstone(351),
    /**
     * <code>WEPM_Summon_Monster_By_Egg = 352;</code>
     */
    WEPM_Summon_Monster_By_Egg(352),
    /**
     * <code>WEPM_Summon_Monster_From_Gacha_Shop = 353;</code>
     */
    WEPM_Summon_Monster_From_Gacha_Shop(353),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>WebEventPlayModeNULL = 0;</code>
     */
    public static final int WebEventPlayModeNULL_VALUE = 0;
    /**
     * <code>WEPM_Account_Level_Up = 1;</code>
     */
    public static final int WEPM_Account_Level_Up_VALUE = 1;
    /**
     * <code>WEPM_Use_Energy = 20;</code>
     */
    public static final int WEPM_Use_Energy_VALUE = 20;
    /**
     * <code>WEPM_Use_Arena_Ticket = 21;</code>
     */
    public static final int WEPM_Use_Arena_Ticket_VALUE = 21;
    /**
     * <code>WEPM_Get_Gem = 22;</code>
     */
    public static final int WEPM_Get_Gem_VALUE = 22;
    /**
     * <code>WEPM_Use_Gem = 23;</code>
     */
    public static final int WEPM_Use_Gem_VALUE = 23;
    /**
     * <code>WEPM_Get_Gold = 24;</code>
     */
    public static final int WEPM_Get_Gold_VALUE = 24;
    /**
     * <code>WEPM_Use_Gold = 25;</code>
     */
    public static final int WEPM_Use_Gold_VALUE = 25;
    /**
     * <code>WEPM_Get_Beyond_Stone = 26;</code>
     */
    public static final int WEPM_Get_Beyond_Stone_VALUE = 26;
    /**
     * <code>WEPM_Use_Beyond_Stone = 27;</code>
     */
    public static final int WEPM_Use_Beyond_Stone_VALUE = 27;
    /**
     * <code>WEPM_Get_Crystal = 28;</code>
     */
    public static final int WEPM_Get_Crystal_VALUE = 28;
    /**
     * <code>WEPM_Use_Crystal = 29;</code>
     */
    public static final int WEPM_Use_Crystal_VALUE = 29;
    /**
     * <code>WEPM_Get_Star_Essence = 30;</code>
     */
    public static final int WEPM_Get_Star_Essence_VALUE = 30;
    /**
     * <code>WEPM_Join_Clan = 31;</code>
     */
    public static final int WEPM_Join_Clan_VALUE = 31;
    /**
     * <code>WEPM_Get_Clan_Point = 32;</code>
     */
    public static final int WEPM_Get_Clan_Point_VALUE = 32;
    /**
     * <code>WEPM_Use_Clan_Point = 33;</code>
     */
    public static final int WEPM_Use_Clan_Point_VALUE = 33;
    /**
     * <code>WEPM_Buy_Energy = 34;</code>
     */
    public static final int WEPM_Buy_Energy_VALUE = 34;
    /**
     * <code>WEPM_Buy_Gold = 35;</code>
     */
    public static final int WEPM_Buy_Gold_VALUE = 35;
    /**
     * <code>WEPM_Buy_Gem = 36;</code>
     */
    public static final int WEPM_Buy_Gem_VALUE = 36;
    /**
     * <code>WEPM_Daily_First_Login = 37;</code>
     */
    public static final int WEPM_Daily_First_Login_VALUE = 37;
    /**
     * <code>WEPM_All_Complete_Bingo = 38;</code>
     */
    public static final int WEPM_All_Complete_Bingo_VALUE = 38;
    /**
     * <code>WEPM_Play_Scenario_Battle = 100;</code>
     */
    public static final int WEPM_Play_Scenario_Battle_VALUE = 100;
    /**
     * <code>WEPM_Play_Scenario_Battle_Normal = 101;</code>
     */
    public static final int WEPM_Play_Scenario_Battle_Normal_VALUE = 101;
    /**
     * <code>WEPM_Play_Scenario_Battle_Hard = 102;</code>
     */
    public static final int WEPM_Play_Scenario_Battle_Hard_VALUE = 102;
    /**
     * <code>WEPM_Play_Scenario_Battle_Extreme = 103;</code>
     */
    public static final int WEPM_Play_Scenario_Battle_Extreme_VALUE = 103;
    /**
     * <code>WEPM_Play_All_Day_Beyond_Stone_Dungeon_Battle = 110;</code>
     */
    public static final int WEPM_Play_All_Day_Beyond_Stone_Dungeon_Battle_VALUE = 110;
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle = 112;</code>
     */
    public static final int WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_VALUE = 112;
    /**
     * <code>WEPM_Play_Gold_Dungeon_Battle = 113;</code>
     */
    public static final int WEPM_Play_Gold_Dungeon_Battle_VALUE = 113;
    /**
     * <code>WEPM_Play_All_Day_Rune_Dungeon_Battle = 114;</code>
     */
    public static final int WEPM_Play_All_Day_Rune_Dungeon_Battle_VALUE = 114;
    /**
     * <code>WEPM_Play_Friend_Dungeon_Battle = 115;</code>
     */
    public static final int WEPM_Play_Friend_Dungeon_Battle_VALUE = 115;
    /**
     * <code>WEPM_Play_Day_Rune_Dungeon_Battle = 116;</code>
     */
    public static final int WEPM_Play_Day_Rune_Dungeon_Battle_VALUE = 116;
    /**
     * <code>WEPM_Play_Colossus_Dungeon_Battle = 117;</code>
     */
    public static final int WEPM_Play_Colossus_Dungeon_Battle_VALUE = 117;
    /**
     * <code>WEPM_Play_Infinite_Battle = 120;</code>
     */
    public static final int WEPM_Play_Infinite_Battle_VALUE = 120;
    /**
     * <code>WEPM_Play_Scenario_Battle_Continent1 = 121;</code>
     */
    public static final int WEPM_Play_Scenario_Battle_Continent1_VALUE = 121;
    /**
     * <code>WEPM_Play_Scenario_Battle_Continent2 = 122;</code>
     */
    public static final int WEPM_Play_Scenario_Battle_Continent2_VALUE = 122;
    /**
     * <code>WEPM_Play_Scenario_Battle_Continent3 = 123;</code>
     */
    public static final int WEPM_Play_Scenario_Battle_Continent3_VALUE = 123;
    /**
     * <code>WEPM_Play_Arena_Battle = 130;</code>
     */
    public static final int WEPM_Play_Arena_Battle_VALUE = 130;
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Mon = 150;</code>
     */
    public static final int WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Mon_VALUE = 150;
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Tue = 151;</code>
     */
    public static final int WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Tue_VALUE = 151;
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Wed = 152;</code>
     */
    public static final int WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Wed_VALUE = 152;
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Thu = 153;</code>
     */
    public static final int WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Thu_VALUE = 153;
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Fri = 154;</code>
     */
    public static final int WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Fri_VALUE = 154;
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Sat = 155;</code>
     */
    public static final int WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Sat_VALUE = 155;
    /**
     * <code>WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Sun = 156;</code>
     */
    public static final int WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Sun_VALUE = 156;
    /**
     * <code>WEPM_Get_Capture_Point = 160;</code>
     */
    public static final int WEPM_Get_Capture_Point_VALUE = 160;
    /**
     * <code>WEPM_Start_Clan_Battle = 170;</code>
     */
    public static final int WEPM_Start_Clan_Battle_VALUE = 170;
    /**
     * <code>WEPM_Start_CVC_Battle = 171;</code>
     */
    public static final int WEPM_Start_CVC_Battle_VALUE = 171;
    /**
     * <code>WEPM_Attendance_Clan = 172;</code>
     */
    public static final int WEPM_Attendance_Clan_VALUE = 172;
    /**
     * <code>WEPM_Warm_Up_Monster = 200;</code>
     */
    public static final int WEPM_Warm_Up_Monster_VALUE = 200;
    /**
     * <code>WEPM_Evolution_Monster = 201;</code>
     */
    public static final int WEPM_Evolution_Monster_VALUE = 201;
    /**
     * <code>WEPM_Beyond_Monster = 202;</code>
     */
    public static final int WEPM_Beyond_Monster_VALUE = 202;
    /**
     * <code>WEPM_Upgrade_Rune = 203;</code>
     */
    public static final int WEPM_Upgrade_Rune_VALUE = 203;
    /**
     * <code>WEPM_Feed_Item = 204;</code>
     */
    public static final int WEPM_Feed_Item_VALUE = 204;
    /**
     * <code>WEPM_Upgrade_Monster_Skill = 205;</code>
     */
    public static final int WEPM_Upgrade_Monster_Skill_VALUE = 205;
    /**
     * <code>WEPM_Super_Evolution_Monster = 206;</code>
     */
    public static final int WEPM_Super_Evolution_Monster_VALUE = 206;
    /**
     * <code>WEPM_Find_Nezz = 300;</code>
     */
    public static final int WEPM_Find_Nezz_VALUE = 300;
    /**
     * <code>WEPM_Lobby_Reward = 301;</code>
     */
    public static final int WEPM_Lobby_Reward_VALUE = 301;
    /**
     * <code>WEPM_Set_Free_Monster = 302;</code>
     */
    public static final int WEPM_Set_Free_Monster_VALUE = 302;
    /**
     * <code>WEPM_Send_Friend_Gift = 310;</code>
     */
    public static final int WEPM_Send_Friend_Gift_VALUE = 310;
    /**
     * <code>WEPM_Capture_Monster = 320;</code>
     */
    public static final int WEPM_Capture_Monster_VALUE = 320;
    /**
     * <code>WEPM_Capture_Rare_Monster_In_Continent1 = 321;</code>
     */
    public static final int WEPM_Capture_Rare_Monster_In_Continent1_VALUE = 321;
    /**
     * <code>WEPM_Capture_Rare_Monster_In_Continent2 = 322;</code>
     */
    public static final int WEPM_Capture_Rare_Monster_In_Continent2_VALUE = 322;
    /**
     * <code>WEPM_Capture_Rare_Monster_In_Continent3 = 323;</code>
     */
    public static final int WEPM_Capture_Rare_Monster_In_Continent3_VALUE = 323;
    /**
     * <code>WEPM_Get_Monster = 330;</code>
     */
    public static final int WEPM_Get_Monster_VALUE = 330;
    /**
     * <code>WEPM_Summon_Monster_By_Revives = 340;</code>
     */
    public static final int WEPM_Summon_Monster_By_Revives_VALUE = 340;
    /**
     * <code>WEPM_Summon_Monster = 350;</code>
     */
    public static final int WEPM_Summon_Monster_VALUE = 350;
    /**
     * <code>WEPM_Summon_Monster_By_Soulstone = 351;</code>
     */
    public static final int WEPM_Summon_Monster_By_Soulstone_VALUE = 351;
    /**
     * <code>WEPM_Summon_Monster_By_Egg = 352;</code>
     */
    public static final int WEPM_Summon_Monster_By_Egg_VALUE = 352;
    /**
     * <code>WEPM_Summon_Monster_From_Gacha_Shop = 353;</code>
     */
    public static final int WEPM_Summon_Monster_From_Gacha_Shop_VALUE = 353;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static WebEventPlayMode valueOf(int value) {
      return forNumber(value);
    }

    public static WebEventPlayMode forNumber(int value) {
      switch (value) {
        case 0: return WebEventPlayModeNULL;
        case 1: return WEPM_Account_Level_Up;
        case 20: return WEPM_Use_Energy;
        case 21: return WEPM_Use_Arena_Ticket;
        case 22: return WEPM_Get_Gem;
        case 23: return WEPM_Use_Gem;
        case 24: return WEPM_Get_Gold;
        case 25: return WEPM_Use_Gold;
        case 26: return WEPM_Get_Beyond_Stone;
        case 27: return WEPM_Use_Beyond_Stone;
        case 28: return WEPM_Get_Crystal;
        case 29: return WEPM_Use_Crystal;
        case 30: return WEPM_Get_Star_Essence;
        case 31: return WEPM_Join_Clan;
        case 32: return WEPM_Get_Clan_Point;
        case 33: return WEPM_Use_Clan_Point;
        case 34: return WEPM_Buy_Energy;
        case 35: return WEPM_Buy_Gold;
        case 36: return WEPM_Buy_Gem;
        case 37: return WEPM_Daily_First_Login;
        case 38: return WEPM_All_Complete_Bingo;
        case 100: return WEPM_Play_Scenario_Battle;
        case 101: return WEPM_Play_Scenario_Battle_Normal;
        case 102: return WEPM_Play_Scenario_Battle_Hard;
        case 103: return WEPM_Play_Scenario_Battle_Extreme;
        case 110: return WEPM_Play_All_Day_Beyond_Stone_Dungeon_Battle;
        case 112: return WEPM_Play_Day_Beyond_Stone_Dungeon_Battle;
        case 113: return WEPM_Play_Gold_Dungeon_Battle;
        case 114: return WEPM_Play_All_Day_Rune_Dungeon_Battle;
        case 115: return WEPM_Play_Friend_Dungeon_Battle;
        case 116: return WEPM_Play_Day_Rune_Dungeon_Battle;
        case 117: return WEPM_Play_Colossus_Dungeon_Battle;
        case 120: return WEPM_Play_Infinite_Battle;
        case 121: return WEPM_Play_Scenario_Battle_Continent1;
        case 122: return WEPM_Play_Scenario_Battle_Continent2;
        case 123: return WEPM_Play_Scenario_Battle_Continent3;
        case 130: return WEPM_Play_Arena_Battle;
        case 150: return WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Mon;
        case 151: return WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Tue;
        case 152: return WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Wed;
        case 153: return WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Thu;
        case 154: return WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Fri;
        case 155: return WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Sat;
        case 156: return WEPM_Play_Day_Beyond_Stone_Dungeon_Battle_Sun;
        case 160: return WEPM_Get_Capture_Point;
        case 170: return WEPM_Start_Clan_Battle;
        case 171: return WEPM_Start_CVC_Battle;
        case 172: return WEPM_Attendance_Clan;
        case 200: return WEPM_Warm_Up_Monster;
        case 201: return WEPM_Evolution_Monster;
        case 202: return WEPM_Beyond_Monster;
        case 203: return WEPM_Upgrade_Rune;
        case 204: return WEPM_Feed_Item;
        case 205: return WEPM_Upgrade_Monster_Skill;
        case 206: return WEPM_Super_Evolution_Monster;
        case 300: return WEPM_Find_Nezz;
        case 301: return WEPM_Lobby_Reward;
        case 302: return WEPM_Set_Free_Monster;
        case 310: return WEPM_Send_Friend_Gift;
        case 320: return WEPM_Capture_Monster;
        case 321: return WEPM_Capture_Rare_Monster_In_Continent1;
        case 322: return WEPM_Capture_Rare_Monster_In_Continent2;
        case 323: return WEPM_Capture_Rare_Monster_In_Continent3;
        case 330: return WEPM_Get_Monster;
        case 340: return WEPM_Summon_Monster_By_Revives;
        case 350: return WEPM_Summon_Monster;
        case 351: return WEPM_Summon_Monster_By_Soulstone;
        case 352: return WEPM_Summon_Monster_By_Egg;
        case 353: return WEPM_Summon_Monster_From_Gacha_Shop;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WebEventPlayMode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        WebEventPlayMode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<WebEventPlayMode>() {
            public WebEventPlayMode findValueByNumber(int number) {
              return WebEventPlayMode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.felania.msldb.WebEventPlayModeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final WebEventPlayMode[] VALUES = values();

    public static WebEventPlayMode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private WebEventPlayMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msggamedata.WebEventPlayMode)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026WebEventPlayMode.proto\022\013msggamedata*\326\021" +
      "\n\020WebEventPlayMode\022\030\n\024WebEventPlayModeNU" +
      "LL\020\000\022\031\n\025WEPM_Account_Level_Up\020\001\022\023\n\017WEPM_" +
      "Use_Energy\020\024\022\031\n\025WEPM_Use_Arena_Ticket\020\025\022" +
      "\020\n\014WEPM_Get_Gem\020\026\022\020\n\014WEPM_Use_Gem\020\027\022\021\n\rW" +
      "EPM_Get_Gold\020\030\022\021\n\rWEPM_Use_Gold\020\031\022\031\n\025WEP" +
      "M_Get_Beyond_Stone\020\032\022\031\n\025WEPM_Use_Beyond_" +
      "Stone\020\033\022\024\n\020WEPM_Get_Crystal\020\034\022\024\n\020WEPM_Us" +
      "e_Crystal\020\035\022\031\n\025WEPM_Get_Star_Essence\020\036\022\022" +
      "\n\016WEPM_Join_Clan\020\037\022\027\n\023WEPM_Get_Clan_Poin",
      "t\020 \022\027\n\023WEPM_Use_Clan_Point\020!\022\023\n\017WEPM_Buy" +
      "_Energy\020\"\022\021\n\rWEPM_Buy_Gold\020#\022\020\n\014WEPM_Buy" +
      "_Gem\020$\022\032\n\026WEPM_Daily_First_Login\020%\022\033\n\027WE" +
      "PM_All_Complete_Bingo\020&\022\035\n\031WEPM_Play_Sce" +
      "nario_Battle\020d\022$\n WEPM_Play_Scenario_Bat" +
      "tle_Normal\020e\022\"\n\036WEPM_Play_Scenario_Battl" +
      "e_Hard\020f\022%\n!WEPM_Play_Scenario_Battle_Ex" +
      "treme\020g\0221\n-WEPM_Play_All_Day_Beyond_Ston" +
      "e_Dungeon_Battle\020n\022-\n)WEPM_Play_Day_Beyo" +
      "nd_Stone_Dungeon_Battle\020p\022!\n\035WEPM_Play_G",
      "old_Dungeon_Battle\020q\022)\n%WEPM_Play_All_Da" +
      "y_Rune_Dungeon_Battle\020r\022#\n\037WEPM_Play_Fri" +
      "end_Dungeon_Battle\020s\022%\n!WEPM_Play_Day_Ru" +
      "ne_Dungeon_Battle\020t\022%\n!WEPM_Play_Colossu" +
      "s_Dungeon_Battle\020u\022\035\n\031WEPM_Play_Infinite" +
      "_Battle\020x\022(\n$WEPM_Play_Scenario_Battle_C" +
      "ontinent1\020y\022(\n$WEPM_Play_Scenario_Battle" +
      "_Continent2\020z\022(\n$WEPM_Play_Scenario_Batt" +
      "le_Continent3\020{\022\033\n\026WEPM_Play_Arena_Battl" +
      "e\020\202\001\0222\n-WEPM_Play_Day_Beyond_Stone_Dunge",
      "on_Battle_Mon\020\226\001\0222\n-WEPM_Play_Day_Beyond" +
      "_Stone_Dungeon_Battle_Tue\020\227\001\0222\n-WEPM_Pla" +
      "y_Day_Beyond_Stone_Dungeon_Battle_Wed\020\230\001" +
      "\0222\n-WEPM_Play_Day_Beyond_Stone_Dungeon_B" +
      "attle_Thu\020\231\001\0222\n-WEPM_Play_Day_Beyond_Sto" +
      "ne_Dungeon_Battle_Fri\020\232\001\0222\n-WEPM_Play_Da" +
      "y_Beyond_Stone_Dungeon_Battle_Sat\020\233\001\0222\n-" +
      "WEPM_Play_Day_Beyond_Stone_Dungeon_Battl" +
      "e_Sun\020\234\001\022\033\n\026WEPM_Get_Capture_Point\020\240\001\022\033\n" +
      "\026WEPM_Start_Clan_Battle\020\252\001\022\032\n\025WEPM_Start",
      "_CVC_Battle\020\253\001\022\031\n\024WEPM_Attendance_Clan\020\254" +
      "\001\022\031\n\024WEPM_Warm_Up_Monster\020\310\001\022\033\n\026WEPM_Evo" +
      "lution_Monster\020\311\001\022\030\n\023WEPM_Beyond_Monster" +
      "\020\312\001\022\026\n\021WEPM_Upgrade_Rune\020\313\001\022\023\n\016WEPM_Feed" +
      "_Item\020\314\001\022\037\n\032WEPM_Upgrade_Monster_Skill\020\315" +
      "\001\022!\n\034WEPM_Super_Evolution_Monster\020\316\001\022\023\n\016" +
      "WEPM_Find_Nezz\020\254\002\022\026\n\021WEPM_Lobby_Reward\020\255" +
      "\002\022\032\n\025WEPM_Set_Free_Monster\020\256\002\022\032\n\025WEPM_Se" +
      "nd_Friend_Gift\020\266\002\022\031\n\024WEPM_Capture_Monste" +
      "r\020\300\002\022,\n\'WEPM_Capture_Rare_Monster_In_Con",
      "tinent1\020\301\002\022,\n\'WEPM_Capture_Rare_Monster_" +
      "In_Continent2\020\302\002\022,\n\'WEPM_Capture_Rare_Mo" +
      "nster_In_Continent3\020\303\002\022\025\n\020WEPM_Get_Monst" +
      "er\020\312\002\022#\n\036WEPM_Summon_Monster_By_Revives\020" +
      "\324\002\022\030\n\023WEPM_Summon_Monster\020\336\002\022%\n WEPM_Sum" +
      "mon_Monster_By_Soulstone\020\337\002\022\037\n\032WEPM_Summ" +
      "on_Monster_By_Egg\020\340\002\022(\n#WEPM_Summon_Mons" +
      "ter_From_Gacha_Shop\020\341\002B\023\n\021com.felania.ms" +
      "ldbb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
