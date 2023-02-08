import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { WorkflowOccurrence } from "./workflowoccurrence";


export class RunWorkflowResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: WorkflowOccurrence;
}