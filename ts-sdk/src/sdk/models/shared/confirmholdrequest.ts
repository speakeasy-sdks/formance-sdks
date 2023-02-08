import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class ConfirmHoldRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=amount" })
  amount?: number;

  @SpeakeasyMetadata({ data: "json, name=final" })
  final?: boolean;
}