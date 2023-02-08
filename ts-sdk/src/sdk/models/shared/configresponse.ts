import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class ConfigResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: any;
}