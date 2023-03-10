package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type GetWorkflowOccurrencePathParams struct {
	FlowID string `pathParam:"style=simple,explode=false,name=flowId"`
	RunID  string `pathParam:"style=simple,explode=false,name=runId"`
}

type GetWorkflowOccurrenceRequest struct {
	PathParams GetWorkflowOccurrencePathParams
}

type GetWorkflowOccurrenceResponse struct {
	ContentType                   string
	Error                         *shared.Error
	GetWorkflowOccurrenceResponse *shared.GetWorkflowOccurrenceResponse
	StatusCode                    int64
}
