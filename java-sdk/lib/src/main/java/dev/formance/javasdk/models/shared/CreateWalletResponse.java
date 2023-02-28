package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateWalletResponse {
    @JsonProperty("data")
    public Wallet data;
    public CreateWalletResponse withData(Wallet data) {
        this.data = data;
        return this;
    }
    
}
