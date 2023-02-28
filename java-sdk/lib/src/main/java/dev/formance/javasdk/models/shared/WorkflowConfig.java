package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WorkflowConfig {
    @JsonProperty("stages")
    public java.util.Map<String, Object>[] stages;
    public WorkflowConfig withStages(java.util.Map<String, Object>[] stages) {
        this.stages = stages;
        return this;
    }
    
}
