package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class UpdateClientRequest {
    public UpdateClientPathParams pathParams;
    public UpdateClientRequest withPathParams(UpdateClientPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.UpdateClientRequest request;
    public UpdateClientRequest withRequest(dev.formance.javasdk.models.shared.UpdateClientRequest request) {
        this.request = request;
        return this;
    }
}
