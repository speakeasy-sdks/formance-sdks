package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MappingResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public Mapping data;
    public MappingResponse withData(Mapping data) {
        this.data = data;
        return this;
    }
    
}
