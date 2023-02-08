package dev.formance.javasdk.models.operations;



public class GetWalletResponse {
    public String contentType;
    public GetWalletResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.GetWalletResponse getWalletResponse;
    public GetWalletResponse withGetWalletResponse(dev.formance.javasdk.models.shared.GetWalletResponse getWalletResponse) {
        this.getWalletResponse = getWalletResponse;
        return this;
    }
    public Long statusCode;
    public GetWalletResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse;
    public GetWalletResponse withWalletsErrorResponse(dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
}
