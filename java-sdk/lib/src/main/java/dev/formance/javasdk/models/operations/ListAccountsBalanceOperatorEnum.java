package dev.formance.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ListAccountsBalanceOperatorEnum {
    GTE("gte"),
    LTE("lte"),
    GT("gt"),
    LT("lt"),
    E("e"),
    NE("ne");

    @JsonValue
    public final String value;

    private ListAccountsBalanceOperatorEnum(String value) {
        this.value = value;
    }
}
