package dev.formance.javasdk.models.operations;



public class GetBalancesResponse {
    public dev.formance.javasdk.models.shared.BalancesCursorResponse balancesCursorResponse;
    public GetBalancesResponse withBalancesCursorResponse(dev.formance.javasdk.models.shared.BalancesCursorResponse balancesCursorResponse) {
        this.balancesCursorResponse = balancesCursorResponse;
        return this;
    }
    
    public String contentType;
    public GetBalancesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public GetBalancesResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetBalancesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
