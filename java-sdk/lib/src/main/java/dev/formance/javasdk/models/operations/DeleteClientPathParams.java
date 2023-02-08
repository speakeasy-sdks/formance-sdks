package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class DeleteClientPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=clientId")
    public String clientId;
    public DeleteClientPathParams withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
}
