// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MonsterEvolution.proto

package com.felania.msldb;

public final class MonsterEvolutionOuterClass {
  private MonsterEvolutionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code msggamedata.MonsterEvolution}
   */
  public enum MonsterEvolution
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MonsterEvolutionNULL = 0;</code>
     */
    MonsterEvolutionNULL(0),
    /**
     * <code>ME_1 = 1;</code>
     */
    ME_1(1),
    /**
     * <code>ME_2 = 2;</code>
     */
    ME_2(2),
    /**
     * <code>ME_3 = 3;</code>
     */
    ME_3(3),
    /**
     * <code>ME_4 = 4;</code>
     */
    ME_4(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MonsterEvolutionNULL = 0;</code>
     */
    public static final int MonsterEvolutionNULL_VALUE = 0;
    /**
     * <code>ME_1 = 1;</code>
     */
    public static final int ME_1_VALUE = 1;
    /**
     * <code>ME_2 = 2;</code>
     */
    public static final int ME_2_VALUE = 2;
    /**
     * <code>ME_3 = 3;</code>
     */
    public static final int ME_3_VALUE = 3;
    /**
     * <code>ME_4 = 4;</code>
     */
    public static final int ME_4_VALUE = 4;


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
    public static MonsterEvolution valueOf(int value) {
      return forNumber(value);
    }

    public static MonsterEvolution forNumber(int value) {
      switch (value) {
        case 0: return MonsterEvolutionNULL;
        case 1: return ME_1;
        case 2: return ME_2;
        case 3: return ME_3;
        case 4: return ME_4;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MonsterEvolution>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MonsterEvolution> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MonsterEvolution>() {
            public MonsterEvolution findValueByNumber(int number) {
              return MonsterEvolution.forNumber(number);
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
      return com.felania.msldb.MonsterEvolutionOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MonsterEvolution[] VALUES = values();

    public static MonsterEvolution valueOf(
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

    private MonsterEvolution(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msggamedata.MonsterEvolution)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026MonsterEvolution.proto\022\013msggamedata*T\n" +
      "\020MonsterEvolution\022\030\n\024MonsterEvolutionNUL" +
      "L\020\000\022\010\n\004ME_1\020\001\022\010\n\004ME_2\020\002\022\010\n\004ME_3\020\003\022\010\n\004ME_" +
      "4\020\004B\023\n\021com.felania.msldbb\006proto3"
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
