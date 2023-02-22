package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class GetHoldsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    public String cursor;
    public GetHoldsQueryParams withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    public java.util.Map<String, Object> metadata;
    public GetHoldsQueryParams withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    public Long pageSize;
    public GetHoldsQueryParams withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=walletID")
    public String walletID;
    public GetHoldsQueryParams withWalletID(String walletID) {
        this.walletID = walletID;
        return this;
    }
    
}
