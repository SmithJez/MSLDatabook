// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspSetAutoBuyMonsterCaptureBullet.proto

package com.felania.msldb;

public final class RspSetAutoBuyMonsterCaptureBulletOuterClass {
  private RspSetAutoBuyMonsterCaptureBulletOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspSetAutoBuyMonsterCaptureBulletOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspSetAutoBuyMonsterCaptureBullet)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgUser user = 1;</code>
     */
    boolean hasUser();
    /**
     * <code>.msggamedata.MsgUser user = 1;</code>
     */
    com.felania.msldb.MsgUserOuterClass.MsgUser getUser();
    /**
     * <code>.msggamedata.MsgUser user = 1;</code>
     */
    com.felania.msldb.MsgUserOuterClass.MsgUserOrBuilder getUserOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.RspSetAutoBuyMonsterCaptureBullet}
   */
  public  static final class RspSetAutoBuyMonsterCaptureBullet extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspSetAutoBuyMonsterCaptureBullet)
      RspSetAutoBuyMonsterCaptureBulletOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspSetAutoBuyMonsterCaptureBullet.newBuilder() to construct.
    private RspSetAutoBuyMonsterCaptureBullet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspSetAutoBuyMonsterCaptureBullet() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspSetAutoBuyMonsterCaptureBullet(
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
            case 10: {
              com.felania.msldb.MsgUserOuterClass.MsgUser.Builder subBuilder = null;
              if (user_ != null) {
                subBuilder = user_.toBuilder();
              }
              user_ = input.readMessage(com.felania.msldb.MsgUserOuterClass.MsgUser.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(user_);
                user_ = subBuilder.buildPartial();
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
      return com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.internal_static_msggamedata_RspSetAutoBuyMonsterCaptureBullet_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.internal_static_msggamedata_RspSetAutoBuyMonsterCaptureBullet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet.class, com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet.Builder.class);
    }

    public static final int USER_FIELD_NUMBER = 1;
    private com.felania.msldb.MsgUserOuterClass.MsgUser user_;
    /**
     * <code>.msggamedata.MsgUser user = 1;</code>
     */
    public boolean hasUser() {
      return user_ != null;
    }
    /**
     * <code>.msggamedata.MsgUser user = 1;</code>
     */
    public com.felania.msldb.MsgUserOuterClass.MsgUser getUser() {
      return user_ == null ? com.felania.msldb.MsgUserOuterClass.MsgUser.getDefaultInstance() : user_;
    }
    /**
     * <code>.msggamedata.MsgUser user = 1;</code>
     */
    public com.felania.msldb.MsgUserOuterClass.MsgUserOrBuilder getUserOrBuilder() {
      return getUser();
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
      if (user_ != null) {
        output.writeMessage(1, getUser());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (user_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getUser());
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
      if (!(obj instanceof com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet other = (com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet) obj;

      boolean result = true;
      result = result && (hasUser() == other.hasUser());
      if (hasUser()) {
        result = result && getUser()
            .equals(other.getUser());
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
      if (hasUser()) {
        hash = (37 * hash) + USER_FIELD_NUMBER;
        hash = (53 * hash) + getUser().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet prototype) {
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
     * Protobuf type {@code msggamedata.RspSetAutoBuyMonsterCaptureBullet}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspSetAutoBuyMonsterCaptureBullet)
        com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBulletOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.internal_static_msggamedata_RspSetAutoBuyMonsterCaptureBullet_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.internal_static_msggamedata_RspSetAutoBuyMonsterCaptureBullet_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet.class, com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet.Builder.class);
      }

      // Construct using com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet.newBuilder()
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
        if (userBuilder_ == null) {
          user_ = null;
        } else {
          user_ = null;
          userBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.internal_static_msggamedata_RspSetAutoBuyMonsterCaptureBullet_descriptor;
      }

      public com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet getDefaultInstanceForType() {
        return com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet.getDefaultInstance();
      }

      public com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet build() {
        com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet buildPartial() {
        com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet result = new com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet(this);
        if (userBuilder_ == null) {
          result.user_ = user_;
        } else {
          result.user_ = userBuilder_.build();
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
        if (other instanceof com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet) {
          return mergeFrom((com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet other) {
        if (other == com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet.getDefaultInstance()) return this;
        if (other.hasUser()) {
          mergeUser(other.getUser());
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
        com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.felania.msldb.MsgUserOuterClass.MsgUser user_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserOuterClass.MsgUser, com.felania.msldb.MsgUserOuterClass.MsgUser.Builder, com.felania.msldb.MsgUserOuterClass.MsgUserOrBuilder> userBuilder_;
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public boolean hasUser() {
        return userBuilder_ != null || user_ != null;
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public com.felania.msldb.MsgUserOuterClass.MsgUser getUser() {
        if (userBuilder_ == null) {
          return user_ == null ? com.felania.msldb.MsgUserOuterClass.MsgUser.getDefaultInstance() : user_;
        } else {
          return userBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public Builder setUser(com.felania.msldb.MsgUserOuterClass.MsgUser value) {
        if (userBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          user_ = value;
          onChanged();
        } else {
          userBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public Builder setUser(
          com.felania.msldb.MsgUserOuterClass.MsgUser.Builder builderForValue) {
        if (userBuilder_ == null) {
          user_ = builderForValue.build();
          onChanged();
        } else {
          userBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public Builder mergeUser(com.felania.msldb.MsgUserOuterClass.MsgUser value) {
        if (userBuilder_ == null) {
          if (user_ != null) {
            user_ =
              com.felania.msldb.MsgUserOuterClass.MsgUser.newBuilder(user_).mergeFrom(value).buildPartial();
          } else {
            user_ = value;
          }
          onChanged();
        } else {
          userBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public Builder clearUser() {
        if (userBuilder_ == null) {
          user_ = null;
          onChanged();
        } else {
          user_ = null;
          userBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public com.felania.msldb.MsgUserOuterClass.MsgUser.Builder getUserBuilder() {
        
        onChanged();
        return getUserFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public com.felania.msldb.MsgUserOuterClass.MsgUserOrBuilder getUserOrBuilder() {
        if (userBuilder_ != null) {
          return userBuilder_.getMessageOrBuilder();
        } else {
          return user_ == null ?
              com.felania.msldb.MsgUserOuterClass.MsgUser.getDefaultInstance() : user_;
        }
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserOuterClass.MsgUser, com.felania.msldb.MsgUserOuterClass.MsgUser.Builder, com.felania.msldb.MsgUserOuterClass.MsgUserOrBuilder> 
          getUserFieldBuilder() {
        if (userBuilder_ == null) {
          userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgUserOuterClass.MsgUser, com.felania.msldb.MsgUserOuterClass.MsgUser.Builder, com.felania.msldb.MsgUserOuterClass.MsgUserOrBuilder>(
                  getUser(),
                  getParentForChildren(),
                  isClean());
          user_ = null;
        }
        return userBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.RspSetAutoBuyMonsterCaptureBullet)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspSetAutoBuyMonsterCaptureBullet)
    private static final com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet();
    }

    public static com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspSetAutoBuyMonsterCaptureBullet>
        PARSER = new com.google.protobuf.AbstractParser<RspSetAutoBuyMonsterCaptureBullet>() {
      public RspSetAutoBuyMonsterCaptureBullet parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new RspSetAutoBuyMonsterCaptureBullet(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspSetAutoBuyMonsterCaptureBullet> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspSetAutoBuyMonsterCaptureBullet> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspSetAutoBuyMonsterCaptureBulletOuterClass.RspSetAutoBuyMonsterCaptureBullet getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspSetAutoBuyMonsterCaptureBullet_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspSetAutoBuyMonsterCaptureBullet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'RspSetAutoBuyMonsterCaptureBullet.prot" +
      "o\022\013msggamedata\032\rMsgUser.proto\"G\n!RspSetA" +
      "utoBuyMonsterCaptureBullet\022\"\n\004user\030\001 \001(\013" +
      "2\024.msggamedata.MsgUserB\023\n\021com.felania.ms" +
      "ldbb\006proto3"
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
          com.felania.msldb.MsgUserOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_RspSetAutoBuyMonsterCaptureBullet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspSetAutoBuyMonsterCaptureBullet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspSetAutoBuyMonsterCaptureBullet_descriptor,
        new java.lang.String[] { "User", });
    com.felania.msldb.MsgUserOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
