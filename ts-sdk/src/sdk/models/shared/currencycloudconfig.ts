import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class CurrencyCloudConfig extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=apiKey" })
  apiKey: string;

  @SpeakeasyMetadata({ data: "json, name=endpoint" })
  endpoint?: string;

  @SpeakeasyMetadata({ data: "json, name=loginID" })
  loginID: string;

  @SpeakeasyMetadata({ data: "json, name=pollingPeriod" })
  pollingPeriod?: string;
}