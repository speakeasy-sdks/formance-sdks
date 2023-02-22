package dev.formance.javasdk.models.operations;



public class ActivateConfigResponse {
    public dev.formance.javasdk.models.shared.ConfigResponse configResponse;
    public ActivateConfigResponse withConfigResponse(dev.formance.javasdk.models.shared.ConfigResponse configResponse) {
        this.configResponse = configResponse;
        return this;
    }
    
    public String contentType;
    public ActivateConfigResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public ActivateConfigResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
