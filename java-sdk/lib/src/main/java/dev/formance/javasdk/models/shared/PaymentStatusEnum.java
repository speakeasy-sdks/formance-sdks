package dev.formance.javasdk.models.shared;


public enum PaymentStatusEnum {
    PENDING("PENDING"),
    ACTIVE("ACTIVE"),
    TERMINATED("TERMINATED"),
    FAILED("FAILED");

    public final String value;

    private PaymentStatusEnum(String value) {
        this.value = value;
    }
}
