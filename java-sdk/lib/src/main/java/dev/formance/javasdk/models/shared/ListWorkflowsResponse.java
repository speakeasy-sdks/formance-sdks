package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class ListWorkflowsResponse {
    @JsonProperty("data")
    public Workflow[] data;
    public ListWorkflowsResponse withData(Workflow[] data) {
        this.data = data;
        return this;
    }
}
