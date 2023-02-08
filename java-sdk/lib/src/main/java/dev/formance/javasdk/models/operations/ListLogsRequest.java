package dev.formance.javasdk.models.operations;



public class ListLogsRequest {
    public ListLogsPathParams pathParams;
    public ListLogsRequest withPathParams(ListLogsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public ListLogsQueryParams queryParams;
    public ListLogsRequest withQueryParams(ListLogsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}
