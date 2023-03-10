package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type CreateClientRequest struct {
	Request *shared.CreateClientRequest `request:"mediaType=application/json"`
}

type CreateClientResponse struct {
	ContentType          string
	CreateClientResponse *shared.CreateClientResponse
	StatusCode           int64
}
