package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class UpdateWalletPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public UpdateWalletPathParams withId(String id) {
        this.id = id;
        return this;
    }
    
}
