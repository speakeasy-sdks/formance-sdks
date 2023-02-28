package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfirmHoldRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    public Long amount;
    public ConfirmHoldRequest withAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("final")
    public Boolean final_;
    public ConfirmHoldRequest withFinal(Boolean final_) {
        this.final_ = final_;
        return this;
    }
    
}
