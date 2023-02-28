package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetWalletResponse {
    @JsonProperty("data")
    public WalletWithBalances data;
    public GetWalletResponse withData(WalletWithBalances data) {
        this.data = data;
        return this;
    }
    
}
