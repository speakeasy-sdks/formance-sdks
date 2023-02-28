package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.formance.javasdk.utils.DateTimeDeserializer;
import dev.formance.javasdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class StageStatus {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    public String error;
    public StageStatus withError(String error) {
        this.error = error;
        return this;
    }
    
    @JsonProperty("occurrenceID")
    public String occurrenceID;
    public StageStatus withOccurrenceID(String occurrenceID) {
        this.occurrenceID = occurrenceID;
        return this;
    }
    
    @JsonProperty("stage")
    public Double stage;
    public StageStatus withStage(Double stage) {
        this.stage = stage;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("startedAt")
    public OffsetDateTime startedAt;
    public StageStatus withStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("terminatedAt")
    public OffsetDateTime terminatedAt;
    public StageStatus withTerminatedAt(OffsetDateTime terminatedAt) {
        this.terminatedAt = terminatedAt;
        return this;
    }
    
}
