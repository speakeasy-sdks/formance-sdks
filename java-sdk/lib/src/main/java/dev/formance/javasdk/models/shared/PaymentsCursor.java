package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentsCursor {
    @JsonProperty("cursor")
    public PaymentsCursorCursor cursor;
    public PaymentsCursor withCursor(PaymentsCursorCursor cursor) {
        this.cursor = cursor;
        return this;
    }
}
