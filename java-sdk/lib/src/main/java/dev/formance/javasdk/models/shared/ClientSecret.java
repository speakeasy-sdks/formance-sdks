package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class ClientSecret {
    @JsonProperty("id")
    public String id;
    public ClientSecret withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("lastDigits")
    public String lastDigits;
    public ClientSecret withLastDigits(String lastDigits) {
        this.lastDigits = lastDigits;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public ClientSecret withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public ClientSecret withName(String name) {
        this.name = name;
        return this;
    }
}
