// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqArenaDefenseBattleHistories.proto

package com.felania.msldb;

public final class ReqArenaDefenseBattleHistoriesOuterClass {
  private ReqArenaDefenseBattleHistoriesOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqArenaDefenseBattleHistoriesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqArenaDefenseBattleHistories)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code msggamedata.ReqArenaDefenseBattleHistories}
   */
  public  static final class ReqArenaDefenseBattleHistories extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqArenaDefenseBattleHistories)
      ReqArenaDefenseBattleHistoriesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqArenaDefenseBattleHistories.newBuilder() to construct.
    private ReqArenaDefenseBattleHistories(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqArenaDefenseBattleHistories() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqArenaDefenseBattleHistories(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
      return com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.internal_static_msggamedata_ReqArenaDefenseBattleHistories_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.internal_static_msggamedata_ReqArenaDefenseBattleHistories_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories.class, com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories.Builder.class);
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
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories other = (com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories) obj;

      boolean result = true;
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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories prototype) {
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
     * Protobuf type {@code msggamedata.ReqArenaDefenseBattleHistories}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqArenaDefenseBattleHistories)
        com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistoriesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.internal_static_msggamedata_ReqArenaDefenseBattleHistories_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.internal_static_msggamedata_ReqArenaDefenseBattleHistories_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories.class, com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories.Builder.class);
      }

      // Construct using com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories.newBuilder()
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
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.internal_static_msggamedata_ReqArenaDefenseBattleHistories_descriptor;
      }

      public com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories getDefaultInstanceForType() {
        return com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories.getDefaultInstance();
      }

      public com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories build() {
        com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories buildPartial() {
        com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories result = new com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories(this);
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
        if (other instanceof com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories) {
          return mergeFrom((com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories other) {
        if (other == com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories.getDefaultInstance()) return this;
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
        com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqArenaDefenseBattleHistories)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqArenaDefenseBattleHistories)
    private static final com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories();
    }

    public static com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqArenaDefenseBattleHistories>
        PARSER = new com.google.protobuf.AbstractParser<ReqArenaDefenseBattleHistories>() {
      public ReqArenaDefenseBattleHistories parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReqArenaDefenseBattleHistories(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqArenaDefenseBattleHistories> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqArenaDefenseBattleHistories> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqArenaDefenseBattleHistoriesOuterClass.ReqArenaDefenseBattleHistories getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqArenaDefenseBattleHistories_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqArenaDefenseBattleHistories_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$ReqArenaDefenseBattleHistories.proto\022\013" +
      "msggamedata\" \n\036ReqArenaDefenseBattleHist" +
      "oriesB\023\n\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_ReqArenaDefenseBattleHistories_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqArenaDefenseBattleHistories_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqArenaDefenseBattleHistories_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
