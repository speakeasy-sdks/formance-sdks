package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type RevertTransactionPathParams struct {
	Ledger string `pathParam:"style=simple,explode=false,name=ledger"`
	Txid   int64  `pathParam:"style=simple,explode=false,name=txid"`
}

type RevertTransactionRequest struct {
	PathParams RevertTransactionPathParams
}

type RevertTransactionResponse struct {
	ContentType         string
	ErrorResponse       *shared.ErrorResponse
	StatusCode          int64
	TransactionResponse *shared.TransactionResponse
}
