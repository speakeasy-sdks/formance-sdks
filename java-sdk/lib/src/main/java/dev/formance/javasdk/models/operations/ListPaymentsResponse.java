package dev.formance.javasdk.models.operations;



public class ListPaymentsResponse {
    public String contentType;
    public ListPaymentsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.PaymentsCursor paymentsCursor;
    public ListPaymentsResponse withPaymentsCursor(dev.formance.javasdk.models.shared.PaymentsCursor paymentsCursor) {
        this.paymentsCursor = paymentsCursor;
        return this;
    }
    public Long statusCode;
    public ListPaymentsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
