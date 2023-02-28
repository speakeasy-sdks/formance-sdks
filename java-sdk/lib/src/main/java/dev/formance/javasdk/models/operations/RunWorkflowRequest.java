package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class RunWorkflowRequest {
    public RunWorkflowPathParams pathParams;
    public RunWorkflowRequest withPathParams(RunWorkflowPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public RunWorkflowQueryParams queryParams;
    public RunWorkflowRequest withQueryParams(RunWorkflowQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, String> request;
    public RunWorkflowRequest withRequest(java.util.Map<String, String> request) {
        this.request = request;
        return this;
    }
    
}
