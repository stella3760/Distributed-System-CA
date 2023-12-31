// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service3.proto

package grpc.services.service3;

public interface AvailabilityResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:service3.AvailabilityResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Field indicating if staff is available during the specified time period
   * </pre>
   *
   * <code>bool is_available = 1;</code>
   */
  boolean getIsAvailable();

  /**
   * <pre>
   * Field for the working hours of the staff during the specified time period
   * </pre>
   *
   * <code>int32 working_hours = 2;</code>
   */
  int getWorkingHours();

  /**
   * <pre>
   * Field containing the schedule of the staff during the specified time period
   * </pre>
   *
   * <code>.schedule.Schedule schedule = 3;</code>
   */
  boolean hasSchedule();
  /**
   * <pre>
   * Field containing the schedule of the staff during the specified time period
   * </pre>
   *
   * <code>.schedule.Schedule schedule = 3;</code>
   */
  grpc.services.schedule.Schedule getSchedule();
  /**
   * <pre>
   * Field containing the schedule of the staff during the specified time period
   * </pre>
   *
   * <code>.schedule.Schedule schedule = 3;</code>
   */
  grpc.services.schedule.ScheduleOrBuilder getScheduleOrBuilder();
}
