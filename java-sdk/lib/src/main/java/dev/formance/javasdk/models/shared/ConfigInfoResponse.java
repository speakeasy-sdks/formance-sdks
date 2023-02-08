package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigInfoResponse {
    @JsonProperty("data")
    public ConfigInfo data;
    public ConfigInfoResponse withData(ConfigInfo data) {
        this.data = data;
        return this;
    }
}
