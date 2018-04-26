// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgRuneOptionalEffect.proto

package com.felania.msldb;

public final class MsgRuneOptionalEffectOuterClass {
  private MsgRuneOptionalEffectOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgRuneOptionalEffectOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgRuneOptionalEffect)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>uint32 rare = 2;</code>
     */
    int getRare();

    /**
     * <code>fixed32 name = 3;</code>
     */
    int getName();

    /**
     * <code>.msggamedata.RuneEffectType type = 4;</code>
     */
    int getTypeValue();
    /**
     * <code>.msggamedata.RuneEffectType type = 4;</code>
     */
    com.felania.msldb.RuneEffectTypeOuterClass.RuneEffectType getType();

    /**
     * <code>.msggamedata.MonsterElementType element = 5;</code>
     */
    int getElementValue();
    /**
     * <code>.msggamedata.MonsterElementType element = 5;</code>
     */
    com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType getElement();

    /**
     * <code>float prob = 6;</code>
     */
    float getProb();

    /**
     * <code>float v_float = 7;</code>
     */
    float getVFloat();

    /**
     * <code>uint32 v_int = 8;</code>
     */
    int getVInt();
  }
  /**
   * Protobuf type {@code msggamedata.MsgRuneOptionalEffect}
   */
  public  static final class MsgRuneOptionalEffect extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgRuneOptionalEffect)
      MsgRuneOptionalEffectOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgRuneOptionalEffect.newBuilder() to construct.
    private MsgRuneOptionalEffect(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgRuneOptionalEffect() {
      uid_ = 0;
      rare_ = 0;
      name_ = 0;
      type_ = 0;
      element_ = 0;
      prob_ = 0F;
      vFloat_ = 0F;
      vInt_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgRuneOptionalEffect(
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
            case 13: {

              uid_ = input.readFixed32();
              break;
            }
            case 16: {

              rare_ = input.readUInt32();
              break;
            }
            case 29: {

              name_ = input.readFixed32();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 40: {
              int rawValue = input.readEnum();

              element_ = rawValue;
              break;
            }
            case 53: {

              prob_ = input.readFloat();
              break;
            }
            case 61: {

              vFloat_ = input.readFloat();
              break;
            }
            case 64: {

              vInt_ = input.readUInt32();
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
      return com.felania.msldb.MsgRuneOptionalEffectOuterClass.internal_static_msggamedata_MsgRuneOptionalEffect_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgRuneOptionalEffectOuterClass.internal_static_msggamedata_MsgRuneOptionalEffect_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect.class, com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>fixed32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int RARE_FIELD_NUMBER = 2;
    private int rare_;
    /**
     * <code>uint32 rare = 2;</code>
     */
    public int getRare() {
      return rare_;
    }

    public static final int NAME_FIELD_NUMBER = 3;
    private int name_;
    /**
     * <code>fixed32 name = 3;</code>
     */
    public int getName() {
      return name_;
    }

    public static final int TYPE_FIELD_NUMBER = 4;
    private int type_;
    /**
     * <code>.msggamedata.RuneEffectType type = 4;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.msggamedata.RuneEffectType type = 4;</code>
     */
    public com.felania.msldb.RuneEffectTypeOuterClass.RuneEffectType getType() {
      com.felania.msldb.RuneEffectTypeOuterClass.RuneEffectType result = com.felania.msldb.RuneEffectTypeOuterClass.RuneEffectType.valueOf(type_);
      return result == null ? com.felania.msldb.RuneEffectTypeOuterClass.RuneEffectType.UNRECOGNIZED : result;
    }

    public static final int ELEMENT_FIELD_NUMBER = 5;
    private int element_;
    /**
     * <code>.msggamedata.MonsterElementType element = 5;</code>
     */
    public int getElementValue() {
      return element_;
    }
    /**
     * <code>.msggamedata.MonsterElementType element = 5;</code>
     */
    public com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType getElement() {
      com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType result = com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType.valueOf(element_);
      return result == null ? com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType.UNRECOGNIZED : result;
    }

    public static final int PROB_FIELD_NUMBER = 6;
    private float prob_;
    /**
     * <code>float prob = 6;</code>
     */
    public float getProb() {
      return prob_;
    }

    public static final int V_FLOAT_FIELD_NUMBER = 7;
    private float vFloat_;
    /**
     * <code>float v_float = 7;</code>
     */
    public float getVFloat() {
      return vFloat_;
    }

    public static final int V_INT_FIELD_NUMBER = 8;
    private int vInt_;
    /**
     * <code>uint32 v_int = 8;</code>
     */
    public int getVInt() {
      return vInt_;
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
      if (uid_ != 0) {
        output.writeFixed32(1, uid_);
      }
      if (rare_ != 0) {
        output.writeUInt32(2, rare_);
      }
      if (name_ != 0) {
        output.writeFixed32(3, name_);
      }
      if (type_ != com.felania.msldb.RuneEffectTypeOuterClass.RuneEffectType.RET_None.getNumber()) {
        output.writeEnum(4, type_);
      }
      if (element_ != com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType.MonsterElementTypeNULL.getNumber()) {
        output.writeEnum(5, element_);
      }
      if (prob_ != 0F) {
        output.writeFloat(6, prob_);
      }
      if (vFloat_ != 0F) {
        output.writeFloat(7, vFloat_);
      }
      if (vInt_ != 0) {
        output.writeUInt32(8, vInt_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, uid_);
      }
      if (rare_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, rare_);
      }
      if (name_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(3, name_);
      }
      if (type_ != com.felania.msldb.RuneEffectTypeOuterClass.RuneEffectType.RET_None.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, type_);
      }
      if (element_ != com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType.MonsterElementTypeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, element_);
      }
      if (prob_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(6, prob_);
      }
      if (vFloat_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(7, vFloat_);
      }
      if (vInt_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, vInt_);
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
      if (!(obj instanceof com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect other = (com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect) obj;

      boolean result = true;
      result = result && (getUid()
          == other.getUid());
      result = result && (getRare()
          == other.getRare());
      result = result && (getName()
          == other.getName());
      result = result && type_ == other.type_;
      result = result && element_ == other.element_;
      result = result && (
          java.lang.Float.floatToIntBits(getProb())
          == java.lang.Float.floatToIntBits(
              other.getProb()));
      result = result && (
          java.lang.Float.floatToIntBits(getVFloat())
          == java.lang.Float.floatToIntBits(
              other.getVFloat()));
      result = result && (getVInt()
          == other.getVInt());
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + RARE_FIELD_NUMBER;
      hash = (53 * hash) + getRare();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + ELEMENT_FIELD_NUMBER;
      hash = (53 * hash) + element_;
      hash = (37 * hash) + PROB_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getProb());
      hash = (37 * hash) + V_FLOAT_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getVFloat());
      hash = (37 * hash) + V_INT_FIELD_NUMBER;
      hash = (53 * hash) + getVInt();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect prototype) {
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
     * Protobuf type {@code msggamedata.MsgRuneOptionalEffect}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgRuneOptionalEffect)
        com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgRuneOptionalEffectOuterClass.internal_static_msggamedata_MsgRuneOptionalEffect_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgRuneOptionalEffectOuterClass.internal_static_msggamedata_MsgRuneOptionalEffect_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect.class, com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect.Builder.class);
      }

      // Construct using com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect.newBuilder()
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
        uid_ = 0;

        rare_ = 0;

        name_ = 0;

        type_ = 0;

        element_ = 0;

        prob_ = 0F;

        vFloat_ = 0F;

        vInt_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgRuneOptionalEffectOuterClass.internal_static_msggamedata_MsgRuneOptionalEffect_descriptor;
      }

      public com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect getDefaultInstanceForType() {
        return com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect.getDefaultInstance();
      }

      public com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect build() {
        com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect buildPartial() {
        com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect result = new com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect(this);
        result.uid_ = uid_;
        result.rare_ = rare_;
        result.name_ = name_;
        result.type_ = type_;
        result.element_ = element_;
        result.prob_ = prob_;
        result.vFloat_ = vFloat_;
        result.vInt_ = vInt_;
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
        if (other instanceof com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect) {
          return mergeFrom((com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect other) {
        if (other == com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getRare() != 0) {
          setRare(other.getRare());
        }
        if (other.getName() != 0) {
          setName(other.getName());
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.element_ != 0) {
          setElementValue(other.getElementValue());
        }
        if (other.getProb() != 0F) {
          setProb(other.getProb());
        }
        if (other.getVFloat() != 0F) {
          setVFloat(other.getVFloat());
        }
        if (other.getVInt() != 0) {
          setVInt(other.getVInt());
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
        com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int uid_ ;
      /**
       * <code>fixed32 uid = 1;</code>
       */
      public int getUid() {
        return uid_;
      }
      /**
       * <code>fixed32 uid = 1;</code>
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 uid = 1;</code>
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int rare_ ;
      /**
       * <code>uint32 rare = 2;</code>
       */
      public int getRare() {
        return rare_;
      }
      /**
       * <code>uint32 rare = 2;</code>
       */
      public Builder setRare(int value) {
        
        rare_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rare = 2;</code>
       */
      public Builder clearRare() {
        
        rare_ = 0;
        onChanged();
        return this;
      }

      private int name_ ;
      /**
       * <code>fixed32 name = 3;</code>
       */
      public int getName() {
        return name_;
      }
      /**
       * <code>fixed32 name = 3;</code>
       */
      public Builder setName(int value) {
        
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 name = 3;</code>
       */
      public Builder clearName() {
        
        name_ = 0;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.msggamedata.RuneEffectType type = 4;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.msggamedata.RuneEffectType type = 4;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.RuneEffectType type = 4;</code>
       */
      public com.felania.msldb.RuneEffectTypeOuterClass.RuneEffectType getType() {
        com.felania.msldb.RuneEffectTypeOuterClass.RuneEffectType result = com.felania.msldb.RuneEffectTypeOuterClass.RuneEffectType.valueOf(type_);
        return result == null ? com.felania.msldb.RuneEffectTypeOuterClass.RuneEffectType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.RuneEffectType type = 4;</code>
       */
      public Builder setType(com.felania.msldb.RuneEffectTypeOuterClass.RuneEffectType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.RuneEffectType type = 4;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private int element_ = 0;
      /**
       * <code>.msggamedata.MonsterElementType element = 5;</code>
       */
      public int getElementValue() {
        return element_;
      }
      /**
       * <code>.msggamedata.MonsterElementType element = 5;</code>
       */
      public Builder setElementValue(int value) {
        element_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterElementType element = 5;</code>
       */
      public com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType getElement() {
        com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType result = com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType.valueOf(element_);
        return result == null ? com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MonsterElementType element = 5;</code>
       */
      public Builder setElement(com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        element_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterElementType element = 5;</code>
       */
      public Builder clearElement() {
        
        element_ = 0;
        onChanged();
        return this;
      }

      private float prob_ ;
      /**
       * <code>float prob = 6;</code>
       */
      public float getProb() {
        return prob_;
      }
      /**
       * <code>float prob = 6;</code>
       */
      public Builder setProb(float value) {
        
        prob_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float prob = 6;</code>
       */
      public Builder clearProb() {
        
        prob_ = 0F;
        onChanged();
        return this;
      }

      private float vFloat_ ;
      /**
       * <code>float v_float = 7;</code>
       */
      public float getVFloat() {
        return vFloat_;
      }
      /**
       * <code>float v_float = 7;</code>
       */
      public Builder setVFloat(float value) {
        
        vFloat_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float v_float = 7;</code>
       */
      public Builder clearVFloat() {
        
        vFloat_ = 0F;
        onChanged();
        return this;
      }

      private int vInt_ ;
      /**
       * <code>uint32 v_int = 8;</code>
       */
      public int getVInt() {
        return vInt_;
      }
      /**
       * <code>uint32 v_int = 8;</code>
       */
      public Builder setVInt(int value) {
        
        vInt_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 v_int = 8;</code>
       */
      public Builder clearVInt() {
        
        vInt_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgRuneOptionalEffect)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgRuneOptionalEffect)
    private static final com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect();
    }

    public static com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgRuneOptionalEffect>
        PARSER = new com.google.protobuf.AbstractParser<MsgRuneOptionalEffect>() {
      public MsgRuneOptionalEffect parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgRuneOptionalEffect(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgRuneOptionalEffect> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgRuneOptionalEffect> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgRuneOptionalEffectOuterClass.MsgRuneOptionalEffect getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgRuneOptionalEffect_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgRuneOptionalEffect_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033MsgRuneOptionalEffect.proto\022\013msggameda" +
      "ta\032\024RuneEffectType.proto\032\030MonsterElement" +
      "Type.proto\"\313\001\n\025MsgRuneOptionalEffect\022\013\n\003" +
      "uid\030\001 \001(\007\022\014\n\004rare\030\002 \001(\r\022\014\n\004name\030\003 \001(\007\022)\n" +
      "\004type\030\004 \001(\0162\033.msggamedata.RuneEffectType" +
      "\0220\n\007element\030\005 \001(\0162\037.msggamedata.MonsterE" +
      "lementType\022\014\n\004prob\030\006 \001(\002\022\017\n\007v_float\030\007 \001(" +
      "\002\022\r\n\005v_int\030\010 \001(\rB\023\n\021com.felania.msldbb\006p" +
      "roto3"
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
          com.felania.msldb.RuneEffectTypeOuterClass.getDescriptor(),
          com.felania.msldb.MonsterElementTypeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgRuneOptionalEffect_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgRuneOptionalEffect_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgRuneOptionalEffect_descriptor,
        new java.lang.String[] { "Uid", "Rare", "Name", "Type", "Element", "Prob", "VFloat", "VInt", });
    com.felania.msldb.RuneEffectTypeOuterClass.getDescriptor();
    com.felania.msldb.MonsterElementTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
