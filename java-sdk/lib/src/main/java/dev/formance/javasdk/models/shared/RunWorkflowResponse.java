package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RunWorkflowResponse {
    @JsonProperty("data")
    public WorkflowOccurrence data;
    public RunWorkflowResponse withData(WorkflowOccurrence data) {
        this.data = data;
        return this;
    }
    
}
