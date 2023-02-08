package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class CreateWorkflowRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.CreateWorkflowRequest request;
    public CreateWorkflowRequest withRequest(dev.formance.javasdk.models.shared.CreateWorkflowRequest request) {
        this.request = request;
        return this;
    }
}
