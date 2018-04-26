// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgFriendDungeonStageInfo.proto

package com.felania.msldb;

public final class MsgFriendDungeonStageInfoOuterClass {
  private MsgFriendDungeonStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgFriendDungeonStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgFriendDungeonStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 target_monster_uid = 1;</code>
     */
    int getTargetMonsterUid();

    /**
     * <code>float prob = 2;</code>
     */
    float getProb();

    /**
     * <code>bool is_gm_dungeon = 3;</code>
     */
    boolean getIsGmDungeon();

    /**
     * <code>uint32 period = 4;</code>
     */
    int getPeriod();

    /**
     * <code>uint64 start_date = 5;</code>
     */
    long getStartDate();

    /**
     * <code>uint64 end_date = 6;</code>
     */
    long getEndDate();

    /**
     * <code>string owner_name = 7;</code>
     */
    java.lang.String getOwnerName();
    /**
     * <code>string owner_name = 7;</code>
     */
    com.google.protobuf.ByteString
        getOwnerNameBytes();

    /**
     * <code>fixed32 monster_uid = 8;</code>
     */
    int getMonsterUid();
  }
  /**
   * Protobuf type {@code msggamedata.MsgFriendDungeonStageInfo}
   */
  public  static final class MsgFriendDungeonStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgFriendDungeonStageInfo)
      MsgFriendDungeonStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgFriendDungeonStageInfo.newBuilder() to construct.
    private MsgFriendDungeonStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgFriendDungeonStageInfo() {
      targetMonsterUid_ = 0;
      prob_ = 0F;
      isGmDungeon_ = false;
      period_ = 0;
      startDate_ = 0L;
      endDate_ = 0L;
      ownerName_ = "";
      monsterUid_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgFriendDungeonStageInfo(
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

              targetMonsterUid_ = input.readFixed32();
              break;
            }
            case 21: {

              prob_ = input.readFloat();
              break;
            }
            case 24: {

              isGmDungeon_ = input.readBool();
              break;
            }
            case 32: {

              period_ = input.readUInt32();
              break;
            }
            case 40: {

              startDate_ = input.readUInt64();
              break;
            }
            case 48: {

              endDate_ = input.readUInt64();
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              ownerName_ = s;
              break;
            }
            case 69: {

              monsterUid_ = input.readFixed32();
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
      return com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.internal_static_msggamedata_MsgFriendDungeonStageInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.internal_static_msggamedata_MsgFriendDungeonStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo.class, com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo.Builder.class);
    }

    public static final int TARGET_MONSTER_UID_FIELD_NUMBER = 1;
    private int targetMonsterUid_;
    /**
     * <code>fixed32 target_monster_uid = 1;</code>
     */
    public int getTargetMonsterUid() {
      return targetMonsterUid_;
    }

    public static final int PROB_FIELD_NUMBER = 2;
    private float prob_;
    /**
     * <code>float prob = 2;</code>
     */
    public float getProb() {
      return prob_;
    }

    public static final int IS_GM_DUNGEON_FIELD_NUMBER = 3;
    private boolean isGmDungeon_;
    /**
     * <code>bool is_gm_dungeon = 3;</code>
     */
    public boolean getIsGmDungeon() {
      return isGmDungeon_;
    }

    public static final int PERIOD_FIELD_NUMBER = 4;
    private int period_;
    /**
     * <code>uint32 period = 4;</code>
     */
    public int getPeriod() {
      return period_;
    }

    public static final int START_DATE_FIELD_NUMBER = 5;
    private long startDate_;
    /**
     * <code>uint64 start_date = 5;</code>
     */
    public long getStartDate() {
      return startDate_;
    }

    public static final int END_DATE_FIELD_NUMBER = 6;
    private long endDate_;
    /**
     * <code>uint64 end_date = 6;</code>
     */
    public long getEndDate() {
      return endDate_;
    }

    public static final int OWNER_NAME_FIELD_NUMBER = 7;
    private volatile java.lang.Object ownerName_;
    /**
     * <code>string owner_name = 7;</code>
     */
    public java.lang.String getOwnerName() {
      java.lang.Object ref = ownerName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ownerName_ = s;
        return s;
      }
    }
    /**
     * <code>string owner_name = 7;</code>
     */
    public com.google.protobuf.ByteString
        getOwnerNameBytes() {
      java.lang.Object ref = ownerName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ownerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MONSTER_UID_FIELD_NUMBER = 8;
    private int monsterUid_;
    /**
     * <code>fixed32 monster_uid = 8;</code>
     */
    public int getMonsterUid() {
      return monsterUid_;
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
      if (targetMonsterUid_ != 0) {
        output.writeFixed32(1, targetMonsterUid_);
      }
      if (prob_ != 0F) {
        output.writeFloat(2, prob_);
      }
      if (isGmDungeon_ != false) {
        output.writeBool(3, isGmDungeon_);
      }
      if (period_ != 0) {
        output.writeUInt32(4, period_);
      }
      if (startDate_ != 0L) {
        output.writeUInt64(5, startDate_);
      }
      if (endDate_ != 0L) {
        output.writeUInt64(6, endDate_);
      }
      if (!getOwnerNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, ownerName_);
      }
      if (monsterUid_ != 0) {
        output.writeFixed32(8, monsterUid_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetMonsterUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, targetMonsterUid_);
      }
      if (prob_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, prob_);
      }
      if (isGmDungeon_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isGmDungeon_);
      }
      if (period_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, period_);
      }
      if (startDate_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, startDate_);
      }
      if (endDate_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, endDate_);
      }
      if (!getOwnerNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, ownerName_);
      }
      if (monsterUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(8, monsterUid_);
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
      if (!(obj instanceof com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo other = (com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo) obj;

      boolean result = true;
      result = result && (getTargetMonsterUid()
          == other.getTargetMonsterUid());
      result = result && (
          java.lang.Float.floatToIntBits(getProb())
          == java.lang.Float.floatToIntBits(
              other.getProb()));
      result = result && (getIsGmDungeon()
          == other.getIsGmDungeon());
      result = result && (getPeriod()
          == other.getPeriod());
      result = result && (getStartDate()
          == other.getStartDate());
      result = result && (getEndDate()
          == other.getEndDate());
      result = result && getOwnerName()
          .equals(other.getOwnerName());
      result = result && (getMonsterUid()
          == other.getMonsterUid());
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
      hash = (37 * hash) + TARGET_MONSTER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetMonsterUid();
      hash = (37 * hash) + PROB_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getProb());
      hash = (37 * hash) + IS_GM_DUNGEON_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsGmDungeon());
      hash = (37 * hash) + PERIOD_FIELD_NUMBER;
      hash = (53 * hash) + getPeriod();
      hash = (37 * hash) + START_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getStartDate());
      hash = (37 * hash) + END_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEndDate());
      hash = (37 * hash) + OWNER_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerName().hashCode();
      hash = (37 * hash) + MONSTER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo prototype) {
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
     * Protobuf type {@code msggamedata.MsgFriendDungeonStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgFriendDungeonStageInfo)
        com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.internal_static_msggamedata_MsgFriendDungeonStageInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.internal_static_msggamedata_MsgFriendDungeonStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo.class, com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo.Builder.class);
      }

      // Construct using com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo.newBuilder()
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
        targetMonsterUid_ = 0;

        prob_ = 0F;

        isGmDungeon_ = false;

        period_ = 0;

        startDate_ = 0L;

        endDate_ = 0L;

        ownerName_ = "";

        monsterUid_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.internal_static_msggamedata_MsgFriendDungeonStageInfo_descriptor;
      }

      public com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo getDefaultInstanceForType() {
        return com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo.getDefaultInstance();
      }

      public com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo build() {
        com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo buildPartial() {
        com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo result = new com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo(this);
        result.targetMonsterUid_ = targetMonsterUid_;
        result.prob_ = prob_;
        result.isGmDungeon_ = isGmDungeon_;
        result.period_ = period_;
        result.startDate_ = startDate_;
        result.endDate_ = endDate_;
        result.ownerName_ = ownerName_;
        result.monsterUid_ = monsterUid_;
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
        if (other instanceof com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo) {
          return mergeFrom((com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo other) {
        if (other == com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo.getDefaultInstance()) return this;
        if (other.getTargetMonsterUid() != 0) {
          setTargetMonsterUid(other.getTargetMonsterUid());
        }
        if (other.getProb() != 0F) {
          setProb(other.getProb());
        }
        if (other.getIsGmDungeon() != false) {
          setIsGmDungeon(other.getIsGmDungeon());
        }
        if (other.getPeriod() != 0) {
          setPeriod(other.getPeriod());
        }
        if (other.getStartDate() != 0L) {
          setStartDate(other.getStartDate());
        }
        if (other.getEndDate() != 0L) {
          setEndDate(other.getEndDate());
        }
        if (!other.getOwnerName().isEmpty()) {
          ownerName_ = other.ownerName_;
          onChanged();
        }
        if (other.getMonsterUid() != 0) {
          setMonsterUid(other.getMonsterUid());
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
        com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int targetMonsterUid_ ;
      /**
       * <code>fixed32 target_monster_uid = 1;</code>
       */
      public int getTargetMonsterUid() {
        return targetMonsterUid_;
      }
      /**
       * <code>fixed32 target_monster_uid = 1;</code>
       */
      public Builder setTargetMonsterUid(int value) {
        
        targetMonsterUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 target_monster_uid = 1;</code>
       */
      public Builder clearTargetMonsterUid() {
        
        targetMonsterUid_ = 0;
        onChanged();
        return this;
      }

      private float prob_ ;
      /**
       * <code>float prob = 2;</code>
       */
      public float getProb() {
        return prob_;
      }
      /**
       * <code>float prob = 2;</code>
       */
      public Builder setProb(float value) {
        
        prob_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float prob = 2;</code>
       */
      public Builder clearProb() {
        
        prob_ = 0F;
        onChanged();
        return this;
      }

      private boolean isGmDungeon_ ;
      /**
       * <code>bool is_gm_dungeon = 3;</code>
       */
      public boolean getIsGmDungeon() {
        return isGmDungeon_;
      }
      /**
       * <code>bool is_gm_dungeon = 3;</code>
       */
      public Builder setIsGmDungeon(boolean value) {
        
        isGmDungeon_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_gm_dungeon = 3;</code>
       */
      public Builder clearIsGmDungeon() {
        
        isGmDungeon_ = false;
        onChanged();
        return this;
      }

      private int period_ ;
      /**
       * <code>uint32 period = 4;</code>
       */
      public int getPeriod() {
        return period_;
      }
      /**
       * <code>uint32 period = 4;</code>
       */
      public Builder setPeriod(int value) {
        
        period_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 period = 4;</code>
       */
      public Builder clearPeriod() {
        
        period_ = 0;
        onChanged();
        return this;
      }

      private long startDate_ ;
      /**
       * <code>uint64 start_date = 5;</code>
       */
      public long getStartDate() {
        return startDate_;
      }
      /**
       * <code>uint64 start_date = 5;</code>
       */
      public Builder setStartDate(long value) {
        
        startDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 start_date = 5;</code>
       */
      public Builder clearStartDate() {
        
        startDate_ = 0L;
        onChanged();
        return this;
      }

      private long endDate_ ;
      /**
       * <code>uint64 end_date = 6;</code>
       */
      public long getEndDate() {
        return endDate_;
      }
      /**
       * <code>uint64 end_date = 6;</code>
       */
      public Builder setEndDate(long value) {
        
        endDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 end_date = 6;</code>
       */
      public Builder clearEndDate() {
        
        endDate_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object ownerName_ = "";
      /**
       * <code>string owner_name = 7;</code>
       */
      public java.lang.String getOwnerName() {
        java.lang.Object ref = ownerName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          ownerName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string owner_name = 7;</code>
       */
      public com.google.protobuf.ByteString
          getOwnerNameBytes() {
        java.lang.Object ref = ownerName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ownerName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string owner_name = 7;</code>
       */
      public Builder setOwnerName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        ownerName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string owner_name = 7;</code>
       */
      public Builder clearOwnerName() {
        
        ownerName_ = getDefaultInstance().getOwnerName();
        onChanged();
        return this;
      }
      /**
       * <code>string owner_name = 7;</code>
       */
      public Builder setOwnerNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        ownerName_ = value;
        onChanged();
        return this;
      }

      private int monsterUid_ ;
      /**
       * <code>fixed32 monster_uid = 8;</code>
       */
      public int getMonsterUid() {
        return monsterUid_;
      }
      /**
       * <code>fixed32 monster_uid = 8;</code>
       */
      public Builder setMonsterUid(int value) {
        
        monsterUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 monster_uid = 8;</code>
       */
      public Builder clearMonsterUid() {
        
        monsterUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgFriendDungeonStageInfo)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgFriendDungeonStageInfo)
    private static final com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo();
    }

    public static com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgFriendDungeonStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<MsgFriendDungeonStageInfo>() {
      public MsgFriendDungeonStageInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgFriendDungeonStageInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgFriendDungeonStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgFriendDungeonStageInfo> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgFriendDungeonStageInfoOuterClass.MsgFriendDungeonStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgFriendDungeonStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgFriendDungeonStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037MsgFriendDungeonStageInfo.proto\022\013msgga" +
      "medata\"\273\001\n\031MsgFriendDungeonStageInfo\022\032\n\022" +
      "target_monster_uid\030\001 \001(\007\022\014\n\004prob\030\002 \001(\002\022\025" +
      "\n\ris_gm_dungeon\030\003 \001(\010\022\016\n\006period\030\004 \001(\r\022\022\n" +
      "\nstart_date\030\005 \001(\004\022\020\n\010end_date\030\006 \001(\004\022\022\n\no" +
      "wner_name\030\007 \001(\t\022\023\n\013monster_uid\030\010 \001(\007B\023\n\021" +
      "com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_MsgFriendDungeonStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgFriendDungeonStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgFriendDungeonStageInfo_descriptor,
        new java.lang.String[] { "TargetMonsterUid", "Prob", "IsGmDungeon", "Period", "StartDate", "EndDate", "OwnerName", "MonsterUid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
