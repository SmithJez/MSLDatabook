// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqUserMonsterStore.proto

package com.felania.msldb;

public final class ReqUserMonsterStoreOuterClass {
  private ReqUserMonsterStoreOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqUserMonsterStoreOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqUserMonsterStore)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MonsterStorageType storage_type = 1;</code>
     */
    int getStorageTypeValue();
    /**
     * <code>.msggamedata.MonsterStorageType storage_type = 1;</code>
     */
    com.felania.msldb.MonsterStorageTypeOuterClass.MonsterStorageType getStorageType();

    /**
     * <code>bool is_store = 2;</code>
     */
    boolean getIsStore();

    /**
     * <code>repeated uint64 user_monster_ids = 3;</code>
     */
    java.util.List<java.lang.Long> getUserMonsterIdsList();
    /**
     * <code>repeated uint64 user_monster_ids = 3;</code>
     */
    int getUserMonsterIdsCount();
    /**
     * <code>repeated uint64 user_monster_ids = 3;</code>
     */
    long getUserMonsterIds(int index);
  }
  /**
   * Protobuf type {@code msggamedata.ReqUserMonsterStore}
   */
  public  static final class ReqUserMonsterStore extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqUserMonsterStore)
      ReqUserMonsterStoreOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqUserMonsterStore.newBuilder() to construct.
    private ReqUserMonsterStore(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqUserMonsterStore() {
      storageType_ = 0;
      isStore_ = false;
      userMonsterIds_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqUserMonsterStore(
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

              storageType_ = rawValue;
              break;
            }
            case 16: {

              isStore_ = input.readBool();
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                userMonsterIds_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000004;
              }
              userMonsterIds_.add(input.readUInt64());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
                userMonsterIds_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000004;
              }
              while (input.getBytesUntilLimit() > 0) {
                userMonsterIds_.add(input.readUInt64());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          userMonsterIds_ = java.util.Collections.unmodifiableList(userMonsterIds_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.ReqUserMonsterStoreOuterClass.internal_static_msggamedata_ReqUserMonsterStore_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqUserMonsterStoreOuterClass.internal_static_msggamedata_ReqUserMonsterStore_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore.class, com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore.Builder.class);
    }

    private int bitField0_;
    public static final int STORAGE_TYPE_FIELD_NUMBER = 1;
    private int storageType_;
    /**
     * <code>.msggamedata.MonsterStorageType storage_type = 1;</code>
     */
    public int getStorageTypeValue() {
      return storageType_;
    }
    /**
     * <code>.msggamedata.MonsterStorageType storage_type = 1;</code>
     */
    public com.felania.msldb.MonsterStorageTypeOuterClass.MonsterStorageType getStorageType() {
      com.felania.msldb.MonsterStorageTypeOuterClass.MonsterStorageType result = com.felania.msldb.MonsterStorageTypeOuterClass.MonsterStorageType.valueOf(storageType_);
      return result == null ? com.felania.msldb.MonsterStorageTypeOuterClass.MonsterStorageType.UNRECOGNIZED : result;
    }

    public static final int IS_STORE_FIELD_NUMBER = 2;
    private boolean isStore_;
    /**
     * <code>bool is_store = 2;</code>
     */
    public boolean getIsStore() {
      return isStore_;
    }

    public static final int USER_MONSTER_IDS_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Long> userMonsterIds_;
    /**
     * <code>repeated uint64 user_monster_ids = 3;</code>
     */
    public java.util.List<java.lang.Long>
        getUserMonsterIdsList() {
      return userMonsterIds_;
    }
    /**
     * <code>repeated uint64 user_monster_ids = 3;</code>
     */
    public int getUserMonsterIdsCount() {
      return userMonsterIds_.size();
    }
    /**
     * <code>repeated uint64 user_monster_ids = 3;</code>
     */
    public long getUserMonsterIds(int index) {
      return userMonsterIds_.get(index);
    }
    private int userMonsterIdsMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (storageType_ != com.felania.msldb.MonsterStorageTypeOuterClass.MonsterStorageType.MST_USER_INVEN.getNumber()) {
        output.writeEnum(1, storageType_);
      }
      if (isStore_ != false) {
        output.writeBool(2, isStore_);
      }
      if (getUserMonsterIdsList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(userMonsterIdsMemoizedSerializedSize);
      }
      for (int i = 0; i < userMonsterIds_.size(); i++) {
        output.writeUInt64NoTag(userMonsterIds_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (storageType_ != com.felania.msldb.MonsterStorageTypeOuterClass.MonsterStorageType.MST_USER_INVEN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, storageType_);
      }
      if (isStore_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isStore_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < userMonsterIds_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(userMonsterIds_.get(i));
        }
        size += dataSize;
        if (!getUserMonsterIdsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        userMonsterIdsMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore other = (com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore) obj;

      boolean result = true;
      result = result && storageType_ == other.storageType_;
      result = result && (getIsStore()
          == other.getIsStore());
      result = result && getUserMonsterIdsList()
          .equals(other.getUserMonsterIdsList());
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
      hash = (37 * hash) + STORAGE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + storageType_;
      hash = (37 * hash) + IS_STORE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsStore());
      if (getUserMonsterIdsCount() > 0) {
        hash = (37 * hash) + USER_MONSTER_IDS_FIELD_NUMBER;
        hash = (53 * hash) + getUserMonsterIdsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore prototype) {
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
     * Protobuf type {@code msggamedata.ReqUserMonsterStore}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqUserMonsterStore)
        com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStoreOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqUserMonsterStoreOuterClass.internal_static_msggamedata_ReqUserMonsterStore_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqUserMonsterStoreOuterClass.internal_static_msggamedata_ReqUserMonsterStore_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore.class, com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore.Builder.class);
      }

      // Construct using com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore.newBuilder()
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
        storageType_ = 0;

        isStore_ = false;

        userMonsterIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqUserMonsterStoreOuterClass.internal_static_msggamedata_ReqUserMonsterStore_descriptor;
      }

      public com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore getDefaultInstanceForType() {
        return com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore.getDefaultInstance();
      }

      public com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore build() {
        com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore buildPartial() {
        com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore result = new com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.storageType_ = storageType_;
        result.isStore_ = isStore_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          userMonsterIds_ = java.util.Collections.unmodifiableList(userMonsterIds_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.userMonsterIds_ = userMonsterIds_;
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
        if (other instanceof com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore) {
          return mergeFrom((com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore other) {
        if (other == com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore.getDefaultInstance()) return this;
        if (other.storageType_ != 0) {
          setStorageTypeValue(other.getStorageTypeValue());
        }
        if (other.getIsStore() != false) {
          setIsStore(other.getIsStore());
        }
        if (!other.userMonsterIds_.isEmpty()) {
          if (userMonsterIds_.isEmpty()) {
            userMonsterIds_ = other.userMonsterIds_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureUserMonsterIdsIsMutable();
            userMonsterIds_.addAll(other.userMonsterIds_);
          }
          onChanged();
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
        com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int storageType_ = 0;
      /**
       * <code>.msggamedata.MonsterStorageType storage_type = 1;</code>
       */
      public int getStorageTypeValue() {
        return storageType_;
      }
      /**
       * <code>.msggamedata.MonsterStorageType storage_type = 1;</code>
       */
      public Builder setStorageTypeValue(int value) {
        storageType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterStorageType storage_type = 1;</code>
       */
      public com.felania.msldb.MonsterStorageTypeOuterClass.MonsterStorageType getStorageType() {
        com.felania.msldb.MonsterStorageTypeOuterClass.MonsterStorageType result = com.felania.msldb.MonsterStorageTypeOuterClass.MonsterStorageType.valueOf(storageType_);
        return result == null ? com.felania.msldb.MonsterStorageTypeOuterClass.MonsterStorageType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MonsterStorageType storage_type = 1;</code>
       */
      public Builder setStorageType(com.felania.msldb.MonsterStorageTypeOuterClass.MonsterStorageType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        storageType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterStorageType storage_type = 1;</code>
       */
      public Builder clearStorageType() {
        
        storageType_ = 0;
        onChanged();
        return this;
      }

      private boolean isStore_ ;
      /**
       * <code>bool is_store = 2;</code>
       */
      public boolean getIsStore() {
        return isStore_;
      }
      /**
       * <code>bool is_store = 2;</code>
       */
      public Builder setIsStore(boolean value) {
        
        isStore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_store = 2;</code>
       */
      public Builder clearIsStore() {
        
        isStore_ = false;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Long> userMonsterIds_ = java.util.Collections.emptyList();
      private void ensureUserMonsterIdsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          userMonsterIds_ = new java.util.ArrayList<java.lang.Long>(userMonsterIds_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated uint64 user_monster_ids = 3;</code>
       */
      public java.util.List<java.lang.Long>
          getUserMonsterIdsList() {
        return java.util.Collections.unmodifiableList(userMonsterIds_);
      }
      /**
       * <code>repeated uint64 user_monster_ids = 3;</code>
       */
      public int getUserMonsterIdsCount() {
        return userMonsterIds_.size();
      }
      /**
       * <code>repeated uint64 user_monster_ids = 3;</code>
       */
      public long getUserMonsterIds(int index) {
        return userMonsterIds_.get(index);
      }
      /**
       * <code>repeated uint64 user_monster_ids = 3;</code>
       */
      public Builder setUserMonsterIds(
          int index, long value) {
        ensureUserMonsterIdsIsMutable();
        userMonsterIds_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 user_monster_ids = 3;</code>
       */
      public Builder addUserMonsterIds(long value) {
        ensureUserMonsterIdsIsMutable();
        userMonsterIds_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 user_monster_ids = 3;</code>
       */
      public Builder addAllUserMonsterIds(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureUserMonsterIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userMonsterIds_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 user_monster_ids = 3;</code>
       */
      public Builder clearUserMonsterIds() {
        userMonsterIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqUserMonsterStore)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqUserMonsterStore)
    private static final com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore();
    }

    public static com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqUserMonsterStore>
        PARSER = new com.google.protobuf.AbstractParser<ReqUserMonsterStore>() {
      public ReqUserMonsterStore parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqUserMonsterStore(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqUserMonsterStore> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqUserMonsterStore> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqUserMonsterStoreOuterClass.ReqUserMonsterStore getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqUserMonsterStore_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqUserMonsterStore_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ReqUserMonsterStore.proto\022\013msggamedata" +
      "\032\030MonsterStorageType.proto\"x\n\023ReqUserMon" +
      "sterStore\0225\n\014storage_type\030\001 \001(\0162\037.msggam" +
      "edata.MonsterStorageType\022\020\n\010is_store\030\002 \001" +
      "(\010\022\030\n\020user_monster_ids\030\003 \003(\004B\023\n\021com.fela" +
      "nia.msldbb\006proto3"
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
          com.felania.msldb.MonsterStorageTypeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_ReqUserMonsterStore_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqUserMonsterStore_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqUserMonsterStore_descriptor,
        new java.lang.String[] { "StorageType", "IsStore", "UserMonsterIds", });
    com.felania.msldb.MonsterStorageTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
