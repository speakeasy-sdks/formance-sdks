package dev.formance.javasdk.models.operations;



public class CreateWalletResponse {
    public String contentType;
    public CreateWalletResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.CreateWalletResponse createWalletResponse;
    public CreateWalletResponse withCreateWalletResponse(dev.formance.javasdk.models.shared.CreateWalletResponse createWalletResponse) {
        this.createWalletResponse = createWalletResponse;
        return this;
    }
    public Long statusCode;
    public CreateWalletResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse;
    public CreateWalletResponse withWalletsErrorResponse(dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
}
