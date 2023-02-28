package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseCursorTotal {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relation")
    public String relation;
    public ResponseCursorTotal withRelation(String relation) {
        this.relation = relation;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public Long value;
    public ResponseCursorTotal withValue(Long value) {
        this.value = value;
        return this;
    }
    
}
