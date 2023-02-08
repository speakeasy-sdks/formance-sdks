import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Hold } from "./hold";


export class GetHoldsResponseCursor extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data", elemType: Hold })
  data: Hold[];

  @SpeakeasyMetadata({ data: "json, name=hasMore" })
  hasMore?: boolean;

  @SpeakeasyMetadata({ data: "json, name=next" })
  next?: string;

  @SpeakeasyMetadata({ data: "json, name=pageSize" })
  pageSize: number;

  @SpeakeasyMetadata({ data: "json, name=previous" })
  previous?: string;
}

export class GetHoldsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=cursor" })
  cursor: GetHoldsResponseCursor;
}