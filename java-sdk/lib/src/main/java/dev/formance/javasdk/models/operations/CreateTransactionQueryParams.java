package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class CreateTransactionQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=preview")
    public Boolean preview;
    public CreateTransactionQueryParams withPreview(Boolean preview) {
        this.preview = preview;
        return this;
    }
    
}
