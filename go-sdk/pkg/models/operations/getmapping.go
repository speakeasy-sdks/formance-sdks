package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type GetMappingPathParams struct {
	Ledger string `pathParam:"style=simple,explode=false,name=ledger"`
}

type GetMappingRequest struct {
	PathParams GetMappingPathParams
}

type GetMappingResponse struct {
	ContentType     string
	ErrorResponse   *shared.ErrorResponse
	MappingResponse *shared.MappingResponse
	StatusCode      int64
}
