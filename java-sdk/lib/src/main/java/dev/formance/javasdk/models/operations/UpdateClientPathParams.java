package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class UpdateClientPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=clientId")
    public String clientId;
    public UpdateClientPathParams withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
}
