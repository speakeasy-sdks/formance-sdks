package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionResponse {
    @JsonProperty("data")
    public Transaction data;
    public TransactionResponse withData(Transaction data) {
        this.data = data;
        return this;
    }
    
}
