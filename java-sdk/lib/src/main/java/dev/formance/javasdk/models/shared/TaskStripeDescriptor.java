package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskStripeDescriptor {
    @JsonProperty("account")
    public String account;
    public TaskStripeDescriptor withAccount(String account) {
        this.account = account;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("main")
    public Boolean main;
    public TaskStripeDescriptor withMain(Boolean main) {
        this.main = main;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public TaskStripeDescriptor withName(String name) {
        this.name = name;
        return this;
    }
    
}
