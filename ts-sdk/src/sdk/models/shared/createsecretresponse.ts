import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Secret } from "./secret";


export class CreateSecretResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data?: Secret;
}