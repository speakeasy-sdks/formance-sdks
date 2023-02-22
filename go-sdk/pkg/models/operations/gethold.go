package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type GetHoldPathParams struct {
	HoldID string `pathParam:"style=simple,explode=false,name=holdID"`
}

type GetHoldRequest struct {
	PathParams GetHoldPathParams
}

type GetHoldResponse struct {
	ContentType          string
	GetHoldResponse      *shared.GetHoldResponse
	StatusCode           int
	WalletsErrorResponse *shared.WalletsErrorResponse
}
