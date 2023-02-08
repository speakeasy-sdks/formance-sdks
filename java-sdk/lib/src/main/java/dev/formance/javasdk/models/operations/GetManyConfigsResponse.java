package dev.formance.javasdk.models.operations;



public class GetManyConfigsResponse {
    public dev.formance.javasdk.models.shared.ConfigsResponse configsResponse;
    public GetManyConfigsResponse withConfigsResponse(dev.formance.javasdk.models.shared.ConfigsResponse configsResponse) {
        this.configsResponse = configsResponse;
        return this;
    }
    public String contentType;
    public GetManyConfigsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetManyConfigsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
