package dev.formance.javasdk.models.operations;



public class ListClientsResponse {
    public String contentType;
    public ListClientsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.ListClientsResponse listClientsResponse;
    public ListClientsResponse withListClientsResponse(dev.formance.javasdk.models.shared.ListClientsResponse listClientsResponse) {
        this.listClientsResponse = listClientsResponse;
        return this;
    }
    public Long statusCode;
    public ListClientsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
