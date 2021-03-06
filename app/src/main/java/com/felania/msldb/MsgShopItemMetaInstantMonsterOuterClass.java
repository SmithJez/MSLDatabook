// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgShopItemMetaInstantMonster.proto

package com.felania.msldb;

public final class MsgShopItemMetaInstantMonsterOuterClass {
  private MsgShopItemMetaInstantMonsterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgShopItemMetaInstantMonsterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgShopItemMetaInstantMonster)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 monster_uid = 1;</code>
     */
    int getMonsterUid();

    /**
     * <code>.msggamedata.MonsterStatType stat_type = 2;</code>
     */
    int getStatTypeValue();
    /**
     * <code>.msggamedata.MonsterStatType stat_type = 2;</code>
     */
    com.felania.msldb.MonsterStatTypeOuterClass.MonsterStatType getStatType();

    /**
     * <code>.msggamedata.MonsterStatWeightType stat_weight_type = 3;</code>
     */
    int getStatWeightTypeValue();
    /**
     * <code>.msggamedata.MonsterStatWeightType stat_weight_type = 3;</code>
     */
    com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType getStatWeightType();
  }
  /**
   * Protobuf type {@code msggamedata.MsgShopItemMetaInstantMonster}
   */
  public  static final class MsgShopItemMetaInstantMonster extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgShopItemMetaInstantMonster)
      MsgShopItemMetaInstantMonsterOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgShopItemMetaInstantMonster.newBuilder() to construct.
    private MsgShopItemMetaInstantMonster(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgShopItemMetaInstantMonster() {
      monsterUid_ = 0;
      statType_ = 0;
      statWeightType_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgShopItemMetaInstantMonster(
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

              monsterUid_ = input.readFixed32();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              statType_ = rawValue;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              statWeightType_ = rawValue;
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
      return com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.internal_static_msggamedata_MsgShopItemMetaInstantMonster_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.internal_static_msggamedata_MsgShopItemMetaInstantMonster_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.class, com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.Builder.class);
    }

    public static final int MONSTER_UID_FIELD_NUMBER = 1;
    private int monsterUid_;
    /**
     * <code>fixed32 monster_uid = 1;</code>
     */
    public int getMonsterUid() {
      return monsterUid_;
    }

    public static final int STAT_TYPE_FIELD_NUMBER = 2;
    private int statType_;
    /**
     * <code>.msggamedata.MonsterStatType stat_type = 2;</code>
     */
    public int getStatTypeValue() {
      return statType_;
    }
    /**
     * <code>.msggamedata.MonsterStatType stat_type = 2;</code>
     */
    public com.felania.msldb.MonsterStatTypeOuterClass.MonsterStatType getStatType() {
      com.felania.msldb.MonsterStatTypeOuterClass.MonsterStatType result = com.felania.msldb.MonsterStatTypeOuterClass.MonsterStatType.valueOf(statType_);
      return result == null ? com.felania.msldb.MonsterStatTypeOuterClass.MonsterStatType.UNRECOGNIZED : result;
    }

    public static final int STAT_WEIGHT_TYPE_FIELD_NUMBER = 3;
    private int statWeightType_;
    /**
     * <code>.msggamedata.MonsterStatWeightType stat_weight_type = 3;</code>
     */
    public int getStatWeightTypeValue() {
      return statWeightType_;
    }
    /**
     * <code>.msggamedata.MonsterStatWeightType stat_weight_type = 3;</code>
     */
    public com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType getStatWeightType() {
      com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType result = com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType.valueOf(statWeightType_);
      return result == null ? com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType.UNRECOGNIZED : result;
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
      if (monsterUid_ != 0) {
        output.writeFixed32(1, monsterUid_);
      }
      if (statType_ != com.felania.msldb.MonsterStatTypeOuterClass.MonsterStatType.MS_None.getNumber()) {
        output.writeEnum(2, statType_);
      }
      if (statWeightType_ != com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType.MonsterStatWeightTypeNULL.getNumber()) {
        output.writeEnum(3, statWeightType_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (monsterUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, monsterUid_);
      }
      if (statType_ != com.felania.msldb.MonsterStatTypeOuterClass.MonsterStatType.MS_None.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, statType_);
      }
      if (statWeightType_ != com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType.MonsterStatWeightTypeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, statWeightType_);
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
      if (!(obj instanceof com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster other = (com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster) obj;

      boolean result = true;
      result = result && (getMonsterUid()
          == other.getMonsterUid());
      result = result && statType_ == other.statType_;
      result = result && statWeightType_ == other.statWeightType_;
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
      hash = (37 * hash) + MONSTER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterUid();
      hash = (37 * hash) + STAT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + statType_;
      hash = (37 * hash) + STAT_WEIGHT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + statWeightType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster prototype) {
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
     * Protobuf type {@code msggamedata.MsgShopItemMetaInstantMonster}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgShopItemMetaInstantMonster)
        com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonsterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.internal_static_msggamedata_MsgShopItemMetaInstantMonster_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.internal_static_msggamedata_MsgShopItemMetaInstantMonster_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.class, com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.Builder.class);
      }

      // Construct using com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.newBuilder()
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
        monsterUid_ = 0;

        statType_ = 0;

        statWeightType_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.internal_static_msggamedata_MsgShopItemMetaInstantMonster_descriptor;
      }

      public com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster getDefaultInstanceForType() {
        return com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.getDefaultInstance();
      }

      public com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster build() {
        com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster buildPartial() {
        com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster result = new com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster(this);
        result.monsterUid_ = monsterUid_;
        result.statType_ = statType_;
        result.statWeightType_ = statWeightType_;
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
        if (other instanceof com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster) {
          return mergeFrom((com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster other) {
        if (other == com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.getDefaultInstance()) return this;
        if (other.getMonsterUid() != 0) {
          setMonsterUid(other.getMonsterUid());
        }
        if (other.statType_ != 0) {
          setStatTypeValue(other.getStatTypeValue());
        }
        if (other.statWeightType_ != 0) {
          setStatWeightTypeValue(other.getStatWeightTypeValue());
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
        com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int monsterUid_ ;
      /**
       * <code>fixed32 monster_uid = 1;</code>
       */
      public int getMonsterUid() {
        return monsterUid_;
      }
      /**
       * <code>fixed32 monster_uid = 1;</code>
       */
      public Builder setMonsterUid(int value) {
        
        monsterUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 monster_uid = 1;</code>
       */
      public Builder clearMonsterUid() {
        
        monsterUid_ = 0;
        onChanged();
        return this;
      }

      private int statType_ = 0;
      /**
       * <code>.msggamedata.MonsterStatType stat_type = 2;</code>
       */
      public int getStatTypeValue() {
        return statType_;
      }
      /**
       * <code>.msggamedata.MonsterStatType stat_type = 2;</code>
       */
      public Builder setStatTypeValue(int value) {
        statType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterStatType stat_type = 2;</code>
       */
      public com.felania.msldb.MonsterStatTypeOuterClass.MonsterStatType getStatType() {
        com.felania.msldb.MonsterStatTypeOuterClass.MonsterStatType result = com.felania.msldb.MonsterStatTypeOuterClass.MonsterStatType.valueOf(statType_);
        return result == null ? com.felania.msldb.MonsterStatTypeOuterClass.MonsterStatType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MonsterStatType stat_type = 2;</code>
       */
      public Builder setStatType(com.felania.msldb.MonsterStatTypeOuterClass.MonsterStatType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        statType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterStatType stat_type = 2;</code>
       */
      public Builder clearStatType() {
        
        statType_ = 0;
        onChanged();
        return this;
      }

      private int statWeightType_ = 0;
      /**
       * <code>.msggamedata.MonsterStatWeightType stat_weight_type = 3;</code>
       */
      public int getStatWeightTypeValue() {
        return statWeightType_;
      }
      /**
       * <code>.msggamedata.MonsterStatWeightType stat_weight_type = 3;</code>
       */
      public Builder setStatWeightTypeValue(int value) {
        statWeightType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterStatWeightType stat_weight_type = 3;</code>
       */
      public com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType getStatWeightType() {
        com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType result = com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType.valueOf(statWeightType_);
        return result == null ? com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MonsterStatWeightType stat_weight_type = 3;</code>
       */
      public Builder setStatWeightType(com.felania.msldb.MonsterStatWeightTypeOuterClass.MonsterStatWeightType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        statWeightType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterStatWeightType stat_weight_type = 3;</code>
       */
      public Builder clearStatWeightType() {
        
        statWeightType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgShopItemMetaInstantMonster)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgShopItemMetaInstantMonster)
    private static final com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster();
    }

    public static com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgShopItemMetaInstantMonster>
        PARSER = new com.google.protobuf.AbstractParser<MsgShopItemMetaInstantMonster>() {
      public MsgShopItemMetaInstantMonster parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgShopItemMetaInstantMonster(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgShopItemMetaInstantMonster> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgShopItemMetaInstantMonster> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgShopItemMetaInstantMonster_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgShopItemMetaInstantMonster_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#MsgShopItemMetaInstantMonster.proto\022\013m" +
      "sggamedata\032\025MonsterStatType.proto\032\033Monst" +
      "erStatWeightType.proto\"\243\001\n\035MsgShopItemMe" +
      "taInstantMonster\022\023\n\013monster_uid\030\001 \001(\007\022/\n" +
      "\tstat_type\030\002 \001(\0162\034.msggamedata.MonsterSt" +
      "atType\022<\n\020stat_weight_type\030\003 \001(\0162\".msgga" +
      "medata.MonsterStatWeightTypeB\023\n\021com.fela" +
      "nia.msldbb\006proto3"
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
          com.felania.msldb.MonsterStatTypeOuterClass.getDescriptor(),
          com.felania.msldb.MonsterStatWeightTypeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgShopItemMetaInstantMonster_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgShopItemMetaInstantMonster_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgShopItemMetaInstantMonster_descriptor,
        new java.lang.String[] { "MonsterUid", "StatType", "StatWeightType", });
    com.felania.msldb.MonsterStatTypeOuterClass.getDescriptor();
    com.felania.msldb.MonsterStatWeightTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
