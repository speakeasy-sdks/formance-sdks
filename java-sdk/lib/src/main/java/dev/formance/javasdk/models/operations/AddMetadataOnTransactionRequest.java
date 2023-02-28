package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class AddMetadataOnTransactionRequest {
    public AddMetadataOnTransactionPathParams pathParams;
    public AddMetadataOnTransactionRequest withPathParams(AddMetadataOnTransactionPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public AddMetadataOnTransactionRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
    
}
