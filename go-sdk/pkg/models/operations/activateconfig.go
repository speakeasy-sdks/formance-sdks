package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type ActivateConfigPathParams struct {
	ID string `pathParam:"style=simple,explode=false,name=id"`
}

type ActivateConfigRequest struct {
	PathParams ActivateConfigPathParams
}

type ActivateConfigResponse struct {
	ConfigResponse *shared.ConfigResponse
	ContentType    string
	StatusCode     int64
}
