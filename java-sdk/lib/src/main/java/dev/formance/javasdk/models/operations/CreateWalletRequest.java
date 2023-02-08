package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class CreateWalletRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.CreateWalletRequest request;
    public CreateWalletRequest withRequest(dev.formance.javasdk.models.shared.CreateWalletRequest request) {
        this.request = request;
        return this;
    }
}
