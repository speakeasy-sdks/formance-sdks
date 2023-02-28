package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type InstallConnectorPathParams struct {
	Connector shared.ConnectorEnum `pathParam:"style=simple,explode=false,name=connector"`
}

type InstallConnectorRequest struct {
	PathParams InstallConnectorPathParams
	Request    interface{} `request:"mediaType=application/json"`
}

type InstallConnectorResponse struct {
	ContentType string
	StatusCode  int
}
