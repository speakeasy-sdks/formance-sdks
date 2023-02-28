package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum LogTypeEnum {
    NEW_TRANSACTION("NEW_TRANSACTION"),
    SET_METADATA("SET_METADATA");

    @JsonValue
    public final String value;

    private LogTypeEnum(String value) {
        this.value = value;
    }
}
