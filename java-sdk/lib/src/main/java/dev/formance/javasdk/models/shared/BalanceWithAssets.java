package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class BalanceWithAssets {
    @JsonProperty("assets")
    public java.util.Map<String, Double> assets;
    public BalanceWithAssets withAssets(java.util.Map<String, Double> assets) {
        this.assets = assets;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public BalanceWithAssets withName(String name) {
        this.name = name;
        return this;
    }
}
