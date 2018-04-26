// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspUserScout.proto

package com.felania.msldb;

public final class RspUserScoutOuterClass {
  private RspUserScoutOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspUserScoutOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspUserScout)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
     */
    boolean hasScoutData();
    /**
     * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
     */
    com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply getScoutData();
    /**
     * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
     */
    com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApplyOrBuilder getScoutDataOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.RspUserScout}
   */
  public  static final class RspUserScout extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspUserScout)
      RspUserScoutOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspUserScout.newBuilder() to construct.
    private RspUserScout(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspUserScout() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspUserScout(
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
              com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply.Builder subBuilder = null;
              if (scoutData_ != null) {
                subBuilder = scoutData_.toBuilder();
              }
              scoutData_ = input.readMessage(com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(scoutData_);
                scoutData_ = subBuilder.buildPartial();
              }

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
      return com.felania.msldb.RspUserScoutOuterClass.internal_static_msggamedata_RspUserScout_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspUserScoutOuterClass.internal_static_msggamedata_RspUserScout_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspUserScoutOuterClass.RspUserScout.class, com.felania.msldb.RspUserScoutOuterClass.RspUserScout.Builder.class);
    }

    public static final int SCOUT_DATA_FIELD_NUMBER = 1;
    private com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply scoutData_;
    /**
     * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
     */
    public boolean hasScoutData() {
      return scoutData_ != null;
    }
    /**
     * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
     */
    public com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply getScoutData() {
      return scoutData_ == null ? com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply.getDefaultInstance() : scoutData_;
    }
    /**
     * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
     */
    public com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApplyOrBuilder getScoutDataOrBuilder() {
      return getScoutData();
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
      if (scoutData_ != null) {
        output.writeMessage(1, getScoutData());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (scoutData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getScoutData());
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
      if (!(obj instanceof com.felania.msldb.RspUserScoutOuterClass.RspUserScout)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspUserScoutOuterClass.RspUserScout other = (com.felania.msldb.RspUserScoutOuterClass.RspUserScout) obj;

      boolean result = true;
      result = result && (hasScoutData() == other.hasScoutData());
      if (hasScoutData()) {
        result = result && getScoutData()
            .equals(other.getScoutData());
      }
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
      if (hasScoutData()) {
        hash = (37 * hash) + SCOUT_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getScoutData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspUserScoutOuterClass.RspUserScout parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspUserScoutOuterClass.RspUserScout parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspUserScoutOuterClass.RspUserScout parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspUserScoutOuterClass.RspUserScout parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspUserScoutOuterClass.RspUserScout parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspUserScoutOuterClass.RspUserScout parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspUserScoutOuterClass.RspUserScout parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspUserScoutOuterClass.RspUserScout parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspUserScoutOuterClass.RspUserScout parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspUserScoutOuterClass.RspUserScout parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspUserScoutOuterClass.RspUserScout parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspUserScoutOuterClass.RspUserScout parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspUserScoutOuterClass.RspUserScout prototype) {
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
     * Protobuf type {@code msggamedata.RspUserScout}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspUserScout)
        com.felania.msldb.RspUserScoutOuterClass.RspUserScoutOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspUserScoutOuterClass.internal_static_msggamedata_RspUserScout_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspUserScoutOuterClass.internal_static_msggamedata_RspUserScout_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspUserScoutOuterClass.RspUserScout.class, com.felania.msldb.RspUserScoutOuterClass.RspUserScout.Builder.class);
      }

      // Construct using com.felania.msldb.RspUserScoutOuterClass.RspUserScout.newBuilder()
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
        if (scoutDataBuilder_ == null) {
          scoutData_ = null;
        } else {
          scoutData_ = null;
          scoutDataBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspUserScoutOuterClass.internal_static_msggamedata_RspUserScout_descriptor;
      }

      public com.felania.msldb.RspUserScoutOuterClass.RspUserScout getDefaultInstanceForType() {
        return com.felania.msldb.RspUserScoutOuterClass.RspUserScout.getDefaultInstance();
      }

      public com.felania.msldb.RspUserScoutOuterClass.RspUserScout build() {
        com.felania.msldb.RspUserScoutOuterClass.RspUserScout result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspUserScoutOuterClass.RspUserScout buildPartial() {
        com.felania.msldb.RspUserScoutOuterClass.RspUserScout result = new com.felania.msldb.RspUserScoutOuterClass.RspUserScout(this);
        if (scoutDataBuilder_ == null) {
          result.scoutData_ = scoutData_;
        } else {
          result.scoutData_ = scoutDataBuilder_.build();
        }
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
        if (other instanceof com.felania.msldb.RspUserScoutOuterClass.RspUserScout) {
          return mergeFrom((com.felania.msldb.RspUserScoutOuterClass.RspUserScout)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspUserScoutOuterClass.RspUserScout other) {
        if (other == com.felania.msldb.RspUserScoutOuterClass.RspUserScout.getDefaultInstance()) return this;
        if (other.hasScoutData()) {
          mergeScoutData(other.getScoutData());
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
        com.felania.msldb.RspUserScoutOuterClass.RspUserScout parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspUserScoutOuterClass.RspUserScout) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply scoutData_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply, com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply.Builder, com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApplyOrBuilder> scoutDataBuilder_;
      /**
       * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
       */
      public boolean hasScoutData() {
        return scoutDataBuilder_ != null || scoutData_ != null;
      }
      /**
       * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
       */
      public com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply getScoutData() {
        if (scoutDataBuilder_ == null) {
          return scoutData_ == null ? com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply.getDefaultInstance() : scoutData_;
        } else {
          return scoutDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
       */
      public Builder setScoutData(com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply value) {
        if (scoutDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          scoutData_ = value;
          onChanged();
        } else {
          scoutDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
       */
      public Builder setScoutData(
          com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply.Builder builderForValue) {
        if (scoutDataBuilder_ == null) {
          scoutData_ = builderForValue.build();
          onChanged();
        } else {
          scoutDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
       */
      public Builder mergeScoutData(com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply value) {
        if (scoutDataBuilder_ == null) {
          if (scoutData_ != null) {
            scoutData_ =
              com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply.newBuilder(scoutData_).mergeFrom(value).buildPartial();
          } else {
            scoutData_ = value;
          }
          onChanged();
        } else {
          scoutDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
       */
      public Builder clearScoutData() {
        if (scoutDataBuilder_ == null) {
          scoutData_ = null;
          onChanged();
        } else {
          scoutData_ = null;
          scoutDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
       */
      public com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply.Builder getScoutDataBuilder() {
        
        onChanged();
        return getScoutDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
       */
      public com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApplyOrBuilder getScoutDataOrBuilder() {
        if (scoutDataBuilder_ != null) {
          return scoutDataBuilder_.getMessageOrBuilder();
        } else {
          return scoutData_ == null ?
              com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply.getDefaultInstance() : scoutData_;
        }
      }
      /**
       * <code>.msggamedata.MsgUserClanJoinApply scout_data = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply, com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply.Builder, com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApplyOrBuilder> 
          getScoutDataFieldBuilder() {
        if (scoutDataBuilder_ == null) {
          scoutDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply, com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApply.Builder, com.felania.msldb.MsgUserClanJoinApplyOuterClass.MsgUserClanJoinApplyOrBuilder>(
                  getScoutData(),
                  getParentForChildren(),
                  isClean());
          scoutData_ = null;
        }
        return scoutDataBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.RspUserScout)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspUserScout)
    private static final com.felania.msldb.RspUserScoutOuterClass.RspUserScout DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspUserScoutOuterClass.RspUserScout();
    }

    public static com.felania.msldb.RspUserScoutOuterClass.RspUserScout getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspUserScout>
        PARSER = new com.google.protobuf.AbstractParser<RspUserScout>() {
      public RspUserScout parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RspUserScout(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspUserScout> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspUserScout> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspUserScoutOuterClass.RspUserScout getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspUserScout_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspUserScout_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022RspUserScout.proto\022\013msggamedata\032\032MsgUs" +
      "erClanJoinApply.proto\"E\n\014RspUserScout\0225\n" +
      "\nscout_data\030\001 \001(\0132!.msggamedata.MsgUserC" +
      "lanJoinApplyB\023\n\021com.felania.msldbb\006proto" +
      "3"
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
          com.felania.msldb.MsgUserClanJoinApplyOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_RspUserScout_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspUserScout_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspUserScout_descriptor,
        new java.lang.String[] { "ScoutData", });
    com.felania.msldb.MsgUserClanJoinApplyOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
