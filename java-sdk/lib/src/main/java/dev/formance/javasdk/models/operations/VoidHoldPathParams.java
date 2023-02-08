package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class VoidHoldPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=hold_id")
    public String holdId;
    public VoidHoldPathParams withHoldId(String holdId) {
        this.holdId = holdId;
        return this;
    }
}
