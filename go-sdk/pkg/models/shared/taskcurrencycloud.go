package shared

import (
	"time"
)

type TaskCurrencyCloudDescriptor struct {
	Name *string `json:"name,omitempty"`
}

type TaskCurrencyCloud struct {
	ConnectorID string                      `json:"connectorId"`
	CreatedAt   time.Time                   `json:"createdAt"`
	Descriptor  TaskCurrencyCloudDescriptor `json:"descriptor"`
	Error       *string                     `json:"error,omitempty"`
	ID          string                      `json:"id"`
	State       map[string]interface{}      `json:"state"`
	Status      PaymentStatusEnum           `json:"status"`
	UpdatedAt   time.Time                   `json:"updatedAt"`
}
