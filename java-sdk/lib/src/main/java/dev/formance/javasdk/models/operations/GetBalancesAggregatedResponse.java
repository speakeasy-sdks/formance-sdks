package dev.formance.javasdk.models.operations;



public class GetBalancesAggregatedResponse {
    public dev.formance.javasdk.models.shared.AggregateBalancesResponse aggregateBalancesResponse;
    public GetBalancesAggregatedResponse withAggregateBalancesResponse(dev.formance.javasdk.models.shared.AggregateBalancesResponse aggregateBalancesResponse) {
        this.aggregateBalancesResponse = aggregateBalancesResponse;
        return this;
    }
    public String contentType;
    public GetBalancesAggregatedResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public GetBalancesAggregatedResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    public Long statusCode;
    public GetBalancesAggregatedResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
