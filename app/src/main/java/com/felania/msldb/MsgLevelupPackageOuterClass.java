// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgLevelupPackage.proto

package com.felania.msldb;

public final class MsgLevelupPackageOuterClass {
  private MsgLevelupPackageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgLevelupPackageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgLevelupPackage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.RestrictType restrict_type = 1;</code>
     */
    int getRestrictTypeValue();
    /**
     * <code>.msggamedata.RestrictType restrict_type = 1;</code>
     */
    com.felania.msldb.RestrictTypeOuterClass.RestrictType getRestrictType();

    /**
     * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
     */
    java.util.List<com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward> 
        getLevelupRewardsList();
    /**
     * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
     */
    com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward getLevelupRewards(int index);
    /**
     * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
     */
    int getLevelupRewardsCount();
    /**
     * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageRewardOrBuilder> 
        getLevelupRewardsOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
     */
    com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageRewardOrBuilder getLevelupRewardsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.MsgLevelupPackage}
   */
  public  static final class MsgLevelupPackage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgLevelupPackage)
      MsgLevelupPackageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgLevelupPackage.newBuilder() to construct.
    private MsgLevelupPackage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgLevelupPackage() {
      restrictType_ = 0;
      levelupRewards_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgLevelupPackage(
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

              restrictType_ = rawValue;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                levelupRewards_ = new java.util.ArrayList<com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward>();
                mutable_bitField0_ |= 0x00000002;
              }
              levelupRewards_.add(
                  input.readMessage(com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward.parser(), extensionRegistry));
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
          levelupRewards_ = java.util.Collections.unmodifiableList(levelupRewards_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MsgLevelupPackageOuterClass.internal_static_msggamedata_MsgLevelupPackage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgLevelupPackageOuterClass.internal_static_msggamedata_MsgLevelupPackage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage.class, com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage.Builder.class);
    }

    private int bitField0_;
    public static final int RESTRICT_TYPE_FIELD_NUMBER = 1;
    private int restrictType_;
    /**
     * <code>.msggamedata.RestrictType restrict_type = 1;</code>
     */
    public int getRestrictTypeValue() {
      return restrictType_;
    }
    /**
     * <code>.msggamedata.RestrictType restrict_type = 1;</code>
     */
    public com.felania.msldb.RestrictTypeOuterClass.RestrictType getRestrictType() {
      com.felania.msldb.RestrictTypeOuterClass.RestrictType result = com.felania.msldb.RestrictTypeOuterClass.RestrictType.valueOf(restrictType_);
      return result == null ? com.felania.msldb.RestrictTypeOuterClass.RestrictType.UNRECOGNIZED : result;
    }

    public static final int LEVELUP_REWARDS_FIELD_NUMBER = 2;
    private java.util.List<com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward> levelupRewards_;
    /**
     * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
     */
    public java.util.List<com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward> getLevelupRewardsList() {
      return levelupRewards_;
    }
    /**
     * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageRewardOrBuilder> 
        getLevelupRewardsOrBuilderList() {
      return levelupRewards_;
    }
    /**
     * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
     */
    public int getLevelupRewardsCount() {
      return levelupRewards_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
     */
    public com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward getLevelupRewards(int index) {
      return levelupRewards_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
     */
    public com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageRewardOrBuilder getLevelupRewardsOrBuilder(
        int index) {
      return levelupRewards_.get(index);
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
      if (restrictType_ != com.felania.msldb.RestrictTypeOuterClass.RestrictType.RT_None.getNumber()) {
        output.writeEnum(1, restrictType_);
      }
      for (int i = 0; i < levelupRewards_.size(); i++) {
        output.writeMessage(2, levelupRewards_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (restrictType_ != com.felania.msldb.RestrictTypeOuterClass.RestrictType.RT_None.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, restrictType_);
      }
      for (int i = 0; i < levelupRewards_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, levelupRewards_.get(i));
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
      if (!(obj instanceof com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage other = (com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage) obj;

      boolean result = true;
      result = result && restrictType_ == other.restrictType_;
      result = result && getLevelupRewardsList()
          .equals(other.getLevelupRewardsList());
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
      hash = (37 * hash) + RESTRICT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + restrictType_;
      if (getLevelupRewardsCount() > 0) {
        hash = (37 * hash) + LEVELUP_REWARDS_FIELD_NUMBER;
        hash = (53 * hash) + getLevelupRewardsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage prototype) {
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
     * Protobuf type {@code msggamedata.MsgLevelupPackage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgLevelupPackage)
        com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgLevelupPackageOuterClass.internal_static_msggamedata_MsgLevelupPackage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgLevelupPackageOuterClass.internal_static_msggamedata_MsgLevelupPackage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage.class, com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage.Builder.class);
      }

      // Construct using com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage.newBuilder()
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
          getLevelupRewardsFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        restrictType_ = 0;

        if (levelupRewardsBuilder_ == null) {
          levelupRewards_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          levelupRewardsBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgLevelupPackageOuterClass.internal_static_msggamedata_MsgLevelupPackage_descriptor;
      }

      public com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage getDefaultInstanceForType() {
        return com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage.getDefaultInstance();
      }

      public com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage build() {
        com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage buildPartial() {
        com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage result = new com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.restrictType_ = restrictType_;
        if (levelupRewardsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            levelupRewards_ = java.util.Collections.unmodifiableList(levelupRewards_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.levelupRewards_ = levelupRewards_;
        } else {
          result.levelupRewards_ = levelupRewardsBuilder_.build();
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
        if (other instanceof com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage) {
          return mergeFrom((com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage other) {
        if (other == com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage.getDefaultInstance()) return this;
        if (other.restrictType_ != 0) {
          setRestrictTypeValue(other.getRestrictTypeValue());
        }
        if (levelupRewardsBuilder_ == null) {
          if (!other.levelupRewards_.isEmpty()) {
            if (levelupRewards_.isEmpty()) {
              levelupRewards_ = other.levelupRewards_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureLevelupRewardsIsMutable();
              levelupRewards_.addAll(other.levelupRewards_);
            }
            onChanged();
          }
        } else {
          if (!other.levelupRewards_.isEmpty()) {
            if (levelupRewardsBuilder_.isEmpty()) {
              levelupRewardsBuilder_.dispose();
              levelupRewardsBuilder_ = null;
              levelupRewards_ = other.levelupRewards_;
              bitField0_ = (bitField0_ & ~0x00000002);
              levelupRewardsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLevelupRewardsFieldBuilder() : null;
            } else {
              levelupRewardsBuilder_.addAllMessages(other.levelupRewards_);
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
        com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int restrictType_ = 0;
      /**
       * <code>.msggamedata.RestrictType restrict_type = 1;</code>
       */
      public int getRestrictTypeValue() {
        return restrictType_;
      }
      /**
       * <code>.msggamedata.RestrictType restrict_type = 1;</code>
       */
      public Builder setRestrictTypeValue(int value) {
        restrictType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.RestrictType restrict_type = 1;</code>
       */
      public com.felania.msldb.RestrictTypeOuterClass.RestrictType getRestrictType() {
        com.felania.msldb.RestrictTypeOuterClass.RestrictType result = com.felania.msldb.RestrictTypeOuterClass.RestrictType.valueOf(restrictType_);
        return result == null ? com.felania.msldb.RestrictTypeOuterClass.RestrictType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.RestrictType restrict_type = 1;</code>
       */
      public Builder setRestrictType(com.felania.msldb.RestrictTypeOuterClass.RestrictType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        restrictType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.RestrictType restrict_type = 1;</code>
       */
      public Builder clearRestrictType() {
        
        restrictType_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward> levelupRewards_ =
        java.util.Collections.emptyList();
      private void ensureLevelupRewardsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          levelupRewards_ = new java.util.ArrayList<com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward>(levelupRewards_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward, com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward.Builder, com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageRewardOrBuilder> levelupRewardsBuilder_;

      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public java.util.List<com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward> getLevelupRewardsList() {
        if (levelupRewardsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(levelupRewards_);
        } else {
          return levelupRewardsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public int getLevelupRewardsCount() {
        if (levelupRewardsBuilder_ == null) {
          return levelupRewards_.size();
        } else {
          return levelupRewardsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward getLevelupRewards(int index) {
        if (levelupRewardsBuilder_ == null) {
          return levelupRewards_.get(index);
        } else {
          return levelupRewardsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public Builder setLevelupRewards(
          int index, com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward value) {
        if (levelupRewardsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelupRewardsIsMutable();
          levelupRewards_.set(index, value);
          onChanged();
        } else {
          levelupRewardsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public Builder setLevelupRewards(
          int index, com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward.Builder builderForValue) {
        if (levelupRewardsBuilder_ == null) {
          ensureLevelupRewardsIsMutable();
          levelupRewards_.set(index, builderForValue.build());
          onChanged();
        } else {
          levelupRewardsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public Builder addLevelupRewards(com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward value) {
        if (levelupRewardsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelupRewardsIsMutable();
          levelupRewards_.add(value);
          onChanged();
        } else {
          levelupRewardsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public Builder addLevelupRewards(
          int index, com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward value) {
        if (levelupRewardsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelupRewardsIsMutable();
          levelupRewards_.add(index, value);
          onChanged();
        } else {
          levelupRewardsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public Builder addLevelupRewards(
          com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward.Builder builderForValue) {
        if (levelupRewardsBuilder_ == null) {
          ensureLevelupRewardsIsMutable();
          levelupRewards_.add(builderForValue.build());
          onChanged();
        } else {
          levelupRewardsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public Builder addLevelupRewards(
          int index, com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward.Builder builderForValue) {
        if (levelupRewardsBuilder_ == null) {
          ensureLevelupRewardsIsMutable();
          levelupRewards_.add(index, builderForValue.build());
          onChanged();
        } else {
          levelupRewardsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public Builder addAllLevelupRewards(
          java.lang.Iterable<? extends com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward> values) {
        if (levelupRewardsBuilder_ == null) {
          ensureLevelupRewardsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, levelupRewards_);
          onChanged();
        } else {
          levelupRewardsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public Builder clearLevelupRewards() {
        if (levelupRewardsBuilder_ == null) {
          levelupRewards_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          levelupRewardsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public Builder removeLevelupRewards(int index) {
        if (levelupRewardsBuilder_ == null) {
          ensureLevelupRewardsIsMutable();
          levelupRewards_.remove(index);
          onChanged();
        } else {
          levelupRewardsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward.Builder getLevelupRewardsBuilder(
          int index) {
        return getLevelupRewardsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageRewardOrBuilder getLevelupRewardsOrBuilder(
          int index) {
        if (levelupRewardsBuilder_ == null) {
          return levelupRewards_.get(index);  } else {
          return levelupRewardsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageRewardOrBuilder> 
           getLevelupRewardsOrBuilderList() {
        if (levelupRewardsBuilder_ != null) {
          return levelupRewardsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(levelupRewards_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward.Builder addLevelupRewardsBuilder() {
        return getLevelupRewardsFieldBuilder().addBuilder(
            com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward.Builder addLevelupRewardsBuilder(
          int index) {
        return getLevelupRewardsFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgLevelupPackageReward levelup_rewards = 2;</code>
       */
      public java.util.List<com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward.Builder> 
           getLevelupRewardsBuilderList() {
        return getLevelupRewardsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward, com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward.Builder, com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageRewardOrBuilder> 
          getLevelupRewardsFieldBuilder() {
        if (levelupRewardsBuilder_ == null) {
          levelupRewardsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward, com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageReward.Builder, com.felania.msldb.MsgLevelupPackageRewardOuterClass.MsgLevelupPackageRewardOrBuilder>(
                  levelupRewards_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          levelupRewards_ = null;
        }
        return levelupRewardsBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgLevelupPackage)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgLevelupPackage)
    private static final com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage();
    }

    public static com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgLevelupPackage>
        PARSER = new com.google.protobuf.AbstractParser<MsgLevelupPackage>() {
      public MsgLevelupPackage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MsgLevelupPackage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgLevelupPackage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgLevelupPackage> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgLevelupPackageOuterClass.MsgLevelupPackage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgLevelupPackage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgLevelupPackage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027MsgLevelupPackage.proto\022\013msggamedata\032\022" +
      "RestrictType.proto\032\035MsgLevelupPackageRew" +
      "ard.proto\"\204\001\n\021MsgLevelupPackage\0220\n\rrestr" +
      "ict_type\030\001 \001(\0162\031.msggamedata.RestrictTyp" +
      "e\022=\n\017levelup_rewards\030\002 \003(\0132$.msggamedata" +
      ".MsgLevelupPackageRewardB\023\n\021com.felania." +
      "msldbb\006proto3"
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
          com.felania.msldb.RestrictTypeOuterClass.getDescriptor(),
          com.felania.msldb.MsgLevelupPackageRewardOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgLevelupPackage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgLevelupPackage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgLevelupPackage_descriptor,
        new java.lang.String[] { "RestrictType", "LevelupRewards", });
    com.felania.msldb.RestrictTypeOuterClass.getDescriptor();
    com.felania.msldb.MsgLevelupPackageRewardOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
