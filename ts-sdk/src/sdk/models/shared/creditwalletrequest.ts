import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Monetary } from "./monetary";


export class CreditWalletRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=amount" })
  amount: Monetary;

  @SpeakeasyMetadata({ data: "json, name=balance" })
  balance?: string;

  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=reference" })
  reference?: string;

  @SpeakeasyMetadata({ data: "json, name=sources" })
  sources: any[];
}