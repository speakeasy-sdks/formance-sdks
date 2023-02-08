package dev.formance.javasdk.models.operations;



public class CountTransactionsRequest {
    public CountTransactionsPathParams pathParams;
    public CountTransactionsRequest withPathParams(CountTransactionsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public CountTransactionsQueryParams queryParams;
    public CountTransactionsRequest withQueryParams(CountTransactionsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}
