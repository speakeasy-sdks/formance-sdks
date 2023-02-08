package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatsResponse {
    @JsonProperty("data")
    public Stats data;
    public StatsResponse withData(Stats data) {
        this.data = data;
        return this;
    }
}
