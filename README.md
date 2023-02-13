# Formance SDKs

<div align="center">
<img src="https://img.shields.io/github/actions/workflow/status/speakeasy-sdks/formance-sdks/speakeasy_sdk_generation.yml?style=for-the-badge" />
 <a href="https://docs.formance.com/api/stack/v1.0#section/Introduction"><img src="https://img.shields.io/static/v1?label=Docs&message=API Ref&color=000&style=for-the-badge" /></a>
</div>

SDKs for the [Formance Stack API](https://docs.formance.com/api/stack/v1.0). Formance Stack is an open-source suite of modular tools designed to help developers build, operate, and track money movements of any size and shape. The suite includes a range of products that provide technical introductions, how-tos, and reference documents for each component. Whether you are building a small money-moving application or a large-scale financial platform, Formance Stack has the tools and resources you need to get started.

<!-- Start SDK Installation -->
## SDK Installation

Please see instructions on fetching from package managers for each language specific SDK.

<!-- End SDK Installation -->

## Authentication

Formance Stack offers one form of authentication:
  - **OAuth2** - an open protocol to allow secure authorization in a simple
and standard method from web, mobile and desktop applications.

## SDK Example Usage

Please see example usage for each language specific SDK. Here is an example for Typescript.
<!-- Start SDK Example Usage -->
```typescript
import { FormanceAPI, withSecurity} from "@formance/sdk";
import { GetServerInfoResponse } from "@formance/sdk/src/sdk/models/operations";
import { AxiosError } from "axios";

const sdk = new FormanceAPI(withSecurity(
  security: {
    authorization: {
      authorization: "Bearer YOUR_ACCESS_TOKEN_HERE",
    },
  }
));

sdk.getServerInfo().then((res: GetServerInfoResponse | AxiosError) => {
   // handle response
});
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## SDK Available Operations

### FormanceAPI SDK

* `getServerInfo` - Get server info
* `paymentsgetServerInfo` - Get server info
* `searchgetServerInfo` - Get server info

### accounts

* `addMetadataToAccount` - Add metadata to an account
* `countAccounts` - Count the accounts from a ledger
* `getAccount` - Get account by its address
* `listAccounts` - List accounts from a ledger

### balances

* `getBalances` - Get the balances from a ledger's account
* `getBalancesAggregated` - Get the aggregated balances from selected accounts

### clients

* `addScopeToClient` - Add scope to client
* `createClient` - Create client
* `createSecret` - Add a secret to a client
* `deleteClient` - Delete client
* `deleteScopeFromClient` - Delete scope from client
* `deleteSecret` - Delete a secret from a client
* `listClients` - List clients
* `readClient` - Read client
* `updateClient` - Update client

### ledger

* `getLedgerInfo` - Get information about a ledger

### logs

* `listLogs` - List the logs from a ledger

### mapping

* `getMapping` - Get the mapping of a ledger
* `updateMapping` - Update the mapping of a ledger

### orchestration

* `createWorkflow` - Create workflow
* `getFlow` - Get a flow by id
* `getWorkflowOccurrence` - Get a workflow occurrence by id
* `listFlows` - List registered flows
* `listRuns` - List occurrences of a workflow
* `orchestrationgetServerInfo` - Get server info
* `runWorkflow` - Run workflow

### payments

* `connectorsStripeTransfer` - Transfer funds between Stripe accounts
* `getConnectorTask` - Read a specific task of the connector
* `getPayment` - Get a payment
* `installConnector` - Install a connector
* `listAllConnectors` - List all installed connectors
* `listConfigsAvailableConnectors` - List the configs of each available connector
* `listConnectorTasks` - List tasks from a connector
* `listPayments` - List payments
* `paymentslistAccounts` - List accounts
* `readConnectorConfig` - Read the config of a connector
* `resetConnector` - Reset a connector
* `uninstallConnector` - Uninstall a connector

### scopes

* `addTransientScope` - Add a transient scope to a scope
* `createScope` - Create scope
* `deleteScope` - Delete scope
* `deleteTransientScope` - Delete a transient scope from a scope
* `listScopes` - List scopes
* `readScope` - Read scope
* `updateScope` - Update scope

### script

* `runScript` - Execute a Numscript

### search

* `search` - Search

### server

* `getInfo` - Show server information

### stats

* `readStats` - Get statistics from a ledger

### transactions

* `createTransactions` - Create a new batch of transactions to a ledger
* `addMetadataOnTransaction` - Set the metadata of a transaction by its ID
* `countTransactions` - Count the transactions from a ledger
* `createTransaction` - Create a new transaction to a ledger
* `getTransaction` - Get transaction from a ledger by its ID
* `listTransactions` - List transactions from a ledger
* `revertTransaction` - Revert a ledger transaction by its ID

### users

* `listUsers` - List users
* `readUser` - Read user

### wallets

* `confirmHold` - Confirm a hold
* `createBalance` - Create a balance
* `createWallet` - Create a new wallet
* `creditWallet` - Credit a wallet
* `debitWallet` - Debit a wallet
* `getBalance` - Get detailed balance
* `getHold` - Get a hold
* `getHolds` - Get all holds for a wallet
* `getTransactions`
* `getWallet` - Get a wallet
* `listBalances` - List balances of a wallet
* `listWallets` - List all wallets
* `updateWallet` - Update a wallet
* `voidHold` - Cancel a hold
* `walletsgetServerInfo` - Get server info

### webhooks

* `activateConfig` - Activate one config
* `changeConfigSecret` - Change the signing secret of a config
* `deactivateConfig` - Deactivate one config
* `deleteConfig` - Delete one config
* `getManyConfigs` - Get many configs
* `insertConfig` - Insert a new config
* `testConfig` - Test one config
<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
