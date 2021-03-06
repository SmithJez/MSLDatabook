// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqApplyClanWar.proto

package com.felania.msldb;

public final class ReqApplyClanWarOuterClass {
  private ReqApplyClanWarOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqApplyClanWarOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqApplyClanWar)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 stage_uid = 1;</code>
     */
    int getStageUid();
  }
  /**
   * Protobuf type {@code msggamedata.ReqApplyClanWar}
   */
  public  static final class ReqApplyClanWar extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqApplyClanWar)
      ReqApplyClanWarOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqApplyClanWar.newBuilder() to construct.
    private ReqApplyClanWar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqApplyClanWar() {
      stageUid_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqApplyClanWar(
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

              stageUid_ = input.readFixed32();
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
      return com.felania.msldb.ReqApplyClanWarOuterClass.internal_static_msggamedata_ReqApplyClanWar_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqApplyClanWarOuterClass.internal_static_msggamedata_ReqApplyClanWar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar.class, com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar.Builder.class);
    }

    public static final int STAGE_UID_FIELD_NUMBER = 1;
    private int stageUid_;
    /**
     * <code>fixed32 stage_uid = 1;</code>
     */
    public int getStageUid() {
      return stageUid_;
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
      if (stageUid_ != 0) {
        output.writeFixed32(1, stageUid_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, stageUid_);
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
      if (!(obj instanceof com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar other = (com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar) obj;

      boolean result = true;
      result = result && (getStageUid()
          == other.getStageUid());
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
      hash = (37 * hash) + STAGE_UID_FIELD_NUMBER;
      hash = (53 * hash) + getStageUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar prototype) {
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
     * Protobuf type {@code msggamedata.ReqApplyClanWar}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqApplyClanWar)
        com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWarOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqApplyClanWarOuterClass.internal_static_msggamedata_ReqApplyClanWar_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqApplyClanWarOuterClass.internal_static_msggamedata_ReqApplyClanWar_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar.class, com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar.Builder.class);
      }

      // Construct using com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar.newBuilder()
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
        stageUid_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqApplyClanWarOuterClass.internal_static_msggamedata_ReqApplyClanWar_descriptor;
      }

      public com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar getDefaultInstanceForType() {
        return com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar.getDefaultInstance();
      }

      public com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar build() {
        com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar buildPartial() {
        com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar result = new com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar(this);
        result.stageUid_ = stageUid_;
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
        if (other instanceof com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar) {
          return mergeFrom((com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar other) {
        if (other == com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar.getDefaultInstance()) return this;
        if (other.getStageUid() != 0) {
          setStageUid(other.getStageUid());
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
        com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int stageUid_ ;
      /**
       * <code>fixed32 stage_uid = 1;</code>
       */
      public int getStageUid() {
        return stageUid_;
      }
      /**
       * <code>fixed32 stage_uid = 1;</code>
       */
      public Builder setStageUid(int value) {
        
        stageUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 stage_uid = 1;</code>
       */
      public Builder clearStageUid() {
        
        stageUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqApplyClanWar)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqApplyClanWar)
    private static final com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar();
    }

    public static com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqApplyClanWar>
        PARSER = new com.google.protobuf.AbstractParser<ReqApplyClanWar>() {
      public ReqApplyClanWar parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqApplyClanWar(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqApplyClanWar> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqApplyClanWar> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqApplyClanWarOuterClass.ReqApplyClanWar getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqApplyClanWar_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqApplyClanWar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ReqApplyClanWar.proto\022\013msggamedata\"$\n\017" +
      "ReqApplyClanWar\022\021\n\tstage_uid\030\001 \001(\007B\023\n\021co" +
      "m.felania.msldbb\006proto3"
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
    internal_static_msggamedata_ReqApplyClanWar_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqApplyClanWar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqApplyClanWar_descriptor,
        new java.lang.String[] { "StageUid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
