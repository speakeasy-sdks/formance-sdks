package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorsResponse {
    @JsonProperty("data")
    public ConnectorsResponseData[] data;
    public ConnectorsResponse withData(ConnectorsResponseData[] data) {
        this.data = data;
        return this;
    }
    
}
