// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgFriendDungeonFindHistory.proto

package com.felania.msldb;

public final class MsgFriendDungeonFindHistoryOuterClass {
  private MsgFriendDungeonFindHistoryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgFriendDungeonFindHistoryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgFriendDungeonFindHistory)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 id = 1;</code>
     */
    long getId();

    /**
     * <code>uint64 finder_id = 2;</code>
     */
    long getFinderId();

    /**
     * <code>fixed32 dungeon_uid = 3;</code>
     */
    int getDungeonUid();

    /**
     * <code>uint64 expired_date = 4;</code>
     */
    long getExpiredDate();

    /**
     * <code>.msggamedata.FriendDungeonType type = 5;</code>
     */
    int getTypeValue();
    /**
     * <code>.msggamedata.FriendDungeonType type = 5;</code>
     */
    com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType getType();

    /**
     * <code>uint64 sgd_date_id = 7;</code>
     */
    long getSgdDateId();

    /**
     * <code>uint64 open_date = 8;</code>
     */
    long getOpenDate();

    /**
     * <code>uint32 goal_count = 9;</code>
     */
    int getGoalCount();

    /**
     * <code>uint32 clear_count = 10;</code>
     */
    int getClearCount();
  }
  /**
   * Protobuf type {@code msggamedata.MsgFriendDungeonFindHistory}
   */
  public  static final class MsgFriendDungeonFindHistory extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgFriendDungeonFindHistory)
      MsgFriendDungeonFindHistoryOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgFriendDungeonFindHistory.newBuilder() to construct.
    private MsgFriendDungeonFindHistory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgFriendDungeonFindHistory() {
      id_ = 0L;
      finderId_ = 0L;
      dungeonUid_ = 0;
      expiredDate_ = 0L;
      type_ = 0;
      sgdDateId_ = 0L;
      openDate_ = 0L;
      goalCount_ = 0;
      clearCount_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgFriendDungeonFindHistory(
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

              id_ = input.readUInt64();
              break;
            }
            case 16: {

              finderId_ = input.readUInt64();
              break;
            }
            case 29: {

              dungeonUid_ = input.readFixed32();
              break;
            }
            case 32: {

              expiredDate_ = input.readUInt64();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 56: {

              sgdDateId_ = input.readUInt64();
              break;
            }
            case 64: {

              openDate_ = input.readUInt64();
              break;
            }
            case 72: {

              goalCount_ = input.readUInt32();
              break;
            }
            case 80: {

              clearCount_ = input.readUInt32();
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
      return com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.internal_static_msggamedata_MsgFriendDungeonFindHistory_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.internal_static_msggamedata_MsgFriendDungeonFindHistory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory.class, com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>uint64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    public static final int FINDER_ID_FIELD_NUMBER = 2;
    private long finderId_;
    /**
     * <code>uint64 finder_id = 2;</code>
     */
    public long getFinderId() {
      return finderId_;
    }

    public static final int DUNGEON_UID_FIELD_NUMBER = 3;
    private int dungeonUid_;
    /**
     * <code>fixed32 dungeon_uid = 3;</code>
     */
    public int getDungeonUid() {
      return dungeonUid_;
    }

    public static final int EXPIRED_DATE_FIELD_NUMBER = 4;
    private long expiredDate_;
    /**
     * <code>uint64 expired_date = 4;</code>
     */
    public long getExpiredDate() {
      return expiredDate_;
    }

    public static final int TYPE_FIELD_NUMBER = 5;
    private int type_;
    /**
     * <code>.msggamedata.FriendDungeonType type = 5;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.msggamedata.FriendDungeonType type = 5;</code>
     */
    public com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType getType() {
      com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType result = com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType.valueOf(type_);
      return result == null ? com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType.UNRECOGNIZED : result;
    }

    public static final int SGD_DATE_ID_FIELD_NUMBER = 7;
    private long sgdDateId_;
    /**
     * <code>uint64 sgd_date_id = 7;</code>
     */
    public long getSgdDateId() {
      return sgdDateId_;
    }

    public static final int OPEN_DATE_FIELD_NUMBER = 8;
    private long openDate_;
    /**
     * <code>uint64 open_date = 8;</code>
     */
    public long getOpenDate() {
      return openDate_;
    }

    public static final int GOAL_COUNT_FIELD_NUMBER = 9;
    private int goalCount_;
    /**
     * <code>uint32 goal_count = 9;</code>
     */
    public int getGoalCount() {
      return goalCount_;
    }

    public static final int CLEAR_COUNT_FIELD_NUMBER = 10;
    private int clearCount_;
    /**
     * <code>uint32 clear_count = 10;</code>
     */
    public int getClearCount() {
      return clearCount_;
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
      if (id_ != 0L) {
        output.writeUInt64(1, id_);
      }
      if (finderId_ != 0L) {
        output.writeUInt64(2, finderId_);
      }
      if (dungeonUid_ != 0) {
        output.writeFixed32(3, dungeonUid_);
      }
      if (expiredDate_ != 0L) {
        output.writeUInt64(4, expiredDate_);
      }
      if (type_ != com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType.FDT_None.getNumber()) {
        output.writeEnum(5, type_);
      }
      if (sgdDateId_ != 0L) {
        output.writeUInt64(7, sgdDateId_);
      }
      if (openDate_ != 0L) {
        output.writeUInt64(8, openDate_);
      }
      if (goalCount_ != 0) {
        output.writeUInt32(9, goalCount_);
      }
      if (clearCount_ != 0) {
        output.writeUInt32(10, clearCount_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, id_);
      }
      if (finderId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, finderId_);
      }
      if (dungeonUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(3, dungeonUid_);
      }
      if (expiredDate_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, expiredDate_);
      }
      if (type_ != com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType.FDT_None.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, type_);
      }
      if (sgdDateId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, sgdDateId_);
      }
      if (openDate_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, openDate_);
      }
      if (goalCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, goalCount_);
      }
      if (clearCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, clearCount_);
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
      if (!(obj instanceof com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory other = (com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory) obj;

      boolean result = true;
      result = result && (getId()
          == other.getId());
      result = result && (getFinderId()
          == other.getFinderId());
      result = result && (getDungeonUid()
          == other.getDungeonUid());
      result = result && (getExpiredDate()
          == other.getExpiredDate());
      result = result && type_ == other.type_;
      result = result && (getSgdDateId()
          == other.getSgdDateId());
      result = result && (getOpenDate()
          == other.getOpenDate());
      result = result && (getGoalCount()
          == other.getGoalCount());
      result = result && (getClearCount()
          == other.getClearCount());
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + FINDER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFinderId());
      hash = (37 * hash) + DUNGEON_UID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonUid();
      hash = (37 * hash) + EXPIRED_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getExpiredDate());
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + SGD_DATE_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSgdDateId());
      hash = (37 * hash) + OPEN_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getOpenDate());
      hash = (37 * hash) + GOAL_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getGoalCount();
      hash = (37 * hash) + CLEAR_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getClearCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory prototype) {
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
     * Protobuf type {@code msggamedata.MsgFriendDungeonFindHistory}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgFriendDungeonFindHistory)
        com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistoryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.internal_static_msggamedata_MsgFriendDungeonFindHistory_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.internal_static_msggamedata_MsgFriendDungeonFindHistory_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory.class, com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory.Builder.class);
      }

      // Construct using com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory.newBuilder()
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
        id_ = 0L;

        finderId_ = 0L;

        dungeonUid_ = 0;

        expiredDate_ = 0L;

        type_ = 0;

        sgdDateId_ = 0L;

        openDate_ = 0L;

        goalCount_ = 0;

        clearCount_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.internal_static_msggamedata_MsgFriendDungeonFindHistory_descriptor;
      }

      public com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory getDefaultInstanceForType() {
        return com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory.getDefaultInstance();
      }

      public com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory build() {
        com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory buildPartial() {
        com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory result = new com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory(this);
        result.id_ = id_;
        result.finderId_ = finderId_;
        result.dungeonUid_ = dungeonUid_;
        result.expiredDate_ = expiredDate_;
        result.type_ = type_;
        result.sgdDateId_ = sgdDateId_;
        result.openDate_ = openDate_;
        result.goalCount_ = goalCount_;
        result.clearCount_ = clearCount_;
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
        if (other instanceof com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory) {
          return mergeFrom((com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory other) {
        if (other == com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (other.getFinderId() != 0L) {
          setFinderId(other.getFinderId());
        }
        if (other.getDungeonUid() != 0) {
          setDungeonUid(other.getDungeonUid());
        }
        if (other.getExpiredDate() != 0L) {
          setExpiredDate(other.getExpiredDate());
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.getSgdDateId() != 0L) {
          setSgdDateId(other.getSgdDateId());
        }
        if (other.getOpenDate() != 0L) {
          setOpenDate(other.getOpenDate());
        }
        if (other.getGoalCount() != 0) {
          setGoalCount(other.getGoalCount());
        }
        if (other.getClearCount() != 0) {
          setClearCount(other.getClearCount());
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
        com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long id_ ;
      /**
       * <code>uint64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>uint64 id = 1;</code>
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private long finderId_ ;
      /**
       * <code>uint64 finder_id = 2;</code>
       */
      public long getFinderId() {
        return finderId_;
      }
      /**
       * <code>uint64 finder_id = 2;</code>
       */
      public Builder setFinderId(long value) {
        
        finderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 finder_id = 2;</code>
       */
      public Builder clearFinderId() {
        
        finderId_ = 0L;
        onChanged();
        return this;
      }

      private int dungeonUid_ ;
      /**
       * <code>fixed32 dungeon_uid = 3;</code>
       */
      public int getDungeonUid() {
        return dungeonUid_;
      }
      /**
       * <code>fixed32 dungeon_uid = 3;</code>
       */
      public Builder setDungeonUid(int value) {
        
        dungeonUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 dungeon_uid = 3;</code>
       */
      public Builder clearDungeonUid() {
        
        dungeonUid_ = 0;
        onChanged();
        return this;
      }

      private long expiredDate_ ;
      /**
       * <code>uint64 expired_date = 4;</code>
       */
      public long getExpiredDate() {
        return expiredDate_;
      }
      /**
       * <code>uint64 expired_date = 4;</code>
       */
      public Builder setExpiredDate(long value) {
        
        expiredDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 expired_date = 4;</code>
       */
      public Builder clearExpiredDate() {
        
        expiredDate_ = 0L;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.msggamedata.FriendDungeonType type = 5;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.msggamedata.FriendDungeonType type = 5;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.FriendDungeonType type = 5;</code>
       */
      public com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType getType() {
        com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType result = com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType.valueOf(type_);
        return result == null ? com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.FriendDungeonType type = 5;</code>
       */
      public Builder setType(com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.FriendDungeonType type = 5;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private long sgdDateId_ ;
      /**
       * <code>uint64 sgd_date_id = 7;</code>
       */
      public long getSgdDateId() {
        return sgdDateId_;
      }
      /**
       * <code>uint64 sgd_date_id = 7;</code>
       */
      public Builder setSgdDateId(long value) {
        
        sgdDateId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 sgd_date_id = 7;</code>
       */
      public Builder clearSgdDateId() {
        
        sgdDateId_ = 0L;
        onChanged();
        return this;
      }

      private long openDate_ ;
      /**
       * <code>uint64 open_date = 8;</code>
       */
      public long getOpenDate() {
        return openDate_;
      }
      /**
       * <code>uint64 open_date = 8;</code>
       */
      public Builder setOpenDate(long value) {
        
        openDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 open_date = 8;</code>
       */
      public Builder clearOpenDate() {
        
        openDate_ = 0L;
        onChanged();
        return this;
      }

      private int goalCount_ ;
      /**
       * <code>uint32 goal_count = 9;</code>
       */
      public int getGoalCount() {
        return goalCount_;
      }
      /**
       * <code>uint32 goal_count = 9;</code>
       */
      public Builder setGoalCount(int value) {
        
        goalCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 goal_count = 9;</code>
       */
      public Builder clearGoalCount() {
        
        goalCount_ = 0;
        onChanged();
        return this;
      }

      private int clearCount_ ;
      /**
       * <code>uint32 clear_count = 10;</code>
       */
      public int getClearCount() {
        return clearCount_;
      }
      /**
       * <code>uint32 clear_count = 10;</code>
       */
      public Builder setClearCount(int value) {
        
        clearCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 clear_count = 10;</code>
       */
      public Builder clearClearCount() {
        
        clearCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgFriendDungeonFindHistory)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgFriendDungeonFindHistory)
    private static final com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory();
    }

    public static com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgFriendDungeonFindHistory>
        PARSER = new com.google.protobuf.AbstractParser<MsgFriendDungeonFindHistory>() {
      public MsgFriendDungeonFindHistory parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MsgFriendDungeonFindHistory(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgFriendDungeonFindHistory> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgFriendDungeonFindHistory> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgFriendDungeonFindHistoryOuterClass.MsgFriendDungeonFindHistory getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgFriendDungeonFindHistory_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgFriendDungeonFindHistory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!MsgFriendDungeonFindHistory.proto\022\013msg" +
      "gamedata\032\027FriendDungeonType.proto\"\346\001\n\033Ms" +
      "gFriendDungeonFindHistory\022\n\n\002id\030\001 \001(\004\022\021\n" +
      "\tfinder_id\030\002 \001(\004\022\023\n\013dungeon_uid\030\003 \001(\007\022\024\n" +
      "\014expired_date\030\004 \001(\004\022,\n\004type\030\005 \001(\0162\036.msgg" +
      "amedata.FriendDungeonType\022\023\n\013sgd_date_id" +
      "\030\007 \001(\004\022\021\n\topen_date\030\010 \001(\004\022\022\n\ngoal_count\030" +
      "\t \001(\r\022\023\n\013clear_count\030\n \001(\rB\023\n\021com.felani" +
      "a.msldbb\006proto3"
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
          com.felania.msldb.FriendDungeonTypeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgFriendDungeonFindHistory_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgFriendDungeonFindHistory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgFriendDungeonFindHistory_descriptor,
        new java.lang.String[] { "Id", "FinderId", "DungeonUid", "ExpiredDate", "Type", "SgdDateId", "OpenDate", "GoalCount", "ClearCount", });
    com.felania.msldb.FriendDungeonTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
