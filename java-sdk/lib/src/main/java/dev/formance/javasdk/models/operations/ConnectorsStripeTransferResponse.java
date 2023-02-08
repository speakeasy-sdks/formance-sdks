package dev.formance.javasdk.models.operations;

import java.time.OffsetDateTime;

public class ConnectorsStripeTransferResponse {
    public String contentType;
    public ConnectorsStripeTransferResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public ConnectorsStripeTransferResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public java.util.Map<String, Object> stripeTransferResponse;
    public ConnectorsStripeTransferResponse withStripeTransferResponse(java.util.Map<String, Object> stripeTransferResponse) {
        this.stripeTransferResponse = stripeTransferResponse;
        return this;
    }
}
