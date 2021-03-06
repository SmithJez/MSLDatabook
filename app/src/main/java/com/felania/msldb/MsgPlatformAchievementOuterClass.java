// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgPlatformAchievement.proto

package com.felania.msldb;

public final class MsgPlatformAchievementOuterClass {
  private MsgPlatformAchievementOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgPlatformAchievementOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgPlatformAchievement)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>fixed32 data = 2;</code>
     */
    int getData();

    /**
     * <code>string ios_code = 3;</code>
     */
    java.lang.String getIosCode();
    /**
     * <code>string ios_code = 3;</code>
     */
    com.google.protobuf.ByteString
        getIosCodeBytes();

    /**
     * <code>string android_code = 4;</code>
     */
    java.lang.String getAndroidCode();
    /**
     * <code>string android_code = 4;</code>
     */
    com.google.protobuf.ByteString
        getAndroidCodeBytes();
  }
  /**
   * Protobuf type {@code msggamedata.MsgPlatformAchievement}
   */
  public  static final class MsgPlatformAchievement extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgPlatformAchievement)
      MsgPlatformAchievementOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgPlatformAchievement.newBuilder() to construct.
    private MsgPlatformAchievement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgPlatformAchievement() {
      uid_ = 0;
      data_ = 0;
      iosCode_ = "";
      androidCode_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgPlatformAchievement(
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
            case 21: {

              data_ = input.readFixed32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              iosCode_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              androidCode_ = s;
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
      return com.felania.msldb.MsgPlatformAchievementOuterClass.internal_static_msggamedata_MsgPlatformAchievement_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgPlatformAchievementOuterClass.internal_static_msggamedata_MsgPlatformAchievement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement.class, com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>fixed32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int DATA_FIELD_NUMBER = 2;
    private int data_;
    /**
     * <code>fixed32 data = 2;</code>
     */
    public int getData() {
      return data_;
    }

    public static final int IOS_CODE_FIELD_NUMBER = 3;
    private volatile java.lang.Object iosCode_;
    /**
     * <code>string ios_code = 3;</code>
     */
    public java.lang.String getIosCode() {
      java.lang.Object ref = iosCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iosCode_ = s;
        return s;
      }
    }
    /**
     * <code>string ios_code = 3;</code>
     */
    public com.google.protobuf.ByteString
        getIosCodeBytes() {
      java.lang.Object ref = iosCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iosCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ANDROID_CODE_FIELD_NUMBER = 4;
    private volatile java.lang.Object androidCode_;
    /**
     * <code>string android_code = 4;</code>
     */
    public java.lang.String getAndroidCode() {
      java.lang.Object ref = androidCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        androidCode_ = s;
        return s;
      }
    }
    /**
     * <code>string android_code = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAndroidCodeBytes() {
      java.lang.Object ref = androidCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        androidCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (data_ != 0) {
        output.writeFixed32(2, data_);
      }
      if (!getIosCodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, iosCode_);
      }
      if (!getAndroidCodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, androidCode_);
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
      if (data_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(2, data_);
      }
      if (!getIosCodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, iosCode_);
      }
      if (!getAndroidCodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, androidCode_);
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
      if (!(obj instanceof com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement other = (com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement) obj;

      boolean result = true;
      result = result && (getUid()
          == other.getUid());
      result = result && (getData()
          == other.getData());
      result = result && getIosCode()
          .equals(other.getIosCode());
      result = result && getAndroidCode()
          .equals(other.getAndroidCode());
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
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData();
      hash = (37 * hash) + IOS_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getIosCode().hashCode();
      hash = (37 * hash) + ANDROID_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getAndroidCode().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement prototype) {
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
     * Protobuf type {@code msggamedata.MsgPlatformAchievement}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgPlatformAchievement)
        com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievementOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgPlatformAchievementOuterClass.internal_static_msggamedata_MsgPlatformAchievement_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgPlatformAchievementOuterClass.internal_static_msggamedata_MsgPlatformAchievement_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement.class, com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement.Builder.class);
      }

      // Construct using com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement.newBuilder()
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
        uid_ = 0;

        data_ = 0;

        iosCode_ = "";

        androidCode_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgPlatformAchievementOuterClass.internal_static_msggamedata_MsgPlatformAchievement_descriptor;
      }

      public com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement getDefaultInstanceForType() {
        return com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement.getDefaultInstance();
      }

      public com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement build() {
        com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement buildPartial() {
        com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement result = new com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement(this);
        result.uid_ = uid_;
        result.data_ = data_;
        result.iosCode_ = iosCode_;
        result.androidCode_ = androidCode_;
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
        if (other instanceof com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement) {
          return mergeFrom((com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement other) {
        if (other == com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getData() != 0) {
          setData(other.getData());
        }
        if (!other.getIosCode().isEmpty()) {
          iosCode_ = other.iosCode_;
          onChanged();
        }
        if (!other.getAndroidCode().isEmpty()) {
          androidCode_ = other.androidCode_;
          onChanged();
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
        com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

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

      private int data_ ;
      /**
       * <code>fixed32 data = 2;</code>
       */
      public int getData() {
        return data_;
      }
      /**
       * <code>fixed32 data = 2;</code>
       */
      public Builder setData(int value) {
        
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 data = 2;</code>
       */
      public Builder clearData() {
        
        data_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object iosCode_ = "";
      /**
       * <code>string ios_code = 3;</code>
       */
      public java.lang.String getIosCode() {
        java.lang.Object ref = iosCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          iosCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string ios_code = 3;</code>
       */
      public com.google.protobuf.ByteString
          getIosCodeBytes() {
        java.lang.Object ref = iosCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          iosCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string ios_code = 3;</code>
       */
      public Builder setIosCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        iosCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string ios_code = 3;</code>
       */
      public Builder clearIosCode() {
        
        iosCode_ = getDefaultInstance().getIosCode();
        onChanged();
        return this;
      }
      /**
       * <code>string ios_code = 3;</code>
       */
      public Builder setIosCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        iosCode_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object androidCode_ = "";
      /**
       * <code>string android_code = 4;</code>
       */
      public java.lang.String getAndroidCode() {
        java.lang.Object ref = androidCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          androidCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string android_code = 4;</code>
       */
      public com.google.protobuf.ByteString
          getAndroidCodeBytes() {
        java.lang.Object ref = androidCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          androidCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string android_code = 4;</code>
       */
      public Builder setAndroidCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        androidCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string android_code = 4;</code>
       */
      public Builder clearAndroidCode() {
        
        androidCode_ = getDefaultInstance().getAndroidCode();
        onChanged();
        return this;
      }
      /**
       * <code>string android_code = 4;</code>
       */
      public Builder setAndroidCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        androidCode_ = value;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgPlatformAchievement)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgPlatformAchievement)
    private static final com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement();
    }

    public static com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgPlatformAchievement>
        PARSER = new com.google.protobuf.AbstractParser<MsgPlatformAchievement>() {
      public MsgPlatformAchievement parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgPlatformAchievement(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgPlatformAchievement> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgPlatformAchievement> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgPlatformAchievementOuterClass.MsgPlatformAchievement getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgPlatformAchievement_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgPlatformAchievement_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034MsgPlatformAchievement.proto\022\013msggamed" +
      "ata\"[\n\026MsgPlatformAchievement\022\013\n\003uid\030\001 \001" +
      "(\007\022\014\n\004data\030\002 \001(\007\022\020\n\010ios_code\030\003 \001(\t\022\024\n\014an" +
      "droid_code\030\004 \001(\tB\023\n\021com.felania.msldbb\006p" +
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
        }, assigner);
    internal_static_msggamedata_MsgPlatformAchievement_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgPlatformAchievement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgPlatformAchievement_descriptor,
        new java.lang.String[] { "Uid", "Data", "IosCode", "AndroidCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
