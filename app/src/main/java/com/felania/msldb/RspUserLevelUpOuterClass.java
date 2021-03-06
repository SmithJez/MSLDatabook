// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspUserLevelUp.proto

package com.felania.msldb;

public final class RspUserLevelUpOuterClass {
  private RspUserLevelUpOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RspUserLevelUpOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.RspUserLevelUp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 lev = 1;</code>
     */
    int getLev();

    /**
     * <code>uint32 levup_reward_gem = 2;</code>
     */
    int getLevupRewardGem();
  }
  /**
   * Protobuf type {@code msggamedata.RspUserLevelUp}
   */
  public  static final class RspUserLevelUp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.RspUserLevelUp)
      RspUserLevelUpOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RspUserLevelUp.newBuilder() to construct.
    private RspUserLevelUp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RspUserLevelUp() {
      lev_ = 0;
      levupRewardGem_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RspUserLevelUp(
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

              lev_ = input.readUInt32();
              break;
            }
            case 16: {

              levupRewardGem_ = input.readUInt32();
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
      return com.felania.msldb.RspUserLevelUpOuterClass.internal_static_msggamedata_RspUserLevelUp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.RspUserLevelUpOuterClass.internal_static_msggamedata_RspUserLevelUp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp.class, com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp.Builder.class);
    }

    public static final int LEV_FIELD_NUMBER = 1;
    private int lev_;
    /**
     * <code>uint32 lev = 1;</code>
     */
    public int getLev() {
      return lev_;
    }

    public static final int LEVUP_REWARD_GEM_FIELD_NUMBER = 2;
    private int levupRewardGem_;
    /**
     * <code>uint32 levup_reward_gem = 2;</code>
     */
    public int getLevupRewardGem() {
      return levupRewardGem_;
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
      if (lev_ != 0) {
        output.writeUInt32(1, lev_);
      }
      if (levupRewardGem_ != 0) {
        output.writeUInt32(2, levupRewardGem_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lev_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, lev_);
      }
      if (levupRewardGem_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, levupRewardGem_);
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
      if (!(obj instanceof com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp)) {
        return super.equals(obj);
      }
      com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp other = (com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp) obj;

      boolean result = true;
      result = result && (getLev()
          == other.getLev());
      result = result && (getLevupRewardGem()
          == other.getLevupRewardGem());
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
      hash = (37 * hash) + LEV_FIELD_NUMBER;
      hash = (53 * hash) + getLev();
      hash = (37 * hash) + LEVUP_REWARD_GEM_FIELD_NUMBER;
      hash = (53 * hash) + getLevupRewardGem();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp prototype) {
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
     * Protobuf type {@code msggamedata.RspUserLevelUp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.RspUserLevelUp)
        com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUpOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.RspUserLevelUpOuterClass.internal_static_msggamedata_RspUserLevelUp_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.RspUserLevelUpOuterClass.internal_static_msggamedata_RspUserLevelUp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp.class, com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp.Builder.class);
      }

      // Construct using com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp.newBuilder()
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
        lev_ = 0;

        levupRewardGem_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.RspUserLevelUpOuterClass.internal_static_msggamedata_RspUserLevelUp_descriptor;
      }

      public com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp getDefaultInstanceForType() {
        return com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp.getDefaultInstance();
      }

      public com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp build() {
        com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp buildPartial() {
        com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp result = new com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp(this);
        result.lev_ = lev_;
        result.levupRewardGem_ = levupRewardGem_;
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
        if (other instanceof com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp) {
          return mergeFrom((com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp other) {
        if (other == com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp.getDefaultInstance()) return this;
        if (other.getLev() != 0) {
          setLev(other.getLev());
        }
        if (other.getLevupRewardGem() != 0) {
          setLevupRewardGem(other.getLevupRewardGem());
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
        com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int lev_ ;
      /**
       * <code>uint32 lev = 1;</code>
       */
      public int getLev() {
        return lev_;
      }
      /**
       * <code>uint32 lev = 1;</code>
       */
      public Builder setLev(int value) {
        
        lev_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 lev = 1;</code>
       */
      public Builder clearLev() {
        
        lev_ = 0;
        onChanged();
        return this;
      }

      private int levupRewardGem_ ;
      /**
       * <code>uint32 levup_reward_gem = 2;</code>
       */
      public int getLevupRewardGem() {
        return levupRewardGem_;
      }
      /**
       * <code>uint32 levup_reward_gem = 2;</code>
       */
      public Builder setLevupRewardGem(int value) {
        
        levupRewardGem_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 levup_reward_gem = 2;</code>
       */
      public Builder clearLevupRewardGem() {
        
        levupRewardGem_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.RspUserLevelUp)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.RspUserLevelUp)
    private static final com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp();
    }

    public static com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RspUserLevelUp>
        PARSER = new com.google.protobuf.AbstractParser<RspUserLevelUp>() {
      public RspUserLevelUp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RspUserLevelUp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RspUserLevelUp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RspUserLevelUp> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.RspUserLevelUpOuterClass.RspUserLevelUp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_RspUserLevelUp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_RspUserLevelUp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024RspUserLevelUp.proto\022\013msggamedata\"7\n\016R" +
      "spUserLevelUp\022\013\n\003lev\030\001 \001(\r\022\030\n\020levup_rewa" +
      "rd_gem\030\002 \001(\rB\023\n\021com.felania.msldbb\006proto" +
      "3"
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
    internal_static_msggamedata_RspUserLevelUp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_RspUserLevelUp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_RspUserLevelUp_descriptor,
        new java.lang.String[] { "Lev", "LevupRewardGem", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
