import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Log } from "./log";


export class LogsCursorResponseCursor extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data", elemType: Log })
  data: Log[];

  @SpeakeasyMetadata({ data: "json, name=hasMore" })
  hasMore: boolean;

  @SpeakeasyMetadata({ data: "json, name=next" })
  next?: string;

  @SpeakeasyMetadata({ data: "json, name=pageSize" })
  pageSize: number;

  @SpeakeasyMetadata({ data: "json, name=previous" })
  previous?: string;
}

export class LogsCursorResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=cursor" })
  cursor: LogsCursorResponseCursor;
}