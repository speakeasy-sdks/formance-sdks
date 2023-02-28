package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ErrorErrorCodeEnum {
    VALIDATION("VALIDATION");

    @JsonValue
    public final String value;

    private ErrorErrorCodeEnum(String value) {
        this.value = value;
    }
}
