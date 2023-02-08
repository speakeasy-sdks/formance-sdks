package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskBankingCircleDescriptor {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;
    public TaskBankingCircleDescriptor withKey(String key) {
        this.key = key;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TaskBankingCircleDescriptor withName(String name) {
        this.name = name;
        return this;
    }
}
