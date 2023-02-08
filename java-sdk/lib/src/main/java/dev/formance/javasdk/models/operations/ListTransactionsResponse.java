package dev.formance.javasdk.models.operations;



public class ListTransactionsResponse {
    public String contentType;
    public ListTransactionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public ListTransactionsResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    public Long statusCode;
    public ListTransactionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public dev.formance.javasdk.models.shared.TransactionsCursorResponse transactionsCursorResponse;
    public ListTransactionsResponse withTransactionsCursorResponse(dev.formance.javasdk.models.shared.TransactionsCursorResponse transactionsCursorResponse) {
        this.transactionsCursorResponse = transactionsCursorResponse;
        return this;
    }
}
