// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqSetOrUpdateUserMeta.proto

package com.felania.msldb;

public final class ReqSetOrUpdateUserMetaOuterClass {
  private ReqSetOrUpdateUserMetaOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqSetOrUpdateUserMetaOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqSetOrUpdateUserMeta)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
     */
    boolean hasUserMeta();
    /**
     * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
     */
    com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta getUserMeta();
    /**
     * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
     */
    com.felania.msldb.MsgUserMetaOuterClass.MsgUserMetaOrBuilder getUserMetaOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.ReqSetOrUpdateUserMeta}
   */
  public  static final class ReqSetOrUpdateUserMeta extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqSetOrUpdateUserMeta)
      ReqSetOrUpdateUserMetaOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqSetOrUpdateUserMeta.newBuilder() to construct.
    private ReqSetOrUpdateUserMeta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqSetOrUpdateUserMeta() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqSetOrUpdateUserMeta(
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
            case 10: {
              com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.Builder subBuilder = null;
              if (userMeta_ != null) {
                subBuilder = userMeta_.toBuilder();
              }
              userMeta_ = input.readMessage(com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(userMeta_);
                userMeta_ = subBuilder.buildPartial();
              }

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
      return com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.internal_static_msggamedata_ReqSetOrUpdateUserMeta_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.internal_static_msggamedata_ReqSetOrUpdateUserMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta.class, com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta.Builder.class);
    }

    public static final int USER_META_FIELD_NUMBER = 1;
    private com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta userMeta_;
    /**
     * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
     */
    public boolean hasUserMeta() {
      return userMeta_ != null;
    }
    /**
     * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
     */
    public com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta getUserMeta() {
      return userMeta_ == null ? com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.getDefaultInstance() : userMeta_;
    }
    /**
     * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
     */
    public com.felania.msldb.MsgUserMetaOuterClass.MsgUserMetaOrBuilder getUserMetaOrBuilder() {
      return getUserMeta();
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
      if (userMeta_ != null) {
        output.writeMessage(1, getUserMeta());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (userMeta_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getUserMeta());
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
      if (!(obj instanceof com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta other = (com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta) obj;

      boolean result = true;
      result = result && (hasUserMeta() == other.hasUserMeta());
      if (hasUserMeta()) {
        result = result && getUserMeta()
            .equals(other.getUserMeta());
      }
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
      if (hasUserMeta()) {
        hash = (37 * hash) + USER_META_FIELD_NUMBER;
        hash = (53 * hash) + getUserMeta().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta prototype) {
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
     * Protobuf type {@code msggamedata.ReqSetOrUpdateUserMeta}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqSetOrUpdateUserMeta)
        com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMetaOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.internal_static_msggamedata_ReqSetOrUpdateUserMeta_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.internal_static_msggamedata_ReqSetOrUpdateUserMeta_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta.class, com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta.Builder.class);
      }

      // Construct using com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta.newBuilder()
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
        if (userMetaBuilder_ == null) {
          userMeta_ = null;
        } else {
          userMeta_ = null;
          userMetaBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.internal_static_msggamedata_ReqSetOrUpdateUserMeta_descriptor;
      }

      public com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta getDefaultInstanceForType() {
        return com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta.getDefaultInstance();
      }

      public com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta build() {
        com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta buildPartial() {
        com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta result = new com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta(this);
        if (userMetaBuilder_ == null) {
          result.userMeta_ = userMeta_;
        } else {
          result.userMeta_ = userMetaBuilder_.build();
        }
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
        if (other instanceof com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta) {
          return mergeFrom((com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta other) {
        if (other == com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta.getDefaultInstance()) return this;
        if (other.hasUserMeta()) {
          mergeUserMeta(other.getUserMeta());
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
        com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta userMeta_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta, com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.Builder, com.felania.msldb.MsgUserMetaOuterClass.MsgUserMetaOrBuilder> userMetaBuilder_;
      /**
       * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
       */
      public boolean hasUserMeta() {
        return userMetaBuilder_ != null || userMeta_ != null;
      }
      /**
       * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
       */
      public com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta getUserMeta() {
        if (userMetaBuilder_ == null) {
          return userMeta_ == null ? com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.getDefaultInstance() : userMeta_;
        } else {
          return userMetaBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
       */
      public Builder setUserMeta(com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta value) {
        if (userMetaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          userMeta_ = value;
          onChanged();
        } else {
          userMetaBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
       */
      public Builder setUserMeta(
          com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.Builder builderForValue) {
        if (userMetaBuilder_ == null) {
          userMeta_ = builderForValue.build();
          onChanged();
        } else {
          userMetaBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
       */
      public Builder mergeUserMeta(com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta value) {
        if (userMetaBuilder_ == null) {
          if (userMeta_ != null) {
            userMeta_ =
              com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.newBuilder(userMeta_).mergeFrom(value).buildPartial();
          } else {
            userMeta_ = value;
          }
          onChanged();
        } else {
          userMetaBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
       */
      public Builder clearUserMeta() {
        if (userMetaBuilder_ == null) {
          userMeta_ = null;
          onChanged();
        } else {
          userMeta_ = null;
          userMetaBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
       */
      public com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.Builder getUserMetaBuilder() {
        
        onChanged();
        return getUserMetaFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
       */
      public com.felania.msldb.MsgUserMetaOuterClass.MsgUserMetaOrBuilder getUserMetaOrBuilder() {
        if (userMetaBuilder_ != null) {
          return userMetaBuilder_.getMessageOrBuilder();
        } else {
          return userMeta_ == null ?
              com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.getDefaultInstance() : userMeta_;
        }
      }
      /**
       * <code>.msggamedata.MsgUserMeta user_meta = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta, com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.Builder, com.felania.msldb.MsgUserMetaOuterClass.MsgUserMetaOrBuilder> 
          getUserMetaFieldBuilder() {
        if (userMetaBuilder_ == null) {
          userMetaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta, com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.Builder, com.felania.msldb.MsgUserMetaOuterClass.MsgUserMetaOrBuilder>(
                  getUserMeta(),
                  getParentForChildren(),
                  isClean());
          userMeta_ = null;
        }
        return userMetaBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqSetOrUpdateUserMeta)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqSetOrUpdateUserMeta)
    private static final com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta();
    }

    public static com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqSetOrUpdateUserMeta>
        PARSER = new com.google.protobuf.AbstractParser<ReqSetOrUpdateUserMeta>() {
      public ReqSetOrUpdateUserMeta parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqSetOrUpdateUserMeta(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqSetOrUpdateUserMeta> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqSetOrUpdateUserMeta> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqSetOrUpdateUserMetaOuterClass.ReqSetOrUpdateUserMeta getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqSetOrUpdateUserMeta_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqSetOrUpdateUserMeta_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ReqSetOrUpdateUserMeta.proto\022\013msggamed" +
      "ata\032\021MsgUserMeta.proto\"E\n\026ReqSetOrUpdate" +
      "UserMeta\022+\n\tuser_meta\030\001 \001(\0132\030.msggamedat" +
      "a.MsgUserMetaB\023\n\021com.felania.msldbb\006prot" +
      "o3"
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
          com.felania.msldb.MsgUserMetaOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_ReqSetOrUpdateUserMeta_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqSetOrUpdateUserMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqSetOrUpdateUserMeta_descriptor,
        new java.lang.String[] { "UserMeta", });
    com.felania.msldb.MsgUserMetaOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
