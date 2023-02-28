package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Config {
    @JsonProperty("storage")
    public LedgerStorage storage;
    public Config withStorage(LedgerStorage storage) {
        this.storage = storage;
        return this;
    }
    
}
