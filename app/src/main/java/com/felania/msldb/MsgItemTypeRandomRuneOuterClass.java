// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgItemTypeRandomRune.proto

package com.felania.msldb;

public final class MsgItemTypeRandomRuneOuterClass {
  private MsgItemTypeRandomRuneOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgItemTypeRandomRuneOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgItemTypeRandomRune)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 rare = 1;</code>
     */
    int getRare();

    /**
     * <code>repeated float rare_prob = 2;</code>
     */
    java.util.List<java.lang.Float> getRareProbList();
    /**
     * <code>repeated float rare_prob = 2;</code>
     */
    int getRareProbCount();
    /**
     * <code>repeated float rare_prob = 2;</code>
     */
    float getRareProb(int index);

    /**
     * <code>repeated float born_optional_effect_prob = 3;</code>
     */
    java.util.List<java.lang.Float> getBornOptionalEffectProbList();
    /**
     * <code>repeated float born_optional_effect_prob = 3;</code>
     */
    int getBornOptionalEffectProbCount();
    /**
     * <code>repeated float born_optional_effect_prob = 3;</code>
     */
    float getBornOptionalEffectProb(int index);
  }
  /**
   * Protobuf type {@code msggamedata.MsgItemTypeRandomRune}
   */
  public  static final class MsgItemTypeRandomRune extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgItemTypeRandomRune)
      MsgItemTypeRandomRuneOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgItemTypeRandomRune.newBuilder() to construct.
    private MsgItemTypeRandomRune(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgItemTypeRandomRune() {
      rare_ = 0;
      rareProb_ = java.util.Collections.emptyList();
      bornOptionalEffectProb_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgItemTypeRandomRune(
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

              rare_ = input.readUInt32();
              break;
            }
            case 21: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                rareProb_ = new java.util.ArrayList<java.lang.Float>();
                mutable_bitField0_ |= 0x00000002;
              }
              rareProb_.add(input.readFloat());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                rareProb_ = new java.util.ArrayList<java.lang.Float>();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                rareProb_.add(input.readFloat());
              }
              input.popLimit(limit);
              break;
            }
            case 29: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                bornOptionalEffectProb_ = new java.util.ArrayList<java.lang.Float>();
                mutable_bitField0_ |= 0x00000004;
              }
              bornOptionalEffectProb_.add(input.readFloat());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
                bornOptionalEffectProb_ = new java.util.ArrayList<java.lang.Float>();
                mutable_bitField0_ |= 0x00000004;
              }
              while (input.getBytesUntilLimit() > 0) {
                bornOptionalEffectProb_.add(input.readFloat());
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          rareProb_ = java.util.Collections.unmodifiableList(rareProb_);
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          bornOptionalEffectProb_ = java.util.Collections.unmodifiableList(bornOptionalEffectProb_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MsgItemTypeRandomRuneOuterClass.internal_static_msggamedata_MsgItemTypeRandomRune_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgItemTypeRandomRuneOuterClass.internal_static_msggamedata_MsgItemTypeRandomRune_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune.class, com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune.Builder.class);
    }

    private int bitField0_;
    public static final int RARE_FIELD_NUMBER = 1;
    private int rare_;
    /**
     * <code>uint32 rare = 1;</code>
     */
    public int getRare() {
      return rare_;
    }

    public static final int RARE_PROB_FIELD_NUMBER = 2;
    private java.util.List<java.lang.Float> rareProb_;
    /**
     * <code>repeated float rare_prob = 2;</code>
     */
    public java.util.List<java.lang.Float>
        getRareProbList() {
      return rareProb_;
    }
    /**
     * <code>repeated float rare_prob = 2;</code>
     */
    public int getRareProbCount() {
      return rareProb_.size();
    }
    /**
     * <code>repeated float rare_prob = 2;</code>
     */
    public float getRareProb(int index) {
      return rareProb_.get(index);
    }
    private int rareProbMemoizedSerializedSize = -1;

    public static final int BORN_OPTIONAL_EFFECT_PROB_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Float> bornOptionalEffectProb_;
    /**
     * <code>repeated float born_optional_effect_prob = 3;</code>
     */
    public java.util.List<java.lang.Float>
        getBornOptionalEffectProbList() {
      return bornOptionalEffectProb_;
    }
    /**
     * <code>repeated float born_optional_effect_prob = 3;</code>
     */
    public int getBornOptionalEffectProbCount() {
      return bornOptionalEffectProb_.size();
    }
    /**
     * <code>repeated float born_optional_effect_prob = 3;</code>
     */
    public float getBornOptionalEffectProb(int index) {
      return bornOptionalEffectProb_.get(index);
    }
    private int bornOptionalEffectProbMemoizedSerializedSize = -1;

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
      if (rare_ != 0) {
        output.writeUInt32(1, rare_);
      }
      if (getRareProbList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(rareProbMemoizedSerializedSize);
      }
      for (int i = 0; i < rareProb_.size(); i++) {
        output.writeFloatNoTag(rareProb_.get(i));
      }
      if (getBornOptionalEffectProbList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(bornOptionalEffectProbMemoizedSerializedSize);
      }
      for (int i = 0; i < bornOptionalEffectProb_.size(); i++) {
        output.writeFloatNoTag(bornOptionalEffectProb_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rare_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, rare_);
      }
      {
        int dataSize = 0;
        dataSize = 4 * getRareProbList().size();
        size += dataSize;
        if (!getRareProbList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        rareProbMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        dataSize = 4 * getBornOptionalEffectProbList().size();
        size += dataSize;
        if (!getBornOptionalEffectProbList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        bornOptionalEffectProbMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune other = (com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune) obj;

      boolean result = true;
      result = result && (getRare()
          == other.getRare());
      result = result && getRareProbList()
          .equals(other.getRareProbList());
      result = result && getBornOptionalEffectProbList()
          .equals(other.getBornOptionalEffectProbList());
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
      hash = (37 * hash) + RARE_FIELD_NUMBER;
      hash = (53 * hash) + getRare();
      if (getRareProbCount() > 0) {
        hash = (37 * hash) + RARE_PROB_FIELD_NUMBER;
        hash = (53 * hash) + getRareProbList().hashCode();
      }
      if (getBornOptionalEffectProbCount() > 0) {
        hash = (37 * hash) + BORN_OPTIONAL_EFFECT_PROB_FIELD_NUMBER;
        hash = (53 * hash) + getBornOptionalEffectProbList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune prototype) {
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
     * Protobuf type {@code msggamedata.MsgItemTypeRandomRune}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgItemTypeRandomRune)
        com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRuneOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgItemTypeRandomRuneOuterClass.internal_static_msggamedata_MsgItemTypeRandomRune_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgItemTypeRandomRuneOuterClass.internal_static_msggamedata_MsgItemTypeRandomRune_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune.class, com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune.Builder.class);
      }

      // Construct using com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune.newBuilder()
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
        rare_ = 0;

        rareProb_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        bornOptionalEffectProb_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgItemTypeRandomRuneOuterClass.internal_static_msggamedata_MsgItemTypeRandomRune_descriptor;
      }

      public com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune getDefaultInstanceForType() {
        return com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune.getDefaultInstance();
      }

      public com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune build() {
        com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune buildPartial() {
        com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune result = new com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.rare_ = rare_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          rareProb_ = java.util.Collections.unmodifiableList(rareProb_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.rareProb_ = rareProb_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          bornOptionalEffectProb_ = java.util.Collections.unmodifiableList(bornOptionalEffectProb_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.bornOptionalEffectProb_ = bornOptionalEffectProb_;
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
        if (other instanceof com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune) {
          return mergeFrom((com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune other) {
        if (other == com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune.getDefaultInstance()) return this;
        if (other.getRare() != 0) {
          setRare(other.getRare());
        }
        if (!other.rareProb_.isEmpty()) {
          if (rareProb_.isEmpty()) {
            rareProb_ = other.rareProb_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRareProbIsMutable();
            rareProb_.addAll(other.rareProb_);
          }
          onChanged();
        }
        if (!other.bornOptionalEffectProb_.isEmpty()) {
          if (bornOptionalEffectProb_.isEmpty()) {
            bornOptionalEffectProb_ = other.bornOptionalEffectProb_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureBornOptionalEffectProbIsMutable();
            bornOptionalEffectProb_.addAll(other.bornOptionalEffectProb_);
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
        com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int rare_ ;
      /**
       * <code>uint32 rare = 1;</code>
       */
      public int getRare() {
        return rare_;
      }
      /**
       * <code>uint32 rare = 1;</code>
       */
      public Builder setRare(int value) {
        
        rare_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rare = 1;</code>
       */
      public Builder clearRare() {
        
        rare_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Float> rareProb_ = java.util.Collections.emptyList();
      private void ensureRareProbIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          rareProb_ = new java.util.ArrayList<java.lang.Float>(rareProb_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated float rare_prob = 2;</code>
       */
      public java.util.List<java.lang.Float>
          getRareProbList() {
        return java.util.Collections.unmodifiableList(rareProb_);
      }
      /**
       * <code>repeated float rare_prob = 2;</code>
       */
      public int getRareProbCount() {
        return rareProb_.size();
      }
      /**
       * <code>repeated float rare_prob = 2;</code>
       */
      public float getRareProb(int index) {
        return rareProb_.get(index);
      }
      /**
       * <code>repeated float rare_prob = 2;</code>
       */
      public Builder setRareProb(
          int index, float value) {
        ensureRareProbIsMutable();
        rareProb_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float rare_prob = 2;</code>
       */
      public Builder addRareProb(float value) {
        ensureRareProbIsMutable();
        rareProb_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float rare_prob = 2;</code>
       */
      public Builder addAllRareProb(
          java.lang.Iterable<? extends java.lang.Float> values) {
        ensureRareProbIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rareProb_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float rare_prob = 2;</code>
       */
      public Builder clearRareProb() {
        rareProb_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Float> bornOptionalEffectProb_ = java.util.Collections.emptyList();
      private void ensureBornOptionalEffectProbIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          bornOptionalEffectProb_ = new java.util.ArrayList<java.lang.Float>(bornOptionalEffectProb_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated float born_optional_effect_prob = 3;</code>
       */
      public java.util.List<java.lang.Float>
          getBornOptionalEffectProbList() {
        return java.util.Collections.unmodifiableList(bornOptionalEffectProb_);
      }
      /**
       * <code>repeated float born_optional_effect_prob = 3;</code>
       */
      public int getBornOptionalEffectProbCount() {
        return bornOptionalEffectProb_.size();
      }
      /**
       * <code>repeated float born_optional_effect_prob = 3;</code>
       */
      public float getBornOptionalEffectProb(int index) {
        return bornOptionalEffectProb_.get(index);
      }
      /**
       * <code>repeated float born_optional_effect_prob = 3;</code>
       */
      public Builder setBornOptionalEffectProb(
          int index, float value) {
        ensureBornOptionalEffectProbIsMutable();
        bornOptionalEffectProb_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float born_optional_effect_prob = 3;</code>
       */
      public Builder addBornOptionalEffectProb(float value) {
        ensureBornOptionalEffectProbIsMutable();
        bornOptionalEffectProb_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float born_optional_effect_prob = 3;</code>
       */
      public Builder addAllBornOptionalEffectProb(
          java.lang.Iterable<? extends java.lang.Float> values) {
        ensureBornOptionalEffectProbIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bornOptionalEffectProb_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float born_optional_effect_prob = 3;</code>
       */
      public Builder clearBornOptionalEffectProb() {
        bornOptionalEffectProb_ = java.util.Collections.emptyList();
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgItemTypeRandomRune)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgItemTypeRandomRune)
    private static final com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune();
    }

    public static com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgItemTypeRandomRune>
        PARSER = new com.google.protobuf.AbstractParser<MsgItemTypeRandomRune>() {
      public MsgItemTypeRandomRune parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgItemTypeRandomRune(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgItemTypeRandomRune> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgItemTypeRandomRune> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgItemTypeRandomRuneOuterClass.MsgItemTypeRandomRune getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgItemTypeRandomRune_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgItemTypeRandomRune_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033MsgItemTypeRandomRune.proto\022\013msggameda" +
      "ta\"[\n\025MsgItemTypeRandomRune\022\014\n\004rare\030\001 \001(" +
      "\r\022\021\n\trare_prob\030\002 \003(\002\022!\n\031born_optional_ef" +
      "fect_prob\030\003 \003(\002B\023\n\021com.felania.msldbb\006pr" +
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
    internal_static_msggamedata_MsgItemTypeRandomRune_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgItemTypeRandomRune_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgItemTypeRandomRune_descriptor,
        new java.lang.String[] { "Rare", "RareProb", "BornOptionalEffectProb", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
