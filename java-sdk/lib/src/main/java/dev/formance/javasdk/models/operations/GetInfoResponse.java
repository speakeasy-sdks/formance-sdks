package dev.formance.javasdk.models.operations;



public class GetInfoResponse {
    public dev.formance.javasdk.models.shared.ConfigInfoResponse configInfoResponse;
    public GetInfoResponse withConfigInfoResponse(dev.formance.javasdk.models.shared.ConfigInfoResponse configInfoResponse) {
        this.configInfoResponse = configInfoResponse;
        return this;
    }
    
    public String contentType;
    public GetInfoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public GetInfoResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetInfoResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
