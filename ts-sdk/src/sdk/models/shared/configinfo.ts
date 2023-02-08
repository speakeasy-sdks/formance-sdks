import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Config } from "./config";


export class ConfigInfo extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=config" })
  config: Config;

  @SpeakeasyMetadata({ data: "json, name=server" })
  server: string;

  @SpeakeasyMetadata({ data: "json, name=version" })
  version: string;
}