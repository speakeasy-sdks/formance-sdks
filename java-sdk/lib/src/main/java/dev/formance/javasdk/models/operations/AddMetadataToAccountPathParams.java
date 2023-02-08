package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class AddMetadataToAccountPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=address")
    public String address;
    public AddMetadataToAccountPathParams withAddress(String address) {
        this.address = address;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;
    public AddMetadataToAccountPathParams withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
}
