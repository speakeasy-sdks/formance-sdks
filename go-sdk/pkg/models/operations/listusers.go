package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type ListUsersResponse struct {
	ContentType       string
	ListUsersResponse *shared.ListUsersResponse
	StatusCode        int
}
