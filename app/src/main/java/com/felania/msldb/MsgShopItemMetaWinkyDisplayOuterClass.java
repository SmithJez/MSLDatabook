// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgShopItemMetaWinkyDisplay.proto

package com.felania.msldb;

public final class MsgShopItemMetaWinkyDisplayOuterClass {
  private MsgShopItemMetaWinkyDisplayOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgShopItemMetaWinkyDisplayOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgShopItemMetaWinkyDisplay)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
     */
    boolean hasCond();
    /**
     * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
     */
    com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond getCond();
    /**
     * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
     */
    com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCondOrBuilder getCondOrBuilder();

    /**
     * <code>string egg = 2;</code>
     */
    java.lang.String getEgg();
    /**
     * <code>string egg = 2;</code>
     */
    com.google.protobuf.ByteString
        getEggBytes();
  }
  /**
   * Protobuf type {@code msggamedata.MsgShopItemMetaWinkyDisplay}
   */
  public  static final class MsgShopItemMetaWinkyDisplay extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgShopItemMetaWinkyDisplay)
      MsgShopItemMetaWinkyDisplayOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgShopItemMetaWinkyDisplay.newBuilder() to construct.
    private MsgShopItemMetaWinkyDisplay(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgShopItemMetaWinkyDisplay() {
      egg_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgShopItemMetaWinkyDisplay(
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
              com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond.Builder subBuilder = null;
              if (cond_ != null) {
                subBuilder = cond_.toBuilder();
              }
              cond_ = input.readMessage(com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cond_);
                cond_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              egg_ = s;
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
      return com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.internal_static_msggamedata_MsgShopItemMetaWinkyDisplay_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.internal_static_msggamedata_MsgShopItemMetaWinkyDisplay_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay.class, com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay.Builder.class);
    }

    public static final int COND_FIELD_NUMBER = 1;
    private com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond cond_;
    /**
     * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
     */
    public boolean hasCond() {
      return cond_ != null;
    }
    /**
     * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
     */
    public com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond getCond() {
      return cond_ == null ? com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond.getDefaultInstance() : cond_;
    }
    /**
     * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
     */
    public com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCondOrBuilder getCondOrBuilder() {
      return getCond();
    }

    public static final int EGG_FIELD_NUMBER = 2;
    private volatile java.lang.Object egg_;
    /**
     * <code>string egg = 2;</code>
     */
    public java.lang.String getEgg() {
      java.lang.Object ref = egg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        egg_ = s;
        return s;
      }
    }
    /**
     * <code>string egg = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEggBytes() {
      java.lang.Object ref = egg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        egg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (cond_ != null) {
        output.writeMessage(1, getCond());
      }
      if (!getEggBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, egg_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cond_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getCond());
      }
      if (!getEggBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, egg_);
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
      if (!(obj instanceof com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay other = (com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay) obj;

      boolean result = true;
      result = result && (hasCond() == other.hasCond());
      if (hasCond()) {
        result = result && getCond()
            .equals(other.getCond());
      }
      result = result && getEgg()
          .equals(other.getEgg());
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
      if (hasCond()) {
        hash = (37 * hash) + COND_FIELD_NUMBER;
        hash = (53 * hash) + getCond().hashCode();
      }
      hash = (37 * hash) + EGG_FIELD_NUMBER;
      hash = (53 * hash) + getEgg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay prototype) {
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
     * Protobuf type {@code msggamedata.MsgShopItemMetaWinkyDisplay}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgShopItemMetaWinkyDisplay)
        com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplayOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.internal_static_msggamedata_MsgShopItemMetaWinkyDisplay_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.internal_static_msggamedata_MsgShopItemMetaWinkyDisplay_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay.class, com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay.Builder.class);
      }

      // Construct using com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay.newBuilder()
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
        if (condBuilder_ == null) {
          cond_ = null;
        } else {
          cond_ = null;
          condBuilder_ = null;
        }
        egg_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.internal_static_msggamedata_MsgShopItemMetaWinkyDisplay_descriptor;
      }

      public com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay getDefaultInstanceForType() {
        return com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay.getDefaultInstance();
      }

      public com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay build() {
        com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay buildPartial() {
        com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay result = new com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay(this);
        if (condBuilder_ == null) {
          result.cond_ = cond_;
        } else {
          result.cond_ = condBuilder_.build();
        }
        result.egg_ = egg_;
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
        if (other instanceof com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay) {
          return mergeFrom((com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay other) {
        if (other == com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay.getDefaultInstance()) return this;
        if (other.hasCond()) {
          mergeCond(other.getCond());
        }
        if (!other.getEgg().isEmpty()) {
          egg_ = other.egg_;
          onChanged();
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
        com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond cond_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond, com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond.Builder, com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCondOrBuilder> condBuilder_;
      /**
       * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
       */
      public boolean hasCond() {
        return condBuilder_ != null || cond_ != null;
      }
      /**
       * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
       */
      public com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond getCond() {
        if (condBuilder_ == null) {
          return cond_ == null ? com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond.getDefaultInstance() : cond_;
        } else {
          return condBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
       */
      public Builder setCond(com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond value) {
        if (condBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          cond_ = value;
          onChanged();
        } else {
          condBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
       */
      public Builder setCond(
          com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond.Builder builderForValue) {
        if (condBuilder_ == null) {
          cond_ = builderForValue.build();
          onChanged();
        } else {
          condBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
       */
      public Builder mergeCond(com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond value) {
        if (condBuilder_ == null) {
          if (cond_ != null) {
            cond_ =
              com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond.newBuilder(cond_).mergeFrom(value).buildPartial();
          } else {
            cond_ = value;
          }
          onChanged();
        } else {
          condBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
       */
      public Builder clearCond() {
        if (condBuilder_ == null) {
          cond_ = null;
          onChanged();
        } else {
          cond_ = null;
          condBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
       */
      public com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond.Builder getCondBuilder() {
        
        onChanged();
        return getCondFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
       */
      public com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCondOrBuilder getCondOrBuilder() {
        if (condBuilder_ != null) {
          return condBuilder_.getMessageOrBuilder();
        } else {
          return cond_ == null ?
              com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond.getDefaultInstance() : cond_;
        }
      }
      /**
       * <code>.msggamedata.MsgShopPurchaseCond cond = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond, com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond.Builder, com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCondOrBuilder> 
          getCondFieldBuilder() {
        if (condBuilder_ == null) {
          condBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond, com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCond.Builder, com.felania.msldb.MsgShopPurchaseCondOuterClass.MsgShopPurchaseCondOrBuilder>(
                  getCond(),
                  getParentForChildren(),
                  isClean());
          cond_ = null;
        }
        return condBuilder_;
      }

      private java.lang.Object egg_ = "";
      /**
       * <code>string egg = 2;</code>
       */
      public java.lang.String getEgg() {
        java.lang.Object ref = egg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          egg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string egg = 2;</code>
       */
      public com.google.protobuf.ByteString
          getEggBytes() {
        java.lang.Object ref = egg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          egg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string egg = 2;</code>
       */
      public Builder setEgg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        egg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string egg = 2;</code>
       */
      public Builder clearEgg() {
        
        egg_ = getDefaultInstance().getEgg();
        onChanged();
        return this;
      }
      /**
       * <code>string egg = 2;</code>
       */
      public Builder setEggBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        egg_ = value;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgShopItemMetaWinkyDisplay)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgShopItemMetaWinkyDisplay)
    private static final com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay();
    }

    public static com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgShopItemMetaWinkyDisplay>
        PARSER = new com.google.protobuf.AbstractParser<MsgShopItemMetaWinkyDisplay>() {
      public MsgShopItemMetaWinkyDisplay parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MsgShopItemMetaWinkyDisplay(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgShopItemMetaWinkyDisplay> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgShopItemMetaWinkyDisplay> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgShopItemMetaWinkyDisplayOuterClass.MsgShopItemMetaWinkyDisplay getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgShopItemMetaWinkyDisplay_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgShopItemMetaWinkyDisplay_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!MsgShopItemMetaWinkyDisplay.proto\022\013msg" +
      "gamedata\032\031MsgShopPurchaseCond.proto\"Z\n\033M" +
      "sgShopItemMetaWinkyDisplay\022.\n\004cond\030\001 \001(\013" +
      "2 .msggamedata.MsgShopPurchaseCond\022\013\n\003eg" +
      "g\030\002 \001(\tB\023\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.MsgShopPurchaseCondOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgShopItemMetaWinkyDisplay_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgShopItemMetaWinkyDisplay_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgShopItemMetaWinkyDisplay_descriptor,
        new java.lang.String[] { "Cond", "Egg", });
    com.felania.msldb.MsgShopPurchaseCondOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
