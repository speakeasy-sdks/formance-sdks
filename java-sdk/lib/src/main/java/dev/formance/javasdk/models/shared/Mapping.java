package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class Mapping {
    @JsonProperty("contracts")
    public Contract[] contracts;
    public Mapping withContracts(Contract[] contracts) {
        this.contracts = contracts;
        return this;
    }
}
