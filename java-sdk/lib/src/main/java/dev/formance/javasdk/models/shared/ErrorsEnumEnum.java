package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ErrorsEnumEnum {
    INTERNAL("INTERNAL"),
    INSUFFICIENT_FUND("INSUFFICIENT_FUND"),
    VALIDATION("VALIDATION"),
    CONFLICT("CONFLICT"),
    NO_SCRIPT("NO_SCRIPT"),
    COMPILATION_FAILED("COMPILATION_FAILED"),
    METADATA_OVERRIDE("METADATA_OVERRIDE");

    @JsonValue
    public final String value;

    private ErrorsEnumEnum(String value) {
        this.value = value;
    }
}
