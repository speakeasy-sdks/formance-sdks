import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class Account extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=address" })
  address: string;

  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: string;
}