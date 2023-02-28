package dev.formance.javasdk.models.operations;



public class TestConfigResponse {
    public dev.formance.javasdk.models.shared.AttemptResponse attemptResponse;
    public TestConfigResponse withAttemptResponse(dev.formance.javasdk.models.shared.AttemptResponse attemptResponse) {
        this.attemptResponse = attemptResponse;
        return this;
    }
    
    public String contentType;
    public TestConfigResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public TestConfigResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
