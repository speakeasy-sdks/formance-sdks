package dev.formance.javasdk.models.operations;



public class ListTransactionsRequest {
    public ListTransactionsPathParams pathParams;
    public ListTransactionsRequest withPathParams(ListTransactionsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public ListTransactionsQueryParams queryParams;
    public ListTransactionsRequest withQueryParams(ListTransactionsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}
