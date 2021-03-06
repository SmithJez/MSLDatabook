// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgShopItemMetaBullet.proto

package com.felania.msldb;

public final class MsgShopItemMetaBulletOuterClass {
  private MsgShopItemMetaBulletOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgShopItemMetaBulletOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgShopItemMetaBullet)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 max_lev = 1;</code>
     */
    int getMaxLev();

    /**
     * <code>repeated float lev_values = 2;</code>
     */
    java.util.List<java.lang.Float> getLevValuesList();
    /**
     * <code>repeated float lev_values = 2;</code>
     */
    int getLevValuesCount();
    /**
     * <code>repeated float lev_values = 2;</code>
     */
    float getLevValues(int index);

    /**
     * <code>float price_inc = 3;</code>
     */
    float getPriceInc();

    /**
     * <code>fixed32 stage_uid = 4;</code>
     */
    int getStageUid();
  }
  /**
   * Protobuf type {@code msggamedata.MsgShopItemMetaBullet}
   */
  public  static final class MsgShopItemMetaBullet extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgShopItemMetaBullet)
      MsgShopItemMetaBulletOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgShopItemMetaBullet.newBuilder() to construct.
    private MsgShopItemMetaBullet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgShopItemMetaBullet() {
      maxLev_ = 0;
      levValues_ = java.util.Collections.emptyList();
      priceInc_ = 0F;
      stageUid_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgShopItemMetaBullet(
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

              maxLev_ = input.readUInt32();
              break;
            }
            case 21: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                levValues_ = new java.util.ArrayList<java.lang.Float>();
                mutable_bitField0_ |= 0x00000002;
              }
              levValues_.add(input.readFloat());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                levValues_ = new java.util.ArrayList<java.lang.Float>();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                levValues_.add(input.readFloat());
              }
              input.popLimit(limit);
              break;
            }
            case 29: {

              priceInc_ = input.readFloat();
              break;
            }
            case 37: {

              stageUid_ = input.readFixed32();
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          levValues_ = java.util.Collections.unmodifiableList(levValues_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MsgShopItemMetaBulletOuterClass.internal_static_msggamedata_MsgShopItemMetaBullet_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgShopItemMetaBulletOuterClass.internal_static_msggamedata_MsgShopItemMetaBullet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet.class, com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet.Builder.class);
    }

    private int bitField0_;
    public static final int MAX_LEV_FIELD_NUMBER = 1;
    private int maxLev_;
    /**
     * <code>uint32 max_lev = 1;</code>
     */
    public int getMaxLev() {
      return maxLev_;
    }

    public static final int LEV_VALUES_FIELD_NUMBER = 2;
    private java.util.List<java.lang.Float> levValues_;
    /**
     * <code>repeated float lev_values = 2;</code>
     */
    public java.util.List<java.lang.Float>
        getLevValuesList() {
      return levValues_;
    }
    /**
     * <code>repeated float lev_values = 2;</code>
     */
    public int getLevValuesCount() {
      return levValues_.size();
    }
    /**
     * <code>repeated float lev_values = 2;</code>
     */
    public float getLevValues(int index) {
      return levValues_.get(index);
    }
    private int levValuesMemoizedSerializedSize = -1;

    public static final int PRICE_INC_FIELD_NUMBER = 3;
    private float priceInc_;
    /**
     * <code>float price_inc = 3;</code>
     */
    public float getPriceInc() {
      return priceInc_;
    }

    public static final int STAGE_UID_FIELD_NUMBER = 4;
    private int stageUid_;
    /**
     * <code>fixed32 stage_uid = 4;</code>
     */
    public int getStageUid() {
      return stageUid_;
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
      getSerializedSize();
      if (maxLev_ != 0) {
        output.writeUInt32(1, maxLev_);
      }
      if (getLevValuesList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(levValuesMemoizedSerializedSize);
      }
      for (int i = 0; i < levValues_.size(); i++) {
        output.writeFloatNoTag(levValues_.get(i));
      }
      if (priceInc_ != 0F) {
        output.writeFloat(3, priceInc_);
      }
      if (stageUid_ != 0) {
        output.writeFixed32(4, stageUid_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (maxLev_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, maxLev_);
      }
      {
        int dataSize = 0;
        dataSize = 4 * getLevValuesList().size();
        size += dataSize;
        if (!getLevValuesList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        levValuesMemoizedSerializedSize = dataSize;
      }
      if (priceInc_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, priceInc_);
      }
      if (stageUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(4, stageUid_);
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
      if (!(obj instanceof com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet other = (com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet) obj;

      boolean result = true;
      result = result && (getMaxLev()
          == other.getMaxLev());
      result = result && getLevValuesList()
          .equals(other.getLevValuesList());
      result = result && (
          java.lang.Float.floatToIntBits(getPriceInc())
          == java.lang.Float.floatToIntBits(
              other.getPriceInc()));
      result = result && (getStageUid()
          == other.getStageUid());
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
      hash = (37 * hash) + MAX_LEV_FIELD_NUMBER;
      hash = (53 * hash) + getMaxLev();
      if (getLevValuesCount() > 0) {
        hash = (37 * hash) + LEV_VALUES_FIELD_NUMBER;
        hash = (53 * hash) + getLevValuesList().hashCode();
      }
      hash = (37 * hash) + PRICE_INC_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getPriceInc());
      hash = (37 * hash) + STAGE_UID_FIELD_NUMBER;
      hash = (53 * hash) + getStageUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet prototype) {
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
     * Protobuf type {@code msggamedata.MsgShopItemMetaBullet}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgShopItemMetaBullet)
        com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBulletOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgShopItemMetaBulletOuterClass.internal_static_msggamedata_MsgShopItemMetaBullet_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgShopItemMetaBulletOuterClass.internal_static_msggamedata_MsgShopItemMetaBullet_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet.class, com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet.Builder.class);
      }

      // Construct using com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet.newBuilder()
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
        maxLev_ = 0;

        levValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        priceInc_ = 0F;

        stageUid_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgShopItemMetaBulletOuterClass.internal_static_msggamedata_MsgShopItemMetaBullet_descriptor;
      }

      public com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet getDefaultInstanceForType() {
        return com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet.getDefaultInstance();
      }

      public com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet build() {
        com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet buildPartial() {
        com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet result = new com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.maxLev_ = maxLev_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          levValues_ = java.util.Collections.unmodifiableList(levValues_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.levValues_ = levValues_;
        result.priceInc_ = priceInc_;
        result.stageUid_ = stageUid_;
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
        if (other instanceof com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet) {
          return mergeFrom((com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet other) {
        if (other == com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet.getDefaultInstance()) return this;
        if (other.getMaxLev() != 0) {
          setMaxLev(other.getMaxLev());
        }
        if (!other.levValues_.isEmpty()) {
          if (levValues_.isEmpty()) {
            levValues_ = other.levValues_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureLevValuesIsMutable();
            levValues_.addAll(other.levValues_);
          }
          onChanged();
        }
        if (other.getPriceInc() != 0F) {
          setPriceInc(other.getPriceInc());
        }
        if (other.getStageUid() != 0) {
          setStageUid(other.getStageUid());
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
        com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int maxLev_ ;
      /**
       * <code>uint32 max_lev = 1;</code>
       */
      public int getMaxLev() {
        return maxLev_;
      }
      /**
       * <code>uint32 max_lev = 1;</code>
       */
      public Builder setMaxLev(int value) {
        
        maxLev_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_lev = 1;</code>
       */
      public Builder clearMaxLev() {
        
        maxLev_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Float> levValues_ = java.util.Collections.emptyList();
      private void ensureLevValuesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          levValues_ = new java.util.ArrayList<java.lang.Float>(levValues_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated float lev_values = 2;</code>
       */
      public java.util.List<java.lang.Float>
          getLevValuesList() {
        return java.util.Collections.unmodifiableList(levValues_);
      }
      /**
       * <code>repeated float lev_values = 2;</code>
       */
      public int getLevValuesCount() {
        return levValues_.size();
      }
      /**
       * <code>repeated float lev_values = 2;</code>
       */
      public float getLevValues(int index) {
        return levValues_.get(index);
      }
      /**
       * <code>repeated float lev_values = 2;</code>
       */
      public Builder setLevValues(
          int index, float value) {
        ensureLevValuesIsMutable();
        levValues_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float lev_values = 2;</code>
       */
      public Builder addLevValues(float value) {
        ensureLevValuesIsMutable();
        levValues_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float lev_values = 2;</code>
       */
      public Builder addAllLevValues(
          java.lang.Iterable<? extends java.lang.Float> values) {
        ensureLevValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, levValues_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float lev_values = 2;</code>
       */
      public Builder clearLevValues() {
        levValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private float priceInc_ ;
      /**
       * <code>float price_inc = 3;</code>
       */
      public float getPriceInc() {
        return priceInc_;
      }
      /**
       * <code>float price_inc = 3;</code>
       */
      public Builder setPriceInc(float value) {
        
        priceInc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float price_inc = 3;</code>
       */
      public Builder clearPriceInc() {
        
        priceInc_ = 0F;
        onChanged();
        return this;
      }

      private int stageUid_ ;
      /**
       * <code>fixed32 stage_uid = 4;</code>
       */
      public int getStageUid() {
        return stageUid_;
      }
      /**
       * <code>fixed32 stage_uid = 4;</code>
       */
      public Builder setStageUid(int value) {
        
        stageUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 stage_uid = 4;</code>
       */
      public Builder clearStageUid() {
        
        stageUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgShopItemMetaBullet)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgShopItemMetaBullet)
    private static final com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet();
    }

    public static com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgShopItemMetaBullet>
        PARSER = new com.google.protobuf.AbstractParser<MsgShopItemMetaBullet>() {
      public MsgShopItemMetaBullet parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgShopItemMetaBullet(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgShopItemMetaBullet> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgShopItemMetaBullet> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgShopItemMetaBulletOuterClass.MsgShopItemMetaBullet getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgShopItemMetaBullet_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgShopItemMetaBullet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033MsgShopItemMetaBullet.proto\022\013msggameda" +
      "ta\"b\n\025MsgShopItemMetaBullet\022\017\n\007max_lev\030\001" +
      " \001(\r\022\022\n\nlev_values\030\002 \003(\002\022\021\n\tprice_inc\030\003 " +
      "\001(\002\022\021\n\tstage_uid\030\004 \001(\007B\023\n\021com.felania.ms" +
      "ldbb\006proto3"
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
    internal_static_msggamedata_MsgShopItemMetaBullet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgShopItemMetaBullet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgShopItemMetaBullet_descriptor,
        new java.lang.String[] { "MaxLev", "LevValues", "PriceInc", "StageUid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
