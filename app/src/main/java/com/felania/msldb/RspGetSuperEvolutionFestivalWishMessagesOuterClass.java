// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspGetSuperEvolutionFestivalWishMessages.proto

package com.felania.msldb;

public final class RspGetSuperEvolutionFestivalWishMessagesOuterClass {
  private RspGetSuperEvolutionFestivalWishMessagesOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspGetSuperEvolutionFestivalWishMessagesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspGetSuperEvolutionFestivalWishMessages)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
     */
    java.util.List<com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage> 
        getWishMessagesList();
    /**
     * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
     */
    com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage getWishMessages(int index);
    /**
     * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
     */
    int getWishMessagesCount();
    /**
     * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessageOrBuilder> 
        getWishMessagesOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
     */
    com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessageOrBuilder getWishMessagesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.RspGetSuperEvolutionFestivalWishMessages}
   */
  public  static final class RspGetSuperEvolutionFestivalWishMessages extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspGetSuperEvolutionFestivalWishMessages)
      RspGetSuperEvolutionFestivalWishMessagesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspGetSuperEvolutionFestivalWishMessages.newBuilder() to construct.
    private RspGetSuperEvolutionFestivalWishMessages(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspGetSuperEvolutionFestivalWishMessages() {
      wishMessages_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspGetSuperEvolutionFestivalWishMessages(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                wishMessages_ = new java.util.ArrayList<com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage>();
                mutable_bitField0_ |= 0x00000001;
              }
              wishMessages_.add(
                  input.readMessage(com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage.parser(), extensionRegistry));
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
          wishMessages_ = java.util.Collections.unmodifiableList(wishMessages_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.internal_static_msggamedata_RspGetSuperEvolutionFestivalWishMessages_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.internal_static_msggamedata_RspGetSuperEvolutionFestivalWishMessages_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages.class, com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages.Builder.class);
    }

    public static final int WISH_MESSAGES_FIELD_NUMBER = 1;
    private java.util.List<com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage> wishMessages_;
    /**
     * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
     */
    public java.util.List<com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage> getWishMessagesList() {
      return wishMessages_;
    }
    /**
     * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessageOrBuilder> 
        getWishMessagesOrBuilderList() {
      return wishMessages_;
    }
    /**
     * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
     */
    public int getWishMessagesCount() {
      return wishMessages_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
     */
    public com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage getWishMessages(int index) {
      return wishMessages_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
     */
    public com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessageOrBuilder getWishMessagesOrBuilder(
        int index) {
      return wishMessages_.get(index);
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
      for (int i = 0; i < wishMessages_.size(); i++) {
        output.writeMessage(1, wishMessages_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < wishMessages_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, wishMessages_.get(i));
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
      if (!(obj instanceof com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages other = (com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages) obj;

      boolean result = true;
      result = result && getWishMessagesList()
          .equals(other.getWishMessagesList());
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
      if (getWishMessagesCount() > 0) {
        hash = (37 * hash) + WISH_MESSAGES_FIELD_NUMBER;
        hash = (53 * hash) + getWishMessagesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages prototype) {
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
     * Protobuf type {@code msggamedata.RspGetSuperEvolutionFestivalWishMessages}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspGetSuperEvolutionFestivalWishMessages)
        com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessagesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.internal_static_msggamedata_RspGetSuperEvolutionFestivalWishMessages_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.internal_static_msggamedata_RspGetSuperEvolutionFestivalWishMessages_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages.class, com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages.Builder.class);
      }

      // Construct using com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages.newBuilder()
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
          getWishMessagesFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (wishMessagesBuilder_ == null) {
          wishMessages_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          wishMessagesBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.internal_static_msggamedata_RspGetSuperEvolutionFestivalWishMessages_descriptor;
      }

      public com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages getDefaultInstanceForType() {
        return com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages.getDefaultInstance();
      }

      public com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages build() {
        com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages buildPartial() {
        com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages result = new com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages(this);
        int from_bitField0_ = bitField0_;
        if (wishMessagesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            wishMessages_ = java.util.Collections.unmodifiableList(wishMessages_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.wishMessages_ = wishMessages_;
        } else {
          result.wishMessages_ = wishMessagesBuilder_.build();
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
        if (other instanceof com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages) {
          return mergeFrom((com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages other) {
        if (other == com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages.getDefaultInstance()) return this;
        if (wishMessagesBuilder_ == null) {
          if (!other.wishMessages_.isEmpty()) {
            if (wishMessages_.isEmpty()) {
              wishMessages_ = other.wishMessages_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureWishMessagesIsMutable();
              wishMessages_.addAll(other.wishMessages_);
            }
            onChanged();
          }
        } else {
          if (!other.wishMessages_.isEmpty()) {
            if (wishMessagesBuilder_.isEmpty()) {
              wishMessagesBuilder_.dispose();
              wishMessagesBuilder_ = null;
              wishMessages_ = other.wishMessages_;
              bitField0_ = (bitField0_ & ~0x00000001);
              wishMessagesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getWishMessagesFieldBuilder() : null;
            } else {
              wishMessagesBuilder_.addAllMessages(other.wishMessages_);
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
        com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage> wishMessages_ =
        java.util.Collections.emptyList();
      private void ensureWishMessagesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          wishMessages_ = new java.util.ArrayList<com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage>(wishMessages_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage, com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage.Builder, com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessageOrBuilder> wishMessagesBuilder_;

      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage> getWishMessagesList() {
        if (wishMessagesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(wishMessages_);
        } else {
          return wishMessagesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public int getWishMessagesCount() {
        if (wishMessagesBuilder_ == null) {
          return wishMessages_.size();
        } else {
          return wishMessagesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage getWishMessages(int index) {
        if (wishMessagesBuilder_ == null) {
          return wishMessages_.get(index);
        } else {
          return wishMessagesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public Builder setWishMessages(
          int index, com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage value) {
        if (wishMessagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWishMessagesIsMutable();
          wishMessages_.set(index, value);
          onChanged();
        } else {
          wishMessagesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public Builder setWishMessages(
          int index, com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage.Builder builderForValue) {
        if (wishMessagesBuilder_ == null) {
          ensureWishMessagesIsMutable();
          wishMessages_.set(index, builderForValue.build());
          onChanged();
        } else {
          wishMessagesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public Builder addWishMessages(com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage value) {
        if (wishMessagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWishMessagesIsMutable();
          wishMessages_.add(value);
          onChanged();
        } else {
          wishMessagesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public Builder addWishMessages(
          int index, com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage value) {
        if (wishMessagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWishMessagesIsMutable();
          wishMessages_.add(index, value);
          onChanged();
        } else {
          wishMessagesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public Builder addWishMessages(
          com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage.Builder builderForValue) {
        if (wishMessagesBuilder_ == null) {
          ensureWishMessagesIsMutable();
          wishMessages_.add(builderForValue.build());
          onChanged();
        } else {
          wishMessagesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public Builder addWishMessages(
          int index, com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage.Builder builderForValue) {
        if (wishMessagesBuilder_ == null) {
          ensureWishMessagesIsMutable();
          wishMessages_.add(index, builderForValue.build());
          onChanged();
        } else {
          wishMessagesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public Builder addAllWishMessages(
          java.lang.Iterable<? extends com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage> values) {
        if (wishMessagesBuilder_ == null) {
          ensureWishMessagesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, wishMessages_);
          onChanged();
        } else {
          wishMessagesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public Builder clearWishMessages() {
        if (wishMessagesBuilder_ == null) {
          wishMessages_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          wishMessagesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public Builder removeWishMessages(int index) {
        if (wishMessagesBuilder_ == null) {
          ensureWishMessagesIsMutable();
          wishMessages_.remove(index);
          onChanged();
        } else {
          wishMessagesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage.Builder getWishMessagesBuilder(
          int index) {
        return getWishMessagesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessageOrBuilder getWishMessagesOrBuilder(
          int index) {
        if (wishMessagesBuilder_ == null) {
          return wishMessages_.get(index);  } else {
          return wishMessagesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessageOrBuilder> 
           getWishMessagesOrBuilderList() {
        if (wishMessagesBuilder_ != null) {
          return wishMessagesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(wishMessages_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage.Builder addWishMessagesBuilder() {
        return getWishMessagesFieldBuilder().addBuilder(
            com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage.Builder addWishMessagesBuilder(
          int index) {
        return getWishMessagesFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgCaptureFestivalEventMessage wish_messages = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage.Builder> 
           getWishMessagesBuilderList() {
        return getWishMessagesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage, com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage.Builder, com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessageOrBuilder> 
          getWishMessagesFieldBuilder() {
        if (wishMessagesBuilder_ == null) {
          wishMessagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage, com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessage.Builder, com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.MsgCaptureFestivalEventMessageOrBuilder>(
                  wishMessages_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          wishMessages_ = null;
        }
        return wishMessagesBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.RspGetSuperEvolutionFestivalWishMessages)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspGetSuperEvolutionFestivalWishMessages)
    private static final com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages();
    }

    public static com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspGetSuperEvolutionFestivalWishMessages>
        PARSER = new com.google.protobuf.AbstractParser<RspGetSuperEvolutionFestivalWishMessages>() {
      public RspGetSuperEvolutionFestivalWishMessages parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RspGetSuperEvolutionFestivalWishMessages(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspGetSuperEvolutionFestivalWishMessages> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspGetSuperEvolutionFestivalWishMessages> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspGetSuperEvolutionFestivalWishMessagesOuterClass.RspGetSuperEvolutionFestivalWishMessages getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspGetSuperEvolutionFestivalWishMessages_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspGetSuperEvolutionFestivalWishMessages_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.RspGetSuperEvolutionFestivalWishMessag" +
      "es.proto\022\013msggamedata\032$MsgCaptureFestiva" +
      "lEventMessage.proto\"n\n(RspGetSuperEvolut" +
      "ionFestivalWishMessages\022B\n\rwish_messages" +
      "\030\001 \003(\0132+.msggamedata.MsgCaptureFestivalE" +
      "ventMessageB\023\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_RspGetSuperEvolutionFestivalWishMessages_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspGetSuperEvolutionFestivalWishMessages_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspGetSuperEvolutionFestivalWishMessages_descriptor,
        new java.lang.String[] { "WishMessages", });
    com.felania.msldb.MsgCaptureFestivalEventMessageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
