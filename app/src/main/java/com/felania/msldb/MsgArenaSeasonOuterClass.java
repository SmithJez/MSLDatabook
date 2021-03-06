// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgArenaSeason.proto

package com.felania.msldb;

public final class MsgArenaSeasonOuterClass {
  private MsgArenaSeasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgArenaSeasonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgArenaSeason)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>uint32 idx = 2;</code>
     */
    int getIdx();

    /**
     * <code>uint64 open_date = 3;</code>
     */
    long getOpenDate();

    /**
     * <code>uint64 close_date = 4;</code>
     */
    long getCloseDate();
  }
  /**
   * Protobuf type {@code msggamedata.MsgArenaSeason}
   */
  public  static final class MsgArenaSeason extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgArenaSeason)
      MsgArenaSeasonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgArenaSeason.newBuilder() to construct.
    private MsgArenaSeason(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgArenaSeason() {
      uid_ = 0;
      idx_ = 0;
      openDate_ = 0L;
      closeDate_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgArenaSeason(
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
            case 16: {

              idx_ = input.readUInt32();
              break;
            }
            case 24: {

              openDate_ = input.readUInt64();
              break;
            }
            case 32: {

              closeDate_ = input.readUInt64();
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
      return com.felania.msldb.MsgArenaSeasonOuterClass.internal_static_msggamedata_MsgArenaSeason_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgArenaSeasonOuterClass.internal_static_msggamedata_MsgArenaSeason_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason.class, com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>fixed32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int IDX_FIELD_NUMBER = 2;
    private int idx_;
    /**
     * <code>uint32 idx = 2;</code>
     */
    public int getIdx() {
      return idx_;
    }

    public static final int OPEN_DATE_FIELD_NUMBER = 3;
    private long openDate_;
    /**
     * <code>uint64 open_date = 3;</code>
     */
    public long getOpenDate() {
      return openDate_;
    }

    public static final int CLOSE_DATE_FIELD_NUMBER = 4;
    private long closeDate_;
    /**
     * <code>uint64 close_date = 4;</code>
     */
    public long getCloseDate() {
      return closeDate_;
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
      if (uid_ != 0) {
        output.writeFixed32(1, uid_);
      }
      if (idx_ != 0) {
        output.writeUInt32(2, idx_);
      }
      if (openDate_ != 0L) {
        output.writeUInt64(3, openDate_);
      }
      if (closeDate_ != 0L) {
        output.writeUInt64(4, closeDate_);
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
      if (idx_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, idx_);
      }
      if (openDate_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, openDate_);
      }
      if (closeDate_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, closeDate_);
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
      if (!(obj instanceof com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason other = (com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason) obj;

      boolean result = true;
      result = result && (getUid()
          == other.getUid());
      result = result && (getIdx()
          == other.getIdx());
      result = result && (getOpenDate()
          == other.getOpenDate());
      result = result && (getCloseDate()
          == other.getCloseDate());
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
      hash = (37 * hash) + IDX_FIELD_NUMBER;
      hash = (53 * hash) + getIdx();
      hash = (37 * hash) + OPEN_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getOpenDate());
      hash = (37 * hash) + CLOSE_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCloseDate());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason prototype) {
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
     * Protobuf type {@code msggamedata.MsgArenaSeason}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgArenaSeason)
        com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeasonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgArenaSeasonOuterClass.internal_static_msggamedata_MsgArenaSeason_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgArenaSeasonOuterClass.internal_static_msggamedata_MsgArenaSeason_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason.class, com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason.Builder.class);
      }

      // Construct using com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason.newBuilder()
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

        idx_ = 0;

        openDate_ = 0L;

        closeDate_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgArenaSeasonOuterClass.internal_static_msggamedata_MsgArenaSeason_descriptor;
      }

      public com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason getDefaultInstanceForType() {
        return com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason.getDefaultInstance();
      }

      public com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason build() {
        com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason buildPartial() {
        com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason result = new com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason(this);
        result.uid_ = uid_;
        result.idx_ = idx_;
        result.openDate_ = openDate_;
        result.closeDate_ = closeDate_;
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
        if (other instanceof com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason) {
          return mergeFrom((com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason other) {
        if (other == com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getIdx() != 0) {
          setIdx(other.getIdx());
        }
        if (other.getOpenDate() != 0L) {
          setOpenDate(other.getOpenDate());
        }
        if (other.getCloseDate() != 0L) {
          setCloseDate(other.getCloseDate());
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
        com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

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

      private int idx_ ;
      /**
       * <code>uint32 idx = 2;</code>
       */
      public int getIdx() {
        return idx_;
      }
      /**
       * <code>uint32 idx = 2;</code>
       */
      public Builder setIdx(int value) {
        
        idx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 idx = 2;</code>
       */
      public Builder clearIdx() {
        
        idx_ = 0;
        onChanged();
        return this;
      }

      private long openDate_ ;
      /**
       * <code>uint64 open_date = 3;</code>
       */
      public long getOpenDate() {
        return openDate_;
      }
      /**
       * <code>uint64 open_date = 3;</code>
       */
      public Builder setOpenDate(long value) {
        
        openDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 open_date = 3;</code>
       */
      public Builder clearOpenDate() {
        
        openDate_ = 0L;
        onChanged();
        return this;
      }

      private long closeDate_ ;
      /**
       * <code>uint64 close_date = 4;</code>
       */
      public long getCloseDate() {
        return closeDate_;
      }
      /**
       * <code>uint64 close_date = 4;</code>
       */
      public Builder setCloseDate(long value) {
        
        closeDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 close_date = 4;</code>
       */
      public Builder clearCloseDate() {
        
        closeDate_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgArenaSeason)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgArenaSeason)
    private static final com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason();
    }

    public static com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgArenaSeason>
        PARSER = new com.google.protobuf.AbstractParser<MsgArenaSeason>() {
      public MsgArenaSeason parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgArenaSeason(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgArenaSeason> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgArenaSeason> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgArenaSeasonOuterClass.MsgArenaSeason getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgArenaSeason_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgArenaSeason_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024MsgArenaSeason.proto\022\013msggamedata\"Q\n\016M" +
      "sgArenaSeason\022\013\n\003uid\030\001 \001(\007\022\013\n\003idx\030\002 \001(\r\022" +
      "\021\n\topen_date\030\003 \001(\004\022\022\n\nclose_date\030\004 \001(\004B\023" +
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
        }, assigner);
    internal_static_msggamedata_MsgArenaSeason_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgArenaSeason_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgArenaSeason_descriptor,
        new java.lang.String[] { "Uid", "Idx", "OpenDate", "CloseDate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
