package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Query {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("after")
    public String[] after;
    public Query withAfter(String[] after) {
        this.after = after;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cursor")
    public String cursor;
    public Query withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ledgers")
    public String[] ledgers;
    public Query withLedgers(String[] ledgers) {
        this.ledgers = ledgers;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pageSize")
    public Long pageSize;
    public Query withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("policy")
    public String policy;
    public Query withPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    public String sort;
    public Query withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("target")
    public String target;
    public Query withTarget(String target) {
        this.target = target;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terms")
    public String[] terms;
    public Query withTerms(String[] terms) {
        this.terms = terms;
        return this;
    }
    
}
