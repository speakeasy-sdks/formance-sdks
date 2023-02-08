package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListBalancesResponse {
    @JsonProperty("cursor")
    public ListBalancesResponseCursor cursor;
    public ListBalancesResponse withCursor(ListBalancesResponseCursor cursor) {
        this.cursor = cursor;
        return this;
    }
}
