// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgBattleStartFriendDungeon.proto

package com.felania.msldb;

public final class MsgBattleStartFriendDungeonOuterClass {
  private MsgBattleStartFriendDungeonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgBattleStartFriendDungeonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgBattleStartFriendDungeon)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 dungeon_id = 1;</code>
     */
    long getDungeonId();

    /**
     * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
     */
    boolean hasMonsterSlot();
    /**
     * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
     */
    com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData getMonsterSlot();
    /**
     * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
     */
    com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder getMonsterSlotOrBuilder();

    /**
     * <code>uint64 find_user_id = 3;</code>
     */
    long getFindUserId();

    /**
     * <code>.msggamedata.FriendDungeonType type = 4;</code>
     */
    int getTypeValue();
    /**
     * <code>.msggamedata.FriendDungeonType type = 4;</code>
     */
    com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType getType();
  }
  /**
   * Protobuf type {@code msggamedata.MsgBattleStartFriendDungeon}
   */
  public  static final class MsgBattleStartFriendDungeon extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgBattleStartFriendDungeon)
      MsgBattleStartFriendDungeonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgBattleStartFriendDungeon.newBuilder() to construct.
    private MsgBattleStartFriendDungeon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgBattleStartFriendDungeon() {
      dungeonId_ = 0L;
      findUserId_ = 0L;
      type_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgBattleStartFriendDungeon(
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

              dungeonId_ = input.readUInt64();
              break;
            }
            case 18: {
              com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder subBuilder = null;
              if (monsterSlot_ != null) {
                subBuilder = monsterSlot_.toBuilder();
              }
              monsterSlot_ = input.readMessage(com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(monsterSlot_);
                monsterSlot_ = subBuilder.buildPartial();
              }

              break;
            }
            case 24: {

              findUserId_ = input.readUInt64();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              type_ = rawValue;
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
      return com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.internal_static_msggamedata_MsgBattleStartFriendDungeon_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.internal_static_msggamedata_MsgBattleStartFriendDungeon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon.class, com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 1;
    private long dungeonId_;
    /**
     * <code>uint64 dungeon_id = 1;</code>
     */
    public long getDungeonId() {
      return dungeonId_;
    }

    public static final int MONSTER_SLOT_FIELD_NUMBER = 2;
    private com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData monsterSlot_;
    /**
     * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
     */
    public boolean hasMonsterSlot() {
      return monsterSlot_ != null;
    }
    /**
     * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
     */
    public com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData getMonsterSlot() {
      return monsterSlot_ == null ? com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.getDefaultInstance() : monsterSlot_;
    }
    /**
     * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
     */
    public com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder getMonsterSlotOrBuilder() {
      return getMonsterSlot();
    }

    public static final int FIND_USER_ID_FIELD_NUMBER = 3;
    private long findUserId_;
    /**
     * <code>uint64 find_user_id = 3;</code>
     */
    public long getFindUserId() {
      return findUserId_;
    }

    public static final int TYPE_FIELD_NUMBER = 4;
    private int type_;
    /**
     * <code>.msggamedata.FriendDungeonType type = 4;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.msggamedata.FriendDungeonType type = 4;</code>
     */
    public com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType getType() {
      com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType result = com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType.valueOf(type_);
      return result == null ? com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType.UNRECOGNIZED : result;
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
      if (dungeonId_ != 0L) {
        output.writeUInt64(1, dungeonId_);
      }
      if (monsterSlot_ != null) {
        output.writeMessage(2, getMonsterSlot());
      }
      if (findUserId_ != 0L) {
        output.writeUInt64(3, findUserId_);
      }
      if (type_ != com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType.FDT_None.getNumber()) {
        output.writeEnum(4, type_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, dungeonId_);
      }
      if (monsterSlot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getMonsterSlot());
      }
      if (findUserId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, findUserId_);
      }
      if (type_ != com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType.FDT_None.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, type_);
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
      if (!(obj instanceof com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon other = (com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon) obj;

      boolean result = true;
      result = result && (getDungeonId()
          == other.getDungeonId());
      result = result && (hasMonsterSlot() == other.hasMonsterSlot());
      if (hasMonsterSlot()) {
        result = result && getMonsterSlot()
            .equals(other.getMonsterSlot());
      }
      result = result && (getFindUserId()
          == other.getFindUserId());
      result = result && type_ == other.type_;
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
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDungeonId());
      if (hasMonsterSlot()) {
        hash = (37 * hash) + MONSTER_SLOT_FIELD_NUMBER;
        hash = (53 * hash) + getMonsterSlot().hashCode();
      }
      hash = (37 * hash) + FIND_USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFindUserId());
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon prototype) {
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
     * Protobuf type {@code msggamedata.MsgBattleStartFriendDungeon}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgBattleStartFriendDungeon)
        com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.internal_static_msggamedata_MsgBattleStartFriendDungeon_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.internal_static_msggamedata_MsgBattleStartFriendDungeon_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon.class, com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon.Builder.class);
      }

      // Construct using com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon.newBuilder()
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
        dungeonId_ = 0L;

        if (monsterSlotBuilder_ == null) {
          monsterSlot_ = null;
        } else {
          monsterSlot_ = null;
          monsterSlotBuilder_ = null;
        }
        findUserId_ = 0L;

        type_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.internal_static_msggamedata_MsgBattleStartFriendDungeon_descriptor;
      }

      public com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon getDefaultInstanceForType() {
        return com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon.getDefaultInstance();
      }

      public com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon build() {
        com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon buildPartial() {
        com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon result = new com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon(this);
        result.dungeonId_ = dungeonId_;
        if (monsterSlotBuilder_ == null) {
          result.monsterSlot_ = monsterSlot_;
        } else {
          result.monsterSlot_ = monsterSlotBuilder_.build();
        }
        result.findUserId_ = findUserId_;
        result.type_ = type_;
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
        if (other instanceof com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon) {
          return mergeFrom((com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon other) {
        if (other == com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0L) {
          setDungeonId(other.getDungeonId());
        }
        if (other.hasMonsterSlot()) {
          mergeMonsterSlot(other.getMonsterSlot());
        }
        if (other.getFindUserId() != 0L) {
          setFindUserId(other.getFindUserId());
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
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
        com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long dungeonId_ ;
      /**
       * <code>uint64 dungeon_id = 1;</code>
       */
      public long getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint64 dungeon_id = 1;</code>
       */
      public Builder setDungeonId(long value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 dungeon_id = 1;</code>
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0L;
        onChanged();
        return this;
      }

      private com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData monsterSlot_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder> monsterSlotBuilder_;
      /**
       * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
       */
      public boolean hasMonsterSlot() {
        return monsterSlotBuilder_ != null || monsterSlot_ != null;
      }
      /**
       * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
       */
      public com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData getMonsterSlot() {
        if (monsterSlotBuilder_ == null) {
          return monsterSlot_ == null ? com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.getDefaultInstance() : monsterSlot_;
        } else {
          return monsterSlotBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
       */
      public Builder setMonsterSlot(com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData value) {
        if (monsterSlotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          monsterSlot_ = value;
          onChanged();
        } else {
          monsterSlotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
       */
      public Builder setMonsterSlot(
          com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder builderForValue) {
        if (monsterSlotBuilder_ == null) {
          monsterSlot_ = builderForValue.build();
          onChanged();
        } else {
          monsterSlotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
       */
      public Builder mergeMonsterSlot(com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData value) {
        if (monsterSlotBuilder_ == null) {
          if (monsterSlot_ != null) {
            monsterSlot_ =
              com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.newBuilder(monsterSlot_).mergeFrom(value).buildPartial();
          } else {
            monsterSlot_ = value;
          }
          onChanged();
        } else {
          monsterSlotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
       */
      public Builder clearMonsterSlot() {
        if (monsterSlotBuilder_ == null) {
          monsterSlot_ = null;
          onChanged();
        } else {
          monsterSlot_ = null;
          monsterSlotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
       */
      public com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder getMonsterSlotBuilder() {
        
        onChanged();
        return getMonsterSlotFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
       */
      public com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder getMonsterSlotOrBuilder() {
        if (monsterSlotBuilder_ != null) {
          return monsterSlotBuilder_.getMessageOrBuilder();
        } else {
          return monsterSlot_ == null ?
              com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.getDefaultInstance() : monsterSlot_;
        }
      }
      /**
       * <code>.msggamedata.MsgMonsterSlotData monster_slot = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder> 
          getMonsterSlotFieldBuilder() {
        if (monsterSlotBuilder_ == null) {
          monsterSlotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotData.Builder, com.felania.msldb.MsgMonsterSlotDataOuterClass.MsgMonsterSlotDataOrBuilder>(
                  getMonsterSlot(),
                  getParentForChildren(),
                  isClean());
          monsterSlot_ = null;
        }
        return monsterSlotBuilder_;
      }

      private long findUserId_ ;
      /**
       * <code>uint64 find_user_id = 3;</code>
       */
      public long getFindUserId() {
        return findUserId_;
      }
      /**
       * <code>uint64 find_user_id = 3;</code>
       */
      public Builder setFindUserId(long value) {
        
        findUserId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 find_user_id = 3;</code>
       */
      public Builder clearFindUserId() {
        
        findUserId_ = 0L;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.msggamedata.FriendDungeonType type = 4;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.msggamedata.FriendDungeonType type = 4;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.FriendDungeonType type = 4;</code>
       */
      public com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType getType() {
        com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType result = com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType.valueOf(type_);
        return result == null ? com.felania.msldb.FriendDungeonTypeOuterClass.FriendDungeonType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.FriendDungeonType type = 4;</code>
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
       * <code>.msggamedata.FriendDungeonType type = 4;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgBattleStartFriendDungeon)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgBattleStartFriendDungeon)
    private static final com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon();
    }

    public static com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgBattleStartFriendDungeon>
        PARSER = new com.google.protobuf.AbstractParser<MsgBattleStartFriendDungeon>() {
      public MsgBattleStartFriendDungeon parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgBattleStartFriendDungeon(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgBattleStartFriendDungeon> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgBattleStartFriendDungeon> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgBattleStartFriendDungeonOuterClass.MsgBattleStartFriendDungeon getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgBattleStartFriendDungeon_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgBattleStartFriendDungeon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!MsgBattleStartFriendDungeon.proto\022\013msg" +
      "gamedata\032\030MsgMonsterSlotData.proto\032\027Frie" +
      "ndDungeonType.proto\"\254\001\n\033MsgBattleStartFr" +
      "iendDungeon\022\022\n\ndungeon_id\030\001 \001(\004\0225\n\014monst" +
      "er_slot\030\002 \001(\0132\037.msggamedata.MsgMonsterSl" +
      "otData\022\024\n\014find_user_id\030\003 \001(\004\022,\n\004type\030\004 \001" +
      "(\0162\036.msggamedata.FriendDungeonTypeB\023\n\021co" +
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
          com.felania.msldb.MsgMonsterSlotDataOuterClass.getDescriptor(),
          com.felania.msldb.FriendDungeonTypeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgBattleStartFriendDungeon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgBattleStartFriendDungeon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgBattleStartFriendDungeon_descriptor,
        new java.lang.String[] { "DungeonId", "MonsterSlot", "FindUserId", "Type", });
    com.felania.msldb.MsgMonsterSlotDataOuterClass.getDescriptor();
    com.felania.msldb.FriendDungeonTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
