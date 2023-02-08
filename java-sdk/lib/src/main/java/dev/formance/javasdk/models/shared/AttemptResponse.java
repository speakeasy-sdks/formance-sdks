package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AttemptResponse {
    @JsonProperty("data")
    public Object data;
    public AttemptResponse withData(Object data) {
        this.data = data;
        return this;
    }
}
