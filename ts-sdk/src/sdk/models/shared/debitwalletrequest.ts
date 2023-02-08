import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Monetary } from "./monetary";


export class DebitWalletRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=amount" })
  amount: Monetary;

  @SpeakeasyMetadata({ data: "json, name=balances" })
  balances?: string[];

  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=destination" })
  destination?: any;

  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=pending" })
  pending?: boolean;
}