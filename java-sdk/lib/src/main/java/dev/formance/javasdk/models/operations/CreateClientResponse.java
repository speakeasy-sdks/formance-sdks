package dev.formance.javasdk.models.operations;



public class CreateClientResponse {
    public String contentType;
    public CreateClientResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.CreateClientResponse createClientResponse;
    public CreateClientResponse withCreateClientResponse(dev.formance.javasdk.models.shared.CreateClientResponse createClientResponse) {
        this.createClientResponse = createClientResponse;
        return this;
    }
    public Long statusCode;
    public CreateClientResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
