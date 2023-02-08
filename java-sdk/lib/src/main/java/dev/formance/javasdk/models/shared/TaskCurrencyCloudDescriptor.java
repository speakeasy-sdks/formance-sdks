package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskCurrencyCloudDescriptor {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TaskCurrencyCloudDescriptor withName(String name) {
        this.name = name;
        return this;
    }
}
