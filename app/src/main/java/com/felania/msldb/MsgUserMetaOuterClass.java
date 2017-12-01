// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgUserMeta.proto

package com.felania.msldb;

public final class MsgUserMetaOuterClass {
  private MsgUserMetaOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgUserMetaOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgUserMeta)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.UserMetaType type = 1;</code>
     */
    int getTypeValue();
    /**
     * <code>.msggamedata.UserMetaType type = 1;</code>
     */
    com.felania.msldb.UserMetaTypeOuterClass.UserMetaType getType();

    /**
     * <code>.msggamedata.UserMetaValueType value_type = 2;</code>
     */
    int getValueTypeValue();
    /**
     * <code>.msggamedata.UserMetaValueType value_type = 2;</code>
     */
    com.felania.msldb.UserMetaValueTypeOuterClass.UserMetaValueType getValueType();

    /**
     * <code>bool v_bool = 3;</code>
     */
    boolean getVBool();

    /**
     * <code>float v_float = 4;</code>
     */
    float getVFloat();

    /**
     * <code>uint32 v_int = 5;</code>
     */
    int getVInt();

    /**
     * <code>string v_json = 6;</code>
     */
    java.lang.String getVJson();
    /**
     * <code>string v_json = 6;</code>
     */
    com.google.protobuf.ByteString
        getVJsonBytes();

    /**
     * <code>string v_string = 7;</code>
     */
    java.lang.String getVString();
    /**
     * <code>string v_string = 7;</code>
     */
    com.google.protobuf.ByteString
        getVStringBytes();

    /**
     * <code>uint64 create_date = 8;</code>
     */
    long getCreateDate();
  }
  /**
   * Protobuf type {@code msggamedata.MsgUserMeta}
   */
  public  static final class MsgUserMeta extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgUserMeta)
      MsgUserMetaOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgUserMeta.newBuilder() to construct.
    private MsgUserMeta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgUserMeta() {
      type_ = 0;
      valueType_ = 0;
      vBool_ = false;
      vFloat_ = 0F;
      vInt_ = 0;
      vJson_ = "";
      vString_ = "";
      createDate_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgUserMeta(
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

              type_ = rawValue;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              valueType_ = rawValue;
              break;
            }
            case 24: {

              vBool_ = input.readBool();
              break;
            }
            case 37: {

              vFloat_ = input.readFloat();
              break;
            }
            case 40: {

              vInt_ = input.readUInt32();
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              vJson_ = s;
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              vString_ = s;
              break;
            }
            case 64: {

              createDate_ = input.readUInt64();
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
      return com.felania.msldb.MsgUserMetaOuterClass.internal_static_msggamedata_MsgUserMeta_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgUserMetaOuterClass.internal_static_msggamedata_MsgUserMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.class, com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>.msggamedata.UserMetaType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.msggamedata.UserMetaType type = 1;</code>
     */
    public com.felania.msldb.UserMetaTypeOuterClass.UserMetaType getType() {
      com.felania.msldb.UserMetaTypeOuterClass.UserMetaType result = com.felania.msldb.UserMetaTypeOuterClass.UserMetaType.valueOf(type_);
      return result == null ? com.felania.msldb.UserMetaTypeOuterClass.UserMetaType.UNRECOGNIZED : result;
    }

    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private int valueType_;
    /**
     * <code>.msggamedata.UserMetaValueType value_type = 2;</code>
     */
    public int getValueTypeValue() {
      return valueType_;
    }
    /**
     * <code>.msggamedata.UserMetaValueType value_type = 2;</code>
     */
    public com.felania.msldb.UserMetaValueTypeOuterClass.UserMetaValueType getValueType() {
      com.felania.msldb.UserMetaValueTypeOuterClass.UserMetaValueType result = com.felania.msldb.UserMetaValueTypeOuterClass.UserMetaValueType.valueOf(valueType_);
      return result == null ? com.felania.msldb.UserMetaValueTypeOuterClass.UserMetaValueType.UNRECOGNIZED : result;
    }

    public static final int V_BOOL_FIELD_NUMBER = 3;
    private boolean vBool_;
    /**
     * <code>bool v_bool = 3;</code>
     */
    public boolean getVBool() {
      return vBool_;
    }

    public static final int V_FLOAT_FIELD_NUMBER = 4;
    private float vFloat_;
    /**
     * <code>float v_float = 4;</code>
     */
    public float getVFloat() {
      return vFloat_;
    }

    public static final int V_INT_FIELD_NUMBER = 5;
    private int vInt_;
    /**
     * <code>uint32 v_int = 5;</code>
     */
    public int getVInt() {
      return vInt_;
    }

    public static final int V_JSON_FIELD_NUMBER = 6;
    private volatile java.lang.Object vJson_;
    /**
     * <code>string v_json = 6;</code>
     */
    public java.lang.String getVJson() {
      java.lang.Object ref = vJson_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vJson_ = s;
        return s;
      }
    }
    /**
     * <code>string v_json = 6;</code>
     */
    public com.google.protobuf.ByteString
        getVJsonBytes() {
      java.lang.Object ref = vJson_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vJson_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int V_STRING_FIELD_NUMBER = 7;
    private volatile java.lang.Object vString_;
    /**
     * <code>string v_string = 7;</code>
     */
    public java.lang.String getVString() {
      java.lang.Object ref = vString_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vString_ = s;
        return s;
      }
    }
    /**
     * <code>string v_string = 7;</code>
     */
    public com.google.protobuf.ByteString
        getVStringBytes() {
      java.lang.Object ref = vString_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CREATE_DATE_FIELD_NUMBER = 8;
    private long createDate_;
    /**
     * <code>uint64 create_date = 8;</code>
     */
    public long getCreateDate() {
      return createDate_;
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
      if (type_ != com.felania.msldb.UserMetaTypeOuterClass.UserMetaType.UMT_All.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (valueType_ != com.felania.msldb.UserMetaValueTypeOuterClass.UserMetaValueType.UserMetaValueTypeNULL.getNumber()) {
        output.writeEnum(2, valueType_);
      }
      if (vBool_ != false) {
        output.writeBool(3, vBool_);
      }
      if (vFloat_ != 0F) {
        output.writeFloat(4, vFloat_);
      }
      if (vInt_ != 0) {
        output.writeUInt32(5, vInt_);
      }
      if (!getVJsonBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, vJson_);
      }
      if (!getVStringBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, vString_);
      }
      if (createDate_ != 0L) {
        output.writeUInt64(8, createDate_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != com.felania.msldb.UserMetaTypeOuterClass.UserMetaType.UMT_All.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (valueType_ != com.felania.msldb.UserMetaValueTypeOuterClass.UserMetaValueType.UserMetaValueTypeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, valueType_);
      }
      if (vBool_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, vBool_);
      }
      if (vFloat_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, vFloat_);
      }
      if (vInt_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, vInt_);
      }
      if (!getVJsonBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, vJson_);
      }
      if (!getVStringBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, vString_);
      }
      if (createDate_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, createDate_);
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
      if (!(obj instanceof com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta other = (com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta) obj;

      boolean result = true;
      result = result && type_ == other.type_;
      result = result && valueType_ == other.valueType_;
      result = result && (getVBool()
          == other.getVBool());
      result = result && (
          java.lang.Float.floatToIntBits(getVFloat())
          == java.lang.Float.floatToIntBits(
              other.getVFloat()));
      result = result && (getVInt()
          == other.getVInt());
      result = result && getVJson()
          .equals(other.getVJson());
      result = result && getVString()
          .equals(other.getVString());
      result = result && (getCreateDate()
          == other.getCreateDate());
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + VALUE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + valueType_;
      hash = (37 * hash) + V_BOOL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getVBool());
      hash = (37 * hash) + V_FLOAT_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getVFloat());
      hash = (37 * hash) + V_INT_FIELD_NUMBER;
      hash = (53 * hash) + getVInt();
      hash = (37 * hash) + V_JSON_FIELD_NUMBER;
      hash = (53 * hash) + getVJson().hashCode();
      hash = (37 * hash) + V_STRING_FIELD_NUMBER;
      hash = (53 * hash) + getVString().hashCode();
      hash = (37 * hash) + CREATE_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCreateDate());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta prototype) {
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
     * Protobuf type {@code msggamedata.MsgUserMeta}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgUserMeta)
        com.felania.msldb.MsgUserMetaOuterClass.MsgUserMetaOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgUserMetaOuterClass.internal_static_msggamedata_MsgUserMeta_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgUserMetaOuterClass.internal_static_msggamedata_MsgUserMeta_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.class, com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.Builder.class);
      }

      // Construct using com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.newBuilder()
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
        type_ = 0;

        valueType_ = 0;

        vBool_ = false;

        vFloat_ = 0F;

        vInt_ = 0;

        vJson_ = "";

        vString_ = "";

        createDate_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgUserMetaOuterClass.internal_static_msggamedata_MsgUserMeta_descriptor;
      }

      public com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta getDefaultInstanceForType() {
        return com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.getDefaultInstance();
      }

      public com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta build() {
        com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta buildPartial() {
        com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta result = new com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta(this);
        result.type_ = type_;
        result.valueType_ = valueType_;
        result.vBool_ = vBool_;
        result.vFloat_ = vFloat_;
        result.vInt_ = vInt_;
        result.vJson_ = vJson_;
        result.vString_ = vString_;
        result.createDate_ = createDate_;
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
        if (other instanceof com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta) {
          return mergeFrom((com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta other) {
        if (other == com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.valueType_ != 0) {
          setValueTypeValue(other.getValueTypeValue());
        }
        if (other.getVBool() != false) {
          setVBool(other.getVBool());
        }
        if (other.getVFloat() != 0F) {
          setVFloat(other.getVFloat());
        }
        if (other.getVInt() != 0) {
          setVInt(other.getVInt());
        }
        if (!other.getVJson().isEmpty()) {
          vJson_ = other.vJson_;
          onChanged();
        }
        if (!other.getVString().isEmpty()) {
          vString_ = other.vString_;
          onChanged();
        }
        if (other.getCreateDate() != 0L) {
          setCreateDate(other.getCreateDate());
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
        com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.msggamedata.UserMetaType type = 1;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.msggamedata.UserMetaType type = 1;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.UserMetaType type = 1;</code>
       */
      public com.felania.msldb.UserMetaTypeOuterClass.UserMetaType getType() {
        com.felania.msldb.UserMetaTypeOuterClass.UserMetaType result = com.felania.msldb.UserMetaTypeOuterClass.UserMetaType.valueOf(type_);
        return result == null ? com.felania.msldb.UserMetaTypeOuterClass.UserMetaType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.UserMetaType type = 1;</code>
       */
      public Builder setType(com.felania.msldb.UserMetaTypeOuterClass.UserMetaType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.UserMetaType type = 1;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private int valueType_ = 0;
      /**
       * <code>.msggamedata.UserMetaValueType value_type = 2;</code>
       */
      public int getValueTypeValue() {
        return valueType_;
      }
      /**
       * <code>.msggamedata.UserMetaValueType value_type = 2;</code>
       */
      public Builder setValueTypeValue(int value) {
        valueType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.UserMetaValueType value_type = 2;</code>
       */
      public com.felania.msldb.UserMetaValueTypeOuterClass.UserMetaValueType getValueType() {
        com.felania.msldb.UserMetaValueTypeOuterClass.UserMetaValueType result = com.felania.msldb.UserMetaValueTypeOuterClass.UserMetaValueType.valueOf(valueType_);
        return result == null ? com.felania.msldb.UserMetaValueTypeOuterClass.UserMetaValueType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.UserMetaValueType value_type = 2;</code>
       */
      public Builder setValueType(com.felania.msldb.UserMetaValueTypeOuterClass.UserMetaValueType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        valueType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.UserMetaValueType value_type = 2;</code>
       */
      public Builder clearValueType() {
        
        valueType_ = 0;
        onChanged();
        return this;
      }

      private boolean vBool_ ;
      /**
       * <code>bool v_bool = 3;</code>
       */
      public boolean getVBool() {
        return vBool_;
      }
      /**
       * <code>bool v_bool = 3;</code>
       */
      public Builder setVBool(boolean value) {
        
        vBool_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool v_bool = 3;</code>
       */
      public Builder clearVBool() {
        
        vBool_ = false;
        onChanged();
        return this;
      }

      private float vFloat_ ;
      /**
       * <code>float v_float = 4;</code>
       */
      public float getVFloat() {
        return vFloat_;
      }
      /**
       * <code>float v_float = 4;</code>
       */
      public Builder setVFloat(float value) {
        
        vFloat_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float v_float = 4;</code>
       */
      public Builder clearVFloat() {
        
        vFloat_ = 0F;
        onChanged();
        return this;
      }

      private int vInt_ ;
      /**
       * <code>uint32 v_int = 5;</code>
       */
      public int getVInt() {
        return vInt_;
      }
      /**
       * <code>uint32 v_int = 5;</code>
       */
      public Builder setVInt(int value) {
        
        vInt_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 v_int = 5;</code>
       */
      public Builder clearVInt() {
        
        vInt_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object vJson_ = "";
      /**
       * <code>string v_json = 6;</code>
       */
      public java.lang.String getVJson() {
        java.lang.Object ref = vJson_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          vJson_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string v_json = 6;</code>
       */
      public com.google.protobuf.ByteString
          getVJsonBytes() {
        java.lang.Object ref = vJson_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          vJson_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string v_json = 6;</code>
       */
      public Builder setVJson(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        vJson_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string v_json = 6;</code>
       */
      public Builder clearVJson() {
        
        vJson_ = getDefaultInstance().getVJson();
        onChanged();
        return this;
      }
      /**
       * <code>string v_json = 6;</code>
       */
      public Builder setVJsonBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        vJson_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object vString_ = "";
      /**
       * <code>string v_string = 7;</code>
       */
      public java.lang.String getVString() {
        java.lang.Object ref = vString_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          vString_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string v_string = 7;</code>
       */
      public com.google.protobuf.ByteString
          getVStringBytes() {
        java.lang.Object ref = vString_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          vString_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string v_string = 7;</code>
       */
      public Builder setVString(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        vString_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string v_string = 7;</code>
       */
      public Builder clearVString() {
        
        vString_ = getDefaultInstance().getVString();
        onChanged();
        return this;
      }
      /**
       * <code>string v_string = 7;</code>
       */
      public Builder setVStringBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        vString_ = value;
        onChanged();
        return this;
      }

      private long createDate_ ;
      /**
       * <code>uint64 create_date = 8;</code>
       */
      public long getCreateDate() {
        return createDate_;
      }
      /**
       * <code>uint64 create_date = 8;</code>
       */
      public Builder setCreateDate(long value) {
        
        createDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 create_date = 8;</code>
       */
      public Builder clearCreateDate() {
        
        createDate_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgUserMeta)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgUserMeta)
    private static final com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta();
    }

    public static com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgUserMeta>
        PARSER = new com.google.protobuf.AbstractParser<MsgUserMeta>() {
      public MsgUserMeta parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MsgUserMeta(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgUserMeta> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgUserMeta> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgUserMetaOuterClass.MsgUserMeta getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgUserMeta_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgUserMeta_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MsgUserMeta.proto\022\013msggamedata\032\022UserMe" +
      "taType.proto\032\027UserMetaValueType.proto\"\321\001" +
      "\n\013MsgUserMeta\022\'\n\004type\030\001 \001(\0162\031.msggamedat" +
      "a.UserMetaType\0222\n\nvalue_type\030\002 \001(\0162\036.msg" +
      "gamedata.UserMetaValueType\022\016\n\006v_bool\030\003 \001" +
      "(\010\022\017\n\007v_float\030\004 \001(\002\022\r\n\005v_int\030\005 \001(\r\022\016\n\006v_" +
      "json\030\006 \001(\t\022\020\n\010v_string\030\007 \001(\t\022\023\n\013create_d" +
      "ate\030\010 \001(\004B\023\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.UserMetaTypeOuterClass.getDescriptor(),
          com.felania.msldb.UserMetaValueTypeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgUserMeta_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgUserMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgUserMeta_descriptor,
        new java.lang.String[] { "Type", "ValueType", "VBool", "VFloat", "VInt", "VJson", "VString", "CreateDate", });
    com.felania.msldb.UserMetaTypeOuterClass.getDescriptor();
    com.felania.msldb.UserMetaValueTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
