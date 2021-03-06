// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqShareSuperEvolutionFestival.proto

package com.felania.msldb;

public final class ReqShareSuperEvolutionFestivalOuterClass {
  private ReqShareSuperEvolutionFestivalOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqShareSuperEvolutionFestivalOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqShareSuperEvolutionFestival)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 select_monster = 1;</code>
     */
    int getSelectMonster();
  }
  /**
   * Protobuf type {@code msggamedata.ReqShareSuperEvolutionFestival}
   */
  public  static final class ReqShareSuperEvolutionFestival extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqShareSuperEvolutionFestival)
      ReqShareSuperEvolutionFestivalOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqShareSuperEvolutionFestival.newBuilder() to construct.
    private ReqShareSuperEvolutionFestival(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqShareSuperEvolutionFestival() {
      selectMonster_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqShareSuperEvolutionFestival(
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

              selectMonster_ = input.readFixed32();
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
      return com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.internal_static_msggamedata_ReqShareSuperEvolutionFestival_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.internal_static_msggamedata_ReqShareSuperEvolutionFestival_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival.class, com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival.Builder.class);
    }

    public static final int SELECT_MONSTER_FIELD_NUMBER = 1;
    private int selectMonster_;
    /**
     * <code>fixed32 select_monster = 1;</code>
     */
    public int getSelectMonster() {
      return selectMonster_;
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
      if (selectMonster_ != 0) {
        output.writeFixed32(1, selectMonster_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (selectMonster_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, selectMonster_);
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
      if (!(obj instanceof com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival other = (com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival) obj;

      boolean result = true;
      result = result && (getSelectMonster()
          == other.getSelectMonster());
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
      hash = (37 * hash) + SELECT_MONSTER_FIELD_NUMBER;
      hash = (53 * hash) + getSelectMonster();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival prototype) {
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
     * Protobuf type {@code msggamedata.ReqShareSuperEvolutionFestival}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqShareSuperEvolutionFestival)
        com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestivalOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.internal_static_msggamedata_ReqShareSuperEvolutionFestival_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.internal_static_msggamedata_ReqShareSuperEvolutionFestival_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival.class, com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival.Builder.class);
      }

      // Construct using com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival.newBuilder()
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
        selectMonster_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.internal_static_msggamedata_ReqShareSuperEvolutionFestival_descriptor;
      }

      public com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival getDefaultInstanceForType() {
        return com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival.getDefaultInstance();
      }

      public com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival build() {
        com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival buildPartial() {
        com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival result = new com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival(this);
        result.selectMonster_ = selectMonster_;
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
        if (other instanceof com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival) {
          return mergeFrom((com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival other) {
        if (other == com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival.getDefaultInstance()) return this;
        if (other.getSelectMonster() != 0) {
          setSelectMonster(other.getSelectMonster());
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
        com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int selectMonster_ ;
      /**
       * <code>fixed32 select_monster = 1;</code>
       */
      public int getSelectMonster() {
        return selectMonster_;
      }
      /**
       * <code>fixed32 select_monster = 1;</code>
       */
      public Builder setSelectMonster(int value) {
        
        selectMonster_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 select_monster = 1;</code>
       */
      public Builder clearSelectMonster() {
        
        selectMonster_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqShareSuperEvolutionFestival)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqShareSuperEvolutionFestival)
    private static final com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival();
    }

    public static com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqShareSuperEvolutionFestival>
        PARSER = new com.google.protobuf.AbstractParser<ReqShareSuperEvolutionFestival>() {
      public ReqShareSuperEvolutionFestival parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqShareSuperEvolutionFestival(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqShareSuperEvolutionFestival> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqShareSuperEvolutionFestival> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqShareSuperEvolutionFestivalOuterClass.ReqShareSuperEvolutionFestival getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqShareSuperEvolutionFestival_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqShareSuperEvolutionFestival_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$ReqShareSuperEvolutionFestival.proto\022\013" +
      "msggamedata\"8\n\036ReqShareSuperEvolutionFes" +
      "tival\022\026\n\016select_monster\030\001 \001(\007B\023\n\021com.fel" +
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
    internal_static_msggamedata_ReqShareSuperEvolutionFestival_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqShareSuperEvolutionFestival_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqShareSuperEvolutionFestival_descriptor,
        new java.lang.String[] { "SelectMonster", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
