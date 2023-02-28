package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class DeleteScopePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scopeId")
    public String scopeId;
    public DeleteScopePathParams withScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    
}
