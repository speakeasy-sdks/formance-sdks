package dev.formance.javasdk.models.operations;



public class ReadConnectorConfigResponse {
    public dev.formance.javasdk.models.shared.ConnectorConfigResponse connectorConfigResponse;
    public ReadConnectorConfigResponse withConnectorConfigResponse(dev.formance.javasdk.models.shared.ConnectorConfigResponse connectorConfigResponse) {
        this.connectorConfigResponse = connectorConfigResponse;
        return this;
    }
    public String contentType;
    public ReadConnectorConfigResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public ReadConnectorConfigResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
