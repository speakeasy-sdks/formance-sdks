import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose } from "class-transformer";


export class Account extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "address" })
  address: string;

  @SpeakeasyMetadata()
  @Expose({ name: "metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata()
  @Expose({ name: "type" })
  type?: string;
}