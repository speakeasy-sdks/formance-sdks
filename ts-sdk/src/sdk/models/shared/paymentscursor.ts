import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Payment } from "./payment";


export class PaymentsCursorCursor extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data", elemType: Payment })
  data: Payment[];

  @SpeakeasyMetadata({ data: "json, name=hasMore" })
  hasMore: boolean;

  @SpeakeasyMetadata({ data: "json, name=next" })
  next?: string;

  @SpeakeasyMetadata({ data: "json, name=pageSize" })
  pageSize: number;

  @SpeakeasyMetadata({ data: "json, name=previous" })
  previous?: string;
}

export class PaymentsCursor extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=cursor" })
  cursor: PaymentsCursorCursor;
}