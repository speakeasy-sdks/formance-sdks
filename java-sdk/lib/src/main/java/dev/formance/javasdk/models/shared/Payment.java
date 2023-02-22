package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.formance.javasdk.utils.DateTimeDeserializer;
import dev.formance.javasdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class Payment {
    @JsonProperty("accountID")
    public String accountID;
    public Payment withAccountID(String accountID) {
        this.accountID = accountID;
        return this;
    }
    
    @JsonProperty("adjustments")
    public PaymentAdjustment[] adjustments;
    public Payment withAdjustments(PaymentAdjustment[] adjustments) {
        this.adjustments = adjustments;
        return this;
    }
    
    @JsonProperty("asset")
    public String asset;
    public Payment withAsset(String asset) {
        this.asset = asset;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;
    public Payment withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public Payment withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("initialAmount")
    public Long initialAmount;
    public Payment withInitialAmount(Long initialAmount) {
        this.initialAmount = initialAmount;
        return this;
    }
    
    @JsonProperty("metadata")
    public PaymentMetadata[] metadata;
    public Payment withMetadata(PaymentMetadata[] metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonProperty("provider")
    public ConnectorEnum provider;
    public Payment withProvider(ConnectorEnum provider) {
        this.provider = provider;
        return this;
    }
    
    @JsonProperty("raw")
    public java.util.Map<String, Object> raw;
    public Payment withRaw(java.util.Map<String, Object> raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonProperty("reference")
    public String reference;
    public Payment withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    @JsonProperty("scheme")
    public PaymentSchemeEnum scheme;
    public Payment withScheme(PaymentSchemeEnum scheme) {
        this.scheme = scheme;
        return this;
    }
    
    @JsonProperty("status")
    public PaymentStatusEnum status;
    public Payment withStatus(PaymentStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("type")
    public PaymentTypeEnum type;
    public Payment withType(PaymentTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
