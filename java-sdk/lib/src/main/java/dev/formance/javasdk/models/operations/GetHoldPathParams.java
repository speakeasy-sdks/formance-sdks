package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class GetHoldPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=holdID")
    public String holdID;
    public GetHoldPathParams withHoldID(String holdID) {
        this.holdID = holdID;
        return this;
    }
    
}
