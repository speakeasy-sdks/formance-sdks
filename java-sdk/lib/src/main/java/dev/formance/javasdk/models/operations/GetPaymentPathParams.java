package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class GetPaymentPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=paymentId")
    public String paymentId;
    public GetPaymentPathParams withPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }
}
