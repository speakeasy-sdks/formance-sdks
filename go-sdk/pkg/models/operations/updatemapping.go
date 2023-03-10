package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type UpdateMappingPathParams struct {
	Ledger string `pathParam:"style=simple,explode=false,name=ledger"`
}

type UpdateMappingRequest struct {
	PathParams UpdateMappingPathParams
	Request    shared.Mapping `request:"mediaType=application/json"`
}

type UpdateMappingResponse struct {
	ContentType     string
	ErrorResponse   *shared.ErrorResponse
	MappingResponse *shared.MappingResponse
	StatusCode      int64
}
