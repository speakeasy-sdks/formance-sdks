package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class SearchRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.Query request;
    public SearchRequest withRequest(dev.formance.javasdk.models.shared.Query request) {
        this.request = request;
        return this;
    }
    
}
