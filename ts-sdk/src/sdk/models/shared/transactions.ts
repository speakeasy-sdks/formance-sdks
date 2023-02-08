import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { TransactionData } from "./transactiondata";


export class Transactions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=transactions", elemType: TransactionData })
  transactions: TransactionData[];
}