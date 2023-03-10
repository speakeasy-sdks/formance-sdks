package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class ConfigUser {
    @JsonProperty("endpoint")
    public String endpoint;
    public ConfigUser withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    @JsonProperty("eventTypes")
    public String[] eventTypes;
    public ConfigUser withEventTypes(String[] eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secret")
    public String secret;
    public ConfigUser withSecret(String secret) {
        this.secret = secret;
        return this;
    }
}
