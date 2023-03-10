package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type CountAccountsPathParams struct {
	Ledger string `pathParam:"style=simple,explode=false,name=ledger"`
}

type CountAccountsQueryParams struct {
	Address  *string                `queryParam:"style=form,explode=true,name=address"`
	Metadata map[string]interface{} `queryParam:"style=deepObject,explode=true,name=metadata"`
}

type CountAccountsRequest struct {
	PathParams  CountAccountsPathParams
	QueryParams CountAccountsQueryParams
}

type CountAccountsResponse struct {
	ContentType   string
	ErrorResponse *shared.ErrorResponse
	Headers       map[string][]string
	StatusCode    int64
}
