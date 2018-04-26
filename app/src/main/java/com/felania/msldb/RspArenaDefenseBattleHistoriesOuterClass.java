// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspArenaDefenseBattleHistories.proto

package com.felania.msldb;

public final class RspArenaDefenseBattleHistoriesOuterClass {
  private RspArenaDefenseBattleHistoriesOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspArenaDefenseBattleHistoriesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspArenaDefenseBattleHistories)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
     */
    java.util.List<com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory> 
        getBattleHistoriesList();
    /**
     * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
     */
    com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory getBattleHistories(int index);
    /**
     * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
     */
    int getBattleHistoriesCount();
    /**
     * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistoryOrBuilder> 
        getBattleHistoriesOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
     */
    com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistoryOrBuilder getBattleHistoriesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.RspArenaDefenseBattleHistories}
   */
  public  static final class RspArenaDefenseBattleHistories extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspArenaDefenseBattleHistories)
      RspArenaDefenseBattleHistoriesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspArenaDefenseBattleHistories.newBuilder() to construct.
    private RspArenaDefenseBattleHistories(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspArenaDefenseBattleHistories() {
      battleHistories_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspArenaDefenseBattleHistories(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                battleHistories_ = new java.util.ArrayList<com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory>();
                mutable_bitField0_ |= 0x00000001;
              }
              battleHistories_.add(
                  input.readMessage(com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory.parser(), extensionRegistry));
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
          battleHistories_ = java.util.Collections.unmodifiableList(battleHistories_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.internal_static_msggamedata_RspArenaDefenseBattleHistories_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.internal_static_msggamedata_RspArenaDefenseBattleHistories_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories.class, com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories.Builder.class);
    }

    public static final int BATTLE_HISTORIES_FIELD_NUMBER = 1;
    private java.util.List<com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory> battleHistories_;
    /**
     * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
     */
    public java.util.List<com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory> getBattleHistoriesList() {
      return battleHistories_;
    }
    /**
     * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistoryOrBuilder> 
        getBattleHistoriesOrBuilderList() {
      return battleHistories_;
    }
    /**
     * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
     */
    public int getBattleHistoriesCount() {
      return battleHistories_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
     */
    public com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory getBattleHistories(int index) {
      return battleHistories_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
     */
    public com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistoryOrBuilder getBattleHistoriesOrBuilder(
        int index) {
      return battleHistories_.get(index);
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
      for (int i = 0; i < battleHistories_.size(); i++) {
        output.writeMessage(1, battleHistories_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < battleHistories_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, battleHistories_.get(i));
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
      if (!(obj instanceof com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories other = (com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories) obj;

      boolean result = true;
      result = result && getBattleHistoriesList()
          .equals(other.getBattleHistoriesList());
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
      if (getBattleHistoriesCount() > 0) {
        hash = (37 * hash) + BATTLE_HISTORIES_FIELD_NUMBER;
        hash = (53 * hash) + getBattleHistoriesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories prototype) {
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
     * Protobuf type {@code msggamedata.RspArenaDefenseBattleHistories}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspArenaDefenseBattleHistories)
        com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistoriesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.internal_static_msggamedata_RspArenaDefenseBattleHistories_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.internal_static_msggamedata_RspArenaDefenseBattleHistories_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories.class, com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories.Builder.class);
      }

      // Construct using com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories.newBuilder()
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
          getBattleHistoriesFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (battleHistoriesBuilder_ == null) {
          battleHistories_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          battleHistoriesBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.internal_static_msggamedata_RspArenaDefenseBattleHistories_descriptor;
      }

      public com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories getDefaultInstanceForType() {
        return com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories.getDefaultInstance();
      }

      public com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories build() {
        com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories buildPartial() {
        com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories result = new com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories(this);
        int from_bitField0_ = bitField0_;
        if (battleHistoriesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            battleHistories_ = java.util.Collections.unmodifiableList(battleHistories_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.battleHistories_ = battleHistories_;
        } else {
          result.battleHistories_ = battleHistoriesBuilder_.build();
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
        if (other instanceof com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories) {
          return mergeFrom((com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories other) {
        if (other == com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories.getDefaultInstance()) return this;
        if (battleHistoriesBuilder_ == null) {
          if (!other.battleHistories_.isEmpty()) {
            if (battleHistories_.isEmpty()) {
              battleHistories_ = other.battleHistories_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBattleHistoriesIsMutable();
              battleHistories_.addAll(other.battleHistories_);
            }
            onChanged();
          }
        } else {
          if (!other.battleHistories_.isEmpty()) {
            if (battleHistoriesBuilder_.isEmpty()) {
              battleHistoriesBuilder_.dispose();
              battleHistoriesBuilder_ = null;
              battleHistories_ = other.battleHistories_;
              bitField0_ = (bitField0_ & ~0x00000001);
              battleHistoriesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBattleHistoriesFieldBuilder() : null;
            } else {
              battleHistoriesBuilder_.addAllMessages(other.battleHistories_);
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
        com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory> battleHistories_ =
        java.util.Collections.emptyList();
      private void ensureBattleHistoriesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          battleHistories_ = new java.util.ArrayList<com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory>(battleHistories_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory, com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory.Builder, com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistoryOrBuilder> battleHistoriesBuilder_;

      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory> getBattleHistoriesList() {
        if (battleHistoriesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(battleHistories_);
        } else {
          return battleHistoriesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public int getBattleHistoriesCount() {
        if (battleHistoriesBuilder_ == null) {
          return battleHistories_.size();
        } else {
          return battleHistoriesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory getBattleHistories(int index) {
        if (battleHistoriesBuilder_ == null) {
          return battleHistories_.get(index);
        } else {
          return battleHistoriesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public Builder setBattleHistories(
          int index, com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory value) {
        if (battleHistoriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBattleHistoriesIsMutable();
          battleHistories_.set(index, value);
          onChanged();
        } else {
          battleHistoriesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public Builder setBattleHistories(
          int index, com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory.Builder builderForValue) {
        if (battleHistoriesBuilder_ == null) {
          ensureBattleHistoriesIsMutable();
          battleHistories_.set(index, builderForValue.build());
          onChanged();
        } else {
          battleHistoriesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public Builder addBattleHistories(com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory value) {
        if (battleHistoriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBattleHistoriesIsMutable();
          battleHistories_.add(value);
          onChanged();
        } else {
          battleHistoriesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public Builder addBattleHistories(
          int index, com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory value) {
        if (battleHistoriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBattleHistoriesIsMutable();
          battleHistories_.add(index, value);
          onChanged();
        } else {
          battleHistoriesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public Builder addBattleHistories(
          com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory.Builder builderForValue) {
        if (battleHistoriesBuilder_ == null) {
          ensureBattleHistoriesIsMutable();
          battleHistories_.add(builderForValue.build());
          onChanged();
        } else {
          battleHistoriesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public Builder addBattleHistories(
          int index, com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory.Builder builderForValue) {
        if (battleHistoriesBuilder_ == null) {
          ensureBattleHistoriesIsMutable();
          battleHistories_.add(index, builderForValue.build());
          onChanged();
        } else {
          battleHistoriesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public Builder addAllBattleHistories(
          java.lang.Iterable<? extends com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory> values) {
        if (battleHistoriesBuilder_ == null) {
          ensureBattleHistoriesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, battleHistories_);
          onChanged();
        } else {
          battleHistoriesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public Builder clearBattleHistories() {
        if (battleHistoriesBuilder_ == null) {
          battleHistories_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          battleHistoriesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public Builder removeBattleHistories(int index) {
        if (battleHistoriesBuilder_ == null) {
          ensureBattleHistoriesIsMutable();
          battleHistories_.remove(index);
          onChanged();
        } else {
          battleHistoriesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory.Builder getBattleHistoriesBuilder(
          int index) {
        return getBattleHistoriesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistoryOrBuilder getBattleHistoriesOrBuilder(
          int index) {
        if (battleHistoriesBuilder_ == null) {
          return battleHistories_.get(index);  } else {
          return battleHistoriesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistoryOrBuilder> 
           getBattleHistoriesOrBuilderList() {
        if (battleHistoriesBuilder_ != null) {
          return battleHistoriesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(battleHistories_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory.Builder addBattleHistoriesBuilder() {
        return getBattleHistoriesFieldBuilder().addBuilder(
            com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory.Builder addBattleHistoriesBuilder(
          int index) {
        return getBattleHistoriesFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgArenaBattleHistory battle_histories = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory.Builder> 
           getBattleHistoriesBuilderList() {
        return getBattleHistoriesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory, com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory.Builder, com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistoryOrBuilder> 
          getBattleHistoriesFieldBuilder() {
        if (battleHistoriesBuilder_ == null) {
          battleHistoriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory, com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistory.Builder, com.felania.msldb.MsgArenaBattleHistoryOuterClass.MsgArenaBattleHistoryOrBuilder>(
                  battleHistories_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          battleHistories_ = null;
        }
        return battleHistoriesBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.RspArenaDefenseBattleHistories)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspArenaDefenseBattleHistories)
    private static final com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories();
    }

    public static com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspArenaDefenseBattleHistories>
        PARSER = new com.google.protobuf.AbstractParser<RspArenaDefenseBattleHistories>() {
      public RspArenaDefenseBattleHistories parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RspArenaDefenseBattleHistories(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspArenaDefenseBattleHistories> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspArenaDefenseBattleHistories> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspArenaDefenseBattleHistoriesOuterClass.RspArenaDefenseBattleHistories getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspArenaDefenseBattleHistories_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspArenaDefenseBattleHistories_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$RspArenaDefenseBattleHistories.proto\022\013" +
      "msggamedata\032\033MsgArenaBattleHistory.proto" +
      "\"^\n\036RspArenaDefenseBattleHistories\022<\n\020ba" +
      "ttle_histories\030\001 \003(\0132\".msggamedata.MsgAr" +
      "enaBattleHistoryB\023\n\021com.felania.msldbb\006p" +
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
          com.felania.msldb.MsgArenaBattleHistoryOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_RspArenaDefenseBattleHistories_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspArenaDefenseBattleHistories_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspArenaDefenseBattleHistories_descriptor,
        new java.lang.String[] { "BattleHistories", });
    com.felania.msldb.MsgArenaBattleHistoryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
