// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgUserCVCMonsterSlot.proto

package com.felania.msldb;

public final class MsgUserCVCMonsterSlotOuterClass {
  private MsgUserCVCMonsterSlotOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgUserCVCMonsterSlotOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgUserCVCMonsterSlot)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.CVCMonsterSlotType slot_type = 1;</code>
     */
    int getSlotTypeValue();
    /**
     * <code>.msggamedata.CVCMonsterSlotType slot_type = 1;</code>
     */
    com.felania.msldb.CVCMonsterSlotTypeOuterClass.CVCMonsterSlotType getSlotType();

    /**
     * <code>repeated uint64 monster_ids = 2;</code>
     */
    java.util.List<java.lang.Long> getMonsterIdsList();
    /**
     * <code>repeated uint64 monster_ids = 2;</code>
     */
    int getMonsterIdsCount();
    /**
     * <code>repeated uint64 monster_ids = 2;</code>
     */
    long getMonsterIds(int index);
  }
  /**
   * Protobuf type {@code msggamedata.MsgUserCVCMonsterSlot}
   */
  public  static final class MsgUserCVCMonsterSlot extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgUserCVCMonsterSlot)
      MsgUserCVCMonsterSlotOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgUserCVCMonsterSlot.newBuilder() to construct.
    private MsgUserCVCMonsterSlot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgUserCVCMonsterSlot() {
      slotType_ = 0;
      monsterIds_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgUserCVCMonsterSlot(
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

              slotType_ = rawValue;
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                monsterIds_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000002;
              }
              monsterIds_.add(input.readUInt64());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                monsterIds_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                monsterIds_.add(input.readUInt64());
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
          monsterIds_ = java.util.Collections.unmodifiableList(monsterIds_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.internal_static_msggamedata_MsgUserCVCMonsterSlot_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.internal_static_msggamedata_MsgUserCVCMonsterSlot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot.class, com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot.Builder.class);
    }

    private int bitField0_;
    public static final int SLOT_TYPE_FIELD_NUMBER = 1;
    private int slotType_;
    /**
     * <code>.msggamedata.CVCMonsterSlotType slot_type = 1;</code>
     */
    public int getSlotTypeValue() {
      return slotType_;
    }
    /**
     * <code>.msggamedata.CVCMonsterSlotType slot_type = 1;</code>
     */
    public com.felania.msldb.CVCMonsterSlotTypeOuterClass.CVCMonsterSlotType getSlotType() {
      com.felania.msldb.CVCMonsterSlotTypeOuterClass.CVCMonsterSlotType result = com.felania.msldb.CVCMonsterSlotTypeOuterClass.CVCMonsterSlotType.valueOf(slotType_);
      return result == null ? com.felania.msldb.CVCMonsterSlotTypeOuterClass.CVCMonsterSlotType.UNRECOGNIZED : result;
    }

    public static final int MONSTER_IDS_FIELD_NUMBER = 2;
    private java.util.List<java.lang.Long> monsterIds_;
    /**
     * <code>repeated uint64 monster_ids = 2;</code>
     */
    public java.util.List<java.lang.Long>
        getMonsterIdsList() {
      return monsterIds_;
    }
    /**
     * <code>repeated uint64 monster_ids = 2;</code>
     */
    public int getMonsterIdsCount() {
      return monsterIds_.size();
    }
    /**
     * <code>repeated uint64 monster_ids = 2;</code>
     */
    public long getMonsterIds(int index) {
      return monsterIds_.get(index);
    }
    private int monsterIdsMemoizedSerializedSize = -1;

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
      if (slotType_ != com.felania.msldb.CVCMonsterSlotTypeOuterClass.CVCMonsterSlotType.CMST_Attack1.getNumber()) {
        output.writeEnum(1, slotType_);
      }
      if (getMonsterIdsList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(monsterIdsMemoizedSerializedSize);
      }
      for (int i = 0; i < monsterIds_.size(); i++) {
        output.writeUInt64NoTag(monsterIds_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (slotType_ != com.felania.msldb.CVCMonsterSlotTypeOuterClass.CVCMonsterSlotType.CMST_Attack1.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, slotType_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < monsterIds_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(monsterIds_.get(i));
        }
        size += dataSize;
        if (!getMonsterIdsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        monsterIdsMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot other = (com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot) obj;

      boolean result = true;
      result = result && slotType_ == other.slotType_;
      result = result && getMonsterIdsList()
          .equals(other.getMonsterIdsList());
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
      hash = (37 * hash) + SLOT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + slotType_;
      if (getMonsterIdsCount() > 0) {
        hash = (37 * hash) + MONSTER_IDS_FIELD_NUMBER;
        hash = (53 * hash) + getMonsterIdsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot prototype) {
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
     * Protobuf type {@code msggamedata.MsgUserCVCMonsterSlot}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgUserCVCMonsterSlot)
        com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlotOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.internal_static_msggamedata_MsgUserCVCMonsterSlot_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.internal_static_msggamedata_MsgUserCVCMonsterSlot_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot.class, com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot.Builder.class);
      }

      // Construct using com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot.newBuilder()
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
        slotType_ = 0;

        monsterIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.internal_static_msggamedata_MsgUserCVCMonsterSlot_descriptor;
      }

      public com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot getDefaultInstanceForType() {
        return com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot.getDefaultInstance();
      }

      public com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot build() {
        com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot buildPartial() {
        com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot result = new com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.slotType_ = slotType_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          monsterIds_ = java.util.Collections.unmodifiableList(monsterIds_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.monsterIds_ = monsterIds_;
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
        if (other instanceof com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot) {
          return mergeFrom((com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot other) {
        if (other == com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot.getDefaultInstance()) return this;
        if (other.slotType_ != 0) {
          setSlotTypeValue(other.getSlotTypeValue());
        }
        if (!other.monsterIds_.isEmpty()) {
          if (monsterIds_.isEmpty()) {
            monsterIds_ = other.monsterIds_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMonsterIdsIsMutable();
            monsterIds_.addAll(other.monsterIds_);
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
        com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int slotType_ = 0;
      /**
       * <code>.msggamedata.CVCMonsterSlotType slot_type = 1;</code>
       */
      public int getSlotTypeValue() {
        return slotType_;
      }
      /**
       * <code>.msggamedata.CVCMonsterSlotType slot_type = 1;</code>
       */
      public Builder setSlotTypeValue(int value) {
        slotType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.CVCMonsterSlotType slot_type = 1;</code>
       */
      public com.felania.msldb.CVCMonsterSlotTypeOuterClass.CVCMonsterSlotType getSlotType() {
        com.felania.msldb.CVCMonsterSlotTypeOuterClass.CVCMonsterSlotType result = com.felania.msldb.CVCMonsterSlotTypeOuterClass.CVCMonsterSlotType.valueOf(slotType_);
        return result == null ? com.felania.msldb.CVCMonsterSlotTypeOuterClass.CVCMonsterSlotType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.CVCMonsterSlotType slot_type = 1;</code>
       */
      public Builder setSlotType(com.felania.msldb.CVCMonsterSlotTypeOuterClass.CVCMonsterSlotType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        slotType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.CVCMonsterSlotType slot_type = 1;</code>
       */
      public Builder clearSlotType() {
        
        slotType_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Long> monsterIds_ = java.util.Collections.emptyList();
      private void ensureMonsterIdsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          monsterIds_ = new java.util.ArrayList<java.lang.Long>(monsterIds_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint64 monster_ids = 2;</code>
       */
      public java.util.List<java.lang.Long>
          getMonsterIdsList() {
        return java.util.Collections.unmodifiableList(monsterIds_);
      }
      /**
       * <code>repeated uint64 monster_ids = 2;</code>
       */
      public int getMonsterIdsCount() {
        return monsterIds_.size();
      }
      /**
       * <code>repeated uint64 monster_ids = 2;</code>
       */
      public long getMonsterIds(int index) {
        return monsterIds_.get(index);
      }
      /**
       * <code>repeated uint64 monster_ids = 2;</code>
       */
      public Builder setMonsterIds(
          int index, long value) {
        ensureMonsterIdsIsMutable();
        monsterIds_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 monster_ids = 2;</code>
       */
      public Builder addMonsterIds(long value) {
        ensureMonsterIdsIsMutable();
        monsterIds_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 monster_ids = 2;</code>
       */
      public Builder addAllMonsterIds(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureMonsterIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, monsterIds_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 monster_ids = 2;</code>
       */
      public Builder clearMonsterIds() {
        monsterIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgUserCVCMonsterSlot)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgUserCVCMonsterSlot)
    private static final com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot();
    }

    public static com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgUserCVCMonsterSlot>
        PARSER = new com.google.protobuf.AbstractParser<MsgUserCVCMonsterSlot>() {
      public MsgUserCVCMonsterSlot parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MsgUserCVCMonsterSlot(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgUserCVCMonsterSlot> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgUserCVCMonsterSlot> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgUserCVCMonsterSlotOuterClass.MsgUserCVCMonsterSlot getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgUserCVCMonsterSlot_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgUserCVCMonsterSlot_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033MsgUserCVCMonsterSlot.proto\022\013msggameda" +
      "ta\032\030CVCMonsterSlotType.proto\"`\n\025MsgUserC" +
      "VCMonsterSlot\0222\n\tslot_type\030\001 \001(\0162\037.msgga" +
      "medata.CVCMonsterSlotType\022\023\n\013monster_ids" +
      "\030\002 \003(\004B\023\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.CVCMonsterSlotTypeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgUserCVCMonsterSlot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgUserCVCMonsterSlot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgUserCVCMonsterSlot_descriptor,
        new java.lang.String[] { "SlotType", "MonsterIds", });
    com.felania.msldb.CVCMonsterSlotTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
