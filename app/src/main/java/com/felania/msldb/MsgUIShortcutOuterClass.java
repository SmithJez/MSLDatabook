// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgUIShortcut.proto

package com.felania.msldb;

public final class MsgUIShortcutOuterClass {
  private MsgUIShortcutOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgUIShortcutOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgUIShortcut)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgUIShortcut.Place place = 1;</code>
     */
    int getPlaceValue();
    /**
     * <code>.msggamedata.MsgUIShortcut.Place place = 1;</code>
     */
    com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.Place getPlace();

    /**
     * <code>fixed32 uid = 2;</code>
     */
    int getUid();

    /**
     * <code>.msggamedata.MsgUIShortcut.ShopPlace shop_place = 3;</code>
     */
    int getShopPlaceValue();
    /**
     * <code>.msggamedata.MsgUIShortcut.ShopPlace shop_place = 3;</code>
     */
    com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.ShopPlace getShopPlace();

    /**
     * <code>.msggamedata.StageDifficultyType stage_difficulty_type = 4;</code>
     */
    int getStageDifficultyTypeValue();
    /**
     * <code>.msggamedata.StageDifficultyType stage_difficulty_type = 4;</code>
     */
    com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType getStageDifficultyType();
  }
  /**
   * Protobuf type {@code msggamedata.MsgUIShortcut}
   */
  public  static final class MsgUIShortcut extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgUIShortcut)
      MsgUIShortcutOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgUIShortcut.newBuilder() to construct.
    private MsgUIShortcut(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgUIShortcut() {
      place_ = 0;
      uid_ = 0;
      shopPlace_ = 0;
      stageDifficultyType_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgUIShortcut(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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

              place_ = rawValue;
              break;
            }
            case 21: {

              uid_ = input.readFixed32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              shopPlace_ = rawValue;
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              stageDifficultyType_ = rawValue;
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
      return com.felania.msldb.MsgUIShortcutOuterClass.internal_static_msggamedata_MsgUIShortcut_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgUIShortcutOuterClass.internal_static_msggamedata_MsgUIShortcut_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.class, com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.Builder.class);
    }

    /**
     * Protobuf enum {@code msggamedata.MsgUIShortcut.Place}
     */
    public enum Place
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>PlaceNULL = 0;</code>
       */
      PlaceNULL(0),
      /**
       * <code>P_Revive = 1;</code>
       */
      P_Revive(1),
      /**
       * <code>P_ReviveFestival = 2;</code>
       */
      P_ReviveFestival(2),
      /**
       * <code>P_Stage = 3;</code>
       */
      P_Stage(3),
      /**
       * <code>P_CaptureFestival = 4;</code>
       */
      P_CaptureFestival(4),
      /**
       * <code>P_FriendDungeon = 5;</code>
       */
      P_FriendDungeon(5),
      /**
       * <code>P_GmFriendDungeon = 6;</code>
       */
      P_GmFriendDungeon(6),
      /**
       * <code>P_SuperEvolution = 7;</code>
       */
      P_SuperEvolution(7),
      /**
       * <code>P_Gacha = 8;</code>
       */
      P_Gacha(8),
      /**
       * <code>P_HeroFestival = 9;</code>
       */
      P_HeroFestival(9),
      /**
       * <code>P_Shop = 10;</code>
       */
      P_Shop(10),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>PlaceNULL = 0;</code>
       */
      public static final int PlaceNULL_VALUE = 0;
      /**
       * <code>P_Revive = 1;</code>
       */
      public static final int P_Revive_VALUE = 1;
      /**
       * <code>P_ReviveFestival = 2;</code>
       */
      public static final int P_ReviveFestival_VALUE = 2;
      /**
       * <code>P_Stage = 3;</code>
       */
      public static final int P_Stage_VALUE = 3;
      /**
       * <code>P_CaptureFestival = 4;</code>
       */
      public static final int P_CaptureFestival_VALUE = 4;
      /**
       * <code>P_FriendDungeon = 5;</code>
       */
      public static final int P_FriendDungeon_VALUE = 5;
      /**
       * <code>P_GmFriendDungeon = 6;</code>
       */
      public static final int P_GmFriendDungeon_VALUE = 6;
      /**
       * <code>P_SuperEvolution = 7;</code>
       */
      public static final int P_SuperEvolution_VALUE = 7;
      /**
       * <code>P_Gacha = 8;</code>
       */
      public static final int P_Gacha_VALUE = 8;
      /**
       * <code>P_HeroFestival = 9;</code>
       */
      public static final int P_HeroFestival_VALUE = 9;
      /**
       * <code>P_Shop = 10;</code>
       */
      public static final int P_Shop_VALUE = 10;


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
      public static Place valueOf(int value) {
        return forNumber(value);
      }

      public static Place forNumber(int value) {
        switch (value) {
          case 0: return PlaceNULL;
          case 1: return P_Revive;
          case 2: return P_ReviveFestival;
          case 3: return P_Stage;
          case 4: return P_CaptureFestival;
          case 5: return P_FriendDungeon;
          case 6: return P_GmFriendDungeon;
          case 7: return P_SuperEvolution;
          case 8: return P_Gacha;
          case 9: return P_HeroFestival;
          case 10: return P_Shop;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Place>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Place> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Place>() {
              public Place findValueByNumber(int number) {
                return Place.forNumber(number);
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
        return com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.getDescriptor().getEnumTypes().get(0);
      }

      private static final Place[] VALUES = values();

      public static Place valueOf(
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

      private Place(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:msggamedata.MsgUIShortcut.Place)
    }

    /**
     * Protobuf enum {@code msggamedata.MsgUIShortcut.ShopPlace}
     */
    public enum ShopPlace
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>ShopPlaceNULL = 0;</code>
       */
      ShopPlaceNULL(0),
      /**
       * <code>SP_Package = 1;</code>
       */
      SP_Package(1),
      /**
       * <code>SP_Costume = 2;</code>
       */
      SP_Costume(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>ShopPlaceNULL = 0;</code>
       */
      public static final int ShopPlaceNULL_VALUE = 0;
      /**
       * <code>SP_Package = 1;</code>
       */
      public static final int SP_Package_VALUE = 1;
      /**
       * <code>SP_Costume = 2;</code>
       */
      public static final int SP_Costume_VALUE = 2;


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
      public static ShopPlace valueOf(int value) {
        return forNumber(value);
      }

      public static ShopPlace forNumber(int value) {
        switch (value) {
          case 0: return ShopPlaceNULL;
          case 1: return SP_Package;
          case 2: return SP_Costume;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ShopPlace>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ShopPlace> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ShopPlace>() {
              public ShopPlace findValueByNumber(int number) {
                return ShopPlace.forNumber(number);
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
        return com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.getDescriptor().getEnumTypes().get(1);
      }

      private static final ShopPlace[] VALUES = values();

      public static ShopPlace valueOf(
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

      private ShopPlace(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:msggamedata.MsgUIShortcut.ShopPlace)
    }

    public static final int PLACE_FIELD_NUMBER = 1;
    private int place_;
    /**
     * <code>.msggamedata.MsgUIShortcut.Place place = 1;</code>
     */
    public int getPlaceValue() {
      return place_;
    }
    /**
     * <code>.msggamedata.MsgUIShortcut.Place place = 1;</code>
     */
    public com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.Place getPlace() {
      com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.Place result = com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.Place.valueOf(place_);
      return result == null ? com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.Place.UNRECOGNIZED : result;
    }

    public static final int UID_FIELD_NUMBER = 2;
    private int uid_;
    /**
     * <code>fixed32 uid = 2;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int SHOP_PLACE_FIELD_NUMBER = 3;
    private int shopPlace_;
    /**
     * <code>.msggamedata.MsgUIShortcut.ShopPlace shop_place = 3;</code>
     */
    public int getShopPlaceValue() {
      return shopPlace_;
    }
    /**
     * <code>.msggamedata.MsgUIShortcut.ShopPlace shop_place = 3;</code>
     */
    public com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.ShopPlace getShopPlace() {
      com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.ShopPlace result = com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.ShopPlace.valueOf(shopPlace_);
      return result == null ? com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.ShopPlace.UNRECOGNIZED : result;
    }

    public static final int STAGE_DIFFICULTY_TYPE_FIELD_NUMBER = 4;
    private int stageDifficultyType_;
    /**
     * <code>.msggamedata.StageDifficultyType stage_difficulty_type = 4;</code>
     */
    public int getStageDifficultyTypeValue() {
      return stageDifficultyType_;
    }
    /**
     * <code>.msggamedata.StageDifficultyType stage_difficulty_type = 4;</code>
     */
    public com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType getStageDifficultyType() {
      com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType result = com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.valueOf(stageDifficultyType_);
      return result == null ? com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.UNRECOGNIZED : result;
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
      if (place_ != com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.Place.PlaceNULL.getNumber()) {
        output.writeEnum(1, place_);
      }
      if (uid_ != 0) {
        output.writeFixed32(2, uid_);
      }
      if (shopPlace_ != com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.ShopPlace.ShopPlaceNULL.getNumber()) {
        output.writeEnum(3, shopPlace_);
      }
      if (stageDifficultyType_ != com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.StageDifficultyTypeNULL.getNumber()) {
        output.writeEnum(4, stageDifficultyType_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (place_ != com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.Place.PlaceNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, place_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(2, uid_);
      }
      if (shopPlace_ != com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.ShopPlace.ShopPlaceNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, shopPlace_);
      }
      if (stageDifficultyType_ != com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.StageDifficultyTypeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, stageDifficultyType_);
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
      if (!(obj instanceof com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut other = (com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut) obj;

      boolean result = true;
      result = result && place_ == other.place_;
      result = result && (getUid()
          == other.getUid());
      result = result && shopPlace_ == other.shopPlace_;
      result = result && stageDifficultyType_ == other.stageDifficultyType_;
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
      hash = (37 * hash) + PLACE_FIELD_NUMBER;
      hash = (53 * hash) + place_;
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + SHOP_PLACE_FIELD_NUMBER;
      hash = (53 * hash) + shopPlace_;
      hash = (37 * hash) + STAGE_DIFFICULTY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + stageDifficultyType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut prototype) {
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
     * Protobuf type {@code msggamedata.MsgUIShortcut}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgUIShortcut)
        com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcutOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgUIShortcutOuterClass.internal_static_msggamedata_MsgUIShortcut_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgUIShortcutOuterClass.internal_static_msggamedata_MsgUIShortcut_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.class, com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.Builder.class);
      }

      // Construct using com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.newBuilder()
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
        place_ = 0;

        uid_ = 0;

        shopPlace_ = 0;

        stageDifficultyType_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgUIShortcutOuterClass.internal_static_msggamedata_MsgUIShortcut_descriptor;
      }

      public com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut getDefaultInstanceForType() {
        return com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.getDefaultInstance();
      }

      public com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut build() {
        com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut buildPartial() {
        com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut result = new com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut(this);
        result.place_ = place_;
        result.uid_ = uid_;
        result.shopPlace_ = shopPlace_;
        result.stageDifficultyType_ = stageDifficultyType_;
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
        if (other instanceof com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut) {
          return mergeFrom((com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut other) {
        if (other == com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.getDefaultInstance()) return this;
        if (other.place_ != 0) {
          setPlaceValue(other.getPlaceValue());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.shopPlace_ != 0) {
          setShopPlaceValue(other.getShopPlaceValue());
        }
        if (other.stageDifficultyType_ != 0) {
          setStageDifficultyTypeValue(other.getStageDifficultyTypeValue());
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
        com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int place_ = 0;
      /**
       * <code>.msggamedata.MsgUIShortcut.Place place = 1;</code>
       */
      public int getPlaceValue() {
        return place_;
      }
      /**
       * <code>.msggamedata.MsgUIShortcut.Place place = 1;</code>
       */
      public Builder setPlaceValue(int value) {
        place_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgUIShortcut.Place place = 1;</code>
       */
      public com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.Place getPlace() {
        com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.Place result = com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.Place.valueOf(place_);
        return result == null ? com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.Place.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MsgUIShortcut.Place place = 1;</code>
       */
      public Builder setPlace(com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.Place value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        place_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgUIShortcut.Place place = 1;</code>
       */
      public Builder clearPlace() {
        
        place_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>fixed32 uid = 2;</code>
       */
      public int getUid() {
        return uid_;
      }
      /**
       * <code>fixed32 uid = 2;</code>
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 uid = 2;</code>
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int shopPlace_ = 0;
      /**
       * <code>.msggamedata.MsgUIShortcut.ShopPlace shop_place = 3;</code>
       */
      public int getShopPlaceValue() {
        return shopPlace_;
      }
      /**
       * <code>.msggamedata.MsgUIShortcut.ShopPlace shop_place = 3;</code>
       */
      public Builder setShopPlaceValue(int value) {
        shopPlace_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgUIShortcut.ShopPlace shop_place = 3;</code>
       */
      public com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.ShopPlace getShopPlace() {
        com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.ShopPlace result = com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.ShopPlace.valueOf(shopPlace_);
        return result == null ? com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.ShopPlace.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MsgUIShortcut.ShopPlace shop_place = 3;</code>
       */
      public Builder setShopPlace(com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut.ShopPlace value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        shopPlace_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgUIShortcut.ShopPlace shop_place = 3;</code>
       */
      public Builder clearShopPlace() {
        
        shopPlace_ = 0;
        onChanged();
        return this;
      }

      private int stageDifficultyType_ = 0;
      /**
       * <code>.msggamedata.StageDifficultyType stage_difficulty_type = 4;</code>
       */
      public int getStageDifficultyTypeValue() {
        return stageDifficultyType_;
      }
      /**
       * <code>.msggamedata.StageDifficultyType stage_difficulty_type = 4;</code>
       */
      public Builder setStageDifficultyTypeValue(int value) {
        stageDifficultyType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.StageDifficultyType stage_difficulty_type = 4;</code>
       */
      public com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType getStageDifficultyType() {
        com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType result = com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.valueOf(stageDifficultyType_);
        return result == null ? com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.StageDifficultyType stage_difficulty_type = 4;</code>
       */
      public Builder setStageDifficultyType(com.felania.msldb.StageDifficultyTypeOuterClass.StageDifficultyType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        stageDifficultyType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.StageDifficultyType stage_difficulty_type = 4;</code>
       */
      public Builder clearStageDifficultyType() {
        
        stageDifficultyType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgUIShortcut)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgUIShortcut)
    private static final com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut();
    }

    public static com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgUIShortcut>
        PARSER = new com.google.protobuf.AbstractParser<MsgUIShortcut>() {
      public MsgUIShortcut parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MsgUIShortcut(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgUIShortcut> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgUIShortcut> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgUIShortcutOuterClass.MsgUIShortcut getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgUIShortcut_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgUIShortcut_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023MsgUIShortcut.proto\022\013msggamedata\032\031Stag" +
      "eDifficultyType.proto\"\330\003\n\rMsgUIShortcut\022" +
      "/\n\005place\030\001 \001(\0162 .msggamedata.MsgUIShortc" +
      "ut.Place\022\013\n\003uid\030\002 \001(\007\0228\n\nshop_place\030\003 \001(" +
      "\0162$.msggamedata.MsgUIShortcut.ShopPlace\022" +
      "?\n\025stage_difficulty_type\030\004 \001(\0162 .msggame" +
      "data.StageDifficultyType\"\315\001\n\005Place\022\r\n\tPl" +
      "aceNULL\020\000\022\014\n\010P_Revive\020\001\022\024\n\020P_ReviveFesti" +
      "val\020\002\022\013\n\007P_Stage\020\003\022\025\n\021P_CaptureFestival\020" +
      "\004\022\023\n\017P_FriendDungeon\020\005\022\025\n\021P_GmFriendDung",
      "eon\020\006\022\024\n\020P_SuperEvolution\020\007\022\013\n\007P_Gacha\020\010" +
      "\022\022\n\016P_HeroFestival\020\t\022\n\n\006P_Shop\020\n\">\n\tShop" +
      "Place\022\021\n\rShopPlaceNULL\020\000\022\016\n\nSP_Package\020\001" +
      "\022\016\n\nSP_Costume\020\002B\023\n\021com.felania.msldbb\006p" +
      "roto3"
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
          com.felania.msldb.StageDifficultyTypeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgUIShortcut_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgUIShortcut_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgUIShortcut_descriptor,
        new java.lang.String[] { "Place", "Uid", "ShopPlace", "StageDifficultyType", });
    com.felania.msldb.StageDifficultyTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
