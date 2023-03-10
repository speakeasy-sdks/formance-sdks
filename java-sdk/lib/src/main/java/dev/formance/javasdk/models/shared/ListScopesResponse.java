package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class ListScopesResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public Scope[] data;
    public ListScopesResponse withData(Scope[] data) {
        this.data = data;
        return this;
    }
}
