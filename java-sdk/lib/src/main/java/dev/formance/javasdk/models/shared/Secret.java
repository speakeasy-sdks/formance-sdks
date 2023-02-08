package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class Secret {
    @JsonProperty("clear")
    public String clear;
    public Secret withClear(String clear) {
        this.clear = clear;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public Secret withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("lastDigits")
    public String lastDigits;
    public Secret withLastDigits(String lastDigits) {
        this.lastDigits = lastDigits;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public Secret withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public Secret withName(String name) {
        this.name = name;
        return this;
    }
}
