// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgMonsterSkillAction.proto

package com.felania.msldb;

public final class MsgMonsterSkillActionOuterClass {
  private MsgMonsterSkillActionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgMonsterSkillActionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgMonsterSkillAction)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.MsgMonsterSkillAction.ActionType type = 1;</code>
     */
    int getTypeValue();
    /**
     * <code>.msggamedata.MsgMonsterSkillAction.ActionType type = 1;</code>
     */
    com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.ActionType getType();

    /**
     * <code>float weight = 2;</code>
     */
    float getWeight();
  }
  /**
   * Protobuf type {@code msggamedata.MsgMonsterSkillAction}
   */
  public  static final class MsgMonsterSkillAction extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgMonsterSkillAction)
      MsgMonsterSkillActionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgMonsterSkillAction.newBuilder() to construct.
    private MsgMonsterSkillAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgMonsterSkillAction() {
      type_ = 0;
      weight_ = 0F;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgMonsterSkillAction(
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

              type_ = rawValue;
              break;
            }
            case 21: {

              weight_ = input.readFloat();
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
      return com.felania.msldb.MsgMonsterSkillActionOuterClass.internal_static_msggamedata_MsgMonsterSkillAction_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgMonsterSkillActionOuterClass.internal_static_msggamedata_MsgMonsterSkillAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.class, com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.Builder.class);
    }

    /**
     * Protobuf enum {@code msggamedata.MsgMonsterSkillAction.ActionType}
     */
    public enum ActionType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>ActionTypeNULL = 0;</code>
       */
      ActionTypeNULL(0),
      /**
       * <code>Attack = 1;</code>
       */
      Attack(1),
      /**
       * <code>Heal = 2;</code>
       */
      Heal(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>ActionTypeNULL = 0;</code>
       */
      public static final int ActionTypeNULL_VALUE = 0;
      /**
       * <code>Attack = 1;</code>
       */
      public static final int Attack_VALUE = 1;
      /**
       * <code>Heal = 2;</code>
       */
      public static final int Heal_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ActionType valueOf(int value) {
        return forNumber(value);
      }

      public static ActionType forNumber(int value) {
        switch (value) {
          case 0: return ActionTypeNULL;
          case 1: return Attack;
          case 2: return Heal;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ActionType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ActionType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ActionType>() {
              public ActionType findValueByNumber(int number) {
                return ActionType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.getDescriptor().getEnumTypes().get(0);
      }

      private static final ActionType[] VALUES = values();

      public static ActionType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private ActionType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:msggamedata.MsgMonsterSkillAction.ActionType)
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>.msggamedata.MsgMonsterSkillAction.ActionType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.msggamedata.MsgMonsterSkillAction.ActionType type = 1;</code>
     */
    public com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.ActionType getType() {
      com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.ActionType result = com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.ActionType.valueOf(type_);
      return result == null ? com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.ActionType.UNRECOGNIZED : result;
    }

    public static final int WEIGHT_FIELD_NUMBER = 2;
    private float weight_;
    /**
     * <code>float weight = 2;</code>
     */
    public float getWeight() {
      return weight_;
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
      if (type_ != com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.ActionType.ActionTypeNULL.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (weight_ != 0F) {
        output.writeFloat(2, weight_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.ActionType.ActionTypeNULL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (weight_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, weight_);
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
      if (!(obj instanceof com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction other = (com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction) obj;

      boolean result = true;
      result = result && type_ == other.type_;
      result = result && (
          java.lang.Float.floatToIntBits(getWeight())
          == java.lang.Float.floatToIntBits(
              other.getWeight()));
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getWeight());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction prototype) {
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
     * Protobuf type {@code msggamedata.MsgMonsterSkillAction}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgMonsterSkillAction)
        com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillActionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgMonsterSkillActionOuterClass.internal_static_msggamedata_MsgMonsterSkillAction_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgMonsterSkillActionOuterClass.internal_static_msggamedata_MsgMonsterSkillAction_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.class, com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.Builder.class);
      }

      // Construct using com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.newBuilder()
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
        type_ = 0;

        weight_ = 0F;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgMonsterSkillActionOuterClass.internal_static_msggamedata_MsgMonsterSkillAction_descriptor;
      }

      public com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction getDefaultInstanceForType() {
        return com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.getDefaultInstance();
      }

      public com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction build() {
        com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction buildPartial() {
        com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction result = new com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction(this);
        result.type_ = type_;
        result.weight_ = weight_;
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
        if (other instanceof com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction) {
          return mergeFrom((com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction other) {
        if (other == com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.getWeight() != 0F) {
          setWeight(other.getWeight());
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
        com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.msggamedata.MsgMonsterSkillAction.ActionType type = 1;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.msggamedata.MsgMonsterSkillAction.ActionType type = 1;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgMonsterSkillAction.ActionType type = 1;</code>
       */
      public com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.ActionType getType() {
        com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.ActionType result = com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.ActionType.valueOf(type_);
        return result == null ? com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.ActionType.UNRECOGNIZED : result;
      }
      /**
       * <code>.msggamedata.MsgMonsterSkillAction.ActionType type = 1;</code>
       */
      public Builder setType(com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction.ActionType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.msggamedata.MsgMonsterSkillAction.ActionType type = 1;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private float weight_ ;
      /**
       * <code>float weight = 2;</code>
       */
      public float getWeight() {
        return weight_;
      }
      /**
       * <code>float weight = 2;</code>
       */
      public Builder setWeight(float value) {
        
        weight_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float weight = 2;</code>
       */
      public Builder clearWeight() {
        
        weight_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgMonsterSkillAction)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgMonsterSkillAction)
    private static final com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction();
    }

    public static com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgMonsterSkillAction>
        PARSER = new com.google.protobuf.AbstractParser<MsgMonsterSkillAction>() {
      public MsgMonsterSkillAction parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgMonsterSkillAction(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgMonsterSkillAction> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgMonsterSkillAction> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgMonsterSkillActionOuterClass.MsgMonsterSkillAction getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgMonsterSkillAction_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgMonsterSkillAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033MsgMonsterSkillAction.proto\022\013msggameda" +
      "ta\"\234\001\n\025MsgMonsterSkillAction\022;\n\004type\030\001 \001" +
      "(\0162-.msggamedata.MsgMonsterSkillAction.A" +
      "ctionType\022\016\n\006weight\030\002 \001(\002\"6\n\nActionType\022" +
      "\022\n\016ActionTypeNULL\020\000\022\n\n\006Attack\020\001\022\010\n\004Heal\020" +
      "\002B\023\n\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_MsgMonsterSkillAction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgMonsterSkillAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgMonsterSkillAction_descriptor,
        new java.lang.String[] { "Type", "Weight", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
