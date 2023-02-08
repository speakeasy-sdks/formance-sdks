package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class ListAccountsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;
    public ListAccountsPathParams withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
}
