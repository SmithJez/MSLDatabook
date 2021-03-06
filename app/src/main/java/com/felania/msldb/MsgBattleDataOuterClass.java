// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgBattleData.proto

package com.felania.msldb;

public final class MsgBattleDataOuterClass {
  private MsgBattleDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgBattleDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgBattleData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
     */
    java.util.List<com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster> 
        getEnemiesList();
    /**
     * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
     */
    com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster getEnemies(int index);
    /**
     * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
     */
    int getEnemiesCount();
    /**
     * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonsterOrBuilder> 
        getEnemiesOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
     */
    com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonsterOrBuilder getEnemiesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.MsgBattleData}
   */
  public  static final class MsgBattleData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgBattleData)
      MsgBattleDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgBattleData.newBuilder() to construct.
    private MsgBattleData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgBattleData() {
      enemies_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgBattleData(
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
                enemies_ = new java.util.ArrayList<com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster>();
                mutable_bitField0_ |= 0x00000001;
              }
              enemies_.add(
                  input.readMessage(com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster.parser(), extensionRegistry));
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
          enemies_ = java.util.Collections.unmodifiableList(enemies_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MsgBattleDataOuterClass.internal_static_msggamedata_MsgBattleData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgBattleDataOuterClass.internal_static_msggamedata_MsgBattleData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData.class, com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData.Builder.class);
    }

    public static final int ENEMIES_FIELD_NUMBER = 1;
    private java.util.List<com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster> enemies_;
    /**
     * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
     */
    public java.util.List<com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster> getEnemiesList() {
      return enemies_;
    }
    /**
     * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonsterOrBuilder> 
        getEnemiesOrBuilderList() {
      return enemies_;
    }
    /**
     * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
     */
    public int getEnemiesCount() {
      return enemies_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
     */
    public com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster getEnemies(int index) {
      return enemies_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
     */
    public com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonsterOrBuilder getEnemiesOrBuilder(
        int index) {
      return enemies_.get(index);
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
      for (int i = 0; i < enemies_.size(); i++) {
        output.writeMessage(1, enemies_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < enemies_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, enemies_.get(i));
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
      if (!(obj instanceof com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData other = (com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData) obj;

      boolean result = true;
      result = result && getEnemiesList()
          .equals(other.getEnemiesList());
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
      if (getEnemiesCount() > 0) {
        hash = (37 * hash) + ENEMIES_FIELD_NUMBER;
        hash = (53 * hash) + getEnemiesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData prototype) {
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
     * Protobuf type {@code msggamedata.MsgBattleData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgBattleData)
        com.felania.msldb.MsgBattleDataOuterClass.MsgBattleDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgBattleDataOuterClass.internal_static_msggamedata_MsgBattleData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgBattleDataOuterClass.internal_static_msggamedata_MsgBattleData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData.class, com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData.Builder.class);
      }

      // Construct using com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData.newBuilder()
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
          getEnemiesFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (enemiesBuilder_ == null) {
          enemies_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          enemiesBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgBattleDataOuterClass.internal_static_msggamedata_MsgBattleData_descriptor;
      }

      public com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData getDefaultInstanceForType() {
        return com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData.getDefaultInstance();
      }

      public com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData build() {
        com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData buildPartial() {
        com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData result = new com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData(this);
        int from_bitField0_ = bitField0_;
        if (enemiesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            enemies_ = java.util.Collections.unmodifiableList(enemies_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.enemies_ = enemies_;
        } else {
          result.enemies_ = enemiesBuilder_.build();
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
        if (other instanceof com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData) {
          return mergeFrom((com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData other) {
        if (other == com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData.getDefaultInstance()) return this;
        if (enemiesBuilder_ == null) {
          if (!other.enemies_.isEmpty()) {
            if (enemies_.isEmpty()) {
              enemies_ = other.enemies_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEnemiesIsMutable();
              enemies_.addAll(other.enemies_);
            }
            onChanged();
          }
        } else {
          if (!other.enemies_.isEmpty()) {
            if (enemiesBuilder_.isEmpty()) {
              enemiesBuilder_.dispose();
              enemiesBuilder_ = null;
              enemies_ = other.enemies_;
              bitField0_ = (bitField0_ & ~0x00000001);
              enemiesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEnemiesFieldBuilder() : null;
            } else {
              enemiesBuilder_.addAllMessages(other.enemies_);
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
        com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster> enemies_ =
        java.util.Collections.emptyList();
      private void ensureEnemiesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          enemies_ = new java.util.ArrayList<com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster>(enemies_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster, com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster.Builder, com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonsterOrBuilder> enemiesBuilder_;

      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster> getEnemiesList() {
        if (enemiesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(enemies_);
        } else {
          return enemiesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public int getEnemiesCount() {
        if (enemiesBuilder_ == null) {
          return enemies_.size();
        } else {
          return enemiesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster getEnemies(int index) {
        if (enemiesBuilder_ == null) {
          return enemies_.get(index);
        } else {
          return enemiesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public Builder setEnemies(
          int index, com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster value) {
        if (enemiesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEnemiesIsMutable();
          enemies_.set(index, value);
          onChanged();
        } else {
          enemiesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public Builder setEnemies(
          int index, com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster.Builder builderForValue) {
        if (enemiesBuilder_ == null) {
          ensureEnemiesIsMutable();
          enemies_.set(index, builderForValue.build());
          onChanged();
        } else {
          enemiesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public Builder addEnemies(com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster value) {
        if (enemiesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEnemiesIsMutable();
          enemies_.add(value);
          onChanged();
        } else {
          enemiesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public Builder addEnemies(
          int index, com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster value) {
        if (enemiesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEnemiesIsMutable();
          enemies_.add(index, value);
          onChanged();
        } else {
          enemiesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public Builder addEnemies(
          com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster.Builder builderForValue) {
        if (enemiesBuilder_ == null) {
          ensureEnemiesIsMutable();
          enemies_.add(builderForValue.build());
          onChanged();
        } else {
          enemiesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public Builder addEnemies(
          int index, com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster.Builder builderForValue) {
        if (enemiesBuilder_ == null) {
          ensureEnemiesIsMutable();
          enemies_.add(index, builderForValue.build());
          onChanged();
        } else {
          enemiesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public Builder addAllEnemies(
          java.lang.Iterable<? extends com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster> values) {
        if (enemiesBuilder_ == null) {
          ensureEnemiesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, enemies_);
          onChanged();
        } else {
          enemiesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public Builder clearEnemies() {
        if (enemiesBuilder_ == null) {
          enemies_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          enemiesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public Builder removeEnemies(int index) {
        if (enemiesBuilder_ == null) {
          ensureEnemiesIsMutable();
          enemies_.remove(index);
          onChanged();
        } else {
          enemiesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster.Builder getEnemiesBuilder(
          int index) {
        return getEnemiesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonsterOrBuilder getEnemiesOrBuilder(
          int index) {
        if (enemiesBuilder_ == null) {
          return enemies_.get(index);  } else {
          return enemiesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonsterOrBuilder> 
           getEnemiesOrBuilderList() {
        if (enemiesBuilder_ != null) {
          return enemiesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(enemies_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster.Builder addEnemiesBuilder() {
        return getEnemiesFieldBuilder().addBuilder(
            com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster.Builder addEnemiesBuilder(
          int index) {
        return getEnemiesFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgEnemyMonster enemies = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster.Builder> 
           getEnemiesBuilderList() {
        return getEnemiesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster, com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster.Builder, com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonsterOrBuilder> 
          getEnemiesFieldBuilder() {
        if (enemiesBuilder_ == null) {
          enemiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster, com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonster.Builder, com.felania.msldb.MsgEnemyMonsterOuterClass.MsgEnemyMonsterOrBuilder>(
                  enemies_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          enemies_ = null;
        }
        return enemiesBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgBattleData)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgBattleData)
    private static final com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData();
    }

    public static com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgBattleData>
        PARSER = new com.google.protobuf.AbstractParser<MsgBattleData>() {
      public MsgBattleData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgBattleData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgBattleData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgBattleData> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgBattleDataOuterClass.MsgBattleData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgBattleData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgBattleData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023MsgBattleData.proto\022\013msggamedata\032\025MsgE" +
      "nemyMonster.proto\">\n\rMsgBattleData\022-\n\007en" +
      "emies\030\001 \003(\0132\034.msggamedata.MsgEnemyMonste" +
      "rB\023\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.MsgEnemyMonsterOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgBattleData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgBattleData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgBattleData_descriptor,
        new java.lang.String[] { "Enemies", });
    com.felania.msldb.MsgEnemyMonsterOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
