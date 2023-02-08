package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class GetManyConfigsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=endpoint")
    public String endpoint;
    public GetManyConfigsQueryParams withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=id")
    public String id;
    public GetManyConfigsQueryParams withId(String id) {
        this.id = id;
        return this;
    }
}
