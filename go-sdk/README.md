# Formance Go SDK

<div align="center"> 
    <img src="https://img.shields.io/github/go-mod/go-version/speakeasy-sdks/formance-sdks?filename=go-sdk%2Fgo.mod&style=for-the-badge" />
</div>

<!-- Start SDK Installation -->
## SDK Installation

```bash
go get github.com/speakeasy-sdks/formance-sdks/go-client-sdk
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```go
package main

import (
    "log"
    "github.com/speakeasy-sdks/formance-sdks/go-client-sdk"
    "github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
    "github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/operations"
)

func main() {
    opts := []formance.SDKOption{
        formance.WithSecurity(
            shared.Security{
                Authorization: shared.SchemeAuthorization{
                    Authorization: "Bearer YOUR_ACCESS_TOKEN_HERE",
                },
            }
        ),
    }

    s := formance.New(opts...)
    
    res, err := s.PaymentsgetServerInfo(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.ServerInfo != nil {
        // handle response
    }
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## SDK Available Operations

### Formance SDK

* `PaymentsgetServerInfo` - Get server info
* `SearchgetServerInfo` - Get server info

### Accounts

* `AddMetadataToAccount` - Add metadata to an account
* `CountAccounts` - Count the accounts from a ledger
* `GetAccount` - Get account by its address
* `ListAccounts` - List accounts from a ledger

### Balances

* `GetBalances` - Get the balances from a ledger's account
* `GetBalancesAggregated` - Get the aggregated balances from selected accounts

### Clients

* `AddScopeToClient` - Add scope to client
* `CreateClient` - Create client
* `CreateSecret` - Add a secret to a client
* `DeleteClient` - Delete client
* `DeleteScopeFromClient` - Delete scope from client
* `DeleteSecret` - Delete a secret from a client
* `ListClients` - List clients
* `ReadClient` - Read client
* `UpdateClient` - Update client

### Ledger

* `GetLedgerInfo` - Get information about a ledger
* `GetServerInfo` - Get the server info

### Logs

* `ListLogs` - List the logs from a ledger

### Mapping

* `GetMapping` - Get the mapping of a ledger
* `UpdateMapping` - Update the mapping of a ledger

### Orchestration

* `CreateWorkflow` - Create workflow
* `GetFlow` - Get a flow by id
* `GetWorkflowOccurrence` - Get a workflow occurrence by id
* `ListFlows` - List registered flows
* `ListRuns` - List occurrences of a workflow
* `OrchestrationgetServerInfo` - Get server info
* `RunWorkflow` - Run workflow

### Payments

* `ConnectorsStripeTransfer` - Transfer funds between Stripe accounts
* `GetConnectorTask` - Read a specific task of the connector
* `GetPayment` - Get a payment
* `InstallConnector` - Install a connector
* `ListAllConnectors` - List all installed connectors
* `ListConfigsAvailableConnectors` - List the configs of each available connector
* `ListConnectorTasks` - List tasks from a connector
* `ListPayments` - List payments
* `PaymentslistAccounts` - List accounts
* `ReadConnectorConfig` - Read the config of a connector
* `ResetConnector` - Reset a connector
* `UninstallConnector` - Uninstall a connector

### Scopes

* `AddTransientScope` - Add a transient scope to a scope
* `CreateScope` - Create scope
* `DeleteScope` - Delete scope
* `DeleteTransientScope` - Delete a transient scope from a scope
* `ListScopes` - List scopes
* `ReadScope` - Read scope
* `UpdateScope` - Update scope

### Script

* `RunScript` - Execute a Numscript

### Search

* `Search` - Search

### Server

* `GetInfo` - Show server information

### Stats

* `ReadStats` - Get statistics from a ledger

### Transactions

* `CreateTransactions` - Create a new batch of transactions to a ledger
* `AddMetadataOnTransaction` - Set the metadata of a transaction by its ID
* `CountTransactions` - Count the transactions from a ledger
* `CreateTransaction` - Create a new transaction to a ledger
* `GetTransaction` - Get transaction from a ledger by its ID
* `ListTransactions` - List transactions from a ledger
* `RevertTransaction` - Revert a ledger transaction by its ID

### Users

* `ListUsers` - List users
* `ReadUser` - Read user

### Wallets

* `ConfirmHold` - Confirm a hold
* `CreateBalance` - Create a balance
* `CreateWallet` - Create a new wallet
* `CreditWallet` - Credit a wallet
* `DebitWallet` - Debit a wallet
* `GetBalance` - Get detailed balance
* `GetHold` - Get a hold
* `GetHolds` - Get all holds for a wallet
* `GetTransactions`
* `GetWallet` - Get a wallet
* `ListBalances` - List balances of a wallet
* `ListWallets` - List all wallets
* `UpdateWallet` - Update a wallet
* `VoidHold` - Cancel a hold
* `WalletsgetServerInfo` - Get server info

### Webhooks

* `ActivateConfig` - Activate one config
* `ChangeConfigSecret` - Change the signing secret of a config
* `DeactivateConfig` - Deactivate one config
* `DeleteConfig` - Delete one config
* `GetManyConfigs` - Get many configs
* `InsertConfig` - Insert a new config
* `TestConfig` - Test one config
<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
