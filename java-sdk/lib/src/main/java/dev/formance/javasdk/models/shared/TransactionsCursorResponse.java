package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionsCursorResponse {
    @JsonProperty("cursor")
    public TransactionsCursorResponseCursor cursor;
    public TransactionsCursorResponse withCursor(TransactionsCursorResponseCursor cursor) {
        this.cursor = cursor;
        return this;
    }
}
