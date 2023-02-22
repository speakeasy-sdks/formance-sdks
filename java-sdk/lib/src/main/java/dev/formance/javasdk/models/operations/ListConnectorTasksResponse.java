package dev.formance.javasdk.models.operations;



public class ListConnectorTasksResponse {
    public String contentType;
    public ListConnectorTasksResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public ListConnectorTasksResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.TasksCursor tasksCursor;
    public ListConnectorTasksResponse withTasksCursor(dev.formance.javasdk.models.shared.TasksCursor tasksCursor) {
        this.tasksCursor = tasksCursor;
        return this;
    }
    
}
