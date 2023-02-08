package dev.formance.javasdk.models.operations;



public class GetServerInfoResponse {
    public String contentType;
    public GetServerInfoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.ServerInfo serverInfo;
    public GetServerInfoResponse withServerInfo(dev.formance.javasdk.models.shared.ServerInfo serverInfo) {
        this.serverInfo = serverInfo;
        return this;
    }
    public Long statusCode;
    public GetServerInfoResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
