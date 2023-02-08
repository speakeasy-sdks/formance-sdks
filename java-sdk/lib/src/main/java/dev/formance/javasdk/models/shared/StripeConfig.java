package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StripeConfig {
    @JsonProperty("apiKey")
    public String apiKey;
    public StripeConfig withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pageSize")
    public Long pageSize;
    public StripeConfig withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pollingPeriod")
    public String pollingPeriod;
    public StripeConfig withPollingPeriod(String pollingPeriod) {
        this.pollingPeriod = pollingPeriod;
        return this;
    }
}
