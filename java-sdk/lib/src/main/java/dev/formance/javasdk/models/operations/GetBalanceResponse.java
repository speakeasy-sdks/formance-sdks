package dev.formance.javasdk.models.operations;



public class GetBalanceResponse {
    public String contentType;
    public GetBalanceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.GetBalanceResponse getBalanceResponse;
    public GetBalanceResponse withGetBalanceResponse(dev.formance.javasdk.models.shared.GetBalanceResponse getBalanceResponse) {
        this.getBalanceResponse = getBalanceResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetBalanceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse;
    public GetBalanceResponse withWalletsErrorResponse(dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
    
}
