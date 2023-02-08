import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { StageStatus } from "./stagestatus";


export class WorkflowOccurrence extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=createdAt" })
  createdAt: Date;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=statuses", elemType: StageStatus })
  statuses: StageStatus[];

  @SpeakeasyMetadata({ data: "json, name=updatedAt" })
  updatedAt: Date;

  @SpeakeasyMetadata({ data: "json, name=workflowID" })
  workflowID: string;
}