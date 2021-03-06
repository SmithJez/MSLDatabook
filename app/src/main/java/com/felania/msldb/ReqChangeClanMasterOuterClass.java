// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqChangeClanMaster.proto

package com.felania.msldb;

public final class ReqChangeClanMasterOuterClass {
  private ReqChangeClanMasterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqChangeClanMasterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqChangeClanMaster)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 new_master_user_id = 1;</code>
     */
    long getNewMasterUserId();
  }
  /**
   * Protobuf type {@code msggamedata.ReqChangeClanMaster}
   */
  public  static final class ReqChangeClanMaster extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqChangeClanMaster)
      ReqChangeClanMasterOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqChangeClanMaster.newBuilder() to construct.
    private ReqChangeClanMaster(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqChangeClanMaster() {
      newMasterUserId_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqChangeClanMaster(
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

              newMasterUserId_ = input.readUInt64();
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
      return com.felania.msldb.ReqChangeClanMasterOuterClass.internal_static_msggamedata_ReqChangeClanMaster_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqChangeClanMasterOuterClass.internal_static_msggamedata_ReqChangeClanMaster_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster.class, com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster.Builder.class);
    }

    public static final int NEW_MASTER_USER_ID_FIELD_NUMBER = 1;
    private long newMasterUserId_;
    /**
     * <code>uint64 new_master_user_id = 1;</code>
     */
    public long getNewMasterUserId() {
      return newMasterUserId_;
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
      if (newMasterUserId_ != 0L) {
        output.writeUInt64(1, newMasterUserId_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (newMasterUserId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, newMasterUserId_);
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
      if (!(obj instanceof com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster other = (com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster) obj;

      boolean result = true;
      result = result && (getNewMasterUserId()
          == other.getNewMasterUserId());
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
      hash = (37 * hash) + NEW_MASTER_USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getNewMasterUserId());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster prototype) {
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
     * Protobuf type {@code msggamedata.ReqChangeClanMaster}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqChangeClanMaster)
        com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMasterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqChangeClanMasterOuterClass.internal_static_msggamedata_ReqChangeClanMaster_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqChangeClanMasterOuterClass.internal_static_msggamedata_ReqChangeClanMaster_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster.class, com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster.Builder.class);
      }

      // Construct using com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster.newBuilder()
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
        newMasterUserId_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqChangeClanMasterOuterClass.internal_static_msggamedata_ReqChangeClanMaster_descriptor;
      }

      public com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster getDefaultInstanceForType() {
        return com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster.getDefaultInstance();
      }

      public com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster build() {
        com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster buildPartial() {
        com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster result = new com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster(this);
        result.newMasterUserId_ = newMasterUserId_;
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
        if (other instanceof com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster) {
          return mergeFrom((com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster other) {
        if (other == com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster.getDefaultInstance()) return this;
        if (other.getNewMasterUserId() != 0L) {
          setNewMasterUserId(other.getNewMasterUserId());
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
        com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long newMasterUserId_ ;
      /**
       * <code>uint64 new_master_user_id = 1;</code>
       */
      public long getNewMasterUserId() {
        return newMasterUserId_;
      }
      /**
       * <code>uint64 new_master_user_id = 1;</code>
       */
      public Builder setNewMasterUserId(long value) {
        
        newMasterUserId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 new_master_user_id = 1;</code>
       */
      public Builder clearNewMasterUserId() {
        
        newMasterUserId_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqChangeClanMaster)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqChangeClanMaster)
    private static final com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster();
    }

    public static com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqChangeClanMaster>
        PARSER = new com.google.protobuf.AbstractParser<ReqChangeClanMaster>() {
      public ReqChangeClanMaster parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqChangeClanMaster(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqChangeClanMaster> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqChangeClanMaster> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqChangeClanMasterOuterClass.ReqChangeClanMaster getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqChangeClanMaster_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqChangeClanMaster_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ReqChangeClanMaster.proto\022\013msggamedata" +
      "\"1\n\023ReqChangeClanMaster\022\032\n\022new_master_us" +
      "er_id\030\001 \001(\004B\023\n\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_ReqChangeClanMaster_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqChangeClanMaster_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqChangeClanMaster_descriptor,
        new java.lang.String[] { "NewMasterUserId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
