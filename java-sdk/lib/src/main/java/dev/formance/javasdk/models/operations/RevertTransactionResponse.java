package dev.formance.javasdk.models.operations;



public class RevertTransactionResponse {
    public String contentType;
    public RevertTransactionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public RevertTransactionResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public RevertTransactionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.TransactionResponse transactionResponse;
    public RevertTransactionResponse withTransactionResponse(dev.formance.javasdk.models.shared.TransactionResponse transactionResponse) {
        this.transactionResponse = transactionResponse;
        return this;
    }
    
}
