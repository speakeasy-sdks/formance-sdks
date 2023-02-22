package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class GetAccountPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=address")
    public String address;
    public GetAccountPathParams withAddress(String address) {
        this.address = address;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;
    public GetAccountPathParams withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
    
}
