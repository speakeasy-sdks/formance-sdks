package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class AssetHolder {
    @JsonProperty("assets")
    public java.util.Map<String, Double> assets;
    public AssetHolder withAssets(java.util.Map<String, Double> assets) {
        this.assets = assets;
        return this;
    }
}
