package dev.formance.javasdk.models.operations;



public class ChangeConfigSecretResponse {
    public dev.formance.javasdk.models.shared.ConfigResponse configResponse;
    public ChangeConfigSecretResponse withConfigResponse(dev.formance.javasdk.models.shared.ConfigResponse configResponse) {
        this.configResponse = configResponse;
        return this;
    }
    
    public String contentType;
    public ChangeConfigSecretResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public ChangeConfigSecretResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
