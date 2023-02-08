package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
	"time"
)

type CountTransactionsPathParams struct {
	Ledger string `pathParam:"style=simple,explode=false,name=ledger"`
}

type CountTransactionsQueryParams struct {
	Account     *string                `queryParam:"style=form,explode=true,name=account"`
	Destination *string                `queryParam:"style=form,explode=true,name=destination"`
	EndTime     *time.Time             `queryParam:"style=form,explode=true,name=endTime"`
	Metadata    map[string]interface{} `queryParam:"style=deepObject,explode=true,name=metadata"`
	Reference   *string                `queryParam:"style=form,explode=true,name=reference"`
	Source      *string                `queryParam:"style=form,explode=true,name=source"`
	StartTime   *time.Time             `queryParam:"style=form,explode=true,name=startTime"`
}

type CountTransactionsRequest struct {
	PathParams  CountTransactionsPathParams
	QueryParams CountTransactionsQueryParams
}

type CountTransactionsResponse struct {
	ContentType   string
	ErrorResponse *shared.ErrorResponse
	Headers       map[string][]string
	StatusCode    int64
}
