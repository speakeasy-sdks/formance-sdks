package dev.formance.javasdk.models.shared;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=oauth2")
    public SchemeAuthorization authorization;
    public Security withAuthorization(SchemeAuthorization authorization) {
        this.authorization = authorization;
        return this;
    }
}
