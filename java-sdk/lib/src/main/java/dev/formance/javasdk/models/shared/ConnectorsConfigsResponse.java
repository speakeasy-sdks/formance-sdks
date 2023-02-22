package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorsConfigsResponse {
    @JsonProperty("data")
    public ConnectorsConfigsResponseData data;
    public ConnectorsConfigsResponse withData(ConnectorsConfigsResponseData data) {
        this.data = data;
        return this;
    }
    
}
