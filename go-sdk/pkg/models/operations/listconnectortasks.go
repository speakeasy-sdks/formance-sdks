package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type ListConnectorTasksPathParams struct {
	Connector shared.ConnectorEnum `pathParam:"style=simple,explode=false,name=connector"`
}

type ListConnectorTasksQueryParams struct {
	Cursor   *string `queryParam:"style=form,explode=true,name=cursor"`
	PageSize *int64  `queryParam:"style=form,explode=true,name=pageSize"`
}

type ListConnectorTasksRequest struct {
	PathParams  ListConnectorTasksPathParams
	QueryParams ListConnectorTasksQueryParams
}

type ListConnectorTasksResponse struct {
	ContentType string
	StatusCode  int64
	TasksCursor *shared.TasksCursor
}
