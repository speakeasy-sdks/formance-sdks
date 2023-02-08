package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;

public class ListLogsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=after")
    public String after;
    public ListLogsQueryParams withAfter(String after) {
        this.after = after;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    public String cursor;
    public ListLogsQueryParams withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=endTime")
    public OffsetDateTime endTime;
    public ListLogsQueryParams withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    public Long pageSize;
    public ListLogsQueryParams withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pagination_token")
    public String paginationToken;
    public ListLogsQueryParams withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=startTime")
    public OffsetDateTime startTime;
    public ListLogsQueryParams withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }
}
