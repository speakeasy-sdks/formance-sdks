package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorConfigResponse {
    @JsonProperty("data")
    public Object data;
    public ConnectorConfigResponse withData(Object data) {
        this.data = data;
        return this;
    }
}
