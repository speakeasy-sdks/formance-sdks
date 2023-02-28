package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServerInfo {
    @JsonProperty("version")
    public String version;
    public ServerInfo withVersion(String version) {
        this.version = version;
        return this;
    }
    
}
