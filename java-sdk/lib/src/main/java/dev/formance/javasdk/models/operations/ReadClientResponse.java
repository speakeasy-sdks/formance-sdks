package dev.formance.javasdk.models.operations;



public class ReadClientResponse {
    public String contentType;
    public ReadClientResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ReadClientResponse readClientResponse;
    public ReadClientResponse withReadClientResponse(dev.formance.javasdk.models.shared.ReadClientResponse readClientResponse) {
        this.readClientResponse = readClientResponse;
        return this;
    }
    
    public Integer statusCode;
    public ReadClientResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
