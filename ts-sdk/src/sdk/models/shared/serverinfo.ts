import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class ServerInfo extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=version" })
  version: string;
}