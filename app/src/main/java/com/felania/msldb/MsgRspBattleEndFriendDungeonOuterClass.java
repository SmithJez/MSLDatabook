// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgRspBattleEndFriendDungeon.proto

package com.felania.msldb;

public final class MsgRspBattleEndFriendDungeonOuterClass {
  private MsgRspBattleEndFriendDungeonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgRspBattleEndFriendDungeonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgRspBattleEndFriendDungeon)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
     */
    boolean hasInfo();
    /**
     * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
     */
    com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo getInfo();
    /**
     * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
     */
    com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfoOrBuilder getInfoOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.MsgRspBattleEndFriendDungeon}
   */
  public  static final class MsgRspBattleEndFriendDungeon extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgRspBattleEndFriendDungeon)
      MsgRspBattleEndFriendDungeonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgRspBattleEndFriendDungeon.newBuilder() to construct.
    private MsgRspBattleEndFriendDungeon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgRspBattleEndFriendDungeon() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgRspBattleEndFriendDungeon(
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
              com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo.Builder subBuilder = null;
              if (info_ != null) {
                subBuilder = info_.toBuilder();
              }
              info_ = input.readMessage(com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(info_);
                info_ = subBuilder.buildPartial();
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
      return com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.internal_static_msggamedata_MsgRspBattleEndFriendDungeon_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.internal_static_msggamedata_MsgRspBattleEndFriendDungeon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon.class, com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon.Builder.class);
    }

    public static final int INFO_FIELD_NUMBER = 1;
    private com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo info_;
    /**
     * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
     */
    public boolean hasInfo() {
      return info_ != null;
    }
    /**
     * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
     */
    public com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo getInfo() {
      return info_ == null ? com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo.getDefaultInstance() : info_;
    }
    /**
     * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
     */
    public com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfoOrBuilder getInfoOrBuilder() {
      return getInfo();
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
      if (info_ != null) {
        output.writeMessage(1, getInfo());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (info_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getInfo());
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
      if (!(obj instanceof com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon other = (com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon) obj;

      boolean result = true;
      result = result && (hasInfo() == other.hasInfo());
      if (hasInfo()) {
        result = result && getInfo()
            .equals(other.getInfo());
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
      if (hasInfo()) {
        hash = (37 * hash) + INFO_FIELD_NUMBER;
        hash = (53 * hash) + getInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon prototype) {
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
     * Protobuf type {@code msggamedata.MsgRspBattleEndFriendDungeon}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgRspBattleEndFriendDungeon)
        com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.internal_static_msggamedata_MsgRspBattleEndFriendDungeon_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.internal_static_msggamedata_MsgRspBattleEndFriendDungeon_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon.class, com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon.Builder.class);
      }

      // Construct using com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon.newBuilder()
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
        if (infoBuilder_ == null) {
          info_ = null;
        } else {
          info_ = null;
          infoBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.internal_static_msggamedata_MsgRspBattleEndFriendDungeon_descriptor;
      }

      public com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon getDefaultInstanceForType() {
        return com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon.getDefaultInstance();
      }

      public com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon build() {
        com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon buildPartial() {
        com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon result = new com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon(this);
        if (infoBuilder_ == null) {
          result.info_ = info_;
        } else {
          result.info_ = infoBuilder_.build();
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
        if (other instanceof com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon) {
          return mergeFrom((com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon other) {
        if (other == com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon.getDefaultInstance()) return this;
        if (other.hasInfo()) {
          mergeInfo(other.getInfo());
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
        com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo info_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo, com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo.Builder, com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfoOrBuilder> infoBuilder_;
      /**
       * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
       */
      public boolean hasInfo() {
        return infoBuilder_ != null || info_ != null;
      }
      /**
       * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
       */
      public com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo getInfo() {
        if (infoBuilder_ == null) {
          return info_ == null ? com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo.getDefaultInstance() : info_;
        } else {
          return infoBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
       */
      public Builder setInfo(com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo value) {
        if (infoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          info_ = value;
          onChanged();
        } else {
          infoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
       */
      public Builder setInfo(
          com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo.Builder builderForValue) {
        if (infoBuilder_ == null) {
          info_ = builderForValue.build();
          onChanged();
        } else {
          infoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
       */
      public Builder mergeInfo(com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo value) {
        if (infoBuilder_ == null) {
          if (info_ != null) {
            info_ =
              com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo.newBuilder(info_).mergeFrom(value).buildPartial();
          } else {
            info_ = value;
          }
          onChanged();
        } else {
          infoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
       */
      public Builder clearInfo() {
        if (infoBuilder_ == null) {
          info_ = null;
          onChanged();
        } else {
          info_ = null;
          infoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
       */
      public com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo.Builder getInfoBuilder() {
        
        onChanged();
        return getInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
       */
      public com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfoOrBuilder getInfoOrBuilder() {
        if (infoBuilder_ != null) {
          return infoBuilder_.getMessageOrBuilder();
        } else {
          return info_ == null ?
              com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo.getDefaultInstance() : info_;
        }
      }
      /**
       * <code>.msggamedata.MsgBattleEndBasicInfo info = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo, com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo.Builder, com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfoOrBuilder> 
          getInfoFieldBuilder() {
        if (infoBuilder_ == null) {
          infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo, com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfo.Builder, com.felania.msldb.MsgBattleEndBasicInfoOuterClass.MsgBattleEndBasicInfoOrBuilder>(
                  getInfo(),
                  getParentForChildren(),
                  isClean());
          info_ = null;
        }
        return infoBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgRspBattleEndFriendDungeon)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgRspBattleEndFriendDungeon)
    private static final com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon();
    }

    public static com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgRspBattleEndFriendDungeon>
        PARSER = new com.google.protobuf.AbstractParser<MsgRspBattleEndFriendDungeon>() {
      public MsgRspBattleEndFriendDungeon parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgRspBattleEndFriendDungeon(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgRspBattleEndFriendDungeon> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgRspBattleEndFriendDungeon> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgRspBattleEndFriendDungeonOuterClass.MsgRspBattleEndFriendDungeon getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgRspBattleEndFriendDungeon_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgRspBattleEndFriendDungeon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"MsgRspBattleEndFriendDungeon.proto\022\013ms" +
      "ggamedata\032\033MsgBattleEndBasicInfo.proto\"P" +
      "\n\034MsgRspBattleEndFriendDungeon\0220\n\004info\030\001" +
      " \001(\0132\".msggamedata.MsgBattleEndBasicInfo" +
      "B\023\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.MsgBattleEndBasicInfoOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgRspBattleEndFriendDungeon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgRspBattleEndFriendDungeon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgRspBattleEndFriendDungeon_descriptor,
        new java.lang.String[] { "Info", });
    com.felania.msldb.MsgBattleEndBasicInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
