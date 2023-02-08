import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class Monetary extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=amount" })
  amount: number;

  @SpeakeasyMetadata({ data: "json, name=asset" })
  asset: string;
}