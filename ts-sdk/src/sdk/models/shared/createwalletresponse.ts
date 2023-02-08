import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Wallet } from "./wallet";


export class CreateWalletResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: Wallet;
}