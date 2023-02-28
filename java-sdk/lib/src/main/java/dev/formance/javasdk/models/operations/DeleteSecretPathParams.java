package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class DeleteSecretPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=clientId")
    public String clientId;
    public DeleteSecretPathParams withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=secretId")
    public String secretId;
    public DeleteSecretPathParams withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    
}
