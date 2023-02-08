package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class CreateTransactionsRequest {
    public CreateTransactionsPathParams pathParams;
    public CreateTransactionsRequest withPathParams(CreateTransactionsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.Transactions request;
    public CreateTransactionsRequest withRequest(dev.formance.javasdk.models.shared.Transactions request) {
        this.request = request;
        return this;
    }
}
