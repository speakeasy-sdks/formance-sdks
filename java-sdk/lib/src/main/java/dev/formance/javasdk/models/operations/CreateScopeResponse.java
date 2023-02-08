package dev.formance.javasdk.models.operations;



public class CreateScopeResponse {
    public String contentType;
    public CreateScopeResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.CreateScopeResponse createScopeResponse;
    public CreateScopeResponse withCreateScopeResponse(dev.formance.javasdk.models.shared.CreateScopeResponse createScopeResponse) {
        this.createScopeResponse = createScopeResponse;
        return this;
    }
    public Long statusCode;
    public CreateScopeResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
