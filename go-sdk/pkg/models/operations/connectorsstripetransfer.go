package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type ConnectorsStripeTransferRequest struct {
	Request shared.StripeTransferRequest `request:"mediaType=application/json"`
}

type ConnectorsStripeTransferResponse struct {
	ContentType            string
	StatusCode             int64
	StripeTransferResponse map[string]interface{}
}
