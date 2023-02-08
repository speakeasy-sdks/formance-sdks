package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class CreateWorkflowRequest {
    @JsonProperty("stages")
    public java.util.Map<String, Object>[] stages;
    public CreateWorkflowRequest withStages(java.util.Map<String, Object>[] stages) {
        this.stages = stages;
        return this;
    }
}
