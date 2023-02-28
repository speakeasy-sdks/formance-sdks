package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class AddMetadataOnTransactionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;
    public AddMetadataOnTransactionPathParams withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=txid")
    public Long txid;
    public AddMetadataOnTransactionPathParams withTxid(Long txid) {
        this.txid = txid;
        return this;
    }
    
}
