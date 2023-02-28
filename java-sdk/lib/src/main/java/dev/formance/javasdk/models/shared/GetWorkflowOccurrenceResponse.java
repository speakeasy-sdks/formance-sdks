package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetWorkflowOccurrenceResponse {
    @JsonProperty("data")
    public WorkflowOccurrence data;
    public GetWorkflowOccurrenceResponse withData(WorkflowOccurrence data) {
        this.data = data;
        return this;
    }
    
}
