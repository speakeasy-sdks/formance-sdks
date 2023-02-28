package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigsResponse {
    @JsonProperty("cursor")
    public ConfigsResponseCursor cursor;
    public ConfigsResponse withCursor(ConfigsResponseCursor cursor) {
        this.cursor = cursor;
        return this;
    }
    
}
