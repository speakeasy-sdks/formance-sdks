import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Workflow } from "./workflow";


export class GetWorkflowResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: Workflow;
}