// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspSellSuperStoneStuff.proto

package com.felania.msldb;

public final class RspSellSuperStoneStuffOuterClass {
  private RspSellSuperStoneStuffOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspSellSuperStoneStuffOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspSellSuperStoneStuff)
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

    /**
     * <code>.msggamedata.MsgUserItem user_item = 2;</code>
     */
    boolean hasUserItem();
    /**
     * <code>.msggamedata.MsgUserItem user_item = 2;</code>
     */
    com.felania.msldb.MsgUserItemOuterClass.MsgUserItem getUserItem();
    /**
     * <code>.msggamedata.MsgUserItem user_item = 2;</code>
     */
    com.felania.msldb.MsgUserItemOuterClass.MsgUserItemOrBuilder getUserItemOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.RspSellSuperStoneStuff}
   */
  public  static final class RspSellSuperStoneStuff extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspSellSuperStoneStuff)
      RspSellSuperStoneStuffOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspSellSuperStoneStuff.newBuilder() to construct.
    private RspSellSuperStoneStuff(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspSellSuperStoneStuff() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspSellSuperStoneStuff(
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
            case 18: {
              com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.Builder subBuilder = null;
              if (userItem_ != null) {
                subBuilder = userItem_.toBuilder();
              }
              userItem_ = input.readMessage(com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(userItem_);
                userItem_ = subBuilder.buildPartial();
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
      return com.felania.msldb.RspSellSuperStoneStuffOuterClass.internal_static_msggamedata_RspSellSuperStoneStuff_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspSellSuperStoneStuffOuterClass.internal_static_msggamedata_RspSellSuperStoneStuff_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff.class, com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff.Builder.class);
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

    public static final int USER_ITEM_FIELD_NUMBER = 2;
    private com.felania.msldb.MsgUserItemOuterClass.MsgUserItem userItem_;
    /**
     * <code>.msggamedata.MsgUserItem user_item = 2;</code>
     */
    public boolean hasUserItem() {
      return userItem_ != null;
    }
    /**
     * <code>.msggamedata.MsgUserItem user_item = 2;</code>
     */
    public com.felania.msldb.MsgUserItemOuterClass.MsgUserItem getUserItem() {
      return userItem_ == null ? com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.getDefaultInstance() : userItem_;
    }
    /**
     * <code>.msggamedata.MsgUserItem user_item = 2;</code>
     */
    public com.felania.msldb.MsgUserItemOuterClass.MsgUserItemOrBuilder getUserItemOrBuilder() {
      return getUserItem();
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
      if (userItem_ != null) {
        output.writeMessage(2, getUserItem());
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
      if (userItem_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getUserItem());
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
      if (!(obj instanceof com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff other = (com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff) obj;

      boolean result = true;
      result = result && (hasUser() == other.hasUser());
      if (hasUser()) {
        result = result && getUser()
            .equals(other.getUser());
      }
      result = result && (hasUserItem() == other.hasUserItem());
      if (hasUserItem()) {
        result = result && getUserItem()
            .equals(other.getUserItem());
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
      if (hasUserItem()) {
        hash = (37 * hash) + USER_ITEM_FIELD_NUMBER;
        hash = (53 * hash) + getUserItem().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff prototype) {
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
     * Protobuf type {@code msggamedata.RspSellSuperStoneStuff}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspSellSuperStoneStuff)
        com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuffOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspSellSuperStoneStuffOuterClass.internal_static_msggamedata_RspSellSuperStoneStuff_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspSellSuperStoneStuffOuterClass.internal_static_msggamedata_RspSellSuperStoneStuff_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff.class, com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff.Builder.class);
      }

      // Construct using com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff.newBuilder()
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
        if (userItemBuilder_ == null) {
          userItem_ = null;
        } else {
          userItem_ = null;
          userItemBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspSellSuperStoneStuffOuterClass.internal_static_msggamedata_RspSellSuperStoneStuff_descriptor;
      }

      public com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff getDefaultInstanceForType() {
        return com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff.getDefaultInstance();
      }

      public com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff build() {
        com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff buildPartial() {
        com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff result = new com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff(this);
        if (userBuilder_ == null) {
          result.user_ = user_;
        } else {
          result.user_ = userBuilder_.build();
        }
        if (userItemBuilder_ == null) {
          result.userItem_ = userItem_;
        } else {
          result.userItem_ = userItemBuilder_.build();
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
        if (other instanceof com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff) {
          return mergeFrom((com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff other) {
        if (other == com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff.getDefaultInstance()) return this;
        if (other.hasUser()) {
          mergeUser(other.getUser());
        }
        if (other.hasUserItem()) {
          mergeUserItem(other.getUserItem());
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
        com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff) e.getUnfinishedMessage();
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

      private com.felania.msldb.MsgUserItemOuterClass.MsgUserItem userItem_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserItemOuterClass.MsgUserItem, com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.Builder, com.felania.msldb.MsgUserItemOuterClass.MsgUserItemOrBuilder> userItemBuilder_;
      /**
       * <code>.msggamedata.MsgUserItem user_item = 2;</code>
       */
      public boolean hasUserItem() {
        return userItemBuilder_ != null || userItem_ != null;
      }
      /**
       * <code>.msggamedata.MsgUserItem user_item = 2;</code>
       */
      public com.felania.msldb.MsgUserItemOuterClass.MsgUserItem getUserItem() {
        if (userItemBuilder_ == null) {
          return userItem_ == null ? com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.getDefaultInstance() : userItem_;
        } else {
          return userItemBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgUserItem user_item = 2;</code>
       */
      public Builder setUserItem(com.felania.msldb.MsgUserItemOuterClass.MsgUserItem value) {
        if (userItemBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          userItem_ = value;
          onChanged();
        } else {
          userItemBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserItem user_item = 2;</code>
       */
      public Builder setUserItem(
          com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.Builder builderForValue) {
        if (userItemBuilder_ == null) {
          userItem_ = builderForValue.build();
          onChanged();
        } else {
          userItemBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserItem user_item = 2;</code>
       */
      public Builder mergeUserItem(com.felania.msldb.MsgUserItemOuterClass.MsgUserItem value) {
        if (userItemBuilder_ == null) {
          if (userItem_ != null) {
            userItem_ =
              com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.newBuilder(userItem_).mergeFrom(value).buildPartial();
          } else {
            userItem_ = value;
          }
          onChanged();
        } else {
          userItemBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserItem user_item = 2;</code>
       */
      public Builder clearUserItem() {
        if (userItemBuilder_ == null) {
          userItem_ = null;
          onChanged();
        } else {
          userItem_ = null;
          userItemBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserItem user_item = 2;</code>
       */
      public com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.Builder getUserItemBuilder() {
        
        onChanged();
        return getUserItemFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgUserItem user_item = 2;</code>
       */
      public com.felania.msldb.MsgUserItemOuterClass.MsgUserItemOrBuilder getUserItemOrBuilder() {
        if (userItemBuilder_ != null) {
          return userItemBuilder_.getMessageOrBuilder();
        } else {
          return userItem_ == null ?
              com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.getDefaultInstance() : userItem_;
        }
      }
      /**
       * <code>.msggamedata.MsgUserItem user_item = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserItemOuterClass.MsgUserItem, com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.Builder, com.felania.msldb.MsgUserItemOuterClass.MsgUserItemOrBuilder> 
          getUserItemFieldBuilder() {
        if (userItemBuilder_ == null) {
          userItemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgUserItemOuterClass.MsgUserItem, com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.Builder, com.felania.msldb.MsgUserItemOuterClass.MsgUserItemOrBuilder>(
                  getUserItem(),
                  getParentForChildren(),
                  isClean());
          userItem_ = null;
        }
        return userItemBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.RspSellSuperStoneStuff)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspSellSuperStoneStuff)
    private static final com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff();
    }

    public static com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspSellSuperStoneStuff>
        PARSER = new com.google.protobuf.AbstractParser<RspSellSuperStoneStuff>() {
      public RspSellSuperStoneStuff parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RspSellSuperStoneStuff(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspSellSuperStoneStuff> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspSellSuperStoneStuff> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspSellSuperStoneStuffOuterClass.RspSellSuperStoneStuff getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspSellSuperStoneStuff_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspSellSuperStoneStuff_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034RspSellSuperStoneStuff.proto\022\013msggamed" +
      "ata\032\rMsgUser.proto\032\021MsgUserItem.proto\"i\n" +
      "\026RspSellSuperStoneStuff\022\"\n\004user\030\001 \001(\0132\024." +
      "msggamedata.MsgUser\022+\n\tuser_item\030\002 \001(\0132\030" +
      ".msggamedata.MsgUserItemB\023\n\021com.felania." +
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
          com.felania.msldb.MsgUserOuterClass.getDescriptor(),
          com.felania.msldb.MsgUserItemOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_RspSellSuperStoneStuff_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspSellSuperStoneStuff_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspSellSuperStoneStuff_descriptor,
        new java.lang.String[] { "User", "UserItem", });
    com.felania.msldb.MsgUserOuterClass.getDescriptor();
    com.felania.msldb.MsgUserItemOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
