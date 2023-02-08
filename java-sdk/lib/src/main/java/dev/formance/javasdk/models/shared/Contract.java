package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class Contract {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    public String account;
    public Contract withAccount(String account) {
        this.account = account;
        return this;
    }
    @JsonProperty("expr")
    public java.util.Map<String, Object> expr;
    public Contract withExpr(java.util.Map<String, Object> expr) {
        this.expr = expr;
        return this;
    }
}
