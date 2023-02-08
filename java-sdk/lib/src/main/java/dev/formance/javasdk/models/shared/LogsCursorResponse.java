package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogsCursorResponse {
    @JsonProperty("cursor")
    public LogsCursorResponseCursor cursor;
    public LogsCursorResponse withCursor(LogsCursorResponseCursor cursor) {
        this.cursor = cursor;
        return this;
    }
}
