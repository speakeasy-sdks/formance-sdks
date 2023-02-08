import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class ConnectorConfigResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: any;
}