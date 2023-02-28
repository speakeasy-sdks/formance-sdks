package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class ReadClientPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=clientId")
    public String clientId;
    public ReadClientPathParams withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
}
