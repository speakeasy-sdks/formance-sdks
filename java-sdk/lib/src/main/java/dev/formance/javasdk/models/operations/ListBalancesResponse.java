package dev.formance.javasdk.models.operations;



public class ListBalancesResponse {
    public String contentType;
    public ListBalancesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.ListBalancesResponse listBalancesResponse;
    public ListBalancesResponse withListBalancesResponse(dev.formance.javasdk.models.shared.ListBalancesResponse listBalancesResponse) {
        this.listBalancesResponse = listBalancesResponse;
        return this;
    }
    public Long statusCode;
    public ListBalancesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
