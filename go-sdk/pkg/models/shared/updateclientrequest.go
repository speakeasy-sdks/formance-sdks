package shared

type UpdateClientRequest struct {
	Description            *string                `json:"description,omitempty"`
	Metadata               map[string]interface{} `json:"metadata,omitempty"`
	Name                   string                 `json:"name"`
	PostLogoutRedirectUris []string               `json:"postLogoutRedirectUris,omitempty"`
	Public                 *bool                  `json:"public,omitempty"`
	RedirectUris           []string               `json:"redirectUris,omitempty"`
	Trusted                *bool                  `json:"trusted,omitempty"`
}
