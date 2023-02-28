package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type ReadScopePathParams struct {
	ScopeID string `pathParam:"style=simple,explode=false,name=scopeId"`
}

type ReadScopeRequest struct {
	PathParams ReadScopePathParams
}

type ReadScopeResponse struct {
	ContentType       string
	ReadScopeResponse *shared.ReadScopeResponse
	StatusCode        int
}
