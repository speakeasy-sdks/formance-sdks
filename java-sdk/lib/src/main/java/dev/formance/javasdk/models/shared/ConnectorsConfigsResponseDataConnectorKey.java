package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorsConfigsResponseDataConnectorKey {
    @JsonProperty("dataType")
    public String dataType;
    public ConnectorsConfigsResponseDataConnectorKey withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    
    @JsonProperty("required")
    public Boolean required;
    public ConnectorsConfigsResponseDataConnectorKey withRequired(Boolean required) {
        this.required = required;
        return this;
    }
    
}
