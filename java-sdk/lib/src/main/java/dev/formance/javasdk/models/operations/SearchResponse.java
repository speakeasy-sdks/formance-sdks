package dev.formance.javasdk.models.operations;



public class SearchResponse {
    public String contentType;
    public SearchResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.Response response;
    public SearchResponse withResponse(dev.formance.javasdk.models.shared.Response response) {
        this.response = response;
        return this;
    }
    
    public Integer statusCode;
    public SearchResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
