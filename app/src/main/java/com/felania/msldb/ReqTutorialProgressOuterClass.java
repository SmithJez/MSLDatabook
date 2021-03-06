// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqTutorialProgress.proto

package com.felania.msldb;

public final class ReqTutorialProgressOuterClass {
  private ReqTutorialProgressOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqTutorialProgressOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqTutorialProgress)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.TutorialStep tutorial_step = 1;</code>
     */
    int getTutorialStepValue();
    /**
     * <code>.msggamedata.TutorialStep tutorial_step = 1;</code>
     */
    com.felania.msldb.TutorialStepOuterClass.TutorialStep getTutorialStep();
  }
  /**
   * Protobuf type {@code msggamedata.ReqTutorialProgress}
   */
  public  static final class ReqTutorialProgress extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqTutorialProgress)
      ReqTutorialProgressOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqTutorialProgress.newBuilder() to construct.
    private ReqTutorialProgress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqTutorialProgress() {
      tutorialStep_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqTutorialProgress(
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
              int rawValue = input.readEnum();

              tutorialStep_ = rawValue;
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
      return com.felania.msldb.ReqTutorialProgressOuterClass.internal_static_msggamedata_ReqTutorialProgress_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqTutorialProgressOuterClass.internal_static_msggamedata_ReqTutorialProgress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress.class, com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress.Builder.class);
    }

    public static final int TUTORIAL_STEP_FIELD_NUMBER = 1;
    private int tutorialStep_;
    /**
     * <code>.msggamedata.TutorialStep tutorial_step = 1;</code>
     */
    public int getTutorialStepValue() {
      return tutorialStep_;
    }
    /**
     * <code>.msggamedata.TutorialStep tutorial_step = 1;</code>
     */
    public com.felania.msldb.TutorialStepOuterClass.TutorialStep getTutorialStep() {
      com.felania.msldb.TutorialStepOuterClass.TutorialStep result = com.felania.msldb.TutorialStepOuterClass.TutorialStep.valueOf(tutorialStep_);
      return result == null ? com.felania.msldb.TutorialStepOuterClass.TutorialStep.UNRECOGNIZED : result;
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
      if (tutorialStep_ != com.felania.msldb.TutorialStepOuterClass.TutorialStep.TutorialStepNULL.getNumber()) {
        output.writeEnum(1, tutorialStep_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (tutorialStep_ != com.felania.msldb.TutorialStepOuterClass.TutorialStep.TutorialStepNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, tutorialStep_);
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
      if (!(obj instanceof com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress other = (com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress) obj;

      boolean result = true;
      result = result && tutorialStep_ == other.tutorialStep_;
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
      hash = (37 * hash) + TUTORIAL_STEP_FIELD_NUMBER;
      hash = (53 * hash) + tutorialStep_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress prototype) {
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
     * Protobuf type {@code msggamedata.ReqTutorialProgress}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqTutorialProgress)
        com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgressOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqTutorialProgressOuterClass.internal_static_msggamedata_ReqTutorialProgress_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqTutorialProgressOuterClass.internal_static_msggamedata_ReqTutorialProgress_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress.class, com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress.Builder.class);
      }

      // Construct using com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress.newBuilder()
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
        tutorialStep_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqTutorialProgressOuterClass.internal_static_msggamedata_ReqTutorialProgress_descriptor;
      }

      public com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress getDefaultInstanceForType() {
        return com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress.getDefaultInstance();
      }

      public com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress build() {
        com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress buildPartial() {
        com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress result = new com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress(this);
        result.tutorialStep_ = tutorialStep_;
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
        if (other instanceof com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress) {
          return mergeFrom((com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress other) {
        if (other == com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress.getDefaultInstance()) return this;
        if (other.tutorialStep_ != 0) {
          setTutorialStepValue(other.getTutorialStepValue());
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
        com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int tutorialStep_ = 0;
      /**
       * <code>.msggamedata.TutorialStep tutorial_step = 1;</code>
       */
      public int getTutorialStepValue() {
        return tutorialStep_;
      }
      /**
       * <code>.msggamedata.TutorialStep tutorial_step = 1;</code>
       */
      public Builder setTutorialStepValue(int value) {
        tutorialStep_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.TutorialStep tutorial_step = 1;</code>
       */
      public com.felania.msldb.TutorialStepOuterClass.TutorialStep getTutorialStep() {
        com.felania.msldb.TutorialStepOuterClass.TutorialStep result = com.felania.msldb.TutorialStepOuterClass.TutorialStep.valueOf(tutorialStep_);
        return result == null ? com.felania.msldb.TutorialStepOuterClass.TutorialStep.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.TutorialStep tutorial_step = 1;</code>
       */
      public Builder setTutorialStep(com.felania.msldb.TutorialStepOuterClass.TutorialStep value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        tutorialStep_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.TutorialStep tutorial_step = 1;</code>
       */
      public Builder clearTutorialStep() {
        
        tutorialStep_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqTutorialProgress)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqTutorialProgress)
    private static final com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress();
    }

    public static com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqTutorialProgress>
        PARSER = new com.google.protobuf.AbstractParser<ReqTutorialProgress>() {
      public ReqTutorialProgress parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqTutorialProgress(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqTutorialProgress> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqTutorialProgress> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqTutorialProgressOuterClass.ReqTutorialProgress getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqTutorialProgress_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqTutorialProgress_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ReqTutorialProgress.proto\022\013msggamedata" +
      "\032\022TutorialStep.proto\"G\n\023ReqTutorialProgr" +
      "ess\0220\n\rtutorial_step\030\001 \001(\0162\031.msggamedata" +
      ".TutorialStepB\023\n\021com.felania.msldbb\006prot" +
      "o3"
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
          com.felania.msldb.TutorialStepOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_ReqTutorialProgress_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqTutorialProgress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqTutorialProgress_descriptor,
        new java.lang.String[] { "TutorialStep", });
    com.felania.msldb.TutorialStepOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
