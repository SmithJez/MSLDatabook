// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgClanEmblem.proto

package com.felania.msldb;

public final class MsgClanEmblemOuterClass {
  private MsgClanEmblemOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgClanEmblemOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgClanEmblem)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>string icon = 2;</code>
     */
    java.lang.String getIcon();
    /**
     * <code>string icon = 2;</code>
     */
    com.google.protobuf.ByteString
        getIconBytes();

    /**
     * <code>bool is_enable = 3;</code>
     */
    boolean getIsEnable();
  }
  /**
   * Protobuf type {@code msggamedata.MsgClanEmblem}
   */
  public  static final class MsgClanEmblem extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgClanEmblem)
      MsgClanEmblemOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgClanEmblem.newBuilder() to construct.
    private MsgClanEmblem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgClanEmblem() {
      uid_ = 0;
      icon_ = "";
      isEnable_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgClanEmblem(
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

              icon_ = s;
              break;
            }
            case 24: {

              isEnable_ = input.readBool();
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
      return com.felania.msldb.MsgClanEmblemOuterClass.internal_static_msggamedata_MsgClanEmblem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgClanEmblemOuterClass.internal_static_msggamedata_MsgClanEmblem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem.class, com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>fixed32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int ICON_FIELD_NUMBER = 2;
    private volatile java.lang.Object icon_;
    /**
     * <code>string icon = 2;</code>
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
     * <code>string icon = 2;</code>
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

    public static final int IS_ENABLE_FIELD_NUMBER = 3;
    private boolean isEnable_;
    /**
     * <code>bool is_enable = 3;</code>
     */
    public boolean getIsEnable() {
      return isEnable_;
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
      if (!getIconBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, icon_);
      }
      if (isEnable_ != false) {
        output.writeBool(3, isEnable_);
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
      if (!getIconBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, icon_);
      }
      if (isEnable_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isEnable_);
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
      if (!(obj instanceof com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem other = (com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem) obj;

      boolean result = true;
      result = result && (getUid()
          == other.getUid());
      result = result && getIcon()
          .equals(other.getIcon());
      result = result && (getIsEnable()
          == other.getIsEnable());
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
      hash = (37 * hash) + ICON_FIELD_NUMBER;
      hash = (53 * hash) + getIcon().hashCode();
      hash = (37 * hash) + IS_ENABLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsEnable());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem prototype) {
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
     * Protobuf type {@code msggamedata.MsgClanEmblem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgClanEmblem)
        com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgClanEmblemOuterClass.internal_static_msggamedata_MsgClanEmblem_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgClanEmblemOuterClass.internal_static_msggamedata_MsgClanEmblem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem.class, com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem.Builder.class);
      }

      // Construct using com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem.newBuilder()
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

        icon_ = "";

        isEnable_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgClanEmblemOuterClass.internal_static_msggamedata_MsgClanEmblem_descriptor;
      }

      public com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem getDefaultInstanceForType() {
        return com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem.getDefaultInstance();
      }

      public com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem build() {
        com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem buildPartial() {
        com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem result = new com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem(this);
        result.uid_ = uid_;
        result.icon_ = icon_;
        result.isEnable_ = isEnable_;
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
        if (other instanceof com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem) {
          return mergeFrom((com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem other) {
        if (other == com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.getIcon().isEmpty()) {
          icon_ = other.icon_;
          onChanged();
        }
        if (other.getIsEnable() != false) {
          setIsEnable(other.getIsEnable());
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
        com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem) e.getUnfinishedMessage();
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

      private java.lang.Object icon_ = "";
      /**
       * <code>string icon = 2;</code>
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
       * <code>string icon = 2;</code>
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
       * <code>string icon = 2;</code>
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
       * <code>string icon = 2;</code>
       */
      public Builder clearIcon() {
        
        icon_ = getDefaultInstance().getIcon();
        onChanged();
        return this;
      }
      /**
       * <code>string icon = 2;</code>
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

      private boolean isEnable_ ;
      /**
       * <code>bool is_enable = 3;</code>
       */
      public boolean getIsEnable() {
        return isEnable_;
      }
      /**
       * <code>bool is_enable = 3;</code>
       */
      public Builder setIsEnable(boolean value) {
        
        isEnable_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_enable = 3;</code>
       */
      public Builder clearIsEnable() {
        
        isEnable_ = false;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgClanEmblem)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgClanEmblem)
    private static final com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem();
    }

    public static com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgClanEmblem>
        PARSER = new com.google.protobuf.AbstractParser<MsgClanEmblem>() {
      public MsgClanEmblem parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgClanEmblem(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgClanEmblem> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgClanEmblem> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgClanEmblemOuterClass.MsgClanEmblem getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgClanEmblem_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgClanEmblem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023MsgClanEmblem.proto\022\013msggamedata\"=\n\rMs" +
      "gClanEmblem\022\013\n\003uid\030\001 \001(\007\022\014\n\004icon\030\002 \001(\t\022\021" +
      "\n\tis_enable\030\003 \001(\010B\023\n\021com.felania.msldbb\006" +
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
    internal_static_msggamedata_MsgClanEmblem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgClanEmblem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgClanEmblem_descriptor,
        new java.lang.String[] { "Uid", "Icon", "IsEnable", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
