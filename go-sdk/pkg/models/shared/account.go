package shared

type Account struct {
	Address  string                 `json:"address"`
	Metadata map[string]interface{} `json:"metadata,omitempty"`
	Type     *string                `json:"type,omitempty"`
}
