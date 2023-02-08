import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { PaymentMetadataChangelog } from "./paymentmetadatachangelog";


export class PaymentMetadata extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=changelog" })
  changelog?: PaymentMetadataChangelog;

  @SpeakeasyMetadata({ data: "json, name=key" })
  key: string;

  @SpeakeasyMetadata({ data: "json, name=value" })
  value: string;
}