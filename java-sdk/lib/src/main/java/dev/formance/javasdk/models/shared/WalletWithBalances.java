package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.formance.javasdk.utils.DateTimeDeserializer;
import dev.formance.javasdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class WalletWithBalances {
    @JsonProperty("balances")
    public WalletWithBalancesBalances balances;
    public WalletWithBalances withBalances(WalletWithBalancesBalances balances) {
        this.balances = balances;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;
    public WalletWithBalances withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public WalletWithBalances withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("ledger")
    public String ledger;
    public WalletWithBalances withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
    
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public WalletWithBalances withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public WalletWithBalances withName(String name) {
        this.name = name;
        return this;
    }
    
}
