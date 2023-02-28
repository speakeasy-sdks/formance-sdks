package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.formance.javasdk.utils.DateTimeDeserializer;
import dev.formance.javasdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class PaymentsAccount {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;
    public PaymentsAccount withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public PaymentsAccount withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("provider")
    public ConnectorEnum provider;
    public PaymentsAccount withProvider(ConnectorEnum provider) {
        this.provider = provider;
        return this;
    }
    
    @JsonProperty("reference")
    public String reference;
    public PaymentsAccount withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    @JsonProperty("type")
    public PaymentsAccountTypeEnum type;
    public PaymentsAccount withType(PaymentsAccountTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
