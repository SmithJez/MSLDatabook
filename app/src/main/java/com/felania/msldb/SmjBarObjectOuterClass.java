// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SmjBarObject.proto

package com.felania.msldb;

public final class SmjBarObjectOuterClass {
  private SmjBarObjectOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SmjBarObjectOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SmjBarObject)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float hp = 1;</code>
     */
    float getHp();

    /**
     * <code>float atk = 2;</code>
     */
    float getAtk();

    /**
     * <code>float def = 3;</code>
     */
    float getDef();

    /**
     * <code>float heal = 4;</code>
     */
    float getHeal();

    /**
     * <code>float crit_dmg = 5;</code>
     */
    float getCritDmg();

    /**
     * <code>float crit_rate = 6;</code>
     */
    float getCritRate();

    /**
     * <code>float resist = 7;</code>
     */
    float getResist();
  }
  /**
   * Protobuf type {@code SmjBarObject}
   */
  public  static final class SmjBarObject extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SmjBarObject)
      SmjBarObjectOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SmjBarObject.newBuilder() to construct.
    private SmjBarObject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SmjBarObject() {
      hp_ = 0F;
      atk_ = 0F;
      def_ = 0F;
      heal_ = 0F;
      critDmg_ = 0F;
      critRate_ = 0F;
      resist_ = 0F;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SmjBarObject(
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
            case 13: {

              hp_ = input.readFloat();
              break;
            }
            case 21: {

              atk_ = input.readFloat();
              break;
            }
            case 29: {

              def_ = input.readFloat();
              break;
            }
            case 37: {

              heal_ = input.readFloat();
              break;
            }
            case 45: {

              critDmg_ = input.readFloat();
              break;
            }
            case 53: {

              critRate_ = input.readFloat();
              break;
            }
            case 61: {

              resist_ = input.readFloat();
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
      return com.felania.msldb.SmjBarObjectOuterClass.internal_static_SmjBarObject_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.SmjBarObjectOuterClass.internal_static_SmjBarObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject.class, com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject.Builder.class);
    }

    public static final int HP_FIELD_NUMBER = 1;
    private float hp_;
    /**
     * <code>float hp = 1;</code>
     */
    public float getHp() {
      return hp_;
    }

    public static final int ATK_FIELD_NUMBER = 2;
    private float atk_;
    /**
     * <code>float atk = 2;</code>
     */
    public float getAtk() {
      return atk_;
    }

    public static final int DEF_FIELD_NUMBER = 3;
    private float def_;
    /**
     * <code>float def = 3;</code>
     */
    public float getDef() {
      return def_;
    }

    public static final int HEAL_FIELD_NUMBER = 4;
    private float heal_;
    /**
     * <code>float heal = 4;</code>
     */
    public float getHeal() {
      return heal_;
    }

    public static final int CRIT_DMG_FIELD_NUMBER = 5;
    private float critDmg_;
    /**
     * <code>float crit_dmg = 5;</code>
     */
    public float getCritDmg() {
      return critDmg_;
    }

    public static final int CRIT_RATE_FIELD_NUMBER = 6;
    private float critRate_;
    /**
     * <code>float crit_rate = 6;</code>
     */
    public float getCritRate() {
      return critRate_;
    }

    public static final int RESIST_FIELD_NUMBER = 7;
    private float resist_;
    /**
     * <code>float resist = 7;</code>
     */
    public float getResist() {
      return resist_;
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
      if (hp_ != 0F) {
        output.writeFloat(1, hp_);
      }
      if (atk_ != 0F) {
        output.writeFloat(2, atk_);
      }
      if (def_ != 0F) {
        output.writeFloat(3, def_);
      }
      if (heal_ != 0F) {
        output.writeFloat(4, heal_);
      }
      if (critDmg_ != 0F) {
        output.writeFloat(5, critDmg_);
      }
      if (critRate_ != 0F) {
        output.writeFloat(6, critRate_);
      }
      if (resist_ != 0F) {
        output.writeFloat(7, resist_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hp_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, hp_);
      }
      if (atk_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, atk_);
      }
      if (def_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, def_);
      }
      if (heal_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, heal_);
      }
      if (critDmg_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, critDmg_);
      }
      if (critRate_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(6, critRate_);
      }
      if (resist_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(7, resist_);
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
      if (!(obj instanceof com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject)) {
        return super.equals(obj);
      }
      com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject other = (com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject) obj;

      boolean result = true;
      result = result && (
          java.lang.Float.floatToIntBits(getHp())
          == java.lang.Float.floatToIntBits(
              other.getHp()));
      result = result && (
          java.lang.Float.floatToIntBits(getAtk())
          == java.lang.Float.floatToIntBits(
              other.getAtk()));
      result = result && (
          java.lang.Float.floatToIntBits(getDef())
          == java.lang.Float.floatToIntBits(
              other.getDef()));
      result = result && (
          java.lang.Float.floatToIntBits(getHeal())
          == java.lang.Float.floatToIntBits(
              other.getHeal()));
      result = result && (
          java.lang.Float.floatToIntBits(getCritDmg())
          == java.lang.Float.floatToIntBits(
              other.getCritDmg()));
      result = result && (
          java.lang.Float.floatToIntBits(getCritRate())
          == java.lang.Float.floatToIntBits(
              other.getCritRate()));
      result = result && (
          java.lang.Float.floatToIntBits(getResist())
          == java.lang.Float.floatToIntBits(
              other.getResist()));
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
      hash = (37 * hash) + HP_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getHp());
      hash = (37 * hash) + ATK_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getAtk());
      hash = (37 * hash) + DEF_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getDef());
      hash = (37 * hash) + HEAL_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getHeal());
      hash = (37 * hash) + CRIT_DMG_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCritDmg());
      hash = (37 * hash) + CRIT_RATE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCritRate());
      hash = (37 * hash) + RESIST_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getResist());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject prototype) {
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
     * Protobuf type {@code SmjBarObject}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SmjBarObject)
        com.felania.msldb.SmjBarObjectOuterClass.SmjBarObjectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.SmjBarObjectOuterClass.internal_static_SmjBarObject_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.SmjBarObjectOuterClass.internal_static_SmjBarObject_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject.class, com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject.Builder.class);
      }

      // Construct using com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject.newBuilder()
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
        hp_ = 0F;

        atk_ = 0F;

        def_ = 0F;

        heal_ = 0F;

        critDmg_ = 0F;

        critRate_ = 0F;

        resist_ = 0F;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.SmjBarObjectOuterClass.internal_static_SmjBarObject_descriptor;
      }

      public com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject getDefaultInstanceForType() {
        return com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject.getDefaultInstance();
      }

      public com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject build() {
        com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject buildPartial() {
        com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject result = new com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject(this);
        result.hp_ = hp_;
        result.atk_ = atk_;
        result.def_ = def_;
        result.heal_ = heal_;
        result.critDmg_ = critDmg_;
        result.critRate_ = critRate_;
        result.resist_ = resist_;
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
        if (other instanceof com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject) {
          return mergeFrom((com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject other) {
        if (other == com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject.getDefaultInstance()) return this;
        if (other.getHp() != 0F) {
          setHp(other.getHp());
        }
        if (other.getAtk() != 0F) {
          setAtk(other.getAtk());
        }
        if (other.getDef() != 0F) {
          setDef(other.getDef());
        }
        if (other.getHeal() != 0F) {
          setHeal(other.getHeal());
        }
        if (other.getCritDmg() != 0F) {
          setCritDmg(other.getCritDmg());
        }
        if (other.getCritRate() != 0F) {
          setCritRate(other.getCritRate());
        }
        if (other.getResist() != 0F) {
          setResist(other.getResist());
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
        com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float hp_ ;
      /**
       * <code>float hp = 1;</code>
       */
      public float getHp() {
        return hp_;
      }
      /**
       * <code>float hp = 1;</code>
       */
      public Builder setHp(float value) {
        
        hp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float hp = 1;</code>
       */
      public Builder clearHp() {
        
        hp_ = 0F;
        onChanged();
        return this;
      }

      private float atk_ ;
      /**
       * <code>float atk = 2;</code>
       */
      public float getAtk() {
        return atk_;
      }
      /**
       * <code>float atk = 2;</code>
       */
      public Builder setAtk(float value) {
        
        atk_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float atk = 2;</code>
       */
      public Builder clearAtk() {
        
        atk_ = 0F;
        onChanged();
        return this;
      }

      private float def_ ;
      /**
       * <code>float def = 3;</code>
       */
      public float getDef() {
        return def_;
      }
      /**
       * <code>float def = 3;</code>
       */
      public Builder setDef(float value) {
        
        def_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float def = 3;</code>
       */
      public Builder clearDef() {
        
        def_ = 0F;
        onChanged();
        return this;
      }

      private float heal_ ;
      /**
       * <code>float heal = 4;</code>
       */
      public float getHeal() {
        return heal_;
      }
      /**
       * <code>float heal = 4;</code>
       */
      public Builder setHeal(float value) {
        
        heal_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float heal = 4;</code>
       */
      public Builder clearHeal() {
        
        heal_ = 0F;
        onChanged();
        return this;
      }

      private float critDmg_ ;
      /**
       * <code>float crit_dmg = 5;</code>
       */
      public float getCritDmg() {
        return critDmg_;
      }
      /**
       * <code>float crit_dmg = 5;</code>
       */
      public Builder setCritDmg(float value) {
        
        critDmg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float crit_dmg = 5;</code>
       */
      public Builder clearCritDmg() {
        
        critDmg_ = 0F;
        onChanged();
        return this;
      }

      private float critRate_ ;
      /**
       * <code>float crit_rate = 6;</code>
       */
      public float getCritRate() {
        return critRate_;
      }
      /**
       * <code>float crit_rate = 6;</code>
       */
      public Builder setCritRate(float value) {
        
        critRate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float crit_rate = 6;</code>
       */
      public Builder clearCritRate() {
        
        critRate_ = 0F;
        onChanged();
        return this;
      }

      private float resist_ ;
      /**
       * <code>float resist = 7;</code>
       */
      public float getResist() {
        return resist_;
      }
      /**
       * <code>float resist = 7;</code>
       */
      public Builder setResist(float value) {
        
        resist_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float resist = 7;</code>
       */
      public Builder clearResist() {
        
        resist_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:SmjBarObject)
    }

    // @@protoc_insertion_point(class_scope:SmjBarObject)
    private static final com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject();
    }

    public static com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SmjBarObject>
        PARSER = new com.google.protobuf.AbstractParser<SmjBarObject>() {
      public SmjBarObject parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new SmjBarObject(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SmjBarObject> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SmjBarObject> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.SmjBarObjectOuterClass.SmjBarObject getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmjBarObject_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmjBarObject_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022SmjBarObject.proto\"w\n\014SmjBarObject\022\n\n\002" +
      "hp\030\001 \001(\002\022\013\n\003atk\030\002 \001(\002\022\013\n\003def\030\003 \001(\002\022\014\n\004he" +
      "al\030\004 \001(\002\022\020\n\010crit_dmg\030\005 \001(\002\022\021\n\tcrit_rate\030" +
      "\006 \001(\002\022\016\n\006resist\030\007 \001(\002B\023\n\021com.felania.msl" +
      "dbb\006proto3"
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
    internal_static_SmjBarObject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SmjBarObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmjBarObject_descriptor,
        new java.lang.String[] { "Hp", "Atk", "Def", "Heal", "CritDmg", "CritRate", "Resist", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
