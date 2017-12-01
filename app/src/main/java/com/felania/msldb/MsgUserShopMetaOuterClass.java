// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgUserShopMeta.proto

package com.felania.msldb;

public final class MsgUserShopMetaOuterClass {
  private MsgUserShopMetaOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgUserShopMetaOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgUserShopMeta)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 item_uid = 1;</code>
     */
    int getItemUid();

    /**
     * <code>string meta = 2;</code>
     */
    java.lang.String getMeta();
    /**
     * <code>string meta = 2;</code>
     */
    com.google.protobuf.ByteString
        getMetaBytes();
  }
  /**
   * Protobuf type {@code msggamedata.MsgUserShopMeta}
   */
  public  static final class MsgUserShopMeta extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgUserShopMeta)
      MsgUserShopMetaOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgUserShopMeta.newBuilder() to construct.
    private MsgUserShopMeta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgUserShopMeta() {
      itemUid_ = 0;
      meta_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgUserShopMeta(
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
            case 13: {

              itemUid_ = input.readFixed32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              meta_ = s;
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
      return com.felania.msldb.MsgUserShopMetaOuterClass.internal_static_msggamedata_MsgUserShopMeta_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgUserShopMetaOuterClass.internal_static_msggamedata_MsgUserShopMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta.class, com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta.Builder.class);
    }

    public static final int ITEM_UID_FIELD_NUMBER = 1;
    private int itemUid_;
    /**
     * <code>fixed32 item_uid = 1;</code>
     */
    public int getItemUid() {
      return itemUid_;
    }

    public static final int META_FIELD_NUMBER = 2;
    private volatile java.lang.Object meta_;
    /**
     * <code>string meta = 2;</code>
     */
    public java.lang.String getMeta() {
      java.lang.Object ref = meta_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        meta_ = s;
        return s;
      }
    }
    /**
     * <code>string meta = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMetaBytes() {
      java.lang.Object ref = meta_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        meta_ = b;
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
      if (itemUid_ != 0) {
        output.writeFixed32(1, itemUid_);
      }
      if (!getMetaBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, meta_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (itemUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, itemUid_);
      }
      if (!getMetaBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, meta_);
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
      if (!(obj instanceof com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta other = (com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta) obj;

      boolean result = true;
      result = result && (getItemUid()
          == other.getItemUid());
      result = result && getMeta()
          .equals(other.getMeta());
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
      hash = (37 * hash) + ITEM_UID_FIELD_NUMBER;
      hash = (53 * hash) + getItemUid();
      hash = (37 * hash) + META_FIELD_NUMBER;
      hash = (53 * hash) + getMeta().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta prototype) {
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
     * Protobuf type {@code msggamedata.MsgUserShopMeta}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgUserShopMeta)
        com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMetaOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgUserShopMetaOuterClass.internal_static_msggamedata_MsgUserShopMeta_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgUserShopMetaOuterClass.internal_static_msggamedata_MsgUserShopMeta_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta.class, com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta.Builder.class);
      }

      // Construct using com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta.newBuilder()
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
        itemUid_ = 0;

        meta_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgUserShopMetaOuterClass.internal_static_msggamedata_MsgUserShopMeta_descriptor;
      }

      public com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta getDefaultInstanceForType() {
        return com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta.getDefaultInstance();
      }

      public com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta build() {
        com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta buildPartial() {
        com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta result = new com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta(this);
        result.itemUid_ = itemUid_;
        result.meta_ = meta_;
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
        if (other instanceof com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta) {
          return mergeFrom((com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta other) {
        if (other == com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta.getDefaultInstance()) return this;
        if (other.getItemUid() != 0) {
          setItemUid(other.getItemUid());
        }
        if (!other.getMeta().isEmpty()) {
          meta_ = other.meta_;
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
        com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int itemUid_ ;
      /**
       * <code>fixed32 item_uid = 1;</code>
       */
      public int getItemUid() {
        return itemUid_;
      }
      /**
       * <code>fixed32 item_uid = 1;</code>
       */
      public Builder setItemUid(int value) {
        
        itemUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 item_uid = 1;</code>
       */
      public Builder clearItemUid() {
        
        itemUid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object meta_ = "";
      /**
       * <code>string meta = 2;</code>
       */
      public java.lang.String getMeta() {
        java.lang.Object ref = meta_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          meta_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string meta = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMetaBytes() {
        java.lang.Object ref = meta_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          meta_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string meta = 2;</code>
       */
      public Builder setMeta(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        meta_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string meta = 2;</code>
       */
      public Builder clearMeta() {
        
        meta_ = getDefaultInstance().getMeta();
        onChanged();
        return this;
      }
      /**
       * <code>string meta = 2;</code>
       */
      public Builder setMetaBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        meta_ = value;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgUserShopMeta)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgUserShopMeta)
    private static final com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta();
    }

    public static com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgUserShopMeta>
        PARSER = new com.google.protobuf.AbstractParser<MsgUserShopMeta>() {
      public MsgUserShopMeta parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MsgUserShopMeta(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgUserShopMeta> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgUserShopMeta> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgUserShopMetaOuterClass.MsgUserShopMeta getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgUserShopMeta_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgUserShopMeta_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025MsgUserShopMeta.proto\022\013msggamedata\"1\n\017" +
      "MsgUserShopMeta\022\020\n\010item_uid\030\001 \001(\007\022\014\n\004met" +
      "a\030\002 \001(\tB\023\n\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_MsgUserShopMeta_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgUserShopMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgUserShopMeta_descriptor,
        new java.lang.String[] { "ItemUid", "Meta", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
