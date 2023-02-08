package dev.formance.javasdk.models.operations;



public class GetMappingResponse {
    public String contentType;
    public GetMappingResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public GetMappingResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    public dev.formance.javasdk.models.shared.MappingResponse mappingResponse;
    public GetMappingResponse withMappingResponse(dev.formance.javasdk.models.shared.MappingResponse mappingResponse) {
        this.mappingResponse = mappingResponse;
        return this;
    }
    public Long statusCode;
    public GetMappingResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
