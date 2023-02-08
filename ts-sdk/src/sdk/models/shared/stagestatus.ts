import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class StageStatus extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=error" })
  error?: string;

  @SpeakeasyMetadata({ data: "json, name=occurrenceID" })
  occurrenceID: string;

  @SpeakeasyMetadata({ data: "json, name=stage" })
  stage: number;

  @SpeakeasyMetadata({ data: "json, name=startedAt" })
  startedAt: Date;

  @SpeakeasyMetadata({ data: "json, name=terminatedAt" })
  terminatedAt?: Date;
}