package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type AddMetadataOnTransactionPathParams struct {
	Ledger string `pathParam:"style=simple,explode=false,name=ledger"`
	Txid   int64  `pathParam:"style=simple,explode=false,name=txid"`
}

type AddMetadataOnTransactionRequest struct {
	PathParams AddMetadataOnTransactionPathParams
	Request    map[string]interface{} `request:"mediaType=application/json"`
}

type AddMetadataOnTransactionResponse struct {
	ContentType   string
	ErrorResponse *shared.ErrorResponse
	StatusCode    int64
}
