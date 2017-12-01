// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspCancelMakeFriend.proto

package com.felania.msldb;

public final class RspCancelMakeFriendOuterClass {
  private RspCancelMakeFriendOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspCancelMakeFriendOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspCancelMakeFriend)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 friend_user_id = 1;</code>
     */
    long getFriendUserId();
  }
  /**
   * Protobuf type {@code msggamedata.RspCancelMakeFriend}
   */
  public  static final class RspCancelMakeFriend extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspCancelMakeFriend)
      RspCancelMakeFriendOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspCancelMakeFriend.newBuilder() to construct.
    private RspCancelMakeFriend(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspCancelMakeFriend() {
      friendUserId_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspCancelMakeFriend(
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

              friendUserId_ = input.readUInt64();
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
      return com.felania.msldb.RspCancelMakeFriendOuterClass.internal_static_msggamedata_RspCancelMakeFriend_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspCancelMakeFriendOuterClass.internal_static_msggamedata_RspCancelMakeFriend_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend.class, com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend.Builder.class);
    }

    public static final int FRIEND_USER_ID_FIELD_NUMBER = 1;
    private long friendUserId_;
    /**
     * <code>uint64 friend_user_id = 1;</code>
     */
    public long getFriendUserId() {
      return friendUserId_;
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
      if (friendUserId_ != 0L) {
        output.writeUInt64(1, friendUserId_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (friendUserId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, friendUserId_);
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
      if (!(obj instanceof com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend other = (com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend) obj;

      boolean result = true;
      result = result && (getFriendUserId()
          == other.getFriendUserId());
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
      hash = (37 * hash) + FRIEND_USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFriendUserId());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend prototype) {
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
     * Protobuf type {@code msggamedata.RspCancelMakeFriend}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspCancelMakeFriend)
        com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriendOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspCancelMakeFriendOuterClass.internal_static_msggamedata_RspCancelMakeFriend_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspCancelMakeFriendOuterClass.internal_static_msggamedata_RspCancelMakeFriend_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend.class, com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend.Builder.class);
      }

      // Construct using com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend.newBuilder()
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
        friendUserId_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspCancelMakeFriendOuterClass.internal_static_msggamedata_RspCancelMakeFriend_descriptor;
      }

      public com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend getDefaultInstanceForType() {
        return com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend.getDefaultInstance();
      }

      public com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend build() {
        com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend buildPartial() {
        com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend result = new com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend(this);
        result.friendUserId_ = friendUserId_;
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
        if (other instanceof com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend) {
          return mergeFrom((com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend other) {
        if (other == com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend.getDefaultInstance()) return this;
        if (other.getFriendUserId() != 0L) {
          setFriendUserId(other.getFriendUserId());
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
        com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long friendUserId_ ;
      /**
       * <code>uint64 friend_user_id = 1;</code>
       */
      public long getFriendUserId() {
        return friendUserId_;
      }
      /**
       * <code>uint64 friend_user_id = 1;</code>
       */
      public Builder setFriendUserId(long value) {
        
        friendUserId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 friend_user_id = 1;</code>
       */
      public Builder clearFriendUserId() {
        
        friendUserId_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.RspCancelMakeFriend)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspCancelMakeFriend)
    private static final com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend();
    }

    public static com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspCancelMakeFriend>
        PARSER = new com.google.protobuf.AbstractParser<RspCancelMakeFriend>() {
      public RspCancelMakeFriend parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new RspCancelMakeFriend(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspCancelMakeFriend> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspCancelMakeFriend> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspCancelMakeFriendOuterClass.RspCancelMakeFriend getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspCancelMakeFriend_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspCancelMakeFriend_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031RspCancelMakeFriend.proto\022\013msggamedata" +
      "\"-\n\023RspCancelMakeFriend\022\026\n\016friend_user_i" +
      "d\030\001 \001(\004B\023\n\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_RspCancelMakeFriend_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspCancelMakeFriend_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspCancelMakeFriend_descriptor,
        new java.lang.String[] { "FriendUserId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
