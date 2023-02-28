package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class GetBalancesPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;
    public GetBalancesPathParams withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
    
}
