package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class Hold {
    @JsonProperty("description")
    public String description;
    public Hold withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destination")
    public Object destination;
    public Hold withDestination(Object destination) {
        this.destination = destination;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public Hold withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public Hold withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    @JsonProperty("walletID")
    public String walletID;
    public Hold withWalletID(String walletID) {
        this.walletID = walletID;
        return this;
    }
}
