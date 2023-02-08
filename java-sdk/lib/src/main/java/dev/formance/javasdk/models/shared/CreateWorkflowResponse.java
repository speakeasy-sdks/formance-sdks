package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateWorkflowResponse {
    @JsonProperty("data")
    public Workflow data;
    public CreateWorkflowResponse withData(Workflow data) {
        this.data = data;
        return this;
    }
}
