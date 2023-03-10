package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type ConfirmHoldPathParams struct {
	HoldID string `pathParam:"style=simple,explode=false,name=hold_id"`
}

type ConfirmHoldRequest struct {
	PathParams ConfirmHoldPathParams
	Request    *shared.ConfirmHoldRequest `request:"mediaType=application/json"`
}

type ConfirmHoldResponse struct {
	ContentType          string
	StatusCode           int64
	WalletsErrorResponse *shared.WalletsErrorResponse
}
