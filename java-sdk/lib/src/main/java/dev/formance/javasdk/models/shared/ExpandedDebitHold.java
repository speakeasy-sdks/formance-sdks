package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ExpandedDebitHold {
    @JsonProperty("description")
    public String description;
    public ExpandedDebitHold withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destination")
    public Object destination;
    public ExpandedDebitHold withDestination(Object destination) {
        this.destination = destination;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public ExpandedDebitHold withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public ExpandedDebitHold withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonProperty("originalAmount")
    public Long originalAmount;
    public ExpandedDebitHold withOriginalAmount(Long originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }
    
    @JsonProperty("remaining")
    public Long remaining;
    public ExpandedDebitHold withRemaining(Long remaining) {
        this.remaining = remaining;
        return this;
    }
    
    @JsonProperty("walletID")
    public String walletID;
    public ExpandedDebitHold withWalletID(String walletID) {
        this.walletID = walletID;
        return this;
    }
    
}
