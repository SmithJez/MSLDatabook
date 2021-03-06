// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgCaptureFestivalSeasonData.proto

package com.felania.msldb;

public final class MsgCaptureFestivalSeasonDataOuterClass {
  private MsgCaptureFestivalSeasonDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgCaptureFestivalSeasonDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgCaptureFestivalSeasonData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 id = 1;</code>
     */
    long getId();

    /**
     * <code>fixed32 capture_festival_uid = 2;</code>
     */
    int getCaptureFestivalUid();

    /**
     * <code>string img_url = 3;</code>
     */
    java.lang.String getImgUrl();
    /**
     * <code>string img_url = 3;</code>
     */
    com.google.protobuf.ByteString
        getImgUrlBytes();

    /**
     * <code>repeated string share_link_urls = 4;</code>
     */
    java.util.List<java.lang.String>
        getShareLinkUrlsList();
    /**
     * <code>repeated string share_link_urls = 4;</code>
     */
    int getShareLinkUrlsCount();
    /**
     * <code>repeated string share_link_urls = 4;</code>
     */
    java.lang.String getShareLinkUrls(int index);
    /**
     * <code>repeated string share_link_urls = 4;</code>
     */
    com.google.protobuf.ByteString
        getShareLinkUrlsBytes(int index);

    /**
     * <code>uint64 eve_date = 5;</code>
     */
    long getEveDate();

    /**
     * <code>uint64 capture_start_date = 6;</code>
     */
    long getCaptureStartDate();

    /**
     * <code>uint64 finale_start_date = 7;</code>
     */
    long getFinaleStartDate();

    /**
     * <code>uint64 end_date = 8;</code>
     */
    long getEndDate();
  }
  /**
   * Protobuf type {@code msggamedata.MsgCaptureFestivalSeasonData}
   */
  public  static final class MsgCaptureFestivalSeasonData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgCaptureFestivalSeasonData)
      MsgCaptureFestivalSeasonDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgCaptureFestivalSeasonData.newBuilder() to construct.
    private MsgCaptureFestivalSeasonData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgCaptureFestivalSeasonData() {
      id_ = 0L;
      captureFestivalUid_ = 0;
      imgUrl_ = "";
      shareLinkUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      eveDate_ = 0L;
      captureStartDate_ = 0L;
      finaleStartDate_ = 0L;
      endDate_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgCaptureFestivalSeasonData(
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
            case 8: {

              id_ = input.readUInt64();
              break;
            }
            case 21: {

              captureFestivalUid_ = input.readFixed32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              imgUrl_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                shareLinkUrls_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000008;
              }
              shareLinkUrls_.add(s);
              break;
            }
            case 40: {

              eveDate_ = input.readUInt64();
              break;
            }
            case 48: {

              captureStartDate_ = input.readUInt64();
              break;
            }
            case 56: {

              finaleStartDate_ = input.readUInt64();
              break;
            }
            case 64: {

              endDate_ = input.readUInt64();
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
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          shareLinkUrls_ = shareLinkUrls_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.internal_static_msggamedata_MsgCaptureFestivalSeasonData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.internal_static_msggamedata_MsgCaptureFestivalSeasonData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData.class, com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData.Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>uint64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    public static final int CAPTURE_FESTIVAL_UID_FIELD_NUMBER = 2;
    private int captureFestivalUid_;
    /**
     * <code>fixed32 capture_festival_uid = 2;</code>
     */
    public int getCaptureFestivalUid() {
      return captureFestivalUid_;
    }

    public static final int IMG_URL_FIELD_NUMBER = 3;
    private volatile java.lang.Object imgUrl_;
    /**
     * <code>string img_url = 3;</code>
     */
    public java.lang.String getImgUrl() {
      java.lang.Object ref = imgUrl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imgUrl_ = s;
        return s;
      }
    }
    /**
     * <code>string img_url = 3;</code>
     */
    public com.google.protobuf.ByteString
        getImgUrlBytes() {
      java.lang.Object ref = imgUrl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imgUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SHARE_LINK_URLS_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList shareLinkUrls_;
    /**
     * <code>repeated string share_link_urls = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getShareLinkUrlsList() {
      return shareLinkUrls_;
    }
    /**
     * <code>repeated string share_link_urls = 4;</code>
     */
    public int getShareLinkUrlsCount() {
      return shareLinkUrls_.size();
    }
    /**
     * <code>repeated string share_link_urls = 4;</code>
     */
    public java.lang.String getShareLinkUrls(int index) {
      return shareLinkUrls_.get(index);
    }
    /**
     * <code>repeated string share_link_urls = 4;</code>
     */
    public com.google.protobuf.ByteString
        getShareLinkUrlsBytes(int index) {
      return shareLinkUrls_.getByteString(index);
    }

    public static final int EVE_DATE_FIELD_NUMBER = 5;
    private long eveDate_;
    /**
     * <code>uint64 eve_date = 5;</code>
     */
    public long getEveDate() {
      return eveDate_;
    }

    public static final int CAPTURE_START_DATE_FIELD_NUMBER = 6;
    private long captureStartDate_;
    /**
     * <code>uint64 capture_start_date = 6;</code>
     */
    public long getCaptureStartDate() {
      return captureStartDate_;
    }

    public static final int FINALE_START_DATE_FIELD_NUMBER = 7;
    private long finaleStartDate_;
    /**
     * <code>uint64 finale_start_date = 7;</code>
     */
    public long getFinaleStartDate() {
      return finaleStartDate_;
    }

    public static final int END_DATE_FIELD_NUMBER = 8;
    private long endDate_;
    /**
     * <code>uint64 end_date = 8;</code>
     */
    public long getEndDate() {
      return endDate_;
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
      if (id_ != 0L) {
        output.writeUInt64(1, id_);
      }
      if (captureFestivalUid_ != 0) {
        output.writeFixed32(2, captureFestivalUid_);
      }
      if (!getImgUrlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, imgUrl_);
      }
      for (int i = 0; i < shareLinkUrls_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, shareLinkUrls_.getRaw(i));
      }
      if (eveDate_ != 0L) {
        output.writeUInt64(5, eveDate_);
      }
      if (captureStartDate_ != 0L) {
        output.writeUInt64(6, captureStartDate_);
      }
      if (finaleStartDate_ != 0L) {
        output.writeUInt64(7, finaleStartDate_);
      }
      if (endDate_ != 0L) {
        output.writeUInt64(8, endDate_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, id_);
      }
      if (captureFestivalUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(2, captureFestivalUid_);
      }
      if (!getImgUrlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, imgUrl_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < shareLinkUrls_.size(); i++) {
          dataSize += computeStringSizeNoTag(shareLinkUrls_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getShareLinkUrlsList().size();
      }
      if (eveDate_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, eveDate_);
      }
      if (captureStartDate_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, captureStartDate_);
      }
      if (finaleStartDate_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, finaleStartDate_);
      }
      if (endDate_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, endDate_);
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
      if (!(obj instanceof com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData other = (com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData) obj;

      boolean result = true;
      result = result && (getId()
          == other.getId());
      result = result && (getCaptureFestivalUid()
          == other.getCaptureFestivalUid());
      result = result && getImgUrl()
          .equals(other.getImgUrl());
      result = result && getShareLinkUrlsList()
          .equals(other.getShareLinkUrlsList());
      result = result && (getEveDate()
          == other.getEveDate());
      result = result && (getCaptureStartDate()
          == other.getCaptureStartDate());
      result = result && (getFinaleStartDate()
          == other.getFinaleStartDate());
      result = result && (getEndDate()
          == other.getEndDate());
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + CAPTURE_FESTIVAL_UID_FIELD_NUMBER;
      hash = (53 * hash) + getCaptureFestivalUid();
      hash = (37 * hash) + IMG_URL_FIELD_NUMBER;
      hash = (53 * hash) + getImgUrl().hashCode();
      if (getShareLinkUrlsCount() > 0) {
        hash = (37 * hash) + SHARE_LINK_URLS_FIELD_NUMBER;
        hash = (53 * hash) + getShareLinkUrlsList().hashCode();
      }
      hash = (37 * hash) + EVE_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEveDate());
      hash = (37 * hash) + CAPTURE_START_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCaptureStartDate());
      hash = (37 * hash) + FINALE_START_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFinaleStartDate());
      hash = (37 * hash) + END_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEndDate());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData prototype) {
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
     * Protobuf type {@code msggamedata.MsgCaptureFestivalSeasonData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgCaptureFestivalSeasonData)
        com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.internal_static_msggamedata_MsgCaptureFestivalSeasonData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.internal_static_msggamedata_MsgCaptureFestivalSeasonData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData.class, com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData.Builder.class);
      }

      // Construct using com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData.newBuilder()
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
        id_ = 0L;

        captureFestivalUid_ = 0;

        imgUrl_ = "";

        shareLinkUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        eveDate_ = 0L;

        captureStartDate_ = 0L;

        finaleStartDate_ = 0L;

        endDate_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.internal_static_msggamedata_MsgCaptureFestivalSeasonData_descriptor;
      }

      public com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData getDefaultInstanceForType() {
        return com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData.getDefaultInstance();
      }

      public com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData build() {
        com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData buildPartial() {
        com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData result = new com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.id_ = id_;
        result.captureFestivalUid_ = captureFestivalUid_;
        result.imgUrl_ = imgUrl_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          shareLinkUrls_ = shareLinkUrls_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.shareLinkUrls_ = shareLinkUrls_;
        result.eveDate_ = eveDate_;
        result.captureStartDate_ = captureStartDate_;
        result.finaleStartDate_ = finaleStartDate_;
        result.endDate_ = endDate_;
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
        if (other instanceof com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData) {
          return mergeFrom((com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData other) {
        if (other == com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (other.getCaptureFestivalUid() != 0) {
          setCaptureFestivalUid(other.getCaptureFestivalUid());
        }
        if (!other.getImgUrl().isEmpty()) {
          imgUrl_ = other.imgUrl_;
          onChanged();
        }
        if (!other.shareLinkUrls_.isEmpty()) {
          if (shareLinkUrls_.isEmpty()) {
            shareLinkUrls_ = other.shareLinkUrls_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureShareLinkUrlsIsMutable();
            shareLinkUrls_.addAll(other.shareLinkUrls_);
          }
          onChanged();
        }
        if (other.getEveDate() != 0L) {
          setEveDate(other.getEveDate());
        }
        if (other.getCaptureStartDate() != 0L) {
          setCaptureStartDate(other.getCaptureStartDate());
        }
        if (other.getFinaleStartDate() != 0L) {
          setFinaleStartDate(other.getFinaleStartDate());
        }
        if (other.getEndDate() != 0L) {
          setEndDate(other.getEndDate());
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
        com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long id_ ;
      /**
       * <code>uint64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>uint64 id = 1;</code>
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private int captureFestivalUid_ ;
      /**
       * <code>fixed32 capture_festival_uid = 2;</code>
       */
      public int getCaptureFestivalUid() {
        return captureFestivalUid_;
      }
      /**
       * <code>fixed32 capture_festival_uid = 2;</code>
       */
      public Builder setCaptureFestivalUid(int value) {
        
        captureFestivalUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 capture_festival_uid = 2;</code>
       */
      public Builder clearCaptureFestivalUid() {
        
        captureFestivalUid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object imgUrl_ = "";
      /**
       * <code>string img_url = 3;</code>
       */
      public java.lang.String getImgUrl() {
        java.lang.Object ref = imgUrl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          imgUrl_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string img_url = 3;</code>
       */
      public com.google.protobuf.ByteString
          getImgUrlBytes() {
        java.lang.Object ref = imgUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          imgUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string img_url = 3;</code>
       */
      public Builder setImgUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        imgUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string img_url = 3;</code>
       */
      public Builder clearImgUrl() {
        
        imgUrl_ = getDefaultInstance().getImgUrl();
        onChanged();
        return this;
      }
      /**
       * <code>string img_url = 3;</code>
       */
      public Builder setImgUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        imgUrl_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList shareLinkUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureShareLinkUrlsIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          shareLinkUrls_ = new com.google.protobuf.LazyStringArrayList(shareLinkUrls_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated string share_link_urls = 4;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getShareLinkUrlsList() {
        return shareLinkUrls_.getUnmodifiableView();
      }
      /**
       * <code>repeated string share_link_urls = 4;</code>
       */
      public int getShareLinkUrlsCount() {
        return shareLinkUrls_.size();
      }
      /**
       * <code>repeated string share_link_urls = 4;</code>
       */
      public java.lang.String getShareLinkUrls(int index) {
        return shareLinkUrls_.get(index);
      }
      /**
       * <code>repeated string share_link_urls = 4;</code>
       */
      public com.google.protobuf.ByteString
          getShareLinkUrlsBytes(int index) {
        return shareLinkUrls_.getByteString(index);
      }
      /**
       * <code>repeated string share_link_urls = 4;</code>
       */
      public Builder setShareLinkUrls(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureShareLinkUrlsIsMutable();
        shareLinkUrls_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string share_link_urls = 4;</code>
       */
      public Builder addShareLinkUrls(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureShareLinkUrlsIsMutable();
        shareLinkUrls_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string share_link_urls = 4;</code>
       */
      public Builder addAllShareLinkUrls(
          java.lang.Iterable<java.lang.String> values) {
        ensureShareLinkUrlsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, shareLinkUrls_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string share_link_urls = 4;</code>
       */
      public Builder clearShareLinkUrls() {
        shareLinkUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string share_link_urls = 4;</code>
       */
      public Builder addShareLinkUrlsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureShareLinkUrlsIsMutable();
        shareLinkUrls_.add(value);
        onChanged();
        return this;
      }

      private long eveDate_ ;
      /**
       * <code>uint64 eve_date = 5;</code>
       */
      public long getEveDate() {
        return eveDate_;
      }
      /**
       * <code>uint64 eve_date = 5;</code>
       */
      public Builder setEveDate(long value) {
        
        eveDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 eve_date = 5;</code>
       */
      public Builder clearEveDate() {
        
        eveDate_ = 0L;
        onChanged();
        return this;
      }

      private long captureStartDate_ ;
      /**
       * <code>uint64 capture_start_date = 6;</code>
       */
      public long getCaptureStartDate() {
        return captureStartDate_;
      }
      /**
       * <code>uint64 capture_start_date = 6;</code>
       */
      public Builder setCaptureStartDate(long value) {
        
        captureStartDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 capture_start_date = 6;</code>
       */
      public Builder clearCaptureStartDate() {
        
        captureStartDate_ = 0L;
        onChanged();
        return this;
      }

      private long finaleStartDate_ ;
      /**
       * <code>uint64 finale_start_date = 7;</code>
       */
      public long getFinaleStartDate() {
        return finaleStartDate_;
      }
      /**
       * <code>uint64 finale_start_date = 7;</code>
       */
      public Builder setFinaleStartDate(long value) {
        
        finaleStartDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 finale_start_date = 7;</code>
       */
      public Builder clearFinaleStartDate() {
        
        finaleStartDate_ = 0L;
        onChanged();
        return this;
      }

      private long endDate_ ;
      /**
       * <code>uint64 end_date = 8;</code>
       */
      public long getEndDate() {
        return endDate_;
      }
      /**
       * <code>uint64 end_date = 8;</code>
       */
      public Builder setEndDate(long value) {
        
        endDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 end_date = 8;</code>
       */
      public Builder clearEndDate() {
        
        endDate_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgCaptureFestivalSeasonData)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgCaptureFestivalSeasonData)
    private static final com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData();
    }

    public static com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgCaptureFestivalSeasonData>
        PARSER = new com.google.protobuf.AbstractParser<MsgCaptureFestivalSeasonData>() {
      public MsgCaptureFestivalSeasonData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgCaptureFestivalSeasonData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgCaptureFestivalSeasonData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgCaptureFestivalSeasonData> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgCaptureFestivalSeasonDataOuterClass.MsgCaptureFestivalSeasonData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgCaptureFestivalSeasonData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgCaptureFestivalSeasonData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"MsgCaptureFestivalSeasonData.proto\022\013ms" +
      "ggamedata\"\315\001\n\034MsgCaptureFestivalSeasonDa" +
      "ta\022\n\n\002id\030\001 \001(\004\022\034\n\024capture_festival_uid\030\002" +
      " \001(\007\022\017\n\007img_url\030\003 \001(\t\022\027\n\017share_link_urls" +
      "\030\004 \003(\t\022\020\n\010eve_date\030\005 \001(\004\022\032\n\022capture_star" +
      "t_date\030\006 \001(\004\022\031\n\021finale_start_date\030\007 \001(\004\022" +
      "\020\n\010end_date\030\010 \001(\004B\023\n\021com.felania.msldbb\006" +
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
        }, assigner);
    internal_static_msggamedata_MsgCaptureFestivalSeasonData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgCaptureFestivalSeasonData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgCaptureFestivalSeasonData_descriptor,
        new java.lang.String[] { "Id", "CaptureFestivalUid", "ImgUrl", "ShareLinkUrls", "EveDate", "CaptureStartDate", "FinaleStartDate", "EndDate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
