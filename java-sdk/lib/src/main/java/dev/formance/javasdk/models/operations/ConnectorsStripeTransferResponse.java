package dev.formance.javasdk.models.operations;



public class ConnectorsStripeTransferResponse {
    public String contentType;
    public ConnectorsStripeTransferResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public ConnectorsStripeTransferResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public java.util.Map<String, Object> stripeTransferResponse;
    public ConnectorsStripeTransferResponse withStripeTransferResponse(java.util.Map<String, Object> stripeTransferResponse) {
        this.stripeTransferResponse = stripeTransferResponse;
        return this;
    }
    
}
