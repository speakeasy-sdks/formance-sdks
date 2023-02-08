package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class RevertTransactionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;
    public RevertTransactionPathParams withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=txid")
    public Long txid;
    public RevertTransactionPathParams withTxid(Long txid) {
        this.txid = txid;
        return this;
    }
}
