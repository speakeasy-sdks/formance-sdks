package dev.formance.javasdk.models.operations;



public class PaymentsgetServerInfoResponse {
    public String contentType;
    public PaymentsgetServerInfoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ServerInfo serverInfo;
    public PaymentsgetServerInfoResponse withServerInfo(dev.formance.javasdk.models.shared.ServerInfo serverInfo) {
        this.serverInfo = serverInfo;
        return this;
    }
    
    public Integer statusCode;
    public PaymentsgetServerInfoResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
