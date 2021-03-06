// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqGetCVCHistory.proto

package com.felania.msldb;

public final class ReqGetCVCHistoryOuterClass {
  private ReqGetCVCHistoryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqGetCVCHistoryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqGetCVCHistory)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.CVCHistoryType history_type = 1;</code>
     */
    int getHistoryTypeValue();
    /**
     * <code>.msggamedata.CVCHistoryType history_type = 1;</code>
     */
    com.felania.msldb.CVCHistoryTypeOuterClass.CVCHistoryType getHistoryType();
  }
  /**
   * Protobuf type {@code msggamedata.ReqGetCVCHistory}
   */
  public  static final class ReqGetCVCHistory extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqGetCVCHistory)
      ReqGetCVCHistoryOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqGetCVCHistory.newBuilder() to construct.
    private ReqGetCVCHistory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqGetCVCHistory() {
      historyType_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqGetCVCHistory(
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
            case 8: {
              int rawValue = input.readEnum();

              historyType_ = rawValue;
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
      return com.felania.msldb.ReqGetCVCHistoryOuterClass.internal_static_msggamedata_ReqGetCVCHistory_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqGetCVCHistoryOuterClass.internal_static_msggamedata_ReqGetCVCHistory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory.class, com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory.Builder.class);
    }

    public static final int HISTORY_TYPE_FIELD_NUMBER = 1;
    private int historyType_;
    /**
     * <code>.msggamedata.CVCHistoryType history_type = 1;</code>
     */
    public int getHistoryTypeValue() {
      return historyType_;
    }
    /**
     * <code>.msggamedata.CVCHistoryType history_type = 1;</code>
     */
    public com.felania.msldb.CVCHistoryTypeOuterClass.CVCHistoryType getHistoryType() {
      com.felania.msldb.CVCHistoryTypeOuterClass.CVCHistoryType result = com.felania.msldb.CVCHistoryTypeOuterClass.CVCHistoryType.valueOf(historyType_);
      return result == null ? com.felania.msldb.CVCHistoryTypeOuterClass.CVCHistoryType.UNRECOGNIZED : result;
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
      if (historyType_ != com.felania.msldb.CVCHistoryTypeOuterClass.CVCHistoryType.CHT_Attack.getNumber()) {
        output.writeEnum(1, historyType_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (historyType_ != com.felania.msldb.CVCHistoryTypeOuterClass.CVCHistoryType.CHT_Attack.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, historyType_);
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
      if (!(obj instanceof com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory other = (com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory) obj;

      boolean result = true;
      result = result && historyType_ == other.historyType_;
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
      hash = (37 * hash) + HISTORY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + historyType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory prototype) {
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
     * Protobuf type {@code msggamedata.ReqGetCVCHistory}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqGetCVCHistory)
        com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistoryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqGetCVCHistoryOuterClass.internal_static_msggamedata_ReqGetCVCHistory_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqGetCVCHistoryOuterClass.internal_static_msggamedata_ReqGetCVCHistory_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory.class, com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory.Builder.class);
      }

      // Construct using com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory.newBuilder()
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
        historyType_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqGetCVCHistoryOuterClass.internal_static_msggamedata_ReqGetCVCHistory_descriptor;
      }

      public com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory getDefaultInstanceForType() {
        return com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory.getDefaultInstance();
      }

      public com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory build() {
        com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory buildPartial() {
        com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory result = new com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory(this);
        result.historyType_ = historyType_;
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
        if (other instanceof com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory) {
          return mergeFrom((com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory other) {
        if (other == com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory.getDefaultInstance()) return this;
        if (other.historyType_ != 0) {
          setHistoryTypeValue(other.getHistoryTypeValue());
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
        com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int historyType_ = 0;
      /**
       * <code>.msggamedata.CVCHistoryType history_type = 1;</code>
       */
      public int getHistoryTypeValue() {
        return historyType_;
      }
      /**
       * <code>.msggamedata.CVCHistoryType history_type = 1;</code>
       */
      public Builder setHistoryTypeValue(int value) {
        historyType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.CVCHistoryType history_type = 1;</code>
       */
      public com.felania.msldb.CVCHistoryTypeOuterClass.CVCHistoryType getHistoryType() {
        com.felania.msldb.CVCHistoryTypeOuterClass.CVCHistoryType result = com.felania.msldb.CVCHistoryTypeOuterClass.CVCHistoryType.valueOf(historyType_);
        return result == null ? com.felania.msldb.CVCHistoryTypeOuterClass.CVCHistoryType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.CVCHistoryType history_type = 1;</code>
       */
      public Builder setHistoryType(com.felania.msldb.CVCHistoryTypeOuterClass.CVCHistoryType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        historyType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.CVCHistoryType history_type = 1;</code>
       */
      public Builder clearHistoryType() {
        
        historyType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqGetCVCHistory)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqGetCVCHistory)
    private static final com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory();
    }

    public static com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqGetCVCHistory>
        PARSER = new com.google.protobuf.AbstractParser<ReqGetCVCHistory>() {
      public ReqGetCVCHistory parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqGetCVCHistory(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqGetCVCHistory> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqGetCVCHistory> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqGetCVCHistoryOuterClass.ReqGetCVCHistory getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqGetCVCHistory_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqGetCVCHistory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ReqGetCVCHistory.proto\022\013msggamedata\032\024C" +
      "VCHistoryType.proto\"E\n\020ReqGetCVCHistory\022" +
      "1\n\014history_type\030\001 \001(\0162\033.msggamedata.CVCH" +
      "istoryTypeB\023\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.CVCHistoryTypeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_ReqGetCVCHistory_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqGetCVCHistory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqGetCVCHistory_descriptor,
        new java.lang.String[] { "HistoryType", });
    com.felania.msldb.CVCHistoryTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
