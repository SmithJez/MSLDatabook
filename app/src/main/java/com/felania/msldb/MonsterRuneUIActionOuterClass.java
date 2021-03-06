// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MonsterRuneUIAction.proto

package com.felania.msldb;

public final class MonsterRuneUIActionOuterClass {
  private MonsterRuneUIActionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code msggamedata.MonsterRuneUIAction}
   */
  public enum MonsterRuneUIAction
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MonsterRuneUIActionNULL = 0;</code>
     */
    MonsterRuneUIActionNULL(0),
    /**
     * <code>MRUA_Upgrade = 1;</code>
     */
    MRUA_Upgrade(1),
    /**
     * <code>MRUA_Equip = 2;</code>
     */
    MRUA_Equip(2),
    /**
     * <code>MRUA_Unequip = 3;</code>
     */
    MRUA_Unequip(3),
    /**
     * <code>MRUA_Sell = 4;</code>
     */
    MRUA_Sell(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MonsterRuneUIActionNULL = 0;</code>
     */
    public static final int MonsterRuneUIActionNULL_VALUE = 0;
    /**
     * <code>MRUA_Upgrade = 1;</code>
     */
    public static final int MRUA_Upgrade_VALUE = 1;
    /**
     * <code>MRUA_Equip = 2;</code>
     */
    public static final int MRUA_Equip_VALUE = 2;
    /**
     * <code>MRUA_Unequip = 3;</code>
     */
    public static final int MRUA_Unequip_VALUE = 3;
    /**
     * <code>MRUA_Sell = 4;</code>
     */
    public static final int MRUA_Sell_VALUE = 4;


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
    public static MonsterRuneUIAction valueOf(int value) {
      return forNumber(value);
    }

    public static MonsterRuneUIAction forNumber(int value) {
      switch (value) {
        case 0: return MonsterRuneUIActionNULL;
        case 1: return MRUA_Upgrade;
        case 2: return MRUA_Equip;
        case 3: return MRUA_Unequip;
        case 4: return MRUA_Sell;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MonsterRuneUIAction>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MonsterRuneUIAction> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MonsterRuneUIAction>() {
            public MonsterRuneUIAction findValueByNumber(int number) {
              return MonsterRuneUIAction.forNumber(number);
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
      return com.felania.msldb.MonsterRuneUIActionOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MonsterRuneUIAction[] VALUES = values();

    public static MonsterRuneUIAction valueOf(
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

    private MonsterRuneUIAction(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msggamedata.MonsterRuneUIAction)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031MonsterRuneUIAction.proto\022\013msggamedata" +
      "*u\n\023MonsterRuneUIAction\022\033\n\027MonsterRuneUI" +
      "ActionNULL\020\000\022\020\n\014MRUA_Upgrade\020\001\022\016\n\nMRUA_E" +
      "quip\020\002\022\020\n\014MRUA_Unequip\020\003\022\r\n\tMRUA_Sell\020\004B" +
      "\023\n\021com.felania.msldbb\006proto3"
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
