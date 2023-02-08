package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WalletsErrorResponse {
    @JsonProperty("errorCode")
    public WalletsErrorResponseErrorCodeEnum errorCode;
    public WalletsErrorResponse withErrorCode(WalletsErrorResponseErrorCodeEnum errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    @JsonProperty("errorMessage")
    public String errorMessage;
    public WalletsErrorResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
}
