package dev.formance.javasdk.models.operations;



public class GetLedgerInfoResponse {
    public String contentType;
    public GetLedgerInfoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public GetLedgerInfoResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Object ledgerInfoResponse;
    public GetLedgerInfoResponse withLedgerInfoResponse(Object ledgerInfoResponse) {
        this.ledgerInfoResponse = ledgerInfoResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetLedgerInfoResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
