package dev.formance.javasdk.models.shared;


public enum ConnectorEnum {
    STRIPE("STRIPE"),
    DUMMY_PAY("DUMMY-PAY"),
    WISE("WISE"),
    MODULR("MODULR"),
    CURRENCY_CLOUD("CURRENCY-CLOUD"),
    BANKING_CIRCLE("BANKING-CIRCLE");

    public final String value;

    private ConnectorEnum(String value) {
        this.value = value;
    }
}
