package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.formance.javasdk.utils.DateTimeDeserializer;
import dev.formance.javasdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class WalletsTransaction {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public WalletsTransaction withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postCommitVolumes")
    public java.util.Map<String, java.util.Map<String, WalletsVolume>> postCommitVolumes;
    public WalletsTransaction withPostCommitVolumes(java.util.Map<String, java.util.Map<String, WalletsVolume>> postCommitVolumes) {
        this.postCommitVolumes = postCommitVolumes;
        return this;
    }
    
    @JsonProperty("postings")
    public Posting[] postings;
    public WalletsTransaction withPostings(Posting[] postings) {
        this.postings = postings;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preCommitVolumes")
    public java.util.Map<String, java.util.Map<String, WalletsVolume>> preCommitVolumes;
    public WalletsTransaction withPreCommitVolumes(java.util.Map<String, java.util.Map<String, WalletsVolume>> preCommitVolumes) {
        this.preCommitVolumes = preCommitVolumes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    public String reference;
    public WalletsTransaction withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("timestamp")
    public OffsetDateTime timestamp;
    public WalletsTransaction withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
    @JsonProperty("txid")
    public Long txid;
    public WalletsTransaction withTxid(Long txid) {
        this.txid = txid;
        return this;
    }
    
}
