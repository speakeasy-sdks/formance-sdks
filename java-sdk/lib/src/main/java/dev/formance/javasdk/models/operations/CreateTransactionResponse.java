package dev.formance.javasdk.models.operations;



public class CreateTransactionResponse {
    public String contentType;
    public CreateTransactionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public CreateTransactionResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateTransactionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.TransactionsResponse transactionsResponse;
    public CreateTransactionResponse withTransactionsResponse(dev.formance.javasdk.models.shared.TransactionsResponse transactionsResponse) {
        this.transactionsResponse = transactionsResponse;
        return this;
    }
    
}
