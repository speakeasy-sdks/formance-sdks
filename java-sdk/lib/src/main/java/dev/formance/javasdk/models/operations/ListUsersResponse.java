package dev.formance.javasdk.models.operations;



public class ListUsersResponse {
    public String contentType;
    public ListUsersResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ListUsersResponse listUsersResponse;
    public ListUsersResponse withListUsersResponse(dev.formance.javasdk.models.shared.ListUsersResponse listUsersResponse) {
        this.listUsersResponse = listUsersResponse;
        return this;
    }
    
    public Integer statusCode;
    public ListUsersResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
