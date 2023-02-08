package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetHoldsResponse {
    @JsonProperty("cursor")
    public GetHoldsResponseCursor cursor;
    public GetHoldsResponse withCursor(GetHoldsResponseCursor cursor) {
        this.cursor = cursor;
        return this;
    }
}
