import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { WorkflowOccurrence } from "./workflowoccurrence";


export class GetWorkflowOccurrenceResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: WorkflowOccurrence;
}