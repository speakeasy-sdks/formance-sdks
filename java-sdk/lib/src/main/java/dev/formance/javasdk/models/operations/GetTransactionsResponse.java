package dev.formance.javasdk.models.operations;



public class GetTransactionsResponse {
    public String contentType;
    public GetTransactionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.GetTransactionsResponse getTransactionsResponse;
    public GetTransactionsResponse withGetTransactionsResponse(dev.formance.javasdk.models.shared.GetTransactionsResponse getTransactionsResponse) {
        this.getTransactionsResponse = getTransactionsResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetTransactionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse;
    public GetTransactionsResponse withWalletsErrorResponse(dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
    
}
