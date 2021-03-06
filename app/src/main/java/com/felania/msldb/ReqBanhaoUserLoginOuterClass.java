// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqBanhaoUserLogin.proto

package com.felania.msldb;

public final class ReqBanhaoUserLoginOuterClass {
  private ReqBanhaoUserLoginOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqBanhaoUserLoginOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.ReqBanhaoUserLogin)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
     */
    boolean hasReqUserLogin();
    /**
     * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
     */
    com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin getReqUserLogin();
    /**
     * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
     */
    com.felania.msldb.ReqUserLoginOuterClass.ReqUserLoginOrBuilder getReqUserLoginOrBuilder();

    /**
     * <code>string password = 2;</code>
     */
    java.lang.String getPassword();
    /**
     * <code>string password = 2;</code>
     */
    com.google.protobuf.ByteString
        getPasswordBytes();
  }
  /**
   * Protobuf type {@code msggamedata.ReqBanhaoUserLogin}
   */
  public  static final class ReqBanhaoUserLogin extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.ReqBanhaoUserLogin)
      ReqBanhaoUserLoginOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqBanhaoUserLogin.newBuilder() to construct.
    private ReqBanhaoUserLogin(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqBanhaoUserLogin() {
      password_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqBanhaoUserLogin(
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
            case 10: {
              com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin.Builder subBuilder = null;
              if (reqUserLogin_ != null) {
                subBuilder = reqUserLogin_.toBuilder();
              }
              reqUserLogin_ = input.readMessage(com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(reqUserLogin_);
                reqUserLogin_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              password_ = s;
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
      return com.felania.msldb.ReqBanhaoUserLoginOuterClass.internal_static_msggamedata_ReqBanhaoUserLogin_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.ReqBanhaoUserLoginOuterClass.internal_static_msggamedata_ReqBanhaoUserLogin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin.class, com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin.Builder.class);
    }

    public static final int REQUSERLOGIN_FIELD_NUMBER = 1;
    private com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin reqUserLogin_;
    /**
     * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
     */
    public boolean hasReqUserLogin() {
      return reqUserLogin_ != null;
    }
    /**
     * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
     */
    public com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin getReqUserLogin() {
      return reqUserLogin_ == null ? com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin.getDefaultInstance() : reqUserLogin_;
    }
    /**
     * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
     */
    public com.felania.msldb.ReqUserLoginOuterClass.ReqUserLoginOrBuilder getReqUserLoginOrBuilder() {
      return getReqUserLogin();
    }

    public static final int PASSWORD_FIELD_NUMBER = 2;
    private volatile java.lang.Object password_;
    /**
     * <code>string password = 2;</code>
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      }
    }
    /**
     * <code>string password = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (reqUserLogin_ != null) {
        output.writeMessage(1, getReqUserLogin());
      }
      if (!getPasswordBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, password_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reqUserLogin_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getReqUserLogin());
      }
      if (!getPasswordBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, password_);
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
      if (!(obj instanceof com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin)) {
        return super.equals(obj);
      }
      com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin other = (com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin) obj;

      boolean result = true;
      result = result && (hasReqUserLogin() == other.hasReqUserLogin());
      if (hasReqUserLogin()) {
        result = result && getReqUserLogin()
            .equals(other.getReqUserLogin());
      }
      result = result && getPassword()
          .equals(other.getPassword());
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
      if (hasReqUserLogin()) {
        hash = (37 * hash) + REQUSERLOGIN_FIELD_NUMBER;
        hash = (53 * hash) + getReqUserLogin().hashCode();
      }
      hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
      hash = (53 * hash) + getPassword().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin prototype) {
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
     * Protobuf type {@code msggamedata.ReqBanhaoUserLogin}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.ReqBanhaoUserLogin)
        com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLoginOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.ReqBanhaoUserLoginOuterClass.internal_static_msggamedata_ReqBanhaoUserLogin_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.ReqBanhaoUserLoginOuterClass.internal_static_msggamedata_ReqBanhaoUserLogin_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin.class, com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin.Builder.class);
      }

      // Construct using com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin.newBuilder()
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
        if (reqUserLoginBuilder_ == null) {
          reqUserLogin_ = null;
        } else {
          reqUserLogin_ = null;
          reqUserLoginBuilder_ = null;
        }
        password_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.ReqBanhaoUserLoginOuterClass.internal_static_msggamedata_ReqBanhaoUserLogin_descriptor;
      }

      public com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin getDefaultInstanceForType() {
        return com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin.getDefaultInstance();
      }

      public com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin build() {
        com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin buildPartial() {
        com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin result = new com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin(this);
        if (reqUserLoginBuilder_ == null) {
          result.reqUserLogin_ = reqUserLogin_;
        } else {
          result.reqUserLogin_ = reqUserLoginBuilder_.build();
        }
        result.password_ = password_;
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
        if (other instanceof com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin) {
          return mergeFrom((com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin other) {
        if (other == com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin.getDefaultInstance()) return this;
        if (other.hasReqUserLogin()) {
          mergeReqUserLogin(other.getReqUserLogin());
        }
        if (!other.getPassword().isEmpty()) {
          password_ = other.password_;
          onChanged();
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
        com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin reqUserLogin_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin, com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin.Builder, com.felania.msldb.ReqUserLoginOuterClass.ReqUserLoginOrBuilder> reqUserLoginBuilder_;
      /**
       * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
       */
      public boolean hasReqUserLogin() {
        return reqUserLoginBuilder_ != null || reqUserLogin_ != null;
      }
      /**
       * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
       */
      public com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin getReqUserLogin() {
        if (reqUserLoginBuilder_ == null) {
          return reqUserLogin_ == null ? com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin.getDefaultInstance() : reqUserLogin_;
        } else {
          return reqUserLoginBuilder_.getMessage();
        }
      }
      /**
       * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
       */
      public Builder setReqUserLogin(com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin value) {
        if (reqUserLoginBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          reqUserLogin_ = value;
          onChanged();
        } else {
          reqUserLoginBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
       */
      public Builder setReqUserLogin(
          com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin.Builder builderForValue) {
        if (reqUserLoginBuilder_ == null) {
          reqUserLogin_ = builderForValue.build();
          onChanged();
        } else {
          reqUserLoginBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
       */
      public Builder mergeReqUserLogin(com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin value) {
        if (reqUserLoginBuilder_ == null) {
          if (reqUserLogin_ != null) {
            reqUserLogin_ =
              com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin.newBuilder(reqUserLogin_).mergeFrom(value).buildPartial();
          } else {
            reqUserLogin_ = value;
          }
          onChanged();
        } else {
          reqUserLoginBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
       */
      public Builder clearReqUserLogin() {
        if (reqUserLoginBuilder_ == null) {
          reqUserLogin_ = null;
          onChanged();
        } else {
          reqUserLogin_ = null;
          reqUserLoginBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
       */
      public com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin.Builder getReqUserLoginBuilder() {
        
        onChanged();
        return getReqUserLoginFieldBuilder().getBuilder();
      }
      /**
       * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
       */
      public com.felania.msldb.ReqUserLoginOuterClass.ReqUserLoginOrBuilder getReqUserLoginOrBuilder() {
        if (reqUserLoginBuilder_ != null) {
          return reqUserLoginBuilder_.getMessageOrBuilder();
        } else {
          return reqUserLogin_ == null ?
              com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin.getDefaultInstance() : reqUserLogin_;
        }
      }
      /**
       * <code>.msggamedata.ReqUserLogin reqUserLogin = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin, com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin.Builder, com.felania.msldb.ReqUserLoginOuterClass.ReqUserLoginOrBuilder> 
          getReqUserLoginFieldBuilder() {
        if (reqUserLoginBuilder_ == null) {
          reqUserLoginBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin, com.felania.msldb.ReqUserLoginOuterClass.ReqUserLogin.Builder, com.felania.msldb.ReqUserLoginOuterClass.ReqUserLoginOrBuilder>(
                  getReqUserLogin(),
                  getParentForChildren(),
                  isClean());
          reqUserLogin_ = null;
        }
        return reqUserLoginBuilder_;
      }

      private java.lang.Object password_ = "";
      /**
       * <code>string password = 2;</code>
       */
      public java.lang.String getPassword() {
        java.lang.Object ref = password_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          password_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string password = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPasswordBytes() {
        java.lang.Object ref = password_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          password_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string password = 2;</code>
       */
      public Builder setPassword(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        password_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string password = 2;</code>
       */
      public Builder clearPassword() {
        
        password_ = getDefaultInstance().getPassword();
        onChanged();
        return this;
      }
      /**
       * <code>string password = 2;</code>
       */
      public Builder setPasswordBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        password_ = value;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.ReqBanhaoUserLogin)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.ReqBanhaoUserLogin)
    private static final com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin();
    }

    public static com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqBanhaoUserLogin>
        PARSER = new com.google.protobuf.AbstractParser<ReqBanhaoUserLogin>() {
      public ReqBanhaoUserLogin parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReqBanhaoUserLogin(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqBanhaoUserLogin> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqBanhaoUserLogin> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.ReqBanhaoUserLoginOuterClass.ReqBanhaoUserLogin getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_ReqBanhaoUserLogin_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_ReqBanhaoUserLogin_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ReqBanhaoUserLogin.proto\022\013msggamedata\032" +
      "\022ReqUserLogin.proto\"W\n\022ReqBanhaoUserLogi" +
      "n\022/\n\014reqUserLogin\030\001 \001(\0132\031.msggamedata.Re" +
      "qUserLogin\022\020\n\010password\030\002 \001(\tB\023\n\021com.fela" +
      "nia.msldbb\006proto3"
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
          com.felania.msldb.ReqUserLoginOuterClass.getDescriptor(),
        }, assigner);
    internal_static_msggamedata_ReqBanhaoUserLogin_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_ReqBanhaoUserLogin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_ReqBanhaoUserLogin_descriptor,
        new java.lang.String[] { "ReqUserLogin", "Password", });
    com.felania.msldb.ReqUserLoginOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
