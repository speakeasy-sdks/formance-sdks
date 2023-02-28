package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class CreditWalletRequest {
    public CreditWalletPathParams pathParams;
    public CreditWalletRequest withPathParams(CreditWalletPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.CreditWalletRequest request;
    public CreditWalletRequest withRequest(dev.formance.javasdk.models.shared.CreditWalletRequest request) {
        this.request = request;
        return this;
    }
    
}
