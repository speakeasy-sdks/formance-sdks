package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetTransactionsResponse {
    @JsonProperty("cursor")
    public GetTransactionsResponseCursor cursor;
    public GetTransactionsResponse withCursor(GetTransactionsResponseCursor cursor) {
        this.cursor = cursor;
        return this;
    }
    
}
