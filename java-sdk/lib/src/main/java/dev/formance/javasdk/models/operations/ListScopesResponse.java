package dev.formance.javasdk.models.operations;



public class ListScopesResponse {
    public String contentType;
    public ListScopesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.ListScopesResponse listScopesResponse;
    public ListScopesResponse withListScopesResponse(dev.formance.javasdk.models.shared.ListScopesResponse listScopesResponse) {
        this.listScopesResponse = listScopesResponse;
        return this;
    }
    public Long statusCode;
    public ListScopesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
