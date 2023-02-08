import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class BalanceWithAssets extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=assets" })
  assets: Record<string, number>;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;
}