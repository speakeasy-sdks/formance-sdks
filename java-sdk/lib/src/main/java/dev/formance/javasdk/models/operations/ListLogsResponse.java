package dev.formance.javasdk.models.operations;



public class ListLogsResponse {
    public String contentType;
    public ListLogsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.ErrorResponse errorResponse;
    public ListLogsResponse withErrorResponse(dev.formance.javasdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    public dev.formance.javasdk.models.shared.LogsCursorResponse logsCursorResponse;
    public ListLogsResponse withLogsCursorResponse(dev.formance.javasdk.models.shared.LogsCursorResponse logsCursorResponse) {
        this.logsCursorResponse = logsCursorResponse;
        return this;
    }
    public Long statusCode;
    public ListLogsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
