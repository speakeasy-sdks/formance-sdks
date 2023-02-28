package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class ConnectorsStripeTransferRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.StripeTransferRequest request;
    public ConnectorsStripeTransferRequest withRequest(dev.formance.javasdk.models.shared.StripeTransferRequest request) {
        this.request = request;
        return this;
    }
    
}
