package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class CreateSecretRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public CreateSecretRequest withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public CreateSecretRequest withName(String name) {
        this.name = name;
        return this;
    }
}
