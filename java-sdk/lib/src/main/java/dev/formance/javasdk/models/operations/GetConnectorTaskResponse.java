package dev.formance.javasdk.models.operations;



public class GetConnectorTaskResponse {
    public String contentType;
    public GetConnectorTaskResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public GetConnectorTaskResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.TaskResponse taskResponse;
    public GetConnectorTaskResponse withTaskResponse(dev.formance.javasdk.models.shared.TaskResponse taskResponse) {
        this.taskResponse = taskResponse;
        return this;
    }
    
}
