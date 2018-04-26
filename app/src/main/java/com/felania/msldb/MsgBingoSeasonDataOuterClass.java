// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgBingoSeasonData.proto

package com.felania.msldb;

public final class MsgBingoSeasonDataOuterClass {
  private MsgBingoSeasonDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgBingoSeasonDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgBingoSeasonData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
     */
    java.util.List<com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData> 
        getBingoSetDatasList();
    /**
     * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
     */
    com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData getBingoSetDatas(int index);
    /**
     * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
     */
    int getBingoSetDatasCount();
    /**
     * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetDataOrBuilder> 
        getBingoSetDatasOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
     */
    com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetDataOrBuilder getBingoSetDatasOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.MsgBingoSeasonData}
   */
  public  static final class MsgBingoSeasonData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgBingoSeasonData)
      MsgBingoSeasonDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgBingoSeasonData.newBuilder() to construct.
    private MsgBingoSeasonData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgBingoSeasonData() {
      uid_ = 0;
      bingoSetDatas_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgBingoSeasonData(
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
            case 13: {

              uid_ = input.readFixed32();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                bingoSetDatas_ = new java.util.ArrayList<com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData>();
                mutable_bitField0_ |= 0x00000002;
              }
              bingoSetDatas_.add(
                  input.readMessage(com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          bingoSetDatas_ = java.util.Collections.unmodifiableList(bingoSetDatas_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MsgBingoSeasonDataOuterClass.internal_static_msggamedata_MsgBingoSeasonData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgBingoSeasonDataOuterClass.internal_static_msggamedata_MsgBingoSeasonData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData.class, com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData.Builder.class);
    }

    private int bitField0_;
    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>fixed32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int BINGO_SET_DATAS_FIELD_NUMBER = 2;
    private java.util.List<com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData> bingoSetDatas_;
    /**
     * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
     */
    public java.util.List<com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData> getBingoSetDatasList() {
      return bingoSetDatas_;
    }
    /**
     * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetDataOrBuilder> 
        getBingoSetDatasOrBuilderList() {
      return bingoSetDatas_;
    }
    /**
     * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
     */
    public int getBingoSetDatasCount() {
      return bingoSetDatas_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
     */
    public com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData getBingoSetDatas(int index) {
      return bingoSetDatas_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
     */
    public com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetDataOrBuilder getBingoSetDatasOrBuilder(
        int index) {
      return bingoSetDatas_.get(index);
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
      if (uid_ != 0) {
        output.writeFixed32(1, uid_);
      }
      for (int i = 0; i < bingoSetDatas_.size(); i++) {
        output.writeMessage(2, bingoSetDatas_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, uid_);
      }
      for (int i = 0; i < bingoSetDatas_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, bingoSetDatas_.get(i));
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
      if (!(obj instanceof com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData other = (com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData) obj;

      boolean result = true;
      result = result && (getUid()
          == other.getUid());
      result = result && getBingoSetDatasList()
          .equals(other.getBingoSetDatasList());
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      if (getBingoSetDatasCount() > 0) {
        hash = (37 * hash) + BINGO_SET_DATAS_FIELD_NUMBER;
        hash = (53 * hash) + getBingoSetDatasList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData prototype) {
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
     * Protobuf type {@code msggamedata.MsgBingoSeasonData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgBingoSeasonData)
        com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgBingoSeasonDataOuterClass.internal_static_msggamedata_MsgBingoSeasonData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgBingoSeasonDataOuterClass.internal_static_msggamedata_MsgBingoSeasonData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData.class, com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData.Builder.class);
      }

      // Construct using com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData.newBuilder()
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
          getBingoSetDatasFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        uid_ = 0;

        if (bingoSetDatasBuilder_ == null) {
          bingoSetDatas_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          bingoSetDatasBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgBingoSeasonDataOuterClass.internal_static_msggamedata_MsgBingoSeasonData_descriptor;
      }

      public com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData getDefaultInstanceForType() {
        return com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData.getDefaultInstance();
      }

      public com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData build() {
        com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData buildPartial() {
        com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData result = new com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.uid_ = uid_;
        if (bingoSetDatasBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            bingoSetDatas_ = java.util.Collections.unmodifiableList(bingoSetDatas_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.bingoSetDatas_ = bingoSetDatas_;
        } else {
          result.bingoSetDatas_ = bingoSetDatasBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData) {
          return mergeFrom((com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData other) {
        if (other == com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (bingoSetDatasBuilder_ == null) {
          if (!other.bingoSetDatas_.isEmpty()) {
            if (bingoSetDatas_.isEmpty()) {
              bingoSetDatas_ = other.bingoSetDatas_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureBingoSetDatasIsMutable();
              bingoSetDatas_.addAll(other.bingoSetDatas_);
            }
            onChanged();
          }
        } else {
          if (!other.bingoSetDatas_.isEmpty()) {
            if (bingoSetDatasBuilder_.isEmpty()) {
              bingoSetDatasBuilder_.dispose();
              bingoSetDatasBuilder_ = null;
              bingoSetDatas_ = other.bingoSetDatas_;
              bitField0_ = (bitField0_ & ~0x00000002);
              bingoSetDatasBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBingoSetDatasFieldBuilder() : null;
            } else {
              bingoSetDatasBuilder_.addAllMessages(other.bingoSetDatas_);
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
        com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int uid_ ;
      /**
       * <code>fixed32 uid = 1;</code>
       */
      public int getUid() {
        return uid_;
      }
      /**
       * <code>fixed32 uid = 1;</code>
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 uid = 1;</code>
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData> bingoSetDatas_ =
        java.util.Collections.emptyList();
      private void ensureBingoSetDatasIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          bingoSetDatas_ = new java.util.ArrayList<com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData>(bingoSetDatas_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData, com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData.Builder, com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetDataOrBuilder> bingoSetDatasBuilder_;

      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public java.util.List<com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData> getBingoSetDatasList() {
        if (bingoSetDatasBuilder_ == null) {
          return java.util.Collections.unmodifiableList(bingoSetDatas_);
        } else {
          return bingoSetDatasBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public int getBingoSetDatasCount() {
        if (bingoSetDatasBuilder_ == null) {
          return bingoSetDatas_.size();
        } else {
          return bingoSetDatasBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData getBingoSetDatas(int index) {
        if (bingoSetDatasBuilder_ == null) {
          return bingoSetDatas_.get(index);
        } else {
          return bingoSetDatasBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public Builder setBingoSetDatas(
          int index, com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData value) {
        if (bingoSetDatasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBingoSetDatasIsMutable();
          bingoSetDatas_.set(index, value);
          onChanged();
        } else {
          bingoSetDatasBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public Builder setBingoSetDatas(
          int index, com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData.Builder builderForValue) {
        if (bingoSetDatasBuilder_ == null) {
          ensureBingoSetDatasIsMutable();
          bingoSetDatas_.set(index, builderForValue.build());
          onChanged();
        } else {
          bingoSetDatasBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public Builder addBingoSetDatas(com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData value) {
        if (bingoSetDatasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBingoSetDatasIsMutable();
          bingoSetDatas_.add(value);
          onChanged();
        } else {
          bingoSetDatasBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public Builder addBingoSetDatas(
          int index, com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData value) {
        if (bingoSetDatasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBingoSetDatasIsMutable();
          bingoSetDatas_.add(index, value);
          onChanged();
        } else {
          bingoSetDatasBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public Builder addBingoSetDatas(
          com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData.Builder builderForValue) {
        if (bingoSetDatasBuilder_ == null) {
          ensureBingoSetDatasIsMutable();
          bingoSetDatas_.add(builderForValue.build());
          onChanged();
        } else {
          bingoSetDatasBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public Builder addBingoSetDatas(
          int index, com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData.Builder builderForValue) {
        if (bingoSetDatasBuilder_ == null) {
          ensureBingoSetDatasIsMutable();
          bingoSetDatas_.add(index, builderForValue.build());
          onChanged();
        } else {
          bingoSetDatasBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public Builder addAllBingoSetDatas(
          java.lang.Iterable<? extends com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData> values) {
        if (bingoSetDatasBuilder_ == null) {
          ensureBingoSetDatasIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, bingoSetDatas_);
          onChanged();
        } else {
          bingoSetDatasBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public Builder clearBingoSetDatas() {
        if (bingoSetDatasBuilder_ == null) {
          bingoSetDatas_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          bingoSetDatasBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public Builder removeBingoSetDatas(int index) {
        if (bingoSetDatasBuilder_ == null) {
          ensureBingoSetDatasIsMutable();
          bingoSetDatas_.remove(index);
          onChanged();
        } else {
          bingoSetDatasBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData.Builder getBingoSetDatasBuilder(
          int index) {
        return getBingoSetDatasFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetDataOrBuilder getBingoSetDatasOrBuilder(
          int index) {
        if (bingoSetDatasBuilder_ == null) {
          return bingoSetDatas_.get(index);  } else {
          return bingoSetDatasBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetDataOrBuilder> 
           getBingoSetDatasOrBuilderList() {
        if (bingoSetDatasBuilder_ != null) {
          return bingoSetDatasBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(bingoSetDatas_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData.Builder addBingoSetDatasBuilder() {
        return getBingoSetDatasFieldBuilder().addBuilder(
            com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData.Builder addBingoSetDatasBuilder(
          int index) {
        return getBingoSetDatasFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgBingoSetData bingo_set_datas = 2;</code>
       */
      public java.util.List<com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData.Builder> 
           getBingoSetDatasBuilderList() {
        return getBingoSetDatasFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData, com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData.Builder, com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetDataOrBuilder> 
          getBingoSetDatasFieldBuilder() {
        if (bingoSetDatasBuilder_ == null) {
          bingoSetDatasBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData, com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetData.Builder, com.felania.msldb.MsgBingoSetDataOuterClass.MsgBingoSetDataOrBuilder>(
                  bingoSetDatas_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          bingoSetDatas_ = null;
        }
        return bingoSetDatasBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgBingoSeasonData)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgBingoSeasonData)
    private static final com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData();
    }

    public static com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgBingoSeasonData>
        PARSER = new com.google.protobuf.AbstractParser<MsgBingoSeasonData>() {
      public MsgBingoSeasonData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgBingoSeasonData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgBingoSeasonData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgBingoSeasonData> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgBingoSeasonDataOuterClass.MsgBingoSeasonData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgBingoSeasonData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgBingoSeasonData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030MsgBingoSeasonData.proto\022\013msggamedata\032" +
      "\025MsgBingoSetData.proto\"X\n\022MsgBingoSeason" +
      "Data\022\013\n\003uid\030\001 \001(\007\0225\n\017bingo_set_datas\030\002 \003" +
      "(\0132\034.msggamedata.MsgBingoSetDataB\023\n\021com." +
      "felania.msldbb\006proto3"
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
          com.felania.msldb.MsgBingoSetDataOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgBingoSeasonData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgBingoSeasonData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgBingoSeasonData_descriptor,
        new java.lang.String[] { "Uid", "BingoSetDatas", });
    com.felania.msldb.MsgBingoSetDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
