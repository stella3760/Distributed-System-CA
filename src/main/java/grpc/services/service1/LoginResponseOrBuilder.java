// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service1.proto

package grpc.services.service1;

public interface LoginResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:service1.LoginResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Field indicating if the login is authenticated
   * </pre>
   *
   * <code>bool authenticated = 1;</code>
   */
  boolean getAuthenticated();

  /**
   * <pre>
   * Field containing the login message
   * </pre>
   *
   * <code>string loginMessage = 2;</code>
   */
  java.lang.String getLoginMessage();
  /**
   * <pre>
   * Field containing the login message
   * </pre>
   *
   * <code>string loginMessage = 2;</code>
   */
  com.google.protobuf.ByteString
      getLoginMessageBytes();
}
