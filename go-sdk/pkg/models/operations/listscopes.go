package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type ListScopesResponse struct {
	ContentType        string
	ListScopesResponse *shared.ListScopesResponse
	StatusCode         int
}
