// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgAdventurePackageReward.proto

package com.felania.msldb;

public final class MsgAdventurePackageRewardOuterClass {
  private MsgAdventurePackageRewardOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgAdventurePackageRewardOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgAdventurePackageReward)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.StageDifficultyType difficulty = 1;</code>
     */
    int getDifficultyValue();
    /**
     * <code>.msggamedata.StageDifficultyType difficulty = 1;</code>
     */
    com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType getDifficulty();

    /**
     * <code>fixed32 stage_uid = 2;</code>
     */
    int getStageUid();

    /**
     * <code>.msggamedata.MsgPackageReward reward = 3;</code>
     */
    boolean hasReward();
    /**
     * <code>.msggamedata.MsgPackageReward reward = 3;</code>
     */
    com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward getReward();
    /**
     * <code>.msggamedata.MsgPackageReward reward = 3;</code>
     */
    com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageRewardOrBuilder getRewardOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.MsgAdventurePackageReward}
   */
  public  static final class MsgAdventurePackageReward extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgAdventurePackageReward)
      MsgAdventurePackageRewardOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgAdventurePackageReward.newBuilder() to construct.
    private MsgAdventurePackageReward(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgAdventurePackageReward() {
      difficulty_ = 0;
      stageUid_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgAdventurePackageReward(
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

              difficulty_ = rawValue;
              break;
            }
            case 21: {

              stageUid_ = input.readFixed32();
              break;
            }
            case 26: {
              com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.Builder subBuilder = null;
              if (reward_ != null) {
                subBuilder = reward_.toBuilder();
              }
              reward_ = input.readMessage(com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(reward_);
                reward_ = subBuilder.buildPartial();
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
      return com.felania.msldb.MsgAdventurePackageRewardOuterClass.internal_static_msggamedata_MsgAdventurePackageReward_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgAdventurePackageRewardOuterClass.internal_static_msggamedata_MsgAdventurePackageReward_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward.class, com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward.Builder.class);
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 1;
    private int difficulty_;
    /**
     * <code>.msggamedata.StageDifficultyType difficulty = 1;</code>
     */
    public int getDifficultyValue() {
      return difficulty_;
    }
    /**
     * <code>.msggamedata.StageDifficultyType difficulty = 1;</code>
     */
    public com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType getDifficulty() {
      com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType result = com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.valueOf(difficulty_);
      return result == null ? com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.UNRECOGNIZED : result;
    }

    public static final int STAGE_UID_FIELD_NUMBER = 2;
    private int stageUid_;
    /**
     * <code>fixed32 stage_uid = 2;</code>
     */
    public int getStageUid() {
      return stageUid_;
    }

    public static final int REWARD_FIELD_NUMBER = 3;
    private com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward reward_;
    /**
     * <code>.msggamedata.MsgPackageReward reward = 3;</code>
     */
    public boolean hasReward() {
      return reward_ != null;
    }
    /**
     * <code>.msggamedata.MsgPackageReward reward = 3;</code>
     */
    public com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward getReward() {
      return reward_ == null ? com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.getDefaultInstance() : reward_;
    }
    /**
     * <code>.msggamedata.MsgPackageReward reward = 3;</code>
     */
    public com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageRewardOrBuilder getRewardOrBuilder() {
      return getReward();
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
      if (difficulty_ != com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.StageDifficultyTypeNULL.getNumber()) {
        output.writeEnum(1, difficulty_);
      }
      if (stageUid_ != 0) {
        output.writeFixed32(2, stageUid_);
      }
      if (reward_ != null) {
        output.writeMessage(3, getReward());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficulty_ != com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.StageDifficultyTypeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, difficulty_);
      }
      if (stageUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(2, stageUid_);
      }
      if (reward_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getReward());
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
      if (!(obj instanceof com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward other = (com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward) obj;

      boolean result = true;
      result = result && difficulty_ == other.difficulty_;
      result = result && (getStageUid()
          == other.getStageUid());
      result = result && (hasReward() == other.hasReward());
      if (hasReward()) {
        result = result && getReward()
            .equals(other.getReward());
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
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + difficulty_;
      hash = (37 * hash) + STAGE_UID_FIELD_NUMBER;
      hash = (53 * hash) + getStageUid();
      if (hasReward()) {
        hash = (37 * hash) + REWARD_FIELD_NUMBER;
        hash = (53 * hash) + getReward().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward prototype) {
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
     * Protobuf type {@code msggamedata.MsgAdventurePackageReward}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgAdventurePackageReward)
        com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageRewardOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgAdventurePackageRewardOuterClass.internal_static_msggamedata_MsgAdventurePackageReward_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgAdventurePackageRewardOuterClass.internal_static_msggamedata_MsgAdventurePackageReward_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward.class, com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward.Builder.class);
      }

      // Construct using com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward.newBuilder()
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
        difficulty_ = 0;

        stageUid_ = 0;

        if (rewardBuilder_ == null) {
          reward_ = null;
        } else {
          reward_ = null;
          rewardBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgAdventurePackageRewardOuterClass.internal_static_msggamedata_MsgAdventurePackageReward_descriptor;
      }

      public com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward getDefaultInstanceForType() {
        return com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward.getDefaultInstance();
      }

      public com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward build() {
        com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward buildPartial() {
        com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward result = new com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward(this);
        result.difficulty_ = difficulty_;
        result.stageUid_ = stageUid_;
        if (rewardBuilder_ == null) {
          result.reward_ = reward_;
        } else {
          result.reward_ = rewardBuilder_.build();
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
        if (other instanceof com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward) {
          return mergeFrom((com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward other) {
        if (other == com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward.getDefaultInstance()) return this;
        if (other.difficulty_ != 0) {
          setDifficultyValue(other.getDifficultyValue());
        }
        if (other.getStageUid() != 0) {
          setStageUid(other.getStageUid());
        }
        if (other.hasReward()) {
          mergeReward(other.getReward());
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
        com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int difficulty_ = 0;
      /**
       * <code>.msggamedata.StageDifficultyType difficulty = 1;</code>
       */
      public int getDifficultyValue() {
        return difficulty_;
      }
      /**
       * <code>.msggamedata.StageDifficultyType difficulty = 1;</code>
       */
      public Builder setDifficultyValue(int value) {
        difficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.StageDifficultyType difficulty = 1;</code>
       */
      public com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType getDifficulty() {
        com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType result = com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.valueOf(difficulty_);
        return result == null ? com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.StageDifficultyType difficulty = 1;</code>
       */
      public Builder setDifficulty(com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        difficulty_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.StageDifficultyType difficulty = 1;</code>
       */
      public Builder clearDifficulty() {
        
        difficulty_ = 0;
        onChanged();
        return this;
      }

      private int stageUid_ ;
      /**
       * <code>fixed32 stage_uid = 2;</code>
       */
      public int getStageUid() {
        return stageUid_;
      }
      /**
       * <code>fixed32 stage_uid = 2;</code>
       */
      public Builder setStageUid(int value) {
        
        stageUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 stage_uid = 2;</code>
       */
      public Builder clearStageUid() {
        
        stageUid_ = 0;
        onChanged();
        return this;
      }

      private com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward reward_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward, com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.Builder, com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageRewardOrBuilder> rewardBuilder_;
      /**
       * <code>.msggamedata.MsgPackageReward reward = 3;</code>
       */
      public boolean hasReward() {
        return rewardBuilder_ != null || reward_ != null;
      }
      /**
       * <code>.msggamedata.MsgPackageReward reward = 3;</code>
       */
      public com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward getReward() {
        if (rewardBuilder_ == null) {
          return reward_ == null ? com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.getDefaultInstance() : reward_;
        } else {
          return rewardBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgPackageReward reward = 3;</code>
       */
      public Builder setReward(com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward value) {
        if (rewardBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          reward_ = value;
          onChanged();
        } else {
          rewardBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgPackageReward reward = 3;</code>
       */
      public Builder setReward(
          com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.Builder builderForValue) {
        if (rewardBuilder_ == null) {
          reward_ = builderForValue.build();
          onChanged();
        } else {
          rewardBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgPackageReward reward = 3;</code>
       */
      public Builder mergeReward(com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward value) {
        if (rewardBuilder_ == null) {
          if (reward_ != null) {
            reward_ =
              com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.newBuilder(reward_).mergeFrom(value).buildPartial();
          } else {
            reward_ = value;
          }
          onChanged();
        } else {
          rewardBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgPackageReward reward = 3;</code>
       */
      public Builder clearReward() {
        if (rewardBuilder_ == null) {
          reward_ = null;
          onChanged();
        } else {
          reward_ = null;
          rewardBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgPackageReward reward = 3;</code>
       */
      public com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.Builder getRewardBuilder() {
        
        onChanged();
        return getRewardFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgPackageReward reward = 3;</code>
       */
      public com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageRewardOrBuilder getRewardOrBuilder() {
        if (rewardBuilder_ != null) {
          return rewardBuilder_.getMessageOrBuilder();
        } else {
          return reward_ == null ?
              com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.getDefaultInstance() : reward_;
        }
      }
      /**
       * <code>.msggamedata.MsgPackageReward reward = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward, com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.Builder, com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageRewardOrBuilder> 
          getRewardFieldBuilder() {
        if (rewardBuilder_ == null) {
          rewardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward, com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.Builder, com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageRewardOrBuilder>(
                  getReward(),
                  getParentForChildren(),
                  isClean());
          reward_ = null;
        }
        return rewardBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgAdventurePackageReward)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgAdventurePackageReward)
    private static final com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward();
    }

    public static com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgAdventurePackageReward>
        PARSER = new com.google.protobuf.AbstractParser<MsgAdventurePackageReward>() {
      public MsgAdventurePackageReward parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgAdventurePackageReward(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgAdventurePackageReward> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgAdventurePackageReward> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgAdventurePackageRewardOuterClass.MsgAdventurePackageReward getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgAdventurePackageReward_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgAdventurePackageReward_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037MsgAdventurePackageReward.proto\022\013msgga" +
      "medata\032\031StageDifficultyType.proto\032\026MsgPa" +
      "ckageReward.proto\"\223\001\n\031MsgAdventurePackag" +
      "eReward\0224\n\ndifficulty\030\001 \001(\0162 .msggamedat" +
      "a.StageDifficultyType\022\021\n\tstage_uid\030\002 \001(\007" +
      "\022-\n\006reward\030\003 \001(\0132\035.msggamedata.MsgPackag" +
      "eRewardB\023\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.StageDifficultyTypeOuterClass.getDescriptor(),
          com.felania.msldb.MsgPackageRewardOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgAdventurePackageReward_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgAdventurePackageReward_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgAdventurePackageReward_descriptor,
        new java.lang.String[] { "Difficulty", "StageUid", "Reward", });
    com.felania.msldb.StageDifficultyTypeOuterClass.getDescriptor();
    com.felania.msldb.MsgPackageRewardOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
