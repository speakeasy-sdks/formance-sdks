import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose } from "class-transformer";


export class Stats extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "accounts" })
  accounts: number;

  @SpeakeasyMetadata()
  @Expose({ name: "transactions" })
  transactions: number;
}