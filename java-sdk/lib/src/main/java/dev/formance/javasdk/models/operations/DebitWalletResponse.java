package dev.formance.javasdk.models.operations;



public class DebitWalletResponse {
    public String contentType;
    public DebitWalletResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.DebitWalletResponse debitWalletResponse;
    public DebitWalletResponse withDebitWalletResponse(dev.formance.javasdk.models.shared.DebitWalletResponse debitWalletResponse) {
        this.debitWalletResponse = debitWalletResponse;
        return this;
    }
    
    public Integer statusCode;
    public DebitWalletResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse;
    public DebitWalletResponse withWalletsErrorResponse(dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
    
}
