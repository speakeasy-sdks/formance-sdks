package dev.formance.javasdk.models.operations;



public class ListConfigsAvailableConnectorsResponse {
    public dev.formance.javasdk.models.shared.ConnectorsConfigsResponse connectorsConfigsResponse;
    public ListConfigsAvailableConnectorsResponse withConnectorsConfigsResponse(dev.formance.javasdk.models.shared.ConnectorsConfigsResponse connectorsConfigsResponse) {
        this.connectorsConfigsResponse = connectorsConfigsResponse;
        return this;
    }
    public String contentType;
    public ListConfigsAvailableConnectorsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public ListConfigsAvailableConnectorsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
