package dev.formance.javasdk.models.shared;


public enum LogTypeEnum {
    NEW_TRANSACTION("NEW_TRANSACTION"),
    SET_METADATA("SET_METADATA");

    public final String value;

    private LogTypeEnum(String value) {
        this.value = value;
    }
}
