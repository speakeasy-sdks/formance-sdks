import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class StripeTransferRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=amount" })
  amount?: number;

  @SpeakeasyMetadata({ data: "json, name=asset" })
  asset?: string;

  @SpeakeasyMetadata({ data: "json, name=destination" })
  destination?: string;

  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata?: Record<string, any>;
}