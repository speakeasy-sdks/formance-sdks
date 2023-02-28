package dev.formance.javasdk.models.operations;



public class ReadStatsResponse {
    public String contentType;
    public ReadStatsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public ReadStatsResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.StatsResponse statsResponse;
    public ReadStatsResponse withStatsResponse(dev.formance.javasdk.models.shared.StatsResponse statsResponse) {
        this.statsResponse = statsResponse;
        return this;
    }
    
    public Integer statusCode;
    public ReadStatsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
