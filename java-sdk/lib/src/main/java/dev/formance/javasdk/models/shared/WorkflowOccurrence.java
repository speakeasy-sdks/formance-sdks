package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.formance.javasdk.utils.DateTimeDeserializer;
import dev.formance.javasdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class WorkflowOccurrence {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;
    public WorkflowOccurrence withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public WorkflowOccurrence withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("statuses")
    public StageStatus[] statuses;
    public WorkflowOccurrence withStatuses(StageStatus[] statuses) {
        this.statuses = statuses;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updatedAt")
    public OffsetDateTime updatedAt;
    public WorkflowOccurrence withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonProperty("workflowID")
    public String workflowID;
    public WorkflowOccurrence withWorkflowID(String workflowID) {
        this.workflowID = workflowID;
        return this;
    }
    
}
