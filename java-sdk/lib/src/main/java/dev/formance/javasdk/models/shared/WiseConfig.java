package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WiseConfig {
    @JsonProperty("apiKey")
    public String apiKey;
    public WiseConfig withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}
