package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class GetFlowPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=flowId")
    public String flowId;
    public GetFlowPathParams withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
}
