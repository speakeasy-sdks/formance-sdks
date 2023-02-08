import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class ModulrConfig extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=apiKey" })
  apiKey: string;

  @SpeakeasyMetadata({ data: "json, name=apiSecret" })
  apiSecret: string;

  @SpeakeasyMetadata({ data: "json, name=endpoint" })
  endpoint?: string;
}