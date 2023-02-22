package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.formance.javasdk.utils.DateTimeDeserializer;
import dev.formance.javasdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class PostTransaction {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public PostTransaction withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postings")
    public Posting[] postings;
    public PostTransaction withPostings(Posting[] postings) {
        this.postings = postings;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    public String reference;
    public PostTransaction withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("script")
    public PostTransactionScript script;
    public PostTransaction withScript(PostTransactionScript script) {
        this.script = script;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("timestamp")
    public OffsetDateTime timestamp;
    public PostTransaction withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
}
