package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Balance {
    @JsonProperty("name")
    public String name;
    public Balance withName(String name) {
        this.name = name;
        return this;
    }
    
}
