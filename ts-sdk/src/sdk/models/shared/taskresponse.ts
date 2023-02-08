import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class TaskResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: any;
}