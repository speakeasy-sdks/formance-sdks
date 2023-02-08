package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
	"time"
)

type ListLogsPathParams struct {
	Ledger string `pathParam:"style=simple,explode=false,name=ledger"`
}

type ListLogsQueryParams struct {
	After           *string    `queryParam:"style=form,explode=true,name=after"`
	Cursor          *string    `queryParam:"style=form,explode=true,name=cursor"`
	EndTime         *time.Time `queryParam:"style=form,explode=true,name=endTime"`
	PageSize        *int64     `queryParam:"style=form,explode=true,name=pageSize"`
	PaginationToken *string    `queryParam:"style=form,explode=true,name=pagination_token"`
	StartTime       *time.Time `queryParam:"style=form,explode=true,name=startTime"`
}

type ListLogsRequest struct {
	PathParams  ListLogsPathParams
	QueryParams ListLogsQueryParams
}

type ListLogsResponse struct {
	ContentType        string
	ErrorResponse      *shared.ErrorResponse
	LogsCursorResponse *shared.LogsCursorResponse
	StatusCode         int64
}
