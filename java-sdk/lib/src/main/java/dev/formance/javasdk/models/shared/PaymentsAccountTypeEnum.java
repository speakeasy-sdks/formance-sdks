package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PaymentsAccountTypeEnum {
    TARGET("TARGET"),
    SOURCE("SOURCE");

    @JsonValue
    public final String value;

    private PaymentsAccountTypeEnum(String value) {
        this.value = value;
    }
}
