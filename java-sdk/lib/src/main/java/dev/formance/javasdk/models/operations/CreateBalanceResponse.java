package dev.formance.javasdk.models.operations;



public class CreateBalanceResponse {
    public String contentType;
    public CreateBalanceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.CreateBalanceResponse createBalanceResponse;
    public CreateBalanceResponse withCreateBalanceResponse(dev.formance.javasdk.models.shared.CreateBalanceResponse createBalanceResponse) {
        this.createBalanceResponse = createBalanceResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateBalanceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse;
    public CreateBalanceResponse withWalletsErrorResponse(dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
    
}
