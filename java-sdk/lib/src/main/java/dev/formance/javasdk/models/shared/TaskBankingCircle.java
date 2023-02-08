package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.formance.javasdk.utils.DateTimeDeserializer;
import dev.formance.javasdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class TaskBankingCircle {
    @JsonProperty("connectorId")
    public String connectorId;
    public TaskBankingCircle withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;
    public TaskBankingCircle withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("descriptor")
    public TaskBankingCircleDescriptor descriptor;
    public TaskBankingCircle withDescriptor(TaskBankingCircleDescriptor descriptor) {
        this.descriptor = descriptor;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    public String error;
    public TaskBankingCircle withError(String error) {
        this.error = error;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public TaskBankingCircle withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("state")
    public java.util.Map<String, Object> state;
    public TaskBankingCircle withState(java.util.Map<String, Object> state) {
        this.state = state;
        return this;
    }
    @JsonProperty("status")
    public PaymentStatusEnum status;
    public TaskBankingCircle withStatus(PaymentStatusEnum status) {
        this.status = status;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updatedAt")
    public OffsetDateTime updatedAt;
    public TaskBankingCircle withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
