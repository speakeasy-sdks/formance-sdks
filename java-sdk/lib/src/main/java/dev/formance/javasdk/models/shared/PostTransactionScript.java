package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class PostTransactionScript {
    @JsonProperty("plain")
    public String plain;
    public PostTransactionScript withPlain(String plain) {
        this.plain = plain;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vars")
    public java.util.Map<String, Object> vars;
    public PostTransactionScript withVars(java.util.Map<String, Object> vars) {
        this.vars = vars;
        return this;
    }
}
