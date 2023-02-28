package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateBalanceRequest {
    @JsonProperty("name")
    public String name;
    public CreateBalanceRequest withName(String name) {
        this.name = name;
        return this;
    }
    
}
