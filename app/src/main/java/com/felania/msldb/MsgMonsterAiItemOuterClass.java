// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgMonsterAiItem.proto

package com.felania.msldb;

public final class MsgMonsterAiItemOuterClass {
  private MsgMonsterAiItemOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgMonsterAiItemOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgMonsterAiItem)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgMonsterAiItem.MonsterAiType ai_type = 1;</code>
     */
    int getAiTypeValue();
    /**
     * <code>.msggamedata.MsgMonsterAiItem.MonsterAiType ai_type = 1;</code>
     */
    com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.MonsterAiType getAiType();

    /**
     * <code>uint32 cnt = 2;</code>
     */
    int getCnt();

    /**
     * <code>float val = 3;</code>
     */
    float getVal();

    /**
     * <code>.msggamedata.MsgStatusEffect.StatusEffectSubType status_effect = 4;</code>
     */
    int getStatusEffectValue();
    /**
     * <code>.msggamedata.MsgStatusEffect.StatusEffectSubType status_effect = 4;</code>
     */
    com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect.StatusEffectSubType getStatusEffect();
  }
  /**
   * Protobuf type {@code msggamedata.MsgMonsterAiItem}
   */
  public  static final class MsgMonsterAiItem extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgMonsterAiItem)
      MsgMonsterAiItemOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgMonsterAiItem.newBuilder() to construct.
    private MsgMonsterAiItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgMonsterAiItem() {
      aiType_ = 0;
      cnt_ = 0;
      val_ = 0F;
      statusEffect_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgMonsterAiItem(
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

              aiType_ = rawValue;
              break;
            }
            case 16: {

              cnt_ = input.readUInt32();
              break;
            }
            case 29: {

              val_ = input.readFloat();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              statusEffect_ = rawValue;
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
      return com.felania.msldb.MsgMonsterAiItemOuterClass.internal_static_msggamedata_MsgMonsterAiItem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgMonsterAiItemOuterClass.internal_static_msggamedata_MsgMonsterAiItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.class, com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.Builder.class);
    }

    /**
     * Protobuf enum {@code msggamedata.MsgMonsterAiItem.MonsterAiType}
     */
    public enum MonsterAiType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>None = 0;</code>
       */
      None(0),
      /**
       * <code>Random = 1;</code>
       */
      Random(1),
      /**
       * <code>OppositeElement = 2;</code>
       */
      OppositeElement(2),
      /**
       * <code>EnemyStatusEffect = 3;</code>
       */
      EnemyStatusEffect(3),
      /**
       * <code>OurStatusEffect = 4;</code>
       */
      OurStatusEffect(4),
      /**
       * <code>EnemyHpOver = 5;</code>
       */
      EnemyHpOver(5),
      /**
       * <code>EnemyHpUnder = 6;</code>
       */
      EnemyHpUnder(6),
      /**
       * <code>OurHpOver = 7;</code>
       */
      OurHpOver(7),
      /**
       * <code>OurHpUnder = 8;</code>
       */
      OurHpUnder(8),
      /**
       * <code>EnemyCntOver = 9;</code>
       */
      EnemyCntOver(9),
      /**
       * <code>EnemyCntUnder = 10;</code>
       */
      EnemyCntUnder(10),
      /**
       * <code>NoNextRound = 11;</code>
       */
      NoNextRound(11),
      /**
       * <code>DefaultSkill = 12;</code>
       */
      DefaultSkill(12),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>None = 0;</code>
       */
      public static final int None_VALUE = 0;
      /**
       * <code>Random = 1;</code>
       */
      public static final int Random_VALUE = 1;
      /**
       * <code>OppositeElement = 2;</code>
       */
      public static final int OppositeElement_VALUE = 2;
      /**
       * <code>EnemyStatusEffect = 3;</code>
       */
      public static final int EnemyStatusEffect_VALUE = 3;
      /**
       * <code>OurStatusEffect = 4;</code>
       */
      public static final int OurStatusEffect_VALUE = 4;
      /**
       * <code>EnemyHpOver = 5;</code>
       */
      public static final int EnemyHpOver_VALUE = 5;
      /**
       * <code>EnemyHpUnder = 6;</code>
       */
      public static final int EnemyHpUnder_VALUE = 6;
      /**
       * <code>OurHpOver = 7;</code>
       */
      public static final int OurHpOver_VALUE = 7;
      /**
       * <code>OurHpUnder = 8;</code>
       */
      public static final int OurHpUnder_VALUE = 8;
      /**
       * <code>EnemyCntOver = 9;</code>
       */
      public static final int EnemyCntOver_VALUE = 9;
      /**
       * <code>EnemyCntUnder = 10;</code>
       */
      public static final int EnemyCntUnder_VALUE = 10;
      /**
       * <code>NoNextRound = 11;</code>
       */
      public static final int NoNextRound_VALUE = 11;
      /**
       * <code>DefaultSkill = 12;</code>
       */
      public static final int DefaultSkill_VALUE = 12;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static MonsterAiType valueOf(int value) {
        return forNumber(value);
      }

      public static MonsterAiType forNumber(int value) {
        switch (value) {
          case 0: return None;
          case 1: return Random;
          case 2: return OppositeElement;
          case 3: return EnemyStatusEffect;
          case 4: return OurStatusEffect;
          case 5: return EnemyHpOver;
          case 6: return EnemyHpUnder;
          case 7: return OurHpOver;
          case 8: return OurHpUnder;
          case 9: return EnemyCntOver;
          case 10: return EnemyCntUnder;
          case 11: return NoNextRound;
          case 12: return DefaultSkill;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MonsterAiType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MonsterAiType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MonsterAiType>() {
              public MonsterAiType findValueByNumber(int number) {
                return MonsterAiType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.getDescriptor().getEnumTypes().get(0);
      }

      private static final MonsterAiType[] VALUES = values();

      public static MonsterAiType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private MonsterAiType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:msggamedata.MsgMonsterAiItem.MonsterAiType)
    }

    public static final int AI_TYPE_FIELD_NUMBER = 1;
    private int aiType_;
    /**
     * <code>.msggamedata.MsgMonsterAiItem.MonsterAiType ai_type = 1;</code>
     */
    public int getAiTypeValue() {
      return aiType_;
    }
    /**
     * <code>.msggamedata.MsgMonsterAiItem.MonsterAiType ai_type = 1;</code>
     */
    public com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.MonsterAiType getAiType() {
      com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.MonsterAiType result = com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.MonsterAiType.valueOf(aiType_);
      return result == null ? com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.MonsterAiType.UNRECOGNIZED : result;
    }

    public static final int CNT_FIELD_NUMBER = 2;
    private int cnt_;
    /**
     * <code>uint32 cnt = 2;</code>
     */
    public int getCnt() {
      return cnt_;
    }

    public static final int VAL_FIELD_NUMBER = 3;
    private float val_;
    /**
     * <code>float val = 3;</code>
     */
    public float getVal() {
      return val_;
    }

    public static final int STATUS_EFFECT_FIELD_NUMBER = 4;
    private int statusEffect_;
    /**
     * <code>.msggamedata.MsgStatusEffect.StatusEffectSubType status_effect = 4;</code>
     */
    public int getStatusEffectValue() {
      return statusEffect_;
    }
    /**
     * <code>.msggamedata.MsgStatusEffect.StatusEffectSubType status_effect = 4;</code>
     */
    public com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect.StatusEffectSubType getStatusEffect() {
      com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect.StatusEffectSubType result = com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect.StatusEffectSubType.valueOf(statusEffect_);
      return result == null ? com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect.StatusEffectSubType.UNRECOGNIZED : result;
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
      if (aiType_ != com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.MonsterAiType.None.getNumber()) {
        output.writeEnum(1, aiType_);
      }
      if (cnt_ != 0) {
        output.writeUInt32(2, cnt_);
      }
      if (val_ != 0F) {
        output.writeFloat(3, val_);
      }
      if (statusEffect_ != com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect.StatusEffectSubType.StatusEffectSubTypeNULL.getNumber()) {
        output.writeEnum(4, statusEffect_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (aiType_ != com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.MonsterAiType.None.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, aiType_);
      }
      if (cnt_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, cnt_);
      }
      if (val_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, val_);
      }
      if (statusEffect_ != com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect.StatusEffectSubType.StatusEffectSubTypeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, statusEffect_);
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
      if (!(obj instanceof com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem other = (com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem) obj;

      boolean result = true;
      result = result && aiType_ == other.aiType_;
      result = result && (getCnt()
          == other.getCnt());
      result = result && (
          java.lang.Float.floatToIntBits(getVal())
          == java.lang.Float.floatToIntBits(
              other.getVal()));
      result = result && statusEffect_ == other.statusEffect_;
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
      hash = (37 * hash) + AI_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + aiType_;
      hash = (37 * hash) + CNT_FIELD_NUMBER;
      hash = (53 * hash) + getCnt();
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getVal());
      hash = (37 * hash) + STATUS_EFFECT_FIELD_NUMBER;
      hash = (53 * hash) + statusEffect_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem prototype) {
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
     * Protobuf type {@code msggamedata.MsgMonsterAiItem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgMonsterAiItem)
        com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgMonsterAiItemOuterClass.internal_static_msggamedata_MsgMonsterAiItem_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgMonsterAiItemOuterClass.internal_static_msggamedata_MsgMonsterAiItem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.class, com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.Builder.class);
      }

      // Construct using com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.newBuilder()
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
        aiType_ = 0;

        cnt_ = 0;

        val_ = 0F;

        statusEffect_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgMonsterAiItemOuterClass.internal_static_msggamedata_MsgMonsterAiItem_descriptor;
      }

      public com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem getDefaultInstanceForType() {
        return com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.getDefaultInstance();
      }

      public com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem build() {
        com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem buildPartial() {
        com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem result = new com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem(this);
        result.aiType_ = aiType_;
        result.cnt_ = cnt_;
        result.val_ = val_;
        result.statusEffect_ = statusEffect_;
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
        if (other instanceof com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem) {
          return mergeFrom((com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem other) {
        if (other == com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.getDefaultInstance()) return this;
        if (other.aiType_ != 0) {
          setAiTypeValue(other.getAiTypeValue());
        }
        if (other.getCnt() != 0) {
          setCnt(other.getCnt());
        }
        if (other.getVal() != 0F) {
          setVal(other.getVal());
        }
        if (other.statusEffect_ != 0) {
          setStatusEffectValue(other.getStatusEffectValue());
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
        com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int aiType_ = 0;
      /**
       * <code>.msggamedata.MsgMonsterAiItem.MonsterAiType ai_type = 1;</code>
       */
      public int getAiTypeValue() {
        return aiType_;
      }
      /**
       * <code>.msggamedata.MsgMonsterAiItem.MonsterAiType ai_type = 1;</code>
       */
      public Builder setAiTypeValue(int value) {
        aiType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgMonsterAiItem.MonsterAiType ai_type = 1;</code>
       */
      public com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.MonsterAiType getAiType() {
        com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.MonsterAiType result = com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.MonsterAiType.valueOf(aiType_);
        return result == null ? com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.MonsterAiType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MsgMonsterAiItem.MonsterAiType ai_type = 1;</code>
       */
      public Builder setAiType(com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem.MonsterAiType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        aiType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgMonsterAiItem.MonsterAiType ai_type = 1;</code>
       */
      public Builder clearAiType() {
        
        aiType_ = 0;
        onChanged();
        return this;
      }

      private int cnt_ ;
      /**
       * <code>uint32 cnt = 2;</code>
       */
      public int getCnt() {
        return cnt_;
      }
      /**
       * <code>uint32 cnt = 2;</code>
       */
      public Builder setCnt(int value) {
        
        cnt_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cnt = 2;</code>
       */
      public Builder clearCnt() {
        
        cnt_ = 0;
        onChanged();
        return this;
      }

      private float val_ ;
      /**
       * <code>float val = 3;</code>
       */
      public float getVal() {
        return val_;
      }
      /**
       * <code>float val = 3;</code>
       */
      public Builder setVal(float value) {
        
        val_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float val = 3;</code>
       */
      public Builder clearVal() {
        
        val_ = 0F;
        onChanged();
        return this;
      }

      private int statusEffect_ = 0;
      /**
       * <code>.msggamedata.MsgStatusEffect.StatusEffectSubType status_effect = 4;</code>
       */
      public int getStatusEffectValue() {
        return statusEffect_;
      }
      /**
       * <code>.msggamedata.MsgStatusEffect.StatusEffectSubType status_effect = 4;</code>
       */
      public Builder setStatusEffectValue(int value) {
        statusEffect_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgStatusEffect.StatusEffectSubType status_effect = 4;</code>
       */
      public com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect.StatusEffectSubType getStatusEffect() {
        com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect.StatusEffectSubType result = com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect.StatusEffectSubType.valueOf(statusEffect_);
        return result == null ? com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect.StatusEffectSubType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MsgStatusEffect.StatusEffectSubType status_effect = 4;</code>
       */
      public Builder setStatusEffect(com.felania.msldb.MsgStatusEffectOuterClass.MsgStatusEffect.StatusEffectSubType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        statusEffect_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgStatusEffect.StatusEffectSubType status_effect = 4;</code>
       */
      public Builder clearStatusEffect() {
        
        statusEffect_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgMonsterAiItem)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgMonsterAiItem)
    private static final com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem();
    }

    public static com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgMonsterAiItem>
        PARSER = new com.google.protobuf.AbstractParser<MsgMonsterAiItem>() {
      public MsgMonsterAiItem parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgMonsterAiItem(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgMonsterAiItem> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgMonsterAiItem> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgMonsterAiItemOuterClass.MsgMonsterAiItem getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgMonsterAiItem_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgMonsterAiItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026MsgMonsterAiItem.proto\022\013msggamedata\032\025M" +
      "sgStatusEffect.proto\"\246\003\n\020MsgMonsterAiIte" +
      "m\022<\n\007ai_type\030\001 \001(\0162+.msggamedata.MsgMons" +
      "terAiItem.MonsterAiType\022\013\n\003cnt\030\002 \001(\r\022\013\n\003" +
      "val\030\003 \001(\002\022G\n\rstatus_effect\030\004 \001(\01620.msgga" +
      "medata.MsgStatusEffect.StatusEffectSubTy" +
      "pe\"\360\001\n\rMonsterAiType\022\010\n\004None\020\000\022\n\n\006Random" +
      "\020\001\022\023\n\017OppositeElement\020\002\022\025\n\021EnemyStatusEf" +
      "fect\020\003\022\023\n\017OurStatusEffect\020\004\022\017\n\013EnemyHpOv" +
      "er\020\005\022\020\n\014EnemyHpUnder\020\006\022\r\n\tOurHpOver\020\007\022\016\n" +
      "\nOurHpUnder\020\010\022\020\n\014EnemyCntOver\020\t\022\021\n\rEnemy" +
      "CntUnder\020\n\022\017\n\013NoNextRound\020\013\022\020\n\014DefaultSk" +
      "ill\020\014B\023\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.MsgStatusEffectOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgMonsterAiItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgMonsterAiItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgMonsterAiItem_descriptor,
        new java.lang.String[] { "AiType", "Cnt", "Val", "StatusEffect", });
    com.felania.msldb.MsgStatusEffectOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
