package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum WalletsErrorResponseErrorCodeEnum {
    VALIDATION("VALIDATION");

    @JsonValue
    public final String value;

    private WalletsErrorResponseErrorCodeEnum(String value) {
        this.value = value;
    }
}
