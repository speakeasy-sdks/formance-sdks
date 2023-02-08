package dev.formance.javasdk.models.shared;


public enum PaymentSchemeEnum {
    VISA("visa"),
    MASTERCARD("mastercard"),
    AMEX("amex"),
    DINERS("diners"),
    DISCOVER("discover"),
    JCB("jcb"),
    UNIONPAY("unionpay"),
    SEPA_DEBIT("sepa debit"),
    SEPA_CREDIT("sepa credit"),
    SEPA("sepa"),
    APPLE_PAY("apple pay"),
    GOOGLE_PAY("google pay"),
    A2A("a2a"),
    ACH_DEBIT("ach debit"),
    ACH("ach"),
    RTP("rtp"),
    UNKNOWN("unknown"),
    OTHER("other");

    public final String value;

    private PaymentSchemeEnum(String value) {
        this.value = value;
    }
}
