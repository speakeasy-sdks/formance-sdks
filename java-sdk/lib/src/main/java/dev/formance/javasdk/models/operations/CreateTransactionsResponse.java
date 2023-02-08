package dev.formance.javasdk.models.operations;



public class CreateTransactionsResponse {
    public String contentType;
    public CreateTransactionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public CreateTransactionsResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    public Long statusCode;
    public CreateTransactionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public dev.formance.javasdk.models.shared.TransactionsResponse transactionsResponse;
    public CreateTransactionsResponse withTransactionsResponse(dev.formance.javasdk.models.shared.TransactionsResponse transactionsResponse) {
        this.transactionsResponse = transactionsResponse;
        return this;
    }
}
