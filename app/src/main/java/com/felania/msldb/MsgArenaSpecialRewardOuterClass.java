// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgArenaSpecialReward.proto

package com.felania.msldb;

public final class MsgArenaSpecialRewardOuterClass {
  private MsgArenaSpecialRewardOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgArenaSpecialRewardOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgArenaSpecialReward)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgShopItem.ItemType item_type = 1;</code>
     */
    int getItemTypeValue();
    /**
     * <code>.msggamedata.MsgShopItem.ItemType item_type = 1;</code>
     */
    com.felania.msldb.MsgShopItemOuterClass.MsgShopItem.ItemType getItemType();

    /**
     * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
     */
    boolean hasUidAndAmount();
    /**
     * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
     */
    com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount getUidAndAmount();
    /**
     * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
     */
    com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder getUidAndAmountOrBuilder();

    /**
     * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
     */
    boolean hasInstantMonsterMeta();
    /**
     * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
     */
    com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster getInstantMonsterMeta();
    /**
     * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
     */
    com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonsterOrBuilder getInstantMonsterMetaOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.MsgArenaSpecialReward}
   */
  public  static final class MsgArenaSpecialReward extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgArenaSpecialReward)
      MsgArenaSpecialRewardOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgArenaSpecialReward.newBuilder() to construct.
    private MsgArenaSpecialReward(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgArenaSpecialReward() {
      itemType_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgArenaSpecialReward(
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

              itemType_ = rawValue;
              break;
            }
            case 18: {
              com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder subBuilder = null;
              if (uidAndAmount_ != null) {
                subBuilder = uidAndAmount_.toBuilder();
              }
              uidAndAmount_ = input.readMessage(com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(uidAndAmount_);
                uidAndAmount_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.Builder subBuilder = null;
              if (instantMonsterMeta_ != null) {
                subBuilder = instantMonsterMeta_.toBuilder();
              }
              instantMonsterMeta_ = input.readMessage(com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(instantMonsterMeta_);
                instantMonsterMeta_ = subBuilder.buildPartial();
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
      return com.felania.msldb.MsgArenaSpecialRewardOuterClass.internal_static_msggamedata_MsgArenaSpecialReward_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgArenaSpecialRewardOuterClass.internal_static_msggamedata_MsgArenaSpecialReward_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward.class, com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward.Builder.class);
    }

    public static final int ITEM_TYPE_FIELD_NUMBER = 1;
    private int itemType_;
    /**
     * <code>.msggamedata.MsgShopItem.ItemType item_type = 1;</code>
     */
    public int getItemTypeValue() {
      return itemType_;
    }
    /**
     * <code>.msggamedata.MsgShopItem.ItemType item_type = 1;</code>
     */
    public com.felania.msldb.MsgShopItemOuterClass.MsgShopItem.ItemType getItemType() {
      com.felania.msldb.MsgShopItemOuterClass.MsgShopItem.ItemType result = com.felania.msldb.MsgShopItemOuterClass.MsgShopItem.ItemType.valueOf(itemType_);
      return result == null ? com.felania.msldb.MsgShopItemOuterClass.MsgShopItem.ItemType.UNRECOGNIZED : result;
    }

    public static final int UID_AND_AMOUNT_FIELD_NUMBER = 2;
    private com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount uidAndAmount_;
    /**
     * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
     */
    public boolean hasUidAndAmount() {
      return uidAndAmount_ != null;
    }
    /**
     * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
     */
    public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount getUidAndAmount() {
      return uidAndAmount_ == null ? com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.getDefaultInstance() : uidAndAmount_;
    }
    /**
     * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
     */
    public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder getUidAndAmountOrBuilder() {
      return getUidAndAmount();
    }

    public static final int INSTANT_MONSTER_META_FIELD_NUMBER = 3;
    private com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster instantMonsterMeta_;
    /**
     * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
     */
    public boolean hasInstantMonsterMeta() {
      return instantMonsterMeta_ != null;
    }
    /**
     * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
     */
    public com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster getInstantMonsterMeta() {
      return instantMonsterMeta_ == null ? com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.getDefaultInstance() : instantMonsterMeta_;
    }
    /**
     * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
     */
    public com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonsterOrBuilder getInstantMonsterMetaOrBuilder() {
      return getInstantMonsterMeta();
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
      if (itemType_ != com.felania.msldb.MsgShopItemOuterClass.MsgShopItem.ItemType.ItemTypeNULL.getNumber()) {
        output.writeEnum(1, itemType_);
      }
      if (uidAndAmount_ != null) {
        output.writeMessage(2, getUidAndAmount());
      }
      if (instantMonsterMeta_ != null) {
        output.writeMessage(3, getInstantMonsterMeta());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (itemType_ != com.felania.msldb.MsgShopItemOuterClass.MsgShopItem.ItemType.ItemTypeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, itemType_);
      }
      if (uidAndAmount_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getUidAndAmount());
      }
      if (instantMonsterMeta_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getInstantMonsterMeta());
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
      if (!(obj instanceof com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward other = (com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward) obj;

      boolean result = true;
      result = result && itemType_ == other.itemType_;
      result = result && (hasUidAndAmount() == other.hasUidAndAmount());
      if (hasUidAndAmount()) {
        result = result && getUidAndAmount()
            .equals(other.getUidAndAmount());
      }
      result = result && (hasInstantMonsterMeta() == other.hasInstantMonsterMeta());
      if (hasInstantMonsterMeta()) {
        result = result && getInstantMonsterMeta()
            .equals(other.getInstantMonsterMeta());
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
      hash = (37 * hash) + ITEM_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + itemType_;
      if (hasUidAndAmount()) {
        hash = (37 * hash) + UID_AND_AMOUNT_FIELD_NUMBER;
        hash = (53 * hash) + getUidAndAmount().hashCode();
      }
      if (hasInstantMonsterMeta()) {
        hash = (37 * hash) + INSTANT_MONSTER_META_FIELD_NUMBER;
        hash = (53 * hash) + getInstantMonsterMeta().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward prototype) {
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
     * Protobuf type {@code msggamedata.MsgArenaSpecialReward}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgArenaSpecialReward)
        com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialRewardOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgArenaSpecialRewardOuterClass.internal_static_msggamedata_MsgArenaSpecialReward_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgArenaSpecialRewardOuterClass.internal_static_msggamedata_MsgArenaSpecialReward_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward.class, com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward.Builder.class);
      }

      // Construct using com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward.newBuilder()
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
        itemType_ = 0;

        if (uidAndAmountBuilder_ == null) {
          uidAndAmount_ = null;
        } else {
          uidAndAmount_ = null;
          uidAndAmountBuilder_ = null;
        }
        if (instantMonsterMetaBuilder_ == null) {
          instantMonsterMeta_ = null;
        } else {
          instantMonsterMeta_ = null;
          instantMonsterMetaBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgArenaSpecialRewardOuterClass.internal_static_msggamedata_MsgArenaSpecialReward_descriptor;
      }

      public com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward getDefaultInstanceForType() {
        return com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward.getDefaultInstance();
      }

      public com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward build() {
        com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward buildPartial() {
        com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward result = new com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward(this);
        result.itemType_ = itemType_;
        if (uidAndAmountBuilder_ == null) {
          result.uidAndAmount_ = uidAndAmount_;
        } else {
          result.uidAndAmount_ = uidAndAmountBuilder_.build();
        }
        if (instantMonsterMetaBuilder_ == null) {
          result.instantMonsterMeta_ = instantMonsterMeta_;
        } else {
          result.instantMonsterMeta_ = instantMonsterMetaBuilder_.build();
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
        if (other instanceof com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward) {
          return mergeFrom((com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward other) {
        if (other == com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward.getDefaultInstance()) return this;
        if (other.itemType_ != 0) {
          setItemTypeValue(other.getItemTypeValue());
        }
        if (other.hasUidAndAmount()) {
          mergeUidAndAmount(other.getUidAndAmount());
        }
        if (other.hasInstantMonsterMeta()) {
          mergeInstantMonsterMeta(other.getInstantMonsterMeta());
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
        com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int itemType_ = 0;
      /**
       * <code>.msggamedata.MsgShopItem.ItemType item_type = 1;</code>
       */
      public int getItemTypeValue() {
        return itemType_;
      }
      /**
       * <code>.msggamedata.MsgShopItem.ItemType item_type = 1;</code>
       */
      public Builder setItemTypeValue(int value) {
        itemType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgShopItem.ItemType item_type = 1;</code>
       */
      public com.felania.msldb.MsgShopItemOuterClass.MsgShopItem.ItemType getItemType() {
        com.felania.msldb.MsgShopItemOuterClass.MsgShopItem.ItemType result = com.felania.msldb.MsgShopItemOuterClass.MsgShopItem.ItemType.valueOf(itemType_);
        return result == null ? com.felania.msldb.MsgShopItemOuterClass.MsgShopItem.ItemType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MsgShopItem.ItemType item_type = 1;</code>
       */
      public Builder setItemType(com.felania.msldb.MsgShopItemOuterClass.MsgShopItem.ItemType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        itemType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgShopItem.ItemType item_type = 1;</code>
       */
      public Builder clearItemType() {
        
        itemType_ = 0;
        onChanged();
        return this;
      }

      private com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount uidAndAmount_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder> uidAndAmountBuilder_;
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
       */
      public boolean hasUidAndAmount() {
        return uidAndAmountBuilder_ != null || uidAndAmount_ != null;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
       */
      public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount getUidAndAmount() {
        if (uidAndAmountBuilder_ == null) {
          return uidAndAmount_ == null ? com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.getDefaultInstance() : uidAndAmount_;
        } else {
          return uidAndAmountBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
       */
      public Builder setUidAndAmount(com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount value) {
        if (uidAndAmountBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          uidAndAmount_ = value;
          onChanged();
        } else {
          uidAndAmountBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
       */
      public Builder setUidAndAmount(
          com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder builderForValue) {
        if (uidAndAmountBuilder_ == null) {
          uidAndAmount_ = builderForValue.build();
          onChanged();
        } else {
          uidAndAmountBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
       */
      public Builder mergeUidAndAmount(com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount value) {
        if (uidAndAmountBuilder_ == null) {
          if (uidAndAmount_ != null) {
            uidAndAmount_ =
              com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.newBuilder(uidAndAmount_).mergeFrom(value).buildPartial();
          } else {
            uidAndAmount_ = value;
          }
          onChanged();
        } else {
          uidAndAmountBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
       */
      public Builder clearUidAndAmount() {
        if (uidAndAmountBuilder_ == null) {
          uidAndAmount_ = null;
          onChanged();
        } else {
          uidAndAmount_ = null;
          uidAndAmountBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
       */
      public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder getUidAndAmountBuilder() {
        
        onChanged();
        return getUidAndAmountFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
       */
      public com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder getUidAndAmountOrBuilder() {
        if (uidAndAmountBuilder_ != null) {
          return uidAndAmountBuilder_.getMessageOrBuilder();
        } else {
          return uidAndAmount_ == null ?
              com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.getDefaultInstance() : uidAndAmount_;
        }
      }
      /**
       * <code>.msggamedata.MsgUidAndAmount uid_and_amount = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder> 
          getUidAndAmountFieldBuilder() {
        if (uidAndAmountBuilder_ == null) {
          uidAndAmountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmount.Builder, com.felania.msldb.MsgUidAndAmountOuterClass.MsgUidAndAmountOrBuilder>(
                  getUidAndAmount(),
                  getParentForChildren(),
                  isClean());
          uidAndAmount_ = null;
        }
        return uidAndAmountBuilder_;
      }

      private com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster instantMonsterMeta_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster, com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.Builder, com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonsterOrBuilder> instantMonsterMetaBuilder_;
      /**
       * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
       */
      public boolean hasInstantMonsterMeta() {
        return instantMonsterMetaBuilder_ != null || instantMonsterMeta_ != null;
      }
      /**
       * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
       */
      public com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster getInstantMonsterMeta() {
        if (instantMonsterMetaBuilder_ == null) {
          return instantMonsterMeta_ == null ? com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.getDefaultInstance() : instantMonsterMeta_;
        } else {
          return instantMonsterMetaBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
       */
      public Builder setInstantMonsterMeta(com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster value) {
        if (instantMonsterMetaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          instantMonsterMeta_ = value;
          onChanged();
        } else {
          instantMonsterMetaBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
       */
      public Builder setInstantMonsterMeta(
          com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.Builder builderForValue) {
        if (instantMonsterMetaBuilder_ == null) {
          instantMonsterMeta_ = builderForValue.build();
          onChanged();
        } else {
          instantMonsterMetaBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
       */
      public Builder mergeInstantMonsterMeta(com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster value) {
        if (instantMonsterMetaBuilder_ == null) {
          if (instantMonsterMeta_ != null) {
            instantMonsterMeta_ =
              com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.newBuilder(instantMonsterMeta_).mergeFrom(value).buildPartial();
          } else {
            instantMonsterMeta_ = value;
          }
          onChanged();
        } else {
          instantMonsterMetaBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
       */
      public Builder clearInstantMonsterMeta() {
        if (instantMonsterMetaBuilder_ == null) {
          instantMonsterMeta_ = null;
          onChanged();
        } else {
          instantMonsterMeta_ = null;
          instantMonsterMetaBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
       */
      public com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.Builder getInstantMonsterMetaBuilder() {
        
        onChanged();
        return getInstantMonsterMetaFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
       */
      public com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonsterOrBuilder getInstantMonsterMetaOrBuilder() {
        if (instantMonsterMetaBuilder_ != null) {
          return instantMonsterMetaBuilder_.getMessageOrBuilder();
        } else {
          return instantMonsterMeta_ == null ?
              com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.getDefaultInstance() : instantMonsterMeta_;
        }
      }
      /**
       * <code>.msggamedata.MsgShopItemMetaInstantMonster instant_monster_meta = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster, com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.Builder, com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonsterOrBuilder> 
          getInstantMonsterMetaFieldBuilder() {
        if (instantMonsterMetaBuilder_ == null) {
          instantMonsterMetaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster, com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonster.Builder, com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.MsgShopItemMetaInstantMonsterOrBuilder>(
                  getInstantMonsterMeta(),
                  getParentForChildren(),
                  isClean());
          instantMonsterMeta_ = null;
        }
        return instantMonsterMetaBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgArenaSpecialReward)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgArenaSpecialReward)
    private static final com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward();
    }

    public static com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgArenaSpecialReward>
        PARSER = new com.google.protobuf.AbstractParser<MsgArenaSpecialReward>() {
      public MsgArenaSpecialReward parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgArenaSpecialReward(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgArenaSpecialReward> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgArenaSpecialReward> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgArenaSpecialRewardOuterClass.MsgArenaSpecialReward getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgArenaSpecialReward_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgArenaSpecialReward_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033MsgArenaSpecialReward.proto\022\013msggameda" +
      "ta\032\021MsgShopItem.proto\032\025MsgUidAndAmount.p" +
      "roto\032#MsgShopItemMetaInstantMonster.prot" +
      "o\"\315\001\n\025MsgArenaSpecialReward\0224\n\titem_type" +
      "\030\001 \001(\0162!.msggamedata.MsgShopItem.ItemTyp" +
      "e\0224\n\016uid_and_amount\030\002 \001(\0132\034.msggamedata." +
      "MsgUidAndAmount\022H\n\024instant_monster_meta\030" +
      "\003 \001(\0132*.msggamedata.MsgShopItemMetaInsta" +
      "ntMonsterB\023\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.MsgShopItemOuterClass.getDescriptor(),
          com.felania.msldb.MsgUidAndAmountOuterClass.getDescriptor(),
          com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgArenaSpecialReward_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgArenaSpecialReward_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgArenaSpecialReward_descriptor,
        new java.lang.String[] { "ItemType", "UidAndAmount", "InstantMonsterMeta", });
    com.felania.msldb.MsgShopItemOuterClass.getDescriptor();
    com.felania.msldb.MsgUidAndAmountOuterClass.getDescriptor();
    com.felania.msldb.MsgShopItemMetaInstantMonsterOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
