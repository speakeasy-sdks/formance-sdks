import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { PaymentsAccount } from "./paymentsaccount";


export class AccountsCursorCursor extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data", elemType: PaymentsAccount })
  data: PaymentsAccount[];

  @SpeakeasyMetadata({ data: "json, name=hasMore" })
  hasMore: boolean;

  @SpeakeasyMetadata({ data: "json, name=next" })
  next?: string;

  @SpeakeasyMetadata({ data: "json, name=pageSize" })
  pageSize: number;

  @SpeakeasyMetadata({ data: "json, name=previous" })
  previous?: string;
}

export class AccountsCursor extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=cursor" })
  cursor: AccountsCursorCursor;
}