import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Transaction } from "./transaction";


export class TransactionsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data", elemType: Transaction })
  data: Transaction[];
}