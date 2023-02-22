package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountsCursor {
    @JsonProperty("cursor")
    public AccountsCursorCursor cursor;
    public AccountsCursor withCursor(AccountsCursorCursor cursor) {
        this.cursor = cursor;
        return this;
    }
    
}
