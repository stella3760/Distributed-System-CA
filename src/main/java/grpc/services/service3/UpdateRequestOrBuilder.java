// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service3.proto

package grpc.services.service3;

public interface UpdateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:service3.UpdateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Field for the staff schedule to be updated
   * </pre>
   *
   * <code>.schedule.Schedule staff_schedule = 1;</code>
   */
  boolean hasStaffSchedule();
  /**
   * <pre>
   * Field for the staff schedule to be updated
   * </pre>
   *
   * <code>.schedule.Schedule staff_schedule = 1;</code>
   */
  grpc.services.schedule.Schedule getStaffSchedule();
  /**
   * <pre>
   * Field for the staff schedule to be updated
   * </pre>
   *
   * <code>.schedule.Schedule staff_schedule = 1;</code>
   */
  grpc.services.schedule.ScheduleOrBuilder getStaffScheduleOrBuilder();
}
