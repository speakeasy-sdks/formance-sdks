package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transactions {
    @JsonProperty("transactions")
    public TransactionData[] transactions;
    public Transactions withTransactions(TransactionData[] transactions) {
        this.transactions = transactions;
        return this;
    }
    
}
