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
    
    public Integer statusCode;
    public GetPaymentResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
