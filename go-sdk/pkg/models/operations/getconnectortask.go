package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type GetConnectorTaskPathParams struct {
	Connector shared.ConnectorEnum `pathParam:"style=simple,explode=false,name=connector"`
	TaskID    string               `pathParam:"style=simple,explode=false,name=taskId"`
}

type GetConnectorTaskRequest struct {
	PathParams GetConnectorTaskPathParams
}

type GetConnectorTaskResponse struct {
	ContentType  string
	StatusCode   int64
	TaskResponse *shared.TaskResponse
}
