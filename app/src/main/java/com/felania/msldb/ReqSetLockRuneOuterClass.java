// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqSetLockRune.proto

package com.felania.msldb;

public final class ReqSetLockRuneOuterClass {
  private ReqSetLockRuneOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqSetLockRuneOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqSetLockRune)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 rune_id = 1;</code>
     */
    long getRuneId();

    /**
     * <code>bool locked = 2;</code>
     */
    boolean getLocked();
  }
  /**
   * Protobuf type {@code msggamedata.ReqSetLockRune}
   */
  public  static final class ReqSetLockRune extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqSetLockRune)
      ReqSetLockRuneOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqSetLockRune.newBuilder() to construct.
    private ReqSetLockRune(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqSetLockRune() {
      runeId_ = 0L;
      locked_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqSetLockRune(
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

              runeId_ = input.readUInt64();
              break;
            }
            case 16: {

              locked_ = input.readBool();
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
      return com.felania.msldb.ReqSetLockRuneOuterClass.internal_static_msggamedata_ReqSetLockRune_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqSetLockRuneOuterClass.internal_static_msggamedata_ReqSetLockRune_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune.class, com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune.Builder.class);
    }

    public static final int RUNE_ID_FIELD_NUMBER = 1;
    private long runeId_;
    /**
     * <code>uint64 rune_id = 1;</code>
     */
    public long getRuneId() {
      return runeId_;
    }

    public static final int LOCKED_FIELD_NUMBER = 2;
    private boolean locked_;
    /**
     * <code>bool locked = 2;</code>
     */
    public boolean getLocked() {
      return locked_;
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
      if (runeId_ != 0L) {
        output.writeUInt64(1, runeId_);
      }
      if (locked_ != false) {
        output.writeBool(2, locked_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (runeId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, runeId_);
      }
      if (locked_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, locked_);
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
      if (!(obj instanceof com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune other = (com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune) obj;

      boolean result = true;
      result = result && (getRuneId()
          == other.getRuneId());
      result = result && (getLocked()
          == other.getLocked());
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
      hash = (37 * hash) + RUNE_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRuneId());
      hash = (37 * hash) + LOCKED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getLocked());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune prototype) {
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
     * Protobuf type {@code msggamedata.ReqSetLockRune}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqSetLockRune)
        com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRuneOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqSetLockRuneOuterClass.internal_static_msggamedata_ReqSetLockRune_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqSetLockRuneOuterClass.internal_static_msggamedata_ReqSetLockRune_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune.class, com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune.Builder.class);
      }

      // Construct using com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune.newBuilder()
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
        runeId_ = 0L;

        locked_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqSetLockRuneOuterClass.internal_static_msggamedata_ReqSetLockRune_descriptor;
      }

      public com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune getDefaultInstanceForType() {
        return com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune.getDefaultInstance();
      }

      public com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune build() {
        com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune buildPartial() {
        com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune result = new com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune(this);
        result.runeId_ = runeId_;
        result.locked_ = locked_;
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
        if (other instanceof com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune) {
          return mergeFrom((com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune other) {
        if (other == com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune.getDefaultInstance()) return this;
        if (other.getRuneId() != 0L) {
          setRuneId(other.getRuneId());
        }
        if (other.getLocked() != false) {
          setLocked(other.getLocked());
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
        com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long runeId_ ;
      /**
       * <code>uint64 rune_id = 1;</code>
       */
      public long getRuneId() {
        return runeId_;
      }
      /**
       * <code>uint64 rune_id = 1;</code>
       */
      public Builder setRuneId(long value) {
        
        runeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 rune_id = 1;</code>
       */
      public Builder clearRuneId() {
        
        runeId_ = 0L;
        onChanged();
        return this;
      }

      private boolean locked_ ;
      /**
       * <code>bool locked = 2;</code>
       */
      public boolean getLocked() {
        return locked_;
      }
      /**
       * <code>bool locked = 2;</code>
       */
      public Builder setLocked(boolean value) {
        
        locked_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool locked = 2;</code>
       */
      public Builder clearLocked() {
        
        locked_ = false;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqSetLockRune)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqSetLockRune)
    private static final com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune();
    }

    public static com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqSetLockRune>
        PARSER = new com.google.protobuf.AbstractParser<ReqSetLockRune>() {
      public ReqSetLockRune parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqSetLockRune(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqSetLockRune> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqSetLockRune> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqSetLockRuneOuterClass.ReqSetLockRune getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqSetLockRune_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqSetLockRune_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ReqSetLockRune.proto\022\013msggamedata\"1\n\016R" +
      "eqSetLockRune\022\017\n\007rune_id\030\001 \001(\004\022\016\n\006locked" +
      "\030\002 \001(\010B\023\n\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_ReqSetLockRune_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqSetLockRune_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqSetLockRune_descriptor,
        new java.lang.String[] { "RuneId", "Locked", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
