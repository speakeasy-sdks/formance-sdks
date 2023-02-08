import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Workflow } from "./workflow";


export class ListWorkflowsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data", elemType: Workflow })
  data: Workflow[];
}