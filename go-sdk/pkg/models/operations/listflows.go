package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type ListFlowsResponse struct {
	ContentType           string
	Error                 *shared.Error
	ListWorkflowsResponse *shared.ListWorkflowsResponse
	StatusCode            int64
}
