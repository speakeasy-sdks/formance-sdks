package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class CreditWalletPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public CreditWalletPathParams withId(String id) {
        this.id = id;
        return this;
    }
    
}
