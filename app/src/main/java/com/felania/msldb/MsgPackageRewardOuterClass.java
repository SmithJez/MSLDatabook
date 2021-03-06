// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgPackageReward.proto

package com.felania.msldb;

public final class MsgPackageRewardOuterClass {
  private MsgPackageRewardOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgPackageRewardOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgPackageReward)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgQuest.RewardType reward_type = 1;</code>
     */
    int getRewardTypeValue();
    /**
     * <code>.msggamedata.MsgQuest.RewardType reward_type = 1;</code>
     */
    com.felania.msldb.MsgQuestOuterClass.MsgQuest.RewardType getRewardType();

    /**
     * <code>uint32 reward_val = 2;</code>
     */
    int getRewardVal();

    /**
     * <code>fixed32 reward_val_uid = 3;</code>
     */
    int getRewardValUid();

    /**
     * <code>.msggamedata.MonsterStatWeightType reward_val_monster_weight_type = 4;</code>
     */
    int getRewardValMonsterWeightTypeValue();
    /**
     * <code>.msggamedata.MonsterStatWeightType reward_val_monster_weight_type = 4;</code>
     */
    com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType getRewardValMonsterWeightType();
  }
  /**
   * Protobuf type {@code msggamedata.MsgPackageReward}
   */
  public  static final class MsgPackageReward extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgPackageReward)
      MsgPackageRewardOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgPackageReward.newBuilder() to construct.
    private MsgPackageReward(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgPackageReward() {
      rewardType_ = 0;
      rewardVal_ = 0;
      rewardValUid_ = 0;
      rewardValMonsterWeightType_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgPackageReward(
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

              rewardType_ = rawValue;
              break;
            }
            case 16: {

              rewardVal_ = input.readUInt32();
              break;
            }
            case 29: {

              rewardValUid_ = input.readFixed32();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              rewardValMonsterWeightType_ = rawValue;
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
      return com.felania.msldb.MsgPackageRewardOuterClass.internal_static_msggamedata_MsgPackageReward_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgPackageRewardOuterClass.internal_static_msggamedata_MsgPackageReward_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.class, com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.Builder.class);
    }

    public static final int REWARD_TYPE_FIELD_NUMBER = 1;
    private int rewardType_;
    /**
     * <code>.msggamedata.MsgQuest.RewardType reward_type = 1;</code>
     */
    public int getRewardTypeValue() {
      return rewardType_;
    }
    /**
     * <code>.msggamedata.MsgQuest.RewardType reward_type = 1;</code>
     */
    public com.felania.msldb.MsgQuestOuterClass.MsgQuest.RewardType getRewardType() {
      com.felania.msldb.MsgQuestOuterClass.MsgQuest.RewardType result = com.felania.msldb.MsgQuestOuterClass.MsgQuest.RewardType.valueOf(rewardType_);
      return result == null ? com.felania.msldb.MsgQuestOuterClass.MsgQuest.RewardType.UNRECOGNIZED : result;
    }

    public static final int REWARD_VAL_FIELD_NUMBER = 2;
    private int rewardVal_;
    /**
     * <code>uint32 reward_val = 2;</code>
     */
    public int getRewardVal() {
      return rewardVal_;
    }

    public static final int REWARD_VAL_UID_FIELD_NUMBER = 3;
    private int rewardValUid_;
    /**
     * <code>fixed32 reward_val_uid = 3;</code>
     */
    public int getRewardValUid() {
      return rewardValUid_;
    }

    public static final int REWARD_VAL_MONSTER_WEIGHT_TYPE_FIELD_NUMBER = 4;
    private int rewardValMonsterWeightType_;
    /**
     * <code>.msggamedata.MonsterStatWeightType reward_val_monster_weight_type = 4;</code>
     */
    public int getRewardValMonsterWeightTypeValue() {
      return rewardValMonsterWeightType_;
    }
    /**
     * <code>.msggamedata.MonsterStatWeightType reward_val_monster_weight_type = 4;</code>
     */
    public com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType getRewardValMonsterWeightType() {
      com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType result = com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType.valueOf(rewardValMonsterWeightType_);
      return result == null ? com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType.UNRECOGNIZED : result;
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
      if (rewardType_ != com.felania.msldb.MsgQuestOuterClass.MsgQuest.RewardType.RewardNone.getNumber()) {
        output.writeEnum(1, rewardType_);
      }
      if (rewardVal_ != 0) {
        output.writeUInt32(2, rewardVal_);
      }
      if (rewardValUid_ != 0) {
        output.writeFixed32(3, rewardValUid_);
      }
      if (rewardValMonsterWeightType_ != com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType.MonsterStatWeightTypeNULL.getNumber()) {
        output.writeEnum(4, rewardValMonsterWeightType_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rewardType_ != com.felania.msldb.MsgQuestOuterClass.MsgQuest.RewardType.RewardNone.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, rewardType_);
      }
      if (rewardVal_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, rewardVal_);
      }
      if (rewardValUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(3, rewardValUid_);
      }
      if (rewardValMonsterWeightType_ != com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType.MonsterStatWeightTypeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, rewardValMonsterWeightType_);
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
      if (!(obj instanceof com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward other = (com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward) obj;

      boolean result = true;
      result = result && rewardType_ == other.rewardType_;
      result = result && (getRewardVal()
          == other.getRewardVal());
      result = result && (getRewardValUid()
          == other.getRewardValUid());
      result = result && rewardValMonsterWeightType_ == other.rewardValMonsterWeightType_;
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
      hash = (37 * hash) + REWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + rewardType_;
      hash = (37 * hash) + REWARD_VAL_FIELD_NUMBER;
      hash = (53 * hash) + getRewardVal();
      hash = (37 * hash) + REWARD_VAL_UID_FIELD_NUMBER;
      hash = (53 * hash) + getRewardValUid();
      hash = (37 * hash) + REWARD_VAL_MONSTER_WEIGHT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + rewardValMonsterWeightType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward prototype) {
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
     * Protobuf type {@code msggamedata.MsgPackageReward}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgPackageReward)
        com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageRewardOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgPackageRewardOuterClass.internal_static_msggamedata_MsgPackageReward_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgPackageRewardOuterClass.internal_static_msggamedata_MsgPackageReward_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.class, com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.Builder.class);
      }

      // Construct using com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.newBuilder()
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
        rewardType_ = 0;

        rewardVal_ = 0;

        rewardValUid_ = 0;

        rewardValMonsterWeightType_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgPackageRewardOuterClass.internal_static_msggamedata_MsgPackageReward_descriptor;
      }

      public com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward getDefaultInstanceForType() {
        return com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.getDefaultInstance();
      }

      public com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward build() {
        com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward buildPartial() {
        com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward result = new com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward(this);
        result.rewardType_ = rewardType_;
        result.rewardVal_ = rewardVal_;
        result.rewardValUid_ = rewardValUid_;
        result.rewardValMonsterWeightType_ = rewardValMonsterWeightType_;
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
        if (other instanceof com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward) {
          return mergeFrom((com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward other) {
        if (other == com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward.getDefaultInstance()) return this;
        if (other.rewardType_ != 0) {
          setRewardTypeValue(other.getRewardTypeValue());
        }
        if (other.getRewardVal() != 0) {
          setRewardVal(other.getRewardVal());
        }
        if (other.getRewardValUid() != 0) {
          setRewardValUid(other.getRewardValUid());
        }
        if (other.rewardValMonsterWeightType_ != 0) {
          setRewardValMonsterWeightTypeValue(other.getRewardValMonsterWeightTypeValue());
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
        com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int rewardType_ = 0;
      /**
       * <code>.msggamedata.MsgQuest.RewardType reward_type = 1;</code>
       */
      public int getRewardTypeValue() {
        return rewardType_;
      }
      /**
       * <code>.msggamedata.MsgQuest.RewardType reward_type = 1;</code>
       */
      public Builder setRewardTypeValue(int value) {
        rewardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgQuest.RewardType reward_type = 1;</code>
       */
      public com.felania.msldb.MsgQuestOuterClass.MsgQuest.RewardType getRewardType() {
        com.felania.msldb.MsgQuestOuterClass.MsgQuest.RewardType result = com.felania.msldb.MsgQuestOuterClass.MsgQuest.RewardType.valueOf(rewardType_);
        return result == null ? com.felania.msldb.MsgQuestOuterClass.MsgQuest.RewardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MsgQuest.RewardType reward_type = 1;</code>
       */
      public Builder setRewardType(com.felania.msldb.MsgQuestOuterClass.MsgQuest.RewardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        rewardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgQuest.RewardType reward_type = 1;</code>
       */
      public Builder clearRewardType() {
        
        rewardType_ = 0;
        onChanged();
        return this;
      }

      private int rewardVal_ ;
      /**
       * <code>uint32 reward_val = 2;</code>
       */
      public int getRewardVal() {
        return rewardVal_;
      }
      /**
       * <code>uint32 reward_val = 2;</code>
       */
      public Builder setRewardVal(int value) {
        
        rewardVal_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_val = 2;</code>
       */
      public Builder clearRewardVal() {
        
        rewardVal_ = 0;
        onChanged();
        return this;
      }

      private int rewardValUid_ ;
      /**
       * <code>fixed32 reward_val_uid = 3;</code>
       */
      public int getRewardValUid() {
        return rewardValUid_;
      }
      /**
       * <code>fixed32 reward_val_uid = 3;</code>
       */
      public Builder setRewardValUid(int value) {
        
        rewardValUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 reward_val_uid = 3;</code>
       */
      public Builder clearRewardValUid() {
        
        rewardValUid_ = 0;
        onChanged();
        return this;
      }

      private int rewardValMonsterWeightType_ = 0;
      /**
       * <code>.msggamedata.MonsterStatWeightType reward_val_monster_weight_type = 4;</code>
       */
      public int getRewardValMonsterWeightTypeValue() {
        return rewardValMonsterWeightType_;
      }
      /**
       * <code>.msggamedata.MonsterStatWeightType reward_val_monster_weight_type = 4;</code>
       */
      public Builder setRewardValMonsterWeightTypeValue(int value) {
        rewardValMonsterWeightType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterStatWeightType reward_val_monster_weight_type = 4;</code>
       */
      public com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType getRewardValMonsterWeightType() {
        com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType result = com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType.valueOf(rewardValMonsterWeightType_);
        return result == null ? com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MonsterStatWeightType reward_val_monster_weight_type = 4;</code>
       */
      public Builder setRewardValMonsterWeightType(com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        rewardValMonsterWeightType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterStatWeightType reward_val_monster_weight_type = 4;</code>
       */
      public Builder clearRewardValMonsterWeightType() {
        
        rewardValMonsterWeightType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgPackageReward)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgPackageReward)
    private static final com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward();
    }

    public static com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgPackageReward>
        PARSER = new com.google.protobuf.AbstractParser<MsgPackageReward>() {
      public MsgPackageReward parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgPackageReward(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgPackageReward> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgPackageReward> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgPackageRewardOuterClass.MsgPackageReward getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgPackageReward_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgPackageReward_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026MsgPackageReward.proto\022\013msggamedata\032\016M" +
      "sgQuest.proto\032\033MonsterStatWeightType.pro" +
      "to\"\301\001\n\020MsgPackageReward\0225\n\013reward_type\030\001" +
      " \001(\0162 .msggamedata.MsgQuest.RewardType\022\022" +
      "\n\nreward_val\030\002 \001(\r\022\026\n\016reward_val_uid\030\003 \001" +
      "(\007\022J\n\036reward_val_monster_weight_type\030\004 \001" +
      "(\0162\".msggamedata.MonsterStatWeightTypeB\023" +
      "\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.MsgQuestOuterClass.getDescriptor(),
          com.felania.msldb.MonsterStatWeightTypeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgPackageReward_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgPackageReward_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgPackageReward_descriptor,
        new java.lang.String[] { "RewardType", "RewardVal", "RewardValUid", "RewardValMonsterWeightType", });
    com.felania.msldb.MsgQuestOuterClass.getDescriptor();
    com.felania.msldb.MonsterStatWeightTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
