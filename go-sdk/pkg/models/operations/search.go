package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type SearchRequest struct {
	Request shared.Query `request:"mediaType=application/json"`
}

type SearchResponse struct {
	ContentType string
	Response    *shared.Response
	StatusCode  int
}
