import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class CreateWalletRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;
}