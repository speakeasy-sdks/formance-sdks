package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type GetInfoResponse struct {
	ConfigInfoResponse *shared.ConfigInfoResponse
	ContentType        string
	ErrorResponse      *shared.ErrorResponse
	StatusCode         int64
}
