// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgAvailableLinkBonus.proto

package com.felania.msldb;

public final class MsgAvailableLinkBonusOuterClass {
  private MsgAvailableLinkBonusOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgAvailableLinkBonusOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgAvailableLinkBonus)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 link_bonus_uid = 1;</code>
     */
    int getLinkBonusUid();

    /**
     * <code>repeated uint64 user_monster_ids = 2;</code>
     */
    java.util.List<java.lang.Long> getUserMonsterIdsList();
    /**
     * <code>repeated uint64 user_monster_ids = 2;</code>
     */
    int getUserMonsterIdsCount();
    /**
     * <code>repeated uint64 user_monster_ids = 2;</code>
     */
    long getUserMonsterIds(int index);
  }
  /**
   * Protobuf type {@code msggamedata.MsgAvailableLinkBonus}
   */
  public  static final class MsgAvailableLinkBonus extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgAvailableLinkBonus)
      MsgAvailableLinkBonusOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgAvailableLinkBonus.newBuilder() to construct.
    private MsgAvailableLinkBonus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgAvailableLinkBonus() {
      linkBonusUid_ = 0;
      userMonsterIds_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgAvailableLinkBonus(
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

              linkBonusUid_ = input.readFixed32();
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                userMonsterIds_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000002;
              }
              userMonsterIds_.add(input.readUInt64());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                userMonsterIds_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000002;
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          userMonsterIds_ = java.util.Collections.unmodifiableList(userMonsterIds_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MsgAvailableLinkBonusOuterClass.internal_static_msggamedata_MsgAvailableLinkBonus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgAvailableLinkBonusOuterClass.internal_static_msggamedata_MsgAvailableLinkBonus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus.class, com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus.Builder.class);
    }

    private int bitField0_;
    public static final int LINK_BONUS_UID_FIELD_NUMBER = 1;
    private int linkBonusUid_;
    /**
     * <code>fixed32 link_bonus_uid = 1;</code>
     */
    public int getLinkBonusUid() {
      return linkBonusUid_;
    }

    public static final int USER_MONSTER_IDS_FIELD_NUMBER = 2;
    private java.util.List<java.lang.Long> userMonsterIds_;
    /**
     * <code>repeated uint64 user_monster_ids = 2;</code>
     */
    public java.util.List<java.lang.Long>
        getUserMonsterIdsList() {
      return userMonsterIds_;
    }
    /**
     * <code>repeated uint64 user_monster_ids = 2;</code>
     */
    public int getUserMonsterIdsCount() {
      return userMonsterIds_.size();
    }
    /**
     * <code>repeated uint64 user_monster_ids = 2;</code>
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
      if (linkBonusUid_ != 0) {
        output.writeFixed32(1, linkBonusUid_);
      }
      if (getUserMonsterIdsList().size() > 0) {
        output.writeUInt32NoTag(18);
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
      if (linkBonusUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, linkBonusUid_);
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
      if (!(obj instanceof com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus other = (com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus) obj;

      boolean result = true;
      result = result && (getLinkBonusUid()
          == other.getLinkBonusUid());
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
      hash = (37 * hash) + LINK_BONUS_UID_FIELD_NUMBER;
      hash = (53 * hash) + getLinkBonusUid();
      if (getUserMonsterIdsCount() > 0) {
        hash = (37 * hash) + USER_MONSTER_IDS_FIELD_NUMBER;
        hash = (53 * hash) + getUserMonsterIdsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus prototype) {
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
     * Protobuf type {@code msggamedata.MsgAvailableLinkBonus}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgAvailableLinkBonus)
        com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgAvailableLinkBonusOuterClass.internal_static_msggamedata_MsgAvailableLinkBonus_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgAvailableLinkBonusOuterClass.internal_static_msggamedata_MsgAvailableLinkBonus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus.class, com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus.Builder.class);
      }

      // Construct using com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus.newBuilder()
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
        linkBonusUid_ = 0;

        userMonsterIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgAvailableLinkBonusOuterClass.internal_static_msggamedata_MsgAvailableLinkBonus_descriptor;
      }

      public com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus getDefaultInstanceForType() {
        return com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus.getDefaultInstance();
      }

      public com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus build() {
        com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus buildPartial() {
        com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus result = new com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.linkBonusUid_ = linkBonusUid_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          userMonsterIds_ = java.util.Collections.unmodifiableList(userMonsterIds_);
          bitField0_ = (bitField0_ & ~0x00000002);
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
        if (other instanceof com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus) {
          return mergeFrom((com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus other) {
        if (other == com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus.getDefaultInstance()) return this;
        if (other.getLinkBonusUid() != 0) {
          setLinkBonusUid(other.getLinkBonusUid());
        }
        if (!other.userMonsterIds_.isEmpty()) {
          if (userMonsterIds_.isEmpty()) {
            userMonsterIds_ = other.userMonsterIds_;
            bitField0_ = (bitField0_ & ~0x00000002);
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
        com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int linkBonusUid_ ;
      /**
       * <code>fixed32 link_bonus_uid = 1;</code>
       */
      public int getLinkBonusUid() {
        return linkBonusUid_;
      }
      /**
       * <code>fixed32 link_bonus_uid = 1;</code>
       */
      public Builder setLinkBonusUid(int value) {
        
        linkBonusUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 link_bonus_uid = 1;</code>
       */
      public Builder clearLinkBonusUid() {
        
        linkBonusUid_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Long> userMonsterIds_ = java.util.Collections.emptyList();
      private void ensureUserMonsterIdsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          userMonsterIds_ = new java.util.ArrayList<java.lang.Long>(userMonsterIds_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint64 user_monster_ids = 2;</code>
       */
      public java.util.List<java.lang.Long>
          getUserMonsterIdsList() {
        return java.util.Collections.unmodifiableList(userMonsterIds_);
      }
      /**
       * <code>repeated uint64 user_monster_ids = 2;</code>
       */
      public int getUserMonsterIdsCount() {
        return userMonsterIds_.size();
      }
      /**
       * <code>repeated uint64 user_monster_ids = 2;</code>
       */
      public long getUserMonsterIds(int index) {
        return userMonsterIds_.get(index);
      }
      /**
       * <code>repeated uint64 user_monster_ids = 2;</code>
       */
      public Builder setUserMonsterIds(
          int index, long value) {
        ensureUserMonsterIdsIsMutable();
        userMonsterIds_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 user_monster_ids = 2;</code>
       */
      public Builder addUserMonsterIds(long value) {
        ensureUserMonsterIdsIsMutable();
        userMonsterIds_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 user_monster_ids = 2;</code>
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
       * <code>repeated uint64 user_monster_ids = 2;</code>
       */
      public Builder clearUserMonsterIds() {
        userMonsterIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgAvailableLinkBonus)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgAvailableLinkBonus)
    private static final com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus();
    }

    public static com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgAvailableLinkBonus>
        PARSER = new com.google.protobuf.AbstractParser<MsgAvailableLinkBonus>() {
      public MsgAvailableLinkBonus parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgAvailableLinkBonus(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgAvailableLinkBonus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgAvailableLinkBonus> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgAvailableLinkBonusOuterClass.MsgAvailableLinkBonus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgAvailableLinkBonus_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgAvailableLinkBonus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033MsgAvailableLinkBonus.proto\022\013msggameda" +
      "ta\"I\n\025MsgAvailableLinkBonus\022\026\n\016link_bonu" +
      "s_uid\030\001 \001(\007\022\030\n\020user_monster_ids\030\002 \003(\004B\023\n" +
      "\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_MsgAvailableLinkBonus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgAvailableLinkBonus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgAvailableLinkBonus_descriptor,
        new java.lang.String[] { "LinkBonusUid", "UserMonsterIds", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
