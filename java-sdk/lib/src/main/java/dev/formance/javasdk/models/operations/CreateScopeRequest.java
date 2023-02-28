package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class CreateScopeRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.CreateScopeRequest request;
    public CreateScopeRequest withRequest(dev.formance.javasdk.models.shared.CreateScopeRequest request) {
        this.request = request;
        return this;
    }
    
}
