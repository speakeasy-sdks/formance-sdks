package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type GetLedgerInfoPathParams struct {
	Ledger string `pathParam:"style=simple,explode=false,name=ledger"`
}

type GetLedgerInfoRequest struct {
	PathParams GetLedgerInfoPathParams
}

type GetLedgerInfoResponse struct {
	ContentType        string
	ErrorResponse      *shared.ErrorResponse
	LedgerInfoResponse *interface{}
	StatusCode         int
}
