package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class RunWorkflowPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=flowId")
    public String flowId;
    public RunWorkflowPathParams withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
}
