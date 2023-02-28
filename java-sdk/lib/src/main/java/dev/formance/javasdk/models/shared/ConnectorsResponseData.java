package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorsResponseData {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enabled")
    public Boolean enabled;
    public ConnectorsResponseData withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    public ConnectorEnum provider;
    public ConnectorsResponseData withProvider(ConnectorEnum provider) {
        this.provider = provider;
        return this;
    }
    
}
