// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

public interface WorkflowNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.WorkflowNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The name of the node.
   * </pre>
   *
   * <code>string step_id = 1;</code>
   */
  java.lang.String getStepId();
  /**
   * <pre>
   * Output only. The name of the node.
   * </pre>
   *
   * <code>string step_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getStepIdBytes();

  /**
   * <pre>
   * Output only. Node's prerequisite nodes.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 2;</code>
   */
  java.util.List<java.lang.String>
      getPrerequisiteStepIdsList();
  /**
   * <pre>
   * Output only. Node's prerequisite nodes.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 2;</code>
   */
  int getPrerequisiteStepIdsCount();
  /**
   * <pre>
   * Output only. Node's prerequisite nodes.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 2;</code>
   */
  java.lang.String getPrerequisiteStepIds(int index);
  /**
   * <pre>
   * Output only. Node's prerequisite nodes.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 2;</code>
   */
  com.google.protobuf.ByteString
      getPrerequisiteStepIdsBytes(int index);

  /**
   * <pre>
   * Output only. The job id; populated after the node enters RUNNING state.
   * </pre>
   *
   * <code>string job_id = 3;</code>
   */
  java.lang.String getJobId();
  /**
   * <pre>
   * Output only. The job id; populated after the node enters RUNNING state.
   * </pre>
   *
   * <code>string job_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getJobIdBytes();

  /**
   * <pre>
   * Output only. The node state.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.WorkflowNode.NodeState state = 5;</code>
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The node state.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.WorkflowNode.NodeState state = 5;</code>
   */
  com.google.cloud.dataproc.v1beta2.WorkflowNode.NodeState getState();

  /**
   * <pre>
   * Output only. The error detail.
   * </pre>
   *
   * <code>string error = 6;</code>
   */
  java.lang.String getError();
  /**
   * <pre>
   * Output only. The error detail.
   * </pre>
   *
   * <code>string error = 6;</code>
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
