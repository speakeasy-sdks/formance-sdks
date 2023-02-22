package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class ActivateConfigPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public ActivateConfigPathParams withId(String id) {
        this.id = id;
        return this;
    }
    
}
