package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class ConfirmHoldPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=hold_id")
    public String holdId;
    public ConfirmHoldPathParams withHoldId(String holdId) {
        this.holdId = holdId;
        return this;
    }
}
