// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MonsterUpgradeSkillData.proto

package com.felania.msldb;

public final class MonsterUpgradeSkillDataOuterClass {
  private MonsterUpgradeSkillDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MonsterUpgradeSkillDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MonsterUpgradeSkillData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MonsterUpgradeSkillData.UpgradeSkillType upgrade_type = 1;</code>
     */
    int getUpgradeTypeValue();
    /**
     * <code>.msggamedata.MonsterUpgradeSkillData.UpgradeSkillType upgrade_type = 1;</code>
     */
    com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType getUpgradeType();

    /**
     * <code>float val = 2;</code>
     */
    float getVal();

    /**
     * <code>uint32 turn = 3;</code>
     */
    int getTurn();
  }
  /**
   * Protobuf type {@code msggamedata.MonsterUpgradeSkillData}
   */
  public  static final class MonsterUpgradeSkillData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MonsterUpgradeSkillData)
      MonsterUpgradeSkillDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MonsterUpgradeSkillData.newBuilder() to construct.
    private MonsterUpgradeSkillData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MonsterUpgradeSkillData() {
      upgradeType_ = 0;
      val_ = 0F;
      turn_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MonsterUpgradeSkillData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();

              upgradeType_ = rawValue;
              break;
            }
            case 21: {

              val_ = input.readFloat();
              break;
            }
            case 24: {

              turn_ = input.readUInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MonsterUpgradeSkillDataOuterClass.internal_static_msggamedata_MonsterUpgradeSkillData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MonsterUpgradeSkillDataOuterClass.internal_static_msggamedata_MonsterUpgradeSkillData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.class, com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.Builder.class);
    }

    /**
     * Protobuf enum {@code msggamedata.MonsterUpgradeSkillData.UpgradeSkillType}
     */
    public enum UpgradeSkillType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UpgradeSkillTypeNULL = 0;</code>
       */
      UpgradeSkillTypeNULL(0),
      /**
       * <code>SkillDamage = 1;</code>
       */
      SkillDamage(1),
      /**
       * <code>PassiveVal = 2;</code>
       */
      PassiveVal(2),
      /**
       * <code>PassiveProb = 3;</code>
       */
      PassiveProb(3),
      /**
       * <code>PassiveTurn = 4;</code>
       */
      PassiveTurn(4),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>UpgradeSkillTypeNULL = 0;</code>
       */
      public static final int UpgradeSkillTypeNULL_VALUE = 0;
      /**
       * <code>SkillDamage = 1;</code>
       */
      public static final int SkillDamage_VALUE = 1;
      /**
       * <code>PassiveVal = 2;</code>
       */
      public static final int PassiveVal_VALUE = 2;
      /**
       * <code>PassiveProb = 3;</code>
       */
      public static final int PassiveProb_VALUE = 3;
      /**
       * <code>PassiveTurn = 4;</code>
       */
      public static final int PassiveTurn_VALUE = 4;


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
      public static UpgradeSkillType valueOf(int value) {
        return forNumber(value);
      }

      public static UpgradeSkillType forNumber(int value) {
        switch (value) {
          case 0: return UpgradeSkillTypeNULL;
          case 1: return SkillDamage;
          case 2: return PassiveVal;
          case 3: return PassiveProb;
          case 4: return PassiveTurn;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<UpgradeSkillType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          UpgradeSkillType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<UpgradeSkillType>() {
              public UpgradeSkillType findValueByNumber(int number) {
                return UpgradeSkillType.forNumber(number);
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
        return com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.getDescriptor().getEnumTypes().get(0);
      }

      private static final UpgradeSkillType[] VALUES = values();

      public static UpgradeSkillType valueOf(
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

      private UpgradeSkillType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:msggamedata.MonsterUpgradeSkillData.UpgradeSkillType)
    }

    public static final int UPGRADE_TYPE_FIELD_NUMBER = 1;
    private int upgradeType_;
    /**
     * <code>.msggamedata.MonsterUpgradeSkillData.UpgradeSkillType upgrade_type = 1;</code>
     */
    public int getUpgradeTypeValue() {
      return upgradeType_;
    }
    /**
     * <code>.msggamedata.MonsterUpgradeSkillData.UpgradeSkillType upgrade_type = 1;</code>
     */
    public com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType getUpgradeType() {
      com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType result = com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType.valueOf(upgradeType_);
      return result == null ? com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType.UNRECOGNIZED : result;
    }

    public static final int VAL_FIELD_NUMBER = 2;
    private float val_;
    /**
     * <code>float val = 2;</code>
     */
    public float getVal() {
      return val_;
    }

    public static final int TURN_FIELD_NUMBER = 3;
    private int turn_;
    /**
     * <code>uint32 turn = 3;</code>
     */
    public int getTurn() {
      return turn_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (upgradeType_ != com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType.UpgradeSkillTypeNULL.getNumber()) {
        output.writeEnum(1, upgradeType_);
      }
      if (val_ != 0F) {
        output.writeFloat(2, val_);
      }
      if (turn_ != 0) {
        output.writeUInt32(3, turn_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (upgradeType_ != com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType.UpgradeSkillTypeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, upgradeType_);
      }
      if (val_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, val_);
      }
      if (turn_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, turn_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData)) {
        return super.equals(obj);
      }
      com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData other = (com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData) obj;

      boolean result = true;
      result = result && upgradeType_ == other.upgradeType_;
      result = result && (
          java.lang.Float.floatToIntBits(getVal())
          == java.lang.Float.floatToIntBits(
              other.getVal()));
      result = result && (getTurn()
          == other.getTurn());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + UPGRADE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + upgradeType_;
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getVal());
      hash = (37 * hash) + TURN_FIELD_NUMBER;
      hash = (53 * hash) + getTurn();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code msggamedata.MonsterUpgradeSkillData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MonsterUpgradeSkillData)
        com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MonsterUpgradeSkillDataOuterClass.internal_static_msggamedata_MonsterUpgradeSkillData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MonsterUpgradeSkillDataOuterClass.internal_static_msggamedata_MonsterUpgradeSkillData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.class, com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.Builder.class);
      }

      // Construct using com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        upgradeType_ = 0;

        val_ = 0F;

        turn_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MonsterUpgradeSkillDataOuterClass.internal_static_msggamedata_MonsterUpgradeSkillData_descriptor;
      }

      public com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData getDefaultInstanceForType() {
        return com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.getDefaultInstance();
      }

      public com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData build() {
        com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData buildPartial() {
        com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData result = new com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData(this);
        result.upgradeType_ = upgradeType_;
        result.val_ = val_;
        result.turn_ = turn_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData) {
          return mergeFrom((com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData other) {
        if (other == com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.getDefaultInstance()) return this;
        if (other.upgradeType_ != 0) {
          setUpgradeTypeValue(other.getUpgradeTypeValue());
        }
        if (other.getVal() != 0F) {
          setVal(other.getVal());
        }
        if (other.getTurn() != 0) {
          setTurn(other.getTurn());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int upgradeType_ = 0;
      /**
       * <code>.msggamedata.MonsterUpgradeSkillData.UpgradeSkillType upgrade_type = 1;</code>
       */
      public int getUpgradeTypeValue() {
        return upgradeType_;
      }
      /**
       * <code>.msggamedata.MonsterUpgradeSkillData.UpgradeSkillType upgrade_type = 1;</code>
       */
      public Builder setUpgradeTypeValue(int value) {
        upgradeType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterUpgradeSkillData.UpgradeSkillType upgrade_type = 1;</code>
       */
      public com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType getUpgradeType() {
        com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType result = com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType.valueOf(upgradeType_);
        return result == null ? com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MonsterUpgradeSkillData.UpgradeSkillType upgrade_type = 1;</code>
       */
      public Builder setUpgradeType(com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData.UpgradeSkillType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        upgradeType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterUpgradeSkillData.UpgradeSkillType upgrade_type = 1;</code>
       */
      public Builder clearUpgradeType() {
        
        upgradeType_ = 0;
        onChanged();
        return this;
      }

      private float val_ ;
      /**
       * <code>float val = 2;</code>
       */
      public float getVal() {
        return val_;
      }
      /**
       * <code>float val = 2;</code>
       */
      public Builder setVal(float value) {
        
        val_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float val = 2;</code>
       */
      public Builder clearVal() {
        
        val_ = 0F;
        onChanged();
        return this;
      }

      private int turn_ ;
      /**
       * <code>uint32 turn = 3;</code>
       */
      public int getTurn() {
        return turn_;
      }
      /**
       * <code>uint32 turn = 3;</code>
       */
      public Builder setTurn(int value) {
        
        turn_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 turn = 3;</code>
       */
      public Builder clearTurn() {
        
        turn_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MonsterUpgradeSkillData)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MonsterUpgradeSkillData)
    private static final com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData();
    }

    public static com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MonsterUpgradeSkillData>
        PARSER = new com.google.protobuf.AbstractParser<MonsterUpgradeSkillData>() {
      public MonsterUpgradeSkillData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MonsterUpgradeSkillData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MonsterUpgradeSkillData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MonsterUpgradeSkillData> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MonsterUpgradeSkillDataOuterClass.MonsterUpgradeSkillData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MonsterUpgradeSkillData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MonsterUpgradeSkillData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035MonsterUpgradeSkillData.proto\022\013msggame" +
      "data\"\362\001\n\027MonsterUpgradeSkillData\022K\n\014upgr" +
      "ade_type\030\001 \001(\01625.msggamedata.MonsterUpgr" +
      "adeSkillData.UpgradeSkillType\022\013\n\003val\030\002 \001" +
      "(\002\022\014\n\004turn\030\003 \001(\r\"o\n\020UpgradeSkillType\022\030\n\024" +
      "UpgradeSkillTypeNULL\020\000\022\017\n\013SkillDamage\020\001\022" +
      "\016\n\nPassiveVal\020\002\022\017\n\013PassiveProb\020\003\022\017\n\013Pass" +
      "iveTurn\020\004B\023\n\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_MonsterUpgradeSkillData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MonsterUpgradeSkillData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MonsterUpgradeSkillData_descriptor,
        new java.lang.String[] { "UpgradeType", "Val", "Turn", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
