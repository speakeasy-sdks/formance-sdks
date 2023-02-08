package dev.formance.javasdk.models.shared;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class SchemeAuthorization {
    @SpeakeasyMetadata("security:name=Authorization")
    public String authorization;
    public SchemeAuthorization withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
}
