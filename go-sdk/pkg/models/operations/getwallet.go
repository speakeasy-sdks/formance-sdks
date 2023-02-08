package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type GetWalletPathParams struct {
	ID string `pathParam:"style=simple,explode=false,name=id"`
}

type GetWalletRequest struct {
	PathParams GetWalletPathParams
}

type GetWalletResponse struct {
	ContentType          string
	GetWalletResponse    *shared.GetWalletResponse
	StatusCode           int64
	WalletsErrorResponse *shared.WalletsErrorResponse
}
