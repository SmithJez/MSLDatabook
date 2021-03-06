// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgCVCPhaseBonusPoint.proto

package com.felania.msldb;

public final class MsgCVCPhaseBonusPointOuterClass {
  private MsgCVCPhaseBonusPointOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgCVCPhaseBonusPointOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgCVCPhaseBonusPoint)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>uint32 member_count = 2;</code>
     */
    int getMemberCount();

    /**
     * <code>uint32 point_win = 3;</code>
     */
    int getPointWin();

    /**
     * <code>uint32 point_draw = 4;</code>
     */
    int getPointDraw();

    /**
     * <code>uint32 point_lose = 5;</code>
     */
    int getPointLose();

    /**
     * <code>uint32 point_unearned = 6;</code>
     */
    int getPointUnearned();

    /**
     * <code>uint32 winpoint_win = 7;</code>
     */
    int getWinpointWin();

    /**
     * <code>uint32 winpoint_draw = 8;</code>
     */
    int getWinpointDraw();

    /**
     * <code>uint32 winpoint_lose = 9;</code>
     */
    int getWinpointLose();

    /**
     * <code>uint32 max_cvc_season_idx = 10;</code>
     */
    int getMaxCvcSeasonIdx();
  }
  /**
   * Protobuf type {@code msggamedata.MsgCVCPhaseBonusPoint}
   */
  public  static final class MsgCVCPhaseBonusPoint extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgCVCPhaseBonusPoint)
      MsgCVCPhaseBonusPointOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgCVCPhaseBonusPoint.newBuilder() to construct.
    private MsgCVCPhaseBonusPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgCVCPhaseBonusPoint() {
      uid_ = 0;
      memberCount_ = 0;
      pointWin_ = 0;
      pointDraw_ = 0;
      pointLose_ = 0;
      pointUnearned_ = 0;
      winpointWin_ = 0;
      winpointDraw_ = 0;
      winpointLose_ = 0;
      maxCvcSeasonIdx_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgCVCPhaseBonusPoint(
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
            case 16: {

              memberCount_ = input.readUInt32();
              break;
            }
            case 24: {

              pointWin_ = input.readUInt32();
              break;
            }
            case 32: {

              pointDraw_ = input.readUInt32();
              break;
            }
            case 40: {

              pointLose_ = input.readUInt32();
              break;
            }
            case 48: {

              pointUnearned_ = input.readUInt32();
              break;
            }
            case 56: {

              winpointWin_ = input.readUInt32();
              break;
            }
            case 64: {

              winpointDraw_ = input.readUInt32();
              break;
            }
            case 72: {

              winpointLose_ = input.readUInt32();
              break;
            }
            case 80: {

              maxCvcSeasonIdx_ = input.readUInt32();
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
      return com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.internal_static_msggamedata_MsgCVCPhaseBonusPoint_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.internal_static_msggamedata_MsgCVCPhaseBonusPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint.class, com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>fixed32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int MEMBER_COUNT_FIELD_NUMBER = 2;
    private int memberCount_;
    /**
     * <code>uint32 member_count = 2;</code>
     */
    public int getMemberCount() {
      return memberCount_;
    }

    public static final int POINT_WIN_FIELD_NUMBER = 3;
    private int pointWin_;
    /**
     * <code>uint32 point_win = 3;</code>
     */
    public int getPointWin() {
      return pointWin_;
    }

    public static final int POINT_DRAW_FIELD_NUMBER = 4;
    private int pointDraw_;
    /**
     * <code>uint32 point_draw = 4;</code>
     */
    public int getPointDraw() {
      return pointDraw_;
    }

    public static final int POINT_LOSE_FIELD_NUMBER = 5;
    private int pointLose_;
    /**
     * <code>uint32 point_lose = 5;</code>
     */
    public int getPointLose() {
      return pointLose_;
    }

    public static final int POINT_UNEARNED_FIELD_NUMBER = 6;
    private int pointUnearned_;
    /**
     * <code>uint32 point_unearned = 6;</code>
     */
    public int getPointUnearned() {
      return pointUnearned_;
    }

    public static final int WINPOINT_WIN_FIELD_NUMBER = 7;
    private int winpointWin_;
    /**
     * <code>uint32 winpoint_win = 7;</code>
     */
    public int getWinpointWin() {
      return winpointWin_;
    }

    public static final int WINPOINT_DRAW_FIELD_NUMBER = 8;
    private int winpointDraw_;
    /**
     * <code>uint32 winpoint_draw = 8;</code>
     */
    public int getWinpointDraw() {
      return winpointDraw_;
    }

    public static final int WINPOINT_LOSE_FIELD_NUMBER = 9;
    private int winpointLose_;
    /**
     * <code>uint32 winpoint_lose = 9;</code>
     */
    public int getWinpointLose() {
      return winpointLose_;
    }

    public static final int MAX_CVC_SEASON_IDX_FIELD_NUMBER = 10;
    private int maxCvcSeasonIdx_;
    /**
     * <code>uint32 max_cvc_season_idx = 10;</code>
     */
    public int getMaxCvcSeasonIdx() {
      return maxCvcSeasonIdx_;
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
      if (memberCount_ != 0) {
        output.writeUInt32(2, memberCount_);
      }
      if (pointWin_ != 0) {
        output.writeUInt32(3, pointWin_);
      }
      if (pointDraw_ != 0) {
        output.writeUInt32(4, pointDraw_);
      }
      if (pointLose_ != 0) {
        output.writeUInt32(5, pointLose_);
      }
      if (pointUnearned_ != 0) {
        output.writeUInt32(6, pointUnearned_);
      }
      if (winpointWin_ != 0) {
        output.writeUInt32(7, winpointWin_);
      }
      if (winpointDraw_ != 0) {
        output.writeUInt32(8, winpointDraw_);
      }
      if (winpointLose_ != 0) {
        output.writeUInt32(9, winpointLose_);
      }
      if (maxCvcSeasonIdx_ != 0) {
        output.writeUInt32(10, maxCvcSeasonIdx_);
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
      if (memberCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, memberCount_);
      }
      if (pointWin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, pointWin_);
      }
      if (pointDraw_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, pointDraw_);
      }
      if (pointLose_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, pointLose_);
      }
      if (pointUnearned_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, pointUnearned_);
      }
      if (winpointWin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, winpointWin_);
      }
      if (winpointDraw_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, winpointDraw_);
      }
      if (winpointLose_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, winpointLose_);
      }
      if (maxCvcSeasonIdx_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, maxCvcSeasonIdx_);
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
      if (!(obj instanceof com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint other = (com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint) obj;

      boolean result = true;
      result = result && (getUid()
          == other.getUid());
      result = result && (getMemberCount()
          == other.getMemberCount());
      result = result && (getPointWin()
          == other.getPointWin());
      result = result && (getPointDraw()
          == other.getPointDraw());
      result = result && (getPointLose()
          == other.getPointLose());
      result = result && (getPointUnearned()
          == other.getPointUnearned());
      result = result && (getWinpointWin()
          == other.getWinpointWin());
      result = result && (getWinpointDraw()
          == other.getWinpointDraw());
      result = result && (getWinpointLose()
          == other.getWinpointLose());
      result = result && (getMaxCvcSeasonIdx()
          == other.getMaxCvcSeasonIdx());
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
      hash = (37 * hash) + MEMBER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMemberCount();
      hash = (37 * hash) + POINT_WIN_FIELD_NUMBER;
      hash = (53 * hash) + getPointWin();
      hash = (37 * hash) + POINT_DRAW_FIELD_NUMBER;
      hash = (53 * hash) + getPointDraw();
      hash = (37 * hash) + POINT_LOSE_FIELD_NUMBER;
      hash = (53 * hash) + getPointLose();
      hash = (37 * hash) + POINT_UNEARNED_FIELD_NUMBER;
      hash = (53 * hash) + getPointUnearned();
      hash = (37 * hash) + WINPOINT_WIN_FIELD_NUMBER;
      hash = (53 * hash) + getWinpointWin();
      hash = (37 * hash) + WINPOINT_DRAW_FIELD_NUMBER;
      hash = (53 * hash) + getWinpointDraw();
      hash = (37 * hash) + WINPOINT_LOSE_FIELD_NUMBER;
      hash = (53 * hash) + getWinpointLose();
      hash = (37 * hash) + MAX_CVC_SEASON_IDX_FIELD_NUMBER;
      hash = (53 * hash) + getMaxCvcSeasonIdx();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint prototype) {
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
     * Protobuf type {@code msggamedata.MsgCVCPhaseBonusPoint}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgCVCPhaseBonusPoint)
        com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPointOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.internal_static_msggamedata_MsgCVCPhaseBonusPoint_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.internal_static_msggamedata_MsgCVCPhaseBonusPoint_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint.class, com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint.Builder.class);
      }

      // Construct using com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint.newBuilder()
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

        memberCount_ = 0;

        pointWin_ = 0;

        pointDraw_ = 0;

        pointLose_ = 0;

        pointUnearned_ = 0;

        winpointWin_ = 0;

        winpointDraw_ = 0;

        winpointLose_ = 0;

        maxCvcSeasonIdx_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.internal_static_msggamedata_MsgCVCPhaseBonusPoint_descriptor;
      }

      public com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint getDefaultInstanceForType() {
        return com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint.getDefaultInstance();
      }

      public com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint build() {
        com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint buildPartial() {
        com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint result = new com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint(this);
        result.uid_ = uid_;
        result.memberCount_ = memberCount_;
        result.pointWin_ = pointWin_;
        result.pointDraw_ = pointDraw_;
        result.pointLose_ = pointLose_;
        result.pointUnearned_ = pointUnearned_;
        result.winpointWin_ = winpointWin_;
        result.winpointDraw_ = winpointDraw_;
        result.winpointLose_ = winpointLose_;
        result.maxCvcSeasonIdx_ = maxCvcSeasonIdx_;
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
        if (other instanceof com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint) {
          return mergeFrom((com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint other) {
        if (other == com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getMemberCount() != 0) {
          setMemberCount(other.getMemberCount());
        }
        if (other.getPointWin() != 0) {
          setPointWin(other.getPointWin());
        }
        if (other.getPointDraw() != 0) {
          setPointDraw(other.getPointDraw());
        }
        if (other.getPointLose() != 0) {
          setPointLose(other.getPointLose());
        }
        if (other.getPointUnearned() != 0) {
          setPointUnearned(other.getPointUnearned());
        }
        if (other.getWinpointWin() != 0) {
          setWinpointWin(other.getWinpointWin());
        }
        if (other.getWinpointDraw() != 0) {
          setWinpointDraw(other.getWinpointDraw());
        }
        if (other.getWinpointLose() != 0) {
          setWinpointLose(other.getWinpointLose());
        }
        if (other.getMaxCvcSeasonIdx() != 0) {
          setMaxCvcSeasonIdx(other.getMaxCvcSeasonIdx());
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
        com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint) e.getUnfinishedMessage();
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

      private int memberCount_ ;
      /**
       * <code>uint32 member_count = 2;</code>
       */
      public int getMemberCount() {
        return memberCount_;
      }
      /**
       * <code>uint32 member_count = 2;</code>
       */
      public Builder setMemberCount(int value) {
        
        memberCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 member_count = 2;</code>
       */
      public Builder clearMemberCount() {
        
        memberCount_ = 0;
        onChanged();
        return this;
      }

      private int pointWin_ ;
      /**
       * <code>uint32 point_win = 3;</code>
       */
      public int getPointWin() {
        return pointWin_;
      }
      /**
       * <code>uint32 point_win = 3;</code>
       */
      public Builder setPointWin(int value) {
        
        pointWin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_win = 3;</code>
       */
      public Builder clearPointWin() {
        
        pointWin_ = 0;
        onChanged();
        return this;
      }

      private int pointDraw_ ;
      /**
       * <code>uint32 point_draw = 4;</code>
       */
      public int getPointDraw() {
        return pointDraw_;
      }
      /**
       * <code>uint32 point_draw = 4;</code>
       */
      public Builder setPointDraw(int value) {
        
        pointDraw_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_draw = 4;</code>
       */
      public Builder clearPointDraw() {
        
        pointDraw_ = 0;
        onChanged();
        return this;
      }

      private int pointLose_ ;
      /**
       * <code>uint32 point_lose = 5;</code>
       */
      public int getPointLose() {
        return pointLose_;
      }
      /**
       * <code>uint32 point_lose = 5;</code>
       */
      public Builder setPointLose(int value) {
        
        pointLose_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_lose = 5;</code>
       */
      public Builder clearPointLose() {
        
        pointLose_ = 0;
        onChanged();
        return this;
      }

      private int pointUnearned_ ;
      /**
       * <code>uint32 point_unearned = 6;</code>
       */
      public int getPointUnearned() {
        return pointUnearned_;
      }
      /**
       * <code>uint32 point_unearned = 6;</code>
       */
      public Builder setPointUnearned(int value) {
        
        pointUnearned_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_unearned = 6;</code>
       */
      public Builder clearPointUnearned() {
        
        pointUnearned_ = 0;
        onChanged();
        return this;
      }

      private int winpointWin_ ;
      /**
       * <code>uint32 winpoint_win = 7;</code>
       */
      public int getWinpointWin() {
        return winpointWin_;
      }
      /**
       * <code>uint32 winpoint_win = 7;</code>
       */
      public Builder setWinpointWin(int value) {
        
        winpointWin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 winpoint_win = 7;</code>
       */
      public Builder clearWinpointWin() {
        
        winpointWin_ = 0;
        onChanged();
        return this;
      }

      private int winpointDraw_ ;
      /**
       * <code>uint32 winpoint_draw = 8;</code>
       */
      public int getWinpointDraw() {
        return winpointDraw_;
      }
      /**
       * <code>uint32 winpoint_draw = 8;</code>
       */
      public Builder setWinpointDraw(int value) {
        
        winpointDraw_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 winpoint_draw = 8;</code>
       */
      public Builder clearWinpointDraw() {
        
        winpointDraw_ = 0;
        onChanged();
        return this;
      }

      private int winpointLose_ ;
      /**
       * <code>uint32 winpoint_lose = 9;</code>
       */
      public int getWinpointLose() {
        return winpointLose_;
      }
      /**
       * <code>uint32 winpoint_lose = 9;</code>
       */
      public Builder setWinpointLose(int value) {
        
        winpointLose_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 winpoint_lose = 9;</code>
       */
      public Builder clearWinpointLose() {
        
        winpointLose_ = 0;
        onChanged();
        return this;
      }

      private int maxCvcSeasonIdx_ ;
      /**
       * <code>uint32 max_cvc_season_idx = 10;</code>
       */
      public int getMaxCvcSeasonIdx() {
        return maxCvcSeasonIdx_;
      }
      /**
       * <code>uint32 max_cvc_season_idx = 10;</code>
       */
      public Builder setMaxCvcSeasonIdx(int value) {
        
        maxCvcSeasonIdx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_cvc_season_idx = 10;</code>
       */
      public Builder clearMaxCvcSeasonIdx() {
        
        maxCvcSeasonIdx_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgCVCPhaseBonusPoint)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgCVCPhaseBonusPoint)
    private static final com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint();
    }

    public static com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgCVCPhaseBonusPoint>
        PARSER = new com.google.protobuf.AbstractParser<MsgCVCPhaseBonusPoint>() {
      public MsgCVCPhaseBonusPoint parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgCVCPhaseBonusPoint(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgCVCPhaseBonusPoint> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgCVCPhaseBonusPoint> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgCVCPhaseBonusPointOuterClass.MsgCVCPhaseBonusPoint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgCVCPhaseBonusPoint_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgCVCPhaseBonusPoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033MsgCVCPhaseBonusPoint.proto\022\013msggameda" +
      "ta\"\355\001\n\025MsgCVCPhaseBonusPoint\022\013\n\003uid\030\001 \001(" +
      "\007\022\024\n\014member_count\030\002 \001(\r\022\021\n\tpoint_win\030\003 \001" +
      "(\r\022\022\n\npoint_draw\030\004 \001(\r\022\022\n\npoint_lose\030\005 \001" +
      "(\r\022\026\n\016point_unearned\030\006 \001(\r\022\024\n\014winpoint_w" +
      "in\030\007 \001(\r\022\025\n\rwinpoint_draw\030\010 \001(\r\022\025\n\rwinpo" +
      "int_lose\030\t \001(\r\022\032\n\022max_cvc_season_idx\030\n \001" +
      "(\rB\023\n\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_MsgCVCPhaseBonusPoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgCVCPhaseBonusPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgCVCPhaseBonusPoint_descriptor,
        new java.lang.String[] { "Uid", "MemberCount", "PointWin", "PointDraw", "PointLose", "PointUnearned", "WinpointWin", "WinpointDraw", "WinpointLose", "MaxCvcSeasonIdx", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
