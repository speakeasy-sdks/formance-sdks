package dev.formance.javasdk.models.operations;



public class ListAllConnectorsResponse {
    public dev.formance.javasdk.models.shared.ConnectorsResponse connectorsResponse;
    public ListAllConnectorsResponse withConnectorsResponse(dev.formance.javasdk.models.shared.ConnectorsResponse connectorsResponse) {
        this.connectorsResponse = connectorsResponse;
        return this;
    }
    
    public String contentType;
    public ListAllConnectorsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public ListAllConnectorsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
