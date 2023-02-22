package dev.formance.javasdk.models.operations;



public class GetTransactionResponse {
    public String contentType;
    public GetTransactionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public GetTransactionResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetTransactionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.TransactionResponse transactionResponse;
    public GetTransactionResponse withTransactionResponse(dev.formance.javasdk.models.shared.TransactionResponse transactionResponse) {
        this.transactionResponse = transactionResponse;
        return this;
    }
    
}
