package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class UpdateScopePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scopeId")
    public String scopeId;
    public UpdateScopePathParams withScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    
}
