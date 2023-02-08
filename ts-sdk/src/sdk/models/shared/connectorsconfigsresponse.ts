import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class ConnectorsConfigsResponseDataConnectorKey extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=dataType" })
  dataType: string;

  @SpeakeasyMetadata({ data: "json, name=required" })
  required: boolean;
}

export class ConnectorsConfigsResponseDataConnector extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=key" })
  key: ConnectorsConfigsResponseDataConnectorKey;
}

export class ConnectorsConfigsResponseData extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=connector" })
  connector: ConnectorsConfigsResponseDataConnector;
}

export class ConnectorsConfigsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: ConnectorsConfigsResponseData;
}