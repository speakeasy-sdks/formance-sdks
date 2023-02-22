package dev.formance.javasdk.models.operations;



public class SearchgetServerInfoResponse {
    public String contentType;
    public SearchgetServerInfoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ServerInfo serverInfo;
    public SearchgetServerInfoResponse withServerInfo(dev.formance.javasdk.models.shared.ServerInfo serverInfo) {
        this.serverInfo = serverInfo;
        return this;
    }
    
    public Integer statusCode;
    public SearchgetServerInfoResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
