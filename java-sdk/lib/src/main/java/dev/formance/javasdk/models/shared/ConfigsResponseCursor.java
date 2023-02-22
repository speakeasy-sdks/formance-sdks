package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigsResponseCursor {
    @JsonProperty("data")
    public Object[] data;
    public ConfigsResponseCursor withData(Object[] data) {
        this.data = data;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hasMore")
    public Boolean hasMore;
    public ConfigsResponseCursor withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    public String next;
    public ConfigsResponseCursor withNext(String next) {
        this.next = next;
        return this;
    }
    
    @JsonProperty("pageSize")
    public Long pageSize;
    public ConfigsResponseCursor withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    public String previous;
    public ConfigsResponseCursor withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    
}
