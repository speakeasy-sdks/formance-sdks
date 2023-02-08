import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Hold } from "./hold";


export class DebitWalletResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: Hold;
}