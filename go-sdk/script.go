package formance

import (
	"context"
	"fmt"
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/operations"
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
	"github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/utils"
	"net/http"
)

type script struct {
	defaultClient  HTTPClient
	securityClient HTTPClient
	serverURL      string
	language       string
	sdkVersion     string
	genVersion     string
}

func newScript(defaultClient, securityClient HTTPClient, serverURL, language, sdkVersion, genVersion string) *script {
	return &script{
		defaultClient:  defaultClient,
		securityClient: securityClient,
		serverURL:      serverURL,
		language:       language,
		sdkVersion:     sdkVersion,
		genVersion:     genVersion,
	}
}

// RunScript - Execute a Numscript
// This route is deprecated, and has been merged into `POST /{ledger}/transactions`.
func (s *script) RunScript(ctx context.Context, request operations.RunScriptRequest) (*operations.RunScriptResponse, error) {
	baseURL := s.serverURL
	url := utils.GenerateURL(ctx, baseURL, "/api/ledger/{ledger}/script", request.PathParams)

	bodyReader, reqContentType, err := utils.SerializeRequestBody(ctx, request)
	if err != nil {
		return nil, fmt.Errorf("error serializing request body: %w", err)
	}
	if bodyReader == nil {
		return nil, fmt.Errorf("request body is required")
	}

	req, err := http.NewRequestWithContext(ctx, "POST", url, bodyReader)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}

	req.Header.Set("Content-Type", reqContentType)

	utils.PopulateQueryParams(ctx, req, request.QueryParams)

	client := s.securityClient

	httpRes, err := client.Do(req)
	if err != nil {
		return nil, fmt.Errorf("error sending request: %w", err)
	}
	if httpRes == nil {
		return nil, fmt.Errorf("error sending request: no response")
	}
	defer httpRes.Body.Close()

	contentType := httpRes.Header.Get("Content-Type")

	res := &operations.RunScriptResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out *shared.ScriptResponse
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.ScriptResponse = out
		}
	}

	return res, nil
}
