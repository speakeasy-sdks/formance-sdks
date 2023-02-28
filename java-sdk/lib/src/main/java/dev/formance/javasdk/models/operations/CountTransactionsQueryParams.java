package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;

public class CountTransactionsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=account")
    public String account;
    public CountTransactionsQueryParams withAccount(String account) {
        this.account = account;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=destination")
    public String destination;
    public CountTransactionsQueryParams withDestination(String destination) {
        this.destination = destination;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=endTime")
    public OffsetDateTime endTime;
    public CountTransactionsQueryParams withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    public java.util.Map<String, Object> metadata;
    public CountTransactionsQueryParams withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=reference")
    public String reference;
    public CountTransactionsQueryParams withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=source")
    public String source;
    public CountTransactionsQueryParams withSource(String source) {
        this.source = source;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=startTime")
    public OffsetDateTime startTime;
    public CountTransactionsQueryParams withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }
    
}
