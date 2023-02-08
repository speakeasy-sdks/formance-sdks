import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class CreateBalanceRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;
}