// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgShopItemMetaPromisePackageReward.proto

package com.felania.msldb;

public final class MsgShopItemMetaPromisePackageRewardOuterClass {
  private MsgShopItemMetaPromisePackageRewardOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgShopItemMetaPromisePackageRewardOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgShopItemMetaPromisePackageReward)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.RewardDataType data_type = 1;</code>
     */
    int getDataTypeValue();
    /**
     * <code>.msggamedata.RewardDataType data_type = 1;</code>
     */
    com.felania.msldb.RewardDataTypeOuterClass.RewardDataType getDataType();

    /**
     * <code>uint32 value_data = 2;</code>
     */
    int getValueData();

    /**
     * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
     */
    boolean hasUidData();
    /**
     * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
     */
    com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount getUidData();
    /**
     * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
     */
    com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder getUidDataOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.MsgShopItemMetaPromisePackageReward}
   */
  public  static final class MsgShopItemMetaPromisePackageReward extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgShopItemMetaPromisePackageReward)
      MsgShopItemMetaPromisePackageRewardOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgShopItemMetaPromisePackageReward.newBuilder() to construct.
    private MsgShopItemMetaPromisePackageReward(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgShopItemMetaPromisePackageReward() {
      dataType_ = 0;
      valueData_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgShopItemMetaPromisePackageReward(
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
            case 8: {
              int rawValue = input.readEnum();

              dataType_ = rawValue;
              break;
            }
            case 16: {

              valueData_ = input.readUInt32();
              break;
            }
            case 26: {
              com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder subBuilder = null;
              if (uidData_ != null) {
                subBuilder = uidData_.toBuilder();
              }
              uidData_ = input.readMessage(com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(uidData_);
                uidData_ = subBuilder.buildPartial();
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
      return com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.internal_static_msggamedata_MsgShopItemMetaPromisePackageReward_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.internal_static_msggamedata_MsgShopItemMetaPromisePackageReward_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward.class, com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward.Builder.class);
    }

    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private int dataType_;
    /**
     * <code>.msggamedata.RewardDataType data_type = 1;</code>
     */
    public int getDataTypeValue() {
      return dataType_;
    }
    /**
     * <code>.msggamedata.RewardDataType data_type = 1;</code>
     */
    public com.felania.msldb.RewardDataTypeOuterClass.RewardDataType getDataType() {
      com.felania.msldb.RewardDataTypeOuterClass.RewardDataType result = com.felania.msldb.RewardDataTypeOuterClass.RewardDataType.valueOf(dataType_);
      return result == null ? com.felania.msldb.RewardDataTypeOuterClass.RewardDataType.UNRECOGNIZED : result;
    }

    public static final int VALUE_DATA_FIELD_NUMBER = 2;
    private int valueData_;
    /**
     * <code>uint32 value_data = 2;</code>
     */
    public int getValueData() {
      return valueData_;
    }

    public static final int UID_DATA_FIELD_NUMBER = 3;
    private com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount uidData_;
    /**
     * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
     */
    public boolean hasUidData() {
      return uidData_ != null;
    }
    /**
     * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
     */
    public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount getUidData() {
      return uidData_ == null ? com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.getDefaultInstance() : uidData_;
    }
    /**
     * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
     */
    public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder getUidDataOrBuilder() {
      return getUidData();
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
      if (dataType_ != com.felania.msldb.RewardDataTypeOuterClass.RewardDataType.RewardDataTypeNULL.getNumber()) {
        output.writeEnum(1, dataType_);
      }
      if (valueData_ != 0) {
        output.writeUInt32(2, valueData_);
      }
      if (uidData_ != null) {
        output.writeMessage(3, getUidData());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dataType_ != com.felania.msldb.RewardDataTypeOuterClass.RewardDataType.RewardDataTypeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, dataType_);
      }
      if (valueData_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, valueData_);
      }
      if (uidData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getUidData());
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
      if (!(obj instanceof com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward other = (com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward) obj;

      boolean result = true;
      result = result && dataType_ == other.dataType_;
      result = result && (getValueData()
          == other.getValueData());
      result = result && (hasUidData() == other.hasUidData());
      if (hasUidData()) {
        result = result && getUidData()
            .equals(other.getUidData());
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
      hash = (37 * hash) + DATA_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + dataType_;
      hash = (37 * hash) + VALUE_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getValueData();
      if (hasUidData()) {
        hash = (37 * hash) + UID_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getUidData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward prototype) {
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
     * Protobuf type {@code msggamedata.MsgShopItemMetaPromisePackageReward}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgShopItemMetaPromisePackageReward)
        com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageRewardOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.internal_static_msggamedata_MsgShopItemMetaPromisePackageReward_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.internal_static_msggamedata_MsgShopItemMetaPromisePackageReward_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward.class, com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward.Builder.class);
      }

      // Construct using com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward.newBuilder()
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
        dataType_ = 0;

        valueData_ = 0;

        if (uidDataBuilder_ == null) {
          uidData_ = null;
        } else {
          uidData_ = null;
          uidDataBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.internal_static_msggamedata_MsgShopItemMetaPromisePackageReward_descriptor;
      }

      public com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward getDefaultInstanceForType() {
        return com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward.getDefaultInstance();
      }

      public com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward build() {
        com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward buildPartial() {
        com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward result = new com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward(this);
        result.dataType_ = dataType_;
        result.valueData_ = valueData_;
        if (uidDataBuilder_ == null) {
          result.uidData_ = uidData_;
        } else {
          result.uidData_ = uidDataBuilder_.build();
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
        if (other instanceof com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward) {
          return mergeFrom((com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward other) {
        if (other == com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward.getDefaultInstance()) return this;
        if (other.dataType_ != 0) {
          setDataTypeValue(other.getDataTypeValue());
        }
        if (other.getValueData() != 0) {
          setValueData(other.getValueData());
        }
        if (other.hasUidData()) {
          mergeUidData(other.getUidData());
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
        com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dataType_ = 0;
      /**
       * <code>.msggamedata.RewardDataType data_type = 1;</code>
       */
      public int getDataTypeValue() {
        return dataType_;
      }
      /**
       * <code>.msggamedata.RewardDataType data_type = 1;</code>
       */
      public Builder setDataTypeValue(int value) {
        dataType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.RewardDataType data_type = 1;</code>
       */
      public com.felania.msldb.RewardDataTypeOuterClass.RewardDataType getDataType() {
        com.felania.msldb.RewardDataTypeOuterClass.RewardDataType result = com.felania.msldb.RewardDataTypeOuterClass.RewardDataType.valueOf(dataType_);
        return result == null ? com.felania.msldb.RewardDataTypeOuterClass.RewardDataType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.RewardDataType data_type = 1;</code>
       */
      public Builder setDataType(com.felania.msldb.RewardDataTypeOuterClass.RewardDataType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        dataType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.RewardDataType data_type = 1;</code>
       */
      public Builder clearDataType() {
        
        dataType_ = 0;
        onChanged();
        return this;
      }

      private int valueData_ ;
      /**
       * <code>uint32 value_data = 2;</code>
       */
      public int getValueData() {
        return valueData_;
      }
      /**
       * <code>uint32 value_data = 2;</code>
       */
      public Builder setValueData(int value) {
        
        valueData_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 value_data = 2;</code>
       */
      public Builder clearValueData() {
        
        valueData_ = 0;
        onChanged();
        return this;
      }

      private com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount uidData_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder> uidDataBuilder_;
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
       */
      public boolean hasUidData() {
        return uidDataBuilder_ != null || uidData_ != null;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
       */
      public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount getUidData() {
        if (uidDataBuilder_ == null) {
          return uidData_ == null ? com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.getDefaultInstance() : uidData_;
        } else {
          return uidDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
       */
      public Builder setUidData(com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount value) {
        if (uidDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          uidData_ = value;
          onChanged();
        } else {
          uidDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
       */
      public Builder setUidData(
          com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder builderForValue) {
        if (uidDataBuilder_ == null) {
          uidData_ = builderForValue.build();
          onChanged();
        } else {
          uidDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
       */
      public Builder mergeUidData(com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount value) {
        if (uidDataBuilder_ == null) {
          if (uidData_ != null) {
            uidData_ =
              com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.newBuilder(uidData_).mergeFrom(value).buildPartial();
          } else {
            uidData_ = value;
          }
          onChanged();
        } else {
          uidDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
       */
      public Builder clearUidData() {
        if (uidDataBuilder_ == null) {
          uidData_ = null;
          onChanged();
        } else {
          uidData_ = null;
          uidDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
       */
      public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder getUidDataBuilder() {
        
        onChanged();
        return getUidDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
       */
      public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder getUidDataOrBuilder() {
        if (uidDataBuilder_ != null) {
          return uidDataBuilder_.getMessageOrBuilder();
        } else {
          return uidData_ == null ?
              com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.getDefaultInstance() : uidData_;
        }
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_data = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder> 
          getUidDataFieldBuilder() {
        if (uidDataBuilder_ == null) {
          uidDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder>(
                  getUidData(),
                  getParentForChildren(),
                  isClean());
          uidData_ = null;
        }
        return uidDataBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgShopItemMetaPromisePackageReward)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgShopItemMetaPromisePackageReward)
    private static final com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward();
    }

    public static com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgShopItemMetaPromisePackageReward>
        PARSER = new com.google.protobuf.AbstractParser<MsgShopItemMetaPromisePackageReward>() {
      public MsgShopItemMetaPromisePackageReward parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MsgShopItemMetaPromisePackageReward(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgShopItemMetaPromisePackageReward> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgShopItemMetaPromisePackageReward> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgShopItemMetaPromisePackageRewardOuterClass.MsgShopItemMetaPromisePackageReward getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgShopItemMetaPromisePackageReward_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgShopItemMetaPromisePackageReward_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)MsgShopItemMetaPromisePackageReward.pr" +
      "oto\022\013msggamedata\032\024RewardDataType.proto\032\025" +
      "MsgUidAndAmount.proto\"\231\001\n#MsgShopItemMet" +
      "aPromisePackageReward\022.\n\tdata_type\030\001 \001(\016" +
      "2\033.msggamedata.RewardDataType\022\022\n\nvalue_d" +
      "ata\030\002 \001(\r\022.\n\010uid_data\030\003 \001(\0132\034.msggamedat" +
      "a.MsgUidAndAmountB\023\n\021com.felania.msldbb\006" +
      "proto3"
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
          com.felania.msldb.RewardDataTypeOuterClass.getDescriptor(),
          com.felania.msldb.MsgUidAndAmountOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgShopItemMetaPromisePackageReward_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgShopItemMetaPromisePackageReward_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgShopItemMetaPromisePackageReward_descriptor,
        new java.lang.String[] { "DataType", "ValueData", "UidData", });
    com.felania.msldb.RewardDataTypeOuterClass.getDescriptor();
    com.felania.msldb.MsgUidAndAmountOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
