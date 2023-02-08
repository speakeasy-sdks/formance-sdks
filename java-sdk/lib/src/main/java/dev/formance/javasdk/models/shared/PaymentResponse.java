package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentResponse {
    @JsonProperty("data")
    public Payment data;
    public PaymentResponse withData(Payment data) {
        this.data = data;
        return this;
    }
}
