// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CurrencyChangeCause.proto

package com.felania.msldb;

public final class CurrencyChangeCauseOuterClass {
  private CurrencyChangeCauseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code msggamedata.CurrencyChangeCause}
   */
  public enum CurrencyChangeCause
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CurrencyChangeCauseNULL = 0;</code>
     */
    CurrencyChangeCauseNULL(0),
    /**
     * <code>CCC_Get_Buy_In_Shop = 1;</code>
     */
    CCC_Get_Buy_In_Shop(1),
    /**
     * <code>CCC_Get_Buy_In_Instant_Shop = 2;</code>
     */
    CCC_Get_Buy_In_Instant_Shop(2),
    /**
     * <code>CCC_Get_Lobby_Reward = 3;</code>
     */
    CCC_Get_Lobby_Reward(3),
    /**
     * <code>CCC_Get_Battle_Drop = 4;</code>
     */
    CCC_Get_Battle_Drop(4),
    /**
     * <code>CCC_Get_Battle_Clear_Reward = 5;</code>
     */
    CCC_Get_Battle_Clear_Reward(5),
    /**
     * <code>CCC_Get_Gift = 6;</code>
     */
    CCC_Get_Gift(6),
    /**
     * <code>CCC_Get_Quest_Reward = 7;</code>
     */
    CCC_Get_Quest_Reward(7),
    /**
     * <code>CCC_Get_Sell_Rune = 8;</code>
     */
    CCC_Get_Sell_Rune(8),
    /**
     * <code>CCC_Get_Sell_Monster = 9;</code>
     */
    CCC_Get_Sell_Monster(9),
    /**
     * <code>CCC_Get_Send_Gift_Reward = 10;</code>
     */
    CCC_Get_Send_Gift_Reward(10),
    /**
     * <code>CCC_Get_User_Levelup_Reward = 11;</code>
     */
    CCC_Get_User_Levelup_Reward(11),
    /**
     * <code>CCC_Get_Send_Gift_Bonus = 12;</code>
     */
    CCC_Get_Send_Gift_Bonus(12),
    /**
     * <code>CCC_Get_Monster_Dict_Reward = 13;</code>
     */
    CCC_Get_Monster_Dict_Reward(13),
    /**
     * <code>CCC_Get_Arena_Battle_Reward = 14;</code>
     */
    CCC_Get_Arena_Battle_Reward(14),
    /**
     * <code>CCC_Get_30day_package_special_reward = 15;</code>
     */
    CCC_Get_30day_package_special_reward(15),
    /**
     * <code>CCC_Get_30day_package = 16;</code>
     */
    CCC_Get_30day_package(16),
    /**
     * <code>CCC_Get_levelup_package = 17;</code>
     */
    CCC_Get_levelup_package(17),
    /**
     * <code>CCC_Get_adventure_package = 18;</code>
     */
    CCC_Get_adventure_package(18),
    /**
     * <code>CCC_Get_Send_Gift_All_Reward = 19;</code>
     */
    CCC_Get_Send_Gift_All_Reward(19),
    /**
     * <code>CCC_Get_Shop_Item_Bundle_Reward = 20;</code>
     */
    CCC_Get_Shop_Item_Bundle_Reward(20),
    /**
     * <code>CCC_Get_15day_package_special_reward = 21;</code>
     */
    CCC_Get_15day_package_special_reward(21),
    /**
     * <code>CCC_Get_Clan_Battle_Clear_Reward = 22;</code>
     */
    CCC_Get_Clan_Battle_Clear_Reward(22),
    /**
     * <code>CCC_Use_Summon_Monster_By_StarEssence = 23;</code>
     */
    CCC_Use_Summon_Monster_By_StarEssence(23),
    /**
     * <code>CCC_Get_Clan_Battle_Season_Reward = 24;</code>
     */
    CCC_Get_Clan_Battle_Season_Reward(24),
    /**
     * <code>CCC_Get_LobbyShip = 25;</code>
     */
    CCC_Get_LobbyShip(25),
    /**
     * <code>CCC_Get_LobbyShip_special_reward = 26;</code>
     */
    CCC_Get_LobbyShip_special_reward(26),
    /**
     * <code>CCC_Get_Festival_Ticket_Reward = 27;</code>
     */
    CCC_Get_Festival_Ticket_Reward(27),
    /**
     * <code>CCC_Get_Sell_SuperStoneStuff = 28;</code>
     */
    CCC_Get_Sell_SuperStoneStuff(28),
    /**
     * <code>CCC_Get_Booster_Package_Instant_Reward = 29;</code>
     */
    CCC_Get_Booster_Package_Instant_Reward(29),
    /**
     * <code>CCC_Use_Buy_Bullet = 50;</code>
     */
    CCC_Use_Buy_Bullet(50),
    /**
     * <code>CCC_Use_In_Joje_Shop = 51;</code>
     */
    CCC_Use_In_Joje_Shop(51),
    /**
     * <code>CCC_Use_In_Shop = 52;</code>
     */
    CCC_Use_In_Shop(52),
    /**
     * <code>CCC_Use_In_Instant_Shop = 53;</code>
     */
    CCC_Use_In_Instant_Shop(53),
    /**
     * <code>CCC_Use_Extend_Monster_slot = 54;</code>
     */
    CCC_Use_Extend_Monster_slot(54),
    /**
     * <code>CCC_Use_Unequip_Rune = 55;</code>
     */
    CCC_Use_Unequip_Rune(55),
    /**
     * <code>CCC_Use_Upgrade_Rune = 56;</code>
     */
    CCC_Use_Upgrade_Rune(56),
    /**
     * <code>CCC_Use_Summon_Monster = 57;</code>
     */
    CCC_Use_Summon_Monster(57),
    /**
     * <code>CCC_Use_Summon_Monster_By_Soulstone = 58;</code>
     */
    CCC_Use_Summon_Monster_By_Soulstone(58),
    /**
     * <code>CCC_Use_Summon_Monster_By_Revive = 59;</code>
     */
    CCC_Use_Summon_Monster_By_Revive(59),
    /**
     * <code>CCC_Use_Summon_Monster_By_Egg = 60;</code>
     */
    CCC_Use_Summon_Monster_By_Egg(60),
    /**
     * <code>CCC_Use_Beyond_Monster = 61;</code>
     */
    CCC_Use_Beyond_Monster(61),
    /**
     * <code>CCC_Use_Warmup_Evolution_Monster = 62;</code>
     */
    CCC_Use_Warmup_Evolution_Monster(62),
    /**
     * <code>CCC_Use_Final_Evolution_Monster = 63;</code>
     */
    CCC_Use_Final_Evolution_Monster(63),
    /**
     * <code>CCC_Use_Max_Evolution_Monster = 64;</code>
     */
    CCC_Use_Max_Evolution_Monster(64),
    /**
     * <code>CCC_Use_Feed_Item_To_Monster = 65;</code>
     */
    CCC_Use_Feed_Item_To_Monster(65),
    /**
     * <code>CCC_Use_Refresh_arena_list = 66;</code>
     */
    CCC_Use_Refresh_arena_list(66),
    /**
     * <code>CCC_Use_Reset_Dungeon_Enter_Count = 67;</code>
     */
    CCC_Use_Reset_Dungeon_Enter_Count(67),
    /**
     * <code>CCC_Use_Continue_Battle = 68;</code>
     */
    CCC_Use_Continue_Battle(68),
    /**
     * <code>CCC_Use_Refresh_Joje_Shop_List = 69;</code>
     */
    CCC_Use_Refresh_Joje_Shop_List(69),
    /**
     * <code>CCC_Use_Start_Dungeon = 70;</code>
     */
    CCC_Use_Start_Dungeon(70),
    /**
     * <code>CCC_Use_Dungeon_Ticket_Reset = 71;</code>
     */
    CCC_Use_Dungeon_Ticket_Reset(71),
    /**
     * <code>CCC_Use_Combine_Beyond_Stone = 72;</code>
     */
    CCC_Use_Combine_Beyond_Stone(72),
    /**
     * <code>CCC_Use_Create_Clan = 73;</code>
     */
    CCC_Use_Create_Clan(73),
    /**
     * <code>CCC_Use_Summon_Monster_By_Special_Revive = 74;</code>
     */
    CCC_Use_Summon_Monster_By_Special_Revive(74),
    /**
     * <code>CCC_Use_Buy_Default_Ship = 75;</code>
     */
    CCC_Use_Buy_Default_Ship(75),
    /**
     * <code>CCC_Use_Upgrade_Monster_Skill = 76;</code>
     */
    CCC_Use_Upgrade_Monster_Skill(76),
    /**
     * <code>CCC_Use_Rapid_Combining_Superstone = 77;</code>
     */
    CCC_Use_Rapid_Combining_Superstone(77),
    /**
     * <code>CCC_Use_Super_Evolution = 78;</code>
     */
    CCC_Use_Super_Evolution(78),
    /**
     * <code>CCC_Refund_From_DBTool = 99;</code>
     */
    CCC_Refund_From_DBTool(99),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CurrencyChangeCauseNULL = 0;</code>
     */
    public static final int CurrencyChangeCauseNULL_VALUE = 0;
    /**
     * <code>CCC_Get_Buy_In_Shop = 1;</code>
     */
    public static final int CCC_Get_Buy_In_Shop_VALUE = 1;
    /**
     * <code>CCC_Get_Buy_In_Instant_Shop = 2;</code>
     */
    public static final int CCC_Get_Buy_In_Instant_Shop_VALUE = 2;
    /**
     * <code>CCC_Get_Lobby_Reward = 3;</code>
     */
    public static final int CCC_Get_Lobby_Reward_VALUE = 3;
    /**
     * <code>CCC_Get_Battle_Drop = 4;</code>
     */
    public static final int CCC_Get_Battle_Drop_VALUE = 4;
    /**
     * <code>CCC_Get_Battle_Clear_Reward = 5;</code>
     */
    public static final int CCC_Get_Battle_Clear_Reward_VALUE = 5;
    /**
     * <code>CCC_Get_Gift = 6;</code>
     */
    public static final int CCC_Get_Gift_VALUE = 6;
    /**
     * <code>CCC_Get_Quest_Reward = 7;</code>
     */
    public static final int CCC_Get_Quest_Reward_VALUE = 7;
    /**
     * <code>CCC_Get_Sell_Rune = 8;</code>
     */
    public static final int CCC_Get_Sell_Rune_VALUE = 8;
    /**
     * <code>CCC_Get_Sell_Monster = 9;</code>
     */
    public static final int CCC_Get_Sell_Monster_VALUE = 9;
    /**
     * <code>CCC_Get_Send_Gift_Reward = 10;</code>
     */
    public static final int CCC_Get_Send_Gift_Reward_VALUE = 10;
    /**
     * <code>CCC_Get_User_Levelup_Reward = 11;</code>
     */
    public static final int CCC_Get_User_Levelup_Reward_VALUE = 11;
    /**
     * <code>CCC_Get_Send_Gift_Bonus = 12;</code>
     */
    public static final int CCC_Get_Send_Gift_Bonus_VALUE = 12;
    /**
     * <code>CCC_Get_Monster_Dict_Reward = 13;</code>
     */
    public static final int CCC_Get_Monster_Dict_Reward_VALUE = 13;
    /**
     * <code>CCC_Get_Arena_Battle_Reward = 14;</code>
     */
    public static final int CCC_Get_Arena_Battle_Reward_VALUE = 14;
    /**
     * <code>CCC_Get_30day_package_special_reward = 15;</code>
     */
    public static final int CCC_Get_30day_package_special_reward_VALUE = 15;
    /**
     * <code>CCC_Get_30day_package = 16;</code>
     */
    public static final int CCC_Get_30day_package_VALUE = 16;
    /**
     * <code>CCC_Get_levelup_package = 17;</code>
     */
    public static final int CCC_Get_levelup_package_VALUE = 17;
    /**
     * <code>CCC_Get_adventure_package = 18;</code>
     */
    public static final int CCC_Get_adventure_package_VALUE = 18;
    /**
     * <code>CCC_Get_Send_Gift_All_Reward = 19;</code>
     */
    public static final int CCC_Get_Send_Gift_All_Reward_VALUE = 19;
    /**
     * <code>CCC_Get_Shop_Item_Bundle_Reward = 20;</code>
     */
    public static final int CCC_Get_Shop_Item_Bundle_Reward_VALUE = 20;
    /**
     * <code>CCC_Get_15day_package_special_reward = 21;</code>
     */
    public static final int CCC_Get_15day_package_special_reward_VALUE = 21;
    /**
     * <code>CCC_Get_Clan_Battle_Clear_Reward = 22;</code>
     */
    public static final int CCC_Get_Clan_Battle_Clear_Reward_VALUE = 22;
    /**
     * <code>CCC_Use_Summon_Monster_By_StarEssence = 23;</code>
     */
    public static final int CCC_Use_Summon_Monster_By_StarEssence_VALUE = 23;
    /**
     * <code>CCC_Get_Clan_Battle_Season_Reward = 24;</code>
     */
    public static final int CCC_Get_Clan_Battle_Season_Reward_VALUE = 24;
    /**
     * <code>CCC_Get_LobbyShip = 25;</code>
     */
    public static final int CCC_Get_LobbyShip_VALUE = 25;
    /**
     * <code>CCC_Get_LobbyShip_special_reward = 26;</code>
     */
    public static final int CCC_Get_LobbyShip_special_reward_VALUE = 26;
    /**
     * <code>CCC_Get_Festival_Ticket_Reward = 27;</code>
     */
    public static final int CCC_Get_Festival_Ticket_Reward_VALUE = 27;
    /**
     * <code>CCC_Get_Sell_SuperStoneStuff = 28;</code>
     */
    public static final int CCC_Get_Sell_SuperStoneStuff_VALUE = 28;
    /**
     * <code>CCC_Get_Booster_Package_Instant_Reward = 29;</code>
     */
    public static final int CCC_Get_Booster_Package_Instant_Reward_VALUE = 29;
    /**
     * <code>CCC_Use_Buy_Bullet = 50;</code>
     */
    public static final int CCC_Use_Buy_Bullet_VALUE = 50;
    /**
     * <code>CCC_Use_In_Joje_Shop = 51;</code>
     */
    public static final int CCC_Use_In_Joje_Shop_VALUE = 51;
    /**
     * <code>CCC_Use_In_Shop = 52;</code>
     */
    public static final int CCC_Use_In_Shop_VALUE = 52;
    /**
     * <code>CCC_Use_In_Instant_Shop = 53;</code>
     */
    public static final int CCC_Use_In_Instant_Shop_VALUE = 53;
    /**
     * <code>CCC_Use_Extend_Monster_slot = 54;</code>
     */
    public static final int CCC_Use_Extend_Monster_slot_VALUE = 54;
    /**
     * <code>CCC_Use_Unequip_Rune = 55;</code>
     */
    public static final int CCC_Use_Unequip_Rune_VALUE = 55;
    /**
     * <code>CCC_Use_Upgrade_Rune = 56;</code>
     */
    public static final int CCC_Use_Upgrade_Rune_VALUE = 56;
    /**
     * <code>CCC_Use_Summon_Monster = 57;</code>
     */
    public static final int CCC_Use_Summon_Monster_VALUE = 57;
    /**
     * <code>CCC_Use_Summon_Monster_By_Soulstone = 58;</code>
     */
    public static final int CCC_Use_Summon_Monster_By_Soulstone_VALUE = 58;
    /**
     * <code>CCC_Use_Summon_Monster_By_Revive = 59;</code>
     */
    public static final int CCC_Use_Summon_Monster_By_Revive_VALUE = 59;
    /**
     * <code>CCC_Use_Summon_Monster_By_Egg = 60;</code>
     */
    public static final int CCC_Use_Summon_Monster_By_Egg_VALUE = 60;
    /**
     * <code>CCC_Use_Beyond_Monster = 61;</code>
     */
    public static final int CCC_Use_Beyond_Monster_VALUE = 61;
    /**
     * <code>CCC_Use_Warmup_Evolution_Monster = 62;</code>
     */
    public static final int CCC_Use_Warmup_Evolution_Monster_VALUE = 62;
    /**
     * <code>CCC_Use_Final_Evolution_Monster = 63;</code>
     */
    public static final int CCC_Use_Final_Evolution_Monster_VALUE = 63;
    /**
     * <code>CCC_Use_Max_Evolution_Monster = 64;</code>
     */
    public static final int CCC_Use_Max_Evolution_Monster_VALUE = 64;
    /**
     * <code>CCC_Use_Feed_Item_To_Monster = 65;</code>
     */
    public static final int CCC_Use_Feed_Item_To_Monster_VALUE = 65;
    /**
     * <code>CCC_Use_Refresh_arena_list = 66;</code>
     */
    public static final int CCC_Use_Refresh_arena_list_VALUE = 66;
    /**
     * <code>CCC_Use_Reset_Dungeon_Enter_Count = 67;</code>
     */
    public static final int CCC_Use_Reset_Dungeon_Enter_Count_VALUE = 67;
    /**
     * <code>CCC_Use_Continue_Battle = 68;</code>
     */
    public static final int CCC_Use_Continue_Battle_VALUE = 68;
    /**
     * <code>CCC_Use_Refresh_Joje_Shop_List = 69;</code>
     */
    public static final int CCC_Use_Refresh_Joje_Shop_List_VALUE = 69;
    /**
     * <code>CCC_Use_Start_Dungeon = 70;</code>
     */
    public static final int CCC_Use_Start_Dungeon_VALUE = 70;
    /**
     * <code>CCC_Use_Dungeon_Ticket_Reset = 71;</code>
     */
    public static final int CCC_Use_Dungeon_Ticket_Reset_VALUE = 71;
    /**
     * <code>CCC_Use_Combine_Beyond_Stone = 72;</code>
     */
    public static final int CCC_Use_Combine_Beyond_Stone_VALUE = 72;
    /**
     * <code>CCC_Use_Create_Clan = 73;</code>
     */
    public static final int CCC_Use_Create_Clan_VALUE = 73;
    /**
     * <code>CCC_Use_Summon_Monster_By_Special_Revive = 74;</code>
     */
    public static final int CCC_Use_Summon_Monster_By_Special_Revive_VALUE = 74;
    /**
     * <code>CCC_Use_Buy_Default_Ship = 75;</code>
     */
    public static final int CCC_Use_Buy_Default_Ship_VALUE = 75;
    /**
     * <code>CCC_Use_Upgrade_Monster_Skill = 76;</code>
     */
    public static final int CCC_Use_Upgrade_Monster_Skill_VALUE = 76;
    /**
     * <code>CCC_Use_Rapid_Combining_Superstone = 77;</code>
     */
    public static final int CCC_Use_Rapid_Combining_Superstone_VALUE = 77;
    /**
     * <code>CCC_Use_Super_Evolution = 78;</code>
     */
    public static final int CCC_Use_Super_Evolution_VALUE = 78;
    /**
     * <code>CCC_Refund_From_DBTool = 99;</code>
     */
    public static final int CCC_Refund_From_DBTool_VALUE = 99;


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
    public static CurrencyChangeCause valueOf(int value) {
      return forNumber(value);
    }

    public static CurrencyChangeCause forNumber(int value) {
      switch (value) {
        case 0: return CurrencyChangeCauseNULL;
        case 1: return CCC_Get_Buy_In_Shop;
        case 2: return CCC_Get_Buy_In_Instant_Shop;
        case 3: return CCC_Get_Lobby_Reward;
        case 4: return CCC_Get_Battle_Drop;
        case 5: return CCC_Get_Battle_Clear_Reward;
        case 6: return CCC_Get_Gift;
        case 7: return CCC_Get_Quest_Reward;
        case 8: return CCC_Get_Sell_Rune;
        case 9: return CCC_Get_Sell_Monster;
        case 10: return CCC_Get_Send_Gift_Reward;
        case 11: return CCC_Get_User_Levelup_Reward;
        case 12: return CCC_Get_Send_Gift_Bonus;
        case 13: return CCC_Get_Monster_Dict_Reward;
        case 14: return CCC_Get_Arena_Battle_Reward;
        case 15: return CCC_Get_30day_package_special_reward;
        case 16: return CCC_Get_30day_package;
        case 17: return CCC_Get_levelup_package;
        case 18: return CCC_Get_adventure_package;
        case 19: return CCC_Get_Send_Gift_All_Reward;
        case 20: return CCC_Get_Shop_Item_Bundle_Reward;
        case 21: return CCC_Get_15day_package_special_reward;
        case 22: return CCC_Get_Clan_Battle_Clear_Reward;
        case 23: return CCC_Use_Summon_Monster_By_StarEssence;
        case 24: return CCC_Get_Clan_Battle_Season_Reward;
        case 25: return CCC_Get_LobbyShip;
        case 26: return CCC_Get_LobbyShip_special_reward;
        case 27: return CCC_Get_Festival_Ticket_Reward;
        case 28: return CCC_Get_Sell_SuperStoneStuff;
        case 29: return CCC_Get_Booster_Package_Instant_Reward;
        case 50: return CCC_Use_Buy_Bullet;
        case 51: return CCC_Use_In_Joje_Shop;
        case 52: return CCC_Use_In_Shop;
        case 53: return CCC_Use_In_Instant_Shop;
        case 54: return CCC_Use_Extend_Monster_slot;
        case 55: return CCC_Use_Unequip_Rune;
        case 56: return CCC_Use_Upgrade_Rune;
        case 57: return CCC_Use_Summon_Monster;
        case 58: return CCC_Use_Summon_Monster_By_Soulstone;
        case 59: return CCC_Use_Summon_Monster_By_Revive;
        case 60: return CCC_Use_Summon_Monster_By_Egg;
        case 61: return CCC_Use_Beyond_Monster;
        case 62: return CCC_Use_Warmup_Evolution_Monster;
        case 63: return CCC_Use_Final_Evolution_Monster;
        case 64: return CCC_Use_Max_Evolution_Monster;
        case 65: return CCC_Use_Feed_Item_To_Monster;
        case 66: return CCC_Use_Refresh_arena_list;
        case 67: return CCC_Use_Reset_Dungeon_Enter_Count;
        case 68: return CCC_Use_Continue_Battle;
        case 69: return CCC_Use_Refresh_Joje_Shop_List;
        case 70: return CCC_Use_Start_Dungeon;
        case 71: return CCC_Use_Dungeon_Ticket_Reset;
        case 72: return CCC_Use_Combine_Beyond_Stone;
        case 73: return CCC_Use_Create_Clan;
        case 74: return CCC_Use_Summon_Monster_By_Special_Revive;
        case 75: return CCC_Use_Buy_Default_Ship;
        case 76: return CCC_Use_Upgrade_Monster_Skill;
        case 77: return CCC_Use_Rapid_Combining_Superstone;
        case 78: return CCC_Use_Super_Evolution;
        case 99: return CCC_Refund_From_DBTool;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CurrencyChangeCause>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CurrencyChangeCause> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CurrencyChangeCause>() {
            public CurrencyChangeCause findValueByNumber(int number) {
              return CurrencyChangeCause.forNumber(number);
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
      return com.felania.msldb.CurrencyChangeCauseOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final CurrencyChangeCause[] VALUES = values();

    public static CurrencyChangeCause valueOf(
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

    private CurrencyChangeCause(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msggamedata.CurrencyChangeCause)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031CurrencyChangeCause.proto\022\013msggamedata" +
      "*\227\017\n\023CurrencyChangeCause\022\033\n\027CurrencyChan" +
      "geCauseNULL\020\000\022\027\n\023CCC_Get_Buy_In_Shop\020\001\022\037" +
      "\n\033CCC_Get_Buy_In_Instant_Shop\020\002\022\030\n\024CCC_G" +
      "et_Lobby_Reward\020\003\022\027\n\023CCC_Get_Battle_Drop" +
      "\020\004\022\037\n\033CCC_Get_Battle_Clear_Reward\020\005\022\020\n\014C" +
      "CC_Get_Gift\020\006\022\030\n\024CCC_Get_Quest_Reward\020\007\022" +
      "\025\n\021CCC_Get_Sell_Rune\020\010\022\030\n\024CCC_Get_Sell_M" +
      "onster\020\t\022\034\n\030CCC_Get_Send_Gift_Reward\020\n\022\037" +
      "\n\033CCC_Get_User_Levelup_Reward\020\013\022\033\n\027CCC_G",
      "et_Send_Gift_Bonus\020\014\022\037\n\033CCC_Get_Monster_" +
      "Dict_Reward\020\r\022\037\n\033CCC_Get_Arena_Battle_Re" +
      "ward\020\016\022(\n$CCC_Get_30day_package_special_" +
      "reward\020\017\022\031\n\025CCC_Get_30day_package\020\020\022\033\n\027C" +
      "CC_Get_levelup_package\020\021\022\035\n\031CCC_Get_adve" +
      "nture_package\020\022\022 \n\034CCC_Get_Send_Gift_All" +
      "_Reward\020\023\022#\n\037CCC_Get_Shop_Item_Bundle_Re" +
      "ward\020\024\022(\n$CCC_Get_15day_package_special_" +
      "reward\020\025\022$\n CCC_Get_Clan_Battle_Clear_Re" +
      "ward\020\026\022)\n%CCC_Use_Summon_Monster_By_Star",
      "Essence\020\027\022%\n!CCC_Get_Clan_Battle_Season_" +
      "Reward\020\030\022\025\n\021CCC_Get_LobbyShip\020\031\022$\n CCC_G" +
      "et_LobbyShip_special_reward\020\032\022\"\n\036CCC_Get" +
      "_Festival_Ticket_Reward\020\033\022 \n\034CCC_Get_Sel" +
      "l_SuperStoneStuff\020\034\022*\n&CCC_Get_Booster_P" +
      "ackage_Instant_Reward\020\035\022\026\n\022CCC_Use_Buy_B" +
      "ullet\0202\022\030\n\024CCC_Use_In_Joje_Shop\0203\022\023\n\017CCC" +
      "_Use_In_Shop\0204\022\033\n\027CCC_Use_In_Instant_Sho" +
      "p\0205\022\037\n\033CCC_Use_Extend_Monster_slot\0206\022\030\n\024" +
      "CCC_Use_Unequip_Rune\0207\022\030\n\024CCC_Use_Upgrad",
      "e_Rune\0208\022\032\n\026CCC_Use_Summon_Monster\0209\022\'\n#" +
      "CCC_Use_Summon_Monster_By_Soulstone\020:\022$\n" +
      " CCC_Use_Summon_Monster_By_Revive\020;\022!\n\035C" +
      "CC_Use_Summon_Monster_By_Egg\020<\022\032\n\026CCC_Us" +
      "e_Beyond_Monster\020=\022$\n CCC_Use_Warmup_Evo" +
      "lution_Monster\020>\022#\n\037CCC_Use_Final_Evolut" +
      "ion_Monster\020?\022!\n\035CCC_Use_Max_Evolution_M" +
      "onster\020@\022 \n\034CCC_Use_Feed_Item_To_Monster" +
      "\020A\022\036\n\032CCC_Use_Refresh_arena_list\020B\022%\n!CC" +
      "C_Use_Reset_Dungeon_Enter_Count\020C\022\033\n\027CCC",
      "_Use_Continue_Battle\020D\022\"\n\036CCC_Use_Refres" +
      "h_Joje_Shop_List\020E\022\031\n\025CCC_Use_Start_Dung" +
      "eon\020F\022 \n\034CCC_Use_Dungeon_Ticket_Reset\020G\022" +
      " \n\034CCC_Use_Combine_Beyond_Stone\020H\022\027\n\023CCC" +
      "_Use_Create_Clan\020I\022,\n(CCC_Use_Summon_Mon" +
      "ster_By_Special_Revive\020J\022\034\n\030CCC_Use_Buy_" +
      "Default_Ship\020K\022!\n\035CCC_Use_Upgrade_Monste" +
      "r_Skill\020L\022&\n\"CCC_Use_Rapid_Combining_Sup" +
      "erstone\020M\022\033\n\027CCC_Use_Super_Evolution\020N\022\032" +
      "\n\026CCC_Refund_From_DBTool\020cB\023\n\021com.felani",
      "a.msldbb\006proto3"
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
