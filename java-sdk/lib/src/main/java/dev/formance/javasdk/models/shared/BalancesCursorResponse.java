package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BalancesCursorResponse {
    @JsonProperty("cursor")
    public BalancesCursorResponseCursor cursor;
    public BalancesCursorResponse withCursor(BalancesCursorResponseCursor cursor) {
        this.cursor = cursor;
        return this;
    }
}
