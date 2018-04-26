// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqChangeClanFestivalMessage.proto

package com.felania.msldb;

public final class ReqChangeClanFestivalMessageOuterClass {
  private ReqChangeClanFestivalMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqChangeClanFestivalMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqChangeClanFestivalMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string clan_festival_message = 1;</code>
     */
    java.lang.String getClanFestivalMessage();
    /**
     * <code>string clan_festival_message = 1;</code>
     */
    com.google.protobuf.ByteString
        getClanFestivalMessageBytes();
  }
  /**
   * Protobuf type {@code msggamedata.ReqChangeClanFestivalMessage}
   */
  public  static final class ReqChangeClanFestivalMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqChangeClanFestivalMessage)
      ReqChangeClanFestivalMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqChangeClanFestivalMessage.newBuilder() to construct.
    private ReqChangeClanFestivalMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqChangeClanFestivalMessage() {
      clanFestivalMessage_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqChangeClanFestivalMessage(
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

              clanFestivalMessage_ = s;
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
      return com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.internal_static_msggamedata_ReqChangeClanFestivalMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.internal_static_msggamedata_ReqChangeClanFestivalMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage.class, com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage.Builder.class);
    }

    public static final int CLAN_FESTIVAL_MESSAGE_FIELD_NUMBER = 1;
    private volatile java.lang.Object clanFestivalMessage_;
    /**
     * <code>string clan_festival_message = 1;</code>
     */
    public java.lang.String getClanFestivalMessage() {
      java.lang.Object ref = clanFestivalMessage_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clanFestivalMessage_ = s;
        return s;
      }
    }
    /**
     * <code>string clan_festival_message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClanFestivalMessageBytes() {
      java.lang.Object ref = clanFestivalMessage_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clanFestivalMessage_ = b;
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
      if (!getClanFestivalMessageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clanFestivalMessage_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getClanFestivalMessageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clanFestivalMessage_);
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
      if (!(obj instanceof com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage other = (com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage) obj;

      boolean result = true;
      result = result && getClanFestivalMessage()
          .equals(other.getClanFestivalMessage());
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
      hash = (37 * hash) + CLAN_FESTIVAL_MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getClanFestivalMessage().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage prototype) {
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
     * Protobuf type {@code msggamedata.ReqChangeClanFestivalMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqChangeClanFestivalMessage)
        com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.internal_static_msggamedata_ReqChangeClanFestivalMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.internal_static_msggamedata_ReqChangeClanFestivalMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage.class, com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage.Builder.class);
      }

      // Construct using com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage.newBuilder()
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
        clanFestivalMessage_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.internal_static_msggamedata_ReqChangeClanFestivalMessage_descriptor;
      }

      public com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage getDefaultInstanceForType() {
        return com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage.getDefaultInstance();
      }

      public com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage build() {
        com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage buildPartial() {
        com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage result = new com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage(this);
        result.clanFestivalMessage_ = clanFestivalMessage_;
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
        if (other instanceof com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage) {
          return mergeFrom((com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage other) {
        if (other == com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage.getDefaultInstance()) return this;
        if (!other.getClanFestivalMessage().isEmpty()) {
          clanFestivalMessage_ = other.clanFestivalMessage_;
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
        com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object clanFestivalMessage_ = "";
      /**
       * <code>string clan_festival_message = 1;</code>
       */
      public java.lang.String getClanFestivalMessage() {
        java.lang.Object ref = clanFestivalMessage_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          clanFestivalMessage_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string clan_festival_message = 1;</code>
       */
      public com.google.protobuf.ByteString
          getClanFestivalMessageBytes() {
        java.lang.Object ref = clanFestivalMessage_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clanFestivalMessage_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string clan_festival_message = 1;</code>
       */
      public Builder setClanFestivalMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        clanFestivalMessage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string clan_festival_message = 1;</code>
       */
      public Builder clearClanFestivalMessage() {
        
        clanFestivalMessage_ = getDefaultInstance().getClanFestivalMessage();
        onChanged();
        return this;
      }
      /**
       * <code>string clan_festival_message = 1;</code>
       */
      public Builder setClanFestivalMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        clanFestivalMessage_ = value;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqChangeClanFestivalMessage)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqChangeClanFestivalMessage)
    private static final com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage();
    }

    public static com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqChangeClanFestivalMessage>
        PARSER = new com.google.protobuf.AbstractParser<ReqChangeClanFestivalMessage>() {
      public ReqChangeClanFestivalMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqChangeClanFestivalMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqChangeClanFestivalMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqChangeClanFestivalMessage> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqChangeClanFestivalMessageOuterClass.ReqChangeClanFestivalMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqChangeClanFestivalMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqChangeClanFestivalMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"ReqChangeClanFestivalMessage.proto\022\013ms" +
      "ggamedata\"=\n\034ReqChangeClanFestivalMessag" +
      "e\022\035\n\025clan_festival_message\030\001 \001(\tB\023\n\021com." +
      "felania.msldbb\006proto3"
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
    internal_static_msggamedata_ReqChangeClanFestivalMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqChangeClanFestivalMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqChangeClanFestivalMessage_descriptor,
        new java.lang.String[] { "ClanFestivalMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
