package dev.formance.javasdk.models.operations;



public class GetFlowResponse {
    public String contentType;
    public GetFlowResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.Error error;
    public GetFlowResponse withError(dev.formance.javasdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.GetWorkflowResponse getWorkflowResponse;
    public GetFlowResponse withGetWorkflowResponse(dev.formance.javasdk.models.shared.GetWorkflowResponse getWorkflowResponse) {
        this.getWorkflowResponse = getWorkflowResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetFlowResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
