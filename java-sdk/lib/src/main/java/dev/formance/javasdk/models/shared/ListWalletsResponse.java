package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListWalletsResponse {
    @JsonProperty("cursor")
    public ListWalletsResponseCursor cursor;
    public ListWalletsResponse withCursor(ListWalletsResponseCursor cursor) {
        this.cursor = cursor;
        return this;
    }
    
}
