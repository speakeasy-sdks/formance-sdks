package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class CreateClientRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.CreateClientRequest request;
    public CreateClientRequest withRequest(dev.formance.javasdk.models.shared.CreateClientRequest request) {
        this.request = request;
        return this;
    }
    
}
