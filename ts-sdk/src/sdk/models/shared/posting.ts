import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose } from "class-transformer";


export class Posting extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "amount" })
  amount: number;

  @SpeakeasyMetadata()
  @Expose({ name: "asset" })
  asset: string;

  @SpeakeasyMetadata()
  @Expose({ name: "destination" })
  destination: string;

  @SpeakeasyMetadata()
  @Expose({ name: "source" })
  source: string;
}