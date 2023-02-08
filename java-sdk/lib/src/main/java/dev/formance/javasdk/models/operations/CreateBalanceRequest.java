package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class CreateBalanceRequest {
    public CreateBalancePathParams pathParams;
    public CreateBalanceRequest withPathParams(CreateBalancePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.CreateBalanceRequest request;
    public CreateBalanceRequest withRequest(dev.formance.javasdk.models.shared.CreateBalanceRequest request) {
        this.request = request;
        return this;
    }
}
