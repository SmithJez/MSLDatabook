// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqWarmUpMonsterEvolution.proto

package com.felania.msldb;

public final class ReqWarmUpMonsterEvolutionOuterClass {
  private ReqWarmUpMonsterEvolutionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqWarmUpMonsterEvolutionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqWarmUpMonsterEvolution)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 base_user_monster_id = 1;</code>
     */
    long getBaseUserMonsterId();

    /**
     * <code>repeated uint64 material_user_monster_ids = 2;</code>
     */
    java.util.List<java.lang.Long> getMaterialUserMonsterIdsList();
    /**
     * <code>repeated uint64 material_user_monster_ids = 2;</code>
     */
    int getMaterialUserMonsterIdsCount();
    /**
     * <code>repeated uint64 material_user_monster_ids = 2;</code>
     */
    long getMaterialUserMonsterIds(int index);
  }
  /**
   * Protobuf type {@code msggamedata.ReqWarmUpMonsterEvolution}
   */
  public  static final class ReqWarmUpMonsterEvolution extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqWarmUpMonsterEvolution)
      ReqWarmUpMonsterEvolutionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqWarmUpMonsterEvolution.newBuilder() to construct.
    private ReqWarmUpMonsterEvolution(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqWarmUpMonsterEvolution() {
      baseUserMonsterId_ = 0L;
      materialUserMonsterIds_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqWarmUpMonsterEvolution(
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

              baseUserMonsterId_ = input.readUInt64();
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                materialUserMonsterIds_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000002;
              }
              materialUserMonsterIds_.add(input.readUInt64());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                materialUserMonsterIds_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                materialUserMonsterIds_.add(input.readUInt64());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          materialUserMonsterIds_ = java.util.Collections.unmodifiableList(materialUserMonsterIds_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.internal_static_msggamedata_ReqWarmUpMonsterEvolution_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.internal_static_msggamedata_ReqWarmUpMonsterEvolution_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution.class, com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution.Builder.class);
    }

    private int bitField0_;
    public static final int BASE_USER_MONSTER_ID_FIELD_NUMBER = 1;
    private long baseUserMonsterId_;
    /**
     * <code>uint64 base_user_monster_id = 1;</code>
     */
    public long getBaseUserMonsterId() {
      return baseUserMonsterId_;
    }

    public static final int MATERIAL_USER_MONSTER_IDS_FIELD_NUMBER = 2;
    private java.util.List<java.lang.Long> materialUserMonsterIds_;
    /**
     * <code>repeated uint64 material_user_monster_ids = 2;</code>
     */
    public java.util.List<java.lang.Long>
        getMaterialUserMonsterIdsList() {
      return materialUserMonsterIds_;
    }
    /**
     * <code>repeated uint64 material_user_monster_ids = 2;</code>
     */
    public int getMaterialUserMonsterIdsCount() {
      return materialUserMonsterIds_.size();
    }
    /**
     * <code>repeated uint64 material_user_monster_ids = 2;</code>
     */
    public long getMaterialUserMonsterIds(int index) {
      return materialUserMonsterIds_.get(index);
    }
    private int materialUserMonsterIdsMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (baseUserMonsterId_ != 0L) {
        output.writeUInt64(1, baseUserMonsterId_);
      }
      if (getMaterialUserMonsterIdsList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(materialUserMonsterIdsMemoizedSerializedSize);
      }
      for (int i = 0; i < materialUserMonsterIds_.size(); i++) {
        output.writeUInt64NoTag(materialUserMonsterIds_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (baseUserMonsterId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, baseUserMonsterId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < materialUserMonsterIds_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(materialUserMonsterIds_.get(i));
        }
        size += dataSize;
        if (!getMaterialUserMonsterIdsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        materialUserMonsterIdsMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution other = (com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution) obj;

      boolean result = true;
      result = result && (getBaseUserMonsterId()
          == other.getBaseUserMonsterId());
      result = result && getMaterialUserMonsterIdsList()
          .equals(other.getMaterialUserMonsterIdsList());
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
      hash = (37 * hash) + BASE_USER_MONSTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBaseUserMonsterId());
      if (getMaterialUserMonsterIdsCount() > 0) {
        hash = (37 * hash) + MATERIAL_USER_MONSTER_IDS_FIELD_NUMBER;
        hash = (53 * hash) + getMaterialUserMonsterIdsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution prototype) {
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
     * Protobuf type {@code msggamedata.ReqWarmUpMonsterEvolution}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqWarmUpMonsterEvolution)
        com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolutionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.internal_static_msggamedata_ReqWarmUpMonsterEvolution_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.internal_static_msggamedata_ReqWarmUpMonsterEvolution_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution.class, com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution.Builder.class);
      }

      // Construct using com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution.newBuilder()
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
        baseUserMonsterId_ = 0L;

        materialUserMonsterIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.internal_static_msggamedata_ReqWarmUpMonsterEvolution_descriptor;
      }

      public com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution getDefaultInstanceForType() {
        return com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution.getDefaultInstance();
      }

      public com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution build() {
        com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution buildPartial() {
        com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution result = new com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.baseUserMonsterId_ = baseUserMonsterId_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          materialUserMonsterIds_ = java.util.Collections.unmodifiableList(materialUserMonsterIds_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.materialUserMonsterIds_ = materialUserMonsterIds_;
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution) {
          return mergeFrom((com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution other) {
        if (other == com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution.getDefaultInstance()) return this;
        if (other.getBaseUserMonsterId() != 0L) {
          setBaseUserMonsterId(other.getBaseUserMonsterId());
        }
        if (!other.materialUserMonsterIds_.isEmpty()) {
          if (materialUserMonsterIds_.isEmpty()) {
            materialUserMonsterIds_ = other.materialUserMonsterIds_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMaterialUserMonsterIdsIsMutable();
            materialUserMonsterIds_.addAll(other.materialUserMonsterIds_);
          }
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
        com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long baseUserMonsterId_ ;
      /**
       * <code>uint64 base_user_monster_id = 1;</code>
       */
      public long getBaseUserMonsterId() {
        return baseUserMonsterId_;
      }
      /**
       * <code>uint64 base_user_monster_id = 1;</code>
       */
      public Builder setBaseUserMonsterId(long value) {
        
        baseUserMonsterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 base_user_monster_id = 1;</code>
       */
      public Builder clearBaseUserMonsterId() {
        
        baseUserMonsterId_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Long> materialUserMonsterIds_ = java.util.Collections.emptyList();
      private void ensureMaterialUserMonsterIdsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          materialUserMonsterIds_ = new java.util.ArrayList<java.lang.Long>(materialUserMonsterIds_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint64 material_user_monster_ids = 2;</code>
       */
      public java.util.List<java.lang.Long>
          getMaterialUserMonsterIdsList() {
        return java.util.Collections.unmodifiableList(materialUserMonsterIds_);
      }
      /**
       * <code>repeated uint64 material_user_monster_ids = 2;</code>
       */
      public int getMaterialUserMonsterIdsCount() {
        return materialUserMonsterIds_.size();
      }
      /**
       * <code>repeated uint64 material_user_monster_ids = 2;</code>
       */
      public long getMaterialUserMonsterIds(int index) {
        return materialUserMonsterIds_.get(index);
      }
      /**
       * <code>repeated uint64 material_user_monster_ids = 2;</code>
       */
      public Builder setMaterialUserMonsterIds(
          int index, long value) {
        ensureMaterialUserMonsterIdsIsMutable();
        materialUserMonsterIds_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 material_user_monster_ids = 2;</code>
       */
      public Builder addMaterialUserMonsterIds(long value) {
        ensureMaterialUserMonsterIdsIsMutable();
        materialUserMonsterIds_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 material_user_monster_ids = 2;</code>
       */
      public Builder addAllMaterialUserMonsterIds(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureMaterialUserMonsterIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, materialUserMonsterIds_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 material_user_monster_ids = 2;</code>
       */
      public Builder clearMaterialUserMonsterIds() {
        materialUserMonsterIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqWarmUpMonsterEvolution)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqWarmUpMonsterEvolution)
    private static final com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution();
    }

    public static com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqWarmUpMonsterEvolution>
        PARSER = new com.google.protobuf.AbstractParser<ReqWarmUpMonsterEvolution>() {
      public ReqWarmUpMonsterEvolution parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqWarmUpMonsterEvolution(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqWarmUpMonsterEvolution> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqWarmUpMonsterEvolution> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqWarmUpMonsterEvolutionOuterClass.ReqWarmUpMonsterEvolution getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqWarmUpMonsterEvolution_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqWarmUpMonsterEvolution_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ReqWarmUpMonsterEvolution.proto\022\013msgga" +
      "medata\"\\\n\031ReqWarmUpMonsterEvolution\022\034\n\024b" +
      "ase_user_monster_id\030\001 \001(\004\022!\n\031material_us" +
      "er_monster_ids\030\002 \003(\004B\023\n\021com.felania.msld" +
      "bb\006proto3"
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
    internal_static_msggamedata_ReqWarmUpMonsterEvolution_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqWarmUpMonsterEvolution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqWarmUpMonsterEvolution_descriptor,
        new java.lang.String[] { "BaseUserMonsterId", "MaterialUserMonsterIds", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
