package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class ListRunsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=flowId")
    public String flowId;
    public ListRunsPathParams withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
}
