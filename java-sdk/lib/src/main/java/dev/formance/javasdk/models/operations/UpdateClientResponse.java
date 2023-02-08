package dev.formance.javasdk.models.operations;



public class UpdateClientResponse {
    public String contentType;
    public UpdateClientResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public UpdateClientResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public dev.formance.javasdk.models.shared.UpdateClientResponse updateClientResponse;
    public UpdateClientResponse withUpdateClientResponse(dev.formance.javasdk.models.shared.UpdateClientResponse updateClientResponse) {
        this.updateClientResponse = updateClientResponse;
        return this;
    }
}
