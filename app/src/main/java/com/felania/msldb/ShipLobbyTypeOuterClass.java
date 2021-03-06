// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShipLobbyType.proto

package com.felania.msldb;

public final class ShipLobbyTypeOuterClass {
  private ShipLobbyTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code msggamedata.ShipLobbyType}
   */
  public enum ShipLobbyType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SLT_DEFAULT = 0;</code>
     */
    SLT_DEFAULT(0),
    /**
     * <code>SLT_SHIP_2 = 2;</code>
     */
    SLT_SHIP_2(2),
    /**
     * <code>SLT_SHIP_3 = 3;</code>
     */
    SLT_SHIP_3(3),
    /**
     * <code>SLT_MAX_COUNT = 4;</code>
     */
    SLT_MAX_COUNT(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SLT_DEFAULT = 0;</code>
     */
    public static final int SLT_DEFAULT_VALUE = 0;
    /**
     * <code>SLT_SHIP_2 = 2;</code>
     */
    public static final int SLT_SHIP_2_VALUE = 2;
    /**
     * <code>SLT_SHIP_3 = 3;</code>
     */
    public static final int SLT_SHIP_3_VALUE = 3;
    /**
     * <code>SLT_MAX_COUNT = 4;</code>
     */
    public static final int SLT_MAX_COUNT_VALUE = 4;


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
    public static ShipLobbyType valueOf(int value) {
      return forNumber(value);
    }

    public static ShipLobbyType forNumber(int value) {
      switch (value) {
        case 0: return SLT_DEFAULT;
        case 2: return SLT_SHIP_2;
        case 3: return SLT_SHIP_3;
        case 4: return SLT_MAX_COUNT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ShipLobbyType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ShipLobbyType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ShipLobbyType>() {
            public ShipLobbyType findValueByNumber(int number) {
              return ShipLobbyType.forNumber(number);
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
      return com.felania.msldb.ShipLobbyTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ShipLobbyType[] VALUES = values();

    public static ShipLobbyType valueOf(
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

    private ShipLobbyType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msggamedata.ShipLobbyType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ShipLobbyType.proto\022\013msggamedata*S\n\rSh" +
      "ipLobbyType\022\017\n\013SLT_DEFAULT\020\000\022\016\n\nSLT_SHIP" +
      "_2\020\002\022\016\n\nSLT_SHIP_3\020\003\022\021\n\rSLT_MAX_COUNT\020\004B" +
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
