package dev.formance.javasdk.models.operations;



public class AddMetadataToAccountResponse {
    public String contentType;
    public AddMetadataToAccountResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public AddMetadataToAccountResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public AddMetadataToAccountResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
