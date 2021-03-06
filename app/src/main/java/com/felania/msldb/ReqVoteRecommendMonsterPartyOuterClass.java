// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqVoteRecommendMonsterParty.proto

package com.felania.msldb;

public final class ReqVoteRecommendMonsterPartyOuterClass {
  private ReqVoteRecommendMonsterPartyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqVoteRecommendMonsterPartyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqVoteRecommendMonsterParty)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 recommend_monster_party_id = 1;</code>
     */
    long getRecommendMonsterPartyId();
  }
  /**
   * Protobuf type {@code msggamedata.ReqVoteRecommendMonsterParty}
   */
  public  static final class ReqVoteRecommendMonsterParty extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqVoteRecommendMonsterParty)
      ReqVoteRecommendMonsterPartyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqVoteRecommendMonsterParty.newBuilder() to construct.
    private ReqVoteRecommendMonsterParty(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqVoteRecommendMonsterParty() {
      recommendMonsterPartyId_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqVoteRecommendMonsterParty(
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

              recommendMonsterPartyId_ = input.readUInt64();
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
      return com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.internal_static_msggamedata_ReqVoteRecommendMonsterParty_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.internal_static_msggamedata_ReqVoteRecommendMonsterParty_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty.class, com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty.Builder.class);
    }

    public static final int RECOMMEND_MONSTER_PARTY_ID_FIELD_NUMBER = 1;
    private long recommendMonsterPartyId_;
    /**
     * <code>uint64 recommend_monster_party_id = 1;</code>
     */
    public long getRecommendMonsterPartyId() {
      return recommendMonsterPartyId_;
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
      if (recommendMonsterPartyId_ != 0L) {
        output.writeUInt64(1, recommendMonsterPartyId_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (recommendMonsterPartyId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, recommendMonsterPartyId_);
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
      if (!(obj instanceof com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty other = (com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty) obj;

      boolean result = true;
      result = result && (getRecommendMonsterPartyId()
          == other.getRecommendMonsterPartyId());
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
      hash = (37 * hash) + RECOMMEND_MONSTER_PARTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRecommendMonsterPartyId());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty prototype) {
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
     * Protobuf type {@code msggamedata.ReqVoteRecommendMonsterParty}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqVoteRecommendMonsterParty)
        com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterPartyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.internal_static_msggamedata_ReqVoteRecommendMonsterParty_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.internal_static_msggamedata_ReqVoteRecommendMonsterParty_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty.class, com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty.Builder.class);
      }

      // Construct using com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty.newBuilder()
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
        recommendMonsterPartyId_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.internal_static_msggamedata_ReqVoteRecommendMonsterParty_descriptor;
      }

      public com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty getDefaultInstanceForType() {
        return com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty.getDefaultInstance();
      }

      public com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty build() {
        com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty buildPartial() {
        com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty result = new com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty(this);
        result.recommendMonsterPartyId_ = recommendMonsterPartyId_;
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
        if (other instanceof com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty) {
          return mergeFrom((com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty other) {
        if (other == com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty.getDefaultInstance()) return this;
        if (other.getRecommendMonsterPartyId() != 0L) {
          setRecommendMonsterPartyId(other.getRecommendMonsterPartyId());
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
        com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long recommendMonsterPartyId_ ;
      /**
       * <code>uint64 recommend_monster_party_id = 1;</code>
       */
      public long getRecommendMonsterPartyId() {
        return recommendMonsterPartyId_;
      }
      /**
       * <code>uint64 recommend_monster_party_id = 1;</code>
       */
      public Builder setRecommendMonsterPartyId(long value) {
        
        recommendMonsterPartyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 recommend_monster_party_id = 1;</code>
       */
      public Builder clearRecommendMonsterPartyId() {
        
        recommendMonsterPartyId_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqVoteRecommendMonsterParty)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqVoteRecommendMonsterParty)
    private static final com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty();
    }

    public static com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqVoteRecommendMonsterParty>
        PARSER = new com.google.protobuf.AbstractParser<ReqVoteRecommendMonsterParty>() {
      public ReqVoteRecommendMonsterParty parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqVoteRecommendMonsterParty(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqVoteRecommendMonsterParty> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqVoteRecommendMonsterParty> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqVoteRecommendMonsterPartyOuterClass.ReqVoteRecommendMonsterParty getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqVoteRecommendMonsterParty_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqVoteRecommendMonsterParty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"ReqVoteRecommendMonsterParty.proto\022\013ms" +
      "ggamedata\"B\n\034ReqVoteRecommendMonsterPart" +
      "y\022\"\n\032recommend_monster_party_id\030\001 \001(\004B\023\n" +
      "\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_ReqVoteRecommendMonsterParty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqVoteRecommendMonsterParty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqVoteRecommendMonsterParty_descriptor,
        new java.lang.String[] { "RecommendMonsterPartyId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
