import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { WalletWithBalances } from "./walletwithbalances";


export class GetWalletResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: WalletWithBalances;
}