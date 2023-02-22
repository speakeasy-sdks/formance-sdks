package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class CreateTransactionRequest {
    public CreateTransactionPathParams pathParams;
    public CreateTransactionRequest withPathParams(CreateTransactionPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public CreateTransactionQueryParams queryParams;
    public CreateTransactionRequest withQueryParams(CreateTransactionQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.PostTransaction request;
    public CreateTransactionRequest withRequest(dev.formance.javasdk.models.shared.PostTransaction request) {
        this.request = request;
        return this;
    }
    
}
