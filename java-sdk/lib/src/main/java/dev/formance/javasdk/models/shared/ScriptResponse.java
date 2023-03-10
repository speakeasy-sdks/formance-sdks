package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ScriptResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public String details;
    public ScriptResponse withDetails(String details) {
        this.details = details;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errorCode")
    public ErrorsEnumEnum errorCode;
    public ScriptResponse withErrorCode(ErrorsEnumEnum errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errorMessage")
    public String errorMessage;
    public ScriptResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transaction")
    public Transaction transaction;
    public ScriptResponse withTransaction(Transaction transaction) {
        this.transaction = transaction;
        return this;
    }
}
