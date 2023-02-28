package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetBalanceResponse {
    @JsonProperty("data")
    public BalanceWithAssets data;
    public GetBalanceResponse withData(BalanceWithAssets data) {
        this.data = data;
        return this;
    }
    
}
