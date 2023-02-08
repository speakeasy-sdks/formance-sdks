package dev.formance.javasdk.models.operations;



public class CountAccountsRequest {
    public CountAccountsPathParams pathParams;
    public CountAccountsRequest withPathParams(CountAccountsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public CountAccountsQueryParams queryParams;
    public CountAccountsRequest withQueryParams(CountAccountsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}
