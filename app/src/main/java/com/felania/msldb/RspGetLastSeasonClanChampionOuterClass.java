// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspGetLastSeasonClanChampion.proto

package com.felania.msldb;

public final class RspGetLastSeasonClanChampionOuterClass {
  private RspGetLastSeasonClanChampionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspGetLastSeasonClanChampionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspGetLastSeasonClanChampion)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
     */
    java.util.List<com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion> 
        getClanChampionListList();
    /**
     * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
     */
    com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion getClanChampionList(int index);
    /**
     * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
     */
    int getClanChampionListCount();
    /**
     * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampionOrBuilder> 
        getClanChampionListOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
     */
    com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampionOrBuilder getClanChampionListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.RspGetLastSeasonClanChampion}
   */
  public  static final class RspGetLastSeasonClanChampion extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspGetLastSeasonClanChampion)
      RspGetLastSeasonClanChampionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspGetLastSeasonClanChampion.newBuilder() to construct.
    private RspGetLastSeasonClanChampion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspGetLastSeasonClanChampion() {
      clanChampionList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspGetLastSeasonClanChampion(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                clanChampionList_ = new java.util.ArrayList<com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion>();
                mutable_bitField0_ |= 0x00000001;
              }
              clanChampionList_.add(
                  input.readMessage(com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          clanChampionList_ = java.util.Collections.unmodifiableList(clanChampionList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.internal_static_msggamedata_RspGetLastSeasonClanChampion_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.internal_static_msggamedata_RspGetLastSeasonClanChampion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion.class, com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion.Builder.class);
    }

    public static final int CLAN_CHAMPION_LIST_FIELD_NUMBER = 1;
    private java.util.List<com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion> clanChampionList_;
    /**
     * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
     */
    public java.util.List<com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion> getClanChampionListList() {
      return clanChampionList_;
    }
    /**
     * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampionOrBuilder> 
        getClanChampionListOrBuilderList() {
      return clanChampionList_;
    }
    /**
     * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
     */
    public int getClanChampionListCount() {
      return clanChampionList_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
     */
    public com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion getClanChampionList(int index) {
      return clanChampionList_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
     */
    public com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampionOrBuilder getClanChampionListOrBuilder(
        int index) {
      return clanChampionList_.get(index);
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
      for (int i = 0; i < clanChampionList_.size(); i++) {
        output.writeMessage(1, clanChampionList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < clanChampionList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, clanChampionList_.get(i));
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
      if (!(obj instanceof com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion other = (com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion) obj;

      boolean result = true;
      result = result && getClanChampionListList()
          .equals(other.getClanChampionListList());
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
      if (getClanChampionListCount() > 0) {
        hash = (37 * hash) + CLAN_CHAMPION_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getClanChampionListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion prototype) {
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
     * Protobuf type {@code msggamedata.RspGetLastSeasonClanChampion}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspGetLastSeasonClanChampion)
        com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.internal_static_msggamedata_RspGetLastSeasonClanChampion_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.internal_static_msggamedata_RspGetLastSeasonClanChampion_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion.class, com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion.Builder.class);
      }

      // Construct using com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion.newBuilder()
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
          getClanChampionListFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (clanChampionListBuilder_ == null) {
          clanChampionList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          clanChampionListBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.internal_static_msggamedata_RspGetLastSeasonClanChampion_descriptor;
      }

      public com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion getDefaultInstanceForType() {
        return com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion.getDefaultInstance();
      }

      public com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion build() {
        com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion buildPartial() {
        com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion result = new com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion(this);
        int from_bitField0_ = bitField0_;
        if (clanChampionListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            clanChampionList_ = java.util.Collections.unmodifiableList(clanChampionList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.clanChampionList_ = clanChampionList_;
        } else {
          result.clanChampionList_ = clanChampionListBuilder_.build();
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
        if (other instanceof com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion) {
          return mergeFrom((com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion other) {
        if (other == com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion.getDefaultInstance()) return this;
        if (clanChampionListBuilder_ == null) {
          if (!other.clanChampionList_.isEmpty()) {
            if (clanChampionList_.isEmpty()) {
              clanChampionList_ = other.clanChampionList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureClanChampionListIsMutable();
              clanChampionList_.addAll(other.clanChampionList_);
            }
            onChanged();
          }
        } else {
          if (!other.clanChampionList_.isEmpty()) {
            if (clanChampionListBuilder_.isEmpty()) {
              clanChampionListBuilder_.dispose();
              clanChampionListBuilder_ = null;
              clanChampionList_ = other.clanChampionList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              clanChampionListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getClanChampionListFieldBuilder() : null;
            } else {
              clanChampionListBuilder_.addAllMessages(other.clanChampionList_);
            }
          }
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
        com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion> clanChampionList_ =
        java.util.Collections.emptyList();
      private void ensureClanChampionListIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          clanChampionList_ = new java.util.ArrayList<com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion>(clanChampionList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion, com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion.Builder, com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampionOrBuilder> clanChampionListBuilder_;

      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion> getClanChampionListList() {
        if (clanChampionListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(clanChampionList_);
        } else {
          return clanChampionListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public int getClanChampionListCount() {
        if (clanChampionListBuilder_ == null) {
          return clanChampionList_.size();
        } else {
          return clanChampionListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion getClanChampionList(int index) {
        if (clanChampionListBuilder_ == null) {
          return clanChampionList_.get(index);
        } else {
          return clanChampionListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public Builder setClanChampionList(
          int index, com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion value) {
        if (clanChampionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClanChampionListIsMutable();
          clanChampionList_.set(index, value);
          onChanged();
        } else {
          clanChampionListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public Builder setClanChampionList(
          int index, com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion.Builder builderForValue) {
        if (clanChampionListBuilder_ == null) {
          ensureClanChampionListIsMutable();
          clanChampionList_.set(index, builderForValue.build());
          onChanged();
        } else {
          clanChampionListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public Builder addClanChampionList(com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion value) {
        if (clanChampionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClanChampionListIsMutable();
          clanChampionList_.add(value);
          onChanged();
        } else {
          clanChampionListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public Builder addClanChampionList(
          int index, com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion value) {
        if (clanChampionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClanChampionListIsMutable();
          clanChampionList_.add(index, value);
          onChanged();
        } else {
          clanChampionListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public Builder addClanChampionList(
          com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion.Builder builderForValue) {
        if (clanChampionListBuilder_ == null) {
          ensureClanChampionListIsMutable();
          clanChampionList_.add(builderForValue.build());
          onChanged();
        } else {
          clanChampionListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public Builder addClanChampionList(
          int index, com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion.Builder builderForValue) {
        if (clanChampionListBuilder_ == null) {
          ensureClanChampionListIsMutable();
          clanChampionList_.add(index, builderForValue.build());
          onChanged();
        } else {
          clanChampionListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public Builder addAllClanChampionList(
          java.lang.Iterable<? extends com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion> values) {
        if (clanChampionListBuilder_ == null) {
          ensureClanChampionListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, clanChampionList_);
          onChanged();
        } else {
          clanChampionListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public Builder clearClanChampionList() {
        if (clanChampionListBuilder_ == null) {
          clanChampionList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          clanChampionListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public Builder removeClanChampionList(int index) {
        if (clanChampionListBuilder_ == null) {
          ensureClanChampionListIsMutable();
          clanChampionList_.remove(index);
          onChanged();
        } else {
          clanChampionListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion.Builder getClanChampionListBuilder(
          int index) {
        return getClanChampionListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampionOrBuilder getClanChampionListOrBuilder(
          int index) {
        if (clanChampionListBuilder_ == null) {
          return clanChampionList_.get(index);  } else {
          return clanChampionListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampionOrBuilder> 
           getClanChampionListOrBuilderList() {
        if (clanChampionListBuilder_ != null) {
          return clanChampionListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(clanChampionList_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion.Builder addClanChampionListBuilder() {
        return getClanChampionListFieldBuilder().addBuilder(
            com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion.Builder addClanChampionListBuilder(
          int index) {
        return getClanChampionListFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgClanLastSeasonChampion clan_champion_list = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion.Builder> 
           getClanChampionListBuilderList() {
        return getClanChampionListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion, com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion.Builder, com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampionOrBuilder> 
          getClanChampionListFieldBuilder() {
        if (clanChampionListBuilder_ == null) {
          clanChampionListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion, com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampion.Builder, com.felania.msldb.MsgClanLastSeasonChampionOuterClass.MsgClanLastSeasonChampionOrBuilder>(
                  clanChampionList_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          clanChampionList_ = null;
        }
        return clanChampionListBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.RspGetLastSeasonClanChampion)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspGetLastSeasonClanChampion)
    private static final com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion();
    }

    public static com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspGetLastSeasonClanChampion>
        PARSER = new com.google.protobuf.AbstractParser<RspGetLastSeasonClanChampion>() {
      public RspGetLastSeasonClanChampion parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RspGetLastSeasonClanChampion(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspGetLastSeasonClanChampion> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspGetLastSeasonClanChampion> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspGetLastSeasonClanChampionOuterClass.RspGetLastSeasonClanChampion getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspGetLastSeasonClanChampion_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspGetLastSeasonClanChampion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"RspGetLastSeasonClanChampion.proto\022\013ms" +
      "ggamedata\032\037MsgClanLastSeasonChampion.pro" +
      "to\"b\n\034RspGetLastSeasonClanChampion\022B\n\022cl" +
      "an_champion_list\030\001 \003(\0132&.msggamedata.Msg" +
      "ClanLastSeasonChampionB\023\n\021com.felania.ms" +
      "ldbb\006proto3"
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
          com.felania.msldb.MsgClanLastSeasonChampionOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_RspGetLastSeasonClanChampion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspGetLastSeasonClanChampion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspGetLastSeasonClanChampion_descriptor,
        new java.lang.String[] { "ClanChampionList", });
    com.felania.msldb.MsgClanLastSeasonChampionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
