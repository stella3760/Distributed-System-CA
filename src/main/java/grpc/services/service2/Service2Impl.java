// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package grpc.services.service2;

public final class Service2Impl {
  private Service2Impl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service2_ScheduleListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service2_ScheduleListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service2_ScheduleListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service2_ScheduleListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service2_ScheduleChangeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service2_ScheduleChangeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service2_ScheduleChangeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service2_ScheduleChangeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016service2.proto\022\010service2\032\016schedule.pro" +
      "to\"C\n\023ScheduleListRequest\022\014\n\004name\030\001 \001(\t\022" +
      "\020\n\010position\030\002 \001(\t\022\014\n\004date\030\003 \001(\t\"<\n\024Sched" +
      "uleListResponse\022$\n\010schedule\030\001 \003(\0132\022.sche" +
      "dule.Schedule\"k\n\025ScheduleChangeRequest\022\014" +
      "\n\004name\030\001 \001(\t\022\020\n\010position\030\002 \001(\t\022\014\n\004date\030\003" +
      " \001(\t\022\022\n\nstart_time\030\004 \001(\t\022\020\n\010end_time\030\005 \001" +
      "(\t\":\n\026ScheduleChangeResponse\022\017\n\007success\030" +
      "\001 \001(\010\022\017\n\007message\030\002 \001(\t2\275\001\n\017ScheduleServi" +
      "ce\022Q\n\014listSchedule\022\035.service2.ScheduleLi" +
      "stRequest\032\036.service2.ScheduleListRespons" +
      "e\"\0000\001\022W\n\016changeSchedule\022\037.service2.Sched" +
      "uleChangeRequest\032 .service2.ScheduleChan" +
      "geResponse\"\000(\001B(\n\026grpc.services.service2" +
      "B\014Service2ImplP\001b\006proto3"
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
    internal_static_service2_ScheduleListRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_service2_ScheduleListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service2_ScheduleListRequest_descriptor,
        new java.lang.String[] { "Name", "Position", "Date", });
    internal_static_service2_ScheduleListResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_service2_ScheduleListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service2_ScheduleListResponse_descriptor,
        new java.lang.String[] { "Schedule", });
    internal_static_service2_ScheduleChangeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_service2_ScheduleChangeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service2_ScheduleChangeRequest_descriptor,
        new java.lang.String[] { "Name", "Position", "Date", "StartTime", "EndTime", });
    internal_static_service2_ScheduleChangeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_service2_ScheduleChangeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service2_ScheduleChangeResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    grpc.services.schedule.ScheduleOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}