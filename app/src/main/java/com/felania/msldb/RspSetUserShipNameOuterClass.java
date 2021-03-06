// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspSetUserShipName.proto

package com.felania.msldb;

public final class RspSetUserShipNameOuterClass {
  private RspSetUserShipNameOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspSetUserShipNameOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspSetUserShipName)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
     */
    boolean hasUserShip();
    /**
     * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
     */
    com.felania.msldb.MsgUserShipOuterClass.MsgUserShip getUserShip();
    /**
     * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
     */
    com.felania.msldb.MsgUserShipOuterClass.MsgUserShipOrBuilder getUserShipOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.RspSetUserShipName}
   */
  public  static final class RspSetUserShipName extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspSetUserShipName)
      RspSetUserShipNameOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspSetUserShipName.newBuilder() to construct.
    private RspSetUserShipName(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspSetUserShipName() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspSetUserShipName(
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
              com.felania.msldb.MsgUserShipOuterClass.MsgUserShip.Builder subBuilder = null;
              if (userShip_ != null) {
                subBuilder = userShip_.toBuilder();
              }
              userShip_ = input.readMessage(com.felania.msldb.MsgUserShipOuterClass.MsgUserShip.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(userShip_);
                userShip_ = subBuilder.buildPartial();
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
      return com.felania.msldb.RspSetUserShipNameOuterClass.internal_static_msggamedata_RspSetUserShipName_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspSetUserShipNameOuterClass.internal_static_msggamedata_RspSetUserShipName_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName.class, com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName.Builder.class);
    }

    public static final int USER_SHIP_FIELD_NUMBER = 1;
    private com.felania.msldb.MsgUserShipOuterClass.MsgUserShip userShip_;
    /**
     * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
     */
    public boolean hasUserShip() {
      return userShip_ != null;
    }
    /**
     * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
     */
    public com.felania.msldb.MsgUserShipOuterClass.MsgUserShip getUserShip() {
      return userShip_ == null ? com.felania.msldb.MsgUserShipOuterClass.MsgUserShip.getDefaultInstance() : userShip_;
    }
    /**
     * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
     */
    public com.felania.msldb.MsgUserShipOuterClass.MsgUserShipOrBuilder getUserShipOrBuilder() {
      return getUserShip();
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
      if (userShip_ != null) {
        output.writeMessage(1, getUserShip());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (userShip_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getUserShip());
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
      if (!(obj instanceof com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName other = (com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName) obj;

      boolean result = true;
      result = result && (hasUserShip() == other.hasUserShip());
      if (hasUserShip()) {
        result = result && getUserShip()
            .equals(other.getUserShip());
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
      if (hasUserShip()) {
        hash = (37 * hash) + USER_SHIP_FIELD_NUMBER;
        hash = (53 * hash) + getUserShip().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName prototype) {
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
     * Protobuf type {@code msggamedata.RspSetUserShipName}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspSetUserShipName)
        com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipNameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspSetUserShipNameOuterClass.internal_static_msggamedata_RspSetUserShipName_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspSetUserShipNameOuterClass.internal_static_msggamedata_RspSetUserShipName_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName.class, com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName.Builder.class);
      }

      // Construct using com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName.newBuilder()
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
        if (userShipBuilder_ == null) {
          userShip_ = null;
        } else {
          userShip_ = null;
          userShipBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspSetUserShipNameOuterClass.internal_static_msggamedata_RspSetUserShipName_descriptor;
      }

      public com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName getDefaultInstanceForType() {
        return com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName.getDefaultInstance();
      }

      public com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName build() {
        com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName buildPartial() {
        com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName result = new com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName(this);
        if (userShipBuilder_ == null) {
          result.userShip_ = userShip_;
        } else {
          result.userShip_ = userShipBuilder_.build();
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
        if (other instanceof com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName) {
          return mergeFrom((com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName other) {
        if (other == com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName.getDefaultInstance()) return this;
        if (other.hasUserShip()) {
          mergeUserShip(other.getUserShip());
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
        com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.felania.msldb.MsgUserShipOuterClass.MsgUserShip userShip_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserShipOuterClass.MsgUserShip, com.felania.msldb.MsgUserShipOuterClass.MsgUserShip.Builder, com.felania.msldb.MsgUserShipOuterClass.MsgUserShipOrBuilder> userShipBuilder_;
      /**
       * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
       */
      public boolean hasUserShip() {
        return userShipBuilder_ != null || userShip_ != null;
      }
      /**
       * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
       */
      public com.felania.msldb.MsgUserShipOuterClass.MsgUserShip getUserShip() {
        if (userShipBuilder_ == null) {
          return userShip_ == null ? com.felania.msldb.MsgUserShipOuterClass.MsgUserShip.getDefaultInstance() : userShip_;
        } else {
          return userShipBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
       */
      public Builder setUserShip(com.felania.msldb.MsgUserShipOuterClass.MsgUserShip value) {
        if (userShipBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          userShip_ = value;
          onChanged();
        } else {
          userShipBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
       */
      public Builder setUserShip(
          com.felania.msldb.MsgUserShipOuterClass.MsgUserShip.Builder builderForValue) {
        if (userShipBuilder_ == null) {
          userShip_ = builderForValue.build();
          onChanged();
        } else {
          userShipBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
       */
      public Builder mergeUserShip(com.felania.msldb.MsgUserShipOuterClass.MsgUserShip value) {
        if (userShipBuilder_ == null) {
          if (userShip_ != null) {
            userShip_ =
              com.felania.msldb.MsgUserShipOuterClass.MsgUserShip.newBuilder(userShip_).mergeFrom(value).buildPartial();
          } else {
            userShip_ = value;
          }
          onChanged();
        } else {
          userShipBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
       */
      public Builder clearUserShip() {
        if (userShipBuilder_ == null) {
          userShip_ = null;
          onChanged();
        } else {
          userShip_ = null;
          userShipBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
       */
      public com.felania.msldb.MsgUserShipOuterClass.MsgUserShip.Builder getUserShipBuilder() {
        
        onChanged();
        return getUserShipFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
       */
      public com.felania.msldb.MsgUserShipOuterClass.MsgUserShipOrBuilder getUserShipOrBuilder() {
        if (userShipBuilder_ != null) {
          return userShipBuilder_.getMessageOrBuilder();
        } else {
          return userShip_ == null ?
              com.felania.msldb.MsgUserShipOuterClass.MsgUserShip.getDefaultInstance() : userShip_;
        }
      }
      /**
       * <code>.msggamedata.MsgUserShip user_ship = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgUserShipOuterClass.MsgUserShip, com.felania.msldb.MsgUserShipOuterClass.MsgUserShip.Builder, com.felania.msldb.MsgUserShipOuterClass.MsgUserShipOrBuilder> 
          getUserShipFieldBuilder() {
        if (userShipBuilder_ == null) {
          userShipBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgUserShipOuterClass.MsgUserShip, com.felania.msldb.MsgUserShipOuterClass.MsgUserShip.Builder, com.felania.msldb.MsgUserShipOuterClass.MsgUserShipOrBuilder>(
                  getUserShip(),
                  getParentForChildren(),
                  isClean());
          userShip_ = null;
        }
        return userShipBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.RspSetUserShipName)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspSetUserShipName)
    private static final com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName();
    }

    public static com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspSetUserShipName>
        PARSER = new com.google.protobuf.AbstractParser<RspSetUserShipName>() {
      public RspSetUserShipName parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RspSetUserShipName(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspSetUserShipName> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspSetUserShipName> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspSetUserShipNameOuterClass.RspSetUserShipName getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspSetUserShipName_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspSetUserShipName_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030RspSetUserShipName.proto\022\013msggamedata\032" +
      "\021MsgUserShip.proto\"A\n\022RspSetUserShipName" +
      "\022+\n\tuser_ship\030\001 \001(\0132\030.msggamedata.MsgUse" +
      "rShipB\023\n\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.MsgUserShipOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_RspSetUserShipName_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspSetUserShipName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspSetUserShipName_descriptor,
        new java.lang.String[] { "UserShip", });
    com.felania.msldb.MsgUserShipOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
