package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class ChangeConfigSecretRequest {
    public ChangeConfigSecretPathParams pathParams;
    public ChangeConfigSecretRequest withPathParams(ChangeConfigSecretPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.ConfigChangeSecret request;
    public ChangeConfigSecretRequest withRequest(dev.formance.javasdk.models.shared.ConfigChangeSecret request) {
        this.request = request;
        return this;
    }
    
}
