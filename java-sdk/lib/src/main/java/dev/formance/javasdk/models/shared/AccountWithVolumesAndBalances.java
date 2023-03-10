package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class AccountWithVolumesAndBalances {
    @JsonProperty("address")
    public String address;
    public AccountWithVolumesAndBalances withAddress(String address) {
        this.address = address;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balances")
    public java.util.Map<String, Long> balances;
    public AccountWithVolumesAndBalances withBalances(java.util.Map<String, Long> balances) {
        this.balances = balances;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public AccountWithVolumesAndBalances withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;
    public AccountWithVolumesAndBalances withType(String type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("volumes")
    public java.util.Map<String, java.util.Map<String, Long>> volumes;
    public AccountWithVolumesAndBalances withVolumes(java.util.Map<String, java.util.Map<String, Long>> volumes) {
        this.volumes = volumes;
        return this;
    }
}
