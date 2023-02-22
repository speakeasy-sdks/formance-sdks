package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorsConfigsResponseDataConnector {
    @JsonProperty("key")
    public ConnectorsConfigsResponseDataConnectorKey key;
    public ConnectorsConfigsResponseDataConnector withKey(ConnectorsConfigsResponseDataConnectorKey key) {
        this.key = key;
        return this;
    }
    
}
