package dev.formance.javasdk.models.operations;



public class DeactivateConfigResponse {
    public dev.formance.javasdk.models.shared.ConfigResponse configResponse;
    public DeactivateConfigResponse withConfigResponse(dev.formance.javasdk.models.shared.ConfigResponse configResponse) {
        this.configResponse = configResponse;
        return this;
    }
    public String contentType;
    public DeactivateConfigResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeactivateConfigResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
