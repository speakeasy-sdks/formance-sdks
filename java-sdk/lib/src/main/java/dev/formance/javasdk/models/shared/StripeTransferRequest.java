package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StripeTransferRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    public Long amount;
    public StripeTransferRequest withAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("asset")
    public String asset;
    public StripeTransferRequest withAsset(String asset) {
        this.asset = asset;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destination")
    public String destination;
    public StripeTransferRequest withDestination(String destination) {
        this.destination = destination;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public StripeTransferRequest withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
}
