package dev.formance.javasdk.models.operations;



public class ListRunsResponse {
    public String contentType;
    public ListRunsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.formance.javasdk.models.shared.Error error;
    public ListRunsResponse withError(dev.formance.javasdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Object listRunsResponse;
    public ListRunsResponse withListRunsResponse(Object listRunsResponse) {
        this.listRunsResponse = listRunsResponse;
        return this;
    }
    public Long statusCode;
    public ListRunsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
