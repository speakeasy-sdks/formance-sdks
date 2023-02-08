package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class ConfirmHoldRequest {
    public ConfirmHoldPathParams pathParams;
    public ConfirmHoldRequest withPathParams(ConfirmHoldPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.ConfirmHoldRequest request;
    public ConfirmHoldRequest withRequest(dev.formance.javasdk.models.shared.ConfirmHoldRequest request) {
        this.request = request;
        return this;
    }
}
