package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PaymentStatusEnum {
    PENDING("PENDING"),
    ACTIVE("ACTIVE"),
    TERMINATED("TERMINATED"),
    FAILED("FAILED");

    @JsonValue
    public final String value;

    private PaymentStatusEnum(String value) {
        this.value = value;
    }
}
