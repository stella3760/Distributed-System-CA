// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service1.proto

package grpc.services.service1;

public final class Service1Impl {
  private Service1Impl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_ScheduleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_ScheduleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_ScheduleResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_ScheduleResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_LoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_LoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_LoginResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_LoginResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016service1.proto\022\010service1\032\016schedule.pro" +
      "to\"7\n\017ScheduleRequest\022$\n\010schedule\030\001 \001(\0132" +
      "\022.schedule.Schedule\"L\n\020ScheduleResponse\022" +
      "\022\n\nregistered\030\001 \001(\010\022$\n\010schedule\030\002 \001(\0132\022." +
      "schedule.Schedule\".\n\014LoginRequest\022\014\n\004nam" +
      "e\030\001 \001(\t\022\020\n\010position\030\002 \001(\t\"<\n\rLoginRespon" +
      "se\022\025\n\rauthenticated\030\001 \001(\010\022\024\n\014loginMessag" +
      "e\030\002 \001(\t2\232\001\n\017ScheduleService\022K\n\020registerS" +
      "chedule\022\031.service1.ScheduleRequest\032\032.ser" +
      "vice1.ScheduleResponse\"\000\022:\n\005login\022\026.serv" +
      "ice1.LoginRequest\032\027.service1.LoginRespon" +
      "se\"\000B(\n\026grpc.services.service1B\014Service1" +
      "ImplP\001b\006proto3"
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
          grpc.services.schedule.ScheduleOuterClass.getDescriptor(),
        }, assigner);
    internal_static_service1_ScheduleRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_service1_ScheduleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_ScheduleRequest_descriptor,
        new java.lang.String[] { "Schedule", });
    internal_static_service1_ScheduleResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_service1_ScheduleResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_ScheduleResponse_descriptor,
        new java.lang.String[] { "Registered", "Schedule", });
    internal_static_service1_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_service1_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_LoginRequest_descriptor,
        new java.lang.String[] { "Name", "Position", });
    internal_static_service1_LoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_service1_LoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_LoginResponse_descriptor,
        new java.lang.String[] { "Authenticated", "LoginMessage", });
    grpc.services.schedule.ScheduleOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}