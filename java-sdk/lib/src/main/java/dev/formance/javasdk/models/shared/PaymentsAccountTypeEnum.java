package dev.formance.javasdk.models.shared;


public enum PaymentsAccountTypeEnum {
    TARGET("TARGET"),
    SOURCE("SOURCE");

    public final String value;

    private PaymentsAccountTypeEnum(String value) {
        this.value = value;
    }
}
