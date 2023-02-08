import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { WorkflowConfig } from "./workflowconfig";


export class Workflow extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=config" })
  config: WorkflowConfig;

  @SpeakeasyMetadata({ data: "json, name=createdAt" })
  createdAt: Date;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=updatedAt" })
  updatedAt: Date;
}