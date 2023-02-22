package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class AddScopeToClientPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=clientId")
    public String clientId;
    public AddScopeToClientPathParams withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scopeId")
    public String scopeId;
    public AddScopeToClientPathParams withScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    
}
