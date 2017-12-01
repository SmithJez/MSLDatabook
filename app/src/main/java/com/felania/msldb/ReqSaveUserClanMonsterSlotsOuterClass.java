// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqSaveUserClanMonsterSlots.proto

package com.felania.msldb;

public final class ReqSaveUserClanMonsterSlotsOuterClass {
  private ReqSaveUserClanMonsterSlotsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqSaveUserClanMonsterSlotsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqSaveUserClanMonsterSlots)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
     */
    boolean hasMonsterSlotList();
    /**
     * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
     */
    com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList getMonsterSlotList();
    /**
     * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
     */
    com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotListOrBuilder getMonsterSlotListOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.ReqSaveUserClanMonsterSlots}
   */
  public  static final class ReqSaveUserClanMonsterSlots extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqSaveUserClanMonsterSlots)
      ReqSaveUserClanMonsterSlotsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqSaveUserClanMonsterSlots.newBuilder() to construct.
    private ReqSaveUserClanMonsterSlots(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqSaveUserClanMonsterSlots() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqSaveUserClanMonsterSlots(
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
              com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList.Builder subBuilder = null;
              if (monsterSlotList_ != null) {
                subBuilder = monsterSlotList_.toBuilder();
              }
              monsterSlotList_ = input.readMessage(com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(monsterSlotList_);
                monsterSlotList_ = subBuilder.buildPartial();
              }

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
      return com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.internal_static_msggamedata_ReqSaveUserClanMonsterSlots_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.internal_static_msggamedata_ReqSaveUserClanMonsterSlots_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots.class, com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots.Builder.class);
    }

    public static final int MONSTER_SLOT_LIST_FIELD_NUMBER = 1;
    private com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList monsterSlotList_;
    /**
     * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
     */
    public boolean hasMonsterSlotList() {
      return monsterSlotList_ != null;
    }
    /**
     * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
     */
    public com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList getMonsterSlotList() {
      return monsterSlotList_ == null ? com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList.getDefaultInstance() : monsterSlotList_;
    }
    /**
     * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
     */
    public com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotListOrBuilder getMonsterSlotListOrBuilder() {
      return getMonsterSlotList();
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
      if (monsterSlotList_ != null) {
        output.writeMessage(1, getMonsterSlotList());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (monsterSlotList_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getMonsterSlotList());
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
      if (!(obj instanceof com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots other = (com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots) obj;

      boolean result = true;
      result = result && (hasMonsterSlotList() == other.hasMonsterSlotList());
      if (hasMonsterSlotList()) {
        result = result && getMonsterSlotList()
            .equals(other.getMonsterSlotList());
      }
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
      if (hasMonsterSlotList()) {
        hash = (37 * hash) + MONSTER_SLOT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMonsterSlotList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots prototype) {
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
     * Protobuf type {@code msggamedata.ReqSaveUserClanMonsterSlots}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqSaveUserClanMonsterSlots)
        com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlotsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.internal_static_msggamedata_ReqSaveUserClanMonsterSlots_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.internal_static_msggamedata_ReqSaveUserClanMonsterSlots_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots.class, com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots.Builder.class);
      }

      // Construct using com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots.newBuilder()
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
        if (monsterSlotListBuilder_ == null) {
          monsterSlotList_ = null;
        } else {
          monsterSlotList_ = null;
          monsterSlotListBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.internal_static_msggamedata_ReqSaveUserClanMonsterSlots_descriptor;
      }

      public com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots getDefaultInstanceForType() {
        return com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots.getDefaultInstance();
      }

      public com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots build() {
        com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots buildPartial() {
        com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots result = new com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots(this);
        if (monsterSlotListBuilder_ == null) {
          result.monsterSlotList_ = monsterSlotList_;
        } else {
          result.monsterSlotList_ = monsterSlotListBuilder_.build();
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
        if (other instanceof com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots) {
          return mergeFrom((com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots other) {
        if (other == com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots.getDefaultInstance()) return this;
        if (other.hasMonsterSlotList()) {
          mergeMonsterSlotList(other.getMonsterSlotList());
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
        com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList monsterSlotList_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList, com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList.Builder, com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotListOrBuilder> monsterSlotListBuilder_;
      /**
       * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
       */
      public boolean hasMonsterSlotList() {
        return monsterSlotListBuilder_ != null || monsterSlotList_ != null;
      }
      /**
       * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
       */
      public com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList getMonsterSlotList() {
        if (monsterSlotListBuilder_ == null) {
          return monsterSlotList_ == null ? com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList.getDefaultInstance() : monsterSlotList_;
        } else {
          return monsterSlotListBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
       */
      public Builder setMonsterSlotList(com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList value) {
        if (monsterSlotListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          monsterSlotList_ = value;
          onChanged();
        } else {
          monsterSlotListBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
       */
      public Builder setMonsterSlotList(
          com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList.Builder builderForValue) {
        if (monsterSlotListBuilder_ == null) {
          monsterSlotList_ = builderForValue.build();
          onChanged();
        } else {
          monsterSlotListBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
       */
      public Builder mergeMonsterSlotList(com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList value) {
        if (monsterSlotListBuilder_ == null) {
          if (monsterSlotList_ != null) {
            monsterSlotList_ =
              com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList.newBuilder(monsterSlotList_).mergeFrom(value).buildPartial();
          } else {
            monsterSlotList_ = value;
          }
          onChanged();
        } else {
          monsterSlotListBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
       */
      public Builder clearMonsterSlotList() {
        if (monsterSlotListBuilder_ == null) {
          monsterSlotList_ = null;
          onChanged();
        } else {
          monsterSlotList_ = null;
          monsterSlotListBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
       */
      public com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList.Builder getMonsterSlotListBuilder() {
        
        onChanged();
        return getMonsterSlotListFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
       */
      public com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotListOrBuilder getMonsterSlotListOrBuilder() {
        if (monsterSlotListBuilder_ != null) {
          return monsterSlotListBuilder_.getMessageOrBuilder();
        } else {
          return monsterSlotList_ == null ?
              com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList.getDefaultInstance() : monsterSlotList_;
        }
      }
      /**
       * <code>.msggamedata.MsgUserClanMonsterSlotList monster_slot_list = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList, com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList.Builder, com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotListOrBuilder> 
          getMonsterSlotListFieldBuilder() {
        if (monsterSlotListBuilder_ == null) {
          monsterSlotListBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList, com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotList.Builder, com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.MsgUserClanMonsterSlotListOrBuilder>(
                  getMonsterSlotList(),
                  getParentForChildren(),
                  isClean());
          monsterSlotList_ = null;
        }
        return monsterSlotListBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqSaveUserClanMonsterSlots)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqSaveUserClanMonsterSlots)
    private static final com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots();
    }

    public static com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqSaveUserClanMonsterSlots>
        PARSER = new com.google.protobuf.AbstractParser<ReqSaveUserClanMonsterSlots>() {
      public ReqSaveUserClanMonsterSlots parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReqSaveUserClanMonsterSlots(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqSaveUserClanMonsterSlots> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqSaveUserClanMonsterSlots> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqSaveUserClanMonsterSlotsOuterClass.ReqSaveUserClanMonsterSlots getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqSaveUserClanMonsterSlots_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqSaveUserClanMonsterSlots_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!ReqSaveUserClanMonsterSlots.proto\022\013msg" +
      "gamedata\032 MsgUserClanMonsterSlotList.pro" +
      "to\"a\n\033ReqSaveUserClanMonsterSlots\022B\n\021mon" +
      "ster_slot_list\030\001 \001(\0132\'.msggamedata.MsgUs" +
      "erClanMonsterSlotListB\023\n\021com.felania.msl" +
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
          com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_ReqSaveUserClanMonsterSlots_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqSaveUserClanMonsterSlots_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqSaveUserClanMonsterSlots_descriptor,
        new java.lang.String[] { "MonsterSlotList", });
    com.felania.msldb.MsgUserClanMonsterSlotListOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
