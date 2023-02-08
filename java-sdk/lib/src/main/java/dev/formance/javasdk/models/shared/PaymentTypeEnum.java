package dev.formance.javasdk.models.shared;


public enum PaymentTypeEnum {
    PAY_IN("PAY-IN"),
    PAYOUT("PAYOUT"),
    TRANSFER("TRANSFER"),
    OTHER("OTHER");

    public final String value;

    private PaymentTypeEnum(String value) {
        this.value = value;
    }
}
