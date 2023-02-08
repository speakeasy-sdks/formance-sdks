package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetHoldResponse {
    @JsonProperty("data")
    public ExpandedDebitHold data;
    public GetHoldResponse withData(ExpandedDebitHold data) {
        this.data = data;
        return this;
    }
}
