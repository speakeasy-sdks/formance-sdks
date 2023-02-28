import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose } from "class-transformer";


export class ConfigUser extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "endpoint" })
  endpoint: string;

  @SpeakeasyMetadata()
  @Expose({ name: "eventTypes" })
  eventTypes: string[];

  @SpeakeasyMetadata()
  @Expose({ name: "secret" })
  secret?: string;
}