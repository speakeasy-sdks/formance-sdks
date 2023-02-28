package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PaymentTypeEnum {
    PAY_IN("PAY-IN"),
    PAYOUT("PAYOUT"),
    TRANSFER("TRANSFER"),
    OTHER("OTHER");

    @JsonValue
    public final String value;

    private PaymentTypeEnum(String value) {
        this.value = value;
    }
}
