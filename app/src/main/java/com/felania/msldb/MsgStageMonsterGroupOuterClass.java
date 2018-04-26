// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgStageMonsterGroup.proto

package com.felania.msldb;

public final class MsgStageMonsterGroupOuterClass {
  private MsgStageMonsterGroupOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgStageMonsterGroupOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgStageMonsterGroup)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
     */
    java.util.List<com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb> 
        getMonstersList();
    /**
     * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
     */
    com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb getMonsters(int index);
    /**
     * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
     */
    int getMonstersCount();
    /**
     * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProbOrBuilder> 
        getMonstersOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
     */
    com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProbOrBuilder getMonstersOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.MsgStageMonsterGroup}
   */
  public  static final class MsgStageMonsterGroup extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgStageMonsterGroup)
      MsgStageMonsterGroupOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgStageMonsterGroup.newBuilder() to construct.
    private MsgStageMonsterGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgStageMonsterGroup() {
      uid_ = 0;
      monsters_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgStageMonsterGroup(
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
            case 13: {

              uid_ = input.readFixed32();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                monsters_ = new java.util.ArrayList<com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb>();
                mutable_bitField0_ |= 0x00000002;
              }
              monsters_.add(
                  input.readMessage(com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          monsters_ = java.util.Collections.unmodifiableList(monsters_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MsgStageMonsterGroupOuterClass.internal_static_msggamedata_MsgStageMonsterGroup_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgStageMonsterGroupOuterClass.internal_static_msggamedata_MsgStageMonsterGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup.class, com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup.Builder.class);
    }

    private int bitField0_;
    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>fixed32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int MONSTERS_FIELD_NUMBER = 2;
    private java.util.List<com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb> monsters_;
    /**
     * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
     */
    public java.util.List<com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb> getMonstersList() {
      return monsters_;
    }
    /**
     * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProbOrBuilder> 
        getMonstersOrBuilderList() {
      return monsters_;
    }
    /**
     * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
     */
    public int getMonstersCount() {
      return monsters_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
     */
    public com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb getMonsters(int index) {
      return monsters_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
     */
    public com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProbOrBuilder getMonstersOrBuilder(
        int index) {
      return monsters_.get(index);
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
      if (uid_ != 0) {
        output.writeFixed32(1, uid_);
      }
      for (int i = 0; i < monsters_.size(); i++) {
        output.writeMessage(2, monsters_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, uid_);
      }
      for (int i = 0; i < monsters_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, monsters_.get(i));
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
      if (!(obj instanceof com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup other = (com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup) obj;

      boolean result = true;
      result = result && (getUid()
          == other.getUid());
      result = result && getMonstersList()
          .equals(other.getMonstersList());
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      if (getMonstersCount() > 0) {
        hash = (37 * hash) + MONSTERS_FIELD_NUMBER;
        hash = (53 * hash) + getMonstersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup prototype) {
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
     * Protobuf type {@code msggamedata.MsgStageMonsterGroup}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgStageMonsterGroup)
        com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroupOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgStageMonsterGroupOuterClass.internal_static_msggamedata_MsgStageMonsterGroup_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgStageMonsterGroupOuterClass.internal_static_msggamedata_MsgStageMonsterGroup_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup.class, com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup.Builder.class);
      }

      // Construct using com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup.newBuilder()
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
          getMonstersFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        uid_ = 0;

        if (monstersBuilder_ == null) {
          monsters_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          monstersBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgStageMonsterGroupOuterClass.internal_static_msggamedata_MsgStageMonsterGroup_descriptor;
      }

      public com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup getDefaultInstanceForType() {
        return com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup.getDefaultInstance();
      }

      public com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup build() {
        com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup buildPartial() {
        com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup result = new com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.uid_ = uid_;
        if (monstersBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            monsters_ = java.util.Collections.unmodifiableList(monsters_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.monsters_ = monsters_;
        } else {
          result.monsters_ = monstersBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup) {
          return mergeFrom((com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup other) {
        if (other == com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (monstersBuilder_ == null) {
          if (!other.monsters_.isEmpty()) {
            if (monsters_.isEmpty()) {
              monsters_ = other.monsters_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureMonstersIsMutable();
              monsters_.addAll(other.monsters_);
            }
            onChanged();
          }
        } else {
          if (!other.monsters_.isEmpty()) {
            if (monstersBuilder_.isEmpty()) {
              monstersBuilder_.dispose();
              monstersBuilder_ = null;
              monsters_ = other.monsters_;
              bitField0_ = (bitField0_ & ~0x00000002);
              monstersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMonstersFieldBuilder() : null;
            } else {
              monstersBuilder_.addAllMessages(other.monsters_);
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
        com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int uid_ ;
      /**
       * <code>fixed32 uid = 1;</code>
       */
      public int getUid() {
        return uid_;
      }
      /**
       * <code>fixed32 uid = 1;</code>
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 uid = 1;</code>
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb> monsters_ =
        java.util.Collections.emptyList();
      private void ensureMonstersIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          monsters_ = new java.util.ArrayList<com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb>(monsters_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb, com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.Builder, com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProbOrBuilder> monstersBuilder_;

      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public java.util.List<com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb> getMonstersList() {
        if (monstersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(monsters_);
        } else {
          return monstersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public int getMonstersCount() {
        if (monstersBuilder_ == null) {
          return monsters_.size();
        } else {
          return monstersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb getMonsters(int index) {
        if (monstersBuilder_ == null) {
          return monsters_.get(index);
        } else {
          return monstersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public Builder setMonsters(
          int index, com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb value) {
        if (monstersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonstersIsMutable();
          monsters_.set(index, value);
          onChanged();
        } else {
          monstersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public Builder setMonsters(
          int index, com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.Builder builderForValue) {
        if (monstersBuilder_ == null) {
          ensureMonstersIsMutable();
          monsters_.set(index, builderForValue.build());
          onChanged();
        } else {
          monstersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public Builder addMonsters(com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb value) {
        if (monstersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonstersIsMutable();
          monsters_.add(value);
          onChanged();
        } else {
          monstersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public Builder addMonsters(
          int index, com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb value) {
        if (monstersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonstersIsMutable();
          monsters_.add(index, value);
          onChanged();
        } else {
          monstersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public Builder addMonsters(
          com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.Builder builderForValue) {
        if (monstersBuilder_ == null) {
          ensureMonstersIsMutable();
          monsters_.add(builderForValue.build());
          onChanged();
        } else {
          monstersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public Builder addMonsters(
          int index, com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.Builder builderForValue) {
        if (monstersBuilder_ == null) {
          ensureMonstersIsMutable();
          monsters_.add(index, builderForValue.build());
          onChanged();
        } else {
          monstersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public Builder addAllMonsters(
          java.lang.Iterable<? extends com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb> values) {
        if (monstersBuilder_ == null) {
          ensureMonstersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, monsters_);
          onChanged();
        } else {
          monstersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public Builder clearMonsters() {
        if (monstersBuilder_ == null) {
          monsters_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          monstersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public Builder removeMonsters(int index) {
        if (monstersBuilder_ == null) {
          ensureMonstersIsMutable();
          monsters_.remove(index);
          onChanged();
        } else {
          monstersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.Builder getMonstersBuilder(
          int index) {
        return getMonstersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProbOrBuilder getMonstersOrBuilder(
          int index) {
        if (monstersBuilder_ == null) {
          return monsters_.get(index);  } else {
          return monstersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProbOrBuilder> 
           getMonstersOrBuilderList() {
        if (monstersBuilder_ != null) {
          return monstersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(monsters_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.Builder addMonstersBuilder() {
        return getMonstersFieldBuilder().addBuilder(
            com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.Builder addMonstersBuilder(
          int index) {
        return getMonstersFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgUidAndProb monsters = 2;</code>
       */
      public java.util.List<com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.Builder> 
           getMonstersBuilderList() {
        return getMonstersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb, com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.Builder, com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProbOrBuilder> 
          getMonstersFieldBuilder() {
        if (monstersBuilder_ == null) {
          monstersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb, com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.Builder, com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProbOrBuilder>(
                  monsters_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          monsters_ = null;
        }
        return monstersBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgStageMonsterGroup)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgStageMonsterGroup)
    private static final com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup();
    }

    public static com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgStageMonsterGroup>
        PARSER = new com.google.protobuf.AbstractParser<MsgStageMonsterGroup>() {
      public MsgStageMonsterGroup parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgStageMonsterGroup(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgStageMonsterGroup> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgStageMonsterGroup> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgStageMonsterGroupOuterClass.MsgStageMonsterGroup getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgStageMonsterGroup_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgStageMonsterGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032MsgStageMonsterGroup.proto\022\013msggamedat" +
      "a\032\023MsgUidAndProb.proto\"Q\n\024MsgStageMonste" +
      "rGroup\022\013\n\003uid\030\001 \001(\007\022,\n\010monsters\030\002 \003(\0132\032." +
      "msggamedata.MsgUidAndProbB\023\n\021com.felania" +
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
          com.felania.msldb.MsgUidAndProbOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgStageMonsterGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgStageMonsterGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgStageMonsterGroup_descriptor,
        new java.lang.String[] { "Uid", "Monsters", });
    com.felania.msldb.MsgUidAndProbOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
