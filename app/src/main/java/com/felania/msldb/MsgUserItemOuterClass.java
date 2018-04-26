// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgUserItem.proto

package com.felania.msldb;

public final class MsgUserItemOuterClass {
  private MsgUserItemOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgUserItemOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgUserItem)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 item_uid = 1;</code>
     */
    int getItemUid();

    /**
     * <code>uint32 item_count = 2;</code>
     */
    int getItemCount();

    /**
     * <code>uint32 item_count_delta = 3;</code>
     */
    int getItemCountDelta();
  }
  /**
   * Protobuf type {@code msggamedata.MsgUserItem}
   */
  public  static final class MsgUserItem extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgUserItem)
      MsgUserItemOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgUserItem.newBuilder() to construct.
    private MsgUserItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgUserItem() {
      itemUid_ = 0;
      itemCount_ = 0;
      itemCountDelta_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgUserItem(
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

              itemUid_ = input.readFixed32();
              break;
            }
            case 16: {

              itemCount_ = input.readUInt32();
              break;
            }
            case 24: {

              itemCountDelta_ = input.readUInt32();
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
      return com.felania.msldb.MsgUserItemOuterClass.internal_static_msggamedata_MsgUserItem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgUserItemOuterClass.internal_static_msggamedata_MsgUserItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.class, com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.Builder.class);
    }

    public static final int ITEM_UID_FIELD_NUMBER = 1;
    private int itemUid_;
    /**
     * <code>fixed32 item_uid = 1;</code>
     */
    public int getItemUid() {
      return itemUid_;
    }

    public static final int ITEM_COUNT_FIELD_NUMBER = 2;
    private int itemCount_;
    /**
     * <code>uint32 item_count = 2;</code>
     */
    public int getItemCount() {
      return itemCount_;
    }

    public static final int ITEM_COUNT_DELTA_FIELD_NUMBER = 3;
    private int itemCountDelta_;
    /**
     * <code>uint32 item_count_delta = 3;</code>
     */
    public int getItemCountDelta() {
      return itemCountDelta_;
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
      if (itemCount_ != 0) {
        output.writeUInt32(2, itemCount_);
      }
      if (itemCountDelta_ != 0) {
        output.writeUInt32(3, itemCountDelta_);
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
      if (itemCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, itemCount_);
      }
      if (itemCountDelta_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, itemCountDelta_);
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
      if (!(obj instanceof com.felania.msldb.MsgUserItemOuterClass.MsgUserItem)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgUserItemOuterClass.MsgUserItem other = (com.felania.msldb.MsgUserItemOuterClass.MsgUserItem) obj;

      boolean result = true;
      result = result && (getItemUid()
          == other.getItemUid());
      result = result && (getItemCount()
          == other.getItemCount());
      result = result && (getItemCountDelta()
          == other.getItemCountDelta());
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
      hash = (37 * hash) + ITEM_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getItemCount();
      hash = (37 * hash) + ITEM_COUNT_DELTA_FIELD_NUMBER;
      hash = (53 * hash) + getItemCountDelta();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgUserItemOuterClass.MsgUserItem parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserItemOuterClass.MsgUserItem parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserItemOuterClass.MsgUserItem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserItemOuterClass.MsgUserItem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserItemOuterClass.MsgUserItem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserItemOuterClass.MsgUserItem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserItemOuterClass.MsgUserItem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserItemOuterClass.MsgUserItem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserItemOuterClass.MsgUserItem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserItemOuterClass.MsgUserItem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserItemOuterClass.MsgUserItem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserItemOuterClass.MsgUserItem parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgUserItemOuterClass.MsgUserItem prototype) {
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
     * Protobuf type {@code msggamedata.MsgUserItem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgUserItem)
        com.felania.msldb.MsgUserItemOuterClass.MsgUserItemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgUserItemOuterClass.internal_static_msggamedata_MsgUserItem_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgUserItemOuterClass.internal_static_msggamedata_MsgUserItem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.class, com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.Builder.class);
      }

      // Construct using com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.newBuilder()
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

        itemCount_ = 0;

        itemCountDelta_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgUserItemOuterClass.internal_static_msggamedata_MsgUserItem_descriptor;
      }

      public com.felania.msldb.MsgUserItemOuterClass.MsgUserItem getDefaultInstanceForType() {
        return com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.getDefaultInstance();
      }

      public com.felania.msldb.MsgUserItemOuterClass.MsgUserItem build() {
        com.felania.msldb.MsgUserItemOuterClass.MsgUserItem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgUserItemOuterClass.MsgUserItem buildPartial() {
        com.felania.msldb.MsgUserItemOuterClass.MsgUserItem result = new com.felania.msldb.MsgUserItemOuterClass.MsgUserItem(this);
        result.itemUid_ = itemUid_;
        result.itemCount_ = itemCount_;
        result.itemCountDelta_ = itemCountDelta_;
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
        if (other instanceof com.felania.msldb.MsgUserItemOuterClass.MsgUserItem) {
          return mergeFrom((com.felania.msldb.MsgUserItemOuterClass.MsgUserItem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgUserItemOuterClass.MsgUserItem other) {
        if (other == com.felania.msldb.MsgUserItemOuterClass.MsgUserItem.getDefaultInstance()) return this;
        if (other.getItemUid() != 0) {
          setItemUid(other.getItemUid());
        }
        if (other.getItemCount() != 0) {
          setItemCount(other.getItemCount());
        }
        if (other.getItemCountDelta() != 0) {
          setItemCountDelta(other.getItemCountDelta());
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
        com.felania.msldb.MsgUserItemOuterClass.MsgUserItem parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgUserItemOuterClass.MsgUserItem) e.getUnfinishedMessage();
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

      private int itemCount_ ;
      /**
       * <code>uint32 item_count = 2;</code>
       */
      public int getItemCount() {
        return itemCount_;
      }
      /**
       * <code>uint32 item_count = 2;</code>
       */
      public Builder setItemCount(int value) {
        
        itemCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_count = 2;</code>
       */
      public Builder clearItemCount() {
        
        itemCount_ = 0;
        onChanged();
        return this;
      }

      private int itemCountDelta_ ;
      /**
       * <code>uint32 item_count_delta = 3;</code>
       */
      public int getItemCountDelta() {
        return itemCountDelta_;
      }
      /**
       * <code>uint32 item_count_delta = 3;</code>
       */
      public Builder setItemCountDelta(int value) {
        
        itemCountDelta_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_count_delta = 3;</code>
       */
      public Builder clearItemCountDelta() {
        
        itemCountDelta_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgUserItem)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgUserItem)
    private static final com.felania.msldb.MsgUserItemOuterClass.MsgUserItem DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgUserItemOuterClass.MsgUserItem();
    }

    public static com.felania.msldb.MsgUserItemOuterClass.MsgUserItem getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgUserItem>
        PARSER = new com.google.protobuf.AbstractParser<MsgUserItem>() {
      public MsgUserItem parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgUserItem(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgUserItem> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgUserItem> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgUserItemOuterClass.MsgUserItem getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgUserItem_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgUserItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MsgUserItem.proto\022\013msggamedata\"M\n\013MsgU" +
      "serItem\022\020\n\010item_uid\030\001 \001(\007\022\022\n\nitem_count\030" +
      "\002 \001(\r\022\030\n\020item_count_delta\030\003 \001(\rB\023\n\021com.f" +
      "elania.msldbb\006proto3"
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
    internal_static_msggamedata_MsgUserItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgUserItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgUserItem_descriptor,
        new java.lang.String[] { "ItemUid", "ItemCount", "ItemCountDelta", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
