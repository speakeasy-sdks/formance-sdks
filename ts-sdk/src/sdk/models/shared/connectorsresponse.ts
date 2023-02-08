import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { ConnectorEnum } from "./connectorenum";


export class ConnectorsResponseData extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=enabled" })
  enabled?: boolean;

  @SpeakeasyMetadata({ data: "json, name=provider" })
  provider?: ConnectorEnum;
}

export class ConnectorsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data", elemType: ConnectorsResponseData })
  data: ConnectorsResponseData[];
}