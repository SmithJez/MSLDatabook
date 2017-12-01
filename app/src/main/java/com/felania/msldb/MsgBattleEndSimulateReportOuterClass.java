// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgBattleEndSimulateReport.proto

package com.felania.msldb;

public final class MsgBattleEndSimulateReportOuterClass {
  private MsgBattleEndSimulateReportOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgBattleEndSimulateReportOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.MsgBattleEndSimulateReport)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 my_user_monster_id = 1;</code>
     */
    long getMyUserMonsterId();

    /**
     * <code>uint64 enemy_id_damaged = 2;</code>
     */
    long getEnemyIdDamaged();

    /**
     * <code>uint64 enemy_id_attacked = 3;</code>
     */
    long getEnemyIdAttacked();

    /**
     * <code>uint32 report_stat = 4;</code>
     */
    int getReportStat();

    /**
     * <code>uint32 max_damage = 5;</code>
     */
    int getMaxDamage();

    /**
     * <code>uint32 min_damage = 6;</code>
     */
    int getMinDamage();

    /**
     * <code>uint32 valid_code = 7;</code>
     */
    int getValidCode();
  }
  /**
   * Protobuf type {@code msggamedata.MsgBattleEndSimulateReport}
   */
  public  static final class MsgBattleEndSimulateReport extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.MsgBattleEndSimulateReport)
      MsgBattleEndSimulateReportOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgBattleEndSimulateReport.newBuilder() to construct.
    private MsgBattleEndSimulateReport(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgBattleEndSimulateReport() {
      myUserMonsterId_ = 0L;
      enemyIdDamaged_ = 0L;
      enemyIdAttacked_ = 0L;
      reportStat_ = 0;
      maxDamage_ = 0;
      minDamage_ = 0;
      validCode_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgBattleEndSimulateReport(
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
            case 8: {

              myUserMonsterId_ = input.readUInt64();
              break;
            }
            case 16: {

              enemyIdDamaged_ = input.readUInt64();
              break;
            }
            case 24: {

              enemyIdAttacked_ = input.readUInt64();
              break;
            }
            case 32: {

              reportStat_ = input.readUInt32();
              break;
            }
            case 40: {

              maxDamage_ = input.readUInt32();
              break;
            }
            case 48: {

              minDamage_ = input.readUInt32();
              break;
            }
            case 56: {

              validCode_ = input.readUInt32();
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
      return com.felania.msldb.MsgBattleEndSimulateReportOuterClass.internal_static_msggamedata_MsgBattleEndSimulateReport_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.MsgBattleEndSimulateReportOuterClass.internal_static_msggamedata_MsgBattleEndSimulateReport_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport.class, com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport.Builder.class);
    }

    public static final int MY_USER_MONSTER_ID_FIELD_NUMBER = 1;
    private long myUserMonsterId_;
    /**
     * <code>uint64 my_user_monster_id = 1;</code>
     */
    public long getMyUserMonsterId() {
      return myUserMonsterId_;
    }

    public static final int ENEMY_ID_DAMAGED_FIELD_NUMBER = 2;
    private long enemyIdDamaged_;
    /**
     * <code>uint64 enemy_id_damaged = 2;</code>
     */
    public long getEnemyIdDamaged() {
      return enemyIdDamaged_;
    }

    public static final int ENEMY_ID_ATTACKED_FIELD_NUMBER = 3;
    private long enemyIdAttacked_;
    /**
     * <code>uint64 enemy_id_attacked = 3;</code>
     */
    public long getEnemyIdAttacked() {
      return enemyIdAttacked_;
    }

    public static final int REPORT_STAT_FIELD_NUMBER = 4;
    private int reportStat_;
    /**
     * <code>uint32 report_stat = 4;</code>
     */
    public int getReportStat() {
      return reportStat_;
    }

    public static final int MAX_DAMAGE_FIELD_NUMBER = 5;
    private int maxDamage_;
    /**
     * <code>uint32 max_damage = 5;</code>
     */
    public int getMaxDamage() {
      return maxDamage_;
    }

    public static final int MIN_DAMAGE_FIELD_NUMBER = 6;
    private int minDamage_;
    /**
     * <code>uint32 min_damage = 6;</code>
     */
    public int getMinDamage() {
      return minDamage_;
    }

    public static final int VALID_CODE_FIELD_NUMBER = 7;
    private int validCode_;
    /**
     * <code>uint32 valid_code = 7;</code>
     */
    public int getValidCode() {
      return validCode_;
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
      if (myUserMonsterId_ != 0L) {
        output.writeUInt64(1, myUserMonsterId_);
      }
      if (enemyIdDamaged_ != 0L) {
        output.writeUInt64(2, enemyIdDamaged_);
      }
      if (enemyIdAttacked_ != 0L) {
        output.writeUInt64(3, enemyIdAttacked_);
      }
      if (reportStat_ != 0) {
        output.writeUInt32(4, reportStat_);
      }
      if (maxDamage_ != 0) {
        output.writeUInt32(5, maxDamage_);
      }
      if (minDamage_ != 0) {
        output.writeUInt32(6, minDamage_);
      }
      if (validCode_ != 0) {
        output.writeUInt32(7, validCode_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (myUserMonsterId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, myUserMonsterId_);
      }
      if (enemyIdDamaged_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, enemyIdDamaged_);
      }
      if (enemyIdAttacked_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, enemyIdAttacked_);
      }
      if (reportStat_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, reportStat_);
      }
      if (maxDamage_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, maxDamage_);
      }
      if (minDamage_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, minDamage_);
      }
      if (validCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, validCode_);
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
      if (!(obj instanceof com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport)) {
        return super.equals(obj);
      }
      com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport other = (com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport) obj;

      boolean result = true;
      result = result && (getMyUserMonsterId()
          == other.getMyUserMonsterId());
      result = result && (getEnemyIdDamaged()
          == other.getEnemyIdDamaged());
      result = result && (getEnemyIdAttacked()
          == other.getEnemyIdAttacked());
      result = result && (getReportStat()
          == other.getReportStat());
      result = result && (getMaxDamage()
          == other.getMaxDamage());
      result = result && (getMinDamage()
          == other.getMinDamage());
      result = result && (getValidCode()
          == other.getValidCode());
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
      hash = (37 * hash) + MY_USER_MONSTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMyUserMonsterId());
      hash = (37 * hash) + ENEMY_ID_DAMAGED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEnemyIdDamaged());
      hash = (37 * hash) + ENEMY_ID_ATTACKED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEnemyIdAttacked());
      hash = (37 * hash) + REPORT_STAT_FIELD_NUMBER;
      hash = (53 * hash) + getReportStat();
      hash = (37 * hash) + MAX_DAMAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxDamage();
      hash = (37 * hash) + MIN_DAMAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMinDamage();
      hash = (37 * hash) + VALID_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getValidCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport prototype) {
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
     * Protobuf type {@code msggamedata.MsgBattleEndSimulateReport}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.MsgBattleEndSimulateReport)
        com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReportOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.MsgBattleEndSimulateReportOuterClass.internal_static_msggamedata_MsgBattleEndSimulateReport_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.MsgBattleEndSimulateReportOuterClass.internal_static_msggamedata_MsgBattleEndSimulateReport_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport.class, com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport.Builder.class);
      }

      // Construct using com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport.newBuilder()
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
        myUserMonsterId_ = 0L;

        enemyIdDamaged_ = 0L;

        enemyIdAttacked_ = 0L;

        reportStat_ = 0;

        maxDamage_ = 0;

        minDamage_ = 0;

        validCode_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.MsgBattleEndSimulateReportOuterClass.internal_static_msggamedata_MsgBattleEndSimulateReport_descriptor;
      }

      public com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport getDefaultInstanceForType() {
        return com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport.getDefaultInstance();
      }

      public com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport build() {
        com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport buildPartial() {
        com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport result = new com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport(this);
        result.myUserMonsterId_ = myUserMonsterId_;
        result.enemyIdDamaged_ = enemyIdDamaged_;
        result.enemyIdAttacked_ = enemyIdAttacked_;
        result.reportStat_ = reportStat_;
        result.maxDamage_ = maxDamage_;
        result.minDamage_ = minDamage_;
        result.validCode_ = validCode_;
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
        if (other instanceof com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport) {
          return mergeFrom((com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport other) {
        if (other == com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport.getDefaultInstance()) return this;
        if (other.getMyUserMonsterId() != 0L) {
          setMyUserMonsterId(other.getMyUserMonsterId());
        }
        if (other.getEnemyIdDamaged() != 0L) {
          setEnemyIdDamaged(other.getEnemyIdDamaged());
        }
        if (other.getEnemyIdAttacked() != 0L) {
          setEnemyIdAttacked(other.getEnemyIdAttacked());
        }
        if (other.getReportStat() != 0) {
          setReportStat(other.getReportStat());
        }
        if (other.getMaxDamage() != 0) {
          setMaxDamage(other.getMaxDamage());
        }
        if (other.getMinDamage() != 0) {
          setMinDamage(other.getMinDamage());
        }
        if (other.getValidCode() != 0) {
          setValidCode(other.getValidCode());
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
        com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long myUserMonsterId_ ;
      /**
       * <code>uint64 my_user_monster_id = 1;</code>
       */
      public long getMyUserMonsterId() {
        return myUserMonsterId_;
      }
      /**
       * <code>uint64 my_user_monster_id = 1;</code>
       */
      public Builder setMyUserMonsterId(long value) {
        
        myUserMonsterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 my_user_monster_id = 1;</code>
       */
      public Builder clearMyUserMonsterId() {
        
        myUserMonsterId_ = 0L;
        onChanged();
        return this;
      }

      private long enemyIdDamaged_ ;
      /**
       * <code>uint64 enemy_id_damaged = 2;</code>
       */
      public long getEnemyIdDamaged() {
        return enemyIdDamaged_;
      }
      /**
       * <code>uint64 enemy_id_damaged = 2;</code>
       */
      public Builder setEnemyIdDamaged(long value) {
        
        enemyIdDamaged_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 enemy_id_damaged = 2;</code>
       */
      public Builder clearEnemyIdDamaged() {
        
        enemyIdDamaged_ = 0L;
        onChanged();
        return this;
      }

      private long enemyIdAttacked_ ;
      /**
       * <code>uint64 enemy_id_attacked = 3;</code>
       */
      public long getEnemyIdAttacked() {
        return enemyIdAttacked_;
      }
      /**
       * <code>uint64 enemy_id_attacked = 3;</code>
       */
      public Builder setEnemyIdAttacked(long value) {
        
        enemyIdAttacked_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 enemy_id_attacked = 3;</code>
       */
      public Builder clearEnemyIdAttacked() {
        
        enemyIdAttacked_ = 0L;
        onChanged();
        return this;
      }

      private int reportStat_ ;
      /**
       * <code>uint32 report_stat = 4;</code>
       */
      public int getReportStat() {
        return reportStat_;
      }
      /**
       * <code>uint32 report_stat = 4;</code>
       */
      public Builder setReportStat(int value) {
        
        reportStat_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 report_stat = 4;</code>
       */
      public Builder clearReportStat() {
        
        reportStat_ = 0;
        onChanged();
        return this;
      }

      private int maxDamage_ ;
      /**
       * <code>uint32 max_damage = 5;</code>
       */
      public int getMaxDamage() {
        return maxDamage_;
      }
      /**
       * <code>uint32 max_damage = 5;</code>
       */
      public Builder setMaxDamage(int value) {
        
        maxDamage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_damage = 5;</code>
       */
      public Builder clearMaxDamage() {
        
        maxDamage_ = 0;
        onChanged();
        return this;
      }

      private int minDamage_ ;
      /**
       * <code>uint32 min_damage = 6;</code>
       */
      public int getMinDamage() {
        return minDamage_;
      }
      /**
       * <code>uint32 min_damage = 6;</code>
       */
      public Builder setMinDamage(int value) {
        
        minDamage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 min_damage = 6;</code>
       */
      public Builder clearMinDamage() {
        
        minDamage_ = 0;
        onChanged();
        return this;
      }

      private int validCode_ ;
      /**
       * <code>uint32 valid_code = 7;</code>
       */
      public int getValidCode() {
        return validCode_;
      }
      /**
       * <code>uint32 valid_code = 7;</code>
       */
      public Builder setValidCode(int value) {
        
        validCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 valid_code = 7;</code>
       */
      public Builder clearValidCode() {
        
        validCode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.MsgBattleEndSimulateReport)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.MsgBattleEndSimulateReport)
    private static final com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport();
    }

    public static com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgBattleEndSimulateReport>
        PARSER = new com.google.protobuf.AbstractParser<MsgBattleEndSimulateReport>() {
      public MsgBattleEndSimulateReport parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MsgBattleEndSimulateReport(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgBattleEndSimulateReport> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgBattleEndSimulateReport> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.MsgBattleEndSimulateReportOuterClass.MsgBattleEndSimulateReport getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_MsgBattleEndSimulateReport_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_MsgBattleEndSimulateReport_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n MsgBattleEndSimulateReport.proto\022\013msgg" +
      "amedata\"\276\001\n\032MsgBattleEndSimulateReport\022\032" +
      "\n\022my_user_monster_id\030\001 \001(\004\022\030\n\020enemy_id_d" +
      "amaged\030\002 \001(\004\022\031\n\021enemy_id_attacked\030\003 \001(\004\022" +
      "\023\n\013report_stat\030\004 \001(\r\022\022\n\nmax_damage\030\005 \001(\r" +
      "\022\022\n\nmin_damage\030\006 \001(\r\022\022\n\nvalid_code\030\007 \001(\r" +
      "B\023\n\021com.felania.msldbb\006proto3"
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
    internal_static_msggamedata_MsgBattleEndSimulateReport_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_MsgBattleEndSimulateReport_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_MsgBattleEndSimulateReport_descriptor,
        new java.lang.String[] { "MyUserMonsterId", "EnemyIdDamaged", "EnemyIdAttacked", "ReportStat", "MaxDamage", "MinDamage", "ValidCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
