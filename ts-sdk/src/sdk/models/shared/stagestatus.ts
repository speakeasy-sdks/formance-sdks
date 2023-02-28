import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose, Transform } from "class-transformer";


export class StageStatus extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "error" })
  error?: string;

  @SpeakeasyMetadata()
  @Expose({ name: "occurrenceID" })
  occurrenceID: string;

  @SpeakeasyMetadata()
  @Expose({ name: "stage" })
  stage: number;

  @SpeakeasyMetadata()
  @Expose({ name: "startedAt" })
  @Transform(({ value }) => new Date(value), { toClassOnly: true })
  startedAt: Date;

  @SpeakeasyMetadata()
  @Expose({ name: "terminatedAt" })
  @Transform(({ value }) => new Date(value), { toClassOnly: true })
  terminatedAt?: Date;
}