import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { ExpandedDebitHold } from "./expandeddebithold";


export class GetHoldResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: ExpandedDebitHold;
}