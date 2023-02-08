package dev.formance.javasdk.models.operations;



public class ReadUserResponse {
    public String contentType;
    public ReadUserResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.ReadUserResponse readUserResponse;
    public ReadUserResponse withReadUserResponse(dev.formance.javasdk.models.shared.ReadUserResponse readUserResponse) {
        this.readUserResponse = readUserResponse;
        return this;
    }
    public Long statusCode;
    public ReadUserResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
