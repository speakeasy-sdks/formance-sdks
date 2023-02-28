package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetWorkflowResponse {
    @JsonProperty("data")
    public Workflow data;
    public GetWorkflowResponse withData(Workflow data) {
        this.data = data;
        return this;
    }
    
}
