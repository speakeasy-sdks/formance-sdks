package shared

import (
	"time"
)

type TaskModulrDescriptor struct {
	AccountID *string `json:"accountID,omitempty"`
	Key       *string `json:"key,omitempty"`
	Name      *string `json:"name,omitempty"`
}

type TaskModulr struct {
	ConnectorID string                 `json:"connectorId"`
	CreatedAt   time.Time              `json:"createdAt"`
	Descriptor  TaskModulrDescriptor   `json:"descriptor"`
	Error       *string                `json:"error,omitempty"`
	ID          string                 `json:"id"`
	State       map[string]interface{} `json:"state"`
	Status      PaymentStatusEnum      `json:"status"`
	UpdatedAt   time.Time              `json:"updatedAt"`
}
