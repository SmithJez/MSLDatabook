// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgJojeShopMonsterEggMeta.proto

package com.felania.msldb;

public final class MsgJojeShopMonsterEggMetaOuterClass {
  private MsgJojeShopMonsterEggMetaOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgJojeShopMonsterEggMetaOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgJojeShopMonsterEggMeta)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
     */
    boolean hasData();
    /**
     * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
     */
    com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount getData();
    /**
     * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
     */
    com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder getDataOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.MsgJojeShopMonsterEggMeta}
   */
  public  static final class MsgJojeShopMonsterEggMeta extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgJojeShopMonsterEggMeta)
      MsgJojeShopMonsterEggMetaOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgJojeShopMonsterEggMeta.newBuilder() to construct.
    private MsgJojeShopMonsterEggMeta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgJojeShopMonsterEggMeta() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgJojeShopMonsterEggMeta(
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
              com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder subBuilder = null;
              if (data_ != null) {
                subBuilder = data_.toBuilder();
              }
              data_ = input.readMessage(com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(data_);
                data_ = subBuilder.buildPartial();
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
      return com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.internal_static_msggamedata_MsgJojeShopMonsterEggMeta_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.internal_static_msggamedata_MsgJojeShopMonsterEggMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta.class, com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta.Builder.class);
    }

    public static final int DATA_FIELD_NUMBER = 1;
    private com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount data_;
    /**
     * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
     */
    public boolean hasData() {
      return data_ != null;
    }
    /**
     * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
     */
    public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount getData() {
      return data_ == null ? com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.getDefaultInstance() : data_;
    }
    /**
     * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
     */
    public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder getDataOrBuilder() {
      return getData();
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
      if (data_ != null) {
        output.writeMessage(1, getData());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (data_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getData());
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
      if (!(obj instanceof com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta other = (com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta) obj;

      boolean result = true;
      result = result && (hasData() == other.hasData());
      if (hasData()) {
        result = result && getData()
            .equals(other.getData());
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
      if (hasData()) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta prototype) {
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
     * Protobuf type {@code msggamedata.MsgJojeShopMonsterEggMeta}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgJojeShopMonsterEggMeta)
        com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMetaOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.internal_static_msggamedata_MsgJojeShopMonsterEggMeta_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.internal_static_msggamedata_MsgJojeShopMonsterEggMeta_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta.class, com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta.Builder.class);
      }

      // Construct using com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta.newBuilder()
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
        if (dataBuilder_ == null) {
          data_ = null;
        } else {
          data_ = null;
          dataBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.internal_static_msggamedata_MsgJojeShopMonsterEggMeta_descriptor;
      }

      public com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta getDefaultInstanceForType() {
        return com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta.getDefaultInstance();
      }

      public com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta build() {
        com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta buildPartial() {
        com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta result = new com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta(this);
        if (dataBuilder_ == null) {
          result.data_ = data_;
        } else {
          result.data_ = dataBuilder_.build();
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
        if (other instanceof com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta) {
          return mergeFrom((com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta other) {
        if (other == com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta.getDefaultInstance()) return this;
        if (other.hasData()) {
          mergeData(other.getData());
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
        com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount data_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder> dataBuilder_;
      /**
       * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
       */
      public boolean hasData() {
        return dataBuilder_ != null || data_ != null;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
       */
      public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount getData() {
        if (dataBuilder_ == null) {
          return data_ == null ? com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.getDefaultInstance() : data_;
        } else {
          return dataBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
       */
      public Builder setData(com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount value) {
        if (dataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          data_ = value;
          onChanged();
        } else {
          dataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
       */
      public Builder setData(
          com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder builderForValue) {
        if (dataBuilder_ == null) {
          data_ = builderForValue.build();
          onChanged();
        } else {
          dataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
       */
      public Builder mergeData(com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount value) {
        if (dataBuilder_ == null) {
          if (data_ != null) {
            data_ =
              com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.newBuilder(data_).mergeFrom(value).buildPartial();
          } else {
            data_ = value;
          }
          onChanged();
        } else {
          dataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
       */
      public Builder clearData() {
        if (dataBuilder_ == null) {
          data_ = null;
          onChanged();
        } else {
          data_ = null;
          dataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
       */
      public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder getDataBuilder() {
        
        onChanged();
        return getDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
       */
      public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder getDataOrBuilder() {
        if (dataBuilder_ != null) {
          return dataBuilder_.getMessageOrBuilder();
        } else {
          return data_ == null ?
              com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.getDefaultInstance() : data_;
        }
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount data = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder> 
          getDataFieldBuilder() {
        if (dataBuilder_ == null) {
          dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder>(
                  getData(),
                  getParentForChildren(),
                  isClean());
          data_ = null;
        }
        return dataBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgJojeShopMonsterEggMeta)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgJojeShopMonsterEggMeta)
    private static final com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta();
    }

    public static com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgJojeShopMonsterEggMeta>
        PARSER = new com.google.protobuf.AbstractParser<MsgJojeShopMonsterEggMeta>() {
      public MsgJojeShopMonsterEggMeta parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MsgJojeShopMonsterEggMeta(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgJojeShopMonsterEggMeta> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgJojeShopMonsterEggMeta> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgJojeShopMonsterEggMetaOuterClass.MsgJojeShopMonsterEggMeta getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgJojeShopMonsterEggMeta_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgJojeShopMonsterEggMeta_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037MsgJojeShopMonsterEggMeta.proto\022\013msgga" +
      "medata\032\025MsgUidAndAmount.proto\"G\n\031MsgJoje" +
      "ShopMonsterEggMeta\022*\n\004data\030\001 \001(\0132\034.msgga" +
      "medata.MsgUidAndAmountB\023\n\021com.felania.ms" +
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
          com.felania.msldb.MsgUidAndAmountOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgJojeShopMonsterEggMeta_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgJojeShopMonsterEggMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgJojeShopMonsterEggMeta_descriptor,
        new java.lang.String[] { "Data", });
    com.felania.msldb.MsgUidAndAmountOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
