package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error {
    @JsonProperty("errorCode")
    public ErrorErrorCodeEnum errorCode;
    public Error withErrorCode(ErrorErrorCodeEnum errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    
    @JsonProperty("errorMessage")
    public String errorMessage;
    public Error withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    
}
