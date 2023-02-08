package shared

import (
	"time"
)

type TaskStripeDescriptor struct {
	Account string `json:"account"`
	Main    *bool  `json:"main,omitempty"`
	Name    string `json:"name"`
}

type TaskStripe struct {
	ConnectorID string                 `json:"connectorId"`
	CreatedAt   time.Time              `json:"createdAt"`
	Descriptor  TaskStripeDescriptor   `json:"descriptor"`
	Error       *string                `json:"error,omitempty"`
	ID          string                 `json:"id"`
	State       map[string]interface{} `json:"state"`
	Status      PaymentStatusEnum      `json:"status"`
	UpdatedAt   time.Time              `json:"updatedAt"`
}
