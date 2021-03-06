// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspGetBingoEventData.proto

package com.felania.msldb;

public final class RspGetBingoEventDataOuterClass {
  private RspGetBingoEventDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspGetBingoEventDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspGetBingoEventData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
     */
    boolean hasUserBingoEventData();
    /**
     * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
     */
    com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData getUserBingoEventData();
    /**
     * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
     */
    com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventDataOrBuilder getUserBingoEventDataOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.RspGetBingoEventData}
   */
  public  static final class RspGetBingoEventData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspGetBingoEventData)
      RspGetBingoEventDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspGetBingoEventData.newBuilder() to construct.
    private RspGetBingoEventData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspGetBingoEventData() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspGetBingoEventData(
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
              com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData.Builder subBuilder = null;
              if (userBingoEventData_ != null) {
                subBuilder = userBingoEventData_.toBuilder();
              }
              userBingoEventData_ = input.readMessage(com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(userBingoEventData_);
                userBingoEventData_ = subBuilder.buildPartial();
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
      return com.felania.msldb.RspGetBingoEventDataOuterClass.internal_static_msggamedata_RspGetBingoEventData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspGetBingoEventDataOuterClass.internal_static_msggamedata_RspGetBingoEventData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData.class, com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData.Builder.class);
    }

    public static final int USER_BINGO_EVENT_DATA_FIELD_NUMBER = 1;
    private com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData userBingoEventData_;
    /**
     * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
     */
    public boolean hasUserBingoEventData() {
      return userBingoEventData_ != null;
    }
    /**
     * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
     */
    public com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData getUserBingoEventData() {
      return userBingoEventData_ == null ? com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData.getDefaultInstance() : userBingoEventData_;
    }
    /**
     * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
     */
    public com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventDataOrBuilder getUserBingoEventDataOrBuilder() {
      return getUserBingoEventData();
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
      if (userBingoEventData_ != null) {
        output.writeMessage(1, getUserBingoEventData());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (userBingoEventData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getUserBingoEventData());
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
      if (!(obj instanceof com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData other = (com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData) obj;

      boolean result = true;
      result = result && (hasUserBingoEventData() == other.hasUserBingoEventData());
      if (hasUserBingoEventData()) {
        result = result && getUserBingoEventData()
            .equals(other.getUserBingoEventData());
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
      if (hasUserBingoEventData()) {
        hash = (37 * hash) + USER_BINGO_EVENT_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getUserBingoEventData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData prototype) {
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
     * Protobuf type {@code msggamedata.RspGetBingoEventData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspGetBingoEventData)
        com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspGetBingoEventDataOuterClass.internal_static_msggamedata_RspGetBingoEventData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspGetBingoEventDataOuterClass.internal_static_msggamedata_RspGetBingoEventData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData.class, com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData.Builder.class);
      }

      // Construct using com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData.newBuilder()
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
        if (userBingoEventDataBuilder_ == null) {
          userBingoEventData_ = null;
        } else {
          userBingoEventData_ = null;
          userBingoEventDataBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspGetBingoEventDataOuterClass.internal_static_msggamedata_RspGetBingoEventData_descriptor;
      }

      public com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData getDefaultInstanceForType() {
        return com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData.getDefaultInstance();
      }

      public com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData build() {
        com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData buildPartial() {
        com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData result = new com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData(this);
        if (userBingoEventDataBuilder_ == null) {
          result.userBingoEventData_ = userBingoEventData_;
        } else {
          result.userBingoEventData_ = userBingoEventDataBuilder_.build();
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
        if (other instanceof com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData) {
          return mergeFrom((com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData other) {
        if (other == com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData.getDefaultInstance()) return this;
        if (other.hasUserBingoEventData()) {
          mergeUserBingoEventData(other.getUserBingoEventData());
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
        com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData userBingoEventData_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData, com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData.Builder, com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventDataOrBuilder> userBingoEventDataBuilder_;
      /**
       * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
       */
      public boolean hasUserBingoEventData() {
        return userBingoEventDataBuilder_ != null || userBingoEventData_ != null;
      }
      /**
       * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
       */
      public com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData getUserBingoEventData() {
        if (userBingoEventDataBuilder_ == null) {
          return userBingoEventData_ == null ? com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData.getDefaultInstance() : userBingoEventData_;
        } else {
          return userBingoEventDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
       */
      public Builder setUserBingoEventData(com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData value) {
        if (userBingoEventDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          userBingoEventData_ = value;
          onChanged();
        } else {
          userBingoEventDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
       */
      public Builder setUserBingoEventData(
          com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData.Builder builderForValue) {
        if (userBingoEventDataBuilder_ == null) {
          userBingoEventData_ = builderForValue.build();
          onChanged();
        } else {
          userBingoEventDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
       */
      public Builder mergeUserBingoEventData(com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData value) {
        if (userBingoEventDataBuilder_ == null) {
          if (userBingoEventData_ != null) {
            userBingoEventData_ =
              com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData.newBuilder(userBingoEventData_).mergeFrom(value).buildPartial();
          } else {
            userBingoEventData_ = value;
          }
          onChanged();
        } else {
          userBingoEventDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
       */
      public Builder clearUserBingoEventData() {
        if (userBingoEventDataBuilder_ == null) {
          userBingoEventData_ = null;
          onChanged();
        } else {
          userBingoEventData_ = null;
          userBingoEventDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
       */
      public com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData.Builder getUserBingoEventDataBuilder() {
        
        onChanged();
        return getUserBingoEventDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
       */
      public com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventDataOrBuilder getUserBingoEventDataOrBuilder() {
        if (userBingoEventDataBuilder_ != null) {
          return userBingoEventDataBuilder_.getMessageOrBuilder();
        } else {
          return userBingoEventData_ == null ?
              com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData.getDefaultInstance() : userBingoEventData_;
        }
      }
      /**
       * <code>.msggamedata.MsgUserBingoEventData user_bingo_event_data = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData, com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData.Builder, com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventDataOrBuilder> 
          getUserBingoEventDataFieldBuilder() {
        if (userBingoEventDataBuilder_ == null) {
          userBingoEventDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData, com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventData.Builder, com.felania.msldb.MsgUserBingoEventDataOuterClass.MsgUserBingoEventDataOrBuilder>(
                  getUserBingoEventData(),
                  getParentForChildren(),
                  isClean());
          userBingoEventData_ = null;
        }
        return userBingoEventDataBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.RspGetBingoEventData)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspGetBingoEventData)
    private static final com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData();
    }

    public static com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspGetBingoEventData>
        PARSER = new com.google.protobuf.AbstractParser<RspGetBingoEventData>() {
      public RspGetBingoEventData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RspGetBingoEventData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspGetBingoEventData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspGetBingoEventData> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspGetBingoEventDataOuterClass.RspGetBingoEventData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspGetBingoEventData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspGetBingoEventData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032RspGetBingoEventData.proto\022\013msggamedat" +
      "a\032\033MsgUserBingoEventData.proto\"Y\n\024RspGet" +
      "BingoEventData\022A\n\025user_bingo_event_data\030" +
      "\001 \001(\0132\".msggamedata.MsgUserBingoEventDat" +
      "aB\023\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.MsgUserBingoEventDataOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_RspGetBingoEventData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspGetBingoEventData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspGetBingoEventData_descriptor,
        new java.lang.String[] { "UserBingoEventData", });
    com.felania.msldb.MsgUserBingoEventDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
