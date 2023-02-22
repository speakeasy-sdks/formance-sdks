package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type ListRunsPathParams struct {
	FlowID string `pathParam:"style=simple,explode=false,name=flowId"`
}

type ListRunsRequest struct {
	PathParams ListRunsPathParams
}

type ListRunsResponse struct {
	ContentType      string
	Error            *shared.Error
	ListRunsResponse *interface{}
	StatusCode       int
}
