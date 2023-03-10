package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type GetAccountPathParams struct {
	Address string `pathParam:"style=simple,explode=false,name=address"`
	Ledger  string `pathParam:"style=simple,explode=false,name=ledger"`
}

type GetAccountRequest struct {
	PathParams GetAccountPathParams
}

type GetAccountResponse struct {
	AccountResponse *shared.AccountResponse
	ContentType     string
	ErrorResponse   *shared.ErrorResponse
	StatusCode      int64
}
