// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgMonsterEvolution.proto

package com.felania.msldb;

public final class MsgMonsterEvolutionOuterClass {
  private MsgMonsterEvolutionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgMonsterEvolutionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgMonsterEvolution)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MonsterEvolution evolution = 1;</code>
     */
    int getEvolutionValue();
    /**
     * <code>.msggamedata.MonsterEvolution evolution = 1;</code>
     */
    com.felania.msldb.MonsterEvolutionOuterClass.MonsterEvolution getEvolution();

    /**
     * <code>.msggamedata.MonsterGrade grade = 2;</code>
     */
    int getGradeValue();
    /**
     * <code>.msggamedata.MonsterGrade grade = 2;</code>
     */
    com.felania.msldb.MonsterGradeOuterClass.MonsterGrade getGrade();

    /**
     * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
     */
    boolean hasWarmupPrice();
    /**
     * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
     */
    com.felania.msldb.MsgPriceOuterClass.MsgPrice getWarmupPrice();
    /**
     * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
     */
    com.felania.msldb.MsgPriceOuterClass.MsgPriceOrBuilder getWarmupPriceOrBuilder();

    /**
     * <code>.msggamedata.MsgPrice final_price = 4;</code>
     */
    boolean hasFinalPrice();
    /**
     * <code>.msggamedata.MsgPrice final_price = 4;</code>
     */
    com.felania.msldb.MsgPriceOuterClass.MsgPrice getFinalPrice();
    /**
     * <code>.msggamedata.MsgPrice final_price = 4;</code>
     */
    com.felania.msldb.MsgPriceOuterClass.MsgPriceOrBuilder getFinalPriceOrBuilder();
  }
  /**
   * Protobuf type {@code msggamedata.MsgMonsterEvolution}
   */
  public  static final class MsgMonsterEvolution extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgMonsterEvolution)
      MsgMonsterEvolutionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgMonsterEvolution.newBuilder() to construct.
    private MsgMonsterEvolution(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgMonsterEvolution() {
      evolution_ = 0;
      grade_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgMonsterEvolution(
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

              evolution_ = rawValue;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              grade_ = rawValue;
              break;
            }
            case 26: {
              com.felania.msldb.MsgPriceOuterClass.MsgPrice.Builder subBuilder = null;
              if (warmupPrice_ != null) {
                subBuilder = warmupPrice_.toBuilder();
              }
              warmupPrice_ = input.readMessage(com.felania.msldb.MsgPriceOuterClass.MsgPrice.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(warmupPrice_);
                warmupPrice_ = subBuilder.buildPartial();
              }

              break;
            }
            case 34: {
              com.felania.msldb.MsgPriceOuterClass.MsgPrice.Builder subBuilder = null;
              if (finalPrice_ != null) {
                subBuilder = finalPrice_.toBuilder();
              }
              finalPrice_ = input.readMessage(com.felania.msldb.MsgPriceOuterClass.MsgPrice.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(finalPrice_);
                finalPrice_ = subBuilder.buildPartial();
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
      return com.felania.msldb.MsgMonsterEvolutionOuterClass.internal_static_msggamedata_MsgMonsterEvolution_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgMonsterEvolutionOuterClass.internal_static_msggamedata_MsgMonsterEvolution_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution.class, com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution.Builder.class);
    }

    public static final int EVOLUTION_FIELD_NUMBER = 1;
    private int evolution_;
    /**
     * <code>.msggamedata.MonsterEvolution evolution = 1;</code>
     */
    public int getEvolutionValue() {
      return evolution_;
    }
    /**
     * <code>.msggamedata.MonsterEvolution evolution = 1;</code>
     */
    public com.felania.msldb.MonsterEvolutionOuterClass.MonsterEvolution getEvolution() {
      com.felania.msldb.MonsterEvolutionOuterClass.MonsterEvolution result = com.felania.msldb.MonsterEvolutionOuterClass.MonsterEvolution.valueOf(evolution_);
      return result == null ? com.felania.msldb.MonsterEvolutionOuterClass.MonsterEvolution.UNRECOGNIZED : result;
    }

    public static final int GRADE_FIELD_NUMBER = 2;
    private int grade_;
    /**
     * <code>.msggamedata.MonsterGrade grade = 2;</code>
     */
    public int getGradeValue() {
      return grade_;
    }
    /**
     * <code>.msggamedata.MonsterGrade grade = 2;</code>
     */
    public com.felania.msldb.MonsterGradeOuterClass.MonsterGrade getGrade() {
      com.felania.msldb.MonsterGradeOuterClass.MonsterGrade result = com.felania.msldb.MonsterGradeOuterClass.MonsterGrade.valueOf(grade_);
      return result == null ? com.felania.msldb.MonsterGradeOuterClass.MonsterGrade.UNRECOGNIZED : result;
    }

    public static final int WARMUP_PRICE_FIELD_NUMBER = 3;
    private com.felania.msldb.MsgPriceOuterClass.MsgPrice warmupPrice_;
    /**
     * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
     */
    public boolean hasWarmupPrice() {
      return warmupPrice_ != null;
    }
    /**
     * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
     */
    public com.felania.msldb.MsgPriceOuterClass.MsgPrice getWarmupPrice() {
      return warmupPrice_ == null ? com.felania.msldb.MsgPriceOuterClass.MsgPrice.getDefaultInstance() : warmupPrice_;
    }
    /**
     * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
     */
    public com.felania.msldb.MsgPriceOuterClass.MsgPriceOrBuilder getWarmupPriceOrBuilder() {
      return getWarmupPrice();
    }

    public static final int FINAL_PRICE_FIELD_NUMBER = 4;
    private com.felania.msldb.MsgPriceOuterClass.MsgPrice finalPrice_;
    /**
     * <code>.msggamedata.MsgPrice final_price = 4;</code>
     */
    public boolean hasFinalPrice() {
      return finalPrice_ != null;
    }
    /**
     * <code>.msggamedata.MsgPrice final_price = 4;</code>
     */
    public com.felania.msldb.MsgPriceOuterClass.MsgPrice getFinalPrice() {
      return finalPrice_ == null ? com.felania.msldb.MsgPriceOuterClass.MsgPrice.getDefaultInstance() : finalPrice_;
    }
    /**
     * <code>.msggamedata.MsgPrice final_price = 4;</code>
     */
    public com.felania.msldb.MsgPriceOuterClass.MsgPriceOrBuilder getFinalPriceOrBuilder() {
      return getFinalPrice();
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
      if (evolution_ != com.felania.msldb.MonsterEvolutionOuterClass.MonsterEvolution.MonsterEvolutionNULL.getNumber()) {
        output.writeEnum(1, evolution_);
      }
      if (grade_ != com.felania.msldb.MonsterGradeOuterClass.MonsterGrade.MonsterGradeNULL.getNumber()) {
        output.writeEnum(2, grade_);
      }
      if (warmupPrice_ != null) {
        output.writeMessage(3, getWarmupPrice());
      }
      if (finalPrice_ != null) {
        output.writeMessage(4, getFinalPrice());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (evolution_ != com.felania.msldb.MonsterEvolutionOuterClass.MonsterEvolution.MonsterEvolutionNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, evolution_);
      }
      if (grade_ != com.felania.msldb.MonsterGradeOuterClass.MonsterGrade.MonsterGradeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, grade_);
      }
      if (warmupPrice_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getWarmupPrice());
      }
      if (finalPrice_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getFinalPrice());
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
      if (!(obj instanceof com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution other = (com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution) obj;

      boolean result = true;
      result = result && evolution_ == other.evolution_;
      result = result && grade_ == other.grade_;
      result = result && (hasWarmupPrice() == other.hasWarmupPrice());
      if (hasWarmupPrice()) {
        result = result && getWarmupPrice()
            .equals(other.getWarmupPrice());
      }
      result = result && (hasFinalPrice() == other.hasFinalPrice());
      if (hasFinalPrice()) {
        result = result && getFinalPrice()
            .equals(other.getFinalPrice());
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
      hash = (37 * hash) + EVOLUTION_FIELD_NUMBER;
      hash = (53 * hash) + evolution_;
      hash = (37 * hash) + GRADE_FIELD_NUMBER;
      hash = (53 * hash) + grade_;
      if (hasWarmupPrice()) {
        hash = (37 * hash) + WARMUP_PRICE_FIELD_NUMBER;
        hash = (53 * hash) + getWarmupPrice().hashCode();
      }
      if (hasFinalPrice()) {
        hash = (37 * hash) + FINAL_PRICE_FIELD_NUMBER;
        hash = (53 * hash) + getFinalPrice().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution prototype) {
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
     * Protobuf type {@code msggamedata.MsgMonsterEvolution}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgMonsterEvolution)
        com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolutionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgMonsterEvolutionOuterClass.internal_static_msggamedata_MsgMonsterEvolution_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgMonsterEvolutionOuterClass.internal_static_msggamedata_MsgMonsterEvolution_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution.class, com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution.Builder.class);
      }

      // Construct using com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution.newBuilder()
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
        evolution_ = 0;

        grade_ = 0;

        if (warmupPriceBuilder_ == null) {
          warmupPrice_ = null;
        } else {
          warmupPrice_ = null;
          warmupPriceBuilder_ = null;
        }
        if (finalPriceBuilder_ == null) {
          finalPrice_ = null;
        } else {
          finalPrice_ = null;
          finalPriceBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgMonsterEvolutionOuterClass.internal_static_msggamedata_MsgMonsterEvolution_descriptor;
      }

      public com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution getDefaultInstanceForType() {
        return com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution.getDefaultInstance();
      }

      public com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution build() {
        com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution buildPartial() {
        com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution result = new com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution(this);
        result.evolution_ = evolution_;
        result.grade_ = grade_;
        if (warmupPriceBuilder_ == null) {
          result.warmupPrice_ = warmupPrice_;
        } else {
          result.warmupPrice_ = warmupPriceBuilder_.build();
        }
        if (finalPriceBuilder_ == null) {
          result.finalPrice_ = finalPrice_;
        } else {
          result.finalPrice_ = finalPriceBuilder_.build();
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
        if (other instanceof com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution) {
          return mergeFrom((com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution other) {
        if (other == com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution.getDefaultInstance()) return this;
        if (other.evolution_ != 0) {
          setEvolutionValue(other.getEvolutionValue());
        }
        if (other.grade_ != 0) {
          setGradeValue(other.getGradeValue());
        }
        if (other.hasWarmupPrice()) {
          mergeWarmupPrice(other.getWarmupPrice());
        }
        if (other.hasFinalPrice()) {
          mergeFinalPrice(other.getFinalPrice());
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
        com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int evolution_ = 0;
      /**
       * <code>.msggamedata.MonsterEvolution evolution = 1;</code>
       */
      public int getEvolutionValue() {
        return evolution_;
      }
      /**
       * <code>.msggamedata.MonsterEvolution evolution = 1;</code>
       */
      public Builder setEvolutionValue(int value) {
        evolution_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterEvolution evolution = 1;</code>
       */
      public com.felania.msldb.MonsterEvolutionOuterClass.MonsterEvolution getEvolution() {
        com.felania.msldb.MonsterEvolutionOuterClass.MonsterEvolution result = com.felania.msldb.MonsterEvolutionOuterClass.MonsterEvolution.valueOf(evolution_);
        return result == null ? com.felania.msldb.MonsterEvolutionOuterClass.MonsterEvolution.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MonsterEvolution evolution = 1;</code>
       */
      public Builder setEvolution(com.felania.msldb.MonsterEvolutionOuterClass.MonsterEvolution value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        evolution_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterEvolution evolution = 1;</code>
       */
      public Builder clearEvolution() {
        
        evolution_ = 0;
        onChanged();
        return this;
      }

      private int grade_ = 0;
      /**
       * <code>.msggamedata.MonsterGrade grade = 2;</code>
       */
      public int getGradeValue() {
        return grade_;
      }
      /**
       * <code>.msggamedata.MonsterGrade grade = 2;</code>
       */
      public Builder setGradeValue(int value) {
        grade_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterGrade grade = 2;</code>
       */
      public com.felania.msldb.MonsterGradeOuterClass.MonsterGrade getGrade() {
        com.felania.msldb.MonsterGradeOuterClass.MonsterGrade result = com.felania.msldb.MonsterGradeOuterClass.MonsterGrade.valueOf(grade_);
        return result == null ? com.felania.msldb.MonsterGradeOuterClass.MonsterGrade.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MonsterGrade grade = 2;</code>
       */
      public Builder setGrade(com.felania.msldb.MonsterGradeOuterClass.MonsterGrade value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        grade_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MonsterGrade grade = 2;</code>
       */
      public Builder clearGrade() {
        
        grade_ = 0;
        onChanged();
        return this;
      }

      private com.felania.msldb.MsgPriceOuterClass.MsgPrice warmupPrice_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgPriceOuterClass.MsgPrice, com.felania.msldb.MsgPriceOuterClass.MsgPrice.Builder, com.felania.msldb.MsgPriceOuterClass.MsgPriceOrBuilder> warmupPriceBuilder_;
      /**
       * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
       */
      public boolean hasWarmupPrice() {
        return warmupPriceBuilder_ != null || warmupPrice_ != null;
      }
      /**
       * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
       */
      public com.felania.msldb.MsgPriceOuterClass.MsgPrice getWarmupPrice() {
        if (warmupPriceBuilder_ == null) {
          return warmupPrice_ == null ? com.felania.msldb.MsgPriceOuterClass.MsgPrice.getDefaultInstance() : warmupPrice_;
        } else {
          return warmupPriceBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
       */
      public Builder setWarmupPrice(com.felania.msldb.MsgPriceOuterClass.MsgPrice value) {
        if (warmupPriceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          warmupPrice_ = value;
          onChanged();
        } else {
          warmupPriceBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
       */
      public Builder setWarmupPrice(
          com.felania.msldb.MsgPriceOuterClass.MsgPrice.Builder builderForValue) {
        if (warmupPriceBuilder_ == null) {
          warmupPrice_ = builderForValue.build();
          onChanged();
        } else {
          warmupPriceBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
       */
      public Builder mergeWarmupPrice(com.felania.msldb.MsgPriceOuterClass.MsgPrice value) {
        if (warmupPriceBuilder_ == null) {
          if (warmupPrice_ != null) {
            warmupPrice_ =
              com.felania.msldb.MsgPriceOuterClass.MsgPrice.newBuilder(warmupPrice_).mergeFrom(value).buildPartial();
          } else {
            warmupPrice_ = value;
          }
          onChanged();
        } else {
          warmupPriceBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
       */
      public Builder clearWarmupPrice() {
        if (warmupPriceBuilder_ == null) {
          warmupPrice_ = null;
          onChanged();
        } else {
          warmupPrice_ = null;
          warmupPriceBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
       */
      public com.felania.msldb.MsgPriceOuterClass.MsgPrice.Builder getWarmupPriceBuilder() {
        
        onChanged();
        return getWarmupPriceFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
       */
      public com.felania.msldb.MsgPriceOuterClass.MsgPriceOrBuilder getWarmupPriceOrBuilder() {
        if (warmupPriceBuilder_ != null) {
          return warmupPriceBuilder_.getMessageOrBuilder();
        } else {
          return warmupPrice_ == null ?
              com.felania.msldb.MsgPriceOuterClass.MsgPrice.getDefaultInstance() : warmupPrice_;
        }
      }
      /**
       * <code>.msggamedata.MsgPrice warmup_price = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgPriceOuterClass.MsgPrice, com.felania.msldb.MsgPriceOuterClass.MsgPrice.Builder, com.felania.msldb.MsgPriceOuterClass.MsgPriceOrBuilder> 
          getWarmupPriceFieldBuilder() {
        if (warmupPriceBuilder_ == null) {
          warmupPriceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgPriceOuterClass.MsgPrice, com.felania.msldb.MsgPriceOuterClass.MsgPrice.Builder, com.felania.msldb.MsgPriceOuterClass.MsgPriceOrBuilder>(
                  getWarmupPrice(),
                  getParentForChildren(),
                  isClean());
          warmupPrice_ = null;
        }
        return warmupPriceBuilder_;
      }

      private com.felania.msldb.MsgPriceOuterClass.MsgPrice finalPrice_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgPriceOuterClass.MsgPrice, com.felania.msldb.MsgPriceOuterClass.MsgPrice.Builder, com.felania.msldb.MsgPriceOuterClass.MsgPriceOrBuilder> finalPriceBuilder_;
      /**
       * <code>.msggamedata.MsgPrice final_price = 4;</code>
       */
      public boolean hasFinalPrice() {
        return finalPriceBuilder_ != null || finalPrice_ != null;
      }
      /**
       * <code>.msggamedata.MsgPrice final_price = 4;</code>
       */
      public com.felania.msldb.MsgPriceOuterClass.MsgPrice getFinalPrice() {
        if (finalPriceBuilder_ == null) {
          return finalPrice_ == null ? com.felania.msldb.MsgPriceOuterClass.MsgPrice.getDefaultInstance() : finalPrice_;
        } else {
          return finalPriceBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.MsgPrice final_price = 4;</code>
       */
      public Builder setFinalPrice(com.felania.msldb.MsgPriceOuterClass.MsgPrice value) {
        if (finalPriceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          finalPrice_ = value;
          onChanged();
        } else {
          finalPriceBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgPrice final_price = 4;</code>
       */
      public Builder setFinalPrice(
          com.felania.msldb.MsgPriceOuterClass.MsgPrice.Builder builderForValue) {
        if (finalPriceBuilder_ == null) {
          finalPrice_ = builderForValue.build();
          onChanged();
        } else {
          finalPriceBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgPrice final_price = 4;</code>
       */
      public Builder mergeFinalPrice(com.felania.msldb.MsgPriceOuterClass.MsgPrice value) {
        if (finalPriceBuilder_ == null) {
          if (finalPrice_ != null) {
            finalPrice_ =
              com.felania.msldb.MsgPriceOuterClass.MsgPrice.newBuilder(finalPrice_).mergeFrom(value).buildPartial();
          } else {
            finalPrice_ = value;
          }
          onChanged();
        } else {
          finalPriceBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgPrice final_price = 4;</code>
       */
      public Builder clearFinalPrice() {
        if (finalPriceBuilder_ == null) {
          finalPrice_ = null;
          onChanged();
        } else {
          finalPrice_ = null;
          finalPriceBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.MsgPrice final_price = 4;</code>
       */
      public com.felania.msldb.MsgPriceOuterClass.MsgPrice.Builder getFinalPriceBuilder() {
        
        onChanged();
        return getFinalPriceFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.MsgPrice final_price = 4;</code>
       */
      public com.felania.msldb.MsgPriceOuterClass.MsgPriceOrBuilder getFinalPriceOrBuilder() {
        if (finalPriceBuilder_ != null) {
          return finalPriceBuilder_.getMessageOrBuilder();
        } else {
          return finalPrice_ == null ?
              com.felania.msldb.MsgPriceOuterClass.MsgPrice.getDefaultInstance() : finalPrice_;
        }
      }
      /**
       * <code>.msggamedata.MsgPrice final_price = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.MsgPriceOuterClass.MsgPrice, com.felania.msldb.MsgPriceOuterClass.MsgPrice.Builder, com.felania.msldb.MsgPriceOuterClass.MsgPriceOrBuilder> 
          getFinalPriceFieldBuilder() {
        if (finalPriceBuilder_ == null) {
          finalPriceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.MsgPriceOuterClass.MsgPrice, com.felania.msldb.MsgPriceOuterClass.MsgPrice.Builder, com.felania.msldb.MsgPriceOuterClass.MsgPriceOrBuilder>(
                  getFinalPrice(),
                  getParentForChildren(),
                  isClean());
          finalPrice_ = null;
        }
        return finalPriceBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgMonsterEvolution)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgMonsterEvolution)
    private static final com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution();
    }

    public static com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgMonsterEvolution>
        PARSER = new com.google.protobuf.AbstractParser<MsgMonsterEvolution>() {
      public MsgMonsterEvolution parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgMonsterEvolution(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgMonsterEvolution> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgMonsterEvolution> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgMonsterEvolutionOuterClass.MsgMonsterEvolution getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgMonsterEvolution_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgMonsterEvolution_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031MsgMonsterEvolution.proto\022\013msggamedata" +
      "\032\026MonsterEvolution.proto\032\022MonsterGrade.p" +
      "roto\032\016MsgPrice.proto\"\312\001\n\023MsgMonsterEvolu" +
      "tion\0220\n\tevolution\030\001 \001(\0162\035.msggamedata.Mo" +
      "nsterEvolution\022(\n\005grade\030\002 \001(\0162\031.msggamed" +
      "ata.MonsterGrade\022+\n\014warmup_price\030\003 \001(\0132\025" +
      ".msggamedata.MsgPrice\022*\n\013final_price\030\004 \001" +
      "(\0132\025.msggamedata.MsgPriceB\023\n\021com.felania" +
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
          com.felania.msldb.MonsterEvolutionOuterClass.getDescriptor(),
          com.felania.msldb.MonsterGradeOuterClass.getDescriptor(),
          com.felania.msldb.MsgPriceOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_MsgMonsterEvolution_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgMonsterEvolution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgMonsterEvolution_descriptor,
        new java.lang.String[] { "Evolution", "Grade", "WarmupPrice", "FinalPrice", });
    com.felania.msldb.MonsterEvolutionOuterClass.getDescriptor();
    com.felania.msldb.MonsterGradeOuterClass.getDescriptor();
    com.felania.msldb.MsgPriceOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
