import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class CreateWorkflowRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=stages" })
  stages: Record<string, any>[];
}