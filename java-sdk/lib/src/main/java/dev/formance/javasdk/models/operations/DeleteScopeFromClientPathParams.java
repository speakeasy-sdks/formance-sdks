package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class DeleteScopeFromClientPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=clientId")
    public String clientId;
    public DeleteScopeFromClientPathParams withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scopeId")
    public String scopeId;
    public DeleteScopeFromClientPathParams withScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    
}
