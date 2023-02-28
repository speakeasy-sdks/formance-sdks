package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class CreateSecretRequest {
    public CreateSecretPathParams pathParams;
    public CreateSecretRequest withPathParams(CreateSecretPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.CreateSecretRequest request;
    public CreateSecretRequest withRequest(dev.formance.javasdk.models.shared.CreateSecretRequest request) {
        this.request = request;
        return this;
    }
    
}
