import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Config } from "./config";
import { Expose, Type } from "class-transformer";


export class ConfigInfo extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "config" })
  @Type(() => Config)
  config: Config;

  @SpeakeasyMetadata()
  @Expose({ name: "server" })
  server: string;

  @SpeakeasyMetadata()
  @Expose({ name: "version" })
  version: string;
}