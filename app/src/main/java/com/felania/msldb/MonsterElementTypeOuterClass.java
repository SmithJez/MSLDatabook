// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MonsterElementType.proto

package com.felania.msldb;

public final class MonsterElementTypeOuterClass {
  private MonsterElementTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code msggamedata.MonsterElementType}
   */
  public enum MonsterElementType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MonsterElementTypeNULL = 0;</code>
     */
    MonsterElementTypeNULL(0),
    /**
     * <code>ME_None = 1;</code>
     */
    ME_None(1),
    /**
     * <code>ME_Fire = 2;</code>
     */
    ME_Fire(2),
    /**
     * <code>ME_Water = 3;</code>
     */
    ME_Water(3),
    /**
     * <code>ME_Tree = 4;</code>
     */
    ME_Tree(4),
    /**
     * <code>ME_Light = 5;</code>
     */
    ME_Light(5),
    /**
     * <code>ME_Dark = 6;</code>
     */
    ME_Dark(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MonsterElementTypeNULL = 0;</code>
     */
    public static final int MonsterElementTypeNULL_VALUE = 0;
    /**
     * <code>ME_None = 1;</code>
     */
    public static final int ME_None_VALUE = 1;
    /**
     * <code>ME_Fire = 2;</code>
     */
    public static final int ME_Fire_VALUE = 2;
    /**
     * <code>ME_Water = 3;</code>
     */
    public static final int ME_Water_VALUE = 3;
    /**
     * <code>ME_Tree = 4;</code>
     */
    public static final int ME_Tree_VALUE = 4;
    /**
     * <code>ME_Light = 5;</code>
     */
    public static final int ME_Light_VALUE = 5;
    /**
     * <code>ME_Dark = 6;</code>
     */
    public static final int ME_Dark_VALUE = 6;


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
    public static MonsterElementType valueOf(int value) {
      return forNumber(value);
    }

    public static MonsterElementType forNumber(int value) {
      switch (value) {
        case 0: return MonsterElementTypeNULL;
        case 1: return ME_None;
        case 2: return ME_Fire;
        case 3: return ME_Water;
        case 4: return ME_Tree;
        case 5: return ME_Light;
        case 6: return ME_Dark;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MonsterElementType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MonsterElementType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MonsterElementType>() {
            public MonsterElementType findValueByNumber(int number) {
              return MonsterElementType.forNumber(number);
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
      return com.felania.msldb.MonsterElementTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MonsterElementType[] VALUES = values();

    public static MonsterElementType valueOf(
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

    private MonsterElementType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msggamedata.MonsterElementType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030MonsterElementType.proto\022\013msggamedata*" +
      "\200\001\n\022MonsterElementType\022\032\n\026MonsterElement" +
      "TypeNULL\020\000\022\013\n\007ME_None\020\001\022\013\n\007ME_Fire\020\002\022\014\n\010" +
      "ME_Water\020\003\022\013\n\007ME_Tree\020\004\022\014\n\010ME_Light\020\005\022\013\n" +
      "\007ME_Dark\020\006B\023\n\021com.felania.msldbb\006proto3"
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
