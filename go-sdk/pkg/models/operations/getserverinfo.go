package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type GetServerInfoResponse struct {
	ContentType string
	ServerInfo  *shared.ServerInfo
	StatusCode  int
}
