package dev.formance.javasdk.models.operations;



public class GetBalancesRequest {
    public GetBalancesPathParams pathParams;
    public GetBalancesRequest withPathParams(GetBalancesPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetBalancesQueryParams queryParams;
    public GetBalancesRequest withQueryParams(GetBalancesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}
