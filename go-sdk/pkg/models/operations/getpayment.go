package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type GetPaymentPathParams struct {
	PaymentID string `pathParam:"style=simple,explode=false,name=paymentId"`
}

type GetPaymentRequest struct {
	PathParams GetPaymentPathParams
}

type GetPaymentResponse struct {
	ContentType     string
	PaymentResponse *shared.PaymentResponse
	StatusCode      int
}
