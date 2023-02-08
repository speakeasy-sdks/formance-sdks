package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class DebitWalletRequest {
    public DebitWalletPathParams pathParams;
    public DebitWalletRequest withPathParams(DebitWalletPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.DebitWalletRequest request;
    public DebitWalletRequest withRequest(dev.formance.javasdk.models.shared.DebitWalletRequest request) {
        this.request = request;
        return this;
    }
}
