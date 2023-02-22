package dev.formance.javasdk.models.operations;



public class ListAccountsRequest {
    public ListAccountsPathParams pathParams;
    public ListAccountsRequest withPathParams(ListAccountsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public ListAccountsQueryParams queryParams;
    public ListAccountsRequest withQueryParams(ListAccountsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
}
