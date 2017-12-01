// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqResponseClanApply.proto

package com.felania.msldb;

public final class ReqResponseClanApplyOuterClass {
  private ReqResponseClanApplyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqResponseClanApplyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqResponseClanApply)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 clan_id = 1;</code>
     */
    long getClanId();

    /**
     * <code>uint64 user_id = 2;</code>
     */
    long getUserId();

    /**
     * <code>bool accept = 3;</code>
     */
    boolean getAccept();
  }
  /**
   * Protobuf type {@code msggamedata.ReqResponseClanApply}
   */
  public  static final class ReqResponseClanApply extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqResponseClanApply)
      ReqResponseClanApplyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqResponseClanApply.newBuilder() to construct.
    private ReqResponseClanApply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqResponseClanApply() {
      clanId_ = 0L;
      userId_ = 0L;
      accept_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqResponseClanApply(
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

              clanId_ = input.readUInt64();
              break;
            }
            case 16: {

              userId_ = input.readUInt64();
              break;
            }
            case 24: {

              accept_ = input.readBool();
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
      return com.felania.msldb.ReqResponseClanApplyOuterClass.internal_static_msggamedata_ReqResponseClanApply_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqResponseClanApplyOuterClass.internal_static_msggamedata_ReqResponseClanApply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply.class, com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply.Builder.class);
    }

    public static final int CLAN_ID_FIELD_NUMBER = 1;
    private long clanId_;
    /**
     * <code>uint64 clan_id = 1;</code>
     */
    public long getClanId() {
      return clanId_;
    }

    public static final int USER_ID_FIELD_NUMBER = 2;
    private long userId_;
    /**
     * <code>uint64 user_id = 2;</code>
     */
    public long getUserId() {
      return userId_;
    }

    public static final int ACCEPT_FIELD_NUMBER = 3;
    private boolean accept_;
    /**
     * <code>bool accept = 3;</code>
     */
    public boolean getAccept() {
      return accept_;
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
      if (userId_ != 0L) {
        output.writeUInt64(2, userId_);
      }
      if (accept_ != false) {
        output.writeBool(3, accept_);
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
      if (userId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, userId_);
      }
      if (accept_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, accept_);
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
      if (!(obj instanceof com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply other = (com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply) obj;

      boolean result = true;
      result = result && (getClanId()
          == other.getClanId());
      result = result && (getUserId()
          == other.getUserId());
      result = result && (getAccept()
          == other.getAccept());
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
      hash = (37 * hash) + USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUserId());
      hash = (37 * hash) + ACCEPT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAccept());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply prototype) {
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
     * Protobuf type {@code msggamedata.ReqResponseClanApply}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqResponseClanApply)
        com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApplyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqResponseClanApplyOuterClass.internal_static_msggamedata_ReqResponseClanApply_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqResponseClanApplyOuterClass.internal_static_msggamedata_ReqResponseClanApply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply.class, com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply.Builder.class);
      }

      // Construct using com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply.newBuilder()
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

        userId_ = 0L;

        accept_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqResponseClanApplyOuterClass.internal_static_msggamedata_ReqResponseClanApply_descriptor;
      }

      public com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply getDefaultInstanceForType() {
        return com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply.getDefaultInstance();
      }

      public com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply build() {
        com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply buildPartial() {
        com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply result = new com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply(this);
        result.clanId_ = clanId_;
        result.userId_ = userId_;
        result.accept_ = accept_;
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
        if (other instanceof com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply) {
          return mergeFrom((com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply other) {
        if (other == com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply.getDefaultInstance()) return this;
        if (other.getClanId() != 0L) {
          setClanId(other.getClanId());
        }
        if (other.getUserId() != 0L) {
          setUserId(other.getUserId());
        }
        if (other.getAccept() != false) {
          setAccept(other.getAccept());
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
        com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply) e.getUnfinishedMessage();
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

      private long userId_ ;
      /**
       * <code>uint64 user_id = 2;</code>
       */
      public long getUserId() {
        return userId_;
      }
      /**
       * <code>uint64 user_id = 2;</code>
       */
      public Builder setUserId(long value) {
        
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 user_id = 2;</code>
       */
      public Builder clearUserId() {
        
        userId_ = 0L;
        onChanged();
        return this;
      }

      private boolean accept_ ;
      /**
       * <code>bool accept = 3;</code>
       */
      public boolean getAccept() {
        return accept_;
      }
      /**
       * <code>bool accept = 3;</code>
       */
      public Builder setAccept(boolean value) {
        
        accept_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool accept = 3;</code>
       */
      public Builder clearAccept() {
        
        accept_ = false;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqResponseClanApply)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqResponseClanApply)
    private static final com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply();
    }

    public static com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqResponseClanApply>
        PARSER = new com.google.protobuf.AbstractParser<ReqResponseClanApply>() {
      public ReqResponseClanApply parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReqResponseClanApply(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqResponseClanApply> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqResponseClanApply> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqResponseClanApplyOuterClass.ReqResponseClanApply getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqResponseClanApply_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqResponseClanApply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ReqResponseClanApply.proto\022\013msggamedat" +
      "a\"H\n\024ReqResponseClanApply\022\017\n\007clan_id\030\001 \001" +
      "(\004\022\017\n\007user_id\030\002 \001(\004\022\016\n\006accept\030\003 \001(\010B\023\n\021c" +
      "om.felania.msldbb\006proto3"
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
    internal_static_msggamedata_ReqResponseClanApply_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqResponseClanApply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqResponseClanApply_descriptor,
        new java.lang.String[] { "ClanId", "UserId", "Accept", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
