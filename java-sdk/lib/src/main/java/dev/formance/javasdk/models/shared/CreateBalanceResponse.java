package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateBalanceResponse {
    @JsonProperty("data")
    public Balance data;
    public CreateBalanceResponse withData(Balance data) {
        this.data = data;
        return this;
    }
    
}
