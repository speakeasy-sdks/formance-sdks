package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class ReadScopePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scopeId")
    public String scopeId;
    public ReadScopePathParams withScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
}
