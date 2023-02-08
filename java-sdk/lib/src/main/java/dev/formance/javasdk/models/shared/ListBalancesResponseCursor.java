package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class ListBalancesResponseCursor {
    @JsonProperty("data")
    public Balance[] data;
    public ListBalancesResponseCursor withData(Balance[] data) {
        this.data = data;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hasMore")
    public Boolean hasMore;
    public ListBalancesResponseCursor withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    public String next;
    public ListBalancesResponseCursor withNext(String next) {
        this.next = next;
        return this;
    }
    @JsonProperty("pageSize")
    public Long pageSize;
    public ListBalancesResponseCursor withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    public String previous;
    public ListBalancesResponseCursor withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
}
