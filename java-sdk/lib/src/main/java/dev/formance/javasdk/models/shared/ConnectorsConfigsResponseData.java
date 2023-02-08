package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorsConfigsResponseData {
    @JsonProperty("connector")
    public ConnectorsConfigsResponseDataConnector connector;
    public ConnectorsConfigsResponseData withConnector(ConnectorsConfigsResponseDataConnector connector) {
        this.connector = connector;
        return this;
    }
}
