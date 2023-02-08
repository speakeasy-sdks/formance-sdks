package dev.formance.javasdk.models.operations;



public class CreateSecretResponse {
    public String contentType;
    public CreateSecretResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.CreateSecretResponse createSecretResponse;
    public CreateSecretResponse withCreateSecretResponse(dev.formance.javasdk.models.shared.CreateSecretResponse createSecretResponse) {
        this.createSecretResponse = createSecretResponse;
        return this;
    }
    public Long statusCode;
    public CreateSecretResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
