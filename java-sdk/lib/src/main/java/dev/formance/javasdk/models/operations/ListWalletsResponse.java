package dev.formance.javasdk.models.operations;



public class ListWalletsResponse {
    public String contentType;
    public ListWalletsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.ListWalletsResponse listWalletsResponse;
    public ListWalletsResponse withListWalletsResponse(dev.formance.javasdk.models.shared.ListWalletsResponse listWalletsResponse) {
        this.listWalletsResponse = listWalletsResponse;
        return this;
    }
    public Long statusCode;
    public ListWalletsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
