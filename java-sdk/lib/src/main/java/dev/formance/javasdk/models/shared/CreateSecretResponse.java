package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateSecretResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public Secret data;
    public CreateSecretResponse withData(Secret data) {
        this.data = data;
        return this;
    }
    
}
