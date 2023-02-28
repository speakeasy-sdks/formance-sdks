package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditWalletRequest {
    @JsonProperty("amount")
    public Monetary amount;
    public CreditWalletRequest withAmount(Monetary amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance")
    public String balance;
    public CreditWalletRequest withBalance(String balance) {
        this.balance = balance;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public CreditWalletRequest withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    public String reference;
    public CreditWalletRequest withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    @JsonProperty("sources")
    public Object[] sources;
    public CreditWalletRequest withSources(Object[] sources) {
        this.sources = sources;
        return this;
    }
    
}
