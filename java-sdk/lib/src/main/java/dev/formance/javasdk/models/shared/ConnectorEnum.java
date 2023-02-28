package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ConnectorEnum {
    STRIPE("STRIPE"),
    DUMMY_PAY("DUMMY-PAY"),
    WISE("WISE"),
    MODULR("MODULR"),
    CURRENCY_CLOUD("CURRENCY-CLOUD"),
    BANKING_CIRCLE("BANKING-CIRCLE");

    @JsonValue
    public final String value;

    private ConnectorEnum(String value) {
        this.value = value;
    }
}
