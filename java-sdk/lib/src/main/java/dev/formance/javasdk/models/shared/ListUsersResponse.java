package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListUsersResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public User[] data;
    public ListUsersResponse withData(User[] data) {
        this.data = data;
        return this;
    }
    
}
