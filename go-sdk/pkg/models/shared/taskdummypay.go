package shared

import (
	"time"
)

type TaskDummyPayDescriptor struct {
	FileName *string `json:"fileName,omitempty"`
	Key      *string `json:"key,omitempty"`
	Name     *string `json:"name,omitempty"`
}

type TaskDummyPay struct {
	ConnectorID string                 `json:"connectorId"`
	CreatedAt   time.Time              `json:"createdAt"`
	Descriptor  TaskDummyPayDescriptor `json:"descriptor"`
	Error       *string                `json:"error,omitempty"`
	ID          string                 `json:"id"`
	State       map[string]interface{} `json:"state"`
	Status      PaymentStatusEnum      `json:"status"`
	UpdatedAt   time.Time              `json:"updatedAt"`
}
