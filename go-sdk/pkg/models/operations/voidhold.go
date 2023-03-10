package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type VoidHoldPathParams struct {
	HoldID string `pathParam:"style=simple,explode=false,name=hold_id"`
}

type VoidHoldRequest struct {
	PathParams VoidHoldPathParams
}

type VoidHoldResponse struct {
	ContentType          string
	StatusCode           int64
	WalletsErrorResponse *shared.WalletsErrorResponse
}
