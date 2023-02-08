import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { AccountWithVolumesAndBalances } from "./accountwithvolumesandbalances";


export class AccountResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: AccountWithVolumesAndBalances;
}