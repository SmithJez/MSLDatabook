// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspVoteRecommendMonsterParty.proto

package com.felania.msldb;

public final class RspVoteRecommendMonsterPartyOuterClass {
  private RspVoteRecommendMonsterPartyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspVoteRecommendMonsterPartyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspVoteRecommendMonsterParty)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
     */
    boolean hasRecommendMonsterParty();
    /**
     * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
     */
    com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty getRecommendMonsterParty();
    /**
     * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
     */
    com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterPartyOrBuilder getRecommendMonsterPartyOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.RspVoteRecommendMonsterParty}
   */
  public  static final class RspVoteRecommendMonsterParty extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspVoteRecommendMonsterParty)
      RspVoteRecommendMonsterPartyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspVoteRecommendMonsterParty.newBuilder() to construct.
    private RspVoteRecommendMonsterParty(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspVoteRecommendMonsterParty() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspVoteRecommendMonsterParty(
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
              com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty.Builder subBuilder = null;
              if (recommendMonsterParty_ != null) {
                subBuilder = recommendMonsterParty_.toBuilder();
              }
              recommendMonsterParty_ = input.readMessage(com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(recommendMonsterParty_);
                recommendMonsterParty_ = subBuilder.buildPartial();
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
      return com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.internal_static_msggamedata_RspVoteRecommendMonsterParty_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.internal_static_msggamedata_RspVoteRecommendMonsterParty_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty.class, com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty.Builder.class);
    }

    public static final int RECOMMEND_MONSTER_PARTY_FIELD_NUMBER = 1;
    private com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty recommendMonsterParty_;
    /**
     * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
     */
    public boolean hasRecommendMonsterParty() {
      return recommendMonsterParty_ != null;
    }
    /**
     * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
     */
    public com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty getRecommendMonsterParty() {
      return recommendMonsterParty_ == null ? com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty.getDefaultInstance() : recommendMonsterParty_;
    }
    /**
     * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
     */
    public com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterPartyOrBuilder getRecommendMonsterPartyOrBuilder() {
      return getRecommendMonsterParty();
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
      if (recommendMonsterParty_ != null) {
        output.writeMessage(1, getRecommendMonsterParty());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (recommendMonsterParty_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getRecommendMonsterParty());
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
      if (!(obj instanceof com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty other = (com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty) obj;

      boolean result = true;
      result = result && (hasRecommendMonsterParty() == other.hasRecommendMonsterParty());
      if (hasRecommendMonsterParty()) {
        result = result && getRecommendMonsterParty()
            .equals(other.getRecommendMonsterParty());
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
      if (hasRecommendMonsterParty()) {
        hash = (37 * hash) + RECOMMEND_MONSTER_PARTY_FIELD_NUMBER;
        hash = (53 * hash) + getRecommendMonsterParty().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty prototype) {
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
     * Protobuf type {@code msggamedata.RspVoteRecommendMonsterParty}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspVoteRecommendMonsterParty)
        com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterPartyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.internal_static_msggamedata_RspVoteRecommendMonsterParty_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.internal_static_msggamedata_RspVoteRecommendMonsterParty_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty.class, com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty.Builder.class);
      }

      // Construct using com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty.newBuilder()
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
        if (recommendMonsterPartyBuilder_ == null) {
          recommendMonsterParty_ = null;
        } else {
          recommendMonsterParty_ = null;
          recommendMonsterPartyBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.internal_static_msggamedata_RspVoteRecommendMonsterParty_descriptor;
      }

      public com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty getDefaultInstanceForType() {
        return com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty.getDefaultInstance();
      }

      public com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty build() {
        com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty buildPartial() {
        com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty result = new com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty(this);
        if (recommendMonsterPartyBuilder_ == null) {
          result.recommendMonsterParty_ = recommendMonsterParty_;
        } else {
          result.recommendMonsterParty_ = recommendMonsterPartyBuilder_.build();
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
        if (other instanceof com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty) {
          return mergeFrom((com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty other) {
        if (other == com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty.getDefaultInstance()) return this;
        if (other.hasRecommendMonsterParty()) {
          mergeRecommendMonsterParty(other.getRecommendMonsterParty());
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
        com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty recommendMonsterParty_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty, com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty.Builder, com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterPartyOrBuilder> recommendMonsterPartyBuilder_;
      /**
       * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
       */
      public boolean hasRecommendMonsterParty() {
        return recommendMonsterPartyBuilder_ != null || recommendMonsterParty_ != null;
      }
      /**
       * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
       */
      public com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty getRecommendMonsterParty() {
        if (recommendMonsterPartyBuilder_ == null) {
          return recommendMonsterParty_ == null ? com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty.getDefaultInstance() : recommendMonsterParty_;
        } else {
          return recommendMonsterPartyBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
       */
      public Builder setRecommendMonsterParty(com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty value) {
        if (recommendMonsterPartyBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          recommendMonsterParty_ = value;
          onChanged();
        } else {
          recommendMonsterPartyBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
       */
      public Builder setRecommendMonsterParty(
          com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty.Builder builderForValue) {
        if (recommendMonsterPartyBuilder_ == null) {
          recommendMonsterParty_ = builderForValue.build();
          onChanged();
        } else {
          recommendMonsterPartyBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
       */
      public Builder mergeRecommendMonsterParty(com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty value) {
        if (recommendMonsterPartyBuilder_ == null) {
          if (recommendMonsterParty_ != null) {
            recommendMonsterParty_ =
              com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty.newBuilder(recommendMonsterParty_).mergeFrom(value).buildPartial();
          } else {
            recommendMonsterParty_ = value;
          }
          onChanged();
        } else {
          recommendMonsterPartyBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
       */
      public Builder clearRecommendMonsterParty() {
        if (recommendMonsterPartyBuilder_ == null) {
          recommendMonsterParty_ = null;
          onChanged();
        } else {
          recommendMonsterParty_ = null;
          recommendMonsterPartyBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
       */
      public com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty.Builder getRecommendMonsterPartyBuilder() {
        
        onChanged();
        return getRecommendMonsterPartyFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
       */
      public com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterPartyOrBuilder getRecommendMonsterPartyOrBuilder() {
        if (recommendMonsterPartyBuilder_ != null) {
          return recommendMonsterPartyBuilder_.getMessageOrBuilder();
        } else {
          return recommendMonsterParty_ == null ?
              com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty.getDefaultInstance() : recommendMonsterParty_;
        }
      }
      /**
       * <code>.msggamedata.MsgRecommendMonsterParty recommend_monster_party = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty, com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty.Builder, com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterPartyOrBuilder> 
          getRecommendMonsterPartyFieldBuilder() {
        if (recommendMonsterPartyBuilder_ == null) {
          recommendMonsterPartyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty, com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterParty.Builder, com.felania.msldb.MsgRecommendMonsterPartyOuterClass.MsgRecommendMonsterPartyOrBuilder>(
                  getRecommendMonsterParty(),
                  getParentForChildren(),
                  isClean());
          recommendMonsterParty_ = null;
        }
        return recommendMonsterPartyBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.RspVoteRecommendMonsterParty)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspVoteRecommendMonsterParty)
    private static final com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty();
    }

    public static com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspVoteRecommendMonsterParty>
        PARSER = new com.google.protobuf.AbstractParser<RspVoteRecommendMonsterParty>() {
      public RspVoteRecommendMonsterParty parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RspVoteRecommendMonsterParty(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspVoteRecommendMonsterParty> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspVoteRecommendMonsterParty> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspVoteRecommendMonsterPartyOuterClass.RspVoteRecommendMonsterParty getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspVoteRecommendMonsterParty_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspVoteRecommendMonsterParty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"RspVoteRecommendMonsterParty.proto\022\013ms" +
      "ggamedata\032\036MsgRecommendMonsterParty.prot" +
      "o\"f\n\034RspVoteRecommendMonsterParty\022F\n\027rec" +
      "ommend_monster_party\030\001 \001(\0132%.msggamedata" +
      ".MsgRecommendMonsterPartyB\023\n\021com.felania" +
      ".msldbb\006proto3"
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
          com.felania.msldb.MsgRecommendMonsterPartyOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_RspVoteRecommendMonsterParty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspVoteRecommendMonsterParty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspVoteRecommendMonsterParty_descriptor,
        new java.lang.String[] { "RecommendMonsterParty", });
    com.felania.msldb.MsgRecommendMonsterPartyOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
