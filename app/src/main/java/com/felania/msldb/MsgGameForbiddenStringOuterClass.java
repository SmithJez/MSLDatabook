// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgGameForbiddenString.proto

package com.felania.msldb;

public final class MsgGameForbiddenStringOuterClass {
  private MsgGameForbiddenStringOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgGameForbiddenStringOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgGameForbiddenString)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
     */
    java.util.List<com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString> 
        getStringsList();
    /**
     * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
     */
    com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString getStrings(int index);
    /**
     * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
     */
    int getStringsCount();
    /**
     * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
     */
    java.util.List<? extends com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedStringOrBuilder> 
        getStringsOrBuilderList();
    /**
     * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
     */
    com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedStringOrBuilder getStringsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code msggamedata.MsgGameForbiddenString}
   */
  public  static final class MsgGameForbiddenString extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgGameForbiddenString)
      MsgGameForbiddenStringOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgGameForbiddenString.newBuilder() to construct.
    private MsgGameForbiddenString(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgGameForbiddenString() {
      strings_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgGameForbiddenString(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                strings_ = new java.util.ArrayList<com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString>();
                mutable_bitField0_ |= 0x00000001;
              }
              strings_.add(
                  input.readMessage(com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString.parser(), extensionRegistry));
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
          strings_ = java.util.Collections.unmodifiableList(strings_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.felania.msldb.MsgGameForbiddenStringOuterClass.internal_static_msggamedata_MsgGameForbiddenString_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgGameForbiddenStringOuterClass.internal_static_msggamedata_MsgGameForbiddenString_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString.class, com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString.Builder.class);
    }

    public static final int STRINGS_FIELD_NUMBER = 1;
    private java.util.List<com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString> strings_;
    /**
     * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
     */
    public java.util.List<com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString> getStringsList() {
      return strings_;
    }
    /**
     * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
     */
    public java.util.List<? extends com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedStringOrBuilder> 
        getStringsOrBuilderList() {
      return strings_;
    }
    /**
     * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
     */
    public int getStringsCount() {
      return strings_.size();
    }
    /**
     * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
     */
    public com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString getStrings(int index) {
      return strings_.get(index);
    }
    /**
     * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
     */
    public com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedStringOrBuilder getStringsOrBuilder(
        int index) {
      return strings_.get(index);
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
      for (int i = 0; i < strings_.size(); i++) {
        output.writeMessage(1, strings_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < strings_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, strings_.get(i));
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
      if (!(obj instanceof com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString other = (com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString) obj;

      boolean result = true;
      result = result && getStringsList()
          .equals(other.getStringsList());
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
      if (getStringsCount() > 0) {
        hash = (37 * hash) + STRINGS_FIELD_NUMBER;
        hash = (53 * hash) + getStringsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString prototype) {
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
     * Protobuf type {@code msggamedata.MsgGameForbiddenString}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgGameForbiddenString)
        com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenStringOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgGameForbiddenStringOuterClass.internal_static_msggamedata_MsgGameForbiddenString_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgGameForbiddenStringOuterClass.internal_static_msggamedata_MsgGameForbiddenString_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString.class, com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString.Builder.class);
      }

      // Construct using com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString.newBuilder()
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
          getStringsFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (stringsBuilder_ == null) {
          strings_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          stringsBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgGameForbiddenStringOuterClass.internal_static_msggamedata_MsgGameForbiddenString_descriptor;
      }

      public com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString getDefaultInstanceForType() {
        return com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString.getDefaultInstance();
      }

      public com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString build() {
        com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString buildPartial() {
        com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString result = new com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString(this);
        int from_bitField0_ = bitField0_;
        if (stringsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            strings_ = java.util.Collections.unmodifiableList(strings_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.strings_ = strings_;
        } else {
          result.strings_ = stringsBuilder_.build();
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
        if (other instanceof com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString) {
          return mergeFrom((com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString other) {
        if (other == com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString.getDefaultInstance()) return this;
        if (stringsBuilder_ == null) {
          if (!other.strings_.isEmpty()) {
            if (strings_.isEmpty()) {
              strings_ = other.strings_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStringsIsMutable();
              strings_.addAll(other.strings_);
            }
            onChanged();
          }
        } else {
          if (!other.strings_.isEmpty()) {
            if (stringsBuilder_.isEmpty()) {
              stringsBuilder_.dispose();
              stringsBuilder_ = null;
              strings_ = other.strings_;
              bitField0_ = (bitField0_ & ~0x00000001);
              stringsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getStringsFieldBuilder() : null;
            } else {
              stringsBuilder_.addAllMessages(other.strings_);
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
        com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString> strings_ =
        java.util.Collections.emptyList();
      private void ensureStringsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          strings_ = new java.util.ArrayList<com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString>(strings_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString, com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString.Builder, com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedStringOrBuilder> stringsBuilder_;

      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString> getStringsList() {
        if (stringsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(strings_);
        } else {
          return stringsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public int getStringsCount() {
        if (stringsBuilder_ == null) {
          return strings_.size();
        } else {
          return stringsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString getStrings(int index) {
        if (stringsBuilder_ == null) {
          return strings_.get(index);
        } else {
          return stringsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public Builder setStrings(
          int index, com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString value) {
        if (stringsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStringsIsMutable();
          strings_.set(index, value);
          onChanged();
        } else {
          stringsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public Builder setStrings(
          int index, com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString.Builder builderForValue) {
        if (stringsBuilder_ == null) {
          ensureStringsIsMutable();
          strings_.set(index, builderForValue.build());
          onChanged();
        } else {
          stringsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public Builder addStrings(com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString value) {
        if (stringsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStringsIsMutable();
          strings_.add(value);
          onChanged();
        } else {
          stringsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public Builder addStrings(
          int index, com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString value) {
        if (stringsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStringsIsMutable();
          strings_.add(index, value);
          onChanged();
        } else {
          stringsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public Builder addStrings(
          com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString.Builder builderForValue) {
        if (stringsBuilder_ == null) {
          ensureStringsIsMutable();
          strings_.add(builderForValue.build());
          onChanged();
        } else {
          stringsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public Builder addStrings(
          int index, com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString.Builder builderForValue) {
        if (stringsBuilder_ == null) {
          ensureStringsIsMutable();
          strings_.add(index, builderForValue.build());
          onChanged();
        } else {
          stringsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public Builder addAllStrings(
          java.lang.Iterable<? extends com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString> values) {
        if (stringsBuilder_ == null) {
          ensureStringsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, strings_);
          onChanged();
        } else {
          stringsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public Builder clearStrings() {
        if (stringsBuilder_ == null) {
          strings_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          stringsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public Builder removeStrings(int index) {
        if (stringsBuilder_ == null) {
          ensureStringsIsMutable();
          strings_.remove(index);
          onChanged();
        } else {
          stringsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString.Builder getStringsBuilder(
          int index) {
        return getStringsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedStringOrBuilder getStringsOrBuilder(
          int index) {
        if (stringsBuilder_ == null) {
          return strings_.get(index);  } else {
          return stringsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public java.util.List<? extends com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedStringOrBuilder> 
           getStringsOrBuilderList() {
        if (stringsBuilder_ != null) {
          return stringsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(strings_);
        }
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString.Builder addStringsBuilder() {
        return getStringsFieldBuilder().addBuilder(
            com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString.Builder addStringsBuilder(
          int index) {
        return getStringsFieldBuilder().addBuilder(
            index, com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString.getDefaultInstance());
      }
      /**
       * <code>repeated .msggamedata.MsgLocalizedString strings = 1;</code>
       */
      public java.util.List<com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString.Builder> 
           getStringsBuilderList() {
        return getStringsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString, com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString.Builder, com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedStringOrBuilder> 
          getStringsFieldBuilder() {
        if (stringsBuilder_ == null) {
          stringsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString, com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedString.Builder, com.felania.msldb.MsgLocalizedStringOuterClass.MsgLocalizedStringOrBuilder>(
                  strings_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          strings_ = null;
        }
        return stringsBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgGameForbiddenString)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgGameForbiddenString)
    private static final com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString();
    }

    public static com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgGameForbiddenString>
        PARSER = new com.google.protobuf.AbstractParser<MsgGameForbiddenString>() {
      public MsgGameForbiddenString parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MsgGameForbiddenString(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgGameForbiddenString> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgGameForbiddenString> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgGameForbiddenStringOuterClass.MsgGameForbiddenString getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgGameForbiddenString_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgGameForbiddenString_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034MsgGameForbiddenString.proto\022\013msggamed" +
      "ata\032\030MsgLocalizedString.proto\"J\n\026MsgGame" +
      "ForbiddenString\0220\n\007strings\030\001 \003(\0132\037.msgga" +
      "medata.MsgLocalizedStringB\023\n\021com.felania" +
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
          com.felania.msldb.MsgLocalizedStringOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgGameForbiddenString_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgGameForbiddenString_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgGameForbiddenString_descriptor,
        new java.lang.String[] { "Strings", });
    com.felania.msldb.MsgLocalizedStringOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
