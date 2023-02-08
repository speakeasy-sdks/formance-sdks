package shared

import (
	"time"
)

type TaskWiseDescriptor struct {
	Key       *string `json:"key,omitempty"`
	Name      *string `json:"name,omitempty"`
	ProfileID *int64  `json:"profileID,omitempty"`
}

type TaskWise struct {
	ConnectorID string                 `json:"connectorId"`
	CreatedAt   time.Time              `json:"createdAt"`
	Descriptor  TaskWiseDescriptor     `json:"descriptor"`
	Error       *string                `json:"error,omitempty"`
	ID          string                 `json:"id"`
	State       map[string]interface{} `json:"state"`
	Status      PaymentStatusEnum      `json:"status"`
	UpdatedAt   time.Time              `json:"updatedAt"`
}
