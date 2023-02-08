import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class Balance extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;
}