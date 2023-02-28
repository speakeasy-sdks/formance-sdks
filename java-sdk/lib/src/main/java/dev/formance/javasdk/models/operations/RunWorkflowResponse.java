package dev.formance.javasdk.models.operations;



public class RunWorkflowResponse {
    public String contentType;
    public RunWorkflowResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.Error error;
    public RunWorkflowResponse withError(dev.formance.javasdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.RunWorkflowResponse runWorkflowResponse;
    public RunWorkflowResponse withRunWorkflowResponse(dev.formance.javasdk.models.shared.RunWorkflowResponse runWorkflowResponse) {
        this.runWorkflowResponse = runWorkflowResponse;
        return this;
    }
    
    public Integer statusCode;
    public RunWorkflowResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
