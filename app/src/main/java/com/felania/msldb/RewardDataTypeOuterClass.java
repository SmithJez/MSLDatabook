// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RewardDataType.proto

package com.felania.msldb;

public final class RewardDataTypeOuterClass {
  private RewardDataTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code msggamedata.RewardDataType}
   */
  public enum RewardDataType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>RewardDataTypeNULL = 0;</code>
     */
    RewardDataTypeNULL(0),
    /**
     * <code>RDT_None = 1;</code>
     */
    RDT_None(1),
    /**
     * <code>RDT_Gem = 2;</code>
     */
    RDT_Gem(2),
    /**
     * <code>RDT_Gold = 3;</code>
     */
    RDT_Gold(3),
    /**
     * <code>RDT_Energy = 4;</code>
     */
    RDT_Energy(4),
    /**
     * <code>RDT_ArenaTicket = 5;</code>
     */
    RDT_ArenaTicket(5),
    /**
     * <code>RDT_Uid = 6;</code>
     */
    RDT_Uid(6),
    /**
     * <code>RDT_ClanPoint = 7;</code>
     */
    RDT_ClanPoint(7),
    /**
     * <code>RDT_DungeonTicket = 8;</code>
     */
    RDT_DungeonTicket(8),
    /**
     * <code>RDT_SoulStone = 9;</code>
     */
    RDT_SoulStone(9),
    /**
     * <code>RDT_CostumeTicket = 10;</code>
     */
    RDT_CostumeTicket(10),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>RewardDataTypeNULL = 0;</code>
     */
    public static final int RewardDataTypeNULL_VALUE = 0;
    /**
     * <code>RDT_None = 1;</code>
     */
    public static final int RDT_None_VALUE = 1;
    /**
     * <code>RDT_Gem = 2;</code>
     */
    public static final int RDT_Gem_VALUE = 2;
    /**
     * <code>RDT_Gold = 3;</code>
     */
    public static final int RDT_Gold_VALUE = 3;
    /**
     * <code>RDT_Energy = 4;</code>
     */
    public static final int RDT_Energy_VALUE = 4;
    /**
     * <code>RDT_ArenaTicket = 5;</code>
     */
    public static final int RDT_ArenaTicket_VALUE = 5;
    /**
     * <code>RDT_Uid = 6;</code>
     */
    public static final int RDT_Uid_VALUE = 6;
    /**
     * <code>RDT_ClanPoint = 7;</code>
     */
    public static final int RDT_ClanPoint_VALUE = 7;
    /**
     * <code>RDT_DungeonTicket = 8;</code>
     */
    public static final int RDT_DungeonTicket_VALUE = 8;
    /**
     * <code>RDT_SoulStone = 9;</code>
     */
    public static final int RDT_SoulStone_VALUE = 9;
    /**
     * <code>RDT_CostumeTicket = 10;</code>
     */
    public static final int RDT_CostumeTicket_VALUE = 10;


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
    public static RewardDataType valueOf(int value) {
      return forNumber(value);
    }

    public static RewardDataType forNumber(int value) {
      switch (value) {
        case 0: return RewardDataTypeNULL;
        case 1: return RDT_None;
        case 2: return RDT_Gem;
        case 3: return RDT_Gold;
        case 4: return RDT_Energy;
        case 5: return RDT_ArenaTicket;
        case 6: return RDT_Uid;
        case 7: return RDT_ClanPoint;
        case 8: return RDT_DungeonTicket;
        case 9: return RDT_SoulStone;
        case 10: return RDT_CostumeTicket;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RewardDataType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RewardDataType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RewardDataType>() {
            public RewardDataType findValueByNumber(int number) {
              return RewardDataType.forNumber(number);
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
      return com.felania.msldb.RewardDataTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final RewardDataType[] VALUES = values();

    public static RewardDataType valueOf(
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

    private RewardDataType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msggamedata.RewardDataType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024RewardDataType.proto\022\013msggamedata*\327\001\n\016" +
      "RewardDataType\022\026\n\022RewardDataTypeNULL\020\000\022\014" +
      "\n\010RDT_None\020\001\022\013\n\007RDT_Gem\020\002\022\014\n\010RDT_Gold\020\003\022" +
      "\016\n\nRDT_Energy\020\004\022\023\n\017RDT_ArenaTicket\020\005\022\013\n\007" +
      "RDT_Uid\020\006\022\021\n\rRDT_ClanPoint\020\007\022\025\n\021RDT_Dung" +
      "eonTicket\020\010\022\021\n\rRDT_SoulStone\020\t\022\025\n\021RDT_Co" +
      "stumeTicket\020\nB\023\n\021com.felania.msldbb\006prot" +
      "o3"
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
