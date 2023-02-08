package dev.formance.javasdk.models.operations;


public enum ListAccountsBalanceOperatorEnum {
    GTE("gte"),
    LTE("lte"),
    GT("gt"),
    LT("lt"),
    E("e"),
    NE("ne");

    public final String value;

    private ListAccountsBalanceOperatorEnum(String value) {
        this.value = value;
    }
}
