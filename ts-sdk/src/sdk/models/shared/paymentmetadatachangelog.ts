import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class PaymentMetadataChangelog extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=timestamp" })
  timestamp: Date;

  @SpeakeasyMetadata({ data: "json, name=value" })
  value: string;
}