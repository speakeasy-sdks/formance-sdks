package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class GetTransactionsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    public String cursor;
    public GetTransactionsQueryParams withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    public Long pageSize;
    public GetTransactionsQueryParams withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=wallet_id")
    public String walletId;
    public GetTransactionsQueryParams withWalletId(String walletId) {
        this.walletId = walletId;
        return this;
    }
    
}
