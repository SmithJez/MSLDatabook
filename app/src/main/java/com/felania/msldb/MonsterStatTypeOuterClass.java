// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MonsterStatType.proto

package com.felania.msldb;

public final class MonsterStatTypeOuterClass {
  private MonsterStatTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code msggamedata.MonsterStatType}
   */
  public enum MonsterStatType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MS_None = 0;</code>
     */
    MS_None(0),
    /**
     * <code>MS_Attack = 1;</code>
     */
    MS_Attack(1),
    /**
     * <code>MS_Defence = 2;</code>
     */
    MS_Defence(2),
    /**
     * <code>MS_Heal = 3;</code>
     */
    MS_Heal(3),
    /**
     * <code>MS_Balance = 4;</code>
     */
    MS_Balance(4),
    /**
     * <code>MS_Hp = 5;</code>
     */
    MS_Hp(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MS_None = 0;</code>
     */
    public static final int MS_None_VALUE = 0;
    /**
     * <code>MS_Attack = 1;</code>
     */
    public static final int MS_Attack_VALUE = 1;
    /**
     * <code>MS_Defence = 2;</code>
     */
    public static final int MS_Defence_VALUE = 2;
    /**
     * <code>MS_Heal = 3;</code>
     */
    public static final int MS_Heal_VALUE = 3;
    /**
     * <code>MS_Balance = 4;</code>
     */
    public static final int MS_Balance_VALUE = 4;
    /**
     * <code>MS_Hp = 5;</code>
     */
    public static final int MS_Hp_VALUE = 5;


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
    public static MonsterStatType valueOf(int value) {
      return forNumber(value);
    }

    public static MonsterStatType forNumber(int value) {
      switch (value) {
        case 0: return MS_None;
        case 1: return MS_Attack;
        case 2: return MS_Defence;
        case 3: return MS_Heal;
        case 4: return MS_Balance;
        case 5: return MS_Hp;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MonsterStatType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MonsterStatType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MonsterStatType>() {
            public MonsterStatType findValueByNumber(int number) {
              return MonsterStatType.forNumber(number);
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
      return com.felania.msldb.MonsterStatTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MonsterStatType[] VALUES = values();

    public static MonsterStatType valueOf(
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

    private MonsterStatType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msggamedata.MonsterStatType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025MonsterStatType.proto\022\013msggamedata*e\n\017" +
      "MonsterStatType\022\013\n\007MS_None\020\000\022\r\n\tMS_Attac" +
      "k\020\001\022\016\n\nMS_Defence\020\002\022\013\n\007MS_Heal\020\003\022\016\n\nMS_B" +
      "alance\020\004\022\t\n\005MS_Hp\020\005B\023\n\021com.felania.msldb" +
      "b\006proto3"
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
