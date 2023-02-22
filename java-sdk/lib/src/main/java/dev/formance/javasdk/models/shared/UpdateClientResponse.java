package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateClientResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public Client data;
    public UpdateClientResponse withData(Client data) {
        this.data = data;
        return this;
    }
    
}
