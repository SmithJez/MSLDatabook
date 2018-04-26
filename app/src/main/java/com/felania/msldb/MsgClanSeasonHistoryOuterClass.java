// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgClanSeasonHistory.proto

package com.felania.msldb;

public final class MsgClanSeasonHistoryOuterClass {
  private MsgClanSeasonHistoryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgClanSeasonHistoryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgClanSeasonHistory)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 clan_battle_season_idx = 1;</code>
     */
    int getClanBattleSeasonIdx();

    /**
     * <code>fixed32 stage_uid = 2;</code>
     */
    int getStageUid();

    /**
     * <code>uint32 max_phase_count = 3;</code>
     */
    int getMaxPhaseCount();

    /**
     * <code>uint32 join_phase_count = 4;</code>
     */
    int getJoinPhaseCount();

    /**
     * <code>uint32 cur_boss_level = 5;</code>
     */
    int getCurBossLevel();

    /**
     * <code>uint64 cur_boss_hp = 6;</code>
     */
    long getCurBossHp();
  }
  /**
   * Protobuf type {@code msggamedata.MsgClanSeasonHistory}
   */
  public  static final class MsgClanSeasonHistory extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgClanSeasonHistory)
      MsgClanSeasonHistoryOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgClanSeasonHistory.newBuilder() to construct.
    private MsgClanSeasonHistory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgClanSeasonHistory() {
      clanBattleSeasonIdx_ = 0;
      stageUid_ = 0;
      maxPhaseCount_ = 0;
      joinPhaseCount_ = 0;
      curBossLevel_ = 0;
      curBossHp_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgClanSeasonHistory(
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

              clanBattleSeasonIdx_ = input.readUInt32();
              break;
            }
            case 21: {

              stageUid_ = input.readFixed32();
              break;
            }
            case 24: {

              maxPhaseCount_ = input.readUInt32();
              break;
            }
            case 32: {

              joinPhaseCount_ = input.readUInt32();
              break;
            }
            case 40: {

              curBossLevel_ = input.readUInt32();
              break;
            }
            case 48: {

              curBossHp_ = input.readUInt64();
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
      return com.felania.msldb.MsgClanSeasonHistoryOuterClass.internal_static_msggamedata_MsgClanSeasonHistory_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgClanSeasonHistoryOuterClass.internal_static_msggamedata_MsgClanSeasonHistory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory.class, com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory.Builder.class);
    }

    public static final int CLAN_BATTLE_SEASON_IDX_FIELD_NUMBER = 1;
    private int clanBattleSeasonIdx_;
    /**
     * <code>uint32 clan_battle_season_idx = 1;</code>
     */
    public int getClanBattleSeasonIdx() {
      return clanBattleSeasonIdx_;
    }

    public static final int STAGE_UID_FIELD_NUMBER = 2;
    private int stageUid_;
    /**
     * <code>fixed32 stage_uid = 2;</code>
     */
    public int getStageUid() {
      return stageUid_;
    }

    public static final int MAX_PHASE_COUNT_FIELD_NUMBER = 3;
    private int maxPhaseCount_;
    /**
     * <code>uint32 max_phase_count = 3;</code>
     */
    public int getMaxPhaseCount() {
      return maxPhaseCount_;
    }

    public static final int JOIN_PHASE_COUNT_FIELD_NUMBER = 4;
    private int joinPhaseCount_;
    /**
     * <code>uint32 join_phase_count = 4;</code>
     */
    public int getJoinPhaseCount() {
      return joinPhaseCount_;
    }

    public static final int CUR_BOSS_LEVEL_FIELD_NUMBER = 5;
    private int curBossLevel_;
    /**
     * <code>uint32 cur_boss_level = 5;</code>
     */
    public int getCurBossLevel() {
      return curBossLevel_;
    }

    public static final int CUR_BOSS_HP_FIELD_NUMBER = 6;
    private long curBossHp_;
    /**
     * <code>uint64 cur_boss_hp = 6;</code>
     */
    public long getCurBossHp() {
      return curBossHp_;
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
      if (clanBattleSeasonIdx_ != 0) {
        output.writeUInt32(1, clanBattleSeasonIdx_);
      }
      if (stageUid_ != 0) {
        output.writeFixed32(2, stageUid_);
      }
      if (maxPhaseCount_ != 0) {
        output.writeUInt32(3, maxPhaseCount_);
      }
      if (joinPhaseCount_ != 0) {
        output.writeUInt32(4, joinPhaseCount_);
      }
      if (curBossLevel_ != 0) {
        output.writeUInt32(5, curBossLevel_);
      }
      if (curBossHp_ != 0L) {
        output.writeUInt64(6, curBossHp_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (clanBattleSeasonIdx_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, clanBattleSeasonIdx_);
      }
      if (stageUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(2, stageUid_);
      }
      if (maxPhaseCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, maxPhaseCount_);
      }
      if (joinPhaseCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, joinPhaseCount_);
      }
      if (curBossLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, curBossLevel_);
      }
      if (curBossHp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, curBossHp_);
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
      if (!(obj instanceof com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory other = (com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory) obj;

      boolean result = true;
      result = result && (getClanBattleSeasonIdx()
          == other.getClanBattleSeasonIdx());
      result = result && (getStageUid()
          == other.getStageUid());
      result = result && (getMaxPhaseCount()
          == other.getMaxPhaseCount());
      result = result && (getJoinPhaseCount()
          == other.getJoinPhaseCount());
      result = result && (getCurBossLevel()
          == other.getCurBossLevel());
      result = result && (getCurBossHp()
          == other.getCurBossHp());
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
      hash = (37 * hash) + CLAN_BATTLE_SEASON_IDX_FIELD_NUMBER;
      hash = (53 * hash) + getClanBattleSeasonIdx();
      hash = (37 * hash) + STAGE_UID_FIELD_NUMBER;
      hash = (53 * hash) + getStageUid();
      hash = (37 * hash) + MAX_PHASE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMaxPhaseCount();
      hash = (37 * hash) + JOIN_PHASE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getJoinPhaseCount();
      hash = (37 * hash) + CUR_BOSS_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getCurBossLevel();
      hash = (37 * hash) + CUR_BOSS_HP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCurBossHp());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory prototype) {
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
     * Protobuf type {@code msggamedata.MsgClanSeasonHistory}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgClanSeasonHistory)
        com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistoryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgClanSeasonHistoryOuterClass.internal_static_msggamedata_MsgClanSeasonHistory_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgClanSeasonHistoryOuterClass.internal_static_msggamedata_MsgClanSeasonHistory_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory.class, com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory.Builder.class);
      }

      // Construct using com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory.newBuilder()
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
        clanBattleSeasonIdx_ = 0;

        stageUid_ = 0;

        maxPhaseCount_ = 0;

        joinPhaseCount_ = 0;

        curBossLevel_ = 0;

        curBossHp_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgClanSeasonHistoryOuterClass.internal_static_msggamedata_MsgClanSeasonHistory_descriptor;
      }

      public com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory getDefaultInstanceForType() {
        return com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory.getDefaultInstance();
      }

      public com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory build() {
        com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory buildPartial() {
        com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory result = new com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory(this);
        result.clanBattleSeasonIdx_ = clanBattleSeasonIdx_;
        result.stageUid_ = stageUid_;
        result.maxPhaseCount_ = maxPhaseCount_;
        result.joinPhaseCount_ = joinPhaseCount_;
        result.curBossLevel_ = curBossLevel_;
        result.curBossHp_ = curBossHp_;
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
        if (other instanceof com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory) {
          return mergeFrom((com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory other) {
        if (other == com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory.getDefaultInstance()) return this;
        if (other.getClanBattleSeasonIdx() != 0) {
          setClanBattleSeasonIdx(other.getClanBattleSeasonIdx());
        }
        if (other.getStageUid() != 0) {
          setStageUid(other.getStageUid());
        }
        if (other.getMaxPhaseCount() != 0) {
          setMaxPhaseCount(other.getMaxPhaseCount());
        }
        if (other.getJoinPhaseCount() != 0) {
          setJoinPhaseCount(other.getJoinPhaseCount());
        }
        if (other.getCurBossLevel() != 0) {
          setCurBossLevel(other.getCurBossLevel());
        }
        if (other.getCurBossHp() != 0L) {
          setCurBossHp(other.getCurBossHp());
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
        com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int clanBattleSeasonIdx_ ;
      /**
       * <code>uint32 clan_battle_season_idx = 1;</code>
       */
      public int getClanBattleSeasonIdx() {
        return clanBattleSeasonIdx_;
      }
      /**
       * <code>uint32 clan_battle_season_idx = 1;</code>
       */
      public Builder setClanBattleSeasonIdx(int value) {
        
        clanBattleSeasonIdx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 clan_battle_season_idx = 1;</code>
       */
      public Builder clearClanBattleSeasonIdx() {
        
        clanBattleSeasonIdx_ = 0;
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

      private int maxPhaseCount_ ;
      /**
       * <code>uint32 max_phase_count = 3;</code>
       */
      public int getMaxPhaseCount() {
        return maxPhaseCount_;
      }
      /**
       * <code>uint32 max_phase_count = 3;</code>
       */
      public Builder setMaxPhaseCount(int value) {
        
        maxPhaseCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_phase_count = 3;</code>
       */
      public Builder clearMaxPhaseCount() {
        
        maxPhaseCount_ = 0;
        onChanged();
        return this;
      }

      private int joinPhaseCount_ ;
      /**
       * <code>uint32 join_phase_count = 4;</code>
       */
      public int getJoinPhaseCount() {
        return joinPhaseCount_;
      }
      /**
       * <code>uint32 join_phase_count = 4;</code>
       */
      public Builder setJoinPhaseCount(int value) {
        
        joinPhaseCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 join_phase_count = 4;</code>
       */
      public Builder clearJoinPhaseCount() {
        
        joinPhaseCount_ = 0;
        onChanged();
        return this;
      }

      private int curBossLevel_ ;
      /**
       * <code>uint32 cur_boss_level = 5;</code>
       */
      public int getCurBossLevel() {
        return curBossLevel_;
      }
      /**
       * <code>uint32 cur_boss_level = 5;</code>
       */
      public Builder setCurBossLevel(int value) {
        
        curBossLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_boss_level = 5;</code>
       */
      public Builder clearCurBossLevel() {
        
        curBossLevel_ = 0;
        onChanged();
        return this;
      }

      private long curBossHp_ ;
      /**
       * <code>uint64 cur_boss_hp = 6;</code>
       */
      public long getCurBossHp() {
        return curBossHp_;
      }
      /**
       * <code>uint64 cur_boss_hp = 6;</code>
       */
      public Builder setCurBossHp(long value) {
        
        curBossHp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 cur_boss_hp = 6;</code>
       */
      public Builder clearCurBossHp() {
        
        curBossHp_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgClanSeasonHistory)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgClanSeasonHistory)
    private static final com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory();
    }

    public static com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgClanSeasonHistory>
        PARSER = new com.google.protobuf.AbstractParser<MsgClanSeasonHistory>() {
      public MsgClanSeasonHistory parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgClanSeasonHistory(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgClanSeasonHistory> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgClanSeasonHistory> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgClanSeasonHistoryOuterClass.MsgClanSeasonHistory getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgClanSeasonHistory_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgClanSeasonHistory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032MsgClanSeasonHistory.proto\022\013msggamedat" +
      "a\"\251\001\n\024MsgClanSeasonHistory\022\036\n\026clan_battl" +
      "e_season_idx\030\001 \001(\r\022\021\n\tstage_uid\030\002 \001(\007\022\027\n" +
      "\017max_phase_count\030\003 \001(\r\022\030\n\020join_phase_cou" +
      "nt\030\004 \001(\r\022\026\n\016cur_boss_level\030\005 \001(\r\022\023\n\013cur_" +
      "boss_hp\030\006 \001(\004B\023\n\021com.felania.msldbb\006prot" +
      "o3"
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
    internal_static_msggamedata_MsgClanSeasonHistory_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgClanSeasonHistory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgClanSeasonHistory_descriptor,
        new java.lang.String[] { "ClanBattleSeasonIdx", "StageUid", "MaxPhaseCount", "JoinPhaseCount", "CurBossLevel", "CurBossHp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
