package shared

type BalancesCursorResponseCursor struct {
	Data     []map[string]map[string]int64 `json:"data"`
	HasMore  bool                          `json:"hasMore"`
	Next     *string                       `json:"next,omitempty"`
	PageSize int64                         `json:"pageSize"`
	Previous *string                       `json:"previous,omitempty"`
}

type BalancesCursorResponse struct {
	Cursor BalancesCursorResponseCursor `json:"cursor"`
}
