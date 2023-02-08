package dev.formance.javasdk.models.operations;



public class GetPaymentResponse {
    public String contentType;
    public GetPaymentResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.PaymentResponse paymentResponse;
    public GetPaymentResponse withPaymentResponse(dev.formance.javasdk.models.shared.PaymentResponse paymentResponse) {
        this.paymentResponse = paymentResponse;
        return this;
    }
    public Long statusCode;
    public GetPaymentResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
