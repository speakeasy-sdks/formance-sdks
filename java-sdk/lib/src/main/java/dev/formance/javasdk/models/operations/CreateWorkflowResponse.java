package dev.formance.javasdk.models.operations;



public class CreateWorkflowResponse {
    public String contentType;
    public CreateWorkflowResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.CreateWorkflowResponse createWorkflowResponse;
    public CreateWorkflowResponse withCreateWorkflowResponse(dev.formance.javasdk.models.shared.CreateWorkflowResponse createWorkflowResponse) {
        this.createWorkflowResponse = createWorkflowResponse;
        return this;
    }
    public dev.formance.javasdk.models.shared.Error error;
    public CreateWorkflowResponse withError(dev.formance.javasdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public CreateWorkflowResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
