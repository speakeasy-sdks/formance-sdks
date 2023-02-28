package dev.formance.javasdk.models.operations;



public class UpdateMappingResponse {
    public String contentType;
    public UpdateMappingResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public UpdateMappingResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.MappingResponse mappingResponse;
    public UpdateMappingResponse withMappingResponse(dev.formance.javasdk.models.shared.MappingResponse mappingResponse) {
        this.mappingResponse = mappingResponse;
        return this;
    }
    
    public Integer statusCode;
    public UpdateMappingResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
