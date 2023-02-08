package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class ReadUserPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=userId")
    public String userId;
    public ReadUserPathParams withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}
