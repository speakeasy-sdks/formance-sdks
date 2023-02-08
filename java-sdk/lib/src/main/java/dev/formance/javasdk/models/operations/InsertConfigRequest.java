package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class InsertConfigRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.ConfigUser request;
    public InsertConfigRequest withRequest(dev.formance.javasdk.models.shared.ConfigUser request) {
        this.request = request;
        return this;
    }
}
