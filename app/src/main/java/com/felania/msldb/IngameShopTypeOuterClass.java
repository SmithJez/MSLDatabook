// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IngameShopType.proto

package com.felania.msldb;

public final class IngameShopTypeOuterClass {
  private IngameShopTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code msggamedata.IngameShopType}
   */
  public enum IngameShopType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>IngameShopTypeNULL = 0;</code>
     */
    IngameShopTypeNULL(0),
    /**
     * <code>IST_Normal_Shop = 1;</code>
     */
    IST_Normal_Shop(1),
    /**
     * <code>IST_Joje_Shop = 2;</code>
     */
    IST_Joje_Shop(2),
    /**
     * <code>IST_Instant_Shop = 3;</code>
     */
    IST_Instant_Shop(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>IngameShopTypeNULL = 0;</code>
     */
    public static final int IngameShopTypeNULL_VALUE = 0;
    /**
     * <code>IST_Normal_Shop = 1;</code>
     */
    public static final int IST_Normal_Shop_VALUE = 1;
    /**
     * <code>IST_Joje_Shop = 2;</code>
     */
    public static final int IST_Joje_Shop_VALUE = 2;
    /**
     * <code>IST_Instant_Shop = 3;</code>
     */
    public static final int IST_Instant_Shop_VALUE = 3;


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
    public static IngameShopType valueOf(int value) {
      return forNumber(value);
    }

    public static IngameShopType forNumber(int value) {
      switch (value) {
        case 0: return IngameShopTypeNULL;
        case 1: return IST_Normal_Shop;
        case 2: return IST_Joje_Shop;
        case 3: return IST_Instant_Shop;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IngameShopType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        IngameShopType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<IngameShopType>() {
            public IngameShopType findValueByNumber(int number) {
              return IngameShopType.forNumber(number);
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
      return com.felania.msldb.IngameShopTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final IngameShopType[] VALUES = values();

    public static IngameShopType valueOf(
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

    private IngameShopType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msggamedata.IngameShopType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024IngameShopType.proto\022\013msggamedata*f\n\016I" +
      "ngameShopType\022\026\n\022IngameShopTypeNULL\020\000\022\023\n" +
      "\017IST_Normal_Shop\020\001\022\021\n\rIST_Joje_Shop\020\002\022\024\n" +
      "\020IST_Instant_Shop\020\003B\023\n\021com.felania.msldb" +
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
