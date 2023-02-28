package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionsResponse {
    @JsonProperty("data")
    public Transaction[] data;
    public TransactionsResponse withData(Transaction[] data) {
        this.data = data;
        return this;
    }
    
}
