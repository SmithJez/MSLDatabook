// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqClanScoutList.proto

package com.felania.msldb;

public final class ReqClanScoutListOuterClass {
  private ReqClanScoutListOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqClanScoutListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqClanScoutList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 clan_id = 1;</code>
     */
    long getClanId();
  }
  /**
   * Protobuf type {@code msggamedata.ReqClanScoutList}
   */
  public  static final class ReqClanScoutList extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqClanScoutList)
      ReqClanScoutListOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqClanScoutList.newBuilder() to construct.
    private ReqClanScoutList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqClanScoutList() {
      clanId_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqClanScoutList(
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

              clanId_ = input.readUInt64();
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
      return com.felania.msldb.ReqClanScoutListOuterClass.internal_static_msggamedata_ReqClanScoutList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqClanScoutListOuterClass.internal_static_msggamedata_ReqClanScoutList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList.class, com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList.Builder.class);
    }

    public static final int CLAN_ID_FIELD_NUMBER = 1;
    private long clanId_;
    /**
     * <code>uint64 clan_id = 1;</code>
     */
    public long getClanId() {
      return clanId_;
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
      if (clanId_ != 0L) {
        output.writeUInt64(1, clanId_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (clanId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, clanId_);
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
      if (!(obj instanceof com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList other = (com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList) obj;

      boolean result = true;
      result = result && (getClanId()
          == other.getClanId());
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
      hash = (37 * hash) + CLAN_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getClanId());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList prototype) {
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
     * Protobuf type {@code msggamedata.ReqClanScoutList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqClanScoutList)
        com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqClanScoutListOuterClass.internal_static_msggamedata_ReqClanScoutList_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqClanScoutListOuterClass.internal_static_msggamedata_ReqClanScoutList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList.class, com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList.Builder.class);
      }

      // Construct using com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList.newBuilder()
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
        clanId_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqClanScoutListOuterClass.internal_static_msggamedata_ReqClanScoutList_descriptor;
      }

      public com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList getDefaultInstanceForType() {
        return com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList.getDefaultInstance();
      }

      public com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList build() {
        com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList buildPartial() {
        com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList result = new com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList(this);
        result.clanId_ = clanId_;
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
        if (other instanceof com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList) {
          return mergeFrom((com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList other) {
        if (other == com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList.getDefaultInstance()) return this;
        if (other.getClanId() != 0L) {
          setClanId(other.getClanId());
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
        com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long clanId_ ;
      /**
       * <code>uint64 clan_id = 1;</code>
       */
      public long getClanId() {
        return clanId_;
      }
      /**
       * <code>uint64 clan_id = 1;</code>
       */
      public Builder setClanId(long value) {
        
        clanId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 clan_id = 1;</code>
       */
      public Builder clearClanId() {
        
        clanId_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqClanScoutList)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqClanScoutList)
    private static final com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList();
    }

    public static com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqClanScoutList>
        PARSER = new com.google.protobuf.AbstractParser<ReqClanScoutList>() {
      public ReqClanScoutList parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqClanScoutList(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqClanScoutList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqClanScoutList> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqClanScoutListOuterClass.ReqClanScoutList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqClanScoutList_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqClanScoutList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ReqClanScoutList.proto\022\013msggamedata\"#\n" +
      "\020ReqClanScoutList\022\017\n\007clan_id\030\001 \001(\004B\023\n\021co" +
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
        }, assigner);
    internal_static_msggamedata_ReqClanScoutList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqClanScoutList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqClanScoutList_descriptor,
        new java.lang.String[] { "ClanId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
