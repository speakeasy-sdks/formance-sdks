package dev.formance.javasdk.models.operations;



public class UpdateWalletResponse {
    public String contentType;
    public UpdateWalletResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public UpdateWalletResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse;
    public UpdateWalletResponse withWalletsErrorResponse(dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
    
}
