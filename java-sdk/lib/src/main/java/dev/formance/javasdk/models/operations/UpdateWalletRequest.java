package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class UpdateWalletRequest {
    public UpdateWalletPathParams pathParams;
    public UpdateWalletRequest withPathParams(UpdateWalletPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public UpdateWalletRequestBody request;
    public UpdateWalletRequest withRequest(UpdateWalletRequestBody request) {
        this.request = request;
        return this;
    }
}
