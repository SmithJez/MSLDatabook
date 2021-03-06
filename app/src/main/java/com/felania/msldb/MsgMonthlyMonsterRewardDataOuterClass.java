// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgMonthlyMonsterRewardData.proto

package com.felania.msldb;

public final class MsgMonthlyMonsterRewardDataOuterClass {
  private MsgMonthlyMonsterRewardDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgMonthlyMonsterRewardDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgMonthlyMonsterRewardData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
     */
    java.util.List<com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward> 
        getMonthlyMonsterRewardsList();
    /**
     * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
     */
    com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward getMonthlyMonsterRewards(int index);
    /**
     * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
     */
    int getMonthlyMonsterRewardsCount();
    /**
     * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterRewardOrBuilder> 
        getMonthlyMonsterRewardsOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
     */
    com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterRewardOrBuilder getMonthlyMonsterRewardsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.MsgMonthlyMonsterRewardData}
   */
  public  static final class MsgMonthlyMonsterRewardData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgMonthlyMonsterRewardData)
      MsgMonthlyMonsterRewardDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgMonthlyMonsterRewardData.newBuilder() to construct.
    private MsgMonthlyMonsterRewardData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgMonthlyMonsterRewardData() {
      uid_ = 0;
      monthlyMonsterRewards_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgMonthlyMonsterRewardData(
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                monthlyMonsterRewards_ = new java.util.ArrayList<com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward>();
                mutable_bitField0_ |= 0x00000002;
              }
              monthlyMonsterRewards_.add(
                  input.readMessage(com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward.parser(), extensionRegistry));
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
          monthlyMonsterRewards_ = java.util.Collections.unmodifiableList(monthlyMonsterRewards_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.internal_static_msggamedata_MsgMonthlyMonsterRewardData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.internal_static_msggamedata_MsgMonthlyMonsterRewardData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData.class, com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData.Builder.class);
    }

    private int bitField0_;
    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>fixed32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int MONTHLY_MONSTER_REWARDS_FIELD_NUMBER = 2;
    private java.util.List<com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward> monthlyMonsterRewards_;
    /**
     * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
     */
    public java.util.List<com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward> getMonthlyMonsterRewardsList() {
      return monthlyMonsterRewards_;
    }
    /**
     * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterRewardOrBuilder> 
        getMonthlyMonsterRewardsOrBuilderList() {
      return monthlyMonsterRewards_;
    }
    /**
     * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
     */
    public int getMonthlyMonsterRewardsCount() {
      return monthlyMonsterRewards_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
     */
    public com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward getMonthlyMonsterRewards(int index) {
      return monthlyMonsterRewards_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
     */
    public com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterRewardOrBuilder getMonthlyMonsterRewardsOrBuilder(
        int index) {
      return monthlyMonsterRewards_.get(index);
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
      for (int i = 0; i < monthlyMonsterRewards_.size(); i++) {
        output.writeMessage(2, monthlyMonsterRewards_.get(i));
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
      for (int i = 0; i < monthlyMonsterRewards_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, monthlyMonsterRewards_.get(i));
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
      if (!(obj instanceof com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData other = (com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData) obj;

      boolean result = true;
      result = result && (getUid()
          == other.getUid());
      result = result && getMonthlyMonsterRewardsList()
          .equals(other.getMonthlyMonsterRewardsList());
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
      if (getMonthlyMonsterRewardsCount() > 0) {
        hash = (37 * hash) + MONTHLY_MONSTER_REWARDS_FIELD_NUMBER;
        hash = (53 * hash) + getMonthlyMonsterRewardsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData prototype) {
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
     * Protobuf type {@code msggamedata.MsgMonthlyMonsterRewardData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgMonthlyMonsterRewardData)
        com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.internal_static_msggamedata_MsgMonthlyMonsterRewardData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.internal_static_msggamedata_MsgMonthlyMonsterRewardData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData.class, com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData.Builder.class);
      }

      // Construct using com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData.newBuilder()
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
          getMonthlyMonsterRewardsFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        uid_ = 0;

        if (monthlyMonsterRewardsBuilder_ == null) {
          monthlyMonsterRewards_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          monthlyMonsterRewardsBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.internal_static_msggamedata_MsgMonthlyMonsterRewardData_descriptor;
      }

      public com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData getDefaultInstanceForType() {
        return com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData.getDefaultInstance();
      }

      public com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData build() {
        com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData buildPartial() {
        com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData result = new com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.uid_ = uid_;
        if (monthlyMonsterRewardsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            monthlyMonsterRewards_ = java.util.Collections.unmodifiableList(monthlyMonsterRewards_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.monthlyMonsterRewards_ = monthlyMonsterRewards_;
        } else {
          result.monthlyMonsterRewards_ = monthlyMonsterRewardsBuilder_.build();
        }
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
        if (other instanceof com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData) {
          return mergeFrom((com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData other) {
        if (other == com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (monthlyMonsterRewardsBuilder_ == null) {
          if (!other.monthlyMonsterRewards_.isEmpty()) {
            if (monthlyMonsterRewards_.isEmpty()) {
              monthlyMonsterRewards_ = other.monthlyMonsterRewards_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureMonthlyMonsterRewardsIsMutable();
              monthlyMonsterRewards_.addAll(other.monthlyMonsterRewards_);
            }
            onChanged();
          }
        } else {
          if (!other.monthlyMonsterRewards_.isEmpty()) {
            if (monthlyMonsterRewardsBuilder_.isEmpty()) {
              monthlyMonsterRewardsBuilder_.dispose();
              monthlyMonsterRewardsBuilder_ = null;
              monthlyMonsterRewards_ = other.monthlyMonsterRewards_;
              bitField0_ = (bitField0_ & ~0x00000002);
              monthlyMonsterRewardsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMonthlyMonsterRewardsFieldBuilder() : null;
            } else {
              monthlyMonsterRewardsBuilder_.addAllMessages(other.monthlyMonsterRewards_);
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
        com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

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

      private java.util.List<com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward> monthlyMonsterRewards_ =
        java.util.Collections.emptyList();
      private void ensureMonthlyMonsterRewardsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          monthlyMonsterRewards_ = new java.util.ArrayList<com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward>(monthlyMonsterRewards_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward, com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward.Builder, com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterRewardOrBuilder> monthlyMonsterRewardsBuilder_;

      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public java.util.List<com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward> getMonthlyMonsterRewardsList() {
        if (monthlyMonsterRewardsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(monthlyMonsterRewards_);
        } else {
          return monthlyMonsterRewardsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public int getMonthlyMonsterRewardsCount() {
        if (monthlyMonsterRewardsBuilder_ == null) {
          return monthlyMonsterRewards_.size();
        } else {
          return monthlyMonsterRewardsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward getMonthlyMonsterRewards(int index) {
        if (monthlyMonsterRewardsBuilder_ == null) {
          return monthlyMonsterRewards_.get(index);
        } else {
          return monthlyMonsterRewardsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public Builder setMonthlyMonsterRewards(
          int index, com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward value) {
        if (monthlyMonsterRewardsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonthlyMonsterRewardsIsMutable();
          monthlyMonsterRewards_.set(index, value);
          onChanged();
        } else {
          monthlyMonsterRewardsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public Builder setMonthlyMonsterRewards(
          int index, com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward.Builder builderForValue) {
        if (monthlyMonsterRewardsBuilder_ == null) {
          ensureMonthlyMonsterRewardsIsMutable();
          monthlyMonsterRewards_.set(index, builderForValue.build());
          onChanged();
        } else {
          monthlyMonsterRewardsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public Builder addMonthlyMonsterRewards(com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward value) {
        if (monthlyMonsterRewardsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonthlyMonsterRewardsIsMutable();
          monthlyMonsterRewards_.add(value);
          onChanged();
        } else {
          monthlyMonsterRewardsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public Builder addMonthlyMonsterRewards(
          int index, com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward value) {
        if (monthlyMonsterRewardsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonthlyMonsterRewardsIsMutable();
          monthlyMonsterRewards_.add(index, value);
          onChanged();
        } else {
          monthlyMonsterRewardsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public Builder addMonthlyMonsterRewards(
          com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward.Builder builderForValue) {
        if (monthlyMonsterRewardsBuilder_ == null) {
          ensureMonthlyMonsterRewardsIsMutable();
          monthlyMonsterRewards_.add(builderForValue.build());
          onChanged();
        } else {
          monthlyMonsterRewardsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public Builder addMonthlyMonsterRewards(
          int index, com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward.Builder builderForValue) {
        if (monthlyMonsterRewardsBuilder_ == null) {
          ensureMonthlyMonsterRewardsIsMutable();
          monthlyMonsterRewards_.add(index, builderForValue.build());
          onChanged();
        } else {
          monthlyMonsterRewardsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public Builder addAllMonthlyMonsterRewards(
          java.lang.Iterable<? extends com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward> values) {
        if (monthlyMonsterRewardsBuilder_ == null) {
          ensureMonthlyMonsterRewardsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, monthlyMonsterRewards_);
          onChanged();
        } else {
          monthlyMonsterRewardsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public Builder clearMonthlyMonsterRewards() {
        if (monthlyMonsterRewardsBuilder_ == null) {
          monthlyMonsterRewards_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          monthlyMonsterRewardsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public Builder removeMonthlyMonsterRewards(int index) {
        if (monthlyMonsterRewardsBuilder_ == null) {
          ensureMonthlyMonsterRewardsIsMutable();
          monthlyMonsterRewards_.remove(index);
          onChanged();
        } else {
          monthlyMonsterRewardsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward.Builder getMonthlyMonsterRewardsBuilder(
          int index) {
        return getMonthlyMonsterRewardsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterRewardOrBuilder getMonthlyMonsterRewardsOrBuilder(
          int index) {
        if (monthlyMonsterRewardsBuilder_ == null) {
          return monthlyMonsterRewards_.get(index);  } else {
          return monthlyMonsterRewardsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterRewardOrBuilder> 
           getMonthlyMonsterRewardsOrBuilderList() {
        if (monthlyMonsterRewardsBuilder_ != null) {
          return monthlyMonsterRewardsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(monthlyMonsterRewards_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward.Builder addMonthlyMonsterRewardsBuilder() {
        return getMonthlyMonsterRewardsFieldBuilder().addBuilder(
            com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward.Builder addMonthlyMonsterRewardsBuilder(
          int index) {
        return getMonthlyMonsterRewardsFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgMonthlyMonsterReward monthly_monster_rewards = 2;</code>
       */
      public java.util.List<com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward.Builder> 
           getMonthlyMonsterRewardsBuilderList() {
        return getMonthlyMonsterRewardsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward, com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward.Builder, com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterRewardOrBuilder> 
          getMonthlyMonsterRewardsFieldBuilder() {
        if (monthlyMonsterRewardsBuilder_ == null) {
          monthlyMonsterRewardsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward, com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterReward.Builder, com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.MsgMonthlyMonsterRewardOrBuilder>(
                  monthlyMonsterRewards_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          monthlyMonsterRewards_ = null;
        }
        return monthlyMonsterRewardsBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgMonthlyMonsterRewardData)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgMonthlyMonsterRewardData)
    private static final com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData();
    }

    public static com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgMonthlyMonsterRewardData>
        PARSER = new com.google.protobuf.AbstractParser<MsgMonthlyMonsterRewardData>() {
      public MsgMonthlyMonsterRewardData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgMonthlyMonsterRewardData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgMonthlyMonsterRewardData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgMonthlyMonsterRewardData> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgMonthlyMonsterRewardDataOuterClass.MsgMonthlyMonsterRewardData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgMonthlyMonsterRewardData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgMonthlyMonsterRewardData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!MsgMonthlyMonsterRewardData.proto\022\013msg" +
      "gamedata\032\035MsgMonthlyMonsterReward.proto\"" +
      "q\n\033MsgMonthlyMonsterRewardData\022\013\n\003uid\030\001 " +
      "\001(\007\022E\n\027monthly_monster_rewards\030\002 \003(\0132$.m" +
      "sggamedata.MsgMonthlyMonsterRewardB\023\n\021co" +
      "m.felania.msldbb\006proto3"
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
          com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgMonthlyMonsterRewardData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgMonthlyMonsterRewardData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgMonthlyMonsterRewardData_descriptor,
        new java.lang.String[] { "Uid", "MonthlyMonsterRewards", });
    com.felania.msldb.MsgMonthlyMonsterRewardOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
