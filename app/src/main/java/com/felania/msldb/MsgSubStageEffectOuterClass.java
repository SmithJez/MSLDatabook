// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgSubStageEffect.proto

package com.felania.msldb;

public final class MsgSubStageEffectOuterClass {
  private MsgSubStageEffectOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgSubStageEffectOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgSubStageEffect)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgSubStageEffect.DataType type = 1;</code>
     */
    int getTypeValue();
    /**
     * <code>.msggamedata.MsgSubStageEffect.DataType type = 1;</code>
     */
    com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.DataType getType();

    /**
     * <code>float inc_gold_prob = 2;</code>
     */
    float getIncGoldProb();

    /**
     * <code>float inc_drop_prob = 3;</code>
     */
    float getIncDropProb();
  }
  /**
   * Protobuf type {@code msggamedata.MsgSubStageEffect}
   */
  public  static final class MsgSubStageEffect extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgSubStageEffect)
      MsgSubStageEffectOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgSubStageEffect.newBuilder() to construct.
    private MsgSubStageEffect(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgSubStageEffect() {
      type_ = 0;
      incGoldProb_ = 0F;
      incDropProb_ = 0F;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgSubStageEffect(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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

              type_ = rawValue;
              break;
            }
            case 21: {

              incGoldProb_ = input.readFloat();
              break;
            }
            case 29: {

              incDropProb_ = input.readFloat();
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
      return com.felania.msldb.MsgSubStageEffectOuterClass.internal_static_msggamedata_MsgSubStageEffect_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgSubStageEffectOuterClass.internal_static_msggamedata_MsgSubStageEffect_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.class, com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.Builder.class);
    }

    /**
     * Protobuf enum {@code msggamedata.MsgSubStageEffect.DataType}
     */
    public enum DataType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>DataTypeNULL = 0;</code>
       */
      DataTypeNULL(0),
      /**
       * <code>Gold = 1;</code>
       */
      Gold(1),
      /**
       * <code>Drop = 2;</code>
       */
      Drop(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>DataTypeNULL = 0;</code>
       */
      public static final int DataTypeNULL_VALUE = 0;
      /**
       * <code>Gold = 1;</code>
       */
      public static final int Gold_VALUE = 1;
      /**
       * <code>Drop = 2;</code>
       */
      public static final int Drop_VALUE = 2;


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
      public static DataType valueOf(int value) {
        return forNumber(value);
      }

      public static DataType forNumber(int value) {
        switch (value) {
          case 0: return DataTypeNULL;
          case 1: return Gold;
          case 2: return Drop;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DataType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DataType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
              public DataType findValueByNumber(int number) {
                return DataType.forNumber(number);
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
        return com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.getDescriptor().getEnumTypes().get(0);
      }

      private static final DataType[] VALUES = values();

      public static DataType valueOf(
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

      private DataType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:msggamedata.MsgSubStageEffect.DataType)
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>.msggamedata.MsgSubStageEffect.DataType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.msggamedata.MsgSubStageEffect.DataType type = 1;</code>
     */
    public com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.DataType getType() {
      com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.DataType result = com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.DataType.valueOf(type_);
      return result == null ? com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.DataType.UNRECOGNIZED : result;
    }

    public static final int INC_GOLD_PROB_FIELD_NUMBER = 2;
    private float incGoldProb_;
    /**
     * <code>float inc_gold_prob = 2;</code>
     */
    public float getIncGoldProb() {
      return incGoldProb_;
    }

    public static final int INC_DROP_PROB_FIELD_NUMBER = 3;
    private float incDropProb_;
    /**
     * <code>float inc_drop_prob = 3;</code>
     */
    public float getIncDropProb() {
      return incDropProb_;
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
      if (type_ != com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.DataType.DataTypeNULL.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (incGoldProb_ != 0F) {
        output.writeFloat(2, incGoldProb_);
      }
      if (incDropProb_ != 0F) {
        output.writeFloat(3, incDropProb_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.DataType.DataTypeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (incGoldProb_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, incGoldProb_);
      }
      if (incDropProb_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, incDropProb_);
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
      if (!(obj instanceof com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect other = (com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect) obj;

      boolean result = true;
      result = result && type_ == other.type_;
      result = result && (
          java.lang.Float.floatToIntBits(getIncGoldProb())
          == java.lang.Float.floatToIntBits(
              other.getIncGoldProb()));
      result = result && (
          java.lang.Float.floatToIntBits(getIncDropProb())
          == java.lang.Float.floatToIntBits(
              other.getIncDropProb()));
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + INC_GOLD_PROB_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getIncGoldProb());
      hash = (37 * hash) + INC_DROP_PROB_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getIncDropProb());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect prototype) {
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
     * Protobuf type {@code msggamedata.MsgSubStageEffect}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgSubStageEffect)
        com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgSubStageEffectOuterClass.internal_static_msggamedata_MsgSubStageEffect_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgSubStageEffectOuterClass.internal_static_msggamedata_MsgSubStageEffect_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.class, com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.Builder.class);
      }

      // Construct using com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.newBuilder()
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
        type_ = 0;

        incGoldProb_ = 0F;

        incDropProb_ = 0F;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgSubStageEffectOuterClass.internal_static_msggamedata_MsgSubStageEffect_descriptor;
      }

      public com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect getDefaultInstanceForType() {
        return com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.getDefaultInstance();
      }

      public com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect build() {
        com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect buildPartial() {
        com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect result = new com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect(this);
        result.type_ = type_;
        result.incGoldProb_ = incGoldProb_;
        result.incDropProb_ = incDropProb_;
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
        if (other instanceof com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect) {
          return mergeFrom((com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect other) {
        if (other == com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.getIncGoldProb() != 0F) {
          setIncGoldProb(other.getIncGoldProb());
        }
        if (other.getIncDropProb() != 0F) {
          setIncDropProb(other.getIncDropProb());
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
        com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.msggamedata.MsgSubStageEffect.DataType type = 1;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.msggamedata.MsgSubStageEffect.DataType type = 1;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgSubStageEffect.DataType type = 1;</code>
       */
      public com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.DataType getType() {
        com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.DataType result = com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.DataType.valueOf(type_);
        return result == null ? com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.DataType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MsgSubStageEffect.DataType type = 1;</code>
       */
      public Builder setType(com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect.DataType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgSubStageEffect.DataType type = 1;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private float incGoldProb_ ;
      /**
       * <code>float inc_gold_prob = 2;</code>
       */
      public float getIncGoldProb() {
        return incGoldProb_;
      }
      /**
       * <code>float inc_gold_prob = 2;</code>
       */
      public Builder setIncGoldProb(float value) {
        
        incGoldProb_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float inc_gold_prob = 2;</code>
       */
      public Builder clearIncGoldProb() {
        
        incGoldProb_ = 0F;
        onChanged();
        return this;
      }

      private float incDropProb_ ;
      /**
       * <code>float inc_drop_prob = 3;</code>
       */
      public float getIncDropProb() {
        return incDropProb_;
      }
      /**
       * <code>float inc_drop_prob = 3;</code>
       */
      public Builder setIncDropProb(float value) {
        
        incDropProb_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float inc_drop_prob = 3;</code>
       */
      public Builder clearIncDropProb() {
        
        incDropProb_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgSubStageEffect)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgSubStageEffect)
    private static final com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect();
    }

    public static com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgSubStageEffect>
        PARSER = new com.google.protobuf.AbstractParser<MsgSubStageEffect>() {
      public MsgSubStageEffect parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MsgSubStageEffect(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgSubStageEffect> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgSubStageEffect> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgSubStageEffectOuterClass.MsgSubStageEffect getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgSubStageEffect_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgSubStageEffect_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027MsgSubStageEffect.proto\022\013msggamedata\"\252" +
      "\001\n\021MsgSubStageEffect\0225\n\004type\030\001 \001(\0162\'.msg" +
      "gamedata.MsgSubStageEffect.DataType\022\025\n\ri" +
      "nc_gold_prob\030\002 \001(\002\022\025\n\rinc_drop_prob\030\003 \001(" +
      "\002\"0\n\010DataType\022\020\n\014DataTypeNULL\020\000\022\010\n\004Gold\020" +
      "\001\022\010\n\004Drop\020\002B\023\n\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_MsgSubStageEffect_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgSubStageEffect_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgSubStageEffect_descriptor,
        new java.lang.String[] { "Type", "IncGoldProb", "IncDropProb", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
