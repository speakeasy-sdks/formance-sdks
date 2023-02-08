package dev.formance.javasdk.models.operations;



public class GetHoldResponse {
    public String contentType;
    public GetHoldResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.GetHoldResponse getHoldResponse;
    public GetHoldResponse withGetHoldResponse(dev.formance.javasdk.models.shared.GetHoldResponse getHoldResponse) {
        this.getHoldResponse = getHoldResponse;
        return this;
    }
    public Long statusCode;
    public GetHoldResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse;
    public GetHoldResponse withWalletsErrorResponse(dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
}
