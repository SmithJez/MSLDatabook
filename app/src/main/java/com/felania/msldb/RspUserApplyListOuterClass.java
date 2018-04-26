// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspUserApplyList.proto

package com.felania.msldb;

public final class RspUserApplyListOuterClass {
  private RspUserApplyListOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspUserApplyListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspUserApplyList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
     */
    java.util.List<com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData> 
        getClanListDataList();
    /**
     * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
     */
    com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData getClanListData(int index);
    /**
     * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
     */
    int getClanListDataCount();
    /**
     * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgClanListDataOuterClass.MsgClanListDataOrBuilder> 
        getClanListDataOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
     */
    com.felania.msldb.MsgClanListDataOuterClass.MsgClanListDataOrBuilder getClanListDataOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.RspUserApplyList}
   */
  public  static final class RspUserApplyList extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspUserApplyList)
      RspUserApplyListOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspUserApplyList.newBuilder() to construct.
    private RspUserApplyList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspUserApplyList() {
      clanListData_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspUserApplyList(
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
                clanListData_ = new java.util.ArrayList<com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData>();
                mutable_bitField0_ |= 0x00000001;
              }
              clanListData_.add(
                  input.readMessage(com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData.parser(), extensionRegistry));
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
          clanListData_ = java.util.Collections.unmodifiableList(clanListData_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.RspUserApplyListOuterClass.internal_static_msggamedata_RspUserApplyList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspUserApplyListOuterClass.internal_static_msggamedata_RspUserApplyList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList.class, com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList.Builder.class);
    }

    public static final int CLAN_LIST_DATA_FIELD_NUMBER = 1;
    private java.util.List<com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData> clanListData_;
    /**
     * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
     */
    public java.util.List<com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData> getClanListDataList() {
      return clanListData_;
    }
    /**
     * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgClanListDataOuterClass.MsgClanListDataOrBuilder> 
        getClanListDataOrBuilderList() {
      return clanListData_;
    }
    /**
     * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
     */
    public int getClanListDataCount() {
      return clanListData_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
     */
    public com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData getClanListData(int index) {
      return clanListData_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
     */
    public com.felania.msldb.MsgClanListDataOuterClass.MsgClanListDataOrBuilder getClanListDataOrBuilder(
        int index) {
      return clanListData_.get(index);
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
      for (int i = 0; i < clanListData_.size(); i++) {
        output.writeMessage(1, clanListData_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < clanListData_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, clanListData_.get(i));
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
      if (!(obj instanceof com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList other = (com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList) obj;

      boolean result = true;
      result = result && getClanListDataList()
          .equals(other.getClanListDataList());
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
      if (getClanListDataCount() > 0) {
        hash = (37 * hash) + CLAN_LIST_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getClanListDataList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList prototype) {
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
     * Protobuf type {@code msggamedata.RspUserApplyList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspUserApplyList)
        com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspUserApplyListOuterClass.internal_static_msggamedata_RspUserApplyList_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspUserApplyListOuterClass.internal_static_msggamedata_RspUserApplyList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList.class, com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList.Builder.class);
      }

      // Construct using com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList.newBuilder()
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
          getClanListDataFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (clanListDataBuilder_ == null) {
          clanListData_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          clanListDataBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspUserApplyListOuterClass.internal_static_msggamedata_RspUserApplyList_descriptor;
      }

      public com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList getDefaultInstanceForType() {
        return com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList.getDefaultInstance();
      }

      public com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList build() {
        com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList buildPartial() {
        com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList result = new com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList(this);
        int from_bitField0_ = bitField0_;
        if (clanListDataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            clanListData_ = java.util.Collections.unmodifiableList(clanListData_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.clanListData_ = clanListData_;
        } else {
          result.clanListData_ = clanListDataBuilder_.build();
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
        if (other instanceof com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList) {
          return mergeFrom((com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList other) {
        if (other == com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList.getDefaultInstance()) return this;
        if (clanListDataBuilder_ == null) {
          if (!other.clanListData_.isEmpty()) {
            if (clanListData_.isEmpty()) {
              clanListData_ = other.clanListData_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureClanListDataIsMutable();
              clanListData_.addAll(other.clanListData_);
            }
            onChanged();
          }
        } else {
          if (!other.clanListData_.isEmpty()) {
            if (clanListDataBuilder_.isEmpty()) {
              clanListDataBuilder_.dispose();
              clanListDataBuilder_ = null;
              clanListData_ = other.clanListData_;
              bitField0_ = (bitField0_ & ~0x00000001);
              clanListDataBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getClanListDataFieldBuilder() : null;
            } else {
              clanListDataBuilder_.addAllMessages(other.clanListData_);
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
        com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData> clanListData_ =
        java.util.Collections.emptyList();
      private void ensureClanListDataIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          clanListData_ = new java.util.ArrayList<com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData>(clanListData_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData, com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData.Builder, com.felania.msldb.MsgClanListDataOuterClass.MsgClanListDataOrBuilder> clanListDataBuilder_;

      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData> getClanListDataList() {
        if (clanListDataBuilder_ == null) {
          return java.util.Collections.unmodifiableList(clanListData_);
        } else {
          return clanListDataBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public int getClanListDataCount() {
        if (clanListDataBuilder_ == null) {
          return clanListData_.size();
        } else {
          return clanListDataBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData getClanListData(int index) {
        if (clanListDataBuilder_ == null) {
          return clanListData_.get(index);
        } else {
          return clanListDataBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public Builder setClanListData(
          int index, com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData value) {
        if (clanListDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClanListDataIsMutable();
          clanListData_.set(index, value);
          onChanged();
        } else {
          clanListDataBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public Builder setClanListData(
          int index, com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData.Builder builderForValue) {
        if (clanListDataBuilder_ == null) {
          ensureClanListDataIsMutable();
          clanListData_.set(index, builderForValue.build());
          onChanged();
        } else {
          clanListDataBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public Builder addClanListData(com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData value) {
        if (clanListDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClanListDataIsMutable();
          clanListData_.add(value);
          onChanged();
        } else {
          clanListDataBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public Builder addClanListData(
          int index, com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData value) {
        if (clanListDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClanListDataIsMutable();
          clanListData_.add(index, value);
          onChanged();
        } else {
          clanListDataBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public Builder addClanListData(
          com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData.Builder builderForValue) {
        if (clanListDataBuilder_ == null) {
          ensureClanListDataIsMutable();
          clanListData_.add(builderForValue.build());
          onChanged();
        } else {
          clanListDataBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public Builder addClanListData(
          int index, com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData.Builder builderForValue) {
        if (clanListDataBuilder_ == null) {
          ensureClanListDataIsMutable();
          clanListData_.add(index, builderForValue.build());
          onChanged();
        } else {
          clanListDataBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public Builder addAllClanListData(
          java.lang.Iterable<? extends com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData> values) {
        if (clanListDataBuilder_ == null) {
          ensureClanListDataIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, clanListData_);
          onChanged();
        } else {
          clanListDataBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public Builder clearClanListData() {
        if (clanListDataBuilder_ == null) {
          clanListData_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          clanListDataBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public Builder removeClanListData(int index) {
        if (clanListDataBuilder_ == null) {
          ensureClanListDataIsMutable();
          clanListData_.remove(index);
          onChanged();
        } else {
          clanListDataBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData.Builder getClanListDataBuilder(
          int index) {
        return getClanListDataFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public com.felania.msldb.MsgClanListDataOuterClass.MsgClanListDataOrBuilder getClanListDataOrBuilder(
          int index) {
        if (clanListDataBuilder_ == null) {
          return clanListData_.get(index);  } else {
          return clanListDataBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgClanListDataOuterClass.MsgClanListDataOrBuilder> 
           getClanListDataOrBuilderList() {
        if (clanListDataBuilder_ != null) {
          return clanListDataBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(clanListData_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData.Builder addClanListDataBuilder() {
        return getClanListDataFieldBuilder().addBuilder(
            com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData.Builder addClanListDataBuilder(
          int index) {
        return getClanListDataFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgClanListData clan_list_data = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData.Builder> 
           getClanListDataBuilderList() {
        return getClanListDataFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData, com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData.Builder, com.felania.msldb.MsgClanListDataOuterClass.MsgClanListDataOrBuilder> 
          getClanListDataFieldBuilder() {
        if (clanListDataBuilder_ == null) {
          clanListDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData, com.felania.msldb.MsgClanListDataOuterClass.MsgClanListData.Builder, com.felania.msldb.MsgClanListDataOuterClass.MsgClanListDataOrBuilder>(
                  clanListData_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          clanListData_ = null;
        }
        return clanListDataBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.RspUserApplyList)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspUserApplyList)
    private static final com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList();
    }

    public static com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspUserApplyList>
        PARSER = new com.google.protobuf.AbstractParser<RspUserApplyList>() {
      public RspUserApplyList parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RspUserApplyList(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspUserApplyList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspUserApplyList> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspUserApplyListOuterClass.RspUserApplyList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspUserApplyList_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspUserApplyList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026RspUserApplyList.proto\022\013msggamedata\032\025M" +
      "sgClanListData.proto\"H\n\020RspUserApplyList" +
      "\0224\n\016clan_list_data\030\001 \003(\0132\034.msggamedata.M" +
      "sgClanListDataB\023\n\021com.felania.msldbb\006pro" +
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
          com.felania.msldb.MsgClanListDataOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_RspUserApplyList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspUserApplyList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspUserApplyList_descriptor,
        new java.lang.String[] { "ClanListData", });
    com.felania.msldb.MsgClanListDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
