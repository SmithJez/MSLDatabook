// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqSetMonsterSlot.proto

package com.felania.msldb;

public final class ReqSetMonsterSlotOuterClass {
  private ReqSetMonsterSlotOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqSetMonsterSlotOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqSetMonsterSlot)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
     */
    java.util.List<com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData> 
        getMonsterSlotsList();
    /**
     * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
     */
    com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData getMonsterSlots(int index);
    /**
     * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
     */
    int getMonsterSlotsCount();
    /**
     * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder> 
        getMonsterSlotsOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
     */
    com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder getMonsterSlotsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.ReqSetMonsterSlot}
   */
  public  static final class ReqSetMonsterSlot extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqSetMonsterSlot)
      ReqSetMonsterSlotOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqSetMonsterSlot.newBuilder() to construct.
    private ReqSetMonsterSlot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqSetMonsterSlot() {
      monsterSlots_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqSetMonsterSlot(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                monsterSlots_ = new java.util.ArrayList<com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData>();
                mutable_bitField0_ |= 0x00000001;
              }
              monsterSlots_.add(
                  input.readMessage(com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          monsterSlots_ = java.util.Collections.unmodifiableList(monsterSlots_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.ReqSetMonsterSlotOuterClass.internal_static_msggamedata_ReqSetMonsterSlot_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqSetMonsterSlotOuterClass.internal_static_msggamedata_ReqSetMonsterSlot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot.class, com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot.Builder.class);
    }

    public static final int MONSTER_SLOTS_FIELD_NUMBER = 1;
    private java.util.List<com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData> monsterSlots_;
    /**
     * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
     */
    public java.util.List<com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData> getMonsterSlotsList() {
      return monsterSlots_;
    }
    /**
     * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder> 
        getMonsterSlotsOrBuilderList() {
      return monsterSlots_;
    }
    /**
     * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
     */
    public int getMonsterSlotsCount() {
      return monsterSlots_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
     */
    public com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData getMonsterSlots(int index) {
      return monsterSlots_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
     */
    public com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder getMonsterSlotsOrBuilder(
        int index) {
      return monsterSlots_.get(index);
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
      for (int i = 0; i < monsterSlots_.size(); i++) {
        output.writeMessage(1, monsterSlots_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < monsterSlots_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, monsterSlots_.get(i));
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
      if (!(obj instanceof com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot other = (com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot) obj;

      boolean result = true;
      result = result && getMonsterSlotsList()
          .equals(other.getMonsterSlotsList());
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
      if (getMonsterSlotsCount() > 0) {
        hash = (37 * hash) + MONSTER_SLOTS_FIELD_NUMBER;
        hash = (53 * hash) + getMonsterSlotsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot prototype) {
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
     * Protobuf type {@code msggamedata.ReqSetMonsterSlot}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqSetMonsterSlot)
        com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlotOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqSetMonsterSlotOuterClass.internal_static_msggamedata_ReqSetMonsterSlot_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqSetMonsterSlotOuterClass.internal_static_msggamedata_ReqSetMonsterSlot_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot.class, com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot.Builder.class);
      }

      // Construct using com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot.newBuilder()
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
          getMonsterSlotsFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (monsterSlotsBuilder_ == null) {
          monsterSlots_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          monsterSlotsBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqSetMonsterSlotOuterClass.internal_static_msggamedata_ReqSetMonsterSlot_descriptor;
      }

      public com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot getDefaultInstanceForType() {
        return com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot.getDefaultInstance();
      }

      public com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot build() {
        com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot buildPartial() {
        com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot result = new com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot(this);
        int from_bitField0_ = bitField0_;
        if (monsterSlotsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            monsterSlots_ = java.util.Collections.unmodifiableList(monsterSlots_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.monsterSlots_ = monsterSlots_;
        } else {
          result.monsterSlots_ = monsterSlotsBuilder_.build();
        }
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
        if (other instanceof com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot) {
          return mergeFrom((com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot other) {
        if (other == com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot.getDefaultInstance()) return this;
        if (monsterSlotsBuilder_ == null) {
          if (!other.monsterSlots_.isEmpty()) {
            if (monsterSlots_.isEmpty()) {
              monsterSlots_ = other.monsterSlots_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMonsterSlotsIsMutable();
              monsterSlots_.addAll(other.monsterSlots_);
            }
            onChanged();
          }
        } else {
          if (!other.monsterSlots_.isEmpty()) {
            if (monsterSlotsBuilder_.isEmpty()) {
              monsterSlotsBuilder_.dispose();
              monsterSlotsBuilder_ = null;
              monsterSlots_ = other.monsterSlots_;
              bitField0_ = (bitField0_ & ~0x00000001);
              monsterSlotsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMonsterSlotsFieldBuilder() : null;
            } else {
              monsterSlotsBuilder_.addAllMessages(other.monsterSlots_);
            }
          }
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
        com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData> monsterSlots_ =
        java.util.Collections.emptyList();
      private void ensureMonsterSlotsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          monsterSlots_ = new java.util.ArrayList<com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData>(monsterSlots_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder> monsterSlotsBuilder_;

      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData> getMonsterSlotsList() {
        if (monsterSlotsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(monsterSlots_);
        } else {
          return monsterSlotsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public int getMonsterSlotsCount() {
        if (monsterSlotsBuilder_ == null) {
          return monsterSlots_.size();
        } else {
          return monsterSlotsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData getMonsterSlots(int index) {
        if (monsterSlotsBuilder_ == null) {
          return monsterSlots_.get(index);
        } else {
          return monsterSlotsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public Builder setMonsterSlots(
          int index, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData value) {
        if (monsterSlotsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterSlotsIsMutable();
          monsterSlots_.set(index, value);
          onChanged();
        } else {
          monsterSlotsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public Builder setMonsterSlots(
          int index, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder builderForValue) {
        if (monsterSlotsBuilder_ == null) {
          ensureMonsterSlotsIsMutable();
          monsterSlots_.set(index, builderForValue.build());
          onChanged();
        } else {
          monsterSlotsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public Builder addMonsterSlots(com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData value) {
        if (monsterSlotsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterSlotsIsMutable();
          monsterSlots_.add(value);
          onChanged();
        } else {
          monsterSlotsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public Builder addMonsterSlots(
          int index, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData value) {
        if (monsterSlotsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterSlotsIsMutable();
          monsterSlots_.add(index, value);
          onChanged();
        } else {
          monsterSlotsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public Builder addMonsterSlots(
          com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder builderForValue) {
        if (monsterSlotsBuilder_ == null) {
          ensureMonsterSlotsIsMutable();
          monsterSlots_.add(builderForValue.build());
          onChanged();
        } else {
          monsterSlotsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public Builder addMonsterSlots(
          int index, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder builderForValue) {
        if (monsterSlotsBuilder_ == null) {
          ensureMonsterSlotsIsMutable();
          monsterSlots_.add(index, builderForValue.build());
          onChanged();
        } else {
          monsterSlotsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public Builder addAllMonsterSlots(
          java.lang.Iterable<? extends com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData> values) {
        if (monsterSlotsBuilder_ == null) {
          ensureMonsterSlotsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, monsterSlots_);
          onChanged();
        } else {
          monsterSlotsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public Builder clearMonsterSlots() {
        if (monsterSlotsBuilder_ == null) {
          monsterSlots_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          monsterSlotsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public Builder removeMonsterSlots(int index) {
        if (monsterSlotsBuilder_ == null) {
          ensureMonsterSlotsIsMutable();
          monsterSlots_.remove(index);
          onChanged();
        } else {
          monsterSlotsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder getMonsterSlotsBuilder(
          int index) {
        return getMonsterSlotsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder getMonsterSlotsOrBuilder(
          int index) {
        if (monsterSlotsBuilder_ == null) {
          return monsterSlots_.get(index);  } else {
          return monsterSlotsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder> 
           getMonsterSlotsOrBuilderList() {
        if (monsterSlotsBuilder_ != null) {
          return monsterSlotsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(monsterSlots_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder addMonsterSlotsBuilder() {
        return getMonsterSlotsFieldBuilder().addBuilder(
            com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder addMonsterSlotsBuilder(
          int index) {
        return getMonsterSlotsFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgMonsterSlotData monster_slots = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder> 
           getMonsterSlotsBuilderList() {
        return getMonsterSlotsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder> 
          getMonsterSlotsFieldBuilder() {
        if (monsterSlotsBuilder_ == null) {
          monsterSlotsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder>(
                  monsterSlots_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          monsterSlots_ = null;
        }
        return monsterSlotsBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqSetMonsterSlot)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqSetMonsterSlot)
    private static final com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot();
    }

    public static com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqSetMonsterSlot>
        PARSER = new com.google.protobuf.AbstractParser<ReqSetMonsterSlot>() {
      public ReqSetMonsterSlot parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReqSetMonsterSlot(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqSetMonsterSlot> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqSetMonsterSlot> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqSetMonsterSlotOuterClass.ReqSetMonsterSlot getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqSetMonsterSlot_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqSetMonsterSlot_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ReqSetMonsterSlot.proto\022\013msggamedata\032\030" +
      "MsgMonsterSlotData.proto\"K\n\021ReqSetMonste" +
      "rSlot\0226\n\rmonster_slots\030\001 \003(\0132\037.msggameda" +
      "ta.MsgMonsterSlotDataB\023\n\021com.felania.msl" +
      "dbb\006proto3"
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
          com.felania.msldb.MsgMonsterSlotDataOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_ReqSetMonsterSlot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqSetMonsterSlot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqSetMonsterSlot_descriptor,
        new java.lang.String[] { "MonsterSlots", });
    com.felania.msldb.MsgMonsterSlotDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
