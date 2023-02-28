package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TasksCursor {
    @JsonProperty("cursor")
    public TasksCursorCursor cursor;
    public TasksCursor withCursor(TasksCursorCursor cursor) {
        this.cursor = cursor;
        return this;
    }
    
}
