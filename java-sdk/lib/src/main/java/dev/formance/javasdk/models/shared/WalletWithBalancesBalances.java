package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WalletWithBalancesBalances {
    @JsonProperty("main")
    public AssetHolder main;
    public WalletWithBalancesBalances withMain(AssetHolder main) {
        this.main = main;
        return this;
    }
    
}
