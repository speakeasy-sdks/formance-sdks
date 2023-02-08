package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountResponse {
    @JsonProperty("data")
    public AccountWithVolumesAndBalances data;
    public AccountResponse withData(AccountWithVolumesAndBalances data) {
        this.data = data;
        return this;
    }
}
