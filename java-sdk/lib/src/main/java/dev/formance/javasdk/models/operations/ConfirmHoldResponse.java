package dev.formance.javasdk.models.operations;



public class ConfirmHoldResponse {
    public String contentType;
    public ConfirmHoldResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public ConfirmHoldResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse;
    public ConfirmHoldResponse withWalletsErrorResponse(dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
}
