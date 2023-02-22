package dev.formance.javasdk.models.operations;



public class ReadScopeResponse {
    public String contentType;
    public ReadScopeResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ReadScopeResponse readScopeResponse;
    public ReadScopeResponse withReadScopeResponse(dev.formance.javasdk.models.shared.ReadScopeResponse readScopeResponse) {
        this.readScopeResponse = readScopeResponse;
        return this;
    }
    
    public Integer statusCode;
    public ReadScopeResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
