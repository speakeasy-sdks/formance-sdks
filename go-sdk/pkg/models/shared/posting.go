package shared

type Posting struct {
	Amount      int64  `json:"amount"`
	Asset       string `json:"asset"`
	Destination string `json:"destination"`
	Source      string `json:"source"`
}
