package dev.formance.javasdk.models.operations;



public class GetWorkflowOccurrenceResponse {
    public String contentType;
    public GetWorkflowOccurrenceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.Error error;
    public GetWorkflowOccurrenceResponse withError(dev.formance.javasdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.GetWorkflowOccurrenceResponse getWorkflowOccurrenceResponse;
    public GetWorkflowOccurrenceResponse withGetWorkflowOccurrenceResponse(dev.formance.javasdk.models.shared.GetWorkflowOccurrenceResponse getWorkflowOccurrenceResponse) {
        this.getWorkflowOccurrenceResponse = getWorkflowOccurrenceResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetWorkflowOccurrenceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
