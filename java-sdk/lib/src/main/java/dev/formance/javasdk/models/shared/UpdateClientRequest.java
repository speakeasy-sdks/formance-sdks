package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateClientRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public UpdateClientRequest withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public UpdateClientRequest withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public UpdateClientRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postLogoutRedirectUris")
    public String[] postLogoutRedirectUris;
    public UpdateClientRequest withPostLogoutRedirectUris(String[] postLogoutRedirectUris) {
        this.postLogoutRedirectUris = postLogoutRedirectUris;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public")
    public Boolean public_;
    public UpdateClientRequest withPublic(Boolean public_) {
        this.public_ = public_;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("redirectUris")
    public String[] redirectUris;
    public UpdateClientRequest withRedirectUris(String[] redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trusted")
    public Boolean trusted;
    public UpdateClientRequest withTrusted(Boolean trusted) {
        this.trusted = trusted;
        return this;
    }
    
}
