package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type ReadUserPathParams struct {
	UserID string `pathParam:"style=simple,explode=false,name=userId"`
}

type ReadUserRequest struct {
	PathParams ReadUserPathParams
}

type ReadUserResponse struct {
	ContentType      string
	ReadUserResponse *shared.ReadUserResponse
	StatusCode       int64
}
