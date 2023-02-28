package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class GetWorkflowOccurrencePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=flowId")
    public String flowId;
    public GetWorkflowOccurrencePathParams withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=runId")
    public String runId;
    public GetWorkflowOccurrencePathParams withRunId(String runId) {
        this.runId = runId;
        return this;
    }
    
}
