import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { WalletsTransaction } from "./walletstransaction";


export class GetTransactionsResponseCursor extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data", elemType: WalletsTransaction })
  data: WalletsTransaction[];

  @SpeakeasyMetadata({ data: "json, name=hasMore" })
  hasMore?: boolean;

  @SpeakeasyMetadata({ data: "json, name=next" })
  next?: string;

  @SpeakeasyMetadata({ data: "json, name=pageSize" })
  pageSize: number;

  @SpeakeasyMetadata({ data: "json, name=previous" })
  previous?: string;
}

export class GetTransactionsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=cursor" })
  cursor: GetTransactionsResponseCursor;
}