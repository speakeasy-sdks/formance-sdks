package dev.formance.javasdk.models.operations;



public class ListAccountsResponse {
    public dev.formance.javasdk.models.shared.AccountsCursorResponse accountsCursorResponse;
    public ListAccountsResponse withAccountsCursorResponse(dev.formance.javasdk.models.shared.AccountsCursorResponse accountsCursorResponse) {
        this.accountsCursorResponse = accountsCursorResponse;
        return this;
    }
    public String contentType;
    public ListAccountsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public ListAccountsResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    public Long statusCode;
    public ListAccountsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
