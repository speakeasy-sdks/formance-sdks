package dev.formance.javasdk.models.operations;



public class RunScriptResponse {
    public String contentType;
    public RunScriptResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.formance.javasdk.models.shared.ScriptResponse scriptResponse;
    public RunScriptResponse withScriptResponse(dev.formance.javasdk.models.shared.ScriptResponse scriptResponse) {
        this.scriptResponse = scriptResponse;
        return this;
    }
    
    public Integer statusCode;
    public RunScriptResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
