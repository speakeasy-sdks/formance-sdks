package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ModulrConfig {
    @JsonProperty("apiKey")
    public String apiKey;
    public ModulrConfig withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("apiSecret")
    public String apiSecret;
    public ModulrConfig withApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("endpoint")
    public String endpoint;
    public ModulrConfig withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    
}
