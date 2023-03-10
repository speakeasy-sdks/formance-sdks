package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type CreateTransactionsPathParams struct {
	Ledger string `pathParam:"style=simple,explode=false,name=ledger"`
}

type CreateTransactionsRequest struct {
	PathParams CreateTransactionsPathParams
	Request    shared.Transactions `request:"mediaType=application/json"`
}

type CreateTransactionsResponse struct {
	ContentType          string
	ErrorResponse        *shared.ErrorResponse
	StatusCode           int64
	TransactionsResponse *shared.TransactionsResponse
}
