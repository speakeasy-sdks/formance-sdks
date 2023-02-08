package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountsCursorResponse {
    @JsonProperty("cursor")
    public AccountsCursorResponseCursor cursor;
    public AccountsCursorResponse withCursor(AccountsCursorResponseCursor cursor) {
        this.cursor = cursor;
        return this;
    }
}
