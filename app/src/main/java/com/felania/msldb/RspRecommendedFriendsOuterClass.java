// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspRecommendedFriends.proto

package com.felania.msldb;

public final class RspRecommendedFriendsOuterClass {
  private RspRecommendedFriendsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspRecommendedFriendsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspRecommendedFriends)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
     */
    java.util.List<com.felania.msldb.MsgFriendOuterClass.MsgFriend> 
        getRecommenedFriendsList();
    /**
     * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
     */
    com.felania.msldb.MsgFriendOuterClass.MsgFriend getRecommenedFriends(int index);
    /**
     * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
     */
    int getRecommenedFriendsCount();
    /**
     * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgFriendOuterClass.MsgFriendOrBuilder> 
        getRecommenedFriendsOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
     */
    com.felania.msldb.MsgFriendOuterClass.MsgFriendOrBuilder getRecommenedFriendsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.RspRecommendedFriends}
   */
  public  static final class RspRecommendedFriends extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspRecommendedFriends)
      RspRecommendedFriendsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspRecommendedFriends.newBuilder() to construct.
    private RspRecommendedFriends(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspRecommendedFriends() {
      recommenedFriends_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspRecommendedFriends(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                recommenedFriends_ = new java.util.ArrayList<com.felania.msldb.MsgFriendOuterClass.MsgFriend>();
                mutable_bitField0_ |= 0x00000001;
              }
              recommenedFriends_.add(
                  input.readMessage(com.felania.msldb.MsgFriendOuterClass.MsgFriend.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          recommenedFriends_ = java.util.Collections.unmodifiableList(recommenedFriends_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.RspRecommendedFriendsOuterClass.internal_static_msggamedata_RspRecommendedFriends_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspRecommendedFriendsOuterClass.internal_static_msggamedata_RspRecommendedFriends_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends.class, com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends.Builder.class);
    }

    public static final int RECOMMENED_FRIENDS_FIELD_NUMBER = 1;
    private java.util.List<com.felania.msldb.MsgFriendOuterClass.MsgFriend> recommenedFriends_;
    /**
     * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
     */
    public java.util.List<com.felania.msldb.MsgFriendOuterClass.MsgFriend> getRecommenedFriendsList() {
      return recommenedFriends_;
    }
    /**
     * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgFriendOuterClass.MsgFriendOrBuilder> 
        getRecommenedFriendsOrBuilderList() {
      return recommenedFriends_;
    }
    /**
     * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
     */
    public int getRecommenedFriendsCount() {
      return recommenedFriends_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
     */
    public com.felania.msldb.MsgFriendOuterClass.MsgFriend getRecommenedFriends(int index) {
      return recommenedFriends_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
     */
    public com.felania.msldb.MsgFriendOuterClass.MsgFriendOrBuilder getRecommenedFriendsOrBuilder(
        int index) {
      return recommenedFriends_.get(index);
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
      for (int i = 0; i < recommenedFriends_.size(); i++) {
        output.writeMessage(1, recommenedFriends_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < recommenedFriends_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, recommenedFriends_.get(i));
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
      if (!(obj instanceof com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends other = (com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends) obj;

      boolean result = true;
      result = result && getRecommenedFriendsList()
          .equals(other.getRecommenedFriendsList());
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
      if (getRecommenedFriendsCount() > 0) {
        hash = (37 * hash) + RECOMMENED_FRIENDS_FIELD_NUMBER;
        hash = (53 * hash) + getRecommenedFriendsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends prototype) {
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
     * Protobuf type {@code msggamedata.RspRecommendedFriends}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspRecommendedFriends)
        com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriendsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspRecommendedFriendsOuterClass.internal_static_msggamedata_RspRecommendedFriends_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspRecommendedFriendsOuterClass.internal_static_msggamedata_RspRecommendedFriends_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends.class, com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends.Builder.class);
      }

      // Construct using com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends.newBuilder()
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
          getRecommenedFriendsFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (recommenedFriendsBuilder_ == null) {
          recommenedFriends_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          recommenedFriendsBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspRecommendedFriendsOuterClass.internal_static_msggamedata_RspRecommendedFriends_descriptor;
      }

      public com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends getDefaultInstanceForType() {
        return com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends.getDefaultInstance();
      }

      public com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends build() {
        com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends buildPartial() {
        com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends result = new com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends(this);
        int from_bitField0_ = bitField0_;
        if (recommenedFriendsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            recommenedFriends_ = java.util.Collections.unmodifiableList(recommenedFriends_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.recommenedFriends_ = recommenedFriends_;
        } else {
          result.recommenedFriends_ = recommenedFriendsBuilder_.build();
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
        if (other instanceof com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends) {
          return mergeFrom((com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends other) {
        if (other == com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends.getDefaultInstance()) return this;
        if (recommenedFriendsBuilder_ == null) {
          if (!other.recommenedFriends_.isEmpty()) {
            if (recommenedFriends_.isEmpty()) {
              recommenedFriends_ = other.recommenedFriends_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRecommenedFriendsIsMutable();
              recommenedFriends_.addAll(other.recommenedFriends_);
            }
            onChanged();
          }
        } else {
          if (!other.recommenedFriends_.isEmpty()) {
            if (recommenedFriendsBuilder_.isEmpty()) {
              recommenedFriendsBuilder_.dispose();
              recommenedFriendsBuilder_ = null;
              recommenedFriends_ = other.recommenedFriends_;
              bitField0_ = (bitField0_ & ~0x00000001);
              recommenedFriendsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRecommenedFriendsFieldBuilder() : null;
            } else {
              recommenedFriendsBuilder_.addAllMessages(other.recommenedFriends_);
            }
          }
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
        com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.felania.msldb.MsgFriendOuterClass.MsgFriend> recommenedFriends_ =
        java.util.Collections.emptyList();
      private void ensureRecommenedFriendsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          recommenedFriends_ = new java.util.ArrayList<com.felania.msldb.MsgFriendOuterClass.MsgFriend>(recommenedFriends_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgFriendOuterClass.MsgFriend, com.felania.msldb.MsgFriendOuterClass.MsgFriend.Builder, com.felania.msldb.MsgFriendOuterClass.MsgFriendOrBuilder> recommenedFriendsBuilder_;

      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgFriendOuterClass.MsgFriend> getRecommenedFriendsList() {
        if (recommenedFriendsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(recommenedFriends_);
        } else {
          return recommenedFriendsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public int getRecommenedFriendsCount() {
        if (recommenedFriendsBuilder_ == null) {
          return recommenedFriends_.size();
        } else {
          return recommenedFriendsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public com.felania.msldb.MsgFriendOuterClass.MsgFriend getRecommenedFriends(int index) {
        if (recommenedFriendsBuilder_ == null) {
          return recommenedFriends_.get(index);
        } else {
          return recommenedFriendsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public Builder setRecommenedFriends(
          int index, com.felania.msldb.MsgFriendOuterClass.MsgFriend value) {
        if (recommenedFriendsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecommenedFriendsIsMutable();
          recommenedFriends_.set(index, value);
          onChanged();
        } else {
          recommenedFriendsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public Builder setRecommenedFriends(
          int index, com.felania.msldb.MsgFriendOuterClass.MsgFriend.Builder builderForValue) {
        if (recommenedFriendsBuilder_ == null) {
          ensureRecommenedFriendsIsMutable();
          recommenedFriends_.set(index, builderForValue.build());
          onChanged();
        } else {
          recommenedFriendsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public Builder addRecommenedFriends(com.felania.msldb.MsgFriendOuterClass.MsgFriend value) {
        if (recommenedFriendsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecommenedFriendsIsMutable();
          recommenedFriends_.add(value);
          onChanged();
        } else {
          recommenedFriendsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public Builder addRecommenedFriends(
          int index, com.felania.msldb.MsgFriendOuterClass.MsgFriend value) {
        if (recommenedFriendsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecommenedFriendsIsMutable();
          recommenedFriends_.add(index, value);
          onChanged();
        } else {
          recommenedFriendsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public Builder addRecommenedFriends(
          com.felania.msldb.MsgFriendOuterClass.MsgFriend.Builder builderForValue) {
        if (recommenedFriendsBuilder_ == null) {
          ensureRecommenedFriendsIsMutable();
          recommenedFriends_.add(builderForValue.build());
          onChanged();
        } else {
          recommenedFriendsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public Builder addRecommenedFriends(
          int index, com.felania.msldb.MsgFriendOuterClass.MsgFriend.Builder builderForValue) {
        if (recommenedFriendsBuilder_ == null) {
          ensureRecommenedFriendsIsMutable();
          recommenedFriends_.add(index, builderForValue.build());
          onChanged();
        } else {
          recommenedFriendsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public Builder addAllRecommenedFriends(
          java.lang.Iterable<? extends com.felania.msldb.MsgFriendOuterClass.MsgFriend> values) {
        if (recommenedFriendsBuilder_ == null) {
          ensureRecommenedFriendsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, recommenedFriends_);
          onChanged();
        } else {
          recommenedFriendsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public Builder clearRecommenedFriends() {
        if (recommenedFriendsBuilder_ == null) {
          recommenedFriends_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          recommenedFriendsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public Builder removeRecommenedFriends(int index) {
        if (recommenedFriendsBuilder_ == null) {
          ensureRecommenedFriendsIsMutable();
          recommenedFriends_.remove(index);
          onChanged();
        } else {
          recommenedFriendsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public com.felania.msldb.MsgFriendOuterClass.MsgFriend.Builder getRecommenedFriendsBuilder(
          int index) {
        return getRecommenedFriendsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public com.felania.msldb.MsgFriendOuterClass.MsgFriendOrBuilder getRecommenedFriendsOrBuilder(
          int index) {
        if (recommenedFriendsBuilder_ == null) {
          return recommenedFriends_.get(index);  } else {
          return recommenedFriendsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgFriendOuterClass.MsgFriendOrBuilder> 
           getRecommenedFriendsOrBuilderList() {
        if (recommenedFriendsBuilder_ != null) {
          return recommenedFriendsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(recommenedFriends_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public com.felania.msldb.MsgFriendOuterClass.MsgFriend.Builder addRecommenedFriendsBuilder() {
        return getRecommenedFriendsFieldBuilder().addBuilder(
            com.felania.msldb.MsgFriendOuterClass.MsgFriend.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public com.felania.msldb.MsgFriendOuterClass.MsgFriend.Builder addRecommenedFriendsBuilder(
          int index) {
        return getRecommenedFriendsFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgFriendOuterClass.MsgFriend.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgFriend recommened_friends = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgFriendOuterClass.MsgFriend.Builder> 
           getRecommenedFriendsBuilderList() {
        return getRecommenedFriendsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgFriendOuterClass.MsgFriend, com.felania.msldb.MsgFriendOuterClass.MsgFriend.Builder, com.felania.msldb.MsgFriendOuterClass.MsgFriendOrBuilder> 
          getRecommenedFriendsFieldBuilder() {
        if (recommenedFriendsBuilder_ == null) {
          recommenedFriendsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgFriendOuterClass.MsgFriend, com.felania.msldb.MsgFriendOuterClass.MsgFriend.Builder, com.felania.msldb.MsgFriendOuterClass.MsgFriendOrBuilder>(
                  recommenedFriends_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          recommenedFriends_ = null;
        }
        return recommenedFriendsBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.RspRecommendedFriends)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspRecommendedFriends)
    private static final com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends();
    }

    public static com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspRecommendedFriends>
        PARSER = new com.google.protobuf.AbstractParser<RspRecommendedFriends>() {
      public RspRecommendedFriends parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new RspRecommendedFriends(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspRecommendedFriends> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspRecommendedFriends> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspRecommendedFriendsOuterClass.RspRecommendedFriends getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspRecommendedFriends_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspRecommendedFriends_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033RspRecommendedFriends.proto\022\013msggameda" +
      "ta\032\017MsgFriend.proto\"K\n\025RspRecommendedFri" +
      "ends\0222\n\022recommened_friends\030\001 \003(\0132\026.msgga" +
      "medata.MsgFriendB\023\n\021com.felania.msldbb\006p" +
      "roto3"
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
          com.felania.msldb.MsgFriendOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_RspRecommendedFriends_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspRecommendedFriends_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspRecommendedFriends_descriptor,
        new java.lang.String[] { "RecommenedFriends", });
    com.felania.msldb.MsgFriendOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
