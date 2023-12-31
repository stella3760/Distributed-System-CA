// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package grpc.services.service2;

/**
 * <pre>
 * Definition of the 'ScheduleListResponse' message with its fields
 * </pre>
 *
 * Protobuf type {@code service2.ScheduleListResponse}
 */
public  final class ScheduleListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service2.ScheduleListResponse)
    ScheduleListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScheduleListResponse.newBuilder() to construct.
  private ScheduleListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScheduleListResponse() {
    schedule_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ScheduleListResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              schedule_ = new java.util.ArrayList<grpc.services.schedule.Schedule>();
              mutable_bitField0_ |= 0x00000001;
            }
            schedule_.add(
                input.readMessage(grpc.services.schedule.Schedule.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        schedule_ = java.util.Collections.unmodifiableList(schedule_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.services.service2.Service2Impl.internal_static_service2_ScheduleListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.services.service2.Service2Impl.internal_static_service2_ScheduleListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.services.service2.ScheduleListResponse.class, grpc.services.service2.ScheduleListResponse.Builder.class);
  }

  public static final int SCHEDULE_FIELD_NUMBER = 1;
  private java.util.List<grpc.services.schedule.Schedule> schedule_;
  /**
   * <pre>
   * Field for the list of schedules
   * </pre>
   *
   * <code>repeated .schedule.Schedule schedule = 1;</code>
   */
  public java.util.List<grpc.services.schedule.Schedule> getScheduleList() {
    return schedule_;
  }
  /**
   * <pre>
   * Field for the list of schedules
   * </pre>
   *
   * <code>repeated .schedule.Schedule schedule = 1;</code>
   */
  public java.util.List<? extends grpc.services.schedule.ScheduleOrBuilder> 
      getScheduleOrBuilderList() {
    return schedule_;
  }
  /**
   * <pre>
   * Field for the list of schedules
   * </pre>
   *
   * <code>repeated .schedule.Schedule schedule = 1;</code>
   */
  public int getScheduleCount() {
    return schedule_.size();
  }
  /**
   * <pre>
   * Field for the list of schedules
   * </pre>
   *
   * <code>repeated .schedule.Schedule schedule = 1;</code>
   */
  public grpc.services.schedule.Schedule getSchedule(int index) {
    return schedule_.get(index);
  }
  /**
   * <pre>
   * Field for the list of schedules
   * </pre>
   *
   * <code>repeated .schedule.Schedule schedule = 1;</code>
   */
  public grpc.services.schedule.ScheduleOrBuilder getScheduleOrBuilder(
      int index) {
    return schedule_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < schedule_.size(); i++) {
      output.writeMessage(1, schedule_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < schedule_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, schedule_.get(i));
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
    if (!(obj instanceof grpc.services.service2.ScheduleListResponse)) {
      return super.equals(obj);
    }
    grpc.services.service2.ScheduleListResponse other = (grpc.services.service2.ScheduleListResponse) obj;

    boolean result = true;
    result = result && getScheduleList()
        .equals(other.getScheduleList());
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
    if (getScheduleCount() > 0) {
      hash = (37 * hash) + SCHEDULE_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.services.service2.ScheduleListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.services.service2.ScheduleListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.services.service2.ScheduleListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.services.service2.ScheduleListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.services.service2.ScheduleListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.services.service2.ScheduleListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.services.service2.ScheduleListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.services.service2.ScheduleListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.services.service2.ScheduleListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.services.service2.ScheduleListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.services.service2.ScheduleListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.services.service2.ScheduleListResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.services.service2.ScheduleListResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * Definition of the 'ScheduleListResponse' message with its fields
   * </pre>
   *
   * Protobuf type {@code service2.ScheduleListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service2.ScheduleListResponse)
      grpc.services.service2.ScheduleListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.services.service2.Service2Impl.internal_static_service2_ScheduleListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.services.service2.Service2Impl.internal_static_service2_ScheduleListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.services.service2.ScheduleListResponse.class, grpc.services.service2.ScheduleListResponse.Builder.class);
    }

    // Construct using grpc.services.service2.ScheduleListResponse.newBuilder()
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
        getScheduleFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (scheduleBuilder_ == null) {
        schedule_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        scheduleBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.services.service2.Service2Impl.internal_static_service2_ScheduleListResponse_descriptor;
    }

    @java.lang.Override
    public grpc.services.service2.ScheduleListResponse getDefaultInstanceForType() {
      return grpc.services.service2.ScheduleListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.services.service2.ScheduleListResponse build() {
      grpc.services.service2.ScheduleListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.services.service2.ScheduleListResponse buildPartial() {
      grpc.services.service2.ScheduleListResponse result = new grpc.services.service2.ScheduleListResponse(this);
      int from_bitField0_ = bitField0_;
      if (scheduleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          schedule_ = java.util.Collections.unmodifiableList(schedule_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.schedule_ = schedule_;
      } else {
        result.schedule_ = scheduleBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.services.service2.ScheduleListResponse) {
        return mergeFrom((grpc.services.service2.ScheduleListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.services.service2.ScheduleListResponse other) {
      if (other == grpc.services.service2.ScheduleListResponse.getDefaultInstance()) return this;
      if (scheduleBuilder_ == null) {
        if (!other.schedule_.isEmpty()) {
          if (schedule_.isEmpty()) {
            schedule_ = other.schedule_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureScheduleIsMutable();
            schedule_.addAll(other.schedule_);
          }
          onChanged();
        }
      } else {
        if (!other.schedule_.isEmpty()) {
          if (scheduleBuilder_.isEmpty()) {
            scheduleBuilder_.dispose();
            scheduleBuilder_ = null;
            schedule_ = other.schedule_;
            bitField0_ = (bitField0_ & ~0x00000001);
            scheduleBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getScheduleFieldBuilder() : null;
          } else {
            scheduleBuilder_.addAllMessages(other.schedule_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.services.service2.ScheduleListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.services.service2.ScheduleListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<grpc.services.schedule.Schedule> schedule_ =
      java.util.Collections.emptyList();
    private void ensureScheduleIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        schedule_ = new java.util.ArrayList<grpc.services.schedule.Schedule>(schedule_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        grpc.services.schedule.Schedule, grpc.services.schedule.Schedule.Builder, grpc.services.schedule.ScheduleOrBuilder> scheduleBuilder_;

    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public java.util.List<grpc.services.schedule.Schedule> getScheduleList() {
      if (scheduleBuilder_ == null) {
        return java.util.Collections.unmodifiableList(schedule_);
      } else {
        return scheduleBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public int getScheduleCount() {
      if (scheduleBuilder_ == null) {
        return schedule_.size();
      } else {
        return scheduleBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public grpc.services.schedule.Schedule getSchedule(int index) {
      if (scheduleBuilder_ == null) {
        return schedule_.get(index);
      } else {
        return scheduleBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public Builder setSchedule(
        int index, grpc.services.schedule.Schedule value) {
      if (scheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScheduleIsMutable();
        schedule_.set(index, value);
        onChanged();
      } else {
        scheduleBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public Builder setSchedule(
        int index, grpc.services.schedule.Schedule.Builder builderForValue) {
      if (scheduleBuilder_ == null) {
        ensureScheduleIsMutable();
        schedule_.set(index, builderForValue.build());
        onChanged();
      } else {
        scheduleBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public Builder addSchedule(grpc.services.schedule.Schedule value) {
      if (scheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScheduleIsMutable();
        schedule_.add(value);
        onChanged();
      } else {
        scheduleBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public Builder addSchedule(
        int index, grpc.services.schedule.Schedule value) {
      if (scheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScheduleIsMutable();
        schedule_.add(index, value);
        onChanged();
      } else {
        scheduleBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public Builder addSchedule(
        grpc.services.schedule.Schedule.Builder builderForValue) {
      if (scheduleBuilder_ == null) {
        ensureScheduleIsMutable();
        schedule_.add(builderForValue.build());
        onChanged();
      } else {
        scheduleBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public Builder addSchedule(
        int index, grpc.services.schedule.Schedule.Builder builderForValue) {
      if (scheduleBuilder_ == null) {
        ensureScheduleIsMutable();
        schedule_.add(index, builderForValue.build());
        onChanged();
      } else {
        scheduleBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public Builder addAllSchedule(
        java.lang.Iterable<? extends grpc.services.schedule.Schedule> values) {
      if (scheduleBuilder_ == null) {
        ensureScheduleIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, schedule_);
        onChanged();
      } else {
        scheduleBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public Builder clearSchedule() {
      if (scheduleBuilder_ == null) {
        schedule_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        scheduleBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public Builder removeSchedule(int index) {
      if (scheduleBuilder_ == null) {
        ensureScheduleIsMutable();
        schedule_.remove(index);
        onChanged();
      } else {
        scheduleBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public grpc.services.schedule.Schedule.Builder getScheduleBuilder(
        int index) {
      return getScheduleFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public grpc.services.schedule.ScheduleOrBuilder getScheduleOrBuilder(
        int index) {
      if (scheduleBuilder_ == null) {
        return schedule_.get(index);  } else {
        return scheduleBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public java.util.List<? extends grpc.services.schedule.ScheduleOrBuilder> 
         getScheduleOrBuilderList() {
      if (scheduleBuilder_ != null) {
        return scheduleBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(schedule_);
      }
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public grpc.services.schedule.Schedule.Builder addScheduleBuilder() {
      return getScheduleFieldBuilder().addBuilder(
          grpc.services.schedule.Schedule.getDefaultInstance());
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public grpc.services.schedule.Schedule.Builder addScheduleBuilder(
        int index) {
      return getScheduleFieldBuilder().addBuilder(
          index, grpc.services.schedule.Schedule.getDefaultInstance());
    }
    /**
     * <pre>
     * Field for the list of schedules
     * </pre>
     *
     * <code>repeated .schedule.Schedule schedule = 1;</code>
     */
    public java.util.List<grpc.services.schedule.Schedule.Builder> 
         getScheduleBuilderList() {
      return getScheduleFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        grpc.services.schedule.Schedule, grpc.services.schedule.Schedule.Builder, grpc.services.schedule.ScheduleOrBuilder> 
        getScheduleFieldBuilder() {
      if (scheduleBuilder_ == null) {
        scheduleBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            grpc.services.schedule.Schedule, grpc.services.schedule.Schedule.Builder, grpc.services.schedule.ScheduleOrBuilder>(
                schedule_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        schedule_ = null;
      }
      return scheduleBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:service2.ScheduleListResponse)
  }

  // @@protoc_insertion_point(class_scope:service2.ScheduleListResponse)
  private static final grpc.services.service2.ScheduleListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.services.service2.ScheduleListResponse();
  }

  public static grpc.services.service2.ScheduleListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScheduleListResponse>
      PARSER = new com.google.protobuf.AbstractParser<ScheduleListResponse>() {
    @java.lang.Override
    public ScheduleListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ScheduleListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ScheduleListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScheduleListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.services.service2.ScheduleListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

