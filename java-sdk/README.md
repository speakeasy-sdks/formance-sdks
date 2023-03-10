# Formance Java SDK

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'dev.formance.javasdk:formance-client-sdk-java:1.3.1'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import dev.formance.javasdk.FormanceAPI;
import dev.formance.javasdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            FormanceAPI.Builder builder = FormanceAPI.builder();

            builder.setSecurity(
                new Security() {{
                    authorization = new SchemeAuthorization() {{
                        authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                    }};
                }}
            );

            FormanceAPI sdk = builder.build();

            PaymentsgetServerInfoResponse res = sdk.paymentsgetServerInfo();

            if (res.serverInfo.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## SDK Available Operations

### FormanceAPI SDK

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
* `getServerInfo` - Get the server info

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
