package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class RunScriptRequest {
    public RunScriptPathParams pathParams;
    public RunScriptRequest withPathParams(RunScriptPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public RunScriptQueryParams queryParams;
    public RunScriptRequest withQueryParams(RunScriptQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.formance.javasdk.models.shared.Script request;
    public RunScriptRequest withRequest(dev.formance.javasdk.models.shared.Script request) {
        this.request = request;
        return this;
    }
    
}
