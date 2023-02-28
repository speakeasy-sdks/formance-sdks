package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class GetBalancesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=address")
    public String address;
    public GetBalancesQueryParams withAddress(String address) {
        this.address = address;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=after")
    public String after;
    public GetBalancesQueryParams withAfter(String after) {
        this.after = after;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    public String cursor;
    public GetBalancesQueryParams withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pagination_token")
    public String paginationToken;
    public GetBalancesQueryParams withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
        return this;
    }
    
}
