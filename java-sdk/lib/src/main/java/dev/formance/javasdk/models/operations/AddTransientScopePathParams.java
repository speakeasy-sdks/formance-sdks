package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class AddTransientScopePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scopeId")
    public String scopeId;
    public AddTransientScopePathParams withScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=transientScopeId")
    public String transientScopeId;
    public AddTransientScopePathParams withTransientScopeId(String transientScopeId) {
        this.transientScopeId = transientScopeId;
        return this;
    }
}
