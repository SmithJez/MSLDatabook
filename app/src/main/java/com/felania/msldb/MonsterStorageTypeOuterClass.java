// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MonsterStorageType.proto

package com.felania.msldb;

public final class MonsterStorageTypeOuterClass {
  private MonsterStorageTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code msggamedata.MonsterStorageType}
   */
  public enum MonsterStorageType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MST_USER_INVEN = 0;</code>
     */
    MST_USER_INVEN(0),
    /**
     * <code>MST_DEFAULT_STORAGE_1 = 1;</code>
     */
    MST_DEFAULT_STORAGE_1(1),
    /**
     * <code>MST_EXTEND_STORAGE_2 = 2;</code>
     */
    MST_EXTEND_STORAGE_2(2),
    /**
     * <code>MST_EXTEND_STORAGE_3 = 3;</code>
     */
    MST_EXTEND_STORAGE_3(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MST_USER_INVEN = 0;</code>
     */
    public static final int MST_USER_INVEN_VALUE = 0;
    /**
     * <code>MST_DEFAULT_STORAGE_1 = 1;</code>
     */
    public static final int MST_DEFAULT_STORAGE_1_VALUE = 1;
    /**
     * <code>MST_EXTEND_STORAGE_2 = 2;</code>
     */
    public static final int MST_EXTEND_STORAGE_2_VALUE = 2;
    /**
     * <code>MST_EXTEND_STORAGE_3 = 3;</code>
     */
    public static final int MST_EXTEND_STORAGE_3_VALUE = 3;


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
    public static MonsterStorageType valueOf(int value) {
      return forNumber(value);
    }

    public static MonsterStorageType forNumber(int value) {
      switch (value) {
        case 0: return MST_USER_INVEN;
        case 1: return MST_DEFAULT_STORAGE_1;
        case 2: return MST_EXTEND_STORAGE_2;
        case 3: return MST_EXTEND_STORAGE_3;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MonsterStorageType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MonsterStorageType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MonsterStorageType>() {
            public MonsterStorageType findValueByNumber(int number) {
              return MonsterStorageType.forNumber(number);
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
      return com.felania.msldb.MonsterStorageTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MonsterStorageType[] VALUES = values();

    public static MonsterStorageType valueOf(
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

    private MonsterStorageType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msggamedata.MonsterStorageType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030MonsterStorageType.proto\022\013msggamedata*" +
      "w\n\022MonsterStorageType\022\022\n\016MST_USER_INVEN\020" +
      "\000\022\031\n\025MST_DEFAULT_STORAGE_1\020\001\022\030\n\024MST_EXTE" +
      "ND_STORAGE_2\020\002\022\030\n\024MST_EXTEND_STORAGE_3\020\003" +
      "B\023\n\021com.felania.msldbb\006proto3"
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
