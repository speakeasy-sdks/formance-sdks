package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DebitWalletResponse {
    @JsonProperty("data")
    public Hold data;
    public DebitWalletResponse withData(Hold data) {
        this.data = data;
        return this;
    }
    
}
