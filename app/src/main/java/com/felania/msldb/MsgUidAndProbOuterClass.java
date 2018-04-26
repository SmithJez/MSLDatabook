// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgUidAndProb.proto

package com.felania.msldb;

public final class MsgUidAndProbOuterClass {
  private MsgUidAndProbOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgUidAndProbOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgUidAndProb)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>float prob = 2;</code>
     */
    float getProb();

    /**
     * <code>.msggamedata.MsgStageMonster.RareType is_rare = 3;</code>
     */
    int getIsRareValue();
    /**
     * <code>.msggamedata.MsgStageMonster.RareType is_rare = 3;</code>
     */
    com.felania.msldb.MsgStageMonsterOuterClass.MsgStageMonster.RareType getIsRare();
  }
  /**
   * Protobuf type {@code msggamedata.MsgUidAndProb}
   */
  public  static final class MsgUidAndProb extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgUidAndProb)
      MsgUidAndProbOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgUidAndProb.newBuilder() to construct.
    private MsgUidAndProb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgUidAndProb() {
      uid_ = 0;
      prob_ = 0F;
      isRare_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgUidAndProb(
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
            case 21: {

              prob_ = input.readFloat();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              isRare_ = rawValue;
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
      return com.felania.msldb.MsgUidAndProbOuterClass.internal_static_msggamedata_MsgUidAndProb_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgUidAndProbOuterClass.internal_static_msggamedata_MsgUidAndProb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.class, com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>fixed32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int PROB_FIELD_NUMBER = 2;
    private float prob_;
    /**
     * <code>float prob = 2;</code>
     */
    public float getProb() {
      return prob_;
    }

    public static final int IS_RARE_FIELD_NUMBER = 3;
    private int isRare_;
    /**
     * <code>.msggamedata.MsgStageMonster.RareType is_rare = 3;</code>
     */
    public int getIsRareValue() {
      return isRare_;
    }
    /**
     * <code>.msggamedata.MsgStageMonster.RareType is_rare = 3;</code>
     */
    public com.felania.msldb.MsgStageMonsterOuterClass.MsgStageMonster.RareType getIsRare() {
      com.felania.msldb.MsgStageMonsterOuterClass.MsgStageMonster.RareType result = com.felania.msldb.MsgStageMonsterOuterClass.MsgStageMonster.RareType.valueOf(isRare_);
      return result == null ? com.felania.msldb.MsgStageMonsterOuterClass.MsgStageMonster.RareType.UNRECOGNIZED : result;
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
      if (prob_ != 0F) {
        output.writeFloat(2, prob_);
      }
      if (isRare_ != com.felania.msldb.MsgStageMonsterOuterClass.MsgStageMonster.RareType.Normal.getNumber()) {
        output.writeEnum(3, isRare_);
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
      if (prob_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, prob_);
      }
      if (isRare_ != com.felania.msldb.MsgStageMonsterOuterClass.MsgStageMonster.RareType.Normal.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, isRare_);
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
      if (!(obj instanceof com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb other = (com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb) obj;

      boolean result = true;
      result = result && (getUid()
          == other.getUid());
      result = result && (
          java.lang.Float.floatToIntBits(getProb())
          == java.lang.Float.floatToIntBits(
              other.getProb()));
      result = result && isRare_ == other.isRare_;
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
      hash = (37 * hash) + PROB_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getProb());
      hash = (37 * hash) + IS_RARE_FIELD_NUMBER;
      hash = (53 * hash) + isRare_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb prototype) {
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
     * Protobuf type {@code msggamedata.MsgUidAndProb}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgUidAndProb)
        com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProbOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgUidAndProbOuterClass.internal_static_msggamedata_MsgUidAndProb_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgUidAndProbOuterClass.internal_static_msggamedata_MsgUidAndProb_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.class, com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.Builder.class);
      }

      // Construct using com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.newBuilder()
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
        uid_ = 0;

        prob_ = 0F;

        isRare_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgUidAndProbOuterClass.internal_static_msggamedata_MsgUidAndProb_descriptor;
      }

      public com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb getDefaultInstanceForType() {
        return com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.getDefaultInstance();
      }

      public com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb build() {
        com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb buildPartial() {
        com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb result = new com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb(this);
        result.uid_ = uid_;
        result.prob_ = prob_;
        result.isRare_ = isRare_;
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
        if (other instanceof com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb) {
          return mergeFrom((com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb other) {
        if (other == com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getProb() != 0F) {
          setProb(other.getProb());
        }
        if (other.isRare_ != 0) {
          setIsRareValue(other.getIsRareValue());
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
        com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

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

      private float prob_ ;
      /**
       * <code>float prob = 2;</code>
       */
      public float getProb() {
        return prob_;
      }
      /**
       * <code>float prob = 2;</code>
       */
      public Builder setProb(float value) {
        
        prob_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float prob = 2;</code>
       */
      public Builder clearProb() {
        
        prob_ = 0F;
        onChanged();
        return this;
      }

      private int isRare_ = 0;
      /**
       * <code>.msggamedata.MsgStageMonster.RareType is_rare = 3;</code>
       */
      public int getIsRareValue() {
        return isRare_;
      }
      /**
       * <code>.msggamedata.MsgStageMonster.RareType is_rare = 3;</code>
       */
      public Builder setIsRareValue(int value) {
        isRare_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgStageMonster.RareType is_rare = 3;</code>
       */
      public com.felania.msldb.MsgStageMonsterOuterClass.MsgStageMonster.RareType getIsRare() {
        com.felania.msldb.MsgStageMonsterOuterClass.MsgStageMonster.RareType result = com.felania.msldb.MsgStageMonsterOuterClass.MsgStageMonster.RareType.valueOf(isRare_);
        return result == null ? com.felania.msldb.MsgStageMonsterOuterClass.MsgStageMonster.RareType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MsgStageMonster.RareType is_rare = 3;</code>
       */
      public Builder setIsRare(com.felania.msldb.MsgStageMonsterOuterClass.MsgStageMonster.RareType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        isRare_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgStageMonster.RareType is_rare = 3;</code>
       */
      public Builder clearIsRare() {
        
        isRare_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgUidAndProb)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgUidAndProb)
    private static final com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb();
    }

    public static com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgUidAndProb>
        PARSER = new com.google.protobuf.AbstractParser<MsgUidAndProb>() {
      public MsgUidAndProb parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgUidAndProb(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgUidAndProb> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgUidAndProb> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgUidAndProbOuterClass.MsgUidAndProb getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgUidAndProb_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgUidAndProb_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023MsgUidAndProb.proto\022\013msggamedata\032\025MsgS" +
      "tageMonster.proto\"b\n\rMsgUidAndProb\022\013\n\003ui" +
      "d\030\001 \001(\007\022\014\n\004prob\030\002 \001(\002\0226\n\007is_rare\030\003 \001(\0162%" +
      ".msggamedata.MsgStageMonster.RareTypeB\023\n" +
      "\021com.felania.msldbb\006proto3"
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
          com.felania.msldb.MsgStageMonsterOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgUidAndProb_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgUidAndProb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgUidAndProb_descriptor,
        new java.lang.String[] { "Uid", "Prob", "IsRare", });
    com.felania.msldb.MsgStageMonsterOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
