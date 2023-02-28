package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class DeleteTransientScopePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scopeId")
    public String scopeId;
    public DeleteTransientScopePathParams withScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=transientScopeId")
    public String transientScopeId;
    public DeleteTransientScopePathParams withTransientScopeId(String transientScopeId) {
        this.transientScopeId = transientScopeId;
        return this;
    }
    
}
