package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class LedgerStorage {
    @JsonProperty("driver")
    public String driver;
    public LedgerStorage withDriver(String driver) {
        this.driver = driver;
        return this;
    }
    @JsonProperty("ledgers")
    public String[] ledgers;
    public LedgerStorage withLedgers(String[] ledgers) {
        this.ledgers = ledgers;
        return this;
    }
}
