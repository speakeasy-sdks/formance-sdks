package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskModulrDescriptor {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountID")
    public String accountID;
    public TaskModulrDescriptor withAccountID(String accountID) {
        this.accountID = accountID;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;
    public TaskModulrDescriptor withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TaskModulrDescriptor withName(String name) {
        this.name = name;
        return this;
    }
    
}
