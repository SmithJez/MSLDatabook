// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgLinkBonusHiddenData.proto

package com.felania.msldb;

public final class MsgLinkBonusHiddenDataOuterClass {
  private MsgLinkBonusHiddenDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgLinkBonusHiddenDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgLinkBonusHiddenData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>repeated fixed32 monster_uids = 2;</code>
     */
    java.util.List<java.lang.Integer> getMonsterUidsList();
    /**
     * <code>repeated fixed32 monster_uids = 2;</code>
     */
    int getMonsterUidsCount();
    /**
     * <code>repeated fixed32 monster_uids = 2;</code>
     */
    int getMonsterUids(int index);
  }
  /**
   * Protobuf type {@code msggamedata.MsgLinkBonusHiddenData}
   */
  public  static final class MsgLinkBonusHiddenData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgLinkBonusHiddenData)
      MsgLinkBonusHiddenDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgLinkBonusHiddenData.newBuilder() to construct.
    private MsgLinkBonusHiddenData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgLinkBonusHiddenData() {
      uid_ = 0;
      monsterUids_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgLinkBonusHiddenData(
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

              uid_ = input.readFixed32();
              break;
            }
            case 21: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                monsterUids_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              monsterUids_.add(input.readFixed32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                monsterUids_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                monsterUids_.add(input.readFixed32());
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
          monsterUids_ = java.util.Collections.unmodifiableList(monsterUids_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.internal_static_msggamedata_MsgLinkBonusHiddenData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.internal_static_msggamedata_MsgLinkBonusHiddenData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData.class, com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData.Builder.class);
    }

    private int bitField0_;
    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>fixed32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int MONSTER_UIDS_FIELD_NUMBER = 2;
    private java.util.List<java.lang.Integer> monsterUids_;
    /**
     * <code>repeated fixed32 monster_uids = 2;</code>
     */
    public java.util.List<java.lang.Integer>
        getMonsterUidsList() {
      return monsterUids_;
    }
    /**
     * <code>repeated fixed32 monster_uids = 2;</code>
     */
    public int getMonsterUidsCount() {
      return monsterUids_.size();
    }
    /**
     * <code>repeated fixed32 monster_uids = 2;</code>
     */
    public int getMonsterUids(int index) {
      return monsterUids_.get(index);
    }
    private int monsterUidsMemoizedSerializedSize = -1;

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
      if (uid_ != 0) {
        output.writeFixed32(1, uid_);
      }
      if (getMonsterUidsList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(monsterUidsMemoizedSerializedSize);
      }
      for (int i = 0; i < monsterUids_.size(); i++) {
        output.writeFixed32NoTag(monsterUids_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, uid_);
      }
      {
        int dataSize = 0;
        dataSize = 4 * getMonsterUidsList().size();
        size += dataSize;
        if (!getMonsterUidsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        monsterUidsMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData other = (com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData) obj;

      boolean result = true;
      result = result && (getUid()
          == other.getUid());
      result = result && getMonsterUidsList()
          .equals(other.getMonsterUidsList());
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      if (getMonsterUidsCount() > 0) {
        hash = (37 * hash) + MONSTER_UIDS_FIELD_NUMBER;
        hash = (53 * hash) + getMonsterUidsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData prototype) {
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
     * Protobuf type {@code msggamedata.MsgLinkBonusHiddenData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgLinkBonusHiddenData)
        com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.internal_static_msggamedata_MsgLinkBonusHiddenData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.internal_static_msggamedata_MsgLinkBonusHiddenData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData.class, com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData.Builder.class);
      }

      // Construct using com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData.newBuilder()
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
        uid_ = 0;

        monsterUids_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.internal_static_msggamedata_MsgLinkBonusHiddenData_descriptor;
      }

      public com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData getDefaultInstanceForType() {
        return com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData.getDefaultInstance();
      }

      public com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData build() {
        com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData buildPartial() {
        com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData result = new com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.uid_ = uid_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          monsterUids_ = java.util.Collections.unmodifiableList(monsterUids_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.monsterUids_ = monsterUids_;
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
        if (other instanceof com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData) {
          return mergeFrom((com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData other) {
        if (other == com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.monsterUids_.isEmpty()) {
          if (monsterUids_.isEmpty()) {
            monsterUids_ = other.monsterUids_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMonsterUidsIsMutable();
            monsterUids_.addAll(other.monsterUids_);
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
        com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int uid_ ;
      /**
       * <code>fixed32 uid = 1;</code>
       */
      public int getUid() {
        return uid_;
      }
      /**
       * <code>fixed32 uid = 1;</code>
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 uid = 1;</code>
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> monsterUids_ = java.util.Collections.emptyList();
      private void ensureMonsterUidsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          monsterUids_ = new java.util.ArrayList<java.lang.Integer>(monsterUids_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated fixed32 monster_uids = 2;</code>
       */
      public java.util.List<java.lang.Integer>
          getMonsterUidsList() {
        return java.util.Collections.unmodifiableList(monsterUids_);
      }
      /**
       * <code>repeated fixed32 monster_uids = 2;</code>
       */
      public int getMonsterUidsCount() {
        return monsterUids_.size();
      }
      /**
       * <code>repeated fixed32 monster_uids = 2;</code>
       */
      public int getMonsterUids(int index) {
        return monsterUids_.get(index);
      }
      /**
       * <code>repeated fixed32 monster_uids = 2;</code>
       */
      public Builder setMonsterUids(
          int index, int value) {
        ensureMonsterUidsIsMutable();
        monsterUids_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated fixed32 monster_uids = 2;</code>
       */
      public Builder addMonsterUids(int value) {
        ensureMonsterUidsIsMutable();
        monsterUids_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated fixed32 monster_uids = 2;</code>
       */
      public Builder addAllMonsterUids(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMonsterUidsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, monsterUids_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated fixed32 monster_uids = 2;</code>
       */
      public Builder clearMonsterUids() {
        monsterUids_ = java.util.Collections.emptyList();
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgLinkBonusHiddenData)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgLinkBonusHiddenData)
    private static final com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData();
    }

    public static com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgLinkBonusHiddenData>
        PARSER = new com.google.protobuf.AbstractParser<MsgLinkBonusHiddenData>() {
      public MsgLinkBonusHiddenData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgLinkBonusHiddenData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgLinkBonusHiddenData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgLinkBonusHiddenData> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgLinkBonusHiddenDataOuterClass.MsgLinkBonusHiddenData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgLinkBonusHiddenData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgLinkBonusHiddenData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034MsgLinkBonusHiddenData.proto\022\013msggamed" +
      "ata\";\n\026MsgLinkBonusHiddenData\022\013\n\003uid\030\001 \001" +
      "(\007\022\024\n\014monster_uids\030\002 \003(\007B\023\n\021com.felania." +
      "msldbb\006proto3"
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
    internal_static_msggamedata_MsgLinkBonusHiddenData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgLinkBonusHiddenData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgLinkBonusHiddenData_descriptor,
        new java.lang.String[] { "Uid", "MonsterUids", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
