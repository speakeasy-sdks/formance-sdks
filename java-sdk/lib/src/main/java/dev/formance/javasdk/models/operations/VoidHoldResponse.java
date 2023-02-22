package dev.formance.javasdk.models.operations;



public class VoidHoldResponse {
    public String contentType;
    public VoidHoldResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public VoidHoldResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse;
    public VoidHoldResponse withWalletsErrorResponse(dev.formance.javasdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
    
}
