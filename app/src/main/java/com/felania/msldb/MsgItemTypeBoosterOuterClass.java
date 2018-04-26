// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgItemTypeBooster.proto

package com.felania.msldb;

public final class MsgItemTypeBoosterOuterClass {
  private MsgItemTypeBoosterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgItemTypeBoosterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgItemTypeBooster)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.BoosterType booster_type = 1;</code>
     */
    int getBoosterTypeValue();
    /**
     * <code>.msggamedata.BoosterType booster_type = 1;</code>
     */
    com.felania.msldb.BoosterTypeOuterClass.BoosterType getBoosterType();

    /**
     * <code>uint32 duration = 2;</code>
     */
    int getDuration();

    /**
     * <code>repeated float booster_values = 3;</code>
     */
    java.util.List<java.lang.Float> getBoosterValuesList();
    /**
     * <code>repeated float booster_values = 3;</code>
     */
    int getBoosterValuesCount();
    /**
     * <code>repeated float booster_values = 3;</code>
     */
    float getBoosterValues(int index);
  }
  /**
   * Protobuf type {@code msggamedata.MsgItemTypeBooster}
   */
  public  static final class MsgItemTypeBooster extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgItemTypeBooster)
      MsgItemTypeBoosterOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgItemTypeBooster.newBuilder() to construct.
    private MsgItemTypeBooster(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgItemTypeBooster() {
      boosterType_ = 0;
      duration_ = 0;
      boosterValues_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgItemTypeBooster(
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

              boosterType_ = rawValue;
              break;
            }
            case 16: {

              duration_ = input.readUInt32();
              break;
            }
            case 29: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                boosterValues_ = new java.util.ArrayList<java.lang.Float>();
                mutable_bitField0_ |= 0x00000004;
              }
              boosterValues_.add(input.readFloat());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
                boosterValues_ = new java.util.ArrayList<java.lang.Float>();
                mutable_bitField0_ |= 0x00000004;
              }
              while (input.getBytesUntilLimit() > 0) {
                boosterValues_.add(input.readFloat());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          boosterValues_ = java.util.Collections.unmodifiableList(boosterValues_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MsgItemTypeBoosterOuterClass.internal_static_msggamedata_MsgItemTypeBooster_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgItemTypeBoosterOuterClass.internal_static_msggamedata_MsgItemTypeBooster_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster.class, com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster.Builder.class);
    }

    private int bitField0_;
    public static final int BOOSTER_TYPE_FIELD_NUMBER = 1;
    private int boosterType_;
    /**
     * <code>.msggamedata.BoosterType booster_type = 1;</code>
     */
    public int getBoosterTypeValue() {
      return boosterType_;
    }
    /**
     * <code>.msggamedata.BoosterType booster_type = 1;</code>
     */
    public com.felania.msldb.BoosterTypeOuterClass.BoosterType getBoosterType() {
      com.felania.msldb.BoosterTypeOuterClass.BoosterType result = com.felania.msldb.BoosterTypeOuterClass.BoosterType.valueOf(boosterType_);
      return result == null ? com.felania.msldb.BoosterTypeOuterClass.BoosterType.UNRECOGNIZED : result;
    }

    public static final int DURATION_FIELD_NUMBER = 2;
    private int duration_;
    /**
     * <code>uint32 duration = 2;</code>
     */
    public int getDuration() {
      return duration_;
    }

    public static final int BOOSTER_VALUES_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Float> boosterValues_;
    /**
     * <code>repeated float booster_values = 3;</code>
     */
    public java.util.List<java.lang.Float>
        getBoosterValuesList() {
      return boosterValues_;
    }
    /**
     * <code>repeated float booster_values = 3;</code>
     */
    public int getBoosterValuesCount() {
      return boosterValues_.size();
    }
    /**
     * <code>repeated float booster_values = 3;</code>
     */
    public float getBoosterValues(int index) {
      return boosterValues_.get(index);
    }
    private int boosterValuesMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (boosterType_ != com.felania.msldb.BoosterTypeOuterClass.BoosterType.NO_BOOSTER.getNumber()) {
        output.writeEnum(1, boosterType_);
      }
      if (duration_ != 0) {
        output.writeUInt32(2, duration_);
      }
      if (getBoosterValuesList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(boosterValuesMemoizedSerializedSize);
      }
      for (int i = 0; i < boosterValues_.size(); i++) {
        output.writeFloatNoTag(boosterValues_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (boosterType_ != com.felania.msldb.BoosterTypeOuterClass.BoosterType.NO_BOOSTER.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, boosterType_);
      }
      if (duration_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, duration_);
      }
      {
        int dataSize = 0;
        dataSize = 4 * getBoosterValuesList().size();
        size += dataSize;
        if (!getBoosterValuesList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        boosterValuesMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster other = (com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster) obj;

      boolean result = true;
      result = result && boosterType_ == other.boosterType_;
      result = result && (getDuration()
          == other.getDuration());
      result = result && getBoosterValuesList()
          .equals(other.getBoosterValuesList());
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
      hash = (37 * hash) + BOOSTER_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + boosterType_;
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDuration();
      if (getBoosterValuesCount() > 0) {
        hash = (37 * hash) + BOOSTER_VALUES_FIELD_NUMBER;
        hash = (53 * hash) + getBoosterValuesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster prototype) {
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
     * Protobuf type {@code msggamedata.MsgItemTypeBooster}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgItemTypeBooster)
        com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBoosterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgItemTypeBoosterOuterClass.internal_static_msggamedata_MsgItemTypeBooster_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgItemTypeBoosterOuterClass.internal_static_msggamedata_MsgItemTypeBooster_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster.class, com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster.Builder.class);
      }

      // Construct using com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster.newBuilder()
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
        boosterType_ = 0;

        duration_ = 0;

        boosterValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgItemTypeBoosterOuterClass.internal_static_msggamedata_MsgItemTypeBooster_descriptor;
      }

      public com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster getDefaultInstanceForType() {
        return com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster.getDefaultInstance();
      }

      public com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster build() {
        com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster buildPartial() {
        com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster result = new com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.boosterType_ = boosterType_;
        result.duration_ = duration_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          boosterValues_ = java.util.Collections.unmodifiableList(boosterValues_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.boosterValues_ = boosterValues_;
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster) {
          return mergeFrom((com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster other) {
        if (other == com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster.getDefaultInstance()) return this;
        if (other.boosterType_ != 0) {
          setBoosterTypeValue(other.getBoosterTypeValue());
        }
        if (other.getDuration() != 0) {
          setDuration(other.getDuration());
        }
        if (!other.boosterValues_.isEmpty()) {
          if (boosterValues_.isEmpty()) {
            boosterValues_ = other.boosterValues_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureBoosterValuesIsMutable();
            boosterValues_.addAll(other.boosterValues_);
          }
          onChanged();
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
        com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int boosterType_ = 0;
      /**
       * <code>.msggamedata.BoosterType booster_type = 1;</code>
       */
      public int getBoosterTypeValue() {
        return boosterType_;
      }
      /**
       * <code>.msggamedata.BoosterType booster_type = 1;</code>
       */
      public Builder setBoosterTypeValue(int value) {
        boosterType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.BoosterType booster_type = 1;</code>
       */
      public com.felania.msldb.BoosterTypeOuterClass.BoosterType getBoosterType() {
        com.felania.msldb.BoosterTypeOuterClass.BoosterType result = com.felania.msldb.BoosterTypeOuterClass.BoosterType.valueOf(boosterType_);
        return result == null ? com.felania.msldb.BoosterTypeOuterClass.BoosterType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.BoosterType booster_type = 1;</code>
       */
      public Builder setBoosterType(com.felania.msldb.BoosterTypeOuterClass.BoosterType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        boosterType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.BoosterType booster_type = 1;</code>
       */
      public Builder clearBoosterType() {
        
        boosterType_ = 0;
        onChanged();
        return this;
      }

      private int duration_ ;
      /**
       * <code>uint32 duration = 2;</code>
       */
      public int getDuration() {
        return duration_;
      }
      /**
       * <code>uint32 duration = 2;</code>
       */
      public Builder setDuration(int value) {
        
        duration_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 duration = 2;</code>
       */
      public Builder clearDuration() {
        
        duration_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Float> boosterValues_ = java.util.Collections.emptyList();
      private void ensureBoosterValuesIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          boosterValues_ = new java.util.ArrayList<java.lang.Float>(boosterValues_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated float booster_values = 3;</code>
       */
      public java.util.List<java.lang.Float>
          getBoosterValuesList() {
        return java.util.Collections.unmodifiableList(boosterValues_);
      }
      /**
       * <code>repeated float booster_values = 3;</code>
       */
      public int getBoosterValuesCount() {
        return boosterValues_.size();
      }
      /**
       * <code>repeated float booster_values = 3;</code>
       */
      public float getBoosterValues(int index) {
        return boosterValues_.get(index);
      }
      /**
       * <code>repeated float booster_values = 3;</code>
       */
      public Builder setBoosterValues(
          int index, float value) {
        ensureBoosterValuesIsMutable();
        boosterValues_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float booster_values = 3;</code>
       */
      public Builder addBoosterValues(float value) {
        ensureBoosterValuesIsMutable();
        boosterValues_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float booster_values = 3;</code>
       */
      public Builder addAllBoosterValues(
          java.lang.Iterable<? extends java.lang.Float> values) {
        ensureBoosterValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, boosterValues_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float booster_values = 3;</code>
       */
      public Builder clearBoosterValues() {
        boosterValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgItemTypeBooster)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgItemTypeBooster)
    private static final com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster();
    }

    public static com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgItemTypeBooster>
        PARSER = new com.google.protobuf.AbstractParser<MsgItemTypeBooster>() {
      public MsgItemTypeBooster parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgItemTypeBooster(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgItemTypeBooster> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgItemTypeBooster> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgItemTypeBoosterOuterClass.MsgItemTypeBooster getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgItemTypeBooster_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgItemTypeBooster_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030MsgItemTypeBooster.proto\022\013msggamedata\032" +
      "\021BoosterType.proto\"n\n\022MsgItemTypeBooster" +
      "\022.\n\014booster_type\030\001 \001(\0162\030.msggamedata.Boo" +
      "sterType\022\020\n\010duration\030\002 \001(\r\022\026\n\016booster_va" +
      "lues\030\003 \003(\002B\023\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.BoosterTypeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgItemTypeBooster_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgItemTypeBooster_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgItemTypeBooster_descriptor,
        new java.lang.String[] { "BoosterType", "Duration", "BoosterValues", });
    com.felania.msldb.BoosterTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
