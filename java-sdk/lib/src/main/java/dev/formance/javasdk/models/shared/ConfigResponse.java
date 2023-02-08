package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigResponse {
    @JsonProperty("data")
    public Object data;
    public ConfigResponse withData(Object data) {
        this.data = data;
        return this;
    }
}
