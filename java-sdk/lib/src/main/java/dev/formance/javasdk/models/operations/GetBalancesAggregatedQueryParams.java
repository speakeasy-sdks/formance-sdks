package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class GetBalancesAggregatedQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=address")
    public String address;
    public GetBalancesAggregatedQueryParams withAddress(String address) {
        this.address = address;
        return this;
    }
    
}
