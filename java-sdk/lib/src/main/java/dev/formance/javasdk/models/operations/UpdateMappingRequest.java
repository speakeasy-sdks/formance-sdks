package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class UpdateMappingRequest {
    public UpdateMappingPathParams pathParams;
    public UpdateMappingRequest withPathParams(UpdateMappingPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.Mapping request;
    public UpdateMappingRequest withRequest(dev.formance.javasdk.models.shared.Mapping request) {
        this.request = request;
        return this;
    }
}
