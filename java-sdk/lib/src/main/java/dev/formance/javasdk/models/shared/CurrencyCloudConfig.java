package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrencyCloudConfig {
    @JsonProperty("apiKey")
    public String apiKey;
    public CurrencyCloudConfig withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("endpoint")
    public String endpoint;
    public CurrencyCloudConfig withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    
    @JsonProperty("loginID")
    public String loginID;
    public CurrencyCloudConfig withLoginID(String loginID) {
        this.loginID = loginID;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pollingPeriod")
    public String pollingPeriod;
    public CurrencyCloudConfig withPollingPeriod(String pollingPeriod) {
        this.pollingPeriod = pollingPeriod;
        return this;
    }
    
}
