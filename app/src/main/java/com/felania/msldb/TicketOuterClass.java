// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Ticket.proto

package com.felania.msldb;

public final class TicketOuterClass {
  private TicketOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TicketOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msggamedata.Ticket)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 ticket = 1;</code>
     */
    int getTicket();

    /**
     * <code>uint32 timeDelta = 2;</code>
     */
    int getTimeDelta();

    /**
     * <code>uint64 currentTime = 3;</code>
     */
    long getCurrentTime();

    /**
     * <code>uint64 timezone = 4;</code>
     */
    long getTimezone();
  }
  /**
   * Protobuf type {@code msggamedata.Ticket}
   */
  public  static final class Ticket extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msggamedata.Ticket)
      TicketOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Ticket.newBuilder() to construct.
    private Ticket(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Ticket() {
      ticket_ = 0;
      timeDelta_ = 0;
      currentTime_ = 0L;
      timezone_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Ticket(
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

              ticket_ = input.readUInt32();
              break;
            }
            case 16: {

              timeDelta_ = input.readUInt32();
              break;
            }
            case 24: {

              currentTime_ = input.readUInt64();
              break;
            }
            case 32: {

              timezone_ = input.readUInt64();
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
      return com.felania.msldb.TicketOuterClass.internal_static_msggamedata_Ticket_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.felania.msldb.TicketOuterClass.internal_static_msggamedata_Ticket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.felania.msldb.TicketOuterClass.Ticket.class, com.felania.msldb.TicketOuterClass.Ticket.Builder.class);
    }

    public static final int TICKET_FIELD_NUMBER = 1;
    private int ticket_;
    /**
     * <code>uint32 ticket = 1;</code>
     */
    public int getTicket() {
      return ticket_;
    }

    public static final int TIMEDELTA_FIELD_NUMBER = 2;
    private int timeDelta_;
    /**
     * <code>uint32 timeDelta = 2;</code>
     */
    public int getTimeDelta() {
      return timeDelta_;
    }

    public static final int CURRENTTIME_FIELD_NUMBER = 3;
    private long currentTime_;
    /**
     * <code>uint64 currentTime = 3;</code>
     */
    public long getCurrentTime() {
      return currentTime_;
    }

    public static final int TIMEZONE_FIELD_NUMBER = 4;
    private long timezone_;
    /**
     * <code>uint64 timezone = 4;</code>
     */
    public long getTimezone() {
      return timezone_;
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
      if (ticket_ != 0) {
        output.writeUInt32(1, ticket_);
      }
      if (timeDelta_ != 0) {
        output.writeUInt32(2, timeDelta_);
      }
      if (currentTime_ != 0L) {
        output.writeUInt64(3, currentTime_);
      }
      if (timezone_ != 0L) {
        output.writeUInt64(4, timezone_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ticket_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, ticket_);
      }
      if (timeDelta_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, timeDelta_);
      }
      if (currentTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, currentTime_);
      }
      if (timezone_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, timezone_);
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
      if (!(obj instanceof com.felania.msldb.TicketOuterClass.Ticket)) {
        return super.equals(obj);
      }
      com.felania.msldb.TicketOuterClass.Ticket other = (com.felania.msldb.TicketOuterClass.Ticket) obj;

      boolean result = true;
      result = result && (getTicket()
          == other.getTicket());
      result = result && (getTimeDelta()
          == other.getTimeDelta());
      result = result && (getCurrentTime()
          == other.getCurrentTime());
      result = result && (getTimezone()
          == other.getTimezone());
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
      hash = (37 * hash) + TICKET_FIELD_NUMBER;
      hash = (53 * hash) + getTicket();
      hash = (37 * hash) + TIMEDELTA_FIELD_NUMBER;
      hash = (53 * hash) + getTimeDelta();
      hash = (37 * hash) + CURRENTTIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCurrentTime());
      hash = (37 * hash) + TIMEZONE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimezone());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.felania.msldb.TicketOuterClass.Ticket parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.TicketOuterClass.Ticket parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.TicketOuterClass.Ticket parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.TicketOuterClass.Ticket parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.TicketOuterClass.Ticket parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.felania.msldb.TicketOuterClass.Ticket parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.felania.msldb.TicketOuterClass.Ticket parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.TicketOuterClass.Ticket parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.TicketOuterClass.Ticket parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.felania.msldb.TicketOuterClass.Ticket parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.felania.msldb.TicketOuterClass.Ticket parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.felania.msldb.TicketOuterClass.Ticket parseFrom(
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
    public static Builder newBuilder(com.felania.msldb.TicketOuterClass.Ticket prototype) {
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
     * Protobuf type {@code msggamedata.Ticket}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msggamedata.Ticket)
        com.felania.msldb.TicketOuterClass.TicketOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.felania.msldb.TicketOuterClass.internal_static_msggamedata_Ticket_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.felania.msldb.TicketOuterClass.internal_static_msggamedata_Ticket_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.felania.msldb.TicketOuterClass.Ticket.class, com.felania.msldb.TicketOuterClass.Ticket.Builder.class);
      }

      // Construct using com.felania.msldb.TicketOuterClass.Ticket.newBuilder()
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
        ticket_ = 0;

        timeDelta_ = 0;

        currentTime_ = 0L;

        timezone_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.felania.msldb.TicketOuterClass.internal_static_msggamedata_Ticket_descriptor;
      }

      public com.felania.msldb.TicketOuterClass.Ticket getDefaultInstanceForType() {
        return com.felania.msldb.TicketOuterClass.Ticket.getDefaultInstance();
      }

      public com.felania.msldb.TicketOuterClass.Ticket build() {
        com.felania.msldb.TicketOuterClass.Ticket result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.felania.msldb.TicketOuterClass.Ticket buildPartial() {
        com.felania.msldb.TicketOuterClass.Ticket result = new com.felania.msldb.TicketOuterClass.Ticket(this);
        result.ticket_ = ticket_;
        result.timeDelta_ = timeDelta_;
        result.currentTime_ = currentTime_;
        result.timezone_ = timezone_;
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
        if (other instanceof com.felania.msldb.TicketOuterClass.Ticket) {
          return mergeFrom((com.felania.msldb.TicketOuterClass.Ticket)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.felania.msldb.TicketOuterClass.Ticket other) {
        if (other == com.felania.msldb.TicketOuterClass.Ticket.getDefaultInstance()) return this;
        if (other.getTicket() != 0) {
          setTicket(other.getTicket());
        }
        if (other.getTimeDelta() != 0) {
          setTimeDelta(other.getTimeDelta());
        }
        if (other.getCurrentTime() != 0L) {
          setCurrentTime(other.getCurrentTime());
        }
        if (other.getTimezone() != 0L) {
          setTimezone(other.getTimezone());
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
        com.felania.msldb.TicketOuterClass.Ticket parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.felania.msldb.TicketOuterClass.Ticket) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int ticket_ ;
      /**
       * <code>uint32 ticket = 1;</code>
       */
      public int getTicket() {
        return ticket_;
      }
      /**
       * <code>uint32 ticket = 1;</code>
       */
      public Builder setTicket(int value) {
        
        ticket_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ticket = 1;</code>
       */
      public Builder clearTicket() {
        
        ticket_ = 0;
        onChanged();
        return this;
      }

      private int timeDelta_ ;
      /**
       * <code>uint32 timeDelta = 2;</code>
       */
      public int getTimeDelta() {
        return timeDelta_;
      }
      /**
       * <code>uint32 timeDelta = 2;</code>
       */
      public Builder setTimeDelta(int value) {
        
        timeDelta_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 timeDelta = 2;</code>
       */
      public Builder clearTimeDelta() {
        
        timeDelta_ = 0;
        onChanged();
        return this;
      }

      private long currentTime_ ;
      /**
       * <code>uint64 currentTime = 3;</code>
       */
      public long getCurrentTime() {
        return currentTime_;
      }
      /**
       * <code>uint64 currentTime = 3;</code>
       */
      public Builder setCurrentTime(long value) {
        
        currentTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 currentTime = 3;</code>
       */
      public Builder clearCurrentTime() {
        
        currentTime_ = 0L;
        onChanged();
        return this;
      }

      private long timezone_ ;
      /**
       * <code>uint64 timezone = 4;</code>
       */
      public long getTimezone() {
        return timezone_;
      }
      /**
       * <code>uint64 timezone = 4;</code>
       */
      public Builder setTimezone(long value) {
        
        timezone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 timezone = 4;</code>
       */
      public Builder clearTimezone() {
        
        timezone_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:msggamedata.Ticket)
    }

    // @@protoc_insertion_point(class_scope:msggamedata.Ticket)
    private static final com.felania.msldb.TicketOuterClass.Ticket DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.felania.msldb.TicketOuterClass.Ticket();
    }

    public static com.felania.msldb.TicketOuterClass.Ticket getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Ticket>
        PARSER = new com.google.protobuf.AbstractParser<Ticket>() {
      public Ticket parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Ticket(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Ticket> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Ticket> getParserForType() {
      return PARSER;
    }

    public com.felania.msldb.TicketOuterClass.Ticket getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msggamedata_Ticket_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msggamedata_Ticket_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Ticket.proto\022\013msggamedata\"R\n\006Ticket\022\016\n" +
      "\006ticket\030\001 \001(\r\022\021\n\ttimeDelta\030\002 \001(\r\022\023\n\013curr" +
      "entTime\030\003 \001(\004\022\020\n\010timezone\030\004 \001(\004B\023\n\021com.f" +
      "elania.msldbb\006proto3"
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
    internal_static_msggamedata_Ticket_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msggamedata_Ticket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msggamedata_Ticket_descriptor,
        new java.lang.String[] { "Ticket", "TimeDelta", "CurrentTime", "Timezone", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
