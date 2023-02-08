import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class Stats extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=accounts" })
  accounts: number;

  @SpeakeasyMetadata({ data: "json, name=transactions" })
  transactions: number;
}