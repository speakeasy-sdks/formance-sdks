package dev.formance.javasdk.models.operations;



public class UpdateScopeResponse {
    public String contentType;
    public UpdateScopeResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public UpdateScopeResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public dev.formance.javasdk.models.shared.UpdateScopeResponse updateScopeResponse;
    public UpdateScopeResponse withUpdateScopeResponse(dev.formance.javasdk.models.shared.UpdateScopeResponse updateScopeResponse) {
        this.updateScopeResponse = updateScopeResponse;
        return this;
    }
}
