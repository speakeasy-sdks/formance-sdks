package shared

import (
	"time"
)

type TransactionData struct {
	Metadata  map[string]interface{} `json:"metadata,omitempty"`
	Postings  []Posting              `json:"postings"`
	Reference *string                `json:"reference,omitempty"`
	Timestamp *time.Time             `json:"timestamp,omitempty"`
}
