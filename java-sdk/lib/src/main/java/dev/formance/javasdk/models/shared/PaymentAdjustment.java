package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.formance.javasdk.utils.DateTimeDeserializer;
import dev.formance.javasdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class PaymentAdjustment {
    @JsonProperty("absolute")
    public Boolean absolute;
    public PaymentAdjustment withAbsolute(Boolean absolute) {
        this.absolute = absolute;
        return this;
    }
    
    @JsonProperty("amount")
    public Long amount;
    public PaymentAdjustment withAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date")
    public OffsetDateTime date;
    public PaymentAdjustment withDate(OffsetDateTime date) {
        this.date = date;
        return this;
    }
    
    @JsonProperty("raw")
    public java.util.Map<String, Object> raw;
    public PaymentAdjustment withRaw(java.util.Map<String, Object> raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonProperty("status")
    public PaymentStatusEnum status;
    public PaymentAdjustment withStatus(PaymentStatusEnum status) {
        this.status = status;
        return this;
    }
    
}
