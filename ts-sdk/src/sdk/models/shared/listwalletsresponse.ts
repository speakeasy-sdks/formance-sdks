import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Wallet } from "./wallet";


export class ListWalletsResponseCursor extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data", elemType: Wallet })
  data: Wallet[];

  @SpeakeasyMetadata({ data: "json, name=hasMore" })
  hasMore?: boolean;

  @SpeakeasyMetadata({ data: "json, name=next" })
  next?: string;

  @SpeakeasyMetadata({ data: "json, name=pageSize" })
  pageSize: number;

  @SpeakeasyMetadata({ data: "json, name=previous" })
  previous?: string;
}

export class ListWalletsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=cursor" })
  cursor: ListWalletsResponseCursor;
}