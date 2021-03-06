// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgUserBingoData.proto

package com.felania.msldb;

public final class MsgUserBingoDataOuterClass {
  private MsgUserBingoDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgUserBingoDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgUserBingoData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 user_id = 1;</code>
     */
    long getUserId();

    /**
     * <code>fixed32 bingo_season_uid = 2;</code>
     */
    int getBingoSeasonUid();

    /**
     * <code>uint32 bingo_set = 3;</code>
     */
    int getBingoSet();

    /**
     * <code>uint32 bingo_phase = 4;</code>
     */
    int getBingoPhase();

    /**
     * <code>uint32 bingo_state = 5;</code>
     */
    int getBingoState();

    /**
     * <code>uint64 last_login_time = 6;</code>
     */
    long getLastLoginTime();

    /**
     * <code>bool is_bingo_change = 7;</code>
     */
    boolean getIsBingoChange();
  }
  /**
   * Protobuf type {@code msggamedata.MsgUserBingoData}
   */
  public  static final class MsgUserBingoData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgUserBingoData)
      MsgUserBingoDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgUserBingoData.newBuilder() to construct.
    private MsgUserBingoData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgUserBingoData() {
      userId_ = 0L;
      bingoSeasonUid_ = 0;
      bingoSet_ = 0;
      bingoPhase_ = 0;
      bingoState_ = 0;
      lastLoginTime_ = 0L;
      isBingoChange_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgUserBingoData(
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

              userId_ = input.readUInt64();
              break;
            }
            case 21: {

              bingoSeasonUid_ = input.readFixed32();
              break;
            }
            case 24: {

              bingoSet_ = input.readUInt32();
              break;
            }
            case 32: {

              bingoPhase_ = input.readUInt32();
              break;
            }
            case 40: {

              bingoState_ = input.readUInt32();
              break;
            }
            case 48: {

              lastLoginTime_ = input.readUInt64();
              break;
            }
            case 56: {

              isBingoChange_ = input.readBool();
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
      return com.felania.msldb.MsgUserBingoDataOuterClass.internal_static_msggamedata_MsgUserBingoData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgUserBingoDataOuterClass.internal_static_msggamedata_MsgUserBingoData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData.class, com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData.Builder.class);
    }

    public static final int USER_ID_FIELD_NUMBER = 1;
    private long userId_;
    /**
     * <code>uint64 user_id = 1;</code>
     */
    public long getUserId() {
      return userId_;
    }

    public static final int BINGO_SEASON_UID_FIELD_NUMBER = 2;
    private int bingoSeasonUid_;
    /**
     * <code>fixed32 bingo_season_uid = 2;</code>
     */
    public int getBingoSeasonUid() {
      return bingoSeasonUid_;
    }

    public static final int BINGO_SET_FIELD_NUMBER = 3;
    private int bingoSet_;
    /**
     * <code>uint32 bingo_set = 3;</code>
     */
    public int getBingoSet() {
      return bingoSet_;
    }

    public static final int BINGO_PHASE_FIELD_NUMBER = 4;
    private int bingoPhase_;
    /**
     * <code>uint32 bingo_phase = 4;</code>
     */
    public int getBingoPhase() {
      return bingoPhase_;
    }

    public static final int BINGO_STATE_FIELD_NUMBER = 5;
    private int bingoState_;
    /**
     * <code>uint32 bingo_state = 5;</code>
     */
    public int getBingoState() {
      return bingoState_;
    }

    public static final int LAST_LOGIN_TIME_FIELD_NUMBER = 6;
    private long lastLoginTime_;
    /**
     * <code>uint64 last_login_time = 6;</code>
     */
    public long getLastLoginTime() {
      return lastLoginTime_;
    }

    public static final int IS_BINGO_CHANGE_FIELD_NUMBER = 7;
    private boolean isBingoChange_;
    /**
     * <code>bool is_bingo_change = 7;</code>
     */
    public boolean getIsBingoChange() {
      return isBingoChange_;
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
      if (userId_ != 0L) {
        output.writeUInt64(1, userId_);
      }
      if (bingoSeasonUid_ != 0) {
        output.writeFixed32(2, bingoSeasonUid_);
      }
      if (bingoSet_ != 0) {
        output.writeUInt32(3, bingoSet_);
      }
      if (bingoPhase_ != 0) {
        output.writeUInt32(4, bingoPhase_);
      }
      if (bingoState_ != 0) {
        output.writeUInt32(5, bingoState_);
      }
      if (lastLoginTime_ != 0L) {
        output.writeUInt64(6, lastLoginTime_);
      }
      if (isBingoChange_ != false) {
        output.writeBool(7, isBingoChange_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (userId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, userId_);
      }
      if (bingoSeasonUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(2, bingoSeasonUid_);
      }
      if (bingoSet_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, bingoSet_);
      }
      if (bingoPhase_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, bingoPhase_);
      }
      if (bingoState_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, bingoState_);
      }
      if (lastLoginTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, lastLoginTime_);
      }
      if (isBingoChange_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isBingoChange_);
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
      if (!(obj instanceof com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData other = (com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData) obj;

      boolean result = true;
      result = result && (getUserId()
          == other.getUserId());
      result = result && (getBingoSeasonUid()
          == other.getBingoSeasonUid());
      result = result && (getBingoSet()
          == other.getBingoSet());
      result = result && (getBingoPhase()
          == other.getBingoPhase());
      result = result && (getBingoState()
          == other.getBingoState());
      result = result && (getLastLoginTime()
          == other.getLastLoginTime());
      result = result && (getIsBingoChange()
          == other.getIsBingoChange());
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
      hash = (37 * hash) + USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUserId());
      hash = (37 * hash) + BINGO_SEASON_UID_FIELD_NUMBER;
      hash = (53 * hash) + getBingoSeasonUid();
      hash = (37 * hash) + BINGO_SET_FIELD_NUMBER;
      hash = (53 * hash) + getBingoSet();
      hash = (37 * hash) + BINGO_PHASE_FIELD_NUMBER;
      hash = (53 * hash) + getBingoPhase();
      hash = (37 * hash) + BINGO_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getBingoState();
      hash = (37 * hash) + LAST_LOGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLastLoginTime());
      hash = (37 * hash) + IS_BINGO_CHANGE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsBingoChange());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData prototype) {
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
     * Protobuf type {@code msggamedata.MsgUserBingoData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgUserBingoData)
        com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgUserBingoDataOuterClass.internal_static_msggamedata_MsgUserBingoData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgUserBingoDataOuterClass.internal_static_msggamedata_MsgUserBingoData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData.class, com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData.Builder.class);
      }

      // Construct using com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData.newBuilder()
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
        userId_ = 0L;

        bingoSeasonUid_ = 0;

        bingoSet_ = 0;

        bingoPhase_ = 0;

        bingoState_ = 0;

        lastLoginTime_ = 0L;

        isBingoChange_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgUserBingoDataOuterClass.internal_static_msggamedata_MsgUserBingoData_descriptor;
      }

      public com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData getDefaultInstanceForType() {
        return com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData.getDefaultInstance();
      }

      public com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData build() {
        com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData buildPartial() {
        com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData result = new com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData(this);
        result.userId_ = userId_;
        result.bingoSeasonUid_ = bingoSeasonUid_;
        result.bingoSet_ = bingoSet_;
        result.bingoPhase_ = bingoPhase_;
        result.bingoState_ = bingoState_;
        result.lastLoginTime_ = lastLoginTime_;
        result.isBingoChange_ = isBingoChange_;
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
        if (other instanceof com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData) {
          return mergeFrom((com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData other) {
        if (other == com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData.getDefaultInstance()) return this;
        if (other.getUserId() != 0L) {
          setUserId(other.getUserId());
        }
        if (other.getBingoSeasonUid() != 0) {
          setBingoSeasonUid(other.getBingoSeasonUid());
        }
        if (other.getBingoSet() != 0) {
          setBingoSet(other.getBingoSet());
        }
        if (other.getBingoPhase() != 0) {
          setBingoPhase(other.getBingoPhase());
        }
        if (other.getBingoState() != 0) {
          setBingoState(other.getBingoState());
        }
        if (other.getLastLoginTime() != 0L) {
          setLastLoginTime(other.getLastLoginTime());
        }
        if (other.getIsBingoChange() != false) {
          setIsBingoChange(other.getIsBingoChange());
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
        com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long userId_ ;
      /**
       * <code>uint64 user_id = 1;</code>
       */
      public long getUserId() {
        return userId_;
      }
      /**
       * <code>uint64 user_id = 1;</code>
       */
      public Builder setUserId(long value) {
        
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 user_id = 1;</code>
       */
      public Builder clearUserId() {
        
        userId_ = 0L;
        onChanged();
        return this;
      }

      private int bingoSeasonUid_ ;
      /**
       * <code>fixed32 bingo_season_uid = 2;</code>
       */
      public int getBingoSeasonUid() {
        return bingoSeasonUid_;
      }
      /**
       * <code>fixed32 bingo_season_uid = 2;</code>
       */
      public Builder setBingoSeasonUid(int value) {
        
        bingoSeasonUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 bingo_season_uid = 2;</code>
       */
      public Builder clearBingoSeasonUid() {
        
        bingoSeasonUid_ = 0;
        onChanged();
        return this;
      }

      private int bingoSet_ ;
      /**
       * <code>uint32 bingo_set = 3;</code>
       */
      public int getBingoSet() {
        return bingoSet_;
      }
      /**
       * <code>uint32 bingo_set = 3;</code>
       */
      public Builder setBingoSet(int value) {
        
        bingoSet_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bingo_set = 3;</code>
       */
      public Builder clearBingoSet() {
        
        bingoSet_ = 0;
        onChanged();
        return this;
      }

      private int bingoPhase_ ;
      /**
       * <code>uint32 bingo_phase = 4;</code>
       */
      public int getBingoPhase() {
        return bingoPhase_;
      }
      /**
       * <code>uint32 bingo_phase = 4;</code>
       */
      public Builder setBingoPhase(int value) {
        
        bingoPhase_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bingo_phase = 4;</code>
       */
      public Builder clearBingoPhase() {
        
        bingoPhase_ = 0;
        onChanged();
        return this;
      }

      private int bingoState_ ;
      /**
       * <code>uint32 bingo_state = 5;</code>
       */
      public int getBingoState() {
        return bingoState_;
      }
      /**
       * <code>uint32 bingo_state = 5;</code>
       */
      public Builder setBingoState(int value) {
        
        bingoState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bingo_state = 5;</code>
       */
      public Builder clearBingoState() {
        
        bingoState_ = 0;
        onChanged();
        return this;
      }

      private long lastLoginTime_ ;
      /**
       * <code>uint64 last_login_time = 6;</code>
       */
      public long getLastLoginTime() {
        return lastLoginTime_;
      }
      /**
       * <code>uint64 last_login_time = 6;</code>
       */
      public Builder setLastLoginTime(long value) {
        
        lastLoginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 last_login_time = 6;</code>
       */
      public Builder clearLastLoginTime() {
        
        lastLoginTime_ = 0L;
        onChanged();
        return this;
      }

      private boolean isBingoChange_ ;
      /**
       * <code>bool is_bingo_change = 7;</code>
       */
      public boolean getIsBingoChange() {
        return isBingoChange_;
      }
      /**
       * <code>bool is_bingo_change = 7;</code>
       */
      public Builder setIsBingoChange(boolean value) {
        
        isBingoChange_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_bingo_change = 7;</code>
       */
      public Builder clearIsBingoChange() {
        
        isBingoChange_ = false;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgUserBingoData)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgUserBingoData)
    private static final com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData();
    }

    public static com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgUserBingoData>
        PARSER = new com.google.protobuf.AbstractParser<MsgUserBingoData>() {
      public MsgUserBingoData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgUserBingoData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgUserBingoData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgUserBingoData> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgUserBingoDataOuterClass.MsgUserBingoData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgUserBingoData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgUserBingoData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026MsgUserBingoData.proto\022\013msggamedata\"\254\001" +
      "\n\020MsgUserBingoData\022\017\n\007user_id\030\001 \001(\004\022\030\n\020b" +
      "ingo_season_uid\030\002 \001(\007\022\021\n\tbingo_set\030\003 \001(\r" +
      "\022\023\n\013bingo_phase\030\004 \001(\r\022\023\n\013bingo_state\030\005 \001" +
      "(\r\022\027\n\017last_login_time\030\006 \001(\004\022\027\n\017is_bingo_" +
      "change\030\007 \001(\010B\023\n\021com.felania.msldbb\006proto" +
      "3"
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
    internal_static_msggamedata_MsgUserBingoData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgUserBingoData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgUserBingoData_descriptor,
        new java.lang.String[] { "UserId", "BingoSeasonUid", "BingoSet", "BingoPhase", "BingoState", "LastLoginTime", "IsBingoChange", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
