package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;

public class ListTransactionsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=account")
    public String account;
    public ListTransactionsQueryParams withAccount(String account) {
        this.account = account;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=after")
    public String after;
    public ListTransactionsQueryParams withAfter(String after) {
        this.after = after;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    public String cursor;
    public ListTransactionsQueryParams withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=destination")
    public String destination;
    public ListTransactionsQueryParams withDestination(String destination) {
        this.destination = destination;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=endTime")
    public OffsetDateTime endTime;
    public ListTransactionsQueryParams withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    public java.util.Map<String, Object> metadata;
    public ListTransactionsQueryParams withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    public Long pageSize;
    public ListTransactionsQueryParams withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pagination_token")
    public String paginationToken;
    public ListTransactionsQueryParams withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=reference")
    public String reference;
    public ListTransactionsQueryParams withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=source")
    public String source;
    public ListTransactionsQueryParams withSource(String source) {
        this.source = source;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=startTime")
    public OffsetDateTime startTime;
    public ListTransactionsQueryParams withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }
    
}
