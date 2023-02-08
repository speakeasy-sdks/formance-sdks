import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class AttemptResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: any;
}