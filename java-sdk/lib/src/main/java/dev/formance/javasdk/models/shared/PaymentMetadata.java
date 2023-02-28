package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentMetadata {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("changelog")
    public PaymentMetadataChangelog changelog;
    public PaymentMetadata withChangelog(PaymentMetadataChangelog changelog) {
        this.changelog = changelog;
        return this;
    }
    
    @JsonProperty("key")
    public String key;
    public PaymentMetadata withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonProperty("value")
    public String value;
    public PaymentMetadata withValue(String value) {
        this.value = value;
        return this;
    }
    
}
