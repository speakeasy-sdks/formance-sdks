package dev.formance.javasdk.models.operations;



public class OrchestrationgetServerInfoResponse {
    public String contentType;
    public OrchestrationgetServerInfoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.Error error;
    public OrchestrationgetServerInfoResponse withError(dev.formance.javasdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ServerInfo serverInfo;
    public OrchestrationgetServerInfoResponse withServerInfo(dev.formance.javasdk.models.shared.ServerInfo serverInfo) {
        this.serverInfo = serverInfo;
        return this;
    }
    
    public Integer statusCode;
    public OrchestrationgetServerInfoResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
