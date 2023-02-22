package dev.formance.javasdk.models.operations;



public class AddMetadataOnTransactionResponse {
    public String contentType;
    public AddMetadataOnTransactionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public AddMetadataOnTransactionResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public AddMetadataOnTransactionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
