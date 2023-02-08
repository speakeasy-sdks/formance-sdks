import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class Posting extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=amount" })
  amount: number;

  @SpeakeasyMetadata({ data: "json, name=asset" })
  asset: string;

  @SpeakeasyMetadata({ data: "json, name=destination" })
  destination: string;

  @SpeakeasyMetadata({ data: "json, name=source" })
  source: string;
}