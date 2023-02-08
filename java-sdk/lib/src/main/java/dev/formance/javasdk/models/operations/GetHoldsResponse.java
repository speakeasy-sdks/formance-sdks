package dev.formance.javasdk.models.operations;



public class GetHoldsResponse {
    public String contentType;
    public GetHoldsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.GetHoldsResponse getHoldsResponse;
    public GetHoldsResponse withGetHoldsResponse(dev.formance.javasdk.models.shared.GetHoldsResponse getHoldsResponse) {
        this.getHoldsResponse = getHoldsResponse;
        return this;
    }
    public Long statusCode;
    public GetHoldsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse;
    public GetHoldsResponse withWalletsErrorResponse(dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
}
