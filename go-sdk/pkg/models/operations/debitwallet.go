package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type DebitWalletPathParams struct {
	ID string `pathParam:"style=simple,explode=false,name=id"`
}

type DebitWalletRequest struct {
	PathParams DebitWalletPathParams
	Request    *shared.DebitWalletRequest `request:"mediaType=application/json"`
}

type DebitWalletResponse struct {
	ContentType          string
	DebitWalletResponse  *shared.DebitWalletResponse
	StatusCode           int64
	WalletsErrorResponse *shared.WalletsErrorResponse
}
