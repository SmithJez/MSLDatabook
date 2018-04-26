// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgRecommendMonster.proto

package com.felania.msldb;

public final class MsgRecommendMonsterOuterClass {
  private MsgRecommendMonsterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgRecommendMonsterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgRecommendMonster)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 id = 1;</code>
     */
    long getId();

    /**
     * <code>.msggamedata.MonsterElementType element = 2;</code>
     */
    int getElementValue();
    /**
     * <code>.msggamedata.MonsterElementType element = 2;</code>
     */
    com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType getElement();

    /**
     * <code>uint32 rank = 3;</code>
     */
    int getRank();

    /**
     * <code>fixed32 monster_uid = 4;</code>
     */
    int getMonsterUid();
  }
  /**
   * Protobuf type {@code msggamedata.MsgRecommendMonster}
   */
  public  static final class MsgRecommendMonster extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgRecommendMonster)
      MsgRecommendMonsterOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgRecommendMonster.newBuilder() to construct.
    private MsgRecommendMonster(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgRecommendMonster() {
      id_ = 0L;
      element_ = 0;
      rank_ = 0;
      monsterUid_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgRecommendMonster(
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

              id_ = input.readUInt64();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              element_ = rawValue;
              break;
            }
            case 24: {

              rank_ = input.readUInt32();
              break;
            }
            case 37: {

              monsterUid_ = input.readFixed32();
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
      return com.felania.msldb.MsgRecommendMonsterOuterClass.internal_static_msggamedata_MsgRecommendMonster_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgRecommendMonsterOuterClass.internal_static_msggamedata_MsgRecommendMonster_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster.class, com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>uint64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    public static final int ELEMENT_FIELD_NUMBER = 2;
    private int element_;
    /**
     * <code>.msggamedata.MonsterElementType element = 2;</code>
     */
    public int getElementValue() {
      return element_;
    }
    /**
     * <code>.msggamedata.MonsterElementType element = 2;</code>
     */
    public com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType getElement() {
      com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType result = com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType.valueOf(element_);
      return result == null ? com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType.UNRECOGNIZED : result;
    }

    public static final int RANK_FIELD_NUMBER = 3;
    private int rank_;
    /**
     * <code>uint32 rank = 3;</code>
     */
    public int getRank() {
      return rank_;
    }

    public static final int MONSTER_UID_FIELD_NUMBER = 4;
    private int monsterUid_;
    /**
     * <code>fixed32 monster_uid = 4;</code>
     */
    public int getMonsterUid() {
      return monsterUid_;
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
      if (id_ != 0L) {
        output.writeUInt64(1, id_);
      }
      if (element_ != com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType.MonsterElementTypeNULL.getNumber()) {
        output.writeEnum(2, element_);
      }
      if (rank_ != 0) {
        output.writeUInt32(3, rank_);
      }
      if (monsterUid_ != 0) {
        output.writeFixed32(4, monsterUid_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, id_);
      }
      if (element_ != com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType.MonsterElementTypeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, element_);
      }
      if (rank_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, rank_);
      }
      if (monsterUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(4, monsterUid_);
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
      if (!(obj instanceof com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster other = (com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster) obj;

      boolean result = true;
      result = result && (getId()
          == other.getId());
      result = result && element_ == other.element_;
      result = result && (getRank()
          == other.getRank());
      result = result && (getMonsterUid()
          == other.getMonsterUid());
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + ELEMENT_FIELD_NUMBER;
      hash = (53 * hash) + element_;
      hash = (37 * hash) + RANK_FIELD_NUMBER;
      hash = (53 * hash) + getRank();
      hash = (37 * hash) + MONSTER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster prototype) {
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
     * Protobuf type {@code msggamedata.MsgRecommendMonster}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgRecommendMonster)
        com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonsterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgRecommendMonsterOuterClass.internal_static_msggamedata_MsgRecommendMonster_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgRecommendMonsterOuterClass.internal_static_msggamedata_MsgRecommendMonster_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster.class, com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster.Builder.class);
      }

      // Construct using com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster.newBuilder()
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
        id_ = 0L;

        element_ = 0;

        rank_ = 0;

        monsterUid_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgRecommendMonsterOuterClass.internal_static_msggamedata_MsgRecommendMonster_descriptor;
      }

      public com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster getDefaultInstanceForType() {
        return com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster.getDefaultInstance();
      }

      public com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster build() {
        com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster buildPartial() {
        com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster result = new com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster(this);
        result.id_ = id_;
        result.element_ = element_;
        result.rank_ = rank_;
        result.monsterUid_ = monsterUid_;
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
        if (other instanceof com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster) {
          return mergeFrom((com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster other) {
        if (other == com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (other.element_ != 0) {
          setElementValue(other.getElementValue());
        }
        if (other.getRank() != 0) {
          setRank(other.getRank());
        }
        if (other.getMonsterUid() != 0) {
          setMonsterUid(other.getMonsterUid());
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
        com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long id_ ;
      /**
       * <code>uint64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>uint64 id = 1;</code>
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private int element_ = 0;
      /**
       * <code>.msggamedata.MonsterElementType element = 2;</code>
       */
      public int getElementValue() {
        return element_;
      }
      /**
       * <code>.msggamedata.MonsterElementType element = 2;</code>
       */
      public Builder setElementValue(int value) {
        element_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterElementType element = 2;</code>
       */
      public com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType getElement() {
        com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType result = com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType.valueOf(element_);
        return result == null ? com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MonsterElementType element = 2;</code>
       */
      public Builder setElement(com.felania.msldb.MonsterElementTypeOuterClass.MonsterElementType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        element_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterElementType element = 2;</code>
       */
      public Builder clearElement() {
        
        element_ = 0;
        onChanged();
        return this;
      }

      private int rank_ ;
      /**
       * <code>uint32 rank = 3;</code>
       */
      public int getRank() {
        return rank_;
      }
      /**
       * <code>uint32 rank = 3;</code>
       */
      public Builder setRank(int value) {
        
        rank_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rank = 3;</code>
       */
      public Builder clearRank() {
        
        rank_ = 0;
        onChanged();
        return this;
      }

      private int monsterUid_ ;
      /**
       * <code>fixed32 monster_uid = 4;</code>
       */
      public int getMonsterUid() {
        return monsterUid_;
      }
      /**
       * <code>fixed32 monster_uid = 4;</code>
       */
      public Builder setMonsterUid(int value) {
        
        monsterUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 monster_uid = 4;</code>
       */
      public Builder clearMonsterUid() {
        
        monsterUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgRecommendMonster)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgRecommendMonster)
    private static final com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster();
    }

    public static com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgRecommendMonster>
        PARSER = new com.google.protobuf.AbstractParser<MsgRecommendMonster>() {
      public MsgRecommendMonster parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgRecommendMonster(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgRecommendMonster> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgRecommendMonster> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgRecommendMonsterOuterClass.MsgRecommendMonster getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgRecommendMonster_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgRecommendMonster_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031MsgRecommendMonster.proto\022\013msggamedata" +
      "\032\030MonsterElementType.proto\"v\n\023MsgRecomme" +
      "ndMonster\022\n\n\002id\030\001 \001(\004\0220\n\007element\030\002 \001(\0162\037" +
      ".msggamedata.MonsterElementType\022\014\n\004rank\030" +
      "\003 \001(\r\022\023\n\013monster_uid\030\004 \001(\007B\023\n\021com.felani" +
      "a.msldbb\006proto3"
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
          com.felania.msldb.MonsterElementTypeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgRecommendMonster_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgRecommendMonster_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgRecommendMonster_descriptor,
        new java.lang.String[] { "Id", "Element", "Rank", "MonsterUid", });
    com.felania.msldb.MonsterElementTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
