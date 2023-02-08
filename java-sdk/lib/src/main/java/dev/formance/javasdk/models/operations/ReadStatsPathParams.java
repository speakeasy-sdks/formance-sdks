package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class ReadStatsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;
    public ReadStatsPathParams withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
}
