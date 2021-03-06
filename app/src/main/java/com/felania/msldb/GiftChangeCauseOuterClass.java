// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GiftChangeCause.proto

package com.felania.msldb;

public final class GiftChangeCauseOuterClass {
  private GiftChangeCauseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code msggamedata.GiftChangeCause}
   */
  public enum GiftChangeCause
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GiftChangeCauseNULL = 0;</code>
     */
    GiftChangeCauseNULL(0),
    /**
     * <code>GCC_Arena_Reward = 1;</code>
     */
    GCC_Arena_Reward(1),
    /**
     * <code>GCC_Daily_Bonus = 2;</code>
     */
    GCC_Daily_Bonus(2),
    /**
     * <code>GCC_Lobby_Reward = 3;</code>
     */
    GCC_Lobby_Reward(3),
    /**
     * <code>GCC_First_Arena_Battle = 4;</code>
     */
    GCC_First_Arena_Battle(4),
    /**
     * <code>GCC_Event_Reward = 5;</code>
     */
    GCC_Event_Reward(5),
    /**
     * <code>GCC_Friend_Gift = 6;</code>
     */
    GCC_Friend_Gift(6),
    /**
     * <code>GCC_Borrow_Friend_Monster = 7;</code>
     */
    GCC_Borrow_Friend_Monster(7),
    /**
     * <code>GCC_Sell_Monster_Reward = 8;</code>
     */
    GCC_Sell_Monster_Reward(8),
    /**
     * <code>GCC_DBTool_Insert = 9;</code>
     */
    GCC_DBTool_Insert(9),
    /**
     * <code>GCC_Reward_By_FTT = 10;</code>
     */
    GCC_Reward_By_FTT(10),
    /**
     * <code>GCC_Tutorial_Completed = 11;</code>
     */
    GCC_Tutorial_Completed(11),
    /**
     * <code>GCC_Daily_Bonus_New_User = 12;</code>
     */
    GCC_Daily_Bonus_New_User(12),
    /**
     * <code>GCC_Daily_Bonus_Return = 13;</code>
     */
    GCC_Daily_Bonus_Return(13),
    /**
     * <code>GCC_Reward_Capture_King_Entrance = 14;</code>
     */
    GCC_Reward_Capture_King_Entrance(14),
    /**
     * <code>GCC_Reward_Capture_King_Result = 15;</code>
     */
    GCC_Reward_Capture_King_Result(15),
    /**
     * <code>GCC_Get_From_30day_Package = 16;</code>
     */
    GCC_Get_From_30day_Package(16),
    /**
     * <code>GCC_Get_From_Levelup_Package = 17;</code>
     */
    GCC_Get_From_Levelup_Package(17),
    /**
     * <code>GCC_Get_From_Adventure_Package = 18;</code>
     */
    GCC_Get_From_Adventure_Package(18),
    /**
     * <code>GCC_Get_Shop_Item_Bundle_Reward = 20;</code>
     */
    GCC_Get_Shop_Item_Bundle_Reward(20),
    /**
     * <code>GCC_Get_From_15day_Package = 21;</code>
     */
    GCC_Get_From_15day_Package(21),
    /**
     * <code>GCC_Get_From_15day_Package_purchase_bonus = 22;</code>
     */
    GCC_Get_From_15day_Package_purchase_bonus(22),
    /**
     * <code>GCC_First_Clan_Battle = 23;</code>
     */
    GCC_First_Clan_Battle(23),
    /**
     * <code>GCC_Reward_Clan_Season = 24;</code>
     */
    GCC_Reward_Clan_Season(24),
    /**
     * <code>GCC_Get_From_Egg_Package = 25;</code>
     */
    GCC_Get_From_Egg_Package(25),
    /**
     * <code>GCC_Get_From_Egg_Package_Purchase_Bonus = 26;</code>
     */
    GCC_Get_From_Egg_Package_Purchase_Bonus(26),
    /**
     * <code>GCC_Get_From_Contract_Bonus = 27;</code>
     */
    GCC_Get_From_Contract_Bonus(27),
    /**
     * <code>GCC_Get_From_Contract_Final_Bonus = 28;</code>
     */
    GCC_Get_From_Contract_Final_Bonus(28),
    /**
     * <code>GCC_Daily_Bonus_Return_Sequence = 29;</code>
     */
    GCC_Daily_Bonus_Return_Sequence(29),
    /**
     * <code>GCC_Special_Revive_Special_Reward = 30;</code>
     */
    GCC_Special_Revive_Special_Reward(30),
    /**
     * <code>GCC_Gacha_Shop_Festival_Reward = 31;</code>
     */
    GCC_Gacha_Shop_Festival_Reward(31),
    /**
     * <code>GCC_Get_From_LobbyShip_Reward = 32;</code>
     */
    GCC_Get_From_LobbyShip_Reward(32),
    /**
     * <code>GCC_Bingo_Reward = 33;</code>
     */
    GCC_Bingo_Reward(33),
    /**
     * <code>GCC_Clan_Graduation_Reward = 34;</code>
     */
    GCC_Clan_Graduation_Reward(34),
    /**
     * <code>GCC_Reward_CVC_Season = 35;</code>
     */
    GCC_Reward_CVC_Season(35),
    /**
     * <code>GCC_Clan_Festival_Reward = 36;</code>
     */
    GCC_Clan_Festival_Reward(36),
    /**
     * <code>GCC_Open_Clan_Festival_Gfit = 37;</code>
     */
    GCC_Open_Clan_Festival_Gfit(37),
    /**
     * <code>GCC_Get_From_Light_Contract_Bonus = 38;</code>
     */
    GCC_Get_From_Light_Contract_Bonus(38),
    /**
     * <code>GCC_Get_From_Light_Contract_Final_Bonus = 39;</code>
     */
    GCC_Get_From_Light_Contract_Final_Bonus(39),
    /**
     * <code>GCC_Booster_Package_Item = 40;</code>
     */
    GCC_Booster_Package_Item(40),
    /**
     * <code>GCC_purchase_Booster_Package_On_Event = 41;</code>
     */
    GCC_purchase_Booster_Package_On_Event(41),
    /**
     * <code>GCC_Reward_Capture_Festival_Finale = 42;</code>
     */
    GCC_Reward_Capture_Festival_Finale(42),
    /**
     * <code>GCC_Reward_Monthly_Monster_Reward = 43;</code>
     */
    GCC_Reward_Monthly_Monster_Reward(43),
    /**
     * <code>GCC_Bingo_Event_Reward = 44;</code>
     */
    GCC_Bingo_Event_Reward(44),
    /**
     * <code>GCC_Rejoin_Clan_Reward = 45;</code>
     */
    GCC_Rejoin_Clan_Reward(45),
    /**
     * <code>GCC_Super_Evolution_Share_Reward = 46;</code>
     */
    GCC_Super_Evolution_Share_Reward(46),
    /**
     * <code>GCC_Super_Evolution_Wish_Reward = 47;</code>
     */
    GCC_Super_Evolution_Wish_Reward(47),
    /**
     * <code>GCC_Super_Evolution_Complete = 48;</code>
     */
    GCC_Super_Evolution_Complete(48),
    /**
     * <code>GCC_Super_Evolution_Bonus = 49;</code>
     */
    GCC_Super_Evolution_Bonus(49),
    /**
     * <code>GCC_Gacha_Monster_By_Full_Inven = 50;</code>
     */
    GCC_Gacha_Monster_By_Full_Inven(50),
    /**
     * <code>GCC_Refund_From_DBTool = 99;</code>
     */
    GCC_Refund_From_DBTool(99),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GiftChangeCauseNULL = 0;</code>
     */
    public static final int GiftChangeCauseNULL_VALUE = 0;
    /**
     * <code>GCC_Arena_Reward = 1;</code>
     */
    public static final int GCC_Arena_Reward_VALUE = 1;
    /**
     * <code>GCC_Daily_Bonus = 2;</code>
     */
    public static final int GCC_Daily_Bonus_VALUE = 2;
    /**
     * <code>GCC_Lobby_Reward = 3;</code>
     */
    public static final int GCC_Lobby_Reward_VALUE = 3;
    /**
     * <code>GCC_First_Arena_Battle = 4;</code>
     */
    public static final int GCC_First_Arena_Battle_VALUE = 4;
    /**
     * <code>GCC_Event_Reward = 5;</code>
     */
    public static final int GCC_Event_Reward_VALUE = 5;
    /**
     * <code>GCC_Friend_Gift = 6;</code>
     */
    public static final int GCC_Friend_Gift_VALUE = 6;
    /**
     * <code>GCC_Borrow_Friend_Monster = 7;</code>
     */
    public static final int GCC_Borrow_Friend_Monster_VALUE = 7;
    /**
     * <code>GCC_Sell_Monster_Reward = 8;</code>
     */
    public static final int GCC_Sell_Monster_Reward_VALUE = 8;
    /**
     * <code>GCC_DBTool_Insert = 9;</code>
     */
    public static final int GCC_DBTool_Insert_VALUE = 9;
    /**
     * <code>GCC_Reward_By_FTT = 10;</code>
     */
    public static final int GCC_Reward_By_FTT_VALUE = 10;
    /**
     * <code>GCC_Tutorial_Completed = 11;</code>
     */
    public static final int GCC_Tutorial_Completed_VALUE = 11;
    /**
     * <code>GCC_Daily_Bonus_New_User = 12;</code>
     */
    public static final int GCC_Daily_Bonus_New_User_VALUE = 12;
    /**
     * <code>GCC_Daily_Bonus_Return = 13;</code>
     */
    public static final int GCC_Daily_Bonus_Return_VALUE = 13;
    /**
     * <code>GCC_Reward_Capture_King_Entrance = 14;</code>
     */
    public static final int GCC_Reward_Capture_King_Entrance_VALUE = 14;
    /**
     * <code>GCC_Reward_Capture_King_Result = 15;</code>
     */
    public static final int GCC_Reward_Capture_King_Result_VALUE = 15;
    /**
     * <code>GCC_Get_From_30day_Package = 16;</code>
     */
    public static final int GCC_Get_From_30day_Package_VALUE = 16;
    /**
     * <code>GCC_Get_From_Levelup_Package = 17;</code>
     */
    public static final int GCC_Get_From_Levelup_Package_VALUE = 17;
    /**
     * <code>GCC_Get_From_Adventure_Package = 18;</code>
     */
    public static final int GCC_Get_From_Adventure_Package_VALUE = 18;
    /**
     * <code>GCC_Get_Shop_Item_Bundle_Reward = 20;</code>
     */
    public static final int GCC_Get_Shop_Item_Bundle_Reward_VALUE = 20;
    /**
     * <code>GCC_Get_From_15day_Package = 21;</code>
     */
    public static final int GCC_Get_From_15day_Package_VALUE = 21;
    /**
     * <code>GCC_Get_From_15day_Package_purchase_bonus = 22;</code>
     */
    public static final int GCC_Get_From_15day_Package_purchase_bonus_VALUE = 22;
    /**
     * <code>GCC_First_Clan_Battle = 23;</code>
     */
    public static final int GCC_First_Clan_Battle_VALUE = 23;
    /**
     * <code>GCC_Reward_Clan_Season = 24;</code>
     */
    public static final int GCC_Reward_Clan_Season_VALUE = 24;
    /**
     * <code>GCC_Get_From_Egg_Package = 25;</code>
     */
    public static final int GCC_Get_From_Egg_Package_VALUE = 25;
    /**
     * <code>GCC_Get_From_Egg_Package_Purchase_Bonus = 26;</code>
     */
    public static final int GCC_Get_From_Egg_Package_Purchase_Bonus_VALUE = 26;
    /**
     * <code>GCC_Get_From_Contract_Bonus = 27;</code>
     */
    public static final int GCC_Get_From_Contract_Bonus_VALUE = 27;
    /**
     * <code>GCC_Get_From_Contract_Final_Bonus = 28;</code>
     */
    public static final int GCC_Get_From_Contract_Final_Bonus_VALUE = 28;
    /**
     * <code>GCC_Daily_Bonus_Return_Sequence = 29;</code>
     */
    public static final int GCC_Daily_Bonus_Return_Sequence_VALUE = 29;
    /**
     * <code>GCC_Special_Revive_Special_Reward = 30;</code>
     */
    public static final int GCC_Special_Revive_Special_Reward_VALUE = 30;
    /**
     * <code>GCC_Gacha_Shop_Festival_Reward = 31;</code>
     */
    public static final int GCC_Gacha_Shop_Festival_Reward_VALUE = 31;
    /**
     * <code>GCC_Get_From_LobbyShip_Reward = 32;</code>
     */
    public static final int GCC_Get_From_LobbyShip_Reward_VALUE = 32;
    /**
     * <code>GCC_Bingo_Reward = 33;</code>
     */
    public static final int GCC_Bingo_Reward_VALUE = 33;
    /**
     * <code>GCC_Clan_Graduation_Reward = 34;</code>
     */
    public static final int GCC_Clan_Graduation_Reward_VALUE = 34;
    /**
     * <code>GCC_Reward_CVC_Season = 35;</code>
     */
    public static final int GCC_Reward_CVC_Season_VALUE = 35;
    /**
     * <code>GCC_Clan_Festival_Reward = 36;</code>
     */
    public static final int GCC_Clan_Festival_Reward_VALUE = 36;
    /**
     * <code>GCC_Open_Clan_Festival_Gfit = 37;</code>
     */
    public static final int GCC_Open_Clan_Festival_Gfit_VALUE = 37;
    /**
     * <code>GCC_Get_From_Light_Contract_Bonus = 38;</code>
     */
    public static final int GCC_Get_From_Light_Contract_Bonus_VALUE = 38;
    /**
     * <code>GCC_Get_From_Light_Contract_Final_Bonus = 39;</code>
     */
    public static final int GCC_Get_From_Light_Contract_Final_Bonus_VALUE = 39;
    /**
     * <code>GCC_Booster_Package_Item = 40;</code>
     */
    public static final int GCC_Booster_Package_Item_VALUE = 40;
    /**
     * <code>GCC_purchase_Booster_Package_On_Event = 41;</code>
     */
    public static final int GCC_purchase_Booster_Package_On_Event_VALUE = 41;
    /**
     * <code>GCC_Reward_Capture_Festival_Finale = 42;</code>
     */
    public static final int GCC_Reward_Capture_Festival_Finale_VALUE = 42;
    /**
     * <code>GCC_Reward_Monthly_Monster_Reward = 43;</code>
     */
    public static final int GCC_Reward_Monthly_Monster_Reward_VALUE = 43;
    /**
     * <code>GCC_Bingo_Event_Reward = 44;</code>
     */
    public static final int GCC_Bingo_Event_Reward_VALUE = 44;
    /**
     * <code>GCC_Rejoin_Clan_Reward = 45;</code>
     */
    public static final int GCC_Rejoin_Clan_Reward_VALUE = 45;
    /**
     * <code>GCC_Super_Evolution_Share_Reward = 46;</code>
     */
    public static final int GCC_Super_Evolution_Share_Reward_VALUE = 46;
    /**
     * <code>GCC_Super_Evolution_Wish_Reward = 47;</code>
     */
    public static final int GCC_Super_Evolution_Wish_Reward_VALUE = 47;
    /**
     * <code>GCC_Super_Evolution_Complete = 48;</code>
     */
    public static final int GCC_Super_Evolution_Complete_VALUE = 48;
    /**
     * <code>GCC_Super_Evolution_Bonus = 49;</code>
     */
    public static final int GCC_Super_Evolution_Bonus_VALUE = 49;
    /**
     * <code>GCC_Gacha_Monster_By_Full_Inven = 50;</code>
     */
    public static final int GCC_Gacha_Monster_By_Full_Inven_VALUE = 50;
    /**
     * <code>GCC_Refund_From_DBTool = 99;</code>
     */
    public static final int GCC_Refund_From_DBTool_VALUE = 99;


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
    public static GiftChangeCause valueOf(int value) {
      return forNumber(value);
    }

    public static GiftChangeCause forNumber(int value) {
      switch (value) {
        case 0: return GiftChangeCauseNULL;
        case 1: return GCC_Arena_Reward;
        case 2: return GCC_Daily_Bonus;
        case 3: return GCC_Lobby_Reward;
        case 4: return GCC_First_Arena_Battle;
        case 5: return GCC_Event_Reward;
        case 6: return GCC_Friend_Gift;
        case 7: return GCC_Borrow_Friend_Monster;
        case 8: return GCC_Sell_Monster_Reward;
        case 9: return GCC_DBTool_Insert;
        case 10: return GCC_Reward_By_FTT;
        case 11: return GCC_Tutorial_Completed;
        case 12: return GCC_Daily_Bonus_New_User;
        case 13: return GCC_Daily_Bonus_Return;
        case 14: return GCC_Reward_Capture_King_Entrance;
        case 15: return GCC_Reward_Capture_King_Result;
        case 16: return GCC_Get_From_30day_Package;
        case 17: return GCC_Get_From_Levelup_Package;
        case 18: return GCC_Get_From_Adventure_Package;
        case 20: return GCC_Get_Shop_Item_Bundle_Reward;
        case 21: return GCC_Get_From_15day_Package;
        case 22: return GCC_Get_From_15day_Package_purchase_bonus;
        case 23: return GCC_First_Clan_Battle;
        case 24: return GCC_Reward_Clan_Season;
        case 25: return GCC_Get_From_Egg_Package;
        case 26: return GCC_Get_From_Egg_Package_Purchase_Bonus;
        case 27: return GCC_Get_From_Contract_Bonus;
        case 28: return GCC_Get_From_Contract_Final_Bonus;
        case 29: return GCC_Daily_Bonus_Return_Sequence;
        case 30: return GCC_Special_Revive_Special_Reward;
        case 31: return GCC_Gacha_Shop_Festival_Reward;
        case 32: return GCC_Get_From_LobbyShip_Reward;
        case 33: return GCC_Bingo_Reward;
        case 34: return GCC_Clan_Graduation_Reward;
        case 35: return GCC_Reward_CVC_Season;
        case 36: return GCC_Clan_Festival_Reward;
        case 37: return GCC_Open_Clan_Festival_Gfit;
        case 38: return GCC_Get_From_Light_Contract_Bonus;
        case 39: return GCC_Get_From_Light_Contract_Final_Bonus;
        case 40: return GCC_Booster_Package_Item;
        case 41: return GCC_purchase_Booster_Package_On_Event;
        case 42: return GCC_Reward_Capture_Festival_Finale;
        case 43: return GCC_Reward_Monthly_Monster_Reward;
        case 44: return GCC_Bingo_Event_Reward;
        case 45: return GCC_Rejoin_Clan_Reward;
        case 46: return GCC_Super_Evolution_Share_Reward;
        case 47: return GCC_Super_Evolution_Wish_Reward;
        case 48: return GCC_Super_Evolution_Complete;
        case 49: return GCC_Super_Evolution_Bonus;
        case 50: return GCC_Gacha_Monster_By_Full_Inven;
        case 99: return GCC_Refund_From_DBTool;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GiftChangeCause>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GiftChangeCause> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GiftChangeCause>() {
            public GiftChangeCause findValueByNumber(int number) {
              return GiftChangeCause.forNumber(number);
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
      return com.felania.msldb.GiftChangeCauseOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GiftChangeCause[] VALUES = values();

    public static GiftChangeCause valueOf(
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

    private GiftChangeCause(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msggamedata.GiftChangeCause)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025GiftChangeCause.proto\022\013msggamedata*\364\014\n" +
      "\017GiftChangeCause\022\027\n\023GiftChangeCauseNULL\020" +
      "\000\022\024\n\020GCC_Arena_Reward\020\001\022\023\n\017GCC_Daily_Bon" +
      "us\020\002\022\024\n\020GCC_Lobby_Reward\020\003\022\032\n\026GCC_First_" +
      "Arena_Battle\020\004\022\024\n\020GCC_Event_Reward\020\005\022\023\n\017" +
      "GCC_Friend_Gift\020\006\022\035\n\031GCC_Borrow_Friend_M" +
      "onster\020\007\022\033\n\027GCC_Sell_Monster_Reward\020\010\022\025\n" +
      "\021GCC_DBTool_Insert\020\t\022\025\n\021GCC_Reward_By_FT" +
      "T\020\n\022\032\n\026GCC_Tutorial_Completed\020\013\022\034\n\030GCC_D" +
      "aily_Bonus_New_User\020\014\022\032\n\026GCC_Daily_Bonus" +
      "_Return\020\r\022$\n GCC_Reward_Capture_King_Ent" +
      "rance\020\016\022\"\n\036GCC_Reward_Capture_King_Resul" +
      "t\020\017\022\036\n\032GCC_Get_From_30day_Package\020\020\022 \n\034G" +
      "CC_Get_From_Levelup_Package\020\021\022\"\n\036GCC_Get" +
      "_From_Adventure_Package\020\022\022#\n\037GCC_Get_Sho" +
      "p_Item_Bundle_Reward\020\024\022\036\n\032GCC_Get_From_1" +
      "5day_Package\020\025\022-\n)GCC_Get_From_15day_Pac" +
      "kage_purchase_bonus\020\026\022\031\n\025GCC_First_Clan_" +
      "Battle\020\027\022\032\n\026GCC_Reward_Clan_Season\020\030\022\034\n\030" +
      "GCC_Get_From_Egg_Package\020\031\022+\n\'GCC_Get_Fr" +
      "om_Egg_Package_Purchase_Bonus\020\032\022\037\n\033GCC_G" +
      "et_From_Contract_Bonus\020\033\022%\n!GCC_Get_From" +
      "_Contract_Final_Bonus\020\034\022#\n\037GCC_Daily_Bon" +
      "us_Return_Sequence\020\035\022%\n!GCC_Special_Revi" +
      "ve_Special_Reward\020\036\022\"\n\036GCC_Gacha_Shop_Fe" +
      "stival_Reward\020\037\022!\n\035GCC_Get_From_LobbyShi" +
      "p_Reward\020 \022\024\n\020GCC_Bingo_Reward\020!\022\036\n\032GCC_" +
      "Clan_Graduation_Reward\020\"\022\031\n\025GCC_Reward_C" +
      "VC_Season\020#\022\034\n\030GCC_Clan_Festival_Reward\020" +
      "$\022\037\n\033GCC_Open_Clan_Festival_Gfit\020%\022%\n!GC" +
      "C_Get_From_Light_Contract_Bonus\020&\022+\n\'GCC" +
      "_Get_From_Light_Contract_Final_Bonus\020\'\022\034" +
      "\n\030GCC_Booster_Package_Item\020(\022)\n%GCC_purc" +
      "hase_Booster_Package_On_Event\020)\022&\n\"GCC_R" +
      "eward_Capture_Festival_Finale\020*\022%\n!GCC_R" +
      "eward_Monthly_Monster_Reward\020+\022\032\n\026GCC_Bi" +
      "ngo_Event_Reward\020,\022\032\n\026GCC_Rejoin_Clan_Re" +
      "ward\020-\022$\n GCC_Super_Evolution_Share_Rewa" +
      "rd\020.\022#\n\037GCC_Super_Evolution_Wish_Reward\020" +
      "/\022 \n\034GCC_Super_Evolution_Complete\0200\022\035\n\031G" +
      "CC_Super_Evolution_Bonus\0201\022#\n\037GCC_Gacha_" +
      "Monster_By_Full_Inven\0202\022\032\n\026GCC_Refund_Fr" +
      "om_DBTool\020cB\023\n\021com.felania.msldbb\006proto3"
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
