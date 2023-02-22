package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class AddMetadataToAccountRequest {
    public AddMetadataToAccountPathParams pathParams;
    public AddMetadataToAccountRequest withPathParams(AddMetadataToAccountPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public AddMetadataToAccountRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
    
}
