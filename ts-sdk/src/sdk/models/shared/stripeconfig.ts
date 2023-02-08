import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class StripeConfig extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=apiKey" })
  apiKey: string;

  @SpeakeasyMetadata({ data: "json, name=pageSize" })
  pageSize?: number;

  @SpeakeasyMetadata({ data: "json, name=pollingPeriod" })
  pollingPeriod?: string;
}