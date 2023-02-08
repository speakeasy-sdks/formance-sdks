import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { ConfigInfo } from "./configinfo";


export class ConfigInfoResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: ConfigInfo;
}