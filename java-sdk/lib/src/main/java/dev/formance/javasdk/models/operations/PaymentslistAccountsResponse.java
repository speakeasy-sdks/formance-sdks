package dev.formance.javasdk.models.operations;



public class PaymentslistAccountsResponse {
    public dev.formance.javasdk.models.shared.AccountsCursor accountsCursor;
    public PaymentslistAccountsResponse withAccountsCursor(dev.formance.javasdk.models.shared.AccountsCursor accountsCursor) {
        this.accountsCursor = accountsCursor;
        return this;
    }
    public String contentType;
    public PaymentslistAccountsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PaymentslistAccountsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
