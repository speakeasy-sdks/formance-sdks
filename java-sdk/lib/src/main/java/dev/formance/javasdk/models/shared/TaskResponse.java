package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskResponse {
    @JsonProperty("data")
    public Object data;
    public TaskResponse withData(Object data) {
        this.data = data;
        return this;
    }
    
}
