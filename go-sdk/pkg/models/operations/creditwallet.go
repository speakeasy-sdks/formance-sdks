package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type CreditWalletPathParams struct {
	ID string `pathParam:"style=simple,explode=false,name=id"`
}

type CreditWalletRequest struct {
	PathParams CreditWalletPathParams
	Request    *shared.CreditWalletRequest `request:"mediaType=application/json"`
}

type CreditWalletResponse struct {
	ContentType          string
	StatusCode           int64
	WalletsErrorResponse *shared.WalletsErrorResponse
}
