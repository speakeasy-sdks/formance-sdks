package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class GetBalancePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=balanceName")
    public String balanceName;
    public GetBalancePathParams withBalanceName(String balanceName) {
        this.balanceName = balanceName;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public GetBalancePathParams withId(String id) {
        this.id = id;
        return this;
    }
    
}
