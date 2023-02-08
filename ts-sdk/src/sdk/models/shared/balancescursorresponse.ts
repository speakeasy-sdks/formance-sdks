import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class BalancesCursorResponseCursor extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: Record<string, Record<string, number>>[];

  @SpeakeasyMetadata({ data: "json, name=hasMore" })
  hasMore: boolean;

  @SpeakeasyMetadata({ data: "json, name=next" })
  next?: string;

  @SpeakeasyMetadata({ data: "json, name=pageSize" })
  pageSize: number;

  @SpeakeasyMetadata({ data: "json, name=previous" })
  previous?: string;
}

export class BalancesCursorResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=cursor" })
  cursor: BalancesCursorResponseCursor;
}