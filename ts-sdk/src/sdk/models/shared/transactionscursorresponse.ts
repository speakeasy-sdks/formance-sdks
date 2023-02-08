import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Transaction } from "./transaction";


export class TransactionsCursorResponseCursor extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data", elemType: Transaction })
  data: Transaction[];

  @SpeakeasyMetadata({ data: "json, name=hasMore" })
  hasMore: boolean;

  @SpeakeasyMetadata({ data: "json, name=next" })
  next?: string;

  @SpeakeasyMetadata({ data: "json, name=pageSize" })
  pageSize: number;

  @SpeakeasyMetadata({ data: "json, name=previous" })
  previous?: string;
}

export class TransactionsCursorResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=cursor" })
  cursor: TransactionsCursorResponseCursor;
}