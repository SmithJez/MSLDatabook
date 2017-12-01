// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqChangeHelloMessage.proto

package com.felania.msldb;

public final class ReqChangeHelloMessageOuterClass {
  private ReqChangeHelloMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqChangeHelloMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqChangeHelloMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string msg = 1;</code>
     */
    java.lang.String getMsg();
    /**
     * <code>string msg = 1;</code>
     */
    com.google.protobuf.ByteString
        getMsgBytes();
  }
  /**
   * Protobuf type {@code msggamedata.ReqChangeHelloMessage}
   */
  public  static final class ReqChangeHelloMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqChangeHelloMessage)
      ReqChangeHelloMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqChangeHelloMessage.newBuilder() to construct.
    private ReqChangeHelloMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqChangeHelloMessage() {
      msg_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqChangeHelloMessage(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              msg_ = s;
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
      return com.felania.msldb.ReqChangeHelloMessageOuterClass.internal_static_msggamedata_ReqChangeHelloMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqChangeHelloMessageOuterClass.internal_static_msggamedata_ReqChangeHelloMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage.class, com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage.Builder.class);
    }

    public static final int MSG_FIELD_NUMBER = 1;
    private volatile java.lang.Object msg_;
    /**
     * <code>string msg = 1;</code>
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      }
    }
    /**
     * <code>string msg = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
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
      if (!getMsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, msg_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getMsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, msg_);
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
      if (!(obj instanceof com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage other = (com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage) obj;

      boolean result = true;
      result = result && getMsg()
          .equals(other.getMsg());
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
      hash = (37 * hash) + MSG_FIELD_NUMBER;
      hash = (53 * hash) + getMsg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage prototype) {
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
     * Protobuf type {@code msggamedata.ReqChangeHelloMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqChangeHelloMessage)
        com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqChangeHelloMessageOuterClass.internal_static_msggamedata_ReqChangeHelloMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqChangeHelloMessageOuterClass.internal_static_msggamedata_ReqChangeHelloMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage.class, com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage.Builder.class);
      }

      // Construct using com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage.newBuilder()
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
        msg_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqChangeHelloMessageOuterClass.internal_static_msggamedata_ReqChangeHelloMessage_descriptor;
      }

      public com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage getDefaultInstanceForType() {
        return com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage.getDefaultInstance();
      }

      public com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage build() {
        com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage buildPartial() {
        com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage result = new com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage(this);
        result.msg_ = msg_;
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
        if (other instanceof com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage) {
          return mergeFrom((com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage other) {
        if (other == com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage.getDefaultInstance()) return this;
        if (!other.getMsg().isEmpty()) {
          msg_ = other.msg_;
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
        com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object msg_ = "";
      /**
       * <code>string msg = 1;</code>
       */
      public java.lang.String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          msg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string msg = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        java.lang.Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string msg = 1;</code>
       */
      public Builder setMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        msg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string msg = 1;</code>
       */
      public Builder clearMsg() {
        
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      /**
       * <code>string msg = 1;</code>
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        msg_ = value;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqChangeHelloMessage)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqChangeHelloMessage)
    private static final com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage();
    }

    public static com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqChangeHelloMessage>
        PARSER = new com.google.protobuf.AbstractParser<ReqChangeHelloMessage>() {
      public ReqChangeHelloMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReqChangeHelloMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqChangeHelloMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqChangeHelloMessage> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqChangeHelloMessageOuterClass.ReqChangeHelloMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqChangeHelloMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqChangeHelloMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ReqChangeHelloMessage.proto\022\013msggameda" +
      "ta\"$\n\025ReqChangeHelloMessage\022\013\n\003msg\030\001 \001(\t" +
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
    internal_static_msggamedata_ReqChangeHelloMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqChangeHelloMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqChangeHelloMessage_descriptor,
        new java.lang.String[] { "Msg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
