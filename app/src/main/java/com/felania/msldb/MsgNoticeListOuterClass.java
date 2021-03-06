// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgNoticeList.proto

package com.felania.msldb;

public final class MsgNoticeListOuterClass {
  private MsgNoticeListOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgNoticeListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgNoticeList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
     */
    java.util.List<com.felania.msldb.MsgNoticeOuterClass.MsgNotice> 
        getNoticesList();
    /**
     * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
     */
    com.felania.msldb.MsgNoticeOuterClass.MsgNotice getNotices(int index);
    /**
     * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
     */
    int getNoticesCount();
    /**
     * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgNoticeOuterClass.MsgNoticeOrBuilder> 
        getNoticesOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
     */
    com.felania.msldb.MsgNoticeOuterClass.MsgNoticeOrBuilder getNoticesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.MsgNoticeList}
   */
  public  static final class MsgNoticeList extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgNoticeList)
      MsgNoticeListOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgNoticeList.newBuilder() to construct.
    private MsgNoticeList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgNoticeList() {
      notices_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgNoticeList(
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
                notices_ = new java.util.ArrayList<com.felania.msldb.MsgNoticeOuterClass.MsgNotice>();
                mutable_bitField0_ |= 0x00000001;
              }
              notices_.add(
                  input.readMessage(com.felania.msldb.MsgNoticeOuterClass.MsgNotice.parser(), extensionRegistry));
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
          notices_ = java.util.Collections.unmodifiableList(notices_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MsgNoticeListOuterClass.internal_static_msggamedata_MsgNoticeList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgNoticeListOuterClass.internal_static_msggamedata_MsgNoticeList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList.class, com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList.Builder.class);
    }

    public static final int NOTICES_FIELD_NUMBER = 1;
    private java.util.List<com.felania.msldb.MsgNoticeOuterClass.MsgNotice> notices_;
    /**
     * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
     */
    public java.util.List<com.felania.msldb.MsgNoticeOuterClass.MsgNotice> getNoticesList() {
      return notices_;
    }
    /**
     * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgNoticeOuterClass.MsgNoticeOrBuilder> 
        getNoticesOrBuilderList() {
      return notices_;
    }
    /**
     * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
     */
    public int getNoticesCount() {
      return notices_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
     */
    public com.felania.msldb.MsgNoticeOuterClass.MsgNotice getNotices(int index) {
      return notices_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
     */
    public com.felania.msldb.MsgNoticeOuterClass.MsgNoticeOrBuilder getNoticesOrBuilder(
        int index) {
      return notices_.get(index);
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
      for (int i = 0; i < notices_.size(); i++) {
        output.writeMessage(1, notices_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < notices_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, notices_.get(i));
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
      if (!(obj instanceof com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList other = (com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList) obj;

      boolean result = true;
      result = result && getNoticesList()
          .equals(other.getNoticesList());
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
      if (getNoticesCount() > 0) {
        hash = (37 * hash) + NOTICES_FIELD_NUMBER;
        hash = (53 * hash) + getNoticesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList prototype) {
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
     * Protobuf type {@code msggamedata.MsgNoticeList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgNoticeList)
        com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgNoticeListOuterClass.internal_static_msggamedata_MsgNoticeList_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgNoticeListOuterClass.internal_static_msggamedata_MsgNoticeList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList.class, com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList.Builder.class);
      }

      // Construct using com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList.newBuilder()
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
          getNoticesFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (noticesBuilder_ == null) {
          notices_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          noticesBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgNoticeListOuterClass.internal_static_msggamedata_MsgNoticeList_descriptor;
      }

      public com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList getDefaultInstanceForType() {
        return com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList.getDefaultInstance();
      }

      public com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList build() {
        com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList buildPartial() {
        com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList result = new com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList(this);
        int from_bitField0_ = bitField0_;
        if (noticesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            notices_ = java.util.Collections.unmodifiableList(notices_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.notices_ = notices_;
        } else {
          result.notices_ = noticesBuilder_.build();
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
        if (other instanceof com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList) {
          return mergeFrom((com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList other) {
        if (other == com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList.getDefaultInstance()) return this;
        if (noticesBuilder_ == null) {
          if (!other.notices_.isEmpty()) {
            if (notices_.isEmpty()) {
              notices_ = other.notices_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNoticesIsMutable();
              notices_.addAll(other.notices_);
            }
            onChanged();
          }
        } else {
          if (!other.notices_.isEmpty()) {
            if (noticesBuilder_.isEmpty()) {
              noticesBuilder_.dispose();
              noticesBuilder_ = null;
              notices_ = other.notices_;
              bitField0_ = (bitField0_ & ~0x00000001);
              noticesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getNoticesFieldBuilder() : null;
            } else {
              noticesBuilder_.addAllMessages(other.notices_);
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
        com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.felania.msldb.MsgNoticeOuterClass.MsgNotice> notices_ =
        java.util.Collections.emptyList();
      private void ensureNoticesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          notices_ = new java.util.ArrayList<com.felania.msldb.MsgNoticeOuterClass.MsgNotice>(notices_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgNoticeOuterClass.MsgNotice, com.felania.msldb.MsgNoticeOuterClass.MsgNotice.Builder, com.felania.msldb.MsgNoticeOuterClass.MsgNoticeOrBuilder> noticesBuilder_;

      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgNoticeOuterClass.MsgNotice> getNoticesList() {
        if (noticesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(notices_);
        } else {
          return noticesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public int getNoticesCount() {
        if (noticesBuilder_ == null) {
          return notices_.size();
        } else {
          return noticesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public com.felania.msldb.MsgNoticeOuterClass.MsgNotice getNotices(int index) {
        if (noticesBuilder_ == null) {
          return notices_.get(index);
        } else {
          return noticesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public Builder setNotices(
          int index, com.felania.msldb.MsgNoticeOuterClass.MsgNotice value) {
        if (noticesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNoticesIsMutable();
          notices_.set(index, value);
          onChanged();
        } else {
          noticesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public Builder setNotices(
          int index, com.felania.msldb.MsgNoticeOuterClass.MsgNotice.Builder builderForValue) {
        if (noticesBuilder_ == null) {
          ensureNoticesIsMutable();
          notices_.set(index, builderForValue.build());
          onChanged();
        } else {
          noticesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public Builder addNotices(com.felania.msldb.MsgNoticeOuterClass.MsgNotice value) {
        if (noticesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNoticesIsMutable();
          notices_.add(value);
          onChanged();
        } else {
          noticesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public Builder addNotices(
          int index, com.felania.msldb.MsgNoticeOuterClass.MsgNotice value) {
        if (noticesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNoticesIsMutable();
          notices_.add(index, value);
          onChanged();
        } else {
          noticesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public Builder addNotices(
          com.felania.msldb.MsgNoticeOuterClass.MsgNotice.Builder builderForValue) {
        if (noticesBuilder_ == null) {
          ensureNoticesIsMutable();
          notices_.add(builderForValue.build());
          onChanged();
        } else {
          noticesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public Builder addNotices(
          int index, com.felania.msldb.MsgNoticeOuterClass.MsgNotice.Builder builderForValue) {
        if (noticesBuilder_ == null) {
          ensureNoticesIsMutable();
          notices_.add(index, builderForValue.build());
          onChanged();
        } else {
          noticesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public Builder addAllNotices(
          java.lang.Iterable<? extends com.felania.msldb.MsgNoticeOuterClass.MsgNotice> values) {
        if (noticesBuilder_ == null) {
          ensureNoticesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, notices_);
          onChanged();
        } else {
          noticesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public Builder clearNotices() {
        if (noticesBuilder_ == null) {
          notices_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          noticesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public Builder removeNotices(int index) {
        if (noticesBuilder_ == null) {
          ensureNoticesIsMutable();
          notices_.remove(index);
          onChanged();
        } else {
          noticesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public com.felania.msldb.MsgNoticeOuterClass.MsgNotice.Builder getNoticesBuilder(
          int index) {
        return getNoticesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public com.felania.msldb.MsgNoticeOuterClass.MsgNoticeOrBuilder getNoticesOrBuilder(
          int index) {
        if (noticesBuilder_ == null) {
          return notices_.get(index);  } else {
          return noticesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgNoticeOuterClass.MsgNoticeOrBuilder> 
           getNoticesOrBuilderList() {
        if (noticesBuilder_ != null) {
          return noticesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(notices_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public com.felania.msldb.MsgNoticeOuterClass.MsgNotice.Builder addNoticesBuilder() {
        return getNoticesFieldBuilder().addBuilder(
            com.felania.msldb.MsgNoticeOuterClass.MsgNotice.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public com.felania.msldb.MsgNoticeOuterClass.MsgNotice.Builder addNoticesBuilder(
          int index) {
        return getNoticesFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgNoticeOuterClass.MsgNotice.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgNotice notices = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgNoticeOuterClass.MsgNotice.Builder> 
           getNoticesBuilderList() {
        return getNoticesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgNoticeOuterClass.MsgNotice, com.felania.msldb.MsgNoticeOuterClass.MsgNotice.Builder, com.felania.msldb.MsgNoticeOuterClass.MsgNoticeOrBuilder> 
          getNoticesFieldBuilder() {
        if (noticesBuilder_ == null) {
          noticesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgNoticeOuterClass.MsgNotice, com.felania.msldb.MsgNoticeOuterClass.MsgNotice.Builder, com.felania.msldb.MsgNoticeOuterClass.MsgNoticeOrBuilder>(
                  notices_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          notices_ = null;
        }
        return noticesBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgNoticeList)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgNoticeList)
    private static final com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList();
    }

    public static com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgNoticeList>
        PARSER = new com.google.protobuf.AbstractParser<MsgNoticeList>() {
      public MsgNoticeList parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgNoticeList(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgNoticeList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgNoticeList> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgNoticeListOuterClass.MsgNoticeList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgNoticeList_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgNoticeList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023MsgNoticeList.proto\022\013msggamedata\032\017MsgN" +
      "otice.proto\"8\n\rMsgNoticeList\022\'\n\007notices\030" +
      "\001 \003(\0132\026.msggamedata.MsgNoticeB\023\n\021com.fel" +
      "ania.msldbb\006proto3"
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
          com.felania.msldb.MsgNoticeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgNoticeList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgNoticeList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgNoticeList_descriptor,
        new java.lang.String[] { "Notices", });
    com.felania.msldb.MsgNoticeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
