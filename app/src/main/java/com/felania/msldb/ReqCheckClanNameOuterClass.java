// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqCheckClanName.proto

package com.felania.msldb;

public final class ReqCheckClanNameOuterClass {
  private ReqCheckClanNameOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqCheckClanNameOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqCheckClanName)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string clan_name = 1;</code>
     */
    java.lang.String getClanName();
    /**
     * <code>string clan_name = 1;</code>
     */
    com.google.protobuf.ByteString
        getClanNameBytes();
  }
  /**
   * Protobuf type {@code msggamedata.ReqCheckClanName}
   */
  public  static final class ReqCheckClanName extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqCheckClanName)
      ReqCheckClanNameOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqCheckClanName.newBuilder() to construct.
    private ReqCheckClanName(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqCheckClanName() {
      clanName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqCheckClanName(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              clanName_ = s;
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
      return com.felania.msldb.ReqCheckClanNameOuterClass.internal_static_msggamedata_ReqCheckClanName_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqCheckClanNameOuterClass.internal_static_msggamedata_ReqCheckClanName_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName.class, com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName.Builder.class);
    }

    public static final int CLAN_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object clanName_;
    /**
     * <code>string clan_name = 1;</code>
     */
    public java.lang.String getClanName() {
      java.lang.Object ref = clanName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clanName_ = s;
        return s;
      }
    }
    /**
     * <code>string clan_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClanNameBytes() {
      java.lang.Object ref = clanName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clanName_ = b;
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
      if (!getClanNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clanName_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getClanNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clanName_);
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
      if (!(obj instanceof com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName other = (com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName) obj;

      boolean result = true;
      result = result && getClanName()
          .equals(other.getClanName());
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
      hash = (37 * hash) + CLAN_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getClanName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName prototype) {
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
     * Protobuf type {@code msggamedata.ReqCheckClanName}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqCheckClanName)
        com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanNameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqCheckClanNameOuterClass.internal_static_msggamedata_ReqCheckClanName_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqCheckClanNameOuterClass.internal_static_msggamedata_ReqCheckClanName_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName.class, com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName.Builder.class);
      }

      // Construct using com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName.newBuilder()
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
        clanName_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqCheckClanNameOuterClass.internal_static_msggamedata_ReqCheckClanName_descriptor;
      }

      public com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName getDefaultInstanceForType() {
        return com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName.getDefaultInstance();
      }

      public com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName build() {
        com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName buildPartial() {
        com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName result = new com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName(this);
        result.clanName_ = clanName_;
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
        if (other instanceof com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName) {
          return mergeFrom((com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName other) {
        if (other == com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName.getDefaultInstance()) return this;
        if (!other.getClanName().isEmpty()) {
          clanName_ = other.clanName_;
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
        com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object clanName_ = "";
      /**
       * <code>string clan_name = 1;</code>
       */
      public java.lang.String getClanName() {
        java.lang.Object ref = clanName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          clanName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string clan_name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getClanNameBytes() {
        java.lang.Object ref = clanName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clanName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string clan_name = 1;</code>
       */
      public Builder setClanName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        clanName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string clan_name = 1;</code>
       */
      public Builder clearClanName() {
        
        clanName_ = getDefaultInstance().getClanName();
        onChanged();
        return this;
      }
      /**
       * <code>string clan_name = 1;</code>
       */
      public Builder setClanNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        clanName_ = value;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqCheckClanName)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqCheckClanName)
    private static final com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName();
    }

    public static com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqCheckClanName>
        PARSER = new com.google.protobuf.AbstractParser<ReqCheckClanName>() {
      public ReqCheckClanName parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqCheckClanName(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqCheckClanName> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqCheckClanName> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqCheckClanNameOuterClass.ReqCheckClanName getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqCheckClanName_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqCheckClanName_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ReqCheckClanName.proto\022\013msggamedata\"%\n" +
      "\020ReqCheckClanName\022\021\n\tclan_name\030\001 \001(\tB\023\n\021" +
      "com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_ReqCheckClanName_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqCheckClanName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqCheckClanName_descriptor,
        new java.lang.String[] { "ClanName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
