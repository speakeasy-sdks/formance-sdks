package dev.formance.javasdk.models.operations;

import dev.formance.javasdk.utils.SpeakeasyMetadata;

public class UninstallConnectorPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connector")
    public dev.formance.javasdk.models.shared.ConnectorEnum connector;
    public UninstallConnectorPathParams withConnector(dev.formance.javasdk.models.shared.ConnectorEnum connector) {
        this.connector = connector;
        return this;
    }
}
