package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Monetary {
    @JsonProperty("amount")
    public Long amount;
    public Monetary withAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    @JsonProperty("asset")
    public String asset;
    public Monetary withAsset(String asset) {
        this.asset = asset;
        return this;
    }
}
