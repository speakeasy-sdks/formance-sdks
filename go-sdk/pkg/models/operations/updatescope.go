package operations

import (
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
)

type UpdateScopePathParams struct {
	ScopeID string `pathParam:"style=simple,explode=false,name=scopeId"`
}

type UpdateScopeRequest struct {
	PathParams UpdateScopePathParams
	Request    *shared.UpdateScopeRequest `request:"mediaType=application/json"`
}

type UpdateScopeResponse struct {
	ContentType         string
	StatusCode          int64
	UpdateScopeResponse *shared.UpdateScopeResponse
}
