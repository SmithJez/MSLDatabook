// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeClanMemberGradeType.proto

package com.felania.msldb;

public final class ChangeClanMemberGradeTypeOuterClass {
  private ChangeClanMemberGradeTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code msggamedata.ChangeClanMemberGradeType}
   */
  public enum ChangeClanMemberGradeType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ChangeClanMemberGradeTypeNULL = 0;</code>
     */
    ChangeClanMemberGradeTypeNULL(0),
    /**
     * <code>Promote = 1;</code>
     */
    Promote(1),
    /**
     * <code>Demote = 2;</code>
     */
    Demote(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ChangeClanMemberGradeTypeNULL = 0;</code>
     */
    public static final int ChangeClanMemberGradeTypeNULL_VALUE = 0;
    /**
     * <code>Promote = 1;</code>
     */
    public static final int Promote_VALUE = 1;
    /**
     * <code>Demote = 2;</code>
     */
    public static final int Demote_VALUE = 2;


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
    public static ChangeClanMemberGradeType valueOf(int value) {
      return forNumber(value);
    }

    public static ChangeClanMemberGradeType forNumber(int value) {
      switch (value) {
        case 0: return ChangeClanMemberGradeTypeNULL;
        case 1: return Promote;
        case 2: return Demote;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ChangeClanMemberGradeType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ChangeClanMemberGradeType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ChangeClanMemberGradeType>() {
            public ChangeClanMemberGradeType findValueByNumber(int number) {
              return ChangeClanMemberGradeType.forNumber(number);
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
      return com.felania.msldb.ChangeClanMemberGradeTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ChangeClanMemberGradeType[] VALUES = values();

    public static ChangeClanMemberGradeType valueOf(
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

    private ChangeClanMemberGradeType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msggamedata.ChangeClanMemberGradeType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ChangeClanMemberGradeType.proto\022\013msgga" +
      "medata*W\n\031ChangeClanMemberGradeType\022!\n\035C" +
      "hangeClanMemberGradeTypeNULL\020\000\022\013\n\007Promot" +
      "e\020\001\022\n\n\006Demote\020\002B\023\n\021com.felania.msldbb\006pr" +
      "oto3"
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
