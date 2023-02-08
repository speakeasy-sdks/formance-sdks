import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class WiseConfig extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=apiKey" })
  apiKey: string;
}