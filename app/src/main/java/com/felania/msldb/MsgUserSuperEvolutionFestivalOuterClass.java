// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgUserSuperEvolutionFestival.proto

package com.felania.msldb;

public final class MsgUserSuperEvolutionFestivalOuterClass {
  private MsgUserSuperEvolutionFestivalOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgUserSuperEvolutionFestivalOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgUserSuperEvolutionFestival)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 festival_id = 1;</code>
     */
    long getFestivalId();

    /**
     * <code>uint32 receive_share_reward_idx = 2;</code>
     */
    int getReceiveShareRewardIdx();

    /**
     * <code>uint32 receive_wish_reward_idx = 3;</code>
     */
    int getReceiveWishRewardIdx();

    /**
     * <code>uint32 receive_super_evolution_reward_state = 4;</code>
     */
    int getReceiveSuperEvolutionRewardState();

    /**
     * <code>uint64 bonus_server_date = 5;</code>
     */
    long getBonusServerDate();
  }
  /**
   * Protobuf type {@code msggamedata.MsgUserSuperEvolutionFestival}
   */
  public  static final class MsgUserSuperEvolutionFestival extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgUserSuperEvolutionFestival)
      MsgUserSuperEvolutionFestivalOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgUserSuperEvolutionFestival.newBuilder() to construct.
    private MsgUserSuperEvolutionFestival(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgUserSuperEvolutionFestival() {
      festivalId_ = 0L;
      receiveShareRewardIdx_ = 0;
      receiveWishRewardIdx_ = 0;
      receiveSuperEvolutionRewardState_ = 0;
      bonusServerDate_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgUserSuperEvolutionFestival(
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

              festivalId_ = input.readUInt64();
              break;
            }
            case 16: {

              receiveShareRewardIdx_ = input.readUInt32();
              break;
            }
            case 24: {

              receiveWishRewardIdx_ = input.readUInt32();
              break;
            }
            case 32: {

              receiveSuperEvolutionRewardState_ = input.readUInt32();
              break;
            }
            case 40: {

              bonusServerDate_ = input.readUInt64();
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
      return com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.internal_static_msggamedata_MsgUserSuperEvolutionFestival_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.internal_static_msggamedata_MsgUserSuperEvolutionFestival_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival.class, com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival.Builder.class);
    }

    public static final int FESTIVAL_ID_FIELD_NUMBER = 1;
    private long festivalId_;
    /**
     * <code>uint64 festival_id = 1;</code>
     */
    public long getFestivalId() {
      return festivalId_;
    }

    public static final int RECEIVE_SHARE_REWARD_IDX_FIELD_NUMBER = 2;
    private int receiveShareRewardIdx_;
    /**
     * <code>uint32 receive_share_reward_idx = 2;</code>
     */
    public int getReceiveShareRewardIdx() {
      return receiveShareRewardIdx_;
    }

    public static final int RECEIVE_WISH_REWARD_IDX_FIELD_NUMBER = 3;
    private int receiveWishRewardIdx_;
    /**
     * <code>uint32 receive_wish_reward_idx = 3;</code>
     */
    public int getReceiveWishRewardIdx() {
      return receiveWishRewardIdx_;
    }

    public static final int RECEIVE_SUPER_EVOLUTION_REWARD_STATE_FIELD_NUMBER = 4;
    private int receiveSuperEvolutionRewardState_;
    /**
     * <code>uint32 receive_super_evolution_reward_state = 4;</code>
     */
    public int getReceiveSuperEvolutionRewardState() {
      return receiveSuperEvolutionRewardState_;
    }

    public static final int BONUS_SERVER_DATE_FIELD_NUMBER = 5;
    private long bonusServerDate_;
    /**
     * <code>uint64 bonus_server_date = 5;</code>
     */
    public long getBonusServerDate() {
      return bonusServerDate_;
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
      if (festivalId_ != 0L) {
        output.writeUInt64(1, festivalId_);
      }
      if (receiveShareRewardIdx_ != 0) {
        output.writeUInt32(2, receiveShareRewardIdx_);
      }
      if (receiveWishRewardIdx_ != 0) {
        output.writeUInt32(3, receiveWishRewardIdx_);
      }
      if (receiveSuperEvolutionRewardState_ != 0) {
        output.writeUInt32(4, receiveSuperEvolutionRewardState_);
      }
      if (bonusServerDate_ != 0L) {
        output.writeUInt64(5, bonusServerDate_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (festivalId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, festivalId_);
      }
      if (receiveShareRewardIdx_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, receiveShareRewardIdx_);
      }
      if (receiveWishRewardIdx_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, receiveWishRewardIdx_);
      }
      if (receiveSuperEvolutionRewardState_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, receiveSuperEvolutionRewardState_);
      }
      if (bonusServerDate_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, bonusServerDate_);
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
      if (!(obj instanceof com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival other = (com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival) obj;

      boolean result = true;
      result = result && (getFestivalId()
          == other.getFestivalId());
      result = result && (getReceiveShareRewardIdx()
          == other.getReceiveShareRewardIdx());
      result = result && (getReceiveWishRewardIdx()
          == other.getReceiveWishRewardIdx());
      result = result && (getReceiveSuperEvolutionRewardState()
          == other.getReceiveSuperEvolutionRewardState());
      result = result && (getBonusServerDate()
          == other.getBonusServerDate());
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
      hash = (37 * hash) + FESTIVAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFestivalId());
      hash = (37 * hash) + RECEIVE_SHARE_REWARD_IDX_FIELD_NUMBER;
      hash = (53 * hash) + getReceiveShareRewardIdx();
      hash = (37 * hash) + RECEIVE_WISH_REWARD_IDX_FIELD_NUMBER;
      hash = (53 * hash) + getReceiveWishRewardIdx();
      hash = (37 * hash) + RECEIVE_SUPER_EVOLUTION_REWARD_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getReceiveSuperEvolutionRewardState();
      hash = (37 * hash) + BONUS_SERVER_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBonusServerDate());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival prototype) {
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
     * Protobuf type {@code msggamedata.MsgUserSuperEvolutionFestival}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgUserSuperEvolutionFestival)
        com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestivalOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.internal_static_msggamedata_MsgUserSuperEvolutionFestival_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.internal_static_msggamedata_MsgUserSuperEvolutionFestival_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival.class, com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival.Builder.class);
      }

      // Construct using com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival.newBuilder()
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
        festivalId_ = 0L;

        receiveShareRewardIdx_ = 0;

        receiveWishRewardIdx_ = 0;

        receiveSuperEvolutionRewardState_ = 0;

        bonusServerDate_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.internal_static_msggamedata_MsgUserSuperEvolutionFestival_descriptor;
      }

      public com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival getDefaultInstanceForType() {
        return com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival.getDefaultInstance();
      }

      public com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival build() {
        com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival buildPartial() {
        com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival result = new com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival(this);
        result.festivalId_ = festivalId_;
        result.receiveShareRewardIdx_ = receiveShareRewardIdx_;
        result.receiveWishRewardIdx_ = receiveWishRewardIdx_;
        result.receiveSuperEvolutionRewardState_ = receiveSuperEvolutionRewardState_;
        result.bonusServerDate_ = bonusServerDate_;
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
        if (other instanceof com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival) {
          return mergeFrom((com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival other) {
        if (other == com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival.getDefaultInstance()) return this;
        if (other.getFestivalId() != 0L) {
          setFestivalId(other.getFestivalId());
        }
        if (other.getReceiveShareRewardIdx() != 0) {
          setReceiveShareRewardIdx(other.getReceiveShareRewardIdx());
        }
        if (other.getReceiveWishRewardIdx() != 0) {
          setReceiveWishRewardIdx(other.getReceiveWishRewardIdx());
        }
        if (other.getReceiveSuperEvolutionRewardState() != 0) {
          setReceiveSuperEvolutionRewardState(other.getReceiveSuperEvolutionRewardState());
        }
        if (other.getBonusServerDate() != 0L) {
          setBonusServerDate(other.getBonusServerDate());
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
        com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long festivalId_ ;
      /**
       * <code>uint64 festival_id = 1;</code>
       */
      public long getFestivalId() {
        return festivalId_;
      }
      /**
       * <code>uint64 festival_id = 1;</code>
       */
      public Builder setFestivalId(long value) {
        
        festivalId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 festival_id = 1;</code>
       */
      public Builder clearFestivalId() {
        
        festivalId_ = 0L;
        onChanged();
        return this;
      }

      private int receiveShareRewardIdx_ ;
      /**
       * <code>uint32 receive_share_reward_idx = 2;</code>
       */
      public int getReceiveShareRewardIdx() {
        return receiveShareRewardIdx_;
      }
      /**
       * <code>uint32 receive_share_reward_idx = 2;</code>
       */
      public Builder setReceiveShareRewardIdx(int value) {
        
        receiveShareRewardIdx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 receive_share_reward_idx = 2;</code>
       */
      public Builder clearReceiveShareRewardIdx() {
        
        receiveShareRewardIdx_ = 0;
        onChanged();
        return this;
      }

      private int receiveWishRewardIdx_ ;
      /**
       * <code>uint32 receive_wish_reward_idx = 3;</code>
       */
      public int getReceiveWishRewardIdx() {
        return receiveWishRewardIdx_;
      }
      /**
       * <code>uint32 receive_wish_reward_idx = 3;</code>
       */
      public Builder setReceiveWishRewardIdx(int value) {
        
        receiveWishRewardIdx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 receive_wish_reward_idx = 3;</code>
       */
      public Builder clearReceiveWishRewardIdx() {
        
        receiveWishRewardIdx_ = 0;
        onChanged();
        return this;
      }

      private int receiveSuperEvolutionRewardState_ ;
      /**
       * <code>uint32 receive_super_evolution_reward_state = 4;</code>
       */
      public int getReceiveSuperEvolutionRewardState() {
        return receiveSuperEvolutionRewardState_;
      }
      /**
       * <code>uint32 receive_super_evolution_reward_state = 4;</code>
       */
      public Builder setReceiveSuperEvolutionRewardState(int value) {
        
        receiveSuperEvolutionRewardState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 receive_super_evolution_reward_state = 4;</code>
       */
      public Builder clearReceiveSuperEvolutionRewardState() {
        
        receiveSuperEvolutionRewardState_ = 0;
        onChanged();
        return this;
      }

      private long bonusServerDate_ ;
      /**
       * <code>uint64 bonus_server_date = 5;</code>
       */
      public long getBonusServerDate() {
        return bonusServerDate_;
      }
      /**
       * <code>uint64 bonus_server_date = 5;</code>
       */
      public Builder setBonusServerDate(long value) {
        
        bonusServerDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 bonus_server_date = 5;</code>
       */
      public Builder clearBonusServerDate() {
        
        bonusServerDate_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgUserSuperEvolutionFestival)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgUserSuperEvolutionFestival)
    private static final com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival();
    }

    public static com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgUserSuperEvolutionFestival>
        PARSER = new com.google.protobuf.AbstractParser<MsgUserSuperEvolutionFestival>() {
      public MsgUserSuperEvolutionFestival parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgUserSuperEvolutionFestival(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgUserSuperEvolutionFestival> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgUserSuperEvolutionFestival> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgUserSuperEvolutionFestivalOuterClass.MsgUserSuperEvolutionFestival getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgUserSuperEvolutionFestival_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgUserSuperEvolutionFestival_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#MsgUserSuperEvolutionFestival.proto\022\013m" +
      "sggamedata\"\300\001\n\035MsgUserSuperEvolutionFest" +
      "ival\022\023\n\013festival_id\030\001 \001(\004\022 \n\030receive_sha" +
      "re_reward_idx\030\002 \001(\r\022\037\n\027receive_wish_rewa" +
      "rd_idx\030\003 \001(\r\022,\n$receive_super_evolution_" +
      "reward_state\030\004 \001(\r\022\031\n\021bonus_server_date\030" +
      "\005 \001(\004B\023\n\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_MsgUserSuperEvolutionFestival_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgUserSuperEvolutionFestival_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgUserSuperEvolutionFestival_descriptor,
        new java.lang.String[] { "FestivalId", "ReceiveShareRewardIdx", "ReceiveWishRewardIdx", "ReceiveSuperEvolutionRewardState", "BonusServerDate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
