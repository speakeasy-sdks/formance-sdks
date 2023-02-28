package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type ListAllConnectorsResponse struct {
	ConnectorsResponse *shared.ConnectorsResponse
	ContentType        string
	StatusCode         int
}
