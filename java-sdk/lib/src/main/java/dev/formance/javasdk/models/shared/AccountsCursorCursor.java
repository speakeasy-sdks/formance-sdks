package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountsCursorCursor {
    @JsonProperty("data")
    public PaymentsAccount[] data;
    public AccountsCursorCursor withData(PaymentsAccount[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("hasMore")
    public Boolean hasMore;
    public AccountsCursorCursor withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    public String next;
    public AccountsCursorCursor withNext(String next) {
        this.next = next;
        return this;
    }
    
    @JsonProperty("pageSize")
    public Long pageSize;
    public AccountsCursorCursor withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    public String previous;
    public AccountsCursorCursor withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    
}
