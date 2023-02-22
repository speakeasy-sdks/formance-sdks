package dev.formance.javasdk.models.operations;



public class InsertConfigResponse {
    public dev.formance.javasdk.models.shared.ConfigResponse configResponse;
    public InsertConfigResponse withConfigResponse(dev.formance.javasdk.models.shared.ConfigResponse configResponse) {
        this.configResponse = configResponse;
        return this;
    }
    
    public String contentType;
    public InsertConfigResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public InsertConfigResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public String insertConfig400TextPlainString;
    public InsertConfigResponse withInsertConfig400TextPlainString(String insertConfig400TextPlainString) {
        this.insertConfig400TextPlainString = insertConfig400TextPlainString;
        return this;
    }
    
}
