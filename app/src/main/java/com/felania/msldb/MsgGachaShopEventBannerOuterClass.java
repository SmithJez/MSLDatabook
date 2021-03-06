// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgGachaShopEventBanner.proto

package com.felania.msldb;

public final class MsgGachaShopEventBannerOuterClass {
  private MsgGachaShopEventBannerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgGachaShopEventBannerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgGachaShopEventBanner)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>uint32 index = 2;</code>
     */
    int getIndex();

    /**
     * <code>fixed32 event_title = 3;</code>
     */
    int getEventTitle();
  }
  /**
   * Protobuf type {@code msggamedata.MsgGachaShopEventBanner}
   */
  public  static final class MsgGachaShopEventBanner extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgGachaShopEventBanner)
      MsgGachaShopEventBannerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgGachaShopEventBanner.newBuilder() to construct.
    private MsgGachaShopEventBanner(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgGachaShopEventBanner() {
      uid_ = 0;
      index_ = 0;
      eventTitle_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgGachaShopEventBanner(
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
            case 16: {

              index_ = input.readUInt32();
              break;
            }
            case 29: {

              eventTitle_ = input.readFixed32();
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
      return com.felania.msldb.MsgGachaShopEventBannerOuterClass.internal_static_msggamedata_MsgGachaShopEventBanner_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgGachaShopEventBannerOuterClass.internal_static_msggamedata_MsgGachaShopEventBanner_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner.class, com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>fixed32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int INDEX_FIELD_NUMBER = 2;
    private int index_;
    /**
     * <code>uint32 index = 2;</code>
     */
    public int getIndex() {
      return index_;
    }

    public static final int EVENT_TITLE_FIELD_NUMBER = 3;
    private int eventTitle_;
    /**
     * <code>fixed32 event_title = 3;</code>
     */
    public int getEventTitle() {
      return eventTitle_;
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
      if (index_ != 0) {
        output.writeUInt32(2, index_);
      }
      if (eventTitle_ != 0) {
        output.writeFixed32(3, eventTitle_);
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
      if (index_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, index_);
      }
      if (eventTitle_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(3, eventTitle_);
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
      if (!(obj instanceof com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner other = (com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner) obj;

      boolean result = true;
      result = result && (getUid()
          == other.getUid());
      result = result && (getIndex()
          == other.getIndex());
      result = result && (getEventTitle()
          == other.getEventTitle());
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
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex();
      hash = (37 * hash) + EVENT_TITLE_FIELD_NUMBER;
      hash = (53 * hash) + getEventTitle();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner prototype) {
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
     * Protobuf type {@code msggamedata.MsgGachaShopEventBanner}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgGachaShopEventBanner)
        com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBannerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgGachaShopEventBannerOuterClass.internal_static_msggamedata_MsgGachaShopEventBanner_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgGachaShopEventBannerOuterClass.internal_static_msggamedata_MsgGachaShopEventBanner_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner.class, com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner.Builder.class);
      }

      // Construct using com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner.newBuilder()
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

        index_ = 0;

        eventTitle_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgGachaShopEventBannerOuterClass.internal_static_msggamedata_MsgGachaShopEventBanner_descriptor;
      }

      public com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner getDefaultInstanceForType() {
        return com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner.getDefaultInstance();
      }

      public com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner build() {
        com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner buildPartial() {
        com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner result = new com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner(this);
        result.uid_ = uid_;
        result.index_ = index_;
        result.eventTitle_ = eventTitle_;
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
        if (other instanceof com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner) {
          return mergeFrom((com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner other) {
        if (other == com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getIndex() != 0) {
          setIndex(other.getIndex());
        }
        if (other.getEventTitle() != 0) {
          setEventTitle(other.getEventTitle());
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
        com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner) e.getUnfinishedMessage();
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

      private int index_ ;
      /**
       * <code>uint32 index = 2;</code>
       */
      public int getIndex() {
        return index_;
      }
      /**
       * <code>uint32 index = 2;</code>
       */
      public Builder setIndex(int value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 index = 2;</code>
       */
      public Builder clearIndex() {
        
        index_ = 0;
        onChanged();
        return this;
      }

      private int eventTitle_ ;
      /**
       * <code>fixed32 event_title = 3;</code>
       */
      public int getEventTitle() {
        return eventTitle_;
      }
      /**
       * <code>fixed32 event_title = 3;</code>
       */
      public Builder setEventTitle(int value) {
        
        eventTitle_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 event_title = 3;</code>
       */
      public Builder clearEventTitle() {
        
        eventTitle_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgGachaShopEventBanner)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgGachaShopEventBanner)
    private static final com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner();
    }

    public static com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgGachaShopEventBanner>
        PARSER = new com.google.protobuf.AbstractParser<MsgGachaShopEventBanner>() {
      public MsgGachaShopEventBanner parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgGachaShopEventBanner(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgGachaShopEventBanner> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgGachaShopEventBanner> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgGachaShopEventBannerOuterClass.MsgGachaShopEventBanner getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgGachaShopEventBanner_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgGachaShopEventBanner_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035MsgGachaShopEventBanner.proto\022\013msggame" +
      "data\"J\n\027MsgGachaShopEventBanner\022\013\n\003uid\030\001" +
      " \001(\007\022\r\n\005index\030\002 \001(\r\022\023\n\013event_title\030\003 \001(\007" +
      "B\023\n\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_MsgGachaShopEventBanner_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgGachaShopEventBanner_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgGachaShopEventBanner_descriptor,
        new java.lang.String[] { "Uid", "Index", "EventTitle", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
