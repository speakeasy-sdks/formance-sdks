package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class InstallConnectorRequest {
    public InstallConnectorPathParams pathParams;
    public InstallConnectorRequest withPathParams(InstallConnectorPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public Object request;
    public InstallConnectorRequest withRequest(Object request) {
        this.request = request;
        return this;
    }
    
}
