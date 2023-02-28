package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cursor")
    public ResponseCursor cursor;
    public Response withCursor(ResponseCursor cursor) {
        this.cursor = cursor;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public java.util.Map<String, Object> data;
    public Response withData(java.util.Map<String, Object> data) {
        this.data = data;
        return this;
    }
    
}
