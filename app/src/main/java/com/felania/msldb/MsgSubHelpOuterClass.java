// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgSubHelp.proto

package com.felania.msldb;

public final class MsgSubHelpOuterClass {
  private MsgSubHelpOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgSubHelpOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgSubHelp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>fixed32 help_uid = 2;</code>
     */
    int getHelpUid();

    /**
     * <code>fixed32 title = 3;</code>
     */
    int getTitle();

    /**
     * <code>fixed32 desc = 4;</code>
     */
    int getDesc();
  }
  /**
   * Protobuf type {@code msggamedata.MsgSubHelp}
   */
  public  static final class MsgSubHelp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgSubHelp)
      MsgSubHelpOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgSubHelp.newBuilder() to construct.
    private MsgSubHelp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgSubHelp() {
      uid_ = 0;
      helpUid_ = 0;
      title_ = 0;
      desc_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgSubHelp(
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

              helpUid_ = input.readFixed32();
              break;
            }
            case 29: {

              title_ = input.readFixed32();
              break;
            }
            case 37: {

              desc_ = input.readFixed32();
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
      return com.felania.msldb.MsgSubHelpOuterClass.internal_static_msggamedata_MsgSubHelp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgSubHelpOuterClass.internal_static_msggamedata_MsgSubHelp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp.class, com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>fixed32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int HELP_UID_FIELD_NUMBER = 2;
    private int helpUid_;
    /**
     * <code>fixed32 help_uid = 2;</code>
     */
    public int getHelpUid() {
      return helpUid_;
    }

    public static final int TITLE_FIELD_NUMBER = 3;
    private int title_;
    /**
     * <code>fixed32 title = 3;</code>
     */
    public int getTitle() {
      return title_;
    }

    public static final int DESC_FIELD_NUMBER = 4;
    private int desc_;
    /**
     * <code>fixed32 desc = 4;</code>
     */
    public int getDesc() {
      return desc_;
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
      if (helpUid_ != 0) {
        output.writeFixed32(2, helpUid_);
      }
      if (title_ != 0) {
        output.writeFixed32(3, title_);
      }
      if (desc_ != 0) {
        output.writeFixed32(4, desc_);
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
      if (helpUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(2, helpUid_);
      }
      if (title_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(3, title_);
      }
      if (desc_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(4, desc_);
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
      if (!(obj instanceof com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp other = (com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp) obj;

      boolean result = true;
      result = result && (getUid()
          == other.getUid());
      result = result && (getHelpUid()
          == other.getHelpUid());
      result = result && (getTitle()
          == other.getTitle());
      result = result && (getDesc()
          == other.getDesc());
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
      hash = (37 * hash) + HELP_UID_FIELD_NUMBER;
      hash = (53 * hash) + getHelpUid();
      hash = (37 * hash) + TITLE_FIELD_NUMBER;
      hash = (53 * hash) + getTitle();
      hash = (37 * hash) + DESC_FIELD_NUMBER;
      hash = (53 * hash) + getDesc();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp prototype) {
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
     * Protobuf type {@code msggamedata.MsgSubHelp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgSubHelp)
        com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelpOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgSubHelpOuterClass.internal_static_msggamedata_MsgSubHelp_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgSubHelpOuterClass.internal_static_msggamedata_MsgSubHelp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp.class, com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp.Builder.class);
      }

      // Construct using com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp.newBuilder()
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

        helpUid_ = 0;

        title_ = 0;

        desc_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgSubHelpOuterClass.internal_static_msggamedata_MsgSubHelp_descriptor;
      }

      public com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp getDefaultInstanceForType() {
        return com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp.getDefaultInstance();
      }

      public com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp build() {
        com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp buildPartial() {
        com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp result = new com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp(this);
        result.uid_ = uid_;
        result.helpUid_ = helpUid_;
        result.title_ = title_;
        result.desc_ = desc_;
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
        if (other instanceof com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp) {
          return mergeFrom((com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp other) {
        if (other == com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getHelpUid() != 0) {
          setHelpUid(other.getHelpUid());
        }
        if (other.getTitle() != 0) {
          setTitle(other.getTitle());
        }
        if (other.getDesc() != 0) {
          setDesc(other.getDesc());
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
        com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp) e.getUnfinishedMessage();
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

      private int helpUid_ ;
      /**
       * <code>fixed32 help_uid = 2;</code>
       */
      public int getHelpUid() {
        return helpUid_;
      }
      /**
       * <code>fixed32 help_uid = 2;</code>
       */
      public Builder setHelpUid(int value) {
        
        helpUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 help_uid = 2;</code>
       */
      public Builder clearHelpUid() {
        
        helpUid_ = 0;
        onChanged();
        return this;
      }

      private int title_ ;
      /**
       * <code>fixed32 title = 3;</code>
       */
      public int getTitle() {
        return title_;
      }
      /**
       * <code>fixed32 title = 3;</code>
       */
      public Builder setTitle(int value) {
        
        title_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 title = 3;</code>
       */
      public Builder clearTitle() {
        
        title_ = 0;
        onChanged();
        return this;
      }

      private int desc_ ;
      /**
       * <code>fixed32 desc = 4;</code>
       */
      public int getDesc() {
        return desc_;
      }
      /**
       * <code>fixed32 desc = 4;</code>
       */
      public Builder setDesc(int value) {
        
        desc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 desc = 4;</code>
       */
      public Builder clearDesc() {
        
        desc_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgSubHelp)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgSubHelp)
    private static final com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp();
    }

    public static com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgSubHelp>
        PARSER = new com.google.protobuf.AbstractParser<MsgSubHelp>() {
      public MsgSubHelp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgSubHelp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgSubHelp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgSubHelp> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgSubHelpOuterClass.MsgSubHelp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgSubHelp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgSubHelp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020MsgSubHelp.proto\022\013msggamedata\"H\n\nMsgSu" +
      "bHelp\022\013\n\003uid\030\001 \001(\007\022\020\n\010help_uid\030\002 \001(\007\022\r\n\005" +
      "title\030\003 \001(\007\022\014\n\004desc\030\004 \001(\007B\023\n\021com.felania" +
      ".msldbb\006proto3"
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
    internal_static_msggamedata_MsgSubHelp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgSubHelp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgSubHelp_descriptor,
        new java.lang.String[] { "Uid", "HelpUid", "Title", "Desc", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
