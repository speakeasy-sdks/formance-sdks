import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class AssetHolder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=assets" })
  assets: Record<string, number>;
}