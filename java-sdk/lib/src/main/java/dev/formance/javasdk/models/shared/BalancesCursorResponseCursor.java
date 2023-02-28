package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BalancesCursorResponseCursor {
    @JsonProperty("data")
    public java.util.Map<String, java.util.Map<String, Long>>[] data;
    public BalancesCursorResponseCursor withData(java.util.Map<String, java.util.Map<String, Long>>[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("hasMore")
    public Boolean hasMore;
    public BalancesCursorResponseCursor withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    public String next;
    public BalancesCursorResponseCursor withNext(String next) {
        this.next = next;
        return this;
    }
    
    @JsonProperty("pageSize")
    public Long pageSize;
    public BalancesCursorResponseCursor withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    public String previous;
    public BalancesCursorResponseCursor withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    
}
