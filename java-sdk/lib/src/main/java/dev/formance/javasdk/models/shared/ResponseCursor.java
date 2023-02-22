package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseCursor {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public java.util.Map<String, Object>[] data;
    public ResponseCursor withData(java.util.Map<String, Object>[] data) {
        this.data = data;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hasMore")
    public Boolean hasMore;
    public ResponseCursor withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    public String next;
    public ResponseCursor withNext(String next) {
        this.next = next;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pageSize")
    public Long pageSize;
    public ResponseCursor withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    public String previous;
    public ResponseCursor withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total")
    public ResponseCursorTotal total;
    public ResponseCursor withTotal(ResponseCursorTotal total) {
        this.total = total;
        return this;
    }
    
}
