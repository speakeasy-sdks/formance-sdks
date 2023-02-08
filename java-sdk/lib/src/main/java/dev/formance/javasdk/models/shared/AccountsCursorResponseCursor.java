package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class AccountsCursorResponseCursor {
    @JsonProperty("data")
    public Account[] data;
    public AccountsCursorResponseCursor withData(Account[] data) {
        this.data = data;
        return this;
    }
    @JsonProperty("hasMore")
    public Boolean hasMore;
    public AccountsCursorResponseCursor withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    public String next;
    public AccountsCursorResponseCursor withNext(String next) {
        this.next = next;
        return this;
    }
    @JsonProperty("pageSize")
    public Long pageSize;
    public AccountsCursorResponseCursor withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    public String previous;
    public AccountsCursorResponseCursor withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
}
