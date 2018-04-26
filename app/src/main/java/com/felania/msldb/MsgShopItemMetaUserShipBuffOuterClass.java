// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgShopItemMetaUserShipBuff.proto

package com.felania.msldb;

public final class MsgShopItemMetaUserShipBuffOuterClass {
  private MsgShopItemMetaUserShipBuffOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgShopItemMetaUserShipBuffOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgShopItemMetaUserShipBuff)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 self = 1;</code>
     */
    int getSelf();

    /**
     * <code>uint32 allies = 2;</code>
     */
    int getAllies();
  }
  /**
   * Protobuf type {@code msggamedata.MsgShopItemMetaUserShipBuff}
   */
  public  static final class MsgShopItemMetaUserShipBuff extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgShopItemMetaUserShipBuff)
      MsgShopItemMetaUserShipBuffOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgShopItemMetaUserShipBuff.newBuilder() to construct.
    private MsgShopItemMetaUserShipBuff(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgShopItemMetaUserShipBuff() {
      self_ = 0;
      allies_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgShopItemMetaUserShipBuff(
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
            case 8: {

              self_ = input.readUInt32();
              break;
            }
            case 16: {

              allies_ = input.readUInt32();
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
      return com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.internal_static_msggamedata_MsgShopItemMetaUserShipBuff_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.internal_static_msggamedata_MsgShopItemMetaUserShipBuff_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff.class, com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff.Builder.class);
    }

    public static final int SELF_FIELD_NUMBER = 1;
    private int self_;
    /**
     * <code>uint32 self = 1;</code>
     */
    public int getSelf() {
      return self_;
    }

    public static final int ALLIES_FIELD_NUMBER = 2;
    private int allies_;
    /**
     * <code>uint32 allies = 2;</code>
     */
    public int getAllies() {
      return allies_;
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
      if (self_ != 0) {
        output.writeUInt32(1, self_);
      }
      if (allies_ != 0) {
        output.writeUInt32(2, allies_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (self_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, self_);
      }
      if (allies_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, allies_);
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
      if (!(obj instanceof com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff other = (com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff) obj;

      boolean result = true;
      result = result && (getSelf()
          == other.getSelf());
      result = result && (getAllies()
          == other.getAllies());
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
      hash = (37 * hash) + SELF_FIELD_NUMBER;
      hash = (53 * hash) + getSelf();
      hash = (37 * hash) + ALLIES_FIELD_NUMBER;
      hash = (53 * hash) + getAllies();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff prototype) {
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
     * Protobuf type {@code msggamedata.MsgShopItemMetaUserShipBuff}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgShopItemMetaUserShipBuff)
        com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuffOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.internal_static_msggamedata_MsgShopItemMetaUserShipBuff_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.internal_static_msggamedata_MsgShopItemMetaUserShipBuff_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff.class, com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff.Builder.class);
      }

      // Construct using com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff.newBuilder()
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
        self_ = 0;

        allies_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.internal_static_msggamedata_MsgShopItemMetaUserShipBuff_descriptor;
      }

      public com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff getDefaultInstanceForType() {
        return com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff.getDefaultInstance();
      }

      public com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff build() {
        com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff buildPartial() {
        com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff result = new com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff(this);
        result.self_ = self_;
        result.allies_ = allies_;
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
        if (other instanceof com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff) {
          return mergeFrom((com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff other) {
        if (other == com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff.getDefaultInstance()) return this;
        if (other.getSelf() != 0) {
          setSelf(other.getSelf());
        }
        if (other.getAllies() != 0) {
          setAllies(other.getAllies());
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
        com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int self_ ;
      /**
       * <code>uint32 self = 1;</code>
       */
      public int getSelf() {
        return self_;
      }
      /**
       * <code>uint32 self = 1;</code>
       */
      public Builder setSelf(int value) {
        
        self_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 self = 1;</code>
       */
      public Builder clearSelf() {
        
        self_ = 0;
        onChanged();
        return this;
      }

      private int allies_ ;
      /**
       * <code>uint32 allies = 2;</code>
       */
      public int getAllies() {
        return allies_;
      }
      /**
       * <code>uint32 allies = 2;</code>
       */
      public Builder setAllies(int value) {
        
        allies_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 allies = 2;</code>
       */
      public Builder clearAllies() {
        
        allies_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgShopItemMetaUserShipBuff)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgShopItemMetaUserShipBuff)
    private static final com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff();
    }

    public static com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgShopItemMetaUserShipBuff>
        PARSER = new com.google.protobuf.AbstractParser<MsgShopItemMetaUserShipBuff>() {
      public MsgShopItemMetaUserShipBuff parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgShopItemMetaUserShipBuff(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgShopItemMetaUserShipBuff> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgShopItemMetaUserShipBuff> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgShopItemMetaUserShipBuffOuterClass.MsgShopItemMetaUserShipBuff getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgShopItemMetaUserShipBuff_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgShopItemMetaUserShipBuff_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!MsgShopItemMetaUserShipBuff.proto\022\013msg" +
      "gamedata\";\n\033MsgShopItemMetaUserShipBuff\022" +
      "\014\n\004self\030\001 \001(\r\022\016\n\006allies\030\002 \001(\rB\023\n\021com.fel" +
      "ania.msldbb\006proto3"
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
        }, assigner);
    internal_static_msggamedata_MsgShopItemMetaUserShipBuff_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgShopItemMetaUserShipBuff_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgShopItemMetaUserShipBuff_descriptor,
        new java.lang.String[] { "Self", "Allies", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
