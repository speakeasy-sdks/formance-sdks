package dev.formance.javasdk.models.operations;



public class ListFlowsResponse {
    public String contentType;
    public ListFlowsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.Error error;
    public ListFlowsResponse withError(dev.formance.javasdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ListWorkflowsResponse listWorkflowsResponse;
    public ListFlowsResponse withListWorkflowsResponse(dev.formance.javasdk.models.shared.ListWorkflowsResponse listWorkflowsResponse) {
        this.listWorkflowsResponse = listWorkflowsResponse;
        return this;
    }
    
    public Integer statusCode;
    public ListFlowsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
