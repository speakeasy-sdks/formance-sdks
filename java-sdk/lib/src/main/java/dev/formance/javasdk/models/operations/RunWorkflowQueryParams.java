package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class RunWorkflowQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=wait")
    public Boolean wait;
    public RunWorkflowQueryParams withWait(Boolean wait) {
        this.wait = wait;
        return this;
    }
    
}
