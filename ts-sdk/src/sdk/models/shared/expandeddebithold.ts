import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class ExpandedDebitHold extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description: string;

  @SpeakeasyMetadata({ data: "json, name=destination" })
  destination?: any;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=originalAmount" })
  originalAmount: number;

  @SpeakeasyMetadata({ data: "json, name=remaining" })
  remaining: number;

  @SpeakeasyMetadata({ data: "json, name=walletID" })
  walletID: string;
}