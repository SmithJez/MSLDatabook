// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgRandomItem.proto

package com.felania.msldb;

public final class MsgRandomItemOuterClass {
  private MsgRandomItemOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgRandomItemOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgRandomItem)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgRandomItem.DataType type = 1;</code>
     */
    int getTypeValue();
    /**
     * <code>.msggamedata.MsgRandomItem.DataType type = 1;</code>
     */
    com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.DataType getType();

    /**
     * <code>float prob = 2;</code>
     */
    float getProb();

    /**
     * <code>fixed32 uid = 3;</code>
     */
    int getUid();

    /**
     * <code>uint32 amount = 4;</code>
     */
    int getAmount();

    /**
     * <code>.msggamedata.RewardGrade grade = 5;</code>
     */
    int getGradeValue();
    /**
     * <code>.msggamedata.RewardGrade grade = 5;</code>
     */
    com.felania.msldb.RewardGradeOuterClass.RewardGrade getGrade();
  }
  /**
   * Protobuf type {@code msggamedata.MsgRandomItem}
   */
  public  static final class MsgRandomItem extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgRandomItem)
      MsgRandomItemOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgRandomItem.newBuilder() to construct.
    private MsgRandomItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgRandomItem() {
      type_ = 0;
      prob_ = 0F;
      uid_ = 0;
      amount_ = 0;
      grade_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgRandomItem(
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

              type_ = rawValue;
              break;
            }
            case 21: {

              prob_ = input.readFloat();
              break;
            }
            case 29: {

              uid_ = input.readFixed32();
              break;
            }
            case 32: {

              amount_ = input.readUInt32();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();

              grade_ = rawValue;
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
      return com.felania.msldb.MsgRandomItemOuterClass.internal_static_msggamedata_MsgRandomItem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgRandomItemOuterClass.internal_static_msggamedata_MsgRandomItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.class, com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.Builder.class);
    }

    /**
     * Protobuf enum {@code msggamedata.MsgRandomItem.DataType}
     */
    public enum DataType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>None = 0;</code>
       */
      None(0),
      /**
       * <code>Uid = 1;</code>
       */
      Uid(1),
      /**
       * <code>Food = 2;</code>
       */
      Food(2),
      /**
       * <code>Gold = 3;</code>
       */
      Gold(3),
      /**
       * <code>Energy = 4;</code>
       */
      Energy(4),
      /**
       * <code>Gem = 5;</code>
       */
      Gem(5),
      /**
       * <code>Rune = 6;</code>
       */
      Rune(6),
      /**
       * <code>MonsterEgg = 7;</code>
       */
      MonsterEgg(7),
      /**
       * <code>SoulStone = 8;</code>
       */
      SoulStone(8),
      /**
       * <code>BeyondStone = 9;</code>
       */
      BeyondStone(9),
      /**
       * <code>InstantMonster = 10;</code>
       */
      InstantMonster(10),
      /**
       * <code>DungeonTicket = 11;</code>
       */
      DungeonTicket(11),
      /**
       * <code>ArenaTicket = 12;</code>
       */
      ArenaTicket(12),
      /**
       * <code>StarEssence = 13;</code>
       */
      StarEssence(13),
      /**
       * <code>ClanPoint = 14;</code>
       */
      ClanPoint(14),
      /**
       * <code>MonsterSkillBook = 15;</code>
       */
      MonsterSkillBook(15),
      /**
       * <code>MonsterEggHidden = 16;</code>
       */
      MonsterEggHidden(16),
      /**
       * <code>SuperStone = 17;</code>
       */
      SuperStone(17),
      /**
       * <code>SuperStoneStuff = 18;</code>
       */
      SuperStoneStuff(18),
      /**
       * <code>HeroEssence = 19;</code>
       */
      HeroEssence(19),
      /**
       * <code>RandomRune = 20;</code>
       */
      RandomRune(20),
      /**
       * <code>CostumeTicket = 21;</code>
       */
      CostumeTicket(21),
      /**
       * <code>ShowSkillBook = 99;</code>
       */
      ShowSkillBook(99),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>None = 0;</code>
       */
      public static final int None_VALUE = 0;
      /**
       * <code>Uid = 1;</code>
       */
      public static final int Uid_VALUE = 1;
      /**
       * <code>Food = 2;</code>
       */
      public static final int Food_VALUE = 2;
      /**
       * <code>Gold = 3;</code>
       */
      public static final int Gold_VALUE = 3;
      /**
       * <code>Energy = 4;</code>
       */
      public static final int Energy_VALUE = 4;
      /**
       * <code>Gem = 5;</code>
       */
      public static final int Gem_VALUE = 5;
      /**
       * <code>Rune = 6;</code>
       */
      public static final int Rune_VALUE = 6;
      /**
       * <code>MonsterEgg = 7;</code>
       */
      public static final int MonsterEgg_VALUE = 7;
      /**
       * <code>SoulStone = 8;</code>
       */
      public static final int SoulStone_VALUE = 8;
      /**
       * <code>BeyondStone = 9;</code>
       */
      public static final int BeyondStone_VALUE = 9;
      /**
       * <code>InstantMonster = 10;</code>
       */
      public static final int InstantMonster_VALUE = 10;
      /**
       * <code>DungeonTicket = 11;</code>
       */
      public static final int DungeonTicket_VALUE = 11;
      /**
       * <code>ArenaTicket = 12;</code>
       */
      public static final int ArenaTicket_VALUE = 12;
      /**
       * <code>StarEssence = 13;</code>
       */
      public static final int StarEssence_VALUE = 13;
      /**
       * <code>ClanPoint = 14;</code>
       */
      public static final int ClanPoint_VALUE = 14;
      /**
       * <code>MonsterSkillBook = 15;</code>
       */
      public static final int MonsterSkillBook_VALUE = 15;
      /**
       * <code>MonsterEggHidden = 16;</code>
       */
      public static final int MonsterEggHidden_VALUE = 16;
      /**
       * <code>SuperStone = 17;</code>
       */
      public static final int SuperStone_VALUE = 17;
      /**
       * <code>SuperStoneStuff = 18;</code>
       */
      public static final int SuperStoneStuff_VALUE = 18;
      /**
       * <code>HeroEssence = 19;</code>
       */
      public static final int HeroEssence_VALUE = 19;
      /**
       * <code>RandomRune = 20;</code>
       */
      public static final int RandomRune_VALUE = 20;
      /**
       * <code>CostumeTicket = 21;</code>
       */
      public static final int CostumeTicket_VALUE = 21;
      /**
       * <code>ShowSkillBook = 99;</code>
       */
      public static final int ShowSkillBook_VALUE = 99;


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
      public static DataType valueOf(int value) {
        return forNumber(value);
      }

      public static DataType forNumber(int value) {
        switch (value) {
          case 0: return None;
          case 1: return Uid;
          case 2: return Food;
          case 3: return Gold;
          case 4: return Energy;
          case 5: return Gem;
          case 6: return Rune;
          case 7: return MonsterEgg;
          case 8: return SoulStone;
          case 9: return BeyondStone;
          case 10: return InstantMonster;
          case 11: return DungeonTicket;
          case 12: return ArenaTicket;
          case 13: return StarEssence;
          case 14: return ClanPoint;
          case 15: return MonsterSkillBook;
          case 16: return MonsterEggHidden;
          case 17: return SuperStone;
          case 18: return SuperStoneStuff;
          case 19: return HeroEssence;
          case 20: return RandomRune;
          case 21: return CostumeTicket;
          case 99: return ShowSkillBook;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DataType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DataType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
              public DataType findValueByNumber(int number) {
                return DataType.forNumber(number);
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
        return com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.getDescriptor().getEnumTypes().get(0);
      }

      private static final DataType[] VALUES = values();

      public static DataType valueOf(
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

      private DataType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:msggamedata.MsgRandomItem.DataType)
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>.msggamedata.MsgRandomItem.DataType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.msggamedata.MsgRandomItem.DataType type = 1;</code>
     */
    public com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.DataType getType() {
      com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.DataType result = com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.DataType.valueOf(type_);
      return result == null ? com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.DataType.UNRECOGNIZED : result;
    }

    public static final int PROB_FIELD_NUMBER = 2;
    private float prob_;
    /**
     * <code>float prob = 2;</code>
     */
    public float getProb() {
      return prob_;
    }

    public static final int UID_FIELD_NUMBER = 3;
    private int uid_;
    /**
     * <code>fixed32 uid = 3;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int AMOUNT_FIELD_NUMBER = 4;
    private int amount_;
    /**
     * <code>uint32 amount = 4;</code>
     */
    public int getAmount() {
      return amount_;
    }

    public static final int GRADE_FIELD_NUMBER = 5;
    private int grade_;
    /**
     * <code>.msggamedata.RewardGrade grade = 5;</code>
     */
    public int getGradeValue() {
      return grade_;
    }
    /**
     * <code>.msggamedata.RewardGrade grade = 5;</code>
     */
    public com.felania.msldb.RewardGradeOuterClass.RewardGrade getGrade() {
      com.felania.msldb.RewardGradeOuterClass.RewardGrade result = com.felania.msldb.RewardGradeOuterClass.RewardGrade.valueOf(grade_);
      return result == null ? com.felania.msldb.RewardGradeOuterClass.RewardGrade.UNRECOGNIZED : result;
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
      if (type_ != com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.DataType.None.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (prob_ != 0F) {
        output.writeFloat(2, prob_);
      }
      if (uid_ != 0) {
        output.writeFixed32(3, uid_);
      }
      if (amount_ != 0) {
        output.writeUInt32(4, amount_);
      }
      if (grade_ != com.felania.msldb.RewardGradeOuterClass.RewardGrade.RewardGradeNULL.getNumber()) {
        output.writeEnum(5, grade_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.DataType.None.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (prob_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, prob_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(3, uid_);
      }
      if (amount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, amount_);
      }
      if (grade_ != com.felania.msldb.RewardGradeOuterClass.RewardGrade.RewardGradeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, grade_);
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
      if (!(obj instanceof com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem other = (com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem) obj;

      boolean result = true;
      result = result && type_ == other.type_;
      result = result && (
          java.lang.Float.floatToIntBits(getProb())
          == java.lang.Float.floatToIntBits(
              other.getProb()));
      result = result && (getUid()
          == other.getUid());
      result = result && (getAmount()
          == other.getAmount());
      result = result && grade_ == other.grade_;
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + PROB_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getProb());
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmount();
      hash = (37 * hash) + GRADE_FIELD_NUMBER;
      hash = (53 * hash) + grade_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem prototype) {
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
     * Protobuf type {@code msggamedata.MsgRandomItem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgRandomItem)
        com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgRandomItemOuterClass.internal_static_msggamedata_MsgRandomItem_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgRandomItemOuterClass.internal_static_msggamedata_MsgRandomItem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.class, com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.Builder.class);
      }

      // Construct using com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.newBuilder()
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
        type_ = 0;

        prob_ = 0F;

        uid_ = 0;

        amount_ = 0;

        grade_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgRandomItemOuterClass.internal_static_msggamedata_MsgRandomItem_descriptor;
      }

      public com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem getDefaultInstanceForType() {
        return com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.getDefaultInstance();
      }

      public com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem build() {
        com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem buildPartial() {
        com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem result = new com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem(this);
        result.type_ = type_;
        result.prob_ = prob_;
        result.uid_ = uid_;
        result.amount_ = amount_;
        result.grade_ = grade_;
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
        if (other instanceof com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem) {
          return mergeFrom((com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem other) {
        if (other == com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.getProb() != 0F) {
          setProb(other.getProb());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getAmount() != 0) {
          setAmount(other.getAmount());
        }
        if (other.grade_ != 0) {
          setGradeValue(other.getGradeValue());
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
        com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.msggamedata.MsgRandomItem.DataType type = 1;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.msggamedata.MsgRandomItem.DataType type = 1;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgRandomItem.DataType type = 1;</code>
       */
      public com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.DataType getType() {
        com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.DataType result = com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.DataType.valueOf(type_);
        return result == null ? com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.DataType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MsgRandomItem.DataType type = 1;</code>
       */
      public Builder setType(com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem.DataType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgRandomItem.DataType type = 1;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private float prob_ ;
      /**
       * <code>float prob = 2;</code>
       */
      public float getProb() {
        return prob_;
      }
      /**
       * <code>float prob = 2;</code>
       */
      public Builder setProb(float value) {
        
        prob_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float prob = 2;</code>
       */
      public Builder clearProb() {
        
        prob_ = 0F;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>fixed32 uid = 3;</code>
       */
      public int getUid() {
        return uid_;
      }
      /**
       * <code>fixed32 uid = 3;</code>
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 uid = 3;</code>
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int amount_ ;
      /**
       * <code>uint32 amount = 4;</code>
       */
      public int getAmount() {
        return amount_;
      }
      /**
       * <code>uint32 amount = 4;</code>
       */
      public Builder setAmount(int value) {
        
        amount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 amount = 4;</code>
       */
      public Builder clearAmount() {
        
        amount_ = 0;
        onChanged();
        return this;
      }

      private int grade_ = 0;
      /**
       * <code>.msggamedata.RewardGrade grade = 5;</code>
       */
      public int getGradeValue() {
        return grade_;
      }
      /**
       * <code>.msggamedata.RewardGrade grade = 5;</code>
       */
      public Builder setGradeValue(int value) {
        grade_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.RewardGrade grade = 5;</code>
       */
      public com.felania.msldb.RewardGradeOuterClass.RewardGrade getGrade() {
        com.felania.msldb.RewardGradeOuterClass.RewardGrade result = com.felania.msldb.RewardGradeOuterClass.RewardGrade.valueOf(grade_);
        return result == null ? com.felania.msldb.RewardGradeOuterClass.RewardGrade.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.RewardGrade grade = 5;</code>
       */
      public Builder setGrade(com.felania.msldb.RewardGradeOuterClass.RewardGrade value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        grade_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.RewardGrade grade = 5;</code>
       */
      public Builder clearGrade() {
        
        grade_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgRandomItem)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgRandomItem)
    private static final com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem();
    }

    public static com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgRandomItem>
        PARSER = new com.google.protobuf.AbstractParser<MsgRandomItem>() {
      public MsgRandomItem parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgRandomItem(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgRandomItem> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgRandomItem> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgRandomItemOuterClass.MsgRandomItem getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgRandomItem_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgRandomItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023MsgRandomItem.proto\022\013msggamedata\032\021Rewa" +
      "rdGrade.proto\"\211\004\n\rMsgRandomItem\0221\n\004type\030" +
      "\001 \001(\0162#.msggamedata.MsgRandomItem.DataTy" +
      "pe\022\014\n\004prob\030\002 \001(\002\022\013\n\003uid\030\003 \001(\007\022\016\n\006amount\030" +
      "\004 \001(\r\022\'\n\005grade\030\005 \001(\0162\030.msggamedata.Rewar" +
      "dGrade\"\360\002\n\010DataType\022\010\n\004None\020\000\022\007\n\003Uid\020\001\022\010" +
      "\n\004Food\020\002\022\010\n\004Gold\020\003\022\n\n\006Energy\020\004\022\007\n\003Gem\020\005\022" +
      "\010\n\004Rune\020\006\022\016\n\nMonsterEgg\020\007\022\r\n\tSoulStone\020\010" +
      "\022\017\n\013BeyondStone\020\t\022\022\n\016InstantMonster\020\n\022\021\n" +
      "\rDungeonTicket\020\013\022\017\n\013ArenaTicket\020\014\022\017\n\013Sta" +
      "rEssence\020\r\022\r\n\tClanPoint\020\016\022\024\n\020MonsterSkil" +
      "lBook\020\017\022\024\n\020MonsterEggHidden\020\020\022\016\n\nSuperSt" +
      "one\020\021\022\023\n\017SuperStoneStuff\020\022\022\017\n\013HeroEssenc" +
      "e\020\023\022\016\n\nRandomRune\020\024\022\021\n\rCostumeTicket\020\025\022\021" +
      "\n\rShowSkillBook\020cB\023\n\021com.felania.msldbb\006" +
      "proto3"
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
          com.felania.msldb.RewardGradeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgRandomItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgRandomItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgRandomItem_descriptor,
        new java.lang.String[] { "Type", "Prob", "Uid", "Amount", "Grade", });
    com.felania.msldb.RewardGradeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
