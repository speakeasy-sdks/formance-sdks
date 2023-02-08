import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class ConfigChangeSecret extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=secret" })
  secret?: string;
}