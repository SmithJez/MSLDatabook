// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgDungeonBattleClearHistory.proto

package com.felania.msldb;

public final class MsgDungeonBattleClearHistoryOuterClass {
  private MsgDungeonBattleClearHistoryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgDungeonBattleClearHistoryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgDungeonBattleClearHistory)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 stage_uid = 1;</code>
     */
    int getStageUid();

    /**
     * <code>fixed32 substage_uid = 2;</code>
     */
    int getSubstageUid();

    /**
     * <code>uint32 challenge_count = 4;</code>
     */
    int getChallengeCount();

    /**
     * <code>uint32 clear_count = 5;</code>
     */
    int getClearCount();
  }
  /**
   * Protobuf type {@code msggamedata.MsgDungeonBattleClearHistory}
   */
  public  static final class MsgDungeonBattleClearHistory extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgDungeonBattleClearHistory)
      MsgDungeonBattleClearHistoryOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgDungeonBattleClearHistory.newBuilder() to construct.
    private MsgDungeonBattleClearHistory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgDungeonBattleClearHistory() {
      stageUid_ = 0;
      substageUid_ = 0;
      challengeCount_ = 0;
      clearCount_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgDungeonBattleClearHistory(
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

              stageUid_ = input.readFixed32();
              break;
            }
            case 21: {

              substageUid_ = input.readFixed32();
              break;
            }
            case 32: {

              challengeCount_ = input.readUInt32();
              break;
            }
            case 40: {

              clearCount_ = input.readUInt32();
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
      return com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.internal_static_msggamedata_MsgDungeonBattleClearHistory_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.internal_static_msggamedata_MsgDungeonBattleClearHistory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory.class, com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory.Builder.class);
    }

    public static final int STAGE_UID_FIELD_NUMBER = 1;
    private int stageUid_;
    /**
     * <code>fixed32 stage_uid = 1;</code>
     */
    public int getStageUid() {
      return stageUid_;
    }

    public static final int SUBSTAGE_UID_FIELD_NUMBER = 2;
    private int substageUid_;
    /**
     * <code>fixed32 substage_uid = 2;</code>
     */
    public int getSubstageUid() {
      return substageUid_;
    }

    public static final int CHALLENGE_COUNT_FIELD_NUMBER = 4;
    private int challengeCount_;
    /**
     * <code>uint32 challenge_count = 4;</code>
     */
    public int getChallengeCount() {
      return challengeCount_;
    }

    public static final int CLEAR_COUNT_FIELD_NUMBER = 5;
    private int clearCount_;
    /**
     * <code>uint32 clear_count = 5;</code>
     */
    public int getClearCount() {
      return clearCount_;
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
      if (stageUid_ != 0) {
        output.writeFixed32(1, stageUid_);
      }
      if (substageUid_ != 0) {
        output.writeFixed32(2, substageUid_);
      }
      if (challengeCount_ != 0) {
        output.writeUInt32(4, challengeCount_);
      }
      if (clearCount_ != 0) {
        output.writeUInt32(5, clearCount_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, stageUid_);
      }
      if (substageUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(2, substageUid_);
      }
      if (challengeCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, challengeCount_);
      }
      if (clearCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, clearCount_);
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
      if (!(obj instanceof com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory other = (com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory) obj;

      boolean result = true;
      result = result && (getStageUid()
          == other.getStageUid());
      result = result && (getSubstageUid()
          == other.getSubstageUid());
      result = result && (getChallengeCount()
          == other.getChallengeCount());
      result = result && (getClearCount()
          == other.getClearCount());
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
      hash = (37 * hash) + STAGE_UID_FIELD_NUMBER;
      hash = (53 * hash) + getStageUid();
      hash = (37 * hash) + SUBSTAGE_UID_FIELD_NUMBER;
      hash = (53 * hash) + getSubstageUid();
      hash = (37 * hash) + CHALLENGE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeCount();
      hash = (37 * hash) + CLEAR_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getClearCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory prototype) {
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
     * Protobuf type {@code msggamedata.MsgDungeonBattleClearHistory}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgDungeonBattleClearHistory)
        com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistoryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.internal_static_msggamedata_MsgDungeonBattleClearHistory_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.internal_static_msggamedata_MsgDungeonBattleClearHistory_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory.class, com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory.Builder.class);
      }

      // Construct using com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory.newBuilder()
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
        stageUid_ = 0;

        substageUid_ = 0;

        challengeCount_ = 0;

        clearCount_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.internal_static_msggamedata_MsgDungeonBattleClearHistory_descriptor;
      }

      public com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory getDefaultInstanceForType() {
        return com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory.getDefaultInstance();
      }

      public com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory build() {
        com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory buildPartial() {
        com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory result = new com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory(this);
        result.stageUid_ = stageUid_;
        result.substageUid_ = substageUid_;
        result.challengeCount_ = challengeCount_;
        result.clearCount_ = clearCount_;
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
        if (other instanceof com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory) {
          return mergeFrom((com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory other) {
        if (other == com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory.getDefaultInstance()) return this;
        if (other.getStageUid() != 0) {
          setStageUid(other.getStageUid());
        }
        if (other.getSubstageUid() != 0) {
          setSubstageUid(other.getSubstageUid());
        }
        if (other.getChallengeCount() != 0) {
          setChallengeCount(other.getChallengeCount());
        }
        if (other.getClearCount() != 0) {
          setClearCount(other.getClearCount());
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
        com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int stageUid_ ;
      /**
       * <code>fixed32 stage_uid = 1;</code>
       */
      public int getStageUid() {
        return stageUid_;
      }
      /**
       * <code>fixed32 stage_uid = 1;</code>
       */
      public Builder setStageUid(int value) {
        
        stageUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 stage_uid = 1;</code>
       */
      public Builder clearStageUid() {
        
        stageUid_ = 0;
        onChanged();
        return this;
      }

      private int substageUid_ ;
      /**
       * <code>fixed32 substage_uid = 2;</code>
       */
      public int getSubstageUid() {
        return substageUid_;
      }
      /**
       * <code>fixed32 substage_uid = 2;</code>
       */
      public Builder setSubstageUid(int value) {
        
        substageUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 substage_uid = 2;</code>
       */
      public Builder clearSubstageUid() {
        
        substageUid_ = 0;
        onChanged();
        return this;
      }

      private int challengeCount_ ;
      /**
       * <code>uint32 challenge_count = 4;</code>
       */
      public int getChallengeCount() {
        return challengeCount_;
      }
      /**
       * <code>uint32 challenge_count = 4;</code>
       */
      public Builder setChallengeCount(int value) {
        
        challengeCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_count = 4;</code>
       */
      public Builder clearChallengeCount() {
        
        challengeCount_ = 0;
        onChanged();
        return this;
      }

      private int clearCount_ ;
      /**
       * <code>uint32 clear_count = 5;</code>
       */
      public int getClearCount() {
        return clearCount_;
      }
      /**
       * <code>uint32 clear_count = 5;</code>
       */
      public Builder setClearCount(int value) {
        
        clearCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 clear_count = 5;</code>
       */
      public Builder clearClearCount() {
        
        clearCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgDungeonBattleClearHistory)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgDungeonBattleClearHistory)
    private static final com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory();
    }

    public static com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgDungeonBattleClearHistory>
        PARSER = new com.google.protobuf.AbstractParser<MsgDungeonBattleClearHistory>() {
      public MsgDungeonBattleClearHistory parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgDungeonBattleClearHistory(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgDungeonBattleClearHistory> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgDungeonBattleClearHistory> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgDungeonBattleClearHistoryOuterClass.MsgDungeonBattleClearHistory getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgDungeonBattleClearHistory_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgDungeonBattleClearHistory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"MsgDungeonBattleClearHistory.proto\022\013ms" +
      "ggamedata\"u\n\034MsgDungeonBattleClearHistor" +
      "y\022\021\n\tstage_uid\030\001 \001(\007\022\024\n\014substage_uid\030\002 \001" +
      "(\007\022\027\n\017challenge_count\030\004 \001(\r\022\023\n\013clear_cou" +
      "nt\030\005 \001(\rB\023\n\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_MsgDungeonBattleClearHistory_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgDungeonBattleClearHistory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgDungeonBattleClearHistory_descriptor,
        new java.lang.String[] { "StageUid", "SubstageUid", "ChallengeCount", "ClearCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
