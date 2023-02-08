import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Balance } from "./balance";


export class CreateBalanceResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: Balance;
}