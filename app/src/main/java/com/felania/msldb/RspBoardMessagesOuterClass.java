// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspBoardMessages.proto

package com.felania.msldb;

public final class RspBoardMessagesOuterClass {
  private RspBoardMessagesOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspBoardMessagesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspBoardMessages)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
     */
    java.util.List<com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage> 
        getBoradMessagesList();
    /**
     * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
     */
    com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage getBoradMessages(int index);
    /**
     * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
     */
    int getBoradMessagesCount();
    /**
     * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessageOrBuilder> 
        getBoradMessagesOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
     */
    com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessageOrBuilder getBoradMessagesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.RspBoardMessages}
   */
  public  static final class RspBoardMessages extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspBoardMessages)
      RspBoardMessagesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspBoardMessages.newBuilder() to construct.
    private RspBoardMessages(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspBoardMessages() {
      boradMessages_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspBoardMessages(
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
                boradMessages_ = new java.util.ArrayList<com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage>();
                mutable_bitField0_ |= 0x00000001;
              }
              boradMessages_.add(
                  input.readMessage(com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage.parser(), extensionRegistry));
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
          boradMessages_ = java.util.Collections.unmodifiableList(boradMessages_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.RspBoardMessagesOuterClass.internal_static_msggamedata_RspBoardMessages_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspBoardMessagesOuterClass.internal_static_msggamedata_RspBoardMessages_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages.class, com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages.Builder.class);
    }

    public static final int BORAD_MESSAGES_FIELD_NUMBER = 1;
    private java.util.List<com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage> boradMessages_;
    /**
     * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
     */
    public java.util.List<com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage> getBoradMessagesList() {
      return boradMessages_;
    }
    /**
     * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessageOrBuilder> 
        getBoradMessagesOrBuilderList() {
      return boradMessages_;
    }
    /**
     * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
     */
    public int getBoradMessagesCount() {
      return boradMessages_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
     */
    public com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage getBoradMessages(int index) {
      return boradMessages_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
     */
    public com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessageOrBuilder getBoradMessagesOrBuilder(
        int index) {
      return boradMessages_.get(index);
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
      for (int i = 0; i < boradMessages_.size(); i++) {
        output.writeMessage(1, boradMessages_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < boradMessages_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, boradMessages_.get(i));
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
      if (!(obj instanceof com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages other = (com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages) obj;

      boolean result = true;
      result = result && getBoradMessagesList()
          .equals(other.getBoradMessagesList());
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
      if (getBoradMessagesCount() > 0) {
        hash = (37 * hash) + BORAD_MESSAGES_FIELD_NUMBER;
        hash = (53 * hash) + getBoradMessagesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages prototype) {
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
     * Protobuf type {@code msggamedata.RspBoardMessages}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspBoardMessages)
        com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessagesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspBoardMessagesOuterClass.internal_static_msggamedata_RspBoardMessages_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspBoardMessagesOuterClass.internal_static_msggamedata_RspBoardMessages_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages.class, com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages.Builder.class);
      }

      // Construct using com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages.newBuilder()
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
          getBoradMessagesFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (boradMessagesBuilder_ == null) {
          boradMessages_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          boradMessagesBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspBoardMessagesOuterClass.internal_static_msggamedata_RspBoardMessages_descriptor;
      }

      public com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages getDefaultInstanceForType() {
        return com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages.getDefaultInstance();
      }

      public com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages build() {
        com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages buildPartial() {
        com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages result = new com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages(this);
        int from_bitField0_ = bitField0_;
        if (boradMessagesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            boradMessages_ = java.util.Collections.unmodifiableList(boradMessages_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.boradMessages_ = boradMessages_;
        } else {
          result.boradMessages_ = boradMessagesBuilder_.build();
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
        if (other instanceof com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages) {
          return mergeFrom((com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages other) {
        if (other == com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages.getDefaultInstance()) return this;
        if (boradMessagesBuilder_ == null) {
          if (!other.boradMessages_.isEmpty()) {
            if (boradMessages_.isEmpty()) {
              boradMessages_ = other.boradMessages_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBoradMessagesIsMutable();
              boradMessages_.addAll(other.boradMessages_);
            }
            onChanged();
          }
        } else {
          if (!other.boradMessages_.isEmpty()) {
            if (boradMessagesBuilder_.isEmpty()) {
              boradMessagesBuilder_.dispose();
              boradMessagesBuilder_ = null;
              boradMessages_ = other.boradMessages_;
              bitField0_ = (bitField0_ & ~0x00000001);
              boradMessagesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBoradMessagesFieldBuilder() : null;
            } else {
              boradMessagesBuilder_.addAllMessages(other.boradMessages_);
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
        com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage> boradMessages_ =
        java.util.Collections.emptyList();
      private void ensureBoradMessagesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          boradMessages_ = new java.util.ArrayList<com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage>(boradMessages_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage, com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage.Builder, com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessageOrBuilder> boradMessagesBuilder_;

      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage> getBoradMessagesList() {
        if (boradMessagesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(boradMessages_);
        } else {
          return boradMessagesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public int getBoradMessagesCount() {
        if (boradMessagesBuilder_ == null) {
          return boradMessages_.size();
        } else {
          return boradMessagesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage getBoradMessages(int index) {
        if (boradMessagesBuilder_ == null) {
          return boradMessages_.get(index);
        } else {
          return boradMessagesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public Builder setBoradMessages(
          int index, com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage value) {
        if (boradMessagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBoradMessagesIsMutable();
          boradMessages_.set(index, value);
          onChanged();
        } else {
          boradMessagesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public Builder setBoradMessages(
          int index, com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage.Builder builderForValue) {
        if (boradMessagesBuilder_ == null) {
          ensureBoradMessagesIsMutable();
          boradMessages_.set(index, builderForValue.build());
          onChanged();
        } else {
          boradMessagesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public Builder addBoradMessages(com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage value) {
        if (boradMessagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBoradMessagesIsMutable();
          boradMessages_.add(value);
          onChanged();
        } else {
          boradMessagesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public Builder addBoradMessages(
          int index, com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage value) {
        if (boradMessagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBoradMessagesIsMutable();
          boradMessages_.add(index, value);
          onChanged();
        } else {
          boradMessagesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public Builder addBoradMessages(
          com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage.Builder builderForValue) {
        if (boradMessagesBuilder_ == null) {
          ensureBoradMessagesIsMutable();
          boradMessages_.add(builderForValue.build());
          onChanged();
        } else {
          boradMessagesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public Builder addBoradMessages(
          int index, com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage.Builder builderForValue) {
        if (boradMessagesBuilder_ == null) {
          ensureBoradMessagesIsMutable();
          boradMessages_.add(index, builderForValue.build());
          onChanged();
        } else {
          boradMessagesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public Builder addAllBoradMessages(
          java.lang.Iterable<? extends com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage> values) {
        if (boradMessagesBuilder_ == null) {
          ensureBoradMessagesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, boradMessages_);
          onChanged();
        } else {
          boradMessagesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public Builder clearBoradMessages() {
        if (boradMessagesBuilder_ == null) {
          boradMessages_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          boradMessagesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public Builder removeBoradMessages(int index) {
        if (boradMessagesBuilder_ == null) {
          ensureBoradMessagesIsMutable();
          boradMessages_.remove(index);
          onChanged();
        } else {
          boradMessagesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage.Builder getBoradMessagesBuilder(
          int index) {
        return getBoradMessagesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessageOrBuilder getBoradMessagesOrBuilder(
          int index) {
        if (boradMessagesBuilder_ == null) {
          return boradMessages_.get(index);  } else {
          return boradMessagesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessageOrBuilder> 
           getBoradMessagesOrBuilderList() {
        if (boradMessagesBuilder_ != null) {
          return boradMessagesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(boradMessages_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage.Builder addBoradMessagesBuilder() {
        return getBoradMessagesFieldBuilder().addBuilder(
            com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage.Builder addBoradMessagesBuilder(
          int index) {
        return getBoradMessagesFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgBoardMessage borad_messages = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage.Builder> 
           getBoradMessagesBuilderList() {
        return getBoradMessagesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage, com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage.Builder, com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessageOrBuilder> 
          getBoradMessagesFieldBuilder() {
        if (boradMessagesBuilder_ == null) {
          boradMessagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage, com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessage.Builder, com.felania.msldb.MsgBoardMessageOuterClass.MsgBoardMessageOrBuilder>(
                  boradMessages_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          boradMessages_ = null;
        }
        return boradMessagesBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.RspBoardMessages)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspBoardMessages)
    private static final com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages();
    }

    public static com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspBoardMessages>
        PARSER = new com.google.protobuf.AbstractParser<RspBoardMessages>() {
      public RspBoardMessages parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new RspBoardMessages(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspBoardMessages> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspBoardMessages> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspBoardMessagesOuterClass.RspBoardMessages getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspBoardMessages_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspBoardMessages_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026RspBoardMessages.proto\022\013msggamedata\032\025M" +
      "sgBoardMessage.proto\"H\n\020RspBoardMessages" +
      "\0224\n\016borad_messages\030\001 \003(\0132\034.msggamedata.M" +
      "sgBoardMessageB\023\n\021com.felania.msldbb\006pro" +
      "to3"
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
          com.felania.msldb.MsgBoardMessageOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_RspBoardMessages_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspBoardMessages_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspBoardMessages_descriptor,
        new java.lang.String[] { "BoradMessages", });
    com.felania.msldb.MsgBoardMessageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
