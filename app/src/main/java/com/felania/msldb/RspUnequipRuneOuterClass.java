// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspUnequipRune.proto

package com.felania.msldb;

public final class RspUnequipRuneOuterClass {
  private RspUnequipRuneOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspUnequipRuneOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspUnequipRune)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgUser user = 1;</code>
     */
    boolean hasUser();
    /**
     * <code>.msggamedata.MsgUser user = 1;</code>
     */
    com.felania.msldb.MsgUserOuterClass.MsgUser getUser();
    /**
     * <code>.msggamedata.MsgUser user = 1;</code>
     */
    com.felania.msldb.MsgUserOuterClass.MsgUserOrBuilder getUserOrBuilder();

    /**
     * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
     */
    boolean hasUserMonster();
    /**
     * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
     */
    com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster getUserMonster();
    /**
     * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
     */
    com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonsterOrBuilder getUserMonsterOrBuilder();

    /**
     * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
     */
    boolean hasUserRune();
    /**
     * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
     */
    com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune getUserRune();
    /**
     * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
     */
    com.felania.msldb.MsgUserRuneOuterClass.MsgUserRuneOrBuilder getUserRuneOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.RspUnequipRune}
   */
  public  static final class RspUnequipRune extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspUnequipRune)
      RspUnequipRuneOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspUnequipRune.newBuilder() to construct.
    private RspUnequipRune(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspUnequipRune() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspUnequipRune(
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
              com.felania.msldb.MsgUserOuterClass.MsgUser.Builder subBuilder = null;
              if (user_ != null) {
                subBuilder = user_.toBuilder();
              }
              user_ = input.readMessage(com.felania.msldb.MsgUserOuterClass.MsgUser.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(user_);
                user_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster.Builder subBuilder = null;
              if (userMonster_ != null) {
                subBuilder = userMonster_.toBuilder();
              }
              userMonster_ = input.readMessage(com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(userMonster_);
                userMonster_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune.Builder subBuilder = null;
              if (userRune_ != null) {
                subBuilder = userRune_.toBuilder();
              }
              userRune_ = input.readMessage(com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(userRune_);
                userRune_ = subBuilder.buildPartial();
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
      return com.felania.msldb.RspUnequipRuneOuterClass.internal_static_msggamedata_RspUnequipRune_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspUnequipRuneOuterClass.internal_static_msggamedata_RspUnequipRune_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune.class, com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune.Builder.class);
    }

    public static final int USER_FIELD_NUMBER = 1;
    private com.felania.msldb.MsgUserOuterClass.MsgUser user_;
    /**
     * <code>.msggamedata.MsgUser user = 1;</code>
     */
    public boolean hasUser() {
      return user_ != null;
    }
    /**
     * <code>.msggamedata.MsgUser user = 1;</code>
     */
    public com.felania.msldb.MsgUserOuterClass.MsgUser getUser() {
      return user_ == null ? com.felania.msldb.MsgUserOuterClass.MsgUser.getDefaultInstance() : user_;
    }
    /**
     * <code>.msggamedata.MsgUser user = 1;</code>
     */
    public com.felania.msldb.MsgUserOuterClass.MsgUserOrBuilder getUserOrBuilder() {
      return getUser();
    }

    public static final int USER_MONSTER_FIELD_NUMBER = 2;
    private com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster userMonster_;
    /**
     * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
     */
    public boolean hasUserMonster() {
      return userMonster_ != null;
    }
    /**
     * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
     */
    public com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster getUserMonster() {
      return userMonster_ == null ? com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster.getDefaultInstance() : userMonster_;
    }
    /**
     * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
     */
    public com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonsterOrBuilder getUserMonsterOrBuilder() {
      return getUserMonster();
    }

    public static final int USER_RUNE_FIELD_NUMBER = 3;
    private com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune userRune_;
    /**
     * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
     */
    public boolean hasUserRune() {
      return userRune_ != null;
    }
    /**
     * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
     */
    public com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune getUserRune() {
      return userRune_ == null ? com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune.getDefaultInstance() : userRune_;
    }
    /**
     * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
     */
    public com.felania.msldb.MsgUserRuneOuterClass.MsgUserRuneOrBuilder getUserRuneOrBuilder() {
      return getUserRune();
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
      if (user_ != null) {
        output.writeMessage(1, getUser());
      }
      if (userMonster_ != null) {
        output.writeMessage(2, getUserMonster());
      }
      if (userRune_ != null) {
        output.writeMessage(3, getUserRune());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (user_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getUser());
      }
      if (userMonster_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getUserMonster());
      }
      if (userRune_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getUserRune());
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
      if (!(obj instanceof com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune other = (com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune) obj;

      boolean result = true;
      result = result && (hasUser() == other.hasUser());
      if (hasUser()) {
        result = result && getUser()
            .equals(other.getUser());
      }
      result = result && (hasUserMonster() == other.hasUserMonster());
      if (hasUserMonster()) {
        result = result && getUserMonster()
            .equals(other.getUserMonster());
      }
      result = result && (hasUserRune() == other.hasUserRune());
      if (hasUserRune()) {
        result = result && getUserRune()
            .equals(other.getUserRune());
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
      if (hasUser()) {
        hash = (37 * hash) + USER_FIELD_NUMBER;
        hash = (53 * hash) + getUser().hashCode();
      }
      if (hasUserMonster()) {
        hash = (37 * hash) + USER_MONSTER_FIELD_NUMBER;
        hash = (53 * hash) + getUserMonster().hashCode();
      }
      if (hasUserRune()) {
        hash = (37 * hash) + USER_RUNE_FIELD_NUMBER;
        hash = (53 * hash) + getUserRune().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune prototype) {
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
     * Protobuf type {@code msggamedata.RspUnequipRune}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspUnequipRune)
        com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRuneOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspUnequipRuneOuterClass.internal_static_msggamedata_RspUnequipRune_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspUnequipRuneOuterClass.internal_static_msggamedata_RspUnequipRune_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune.class, com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune.Builder.class);
      }

      // Construct using com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune.newBuilder()
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
        if (userBuilder_ == null) {
          user_ = null;
        } else {
          user_ = null;
          userBuilder_ = null;
        }
        if (userMonsterBuilder_ == null) {
          userMonster_ = null;
        } else {
          userMonster_ = null;
          userMonsterBuilder_ = null;
        }
        if (userRuneBuilder_ == null) {
          userRune_ = null;
        } else {
          userRune_ = null;
          userRuneBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspUnequipRuneOuterClass.internal_static_msggamedata_RspUnequipRune_descriptor;
      }

      public com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune getDefaultInstanceForType() {
        return com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune.getDefaultInstance();
      }

      public com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune build() {
        com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune buildPartial() {
        com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune result = new com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune(this);
        if (userBuilder_ == null) {
          result.user_ = user_;
        } else {
          result.user_ = userBuilder_.build();
        }
        if (userMonsterBuilder_ == null) {
          result.userMonster_ = userMonster_;
        } else {
          result.userMonster_ = userMonsterBuilder_.build();
        }
        if (userRuneBuilder_ == null) {
          result.userRune_ = userRune_;
        } else {
          result.userRune_ = userRuneBuilder_.build();
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
        if (other instanceof com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune) {
          return mergeFrom((com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune other) {
        if (other == com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune.getDefaultInstance()) return this;
        if (other.hasUser()) {
          mergeUser(other.getUser());
        }
        if (other.hasUserMonster()) {
          mergeUserMonster(other.getUserMonster());
        }
        if (other.hasUserRune()) {
          mergeUserRune(other.getUserRune());
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
        com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.felania.msldb.MsgUserOuterClass.MsgUser user_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserOuterClass.MsgUser, com.felania.msldb.MsgUserOuterClass.MsgUser.Builder, com.felania.msldb.MsgUserOuterClass.MsgUserOrBuilder> userBuilder_;
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public boolean hasUser() {
        return userBuilder_ != null || user_ != null;
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public com.felania.msldb.MsgUserOuterClass.MsgUser getUser() {
        if (userBuilder_ == null) {
          return user_ == null ? com.felania.msldb.MsgUserOuterClass.MsgUser.getDefaultInstance() : user_;
        } else {
          return userBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public Builder setUser(com.felania.msldb.MsgUserOuterClass.MsgUser value) {
        if (userBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          user_ = value;
          onChanged();
        } else {
          userBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public Builder setUser(
          com.felania.msldb.MsgUserOuterClass.MsgUser.Builder builderForValue) {
        if (userBuilder_ == null) {
          user_ = builderForValue.build();
          onChanged();
        } else {
          userBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public Builder mergeUser(com.felania.msldb.MsgUserOuterClass.MsgUser value) {
        if (userBuilder_ == null) {
          if (user_ != null) {
            user_ =
              com.felania.msldb.MsgUserOuterClass.MsgUser.newBuilder(user_).mergeFrom(value).buildPartial();
          } else {
            user_ = value;
          }
          onChanged();
        } else {
          userBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public Builder clearUser() {
        if (userBuilder_ == null) {
          user_ = null;
          onChanged();
        } else {
          user_ = null;
          userBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public com.felania.msldb.MsgUserOuterClass.MsgUser.Builder getUserBuilder() {
        
        onChanged();
        return getUserFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      public com.felania.msldb.MsgUserOuterClass.MsgUserOrBuilder getUserOrBuilder() {
        if (userBuilder_ != null) {
          return userBuilder_.getMessageOrBuilder();
        } else {
          return user_ == null ?
              com.felania.msldb.MsgUserOuterClass.MsgUser.getDefaultInstance() : user_;
        }
      }
      /**
       * <code>.msggamedata.MsgUser user = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserOuterClass.MsgUser, com.felania.msldb.MsgUserOuterClass.MsgUser.Builder, com.felania.msldb.MsgUserOuterClass.MsgUserOrBuilder> 
          getUserFieldBuilder() {
        if (userBuilder_ == null) {
          userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgUserOuterClass.MsgUser, com.felania.msldb.MsgUserOuterClass.MsgUser.Builder, com.felania.msldb.MsgUserOuterClass.MsgUserOrBuilder>(
                  getUser(),
                  getParentForChildren(),
                  isClean());
          user_ = null;
        }
        return userBuilder_;
      }

      private com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster userMonster_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster, com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster.Builder, com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonsterOrBuilder> userMonsterBuilder_;
      /**
       * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
       */
      public boolean hasUserMonster() {
        return userMonsterBuilder_ != null || userMonster_ != null;
      }
      /**
       * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
       */
      public com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster getUserMonster() {
        if (userMonsterBuilder_ == null) {
          return userMonster_ == null ? com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster.getDefaultInstance() : userMonster_;
        } else {
          return userMonsterBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
       */
      public Builder setUserMonster(com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster value) {
        if (userMonsterBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          userMonster_ = value;
          onChanged();
        } else {
          userMonsterBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
       */
      public Builder setUserMonster(
          com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster.Builder builderForValue) {
        if (userMonsterBuilder_ == null) {
          userMonster_ = builderForValue.build();
          onChanged();
        } else {
          userMonsterBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
       */
      public Builder mergeUserMonster(com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster value) {
        if (userMonsterBuilder_ == null) {
          if (userMonster_ != null) {
            userMonster_ =
              com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster.newBuilder(userMonster_).mergeFrom(value).buildPartial();
          } else {
            userMonster_ = value;
          }
          onChanged();
        } else {
          userMonsterBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
       */
      public Builder clearUserMonster() {
        if (userMonsterBuilder_ == null) {
          userMonster_ = null;
          onChanged();
        } else {
          userMonster_ = null;
          userMonsterBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
       */
      public com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster.Builder getUserMonsterBuilder() {
        
        onChanged();
        return getUserMonsterFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
       */
      public com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonsterOrBuilder getUserMonsterOrBuilder() {
        if (userMonsterBuilder_ != null) {
          return userMonsterBuilder_.getMessageOrBuilder();
        } else {
          return userMonster_ == null ?
              com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster.getDefaultInstance() : userMonster_;
        }
      }
      /**
       * <code>.msggamedata.MsgUserMonster user_monster = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster, com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster.Builder, com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonsterOrBuilder> 
          getUserMonsterFieldBuilder() {
        if (userMonsterBuilder_ == null) {
          userMonsterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster, com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonster.Builder, com.felania.msldb.MsgUserMonsterOuterClass.MsgUserMonsterOrBuilder>(
                  getUserMonster(),
                  getParentForChildren(),
                  isClean());
          userMonster_ = null;
        }
        return userMonsterBuilder_;
      }

      private com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune userRune_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune, com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune.Builder, com.felania.msldb.MsgUserRuneOuterClass.MsgUserRuneOrBuilder> userRuneBuilder_;
      /**
       * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
       */
      public boolean hasUserRune() {
        return userRuneBuilder_ != null || userRune_ != null;
      }
      /**
       * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
       */
      public com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune getUserRune() {
        if (userRuneBuilder_ == null) {
          return userRune_ == null ? com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune.getDefaultInstance() : userRune_;
        } else {
          return userRuneBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
       */
      public Builder setUserRune(com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune value) {
        if (userRuneBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          userRune_ = value;
          onChanged();
        } else {
          userRuneBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
       */
      public Builder setUserRune(
          com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune.Builder builderForValue) {
        if (userRuneBuilder_ == null) {
          userRune_ = builderForValue.build();
          onChanged();
        } else {
          userRuneBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
       */
      public Builder mergeUserRune(com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune value) {
        if (userRuneBuilder_ == null) {
          if (userRune_ != null) {
            userRune_ =
              com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune.newBuilder(userRune_).mergeFrom(value).buildPartial();
          } else {
            userRune_ = value;
          }
          onChanged();
        } else {
          userRuneBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
       */
      public Builder clearUserRune() {
        if (userRuneBuilder_ == null) {
          userRune_ = null;
          onChanged();
        } else {
          userRune_ = null;
          userRuneBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
       */
      public com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune.Builder getUserRuneBuilder() {
        
        onChanged();
        return getUserRuneFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
       */
      public com.felania.msldb.MsgUserRuneOuterClass.MsgUserRuneOrBuilder getUserRuneOrBuilder() {
        if (userRuneBuilder_ != null) {
          return userRuneBuilder_.getMessageOrBuilder();
        } else {
          return userRune_ == null ?
              com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune.getDefaultInstance() : userRune_;
        }
      }
      /**
       * <code>.msggamedata.MsgUserRune user_rune = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune, com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune.Builder, com.felania.msldb.MsgUserRuneOuterClass.MsgUserRuneOrBuilder> 
          getUserRuneFieldBuilder() {
        if (userRuneBuilder_ == null) {
          userRuneBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune, com.felania.msldb.MsgUserRuneOuterClass.MsgUserRune.Builder, com.felania.msldb.MsgUserRuneOuterClass.MsgUserRuneOrBuilder>(
                  getUserRune(),
                  getParentForChildren(),
                  isClean());
          userRune_ = null;
        }
        return userRuneBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.RspUnequipRune)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspUnequipRune)
    private static final com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune();
    }

    public static com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspUnequipRune>
        PARSER = new com.google.protobuf.AbstractParser<RspUnequipRune>() {
      public RspUnequipRune parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RspUnequipRune(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspUnequipRune> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspUnequipRune> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspUnequipRuneOuterClass.RspUnequipRune getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspUnequipRune_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspUnequipRune_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024RspUnequipRune.proto\022\013msggamedata\032\rMsg" +
      "User.proto\032\024MsgUserMonster.proto\032\021MsgUse" +
      "rRune.proto\"\224\001\n\016RspUnequipRune\022\"\n\004user\030\001" +
      " \001(\0132\024.msggamedata.MsgUser\0221\n\014user_monst" +
      "er\030\002 \001(\0132\033.msggamedata.MsgUserMonster\022+\n" +
      "\tuser_rune\030\003 \001(\0132\030.msggamedata.MsgUserRu" +
      "neB\023\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.MsgUserOuterClass.getDescriptor(),
          com.felania.msldb.MsgUserMonsterOuterClass.getDescriptor(),
          com.felania.msldb.MsgUserRuneOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_RspUnequipRune_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspUnequipRune_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspUnequipRune_descriptor,
        new java.lang.String[] { "User", "UserMonster", "UserRune", });
    com.felania.msldb.MsgUserOuterClass.getDescriptor();
    com.felania.msldb.MsgUserMonsterOuterClass.getDescriptor();
    com.felania.msldb.MsgUserRuneOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
