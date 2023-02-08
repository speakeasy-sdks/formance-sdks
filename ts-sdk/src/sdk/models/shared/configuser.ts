import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class ConfigUser extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=endpoint" })
  endpoint: string;

  @SpeakeasyMetadata({ data: "json, name=eventTypes" })
  eventTypes: string[];

  @SpeakeasyMetadata({ data: "json, name=secret" })
  secret?: string;
}