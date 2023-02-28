package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AggregateBalancesResponse {
    @JsonProperty("data")
    public java.util.Map<String, Long> data;
    public AggregateBalancesResponse withData(java.util.Map<String, Long> data) {
        this.data = data;
        return this;
    }
    
}
