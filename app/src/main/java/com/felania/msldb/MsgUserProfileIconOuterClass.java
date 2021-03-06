// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgUserProfileIcon.proto

package com.felania.msldb;

public final class MsgUserProfileIconOuterClass {
  private MsgUserProfileIconOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgUserProfileIconOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgUserProfileIcon)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>string str_uid = 2;</code>
     */
    java.lang.String getStrUid();
    /**
     * <code>string str_uid = 2;</code>
     */
    com.google.protobuf.ByteString
        getStrUidBytes();

    /**
     * <code>string icon = 3;</code>
     */
    java.lang.String getIcon();
    /**
     * <code>string icon = 3;</code>
     */
    com.google.protobuf.ByteString
        getIconBytes();

    /**
     * <code>.msggamedata.UserProfileIconUnlockType unlock_condition = 4;</code>
     */
    int getUnlockConditionValue();
    /**
     * <code>.msggamedata.UserProfileIconUnlockType unlock_condition = 4;</code>
     */
    com.felania.msldb.UserProfileIconUnlockTypeOuterClass.UserProfileIconUnlockType getUnlockCondition();

    /**
     * <code>fixed32 count = 5;</code>
     */
    int getCount();

    /**
     * <code>fixed32 name = 6;</code>
     */
    int getName();
  }
  /**
   * Protobuf type {@code msggamedata.MsgUserProfileIcon}
   */
  public  static final class MsgUserProfileIcon extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgUserProfileIcon)
      MsgUserProfileIconOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgUserProfileIcon.newBuilder() to construct.
    private MsgUserProfileIcon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgUserProfileIcon() {
      uid_ = 0;
      strUid_ = "";
      icon_ = "";
      unlockCondition_ = 0;
      count_ = 0;
      name_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgUserProfileIcon(
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
              java.lang.String s = input.readStringRequireUtf8();

              strUid_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              icon_ = s;
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              unlockCondition_ = rawValue;
              break;
            }
            case 45: {

              count_ = input.readFixed32();
              break;
            }
            case 53: {

              name_ = input.readFixed32();
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
      return com.felania.msldb.MsgUserProfileIconOuterClass.internal_static_msggamedata_MsgUserProfileIcon_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgUserProfileIconOuterClass.internal_static_msggamedata_MsgUserProfileIcon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon.class, com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>fixed32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int STR_UID_FIELD_NUMBER = 2;
    private volatile java.lang.Object strUid_;
    /**
     * <code>string str_uid = 2;</code>
     */
    public java.lang.String getStrUid() {
      java.lang.Object ref = strUid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        strUid_ = s;
        return s;
      }
    }
    /**
     * <code>string str_uid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStrUidBytes() {
      java.lang.Object ref = strUid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        strUid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ICON_FIELD_NUMBER = 3;
    private volatile java.lang.Object icon_;
    /**
     * <code>string icon = 3;</code>
     */
    public java.lang.String getIcon() {
      java.lang.Object ref = icon_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        icon_ = s;
        return s;
      }
    }
    /**
     * <code>string icon = 3;</code>
     */
    public com.google.protobuf.ByteString
        getIconBytes() {
      java.lang.Object ref = icon_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        icon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UNLOCK_CONDITION_FIELD_NUMBER = 4;
    private int unlockCondition_;
    /**
     * <code>.msggamedata.UserProfileIconUnlockType unlock_condition = 4;</code>
     */
    public int getUnlockConditionValue() {
      return unlockCondition_;
    }
    /**
     * <code>.msggamedata.UserProfileIconUnlockType unlock_condition = 4;</code>
     */
    public com.felania.msldb.UserProfileIconUnlockTypeOuterClass.UserProfileIconUnlockType getUnlockCondition() {
      com.felania.msldb.UserProfileIconUnlockTypeOuterClass.UserProfileIconUnlockType result = com.felania.msldb.UserProfileIconUnlockTypeOuterClass.UserProfileIconUnlockType.valueOf(unlockCondition_);
      return result == null ? com.felania.msldb.UserProfileIconUnlockTypeOuterClass.UserProfileIconUnlockType.UNRECOGNIZED : result;
    }

    public static final int COUNT_FIELD_NUMBER = 5;
    private int count_;
    /**
     * <code>fixed32 count = 5;</code>
     */
    public int getCount() {
      return count_;
    }

    public static final int NAME_FIELD_NUMBER = 6;
    private int name_;
    /**
     * <code>fixed32 name = 6;</code>
     */
    public int getName() {
      return name_;
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
      if (!getStrUidBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, strUid_);
      }
      if (!getIconBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, icon_);
      }
      if (unlockCondition_ != com.felania.msldb.UserProfileIconUnlockTypeOuterClass.UserProfileIconUnlockType.UPIU_Default.getNumber()) {
        output.writeEnum(4, unlockCondition_);
      }
      if (count_ != 0) {
        output.writeFixed32(5, count_);
      }
      if (name_ != 0) {
        output.writeFixed32(6, name_);
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
      if (!getStrUidBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, strUid_);
      }
      if (!getIconBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, icon_);
      }
      if (unlockCondition_ != com.felania.msldb.UserProfileIconUnlockTypeOuterClass.UserProfileIconUnlockType.UPIU_Default.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, unlockCondition_);
      }
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(5, count_);
      }
      if (name_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(6, name_);
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
      if (!(obj instanceof com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon other = (com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon) obj;

      boolean result = true;
      result = result && (getUid()
          == other.getUid());
      result = result && getStrUid()
          .equals(other.getStrUid());
      result = result && getIcon()
          .equals(other.getIcon());
      result = result && unlockCondition_ == other.unlockCondition_;
      result = result && (getCount()
          == other.getCount());
      result = result && (getName()
          == other.getName());
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
      hash = (37 * hash) + STR_UID_FIELD_NUMBER;
      hash = (53 * hash) + getStrUid().hashCode();
      hash = (37 * hash) + ICON_FIELD_NUMBER;
      hash = (53 * hash) + getIcon().hashCode();
      hash = (37 * hash) + UNLOCK_CONDITION_FIELD_NUMBER;
      hash = (53 * hash) + unlockCondition_;
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon prototype) {
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
     * Protobuf type {@code msggamedata.MsgUserProfileIcon}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgUserProfileIcon)
        com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIconOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgUserProfileIconOuterClass.internal_static_msggamedata_MsgUserProfileIcon_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgUserProfileIconOuterClass.internal_static_msggamedata_MsgUserProfileIcon_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon.class, com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon.Builder.class);
      }

      // Construct using com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon.newBuilder()
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

        strUid_ = "";

        icon_ = "";

        unlockCondition_ = 0;

        count_ = 0;

        name_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgUserProfileIconOuterClass.internal_static_msggamedata_MsgUserProfileIcon_descriptor;
      }

      public com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon getDefaultInstanceForType() {
        return com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon.getDefaultInstance();
      }

      public com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon build() {
        com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon buildPartial() {
        com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon result = new com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon(this);
        result.uid_ = uid_;
        result.strUid_ = strUid_;
        result.icon_ = icon_;
        result.unlockCondition_ = unlockCondition_;
        result.count_ = count_;
        result.name_ = name_;
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
        if (other instanceof com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon) {
          return mergeFrom((com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon other) {
        if (other == com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.getStrUid().isEmpty()) {
          strUid_ = other.strUid_;
          onChanged();
        }
        if (!other.getIcon().isEmpty()) {
          icon_ = other.icon_;
          onChanged();
        }
        if (other.unlockCondition_ != 0) {
          setUnlockConditionValue(other.getUnlockConditionValue());
        }
        if (other.getCount() != 0) {
          setCount(other.getCount());
        }
        if (other.getName() != 0) {
          setName(other.getName());
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
        com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon) e.getUnfinishedMessage();
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

      private java.lang.Object strUid_ = "";
      /**
       * <code>string str_uid = 2;</code>
       */
      public java.lang.String getStrUid() {
        java.lang.Object ref = strUid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          strUid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string str_uid = 2;</code>
       */
      public com.google.protobuf.ByteString
          getStrUidBytes() {
        java.lang.Object ref = strUid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          strUid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string str_uid = 2;</code>
       */
      public Builder setStrUid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        strUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string str_uid = 2;</code>
       */
      public Builder clearStrUid() {
        
        strUid_ = getDefaultInstance().getStrUid();
        onChanged();
        return this;
      }
      /**
       * <code>string str_uid = 2;</code>
       */
      public Builder setStrUidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        strUid_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object icon_ = "";
      /**
       * <code>string icon = 3;</code>
       */
      public java.lang.String getIcon() {
        java.lang.Object ref = icon_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          icon_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string icon = 3;</code>
       */
      public com.google.protobuf.ByteString
          getIconBytes() {
        java.lang.Object ref = icon_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          icon_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string icon = 3;</code>
       */
      public Builder setIcon(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        icon_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string icon = 3;</code>
       */
      public Builder clearIcon() {
        
        icon_ = getDefaultInstance().getIcon();
        onChanged();
        return this;
      }
      /**
       * <code>string icon = 3;</code>
       */
      public Builder setIconBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        icon_ = value;
        onChanged();
        return this;
      }

      private int unlockCondition_ = 0;
      /**
       * <code>.msggamedata.UserProfileIconUnlockType unlock_condition = 4;</code>
       */
      public int getUnlockConditionValue() {
        return unlockCondition_;
      }
      /**
       * <code>.msggamedata.UserProfileIconUnlockType unlock_condition = 4;</code>
       */
      public Builder setUnlockConditionValue(int value) {
        unlockCondition_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.UserProfileIconUnlockType unlock_condition = 4;</code>
       */
      public com.felania.msldb.UserProfileIconUnlockTypeOuterClass.UserProfileIconUnlockType getUnlockCondition() {
        com.felania.msldb.UserProfileIconUnlockTypeOuterClass.UserProfileIconUnlockType result = com.felania.msldb.UserProfileIconUnlockTypeOuterClass.UserProfileIconUnlockType.valueOf(unlockCondition_);
        return result == null ? com.felania.msldb.UserProfileIconUnlockTypeOuterClass.UserProfileIconUnlockType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.UserProfileIconUnlockType unlock_condition = 4;</code>
       */
      public Builder setUnlockCondition(com.felania.msldb.UserProfileIconUnlockTypeOuterClass.UserProfileIconUnlockType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        unlockCondition_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.UserProfileIconUnlockType unlock_condition = 4;</code>
       */
      public Builder clearUnlockCondition() {
        
        unlockCondition_ = 0;
        onChanged();
        return this;
      }

      private int count_ ;
      /**
       * <code>fixed32 count = 5;</code>
       */
      public int getCount() {
        return count_;
      }
      /**
       * <code>fixed32 count = 5;</code>
       */
      public Builder setCount(int value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 count = 5;</code>
       */
      public Builder clearCount() {
        
        count_ = 0;
        onChanged();
        return this;
      }

      private int name_ ;
      /**
       * <code>fixed32 name = 6;</code>
       */
      public int getName() {
        return name_;
      }
      /**
       * <code>fixed32 name = 6;</code>
       */
      public Builder setName(int value) {
        
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 name = 6;</code>
       */
      public Builder clearName() {
        
        name_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgUserProfileIcon)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgUserProfileIcon)
    private static final com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon();
    }

    public static com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgUserProfileIcon>
        PARSER = new com.google.protobuf.AbstractParser<MsgUserProfileIcon>() {
      public MsgUserProfileIcon parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgUserProfileIcon(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgUserProfileIcon> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgUserProfileIcon> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgUserProfileIconOuterClass.MsgUserProfileIcon getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgUserProfileIcon_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgUserProfileIcon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030MsgUserProfileIcon.proto\022\013msggamedata\032" +
      "\037UserProfileIconUnlockType.proto\"\237\001\n\022Msg" +
      "UserProfileIcon\022\013\n\003uid\030\001 \001(\007\022\017\n\007str_uid\030" +
      "\002 \001(\t\022\014\n\004icon\030\003 \001(\t\022@\n\020unlock_condition\030" +
      "\004 \001(\0162&.msggamedata.UserProfileIconUnloc" +
      "kType\022\r\n\005count\030\005 \001(\007\022\014\n\004name\030\006 \001(\007B\023\n\021co" +
      "m.felania.msldbb\006proto3"
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
          com.felania.msldb.UserProfileIconUnlockTypeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgUserProfileIcon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgUserProfileIcon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgUserProfileIcon_descriptor,
        new java.lang.String[] { "Uid", "StrUid", "Icon", "UnlockCondition", "Count", "Name", });
    com.felania.msldb.UserProfileIconUnlockTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
