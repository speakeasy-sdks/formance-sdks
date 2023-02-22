package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class UpdateScopeRequest {
    public UpdateScopePathParams pathParams;
    public UpdateScopeRequest withPathParams(UpdateScopePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.UpdateScopeRequest request;
    public UpdateScopeRequest withRequest(dev.formance.javasdk.models.shared.UpdateScopeRequest request) {
        this.request = request;
        return this;
    }
    
}
