import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { BalanceWithAssets } from "./balancewithassets";


export class GetBalanceResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: BalanceWithAssets;
}