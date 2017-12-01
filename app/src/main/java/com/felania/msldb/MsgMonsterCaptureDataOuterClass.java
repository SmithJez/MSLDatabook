// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgMonsterCaptureData.proto

package com.felania.msldb;

public final class MsgMonsterCaptureDataOuterClass {
  private MsgMonsterCaptureDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgMonsterCaptureDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgMonsterCaptureData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 monster_uid = 1;</code>
     */
    int getMonsterUid();

    /**
     * <code>uint32 battle_id = 2;</code>
     */
    int getBattleId();

    /**
     * <code>fixed32 stage_uid = 3;</code>
     */
    int getStageUid();

    /**
     * <code>fixed32 substage_uid = 4;</code>
     */
    int getSubstageUid();

    /**
     * <code>.msggamedata.StageDifficultyType difficulty = 5;</code>
     */
    int getDifficultyValue();
    /**
     * <code>.msggamedata.StageDifficultyType difficulty = 5;</code>
     */
    com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType getDifficulty();

    /**
     * <code>uint64 date = 6;</code>
     */
    long getDate();
  }
  /**
   * Protobuf type {@code msggamedata.MsgMonsterCaptureData}
   */
  public  static final class MsgMonsterCaptureData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgMonsterCaptureData)
      MsgMonsterCaptureDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgMonsterCaptureData.newBuilder() to construct.
    private MsgMonsterCaptureData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgMonsterCaptureData() {
      monsterUid_ = 0;
      battleId_ = 0;
      stageUid_ = 0;
      substageUid_ = 0;
      difficulty_ = 0;
      date_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgMonsterCaptureData(
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
            case 13: {

              monsterUid_ = input.readFixed32();
              break;
            }
            case 16: {

              battleId_ = input.readUInt32();
              break;
            }
            case 29: {

              stageUid_ = input.readFixed32();
              break;
            }
            case 37: {

              substageUid_ = input.readFixed32();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();

              difficulty_ = rawValue;
              break;
            }
            case 48: {

              date_ = input.readUInt64();
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
      return com.felania.msldb.MsgMonsterCaptureDataOuterClass.internal_static_msggamedata_MsgMonsterCaptureData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgMonsterCaptureDataOuterClass.internal_static_msggamedata_MsgMonsterCaptureData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData.class, com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData.Builder.class);
    }

    public static final int MONSTER_UID_FIELD_NUMBER = 1;
    private int monsterUid_;
    /**
     * <code>fixed32 monster_uid = 1;</code>
     */
    public int getMonsterUid() {
      return monsterUid_;
    }

    public static final int BATTLE_ID_FIELD_NUMBER = 2;
    private int battleId_;
    /**
     * <code>uint32 battle_id = 2;</code>
     */
    public int getBattleId() {
      return battleId_;
    }

    public static final int STAGE_UID_FIELD_NUMBER = 3;
    private int stageUid_;
    /**
     * <code>fixed32 stage_uid = 3;</code>
     */
    public int getStageUid() {
      return stageUid_;
    }

    public static final int SUBSTAGE_UID_FIELD_NUMBER = 4;
    private int substageUid_;
    /**
     * <code>fixed32 substage_uid = 4;</code>
     */
    public int getSubstageUid() {
      return substageUid_;
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 5;
    private int difficulty_;
    /**
     * <code>.msggamedata.StageDifficultyType difficulty = 5;</code>
     */
    public int getDifficultyValue() {
      return difficulty_;
    }
    /**
     * <code>.msggamedata.StageDifficultyType difficulty = 5;</code>
     */
    public com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType getDifficulty() {
      com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType result = com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.valueOf(difficulty_);
      return result == null ? com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.UNRECOGNIZED : result;
    }

    public static final int DATE_FIELD_NUMBER = 6;
    private long date_;
    /**
     * <code>uint64 date = 6;</code>
     */
    public long getDate() {
      return date_;
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
      if (monsterUid_ != 0) {
        output.writeFixed32(1, monsterUid_);
      }
      if (battleId_ != 0) {
        output.writeUInt32(2, battleId_);
      }
      if (stageUid_ != 0) {
        output.writeFixed32(3, stageUid_);
      }
      if (substageUid_ != 0) {
        output.writeFixed32(4, substageUid_);
      }
      if (difficulty_ != com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.StageDifficultyTypeNULL.getNumber()) {
        output.writeEnum(5, difficulty_);
      }
      if (date_ != 0L) {
        output.writeUInt64(6, date_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (monsterUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, monsterUid_);
      }
      if (battleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, battleId_);
      }
      if (stageUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(3, stageUid_);
      }
      if (substageUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(4, substageUid_);
      }
      if (difficulty_ != com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.StageDifficultyTypeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, difficulty_);
      }
      if (date_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, date_);
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
      if (!(obj instanceof com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData other = (com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData) obj;

      boolean result = true;
      result = result && (getMonsterUid()
          == other.getMonsterUid());
      result = result && (getBattleId()
          == other.getBattleId());
      result = result && (getStageUid()
          == other.getStageUid());
      result = result && (getSubstageUid()
          == other.getSubstageUid());
      result = result && difficulty_ == other.difficulty_;
      result = result && (getDate()
          == other.getDate());
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
      hash = (37 * hash) + MONSTER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterUid();
      hash = (37 * hash) + BATTLE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBattleId();
      hash = (37 * hash) + STAGE_UID_FIELD_NUMBER;
      hash = (53 * hash) + getStageUid();
      hash = (37 * hash) + SUBSTAGE_UID_FIELD_NUMBER;
      hash = (53 * hash) + getSubstageUid();
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + difficulty_;
      hash = (37 * hash) + DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDate());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData prototype) {
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
     * Protobuf type {@code msggamedata.MsgMonsterCaptureData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgMonsterCaptureData)
        com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgMonsterCaptureDataOuterClass.internal_static_msggamedata_MsgMonsterCaptureData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgMonsterCaptureDataOuterClass.internal_static_msggamedata_MsgMonsterCaptureData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData.class, com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData.Builder.class);
      }

      // Construct using com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData.newBuilder()
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
        monsterUid_ = 0;

        battleId_ = 0;

        stageUid_ = 0;

        substageUid_ = 0;

        difficulty_ = 0;

        date_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgMonsterCaptureDataOuterClass.internal_static_msggamedata_MsgMonsterCaptureData_descriptor;
      }

      public com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData getDefaultInstanceForType() {
        return com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData.getDefaultInstance();
      }

      public com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData build() {
        com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData buildPartial() {
        com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData result = new com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData(this);
        result.monsterUid_ = monsterUid_;
        result.battleId_ = battleId_;
        result.stageUid_ = stageUid_;
        result.substageUid_ = substageUid_;
        result.difficulty_ = difficulty_;
        result.date_ = date_;
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
        if (other instanceof com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData) {
          return mergeFrom((com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData other) {
        if (other == com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData.getDefaultInstance()) return this;
        if (other.getMonsterUid() != 0) {
          setMonsterUid(other.getMonsterUid());
        }
        if (other.getBattleId() != 0) {
          setBattleId(other.getBattleId());
        }
        if (other.getStageUid() != 0) {
          setStageUid(other.getStageUid());
        }
        if (other.getSubstageUid() != 0) {
          setSubstageUid(other.getSubstageUid());
        }
        if (other.difficulty_ != 0) {
          setDifficultyValue(other.getDifficultyValue());
        }
        if (other.getDate() != 0L) {
          setDate(other.getDate());
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
        com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int monsterUid_ ;
      /**
       * <code>fixed32 monster_uid = 1;</code>
       */
      public int getMonsterUid() {
        return monsterUid_;
      }
      /**
       * <code>fixed32 monster_uid = 1;</code>
       */
      public Builder setMonsterUid(int value) {
        
        monsterUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 monster_uid = 1;</code>
       */
      public Builder clearMonsterUid() {
        
        monsterUid_ = 0;
        onChanged();
        return this;
      }

      private int battleId_ ;
      /**
       * <code>uint32 battle_id = 2;</code>
       */
      public int getBattleId() {
        return battleId_;
      }
      /**
       * <code>uint32 battle_id = 2;</code>
       */
      public Builder setBattleId(int value) {
        
        battleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 battle_id = 2;</code>
       */
      public Builder clearBattleId() {
        
        battleId_ = 0;
        onChanged();
        return this;
      }

      private int stageUid_ ;
      /**
       * <code>fixed32 stage_uid = 3;</code>
       */
      public int getStageUid() {
        return stageUid_;
      }
      /**
       * <code>fixed32 stage_uid = 3;</code>
       */
      public Builder setStageUid(int value) {
        
        stageUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 stage_uid = 3;</code>
       */
      public Builder clearStageUid() {
        
        stageUid_ = 0;
        onChanged();
        return this;
      }

      private int substageUid_ ;
      /**
       * <code>fixed32 substage_uid = 4;</code>
       */
      public int getSubstageUid() {
        return substageUid_;
      }
      /**
       * <code>fixed32 substage_uid = 4;</code>
       */
      public Builder setSubstageUid(int value) {
        
        substageUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 substage_uid = 4;</code>
       */
      public Builder clearSubstageUid() {
        
        substageUid_ = 0;
        onChanged();
        return this;
      }

      private int difficulty_ = 0;
      /**
       * <code>.msggamedata.StageDifficultyType difficulty = 5;</code>
       */
      public int getDifficultyValue() {
        return difficulty_;
      }
      /**
       * <code>.msggamedata.StageDifficultyType difficulty = 5;</code>
       */
      public Builder setDifficultyValue(int value) {
        difficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.StageDifficultyType difficulty = 5;</code>
       */
      public com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType getDifficulty() {
        com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType result = com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.valueOf(difficulty_);
        return result == null ? com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.StageDifficultyType difficulty = 5;</code>
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
       * <code>.msggamedata.StageDifficultyType difficulty = 5;</code>
       */
      public Builder clearDifficulty() {
        
        difficulty_ = 0;
        onChanged();
        return this;
      }

      private long date_ ;
      /**
       * <code>uint64 date = 6;</code>
       */
      public long getDate() {
        return date_;
      }
      /**
       * <code>uint64 date = 6;</code>
       */
      public Builder setDate(long value) {
        
        date_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 date = 6;</code>
       */
      public Builder clearDate() {
        
        date_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgMonsterCaptureData)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgMonsterCaptureData)
    private static final com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData();
    }

    public static com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgMonsterCaptureData>
        PARSER = new com.google.protobuf.AbstractParser<MsgMonsterCaptureData>() {
      public MsgMonsterCaptureData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MsgMonsterCaptureData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgMonsterCaptureData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgMonsterCaptureData> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgMonsterCaptureDataOuterClass.MsgMonsterCaptureData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgMonsterCaptureData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgMonsterCaptureData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033MsgMonsterCaptureData.proto\022\013msggameda" +
      "ta\032\031StageDifficultyType.proto\"\254\001\n\025MsgMon" +
      "sterCaptureData\022\023\n\013monster_uid\030\001 \001(\007\022\021\n\t" +
      "battle_id\030\002 \001(\r\022\021\n\tstage_uid\030\003 \001(\007\022\024\n\014su" +
      "bstage_uid\030\004 \001(\007\0224\n\ndifficulty\030\005 \001(\0162 .m" +
      "sggamedata.StageDifficultyType\022\014\n\004date\030\006" +
      " \001(\004B\023\n\021com.felania.msldbb\006proto3"
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
        }, assigner);
    internal_static_msggamedata_MsgMonsterCaptureData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgMonsterCaptureData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgMonsterCaptureData_descriptor,
        new java.lang.String[] { "MonsterUid", "BattleId", "StageUid", "SubstageUid", "Difficulty", "Date", });
    com.felania.msldb.StageDifficultyTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
