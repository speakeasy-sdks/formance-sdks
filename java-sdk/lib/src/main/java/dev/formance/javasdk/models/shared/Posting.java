package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Posting {
    @JsonProperty("amount")
    public Long amount;
    public Posting withAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    @JsonProperty("asset")
    public String asset;
    public Posting withAsset(String asset) {
        this.asset = asset;
        return this;
    }
    @JsonProperty("destination")
    public String destination;
    public Posting withDestination(String destination) {
        this.destination = destination;
        return this;
    }
    @JsonProperty("source")
    public String source;
    public Posting withSource(String source) {
        this.source = source;
        return this;
    }
}
