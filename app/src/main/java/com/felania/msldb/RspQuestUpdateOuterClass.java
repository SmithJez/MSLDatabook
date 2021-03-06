// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspQuestUpdate.proto

package com.felania.msldb;

public final class RspQuestUpdateOuterClass {
  private RspQuestUpdateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspQuestUpdateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspQuestUpdate)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
     */
    java.util.List<com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest> 
        getQuestsList();
    /**
     * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
     */
    com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest getQuests(int index);
    /**
     * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
     */
    int getQuestsCount();
    /**
     * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuestOrBuilder> 
        getQuestsOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
     */
    com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuestOrBuilder getQuestsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.RspQuestUpdate}
   */
  public  static final class RspQuestUpdate extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspQuestUpdate)
      RspQuestUpdateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspQuestUpdate.newBuilder() to construct.
    private RspQuestUpdate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspQuestUpdate() {
      quests_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspQuestUpdate(
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
                quests_ = new java.util.ArrayList<com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest>();
                mutable_bitField0_ |= 0x00000001;
              }
              quests_.add(
                  input.readMessage(com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest.parser(), extensionRegistry));
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
          quests_ = java.util.Collections.unmodifiableList(quests_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.RspQuestUpdateOuterClass.internal_static_msggamedata_RspQuestUpdate_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspQuestUpdateOuterClass.internal_static_msggamedata_RspQuestUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate.class, com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate.Builder.class);
    }

    public static final int QUESTS_FIELD_NUMBER = 1;
    private java.util.List<com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest> quests_;
    /**
     * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
     */
    public java.util.List<com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest> getQuestsList() {
      return quests_;
    }
    /**
     * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuestOrBuilder> 
        getQuestsOrBuilderList() {
      return quests_;
    }
    /**
     * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
     */
    public int getQuestsCount() {
      return quests_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
     */
    public com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest getQuests(int index) {
      return quests_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
     */
    public com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuestOrBuilder getQuestsOrBuilder(
        int index) {
      return quests_.get(index);
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
      for (int i = 0; i < quests_.size(); i++) {
        output.writeMessage(1, quests_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < quests_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, quests_.get(i));
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
      if (!(obj instanceof com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate other = (com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate) obj;

      boolean result = true;
      result = result && getQuestsList()
          .equals(other.getQuestsList());
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
      if (getQuestsCount() > 0) {
        hash = (37 * hash) + QUESTS_FIELD_NUMBER;
        hash = (53 * hash) + getQuestsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate prototype) {
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
     * Protobuf type {@code msggamedata.RspQuestUpdate}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspQuestUpdate)
        com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspQuestUpdateOuterClass.internal_static_msggamedata_RspQuestUpdate_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspQuestUpdateOuterClass.internal_static_msggamedata_RspQuestUpdate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate.class, com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate.Builder.class);
      }

      // Construct using com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate.newBuilder()
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
          getQuestsFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (questsBuilder_ == null) {
          quests_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          questsBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspQuestUpdateOuterClass.internal_static_msggamedata_RspQuestUpdate_descriptor;
      }

      public com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate getDefaultInstanceForType() {
        return com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate.getDefaultInstance();
      }

      public com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate build() {
        com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate buildPartial() {
        com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate result = new com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate(this);
        int from_bitField0_ = bitField0_;
        if (questsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            quests_ = java.util.Collections.unmodifiableList(quests_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.quests_ = quests_;
        } else {
          result.quests_ = questsBuilder_.build();
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
        if (other instanceof com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate) {
          return mergeFrom((com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate other) {
        if (other == com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate.getDefaultInstance()) return this;
        if (questsBuilder_ == null) {
          if (!other.quests_.isEmpty()) {
            if (quests_.isEmpty()) {
              quests_ = other.quests_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureQuestsIsMutable();
              quests_.addAll(other.quests_);
            }
            onChanged();
          }
        } else {
          if (!other.quests_.isEmpty()) {
            if (questsBuilder_.isEmpty()) {
              questsBuilder_.dispose();
              questsBuilder_ = null;
              quests_ = other.quests_;
              bitField0_ = (bitField0_ & ~0x00000001);
              questsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getQuestsFieldBuilder() : null;
            } else {
              questsBuilder_.addAllMessages(other.quests_);
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
        com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest> quests_ =
        java.util.Collections.emptyList();
      private void ensureQuestsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          quests_ = new java.util.ArrayList<com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest>(quests_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest, com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest.Builder, com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuestOrBuilder> questsBuilder_;

      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest> getQuestsList() {
        if (questsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(quests_);
        } else {
          return questsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public int getQuestsCount() {
        if (questsBuilder_ == null) {
          return quests_.size();
        } else {
          return questsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest getQuests(int index) {
        if (questsBuilder_ == null) {
          return quests_.get(index);
        } else {
          return questsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public Builder setQuests(
          int index, com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest value) {
        if (questsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureQuestsIsMutable();
          quests_.set(index, value);
          onChanged();
        } else {
          questsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public Builder setQuests(
          int index, com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest.Builder builderForValue) {
        if (questsBuilder_ == null) {
          ensureQuestsIsMutable();
          quests_.set(index, builderForValue.build());
          onChanged();
        } else {
          questsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public Builder addQuests(com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest value) {
        if (questsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureQuestsIsMutable();
          quests_.add(value);
          onChanged();
        } else {
          questsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public Builder addQuests(
          int index, com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest value) {
        if (questsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureQuestsIsMutable();
          quests_.add(index, value);
          onChanged();
        } else {
          questsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public Builder addQuests(
          com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest.Builder builderForValue) {
        if (questsBuilder_ == null) {
          ensureQuestsIsMutable();
          quests_.add(builderForValue.build());
          onChanged();
        } else {
          questsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public Builder addQuests(
          int index, com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest.Builder builderForValue) {
        if (questsBuilder_ == null) {
          ensureQuestsIsMutable();
          quests_.add(index, builderForValue.build());
          onChanged();
        } else {
          questsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public Builder addAllQuests(
          java.lang.Iterable<? extends com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest> values) {
        if (questsBuilder_ == null) {
          ensureQuestsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, quests_);
          onChanged();
        } else {
          questsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public Builder clearQuests() {
        if (questsBuilder_ == null) {
          quests_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          questsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public Builder removeQuests(int index) {
        if (questsBuilder_ == null) {
          ensureQuestsIsMutable();
          quests_.remove(index);
          onChanged();
        } else {
          questsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest.Builder getQuestsBuilder(
          int index) {
        return getQuestsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuestOrBuilder getQuestsOrBuilder(
          int index) {
        if (questsBuilder_ == null) {
          return quests_.get(index);  } else {
          return questsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuestOrBuilder> 
           getQuestsOrBuilderList() {
        if (questsBuilder_ != null) {
          return questsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(quests_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest.Builder addQuestsBuilder() {
        return getQuestsFieldBuilder().addBuilder(
            com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest.Builder addQuestsBuilder(
          int index) {
        return getQuestsFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgUserQuest quests = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest.Builder> 
           getQuestsBuilderList() {
        return getQuestsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest, com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest.Builder, com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuestOrBuilder> 
          getQuestsFieldBuilder() {
        if (questsBuilder_ == null) {
          questsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest, com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuest.Builder, com.felania.msldb.MsgUserQuestOuterClass.MsgUserQuestOrBuilder>(
                  quests_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          quests_ = null;
        }
        return questsBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.RspQuestUpdate)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspQuestUpdate)
    private static final com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate();
    }

    public static com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspQuestUpdate>
        PARSER = new com.google.protobuf.AbstractParser<RspQuestUpdate>() {
      public RspQuestUpdate parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RspQuestUpdate(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspQuestUpdate> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspQuestUpdate> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspQuestUpdateOuterClass.RspQuestUpdate getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspQuestUpdate_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspQuestUpdate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024RspQuestUpdate.proto\022\013msggamedata\032\022Msg" +
      "UserQuest.proto\";\n\016RspQuestUpdate\022)\n\006que" +
      "sts\030\001 \003(\0132\031.msggamedata.MsgUserQuestB\023\n\021" +
      "com.felania.msldbb\006proto3"
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
          com.felania.msldb.MsgUserQuestOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_RspQuestUpdate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspQuestUpdate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspQuestUpdate_descriptor,
        new java.lang.String[] { "Quests", });
    com.felania.msldb.MsgUserQuestOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
